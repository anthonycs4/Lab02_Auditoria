package com.google.android.gms.internal.ads;

import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
final class zzdvm implements zzbpx<zzdvn> {
    @Override // com.google.android.gms.internal.ads.zzbpx
    public final /* bridge */ /* synthetic */ JSONObject zzb(zzdvn zzdvnVar) throws JSONException {
        zzdvn zzdvnVar2 = zzdvnVar;
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        JSONObject jSONObject3 = new JSONObject();
        jSONObject2.put("base_url", zzdvnVar2.zzc.zzc());
        jSONObject2.put("signals", zzdvnVar2.zzb);
        jSONObject3.put("body", zzdvnVar2.zza.zzc);
        jSONObject3.put("headers", com.google.android.gms.ads.internal.zzs.zzc().zzf(zzdvnVar2.zza.zzb));
        jSONObject3.put("response_code", zzdvnVar2.zza.zza);
        jSONObject3.put("latency", zzdvnVar2.zza.zzd);
        jSONObject.put("request", jSONObject2);
        jSONObject.put("response", jSONObject3);
        jSONObject.put("flags", zzdvnVar2.zzc.zzh());
        return jSONObject;
    }
}
