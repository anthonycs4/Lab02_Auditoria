package com.google.android.gms.internal.ads;

import java.util.Map;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzdoy implements zzgdq<zzdox> {
    private final zzgeb<zzavg> zza;
    private final zzgeb<Map<zzexf, zzdow>> zzb;

    public zzdoy(zzgeb<zzavg> zzgebVar, zzgeb<Map<zzexf, zzdow>> zzgebVar2) {
        this.zza = zzgebVar;
        this.zzb = zzgebVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzgeb
    /* renamed from: zza */
    public final zzdox zzb() {
        return new zzdox(this.zza.zzb(), ((zzgdu) this.zzb).zzb());
    }
}
