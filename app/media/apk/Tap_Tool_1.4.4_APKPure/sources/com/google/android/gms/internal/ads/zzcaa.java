package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzcaa implements zzgdq<zzbzz> {
    private final zzgeb<Clock> zza;
    private final zzgeb<zzbzx> zzb;

    public zzcaa(zzgeb<Clock> zzgebVar, zzgeb<zzbzx> zzgebVar2) {
        this.zza = zzgebVar;
        this.zzb = zzgebVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzgeb
    /* renamed from: zza */
    public final zzbzz zzb() {
        return new zzbzz(this.zza.zzb(), this.zzb.zzb());
    }
}
