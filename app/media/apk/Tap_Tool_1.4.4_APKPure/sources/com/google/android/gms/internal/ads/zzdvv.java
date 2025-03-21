package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.android.gms.ads.RequestConfiguration;
import java.util.HashMap;
import org.json.JSONObject;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzdvv implements zzewp<zzdvu, zzdvq> {
    private final String zza;

    public zzdvv(String str) {
        this.zza = str;
    }

    @Override // com.google.android.gms.internal.ads.zzewp
    public final /* bridge */ /* synthetic */ zzdvq zza(zzdvu zzdvuVar) throws Exception {
        JSONObject jSONObject;
        zzbxi zzbxiVar;
        zzbxi zzbxiVar2;
        zzbxi zzbxiVar3;
        zzbxi zzbxiVar4;
        zzbxi zzbxiVar5;
        zzbxi zzbxiVar6;
        zzbxi zzbxiVar7;
        JSONObject jSONObject2;
        zzdvu zzdvuVar2 = zzdvuVar;
        jSONObject = zzdvuVar2.zza;
        int optInt = jSONObject.optInt("http_timeout_millis", 60000);
        zzbxiVar = zzdvuVar2.zzb;
        if (zzbxiVar.zza() == -2) {
            HashMap hashMap = new HashMap();
            zzbxiVar2 = zzdvuVar2.zzb;
            if (zzbxiVar2.zzg() && !TextUtils.isEmpty(this.zza)) {
                hashMap.put("Cookie", this.zza);
            }
            zzbxiVar3 = zzdvuVar2.zzb;
            boolean zzf = zzbxiVar3.zzf();
            String str = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
            if (zzf) {
                jSONObject2 = zzdvuVar2.zza;
                JSONObject optJSONObject = jSONObject2.optJSONObject("pii");
                if (optJSONObject != null) {
                    if (!TextUtils.isEmpty(optJSONObject.optString("doritos", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED))) {
                        hashMap.put("x-afma-drt-cookie", optJSONObject.optString("doritos", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED));
                    }
                    if (!TextUtils.isEmpty(optJSONObject.optString("doritos_v2", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED))) {
                        hashMap.put("x-afma-drt-v2-cookie", optJSONObject.optString("doritos_v2", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED));
                    }
                } else {
                    com.google.android.gms.ads.internal.util.zze.zza("DSID signal does not exist.");
                }
            }
            zzbxiVar4 = zzdvuVar2.zzb;
            if (zzbxiVar4 != null) {
                zzbxiVar6 = zzdvuVar2.zzb;
                if (!TextUtils.isEmpty(zzbxiVar6.zzd())) {
                    zzbxiVar7 = zzdvuVar2.zzb;
                    str = zzbxiVar7.zzd();
                }
            }
            zzbxiVar5 = zzdvuVar2.zzb;
            return new zzdvq(zzbxiVar5.zze(), optInt, hashMap, str);
        } else if (zzbxiVar.zza() == 1) {
            if (zzbxiVar.zzb() != null) {
                com.google.android.gms.ads.internal.util.zze.zzf(TextUtils.join(", ", zzbxiVar.zzb()));
            }
            throw new zzdsp(2, "Error building request URL.");
        } else {
            throw new zzdsp(1);
        }
    }
}
