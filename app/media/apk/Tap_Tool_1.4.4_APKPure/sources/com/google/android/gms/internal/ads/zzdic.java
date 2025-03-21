package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzdic implements zzgdq<zzdib> {
    private final zzgeb<zzdlt> zza;
    private final zzgeb<Clock> zzb;

    public zzdic(zzgeb<zzdlt> zzgebVar, zzgeb<Clock> zzgebVar2) {
        this.zza = zzgebVar;
        this.zzb = zzgebVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzgeb
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzdib(((zzdgg) this.zza).zza(), this.zzb.zzb());
    }
}
