package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicBoolean;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzcsf implements zzcxt, zzasi {
    private final zzess zza;
    private final zzcwx zzb;
    private final zzcyc zzc;
    private final AtomicBoolean zzd = new AtomicBoolean();
    private final AtomicBoolean zze = new AtomicBoolean();

    public zzcsf(zzess zzessVar, zzcwx zzcwxVar, zzcyc zzcycVar) {
        this.zza = zzessVar;
        this.zzb = zzcwxVar;
        this.zzc = zzcycVar;
    }

    private final void zzb() {
        if (this.zzd.compareAndSet(false, true)) {
            this.zzb.zza();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcxt
    public final synchronized void zzbN() {
        if (this.zza.zze != 1) {
            zzb();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzasi
    public final void zzc(zzash zzashVar) {
        if (this.zza.zze == 1 && zzashVar.zzj) {
            zzb();
        }
        if (zzashVar.zzj && this.zze.compareAndSet(false, true)) {
            this.zzc.zza();
        }
    }
}
