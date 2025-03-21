package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzbqz {
    public final List<zzbqy> zza;
    public final List<String> zzb;
    public final List<String> zzc;
    public final List<String> zzd;
    public final List<String> zze;
    public final List<String> zzf;
    public final String zzg;
    public final String zzh;

    public zzbqz(JSONObject jSONObject) throws JSONException {
        if (com.google.android.gms.ads.internal.util.zze.zzm(2)) {
            String valueOf = String.valueOf(jSONObject.toString(2));
            com.google.android.gms.ads.internal.util.zze.zza(valueOf.length() != 0 ? "Mediation Response JSON: ".concat(valueOf) : new String("Mediation Response JSON: "));
        }
        JSONArray jSONArray = jSONObject.getJSONArray("ad_networks");
        ArrayList arrayList = new ArrayList(jSONArray.length());
        int i = -1;
        for (int i2 = 0; i2 < jSONArray.length(); i2++) {
            try {
                zzbqy zzbqyVar = new zzbqy(jSONArray.getJSONObject(i2));
                "banner".equalsIgnoreCase(zzbqyVar.zzv);
                arrayList.add(zzbqyVar);
                if (i < 0) {
                    Iterator<String> it = zzbqyVar.zzc.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            if (it.next().equals("com.google.ads.mediation.admob.AdMobAdapter")) {
                                i = i2;
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                }
            } catch (JSONException unused) {
            }
        }
        jSONArray.length();
        this.zza = Collections.unmodifiableList(arrayList);
        this.zzg = jSONObject.optString("qdata");
        jSONObject.optInt("fs_model_type", -1);
        jSONObject.optLong("timeout_ms", -1L);
        JSONObject optJSONObject = jSONObject.optJSONObject("settings");
        if (optJSONObject == null) {
            this.zzb = null;
            this.zzc = null;
            this.zzd = null;
            this.zze = null;
            this.zzf = null;
            this.zzh = null;
            return;
        }
        optJSONObject.optLong("ad_network_timeout_millis", -1L);
        com.google.android.gms.ads.internal.zzs.zzu();
        this.zzb = zzbra.zza(optJSONObject, "click_urls");
        com.google.android.gms.ads.internal.zzs.zzu();
        this.zzc = zzbra.zza(optJSONObject, "imp_urls");
        com.google.android.gms.ads.internal.zzs.zzu();
        this.zzd = zzbra.zza(optJSONObject, "downloaded_imp_urls");
        com.google.android.gms.ads.internal.zzs.zzu();
        this.zze = zzbra.zza(optJSONObject, "nofill_urls");
        com.google.android.gms.ads.internal.zzs.zzu();
        this.zzf = zzbra.zza(optJSONObject, "remote_ping_urls");
        optJSONObject.optBoolean("render_in_browser", false);
        optJSONObject.optLong("refresh", -1L);
        zzbyh zza = zzbyh.zza(optJSONObject.optJSONArray("rewards"));
        if (zza == null) {
            this.zzh = null;
        } else {
            this.zzh = zza.zza;
        }
        optJSONObject.optBoolean("use_displayed_impression", false);
        optJSONObject.optBoolean("allow_pub_rendered_attribution", false);
        optJSONObject.optBoolean("allow_pub_owned_ad_view", false);
        optJSONObject.optBoolean("allow_custom_click_gesture", false);
    }
}
