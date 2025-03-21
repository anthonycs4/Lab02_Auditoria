package com.google.android.gms.internal.ads;

import android.content.Context;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzckv implements zzgdq<zzbxq> {
    private final zzgeb<Context> zza;

    public zzckv(zzgeb<Context> zzgebVar) {
        this.zza = zzgebVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgeb
    /* renamed from: zza */
    public final zzbxq zzb() {
        Context zza = ((zzcke) this.zza).zza();
        com.google.android.gms.ads.internal.zzs.zzp().zza(zza, zzcct.zza()).zza("google.afma.request.getAdDictionary", zzbqb.zza, zzbqb.zza);
        return new zzbxp(zza, com.google.android.gms.ads.internal.zzs.zzp().zza(zza, zzcct.zza()).zza("google.afma.sdkConstants.getSdkConstants", zzbqb.zza, zzbqb.zza));
    }
}
