package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzcoz implements zzgdq<zzcos> {
    private final zzgeb<zzase> zza;
    private final zzgeb<zzbqn> zzb;
    private final zzgeb<Executor> zzc;

    public zzcoz(zzgeb<zzase> zzgebVar, zzgeb<zzbqn> zzgebVar2, zzgeb<Executor> zzgebVar3) {
        this.zza = zzgebVar;
        this.zzb = zzgebVar2;
        this.zzc = zzgebVar3;
    }

    @Override // com.google.android.gms.internal.ads.zzgeb
    public final /* bridge */ /* synthetic */ Object zzb() {
        zzflb zza = zzevz.zza();
        zzgdw.zzb(zza);
        return new zzcos(this.zza.zzb().zzd(), this.zzb.zzb(), zza);
    }
}
