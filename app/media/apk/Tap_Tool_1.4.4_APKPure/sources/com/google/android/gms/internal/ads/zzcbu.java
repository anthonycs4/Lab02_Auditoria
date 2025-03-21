package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import androidx.core.app.NotificationCompat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzcbu {
    private String zzd;
    private String zze;
    private long zzf;
    private JSONObject zzg;
    private boolean zzh;
    private boolean zzj;
    private final List<String> zza = new ArrayList();
    private final List<String> zzb = new ArrayList();
    private final Map<String, zzbqz> zzc = new HashMap();
    private final List<String> zzi = new ArrayList();

    public zzcbu(String str, long j) {
        JSONObject optJSONObject;
        JSONObject optJSONObject2;
        JSONArray optJSONArray;
        JSONObject optJSONObject3;
        this.zzh = false;
        this.zzj = false;
        this.zze = str;
        this.zzf = j;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            this.zzg = jSONObject;
            if (jSONObject.optInt(NotificationCompat.CATEGORY_STATUS, -1) != 1) {
                this.zzh = false;
                com.google.android.gms.ads.internal.util.zze.zzi("App settings could not be fetched successfully.");
                return;
            }
            this.zzh = true;
            this.zzd = this.zzg.optString("app_id");
            JSONArray optJSONArray2 = this.zzg.optJSONArray("ad_unit_id_settings");
            if (optJSONArray2 != null) {
                for (int i = 0; i < optJSONArray2.length(); i++) {
                    JSONObject jSONObject2 = optJSONArray2.getJSONObject(i);
                    String optString = jSONObject2.optString("format");
                    String optString2 = jSONObject2.optString("ad_unit_id");
                    if (!TextUtils.isEmpty(optString) && !TextUtils.isEmpty(optString2)) {
                        if ("interstitial".equalsIgnoreCase(optString)) {
                            this.zzb.add(optString2);
                        } else if (("rewarded".equalsIgnoreCase(optString) || "rewarded_interstitial".equals(optString)) && (optJSONObject3 = jSONObject2.optJSONObject("mediation_config")) != null) {
                            this.zzc.put(optString2, new zzbqz(optJSONObject3));
                        }
                    }
                }
            }
            JSONArray optJSONArray3 = this.zzg.optJSONArray("persistable_banner_ad_unit_ids");
            if (optJSONArray3 != null) {
                for (int i2 = 0; i2 < optJSONArray3.length(); i2++) {
                    this.zza.add(optJSONArray3.optString(i2));
                }
            }
            if (((Boolean) zzbba.zzc().zzb(zzbfq.zzeW)).booleanValue() && (optJSONObject2 = this.zzg.optJSONObject("common_settings")) != null && (optJSONArray = optJSONObject2.optJSONArray("loeid")) != null) {
                for (int i3 = 0; i3 < optJSONArray.length(); i3++) {
                    this.zzi.add(optJSONArray.get(i3).toString());
                }
            }
            if (!((Boolean) zzbba.zzc().zzb(zzbfq.zzew)).booleanValue() || (optJSONObject = this.zzg.optJSONObject("common_settings")) == null) {
                return;
            }
            this.zzj = optJSONObject.optBoolean("is_prefetching_enabled", false);
        } catch (JSONException e) {
            com.google.android.gms.ads.internal.util.zze.zzj("Exception occurred while processing app setting json", e);
            com.google.android.gms.ads.internal.zzs.zzg().zzg(e, "AppSettings.parseAppSettingsJson");
        }
    }

    public final void zza(long j) {
        this.zzf = j;
    }

    public final long zzb() {
        return this.zzf;
    }

    public final boolean zzc() {
        return this.zzh;
    }

    public final String zzd() {
        return this.zze;
    }

    public final String zze() {
        return this.zzd;
    }

    public final Map<String, zzbqz> zzf() {
        return this.zzc;
    }

    public final JSONObject zzg() {
        return this.zzg;
    }

    public final List<String> zzh() {
        return this.zzi;
    }

    public final boolean zzi() {
        return this.zzj;
    }
}
