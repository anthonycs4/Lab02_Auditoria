package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public abstract class zzcax {
    static zzcax zza;

    public static synchronized zzcax zzd(Context context) {
        synchronized (zzcax.class) {
            zzcax zzcaxVar = zza;
            if (zzcaxVar != null) {
                return zzcaxVar;
            }
            Context applicationContext = context.getApplicationContext();
            zzbfq.zza(applicationContext);
            com.google.android.gms.ads.internal.util.zzg zzl = com.google.android.gms.ads.internal.zzs.zzg().zzl();
            zzl.zza(applicationContext);
            zzcac zzcacVar = new zzcac(null);
            zzcacVar.zza(applicationContext);
            zzcacVar.zzb(com.google.android.gms.ads.internal.zzs.zzj());
            zzcacVar.zzc(zzl);
            zzcacVar.zzd(com.google.android.gms.ads.internal.zzs.zzA());
            zzcax zze = zzcacVar.zze();
            zza = zze;
            zze.zza().zza();
            zza.zzb().zze();
            final zzcbc zzc = zza.zzc();
            if (((Boolean) zzbba.zzc().zzb(zzbfq.zzal)).booleanValue()) {
                final HashMap hashMap = new HashMap();
                try {
                    JSONObject jSONObject = new JSONObject((String) zzbba.zzc().zzb(zzbfq.zzan));
                    Iterator<String> keys = jSONObject.keys();
                    while (keys.hasNext()) {
                        String next = keys.next();
                        HashSet hashSet = new HashSet();
                        JSONArray optJSONArray = jSONObject.optJSONArray(next);
                        if (optJSONArray != null) {
                            for (int i = 0; i < optJSONArray.length(); i++) {
                                String optString = optJSONArray.optString(i);
                                if (optString != null) {
                                    hashSet.add(optString);
                                }
                            }
                            hashMap.put(next, hashSet);
                        }
                    }
                    for (String str : hashMap.keySet()) {
                        zzc.zzb(str);
                    }
                    zzc.zza(new zzcbb(zzc, hashMap) { // from class: com.google.android.gms.internal.ads.zzcaz
                        private final zzcbc zza;
                        private final Map zzb;

                        /* JADX INFO: Access modifiers changed from: package-private */
                        {
                            this.zza = zzc;
                            this.zzb = hashMap;
                        }

                        @Override // com.google.android.gms.internal.ads.zzcbb
                        public final void zza(SharedPreferences sharedPreferences, String str2, String str3) {
                            this.zza.zzc(this.zzb, sharedPreferences, str2, str3);
                        }
                    });
                } catch (JSONException e) {
                    com.google.android.gms.ads.internal.util.zze.zze("Failed to parse listening list", e);
                }
            }
            return zza;
        }
    }

    abstract zzbzv zza();

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract zzbzz zzb();

    abstract zzcbc zzc();
}
