package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.RequestConfiguration;
import org.json.JSONObject;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzbvs {
    public final boolean zza;
    public final String zzb;

    public zzbvs(boolean z, String str) {
        this.zza = z;
        this.zzb = str;
    }

    public static zzbvs zza(JSONObject jSONObject) {
        return new zzbvs(jSONObject.optBoolean("enable_prewarming", false), jSONObject.optString("prefetch_url", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED));
    }
}
