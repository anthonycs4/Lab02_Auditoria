package com.google.android.gms.internal.ads;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import javax.annotation.CheckForNull;
import org.json.JSONArray;
import org.json.JSONObject;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzdnq {
    private final Map<String, Map<String, JSONObject>> zza = new ConcurrentHashMap();
    private JSONObject zzb;
    private final Executor zzc;
    private boolean zzd;
    private JSONObject zze;

    public zzdnq(Executor executor) {
        this.zzc = executor;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzg */
    public final synchronized void zzf() {
        Map<String, JSONObject> map;
        this.zzd = true;
        zzcbu zzn = com.google.android.gms.ads.internal.zzs.zzg().zzl().zzn();
        if (zzn == null) {
            return;
        }
        JSONObject zzg = zzn.zzg();
        if (zzg == null) {
            return;
        }
        this.zzb = ((Boolean) zzbba.zzc().zzb(zzbfq.zzcm)).booleanValue() ? zzg.optJSONObject("common_settings") : null;
        this.zze = zzg.optJSONObject("ad_unit_patterns");
        JSONArray optJSONArray = zzg.optJSONArray("ad_unit_id_settings");
        if (optJSONArray != null) {
            for (int i = 0; i < optJSONArray.length(); i++) {
                JSONObject optJSONObject = optJSONArray.optJSONObject(i);
                if (optJSONObject != null) {
                    String optString = optJSONObject.optString("ad_unit_id");
                    String optString2 = optJSONObject.optString("format");
                    JSONObject optJSONObject2 = optJSONObject.optJSONObject("request_signals");
                    if (optString != null && optJSONObject2 != null && optString2 != null) {
                        if (this.zza.containsKey(optString2)) {
                            map = this.zza.get(optString2);
                        } else {
                            ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
                            this.zza.put(optString2, concurrentHashMap);
                            map = concurrentHashMap;
                        }
                        map.put(optString, optJSONObject2);
                    }
                }
            }
        }
    }

    public final void zza() {
        com.google.android.gms.ads.internal.zzs.zzg().zzl().zzo(new Runnable(this) { // from class: com.google.android.gms.internal.ads.zzdnn
            private final zzdnq zza;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zza = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zze();
            }
        });
        this.zzc.execute(new Runnable(this) { // from class: com.google.android.gms.internal.ads.zzdno
            private final zzdnq zza;

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

    @CheckForNull
    public final JSONObject zzb(String str, String str2) {
        if (!((Boolean) zzbba.zzc().zzb(zzbfq.zzcl)).booleanValue() || str == null || str2 == null) {
            return null;
        }
        if (!this.zzd) {
            zzf();
        }
        Map<String, JSONObject> map = this.zza.get(str2);
        if (map == null) {
            return null;
        }
        JSONObject jSONObject = map.get(str);
        if (jSONObject != null) {
            return jSONObject;
        }
        String zza = zzdns.zza(this.zze, str, str2);
        if (zza == null) {
            return null;
        }
        return map.get(zza);
    }

    @CheckForNull
    public final JSONObject zzc() {
        if (((Boolean) zzbba.zzc().zzb(zzbfq.zzcm)).booleanValue()) {
            return this.zzb;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zze() {
        this.zzc.execute(new Runnable(this) { // from class: com.google.android.gms.internal.ads.zzdnp
            private final zzdnq zza;

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
