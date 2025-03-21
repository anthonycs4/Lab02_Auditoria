package com.google.android.gms.ads;

import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzbab;
import com.google.android.gms.internal.ads.zzbba;
import com.google.android.gms.internal.ads.zzbdg;
import com.google.android.gms.internal.ads.zzbfq;
import com.google.android.gms.internal.ads.zzccn;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: com.google.android.gms:play-services-ads-lite@@20.2.0 */
/* loaded from: classes.dex */
public final class ResponseInfo {
    private final zzbdg zza;
    private final List<AdapterResponseInfo> zzb = new ArrayList();

    private ResponseInfo(zzbdg zzbdgVar) {
        this.zza = zzbdgVar;
        if (!((Boolean) zzbba.zzc().zzb(zzbfq.zzfC)).booleanValue() || zzbdgVar == null) {
            return;
        }
        try {
            List<zzbab> zzg = zzbdgVar.zzg();
            if (zzg != null) {
                for (zzbab zzbabVar : zzg) {
                    AdapterResponseInfo zza = AdapterResponseInfo.zza(zzbabVar);
                    if (zza != null) {
                        this.zzb.add(zza);
                    }
                }
            }
        } catch (RemoteException e) {
            zzccn.zzg("Could not forward getAdapterResponseInfo to ResponseInfo.", e);
        }
    }

    public static ResponseInfo zzb(zzbdg zzbdgVar) {
        if (zzbdgVar != null) {
            return new ResponseInfo(zzbdgVar);
        }
        return null;
    }

    public static ResponseInfo zzc(zzbdg zzbdgVar) {
        return new ResponseInfo(zzbdgVar);
    }

    public List<AdapterResponseInfo> getAdapterResponses() {
        return this.zzb;
    }

    public String getMediationAdapterClassName() {
        try {
            zzbdg zzbdgVar = this.zza;
            if (zzbdgVar != null) {
                return zzbdgVar.zze();
            }
            return null;
        } catch (RemoteException e) {
            zzccn.zzg("Could not forward getMediationAdapterClassName to ResponseInfo.", e);
            return null;
        }
    }

    public String getResponseId() {
        try {
            zzbdg zzbdgVar = this.zza;
            if (zzbdgVar != null) {
                return zzbdgVar.zzf();
            }
            return null;
        } catch (RemoteException e) {
            zzccn.zzg("Could not forward getResponseId to ResponseInfo.", e);
            return null;
        }
    }

    public String toString() {
        try {
            return zza().toString(2);
        } catch (JSONException unused) {
            return "Error forming toString output.";
        }
    }

    public final JSONObject zza() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        String responseId = getResponseId();
        if (responseId == null) {
            jSONObject.put("Response ID", "null");
        } else {
            jSONObject.put("Response ID", responseId);
        }
        String mediationAdapterClassName = getMediationAdapterClassName();
        if (mediationAdapterClassName == null) {
            jSONObject.put("Mediation Adapter Class Name", "null");
        } else {
            jSONObject.put("Mediation Adapter Class Name", mediationAdapterClassName);
        }
        JSONArray jSONArray = new JSONArray();
        for (AdapterResponseInfo adapterResponseInfo : this.zzb) {
            jSONArray.put(adapterResponseInfo.zzb());
        }
        jSONObject.put("Adapter Responses", jSONArray);
        return jSONObject;
    }
}
