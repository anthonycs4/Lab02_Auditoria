package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONObject;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzcnn {
    private final Map<String, zzcnq> zza;
    private final Map<String, zzcnp> zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzcnn(Map<String, zzcnq> map, Map<String, zzcnp> map2) {
        this.zza = map;
        this.zzb = map2;
    }

    public final void zza(zzete zzeteVar) throws Exception {
        for (zzetc zzetcVar : zzeteVar.zzb.zzc) {
            if (this.zza.containsKey(zzetcVar.zza)) {
                this.zza.get(zzetcVar.zza).zza(zzetcVar.zzb);
            } else if (this.zzb.containsKey(zzetcVar.zza)) {
                zzcnp zzcnpVar = this.zzb.get(zzetcVar.zza);
                JSONObject jSONObject = zzetcVar.zzb;
                HashMap hashMap = new HashMap();
                Iterator<String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    String optString = jSONObject.optString(next);
                    if (optString != null) {
                        hashMap.put(next, optString);
                    }
                }
                zzcnpVar.zza(hashMap);
            }
        }
    }
}
