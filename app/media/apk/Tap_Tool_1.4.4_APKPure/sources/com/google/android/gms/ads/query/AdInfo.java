package com.google.android.gms.ads.query;

import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.internal.ads.zzccn;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: com.google.android.gms:play-services-ads-lite@@20.2.0 */
@Deprecated
/* loaded from: classes.dex */
public class AdInfo {
    private final QueryInfo zza;
    private final String zzb;

    public AdInfo(QueryInfo queryInfo, String str) {
        this.zza = queryInfo;
        this.zzb = str;
    }

    public static String getRequestId(String str) {
        if (str != null) {
            try {
                return new JSONObject(str).optString("request_id", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED);
            } catch (JSONException unused) {
                zzccn.zzi("Invalid adString passed to AdInfo.getRequestId(). Returning empty string.");
                return RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
            }
        }
        zzccn.zzi("adString passed to AdInfo.getRequestId() cannot be null. Returning empty string.");
        return RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
    }

    public String getAdString() {
        return this.zzb;
    }

    public QueryInfo getQueryInfo() {
        return this.zza;
    }
}
