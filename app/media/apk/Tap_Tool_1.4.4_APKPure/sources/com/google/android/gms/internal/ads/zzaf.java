package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.atomic.AtomicInteger;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzaf {
    private final AtomicInteger zza;
    private final Set<zzac<?>> zzb;
    private final PriorityBlockingQueue<zzac<?>> zzc;
    private final PriorityBlockingQueue<zzac<?>> zzd;
    private final zzm zze;
    private final zzv zzf;
    private final zzw[] zzg;
    private zzo zzh;
    private final List<zzae> zzi;
    private final List<zzad> zzj;
    private final zzt zzk;

    public zzaf(zzm zzmVar, zzv zzvVar, int i) {
        zzt zztVar = new zzt(new Handler(Looper.getMainLooper()));
        this.zza = new AtomicInteger();
        this.zzb = new HashSet();
        this.zzc = new PriorityBlockingQueue<>();
        this.zzd = new PriorityBlockingQueue<>();
        this.zzi = new ArrayList();
        this.zzj = new ArrayList();
        this.zze = zzmVar;
        this.zzf = zzvVar;
        this.zzg = new zzw[4];
        this.zzk = zztVar;
    }

    public final void zza() {
        zzo zzoVar = this.zzh;
        if (zzoVar != null) {
            zzoVar.zza();
        }
        zzw[] zzwVarArr = this.zzg;
        for (int i = 0; i < 4; i++) {
            zzw zzwVar = zzwVarArr[i];
            if (zzwVar != null) {
                zzwVar.zza();
            }
        }
        zzo zzoVar2 = new zzo(this.zzc, this.zzd, this.zze, this.zzk, null);
        this.zzh = zzoVar2;
        zzoVar2.start();
        for (int i2 = 0; i2 < 4; i2++) {
            zzw zzwVar2 = new zzw(this.zzd, this.zzf, this.zze, this.zzk, null);
            this.zzg[i2] = zzwVar2;
            zzwVar2.start();
        }
    }

    public final <T> zzac<T> zzb(zzac<T> zzacVar) {
        zzacVar.zzf(this);
        synchronized (this.zzb) {
            this.zzb.add(zzacVar);
        }
        zzacVar.zzg(this.zza.incrementAndGet());
        zzacVar.zzc("add-to-queue");
        zzd(zzacVar, 0);
        this.zzc.add(zzacVar);
        return zzacVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final <T> void zzc(zzac<T> zzacVar) {
        synchronized (this.zzb) {
            this.zzb.remove(zzacVar);
        }
        synchronized (this.zzi) {
            for (zzae zzaeVar : this.zzi) {
                zzaeVar.zza();
            }
        }
        zzd(zzacVar, 5);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzd(zzac<?> zzacVar, int i) {
        synchronized (this.zzj) {
            for (zzad zzadVar : this.zzj) {
                zzadVar.zza();
            }
        }
    }
}
