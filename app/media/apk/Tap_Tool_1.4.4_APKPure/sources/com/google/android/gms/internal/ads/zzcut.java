package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzcut implements zzgdq<zzdcx<zzcyp>> {
    private final zzgeb<zzdae> zza;
    private final zzgeb<Executor> zzb;

    public zzcut(zzgeb<zzdae> zzgebVar, zzgeb<Executor> zzgebVar2) {
        this.zza = zzgebVar;
        this.zzb = zzgebVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzgeb
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzdcx(this.zza.zzb(), this.zzb.zzb());
    }
}
