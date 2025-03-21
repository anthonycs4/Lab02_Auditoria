package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzcua implements zzgdq<zzctz> {
    private final zzgeb<Clock> zza;
    private final zzgeb<zzcbt> zzb;

    public zzcua(zzgeb<Clock> zzgebVar, zzgeb<zzcbt> zzgebVar2) {
        this.zza = zzgebVar;
        this.zzb = zzgebVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzgeb
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzctz(this.zza.zzb(), this.zzb.zzb());
    }
}
