package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzbzy implements zzgdq<zzbzx> {
    private final zzgeb<Clock> zza;
    private final zzgeb<com.google.android.gms.ads.internal.util.zzg> zzb;
    private final zzgeb<zzcaw> zzc;

    public zzbzy(zzgeb<Clock> zzgebVar, zzgeb<com.google.android.gms.ads.internal.util.zzg> zzgebVar2, zzgeb<zzcaw> zzgebVar3) {
        this.zza = zzgebVar;
        this.zzb = zzgebVar2;
        this.zzc = zzgebVar3;
    }

    @Override // com.google.android.gms.internal.ads.zzgeb
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzbzx(this.zza.zzb(), this.zzb.zzb(), this.zzc.zzb());
    }
}
