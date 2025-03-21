package com.google.android.gms.internal.ads;

import java.util.Map;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzcsr<AdT> implements zzgdq<zzcsp<AdT>> {
    private final zzgeb<Map<String, zzdya<AdT>>> zza;

    public zzcsr(zzgeb<Map<String, zzdya<AdT>>> zzgebVar) {
        this.zza = zzgebVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgeb
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzcsp(((zzgdu) this.zza).zzb());
    }
}
