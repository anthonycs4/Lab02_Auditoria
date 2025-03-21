package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzcsb implements zzgdq<zzcrw> {
    private final zzgeb<zzcsm> zza;
    private final zzgeb<zzbjx> zzb;
    private final zzgeb<Runnable> zzc;
    private final zzgeb<Executor> zzd;

    public zzcsb(zzgeb<zzcsm> zzgebVar, zzgeb<zzbjx> zzgebVar2, zzgeb<Runnable> zzgebVar3, zzgeb<Executor> zzgebVar4) {
        this.zza = zzgebVar;
        this.zzb = zzgebVar2;
        this.zzc = zzgebVar3;
        this.zzd = zzgebVar4;
    }

    @Override // com.google.android.gms.internal.ads.zzgeb
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzcrw(((zzcuh) this.zza).zzb(), ((zzcsa) this.zzb).zza(), ((zzcrz) this.zzc).zza(), this.zzd.zzb());
    }
}
