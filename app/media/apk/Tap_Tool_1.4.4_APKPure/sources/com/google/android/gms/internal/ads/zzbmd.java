package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.android.gms.ads.RequestConfiguration;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import javax.annotation.ParametersAreNonnullByDefault;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
@ParametersAreNonnullByDefault
/* loaded from: classes.dex */
public final class zzbmd implements zzblp<Object> {
    private final Object zza = new Object();
    private final Map<String, zzbmc> zzb = new HashMap();

    @Override // com.google.android.gms.internal.ads.zzblp
    public final void zza(Object obj, Map<String, String> map) {
        String concat;
        String str = map.get("id");
        String str2 = map.get("fail");
        String str3 = map.get("fail_reason");
        String str4 = map.get("fail_stack");
        String str5 = map.get("result");
        if (true == TextUtils.isEmpty(str4)) {
            str3 = "Unknown Fail Reason.";
        }
        if (TextUtils.isEmpty(str4)) {
            concat = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
        } else {
            String valueOf = String.valueOf(str4);
            concat = valueOf.length() != 0 ? "\n".concat(valueOf) : new String("\n");
        }
        synchronized (this.zza) {
            zzbmc remove = this.zzb.remove(str);
            if (remove == null) {
                String valueOf2 = String.valueOf(str);
                com.google.android.gms.ads.internal.util.zze.zzi(valueOf2.length() != 0 ? "Received result for unexpected method invocation: ".concat(valueOf2) : new String("Received result for unexpected method invocation: "));
            } else if (!TextUtils.isEmpty(str2)) {
                String valueOf3 = String.valueOf(str3);
                String valueOf4 = String.valueOf(concat);
                remove.zzb(valueOf4.length() != 0 ? valueOf3.concat(valueOf4) : new String(valueOf3));
            } else if (str5 != null) {
                try {
                    JSONObject jSONObject = new JSONObject(str5);
                    if (com.google.android.gms.ads.internal.util.zze.zzc()) {
                        String valueOf5 = String.valueOf(jSONObject.toString(2));
                        com.google.android.gms.ads.internal.util.zze.zza(valueOf5.length() != 0 ? "Result GMSG: ".concat(valueOf5) : new String("Result GMSG: "));
                    }
                    remove.zza(jSONObject);
                } catch (JSONException e) {
                    remove.zzb(e.getMessage());
                }
            } else {
                remove.zza(null);
            }
        }
    }

    public final void zzb(String str, zzbmc zzbmcVar) {
        synchronized (this.zza) {
            this.zzb.put(str, zzbmcVar);
        }
    }

    public final <EngineT extends zzbou> zzfla<JSONObject> zzc(EngineT enginet, String str, JSONObject jSONObject) {
        zzcde zzcdeVar = new zzcde();
        com.google.android.gms.ads.internal.zzs.zzc();
        String uuid = UUID.randomUUID().toString();
        zzb(uuid, new zzbmb(this, zzcdeVar));
        try {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("id", uuid);
            jSONObject2.put("args", jSONObject);
            enginet.zzr(str, jSONObject2);
        } catch (Exception e) {
            zzcdeVar.zzd(e);
        }
        return zzcdeVar;
    }
}
