package com.google.android.gms.internal.ads;

import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzdhd extends zzdhe {
    private final JSONObject zzb;
    private final boolean zzc;
    private final boolean zzd;
    private final boolean zze;
    private final boolean zzf;

    public zzdhd(zzess zzessVar, JSONObject jSONObject) {
        super(zzessVar);
        this.zzb = com.google.android.gms.ads.internal.util.zzbv.zzh(jSONObject, "tracking_urls_and_actions", "active_view");
        this.zzc = com.google.android.gms.ads.internal.util.zzbv.zzi(false, jSONObject, "allow_pub_owned_ad_view");
        this.zzd = com.google.android.gms.ads.internal.util.zzbv.zzi(false, jSONObject, "attribution", "allow_pub_rendering");
        this.zze = com.google.android.gms.ads.internal.util.zzbv.zzi(false, jSONObject, "enable_omid");
        this.zzf = jSONObject.optJSONObject("overlay") != null;
    }

    @Override // com.google.android.gms.internal.ads.zzdhe
    public final JSONObject zza() {
        JSONObject jSONObject = this.zzb;
        if (jSONObject == null) {
            try {
                return new JSONObject(this.zza.zzy);
            } catch (JSONException unused) {
                return null;
            }
        }
        return jSONObject;
    }

    @Override // com.google.android.gms.internal.ads.zzdhe
    public final boolean zzb() {
        return this.zzf;
    }

    @Override // com.google.android.gms.internal.ads.zzdhe
    public final boolean zzc() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzdhe
    public final boolean zzd() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzdhe
    public final boolean zze() {
        return this.zzd;
    }
}
