package com.google.android.gms.internal.ads;

import android.content.Context;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzell implements zzgdq<zzelk> {
    private final zzgeb<zzflb> zza;
    private final zzgeb<Context> zzb;

    public zzell(zzgeb<zzflb> zzgebVar, zzgeb<Context> zzgebVar2) {
        this.zza = zzgebVar;
        this.zzb = zzgebVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzgeb
    /* renamed from: zza */
    public final zzelk zzb() {
        zzflb zzflbVar = zzccz.zza;
        zzgdw.zzb(zzflbVar);
        return new zzelk(zzflbVar, ((zzcke) this.zzb).zza());
    }
}
