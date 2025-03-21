package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzdks implements zzgdq<zzdkq> {
    private final zzgeb<zzetk> zza;
    private final zzgeb<Executor> zzb;
    private final zzgeb<zzdmy> zzc;

    public zzdks(zzgeb<zzetk> zzgebVar, zzgeb<Executor> zzgebVar2, zzgeb<zzdmy> zzgebVar3) {
        this.zza = zzgebVar;
        this.zzb = zzgebVar2;
        this.zzc = zzgebVar3;
    }

    @Override // com.google.android.gms.internal.ads.zzgeb
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzdkq(((zzcvy) this.zza).zza(), this.zzb.zzb(), this.zzc.zzb());
    }
}
