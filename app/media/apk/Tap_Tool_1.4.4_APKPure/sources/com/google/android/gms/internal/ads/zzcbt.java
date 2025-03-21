package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcelable;
import com.google.android.gms.common.util.Clock;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzcbt {
    private final Clock zza;
    private final zzccc zzb;
    private final String zze;
    private final String zzf;
    private final Object zzd = new Object();
    private long zzg = -1;
    private long zzh = -1;
    private long zzi = 0;
    private long zzj = -1;
    private long zzk = -1;
    private final LinkedList<zzcbs> zzc = new LinkedList<>();

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzcbt(Clock clock, zzccc zzcccVar, String str, String str2) {
        this.zza = clock;
        this.zzb = zzcccVar;
        this.zze = str;
        this.zzf = str2;
    }

    public final void zza(zzazs zzazsVar) {
        synchronized (this.zzd) {
            long elapsedRealtime = this.zza.elapsedRealtime();
            this.zzj = elapsedRealtime;
            this.zzb.zzf(zzazsVar, elapsedRealtime);
        }
    }

    public final void zzb() {
        synchronized (this.zzd) {
            this.zzb.zzg();
        }
    }

    public final void zzc(long j) {
        synchronized (this.zzd) {
            this.zzk = j;
            if (j != -1) {
                this.zzb.zzb(this);
            }
        }
    }

    public final void zzd() {
        synchronized (this.zzd) {
            if (this.zzk != -1 && this.zzg == -1) {
                this.zzg = this.zza.elapsedRealtime();
                this.zzb.zzb(this);
            }
            this.zzb.zze();
        }
    }

    public final void zze() {
        synchronized (this.zzd) {
            if (this.zzk != -1) {
                zzcbs zzcbsVar = new zzcbs(this);
                zzcbsVar.zzc();
                this.zzc.add(zzcbsVar);
                this.zzi++;
                this.zzb.zzd();
                this.zzb.zzb(this);
            }
        }
    }

    public final void zzf() {
        synchronized (this.zzd) {
            if (this.zzk != -1 && !this.zzc.isEmpty()) {
                zzcbs last = this.zzc.getLast();
                if (last.zza() == -1) {
                    last.zzb();
                    this.zzb.zzb(this);
                }
            }
        }
    }

    public final void zzg(boolean z) {
        synchronized (this.zzd) {
            if (this.zzk != -1) {
                this.zzh = this.zza.elapsedRealtime();
            }
        }
    }

    public final Bundle zzh() {
        Bundle bundle;
        synchronized (this.zzd) {
            bundle = new Bundle();
            bundle.putString("seq_num", this.zze);
            bundle.putString("slotid", this.zzf);
            bundle.putBoolean("ismediation", false);
            bundle.putLong("treq", this.zzj);
            bundle.putLong("tresponse", this.zzk);
            bundle.putLong("timp", this.zzg);
            bundle.putLong("tload", this.zzh);
            bundle.putLong("pcc", this.zzi);
            bundle.putLong("tfetch", -1L);
            ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
            Iterator<zzcbs> it = this.zzc.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().zzd());
            }
            bundle.putParcelableArrayList("tclick", arrayList);
        }
        return bundle;
    }

    public final String zzi() {
        return this.zze;
    }
}
