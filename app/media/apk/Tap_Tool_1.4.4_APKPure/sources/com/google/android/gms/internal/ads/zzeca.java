package com.google.android.gms.internal.ads;

import android.content.Context;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzeca implements zzgdq<zzebz> {
    private final zzgeb<Context> zza;
    private final zzgeb<zzdmg> zzb;

    public zzeca(zzgeb<Context> zzgebVar, zzgeb<zzdmg> zzgebVar2) {
        this.zza = zzgebVar;
        this.zzb = zzgebVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzgeb
    /* renamed from: zza */
    public final zzebz zzb() {
        return new zzebz(this.zza.zzb(), this.zzb.zzb());
    }
}
