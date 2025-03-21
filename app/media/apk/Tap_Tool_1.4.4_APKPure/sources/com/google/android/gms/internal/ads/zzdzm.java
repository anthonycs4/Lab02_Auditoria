package com.google.android.gms.internal.ads;

import android.content.Context;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzdzm implements zzgdq<zzdzl> {
    private final zzgeb<Context> zza;
    private final zzgeb<zzcrl> zzb;

    public zzdzm(zzgeb<Context> zzgebVar, zzgeb<zzcrl> zzgebVar2) {
        this.zza = zzgebVar;
        this.zzb = zzgebVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzgeb
    /* renamed from: zza */
    public final zzdzl zzb() {
        return new zzdzl(this.zza.zzb(), this.zzb.zzb());
    }
}
