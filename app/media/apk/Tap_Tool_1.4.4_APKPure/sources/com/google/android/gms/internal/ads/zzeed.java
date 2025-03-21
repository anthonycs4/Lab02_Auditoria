package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.ads.RequestConfiguration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzeed {
    private final Map<String, zzeef> zza = new ConcurrentHashMap();
    private final Map<String, Map<String, List<zzeef>>> zzb = new ConcurrentHashMap();
    private final Executor zzc;
    private JSONObject zzd;

    public zzeed(Executor executor) {
        this.zzc = executor;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzg */
    public final synchronized void zzf() {
        JSONArray optJSONArray;
        JSONObject zzg = com.google.android.gms.ads.internal.zzs.zzg().zzl().zzn().zzg();
        if (zzg != null) {
            try {
                JSONArray optJSONArray2 = zzg.optJSONArray("ad_unit_id_settings");
                this.zzd = zzg.optJSONObject("ad_unit_patterns");
                if (optJSONArray2 != null) {
                    for (int i = 0; i < optJSONArray2.length(); i++) {
                        JSONObject jSONObject = optJSONArray2.getJSONObject(i);
                        String optString = jSONObject.optString("ad_unit_id", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED);
                        String optString2 = jSONObject.optString("format", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED);
                        ArrayList arrayList = new ArrayList();
                        JSONObject optJSONObject = jSONObject.optJSONObject("mediation_config");
                        if (optJSONObject != null && (optJSONArray = optJSONObject.optJSONArray("ad_networks")) != null) {
                            for (int i2 = 0; i2 < optJSONArray.length(); i2++) {
                                JSONObject jSONObject2 = optJSONArray.getJSONObject(i2);
                                ArrayList arrayList2 = new ArrayList();
                                if (jSONObject2 != null) {
                                    JSONObject optJSONObject2 = jSONObject2.optJSONObject("data");
                                    Bundle bundle = new Bundle();
                                    if (optJSONObject2 != null) {
                                        Iterator<String> keys = optJSONObject2.keys();
                                        while (keys.hasNext()) {
                                            String next = keys.next();
                                            bundle.putString(next, optJSONObject2.optString(next, RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED));
                                        }
                                    }
                                    JSONArray optJSONArray3 = jSONObject2.optJSONArray("rtb_adapters");
                                    if (optJSONArray3 != null) {
                                        ArrayList arrayList3 = new ArrayList();
                                        for (int i3 = 0; i3 < optJSONArray3.length(); i3++) {
                                            String optString3 = optJSONArray3.optString(i3, RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED);
                                            if (!TextUtils.isEmpty(optString3)) {
                                                arrayList3.add(optString3);
                                            }
                                        }
                                        int size = arrayList3.size();
                                        for (int i4 = 0; i4 < size; i4++) {
                                            String str = (String) arrayList3.get(i4);
                                            zzc(str);
                                            if (this.zza.get(str) != null) {
                                                arrayList2.add(new zzeef(str, optString2, bundle));
                                            }
                                        }
                                    }
                                }
                                arrayList.addAll(arrayList2);
                            }
                        }
                        if (!TextUtils.isEmpty(optString2) && !TextUtils.isEmpty(optString)) {
                            Map<String, List<zzeef>> map = this.zzb.get(optString2);
                            if (map == null) {
                                map = new ConcurrentHashMap<>();
                            }
                            this.zzb.put(optString2, map);
                            List<zzeef> list = map.get(optString);
                            if (list == null) {
                                list = new ArrayList<>();
                            }
                            list.addAll(arrayList);
                            map.put(optString, list);
                        }
                    }
                }
            } catch (JSONException e) {
                com.google.android.gms.ads.internal.util.zze.zzb("Malformed config loading JSON.", e);
            }
        }
    }

    public final void zza() {
        com.google.android.gms.ads.internal.zzs.zzg().zzl().zzo(new Runnable(this) { // from class: com.google.android.gms.internal.ads.zzeea
            private final zzeed zza;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zza = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zze();
            }
        });
        this.zzc.execute(new Runnable(this) { // from class: com.google.android.gms.internal.ads.zzeeb
            private final zzeed zza;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zza = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzd();
            }
        });
    }

    public final Map<String, List<Bundle>> zzb(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return Collections.emptyMap();
        }
        Map<String, List<zzeef>> map = this.zzb.get(str);
        if (map == null) {
            return Collections.emptyMap();
        }
        List<zzeef> list = map.get(str2);
        if (list == null) {
            list = map.get(zzdns.zza(this.zzd, str2, str));
        }
        if (list == null) {
            return Collections.emptyMap();
        }
        HashMap hashMap = new HashMap();
        for (zzeef zzeefVar : list) {
            String str3 = zzeefVar.zza;
            if (!hashMap.containsKey(str3)) {
                hashMap.put(str3, new ArrayList());
            }
            ((List) hashMap.get(str3)).add(zzeefVar.zzc);
        }
        return hashMap;
    }

    public final void zzc(String str) {
        if (TextUtils.isEmpty(str) || this.zza.containsKey(str)) {
            return;
        }
        this.zza.put(str, new zzeef(str, RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, new Bundle()));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zze() {
        this.zzc.execute(new Runnable(this) { // from class: com.google.android.gms.internal.ads.zzeec
            private final zzeed zza;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zza = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzf();
            }
        });
    }
}
