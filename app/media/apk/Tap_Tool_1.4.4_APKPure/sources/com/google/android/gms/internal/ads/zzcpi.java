package com.google.android.gms.internal.ads;

import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzcpi implements zzgdq<JSONObject> {
    private final zzgeb<zzess> zza;

    public zzcpi(zzgeb<zzess> zzgebVar) {
        this.zza = zzgebVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgeb
    public final /* bridge */ /* synthetic */ Object zzb() {
        try {
            return new JSONObject(((zzctd) this.zza).zza().zzy);
        } catch (JSONException unused) {
            return null;
        }
    }
}
