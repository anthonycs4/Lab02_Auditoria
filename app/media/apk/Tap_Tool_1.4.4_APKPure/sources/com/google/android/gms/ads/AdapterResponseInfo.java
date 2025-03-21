package com.google.android.gms.ads;

import android.os.Bundle;
import com.google.android.gms.internal.ads.zzazm;
import com.google.android.gms.internal.ads.zzbab;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: com.google.android.gms:play-services-ads-lite@@20.2.0 */
/* loaded from: classes.dex */
public final class AdapterResponseInfo {
    private final zzbab zza;
    private final AdError zzb;

    private AdapterResponseInfo(zzbab zzbabVar) {
        this.zza = zzbabVar;
        zzazm zzazmVar = zzbabVar.zzc;
        this.zzb = zzazmVar == null ? null : zzazmVar.zza();
    }

    public static AdapterResponseInfo zza(zzbab zzbabVar) {
        if (zzbabVar != null) {
            return new AdapterResponseInfo(zzbabVar);
        }
        return null;
    }

    public AdError getAdError() {
        return this.zzb;
    }

    public String getAdapterClassName() {
        return this.zza.zza;
    }

    public Bundle getCredentials() {
        return this.zza.zzd;
    }

    public long getLatencyMillis() {
        return this.zza.zzb;
    }

    public String toString() {
        try {
            return zzb().toString(2);
        } catch (JSONException unused) {
            return "Error forming toString output.";
        }
    }

    public final JSONObject zzb() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("Adapter", this.zza.zza);
        jSONObject.put("Latency", this.zza.zzb);
        JSONObject jSONObject2 = new JSONObject();
        for (String str : this.zza.zzd.keySet()) {
            jSONObject2.put(str, this.zza.zzd.get(str));
        }
        jSONObject.put("Credentials", jSONObject2);
        AdError adError = this.zzb;
        if (adError == null) {
            jSONObject.put("Ad Error", "null");
        } else {
            jSONObject.put("Ad Error", adError.zzb());
        }
        return jSONObject;
    }
}
