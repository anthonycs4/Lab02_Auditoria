package com.google.android.gms.internal.ads;

import org.json.JSONObject;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzdhg implements zzgdq<zzdhd> {
    private final zzgeb<zzess> zza;
    private final zzgeb<JSONObject> zzb;

    public zzdhg(zzgeb<zzess> zzgebVar, zzgeb<JSONObject> zzgebVar2) {
        this.zza = zzgebVar;
        this.zzb = zzgebVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzgeb
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzdhd(((zzctd) this.zza).zza(), ((zzdgd) this.zzb).zza());
    }
}
