package com.google.android.gms.internal.ads;

import android.util.JsonReader;
import java.io.IOException;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzesx {
    public final String zza;
    public final String zzb;
    public final JSONObject zzc;
    public final JSONObject zzd;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzesx(JsonReader jsonReader) throws IllegalStateException, IOException, JSONException, NumberFormatException {
        JSONObject zzc = com.google.android.gms.ads.internal.util.zzbv.zzc(jsonReader);
        this.zzd = zzc;
        this.zza = zzc.optString("ad_html", null);
        this.zzb = zzc.optString("ad_base_url", null);
        this.zzc = zzc.optJSONObject("ad_json");
    }
}
