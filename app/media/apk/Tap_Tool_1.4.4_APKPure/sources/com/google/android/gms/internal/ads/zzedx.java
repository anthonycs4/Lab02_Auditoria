package com.google.android.gms.internal.ads;

import android.content.Context;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzedx implements zzgdq<zzedw> {
    private final zzgeb<Context> zza;
    private final zzgeb<zzder> zzb;

    public zzedx(zzgeb<Context> zzgebVar, zzgeb<zzder> zzgebVar2) {
        this.zza = zzgebVar;
        this.zzb = zzgebVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzgeb
    /* renamed from: zza */
    public final zzedw zzb() {
        return new zzedw(this.zza.zzb(), this.zzb.zzb());
    }
}
