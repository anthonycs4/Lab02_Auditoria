package com.google.android.gms.internal.ads;

import androidx.core.app.NotificationCompat;
import org.json.JSONException;
import org.json.JSONObject;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzdqp {
    private Long zza;
    private final String zzb;
    private String zzc;
    private Integer zzd;
    private String zze;
    private Integer zzf;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzdqp(String str, zzdqo zzdqoVar) {
        this.zzb = str;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ String zza(zzdqp zzdqpVar) {
        String str = (String) zzbba.zzc().zzb(zzbfq.zzgq);
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.putOpt("objectId", zzdqpVar.zza);
            jSONObject.put("eventCategory", zzdqpVar.zzb);
            jSONObject.putOpt(NotificationCompat.CATEGORY_EVENT, zzdqpVar.zzc);
            jSONObject.putOpt("errorCode", zzdqpVar.zzd);
            jSONObject.putOpt("rewardType", zzdqpVar.zze);
            jSONObject.putOpt("rewardAmount", zzdqpVar.zzf);
        } catch (JSONException unused) {
            com.google.android.gms.ads.internal.util.zze.zzi("Could not convert parameters to JSON.");
        }
        String jSONObject2 = jSONObject.toString();
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 16 + String.valueOf(jSONObject2).length());
        sb.append(str);
        sb.append("(\"h5adsEvent\",");
        sb.append(jSONObject2);
        sb.append(");");
        return sb.toString();
    }
}
