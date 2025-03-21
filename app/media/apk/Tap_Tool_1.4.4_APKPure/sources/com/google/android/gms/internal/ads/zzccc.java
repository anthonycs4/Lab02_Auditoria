package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import com.google.android.gms.common.util.Clock;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzccc implements zzatb {
    final zzcbz zza;
    private final com.google.android.gms.ads.internal.util.zzg zze;
    private final Object zzd = new Object();
    final HashSet<zzcbt> zzb = new HashSet<>();
    final HashSet<zzccb> zzc = new HashSet<>();
    private boolean zzg = false;
    private final zzcca zzf = new zzcca();

    public zzccc(String str, com.google.android.gms.ads.internal.util.zzg zzgVar) {
        this.zza = new zzcbz(str, zzgVar);
        this.zze = zzgVar;
    }

    @Override // com.google.android.gms.internal.ads.zzatb
    public final void zza(boolean z) {
        long currentTimeMillis = com.google.android.gms.ads.internal.zzs.zzj().currentTimeMillis();
        if (z) {
            if (currentTimeMillis - this.zze.zzq() > ((Long) zzbba.zzc().zzb(zzbfq.zzaE)).longValue()) {
                this.zza.zzd = -1;
            } else {
                this.zza.zzd = this.zze.zzs();
            }
            this.zzg = true;
            return;
        }
        this.zze.zzp(currentTimeMillis);
        this.zze.zzr(this.zza.zzd);
    }

    public final void zzb(zzcbt zzcbtVar) {
        synchronized (this.zzd) {
            this.zzb.add(zzcbtVar);
        }
    }

    public final void zzc(HashSet<zzcbt> hashSet) {
        synchronized (this.zzd) {
            this.zzb.addAll(hashSet);
        }
    }

    public final void zzd() {
        synchronized (this.zzd) {
            this.zza.zza();
        }
    }

    public final void zze() {
        synchronized (this.zzd) {
            this.zza.zzb();
        }
    }

    public final void zzf(zzazs zzazsVar, long j) {
        synchronized (this.zzd) {
            this.zza.zzc(zzazsVar, j);
        }
    }

    public final void zzg() {
        synchronized (this.zzd) {
            this.zza.zzd();
        }
    }

    public final zzcbt zzh(Clock clock, String str) {
        return new zzcbt(clock, this, this.zzf.zza(), str);
    }

    public final boolean zzi() {
        return this.zzg;
    }

    public final Bundle zzj(Context context, zzeuk zzeukVar) {
        HashSet<zzcbt> hashSet = new HashSet<>();
        synchronized (this.zzd) {
            hashSet.addAll(this.zzb);
            this.zzb.clear();
        }
        Bundle bundle = new Bundle();
        bundle.putBundle("app", this.zza.zze(context, this.zzf.zzb()));
        Bundle bundle2 = new Bundle();
        Iterator<zzccb> it = this.zzc.iterator();
        if (it.hasNext()) {
            it.next();
            throw null;
        }
        bundle.putBundle("slots", bundle2);
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
        Iterator<zzcbt> it2 = hashSet.iterator();
        while (it2.hasNext()) {
            arrayList.add(it2.next().zzh());
        }
        bundle.putParcelableArrayList("ads", arrayList);
        zzeukVar.zzb(hashSet);
        return bundle;
    }
}
