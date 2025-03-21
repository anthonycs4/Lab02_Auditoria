package com.google.android.gms.internal.ads;

import android.os.Bundle;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzekc implements zzgdq<zzeka> {
    private final zzgeb<zzflb> zza;
    private final zzgeb<Bundle> zzb;

    public zzekc(zzgeb<zzflb> zzgebVar, zzgeb<Bundle> zzgebVar2) {
        this.zza = zzgebVar;
        this.zzb = zzgebVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzgeb
    public final /* bridge */ /* synthetic */ Object zzb() {
        zzflb zzflbVar = zzccz.zza;
        zzgdw.zzb(zzflbVar);
        return new zzeka(zzflbVar, ((zzcvv) this.zzb).zza());
    }
}
