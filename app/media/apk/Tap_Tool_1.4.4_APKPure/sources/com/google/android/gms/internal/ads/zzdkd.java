package com.google.android.gms.internal.ads;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;
import org.json.JSONArray;
import org.json.JSONObject;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzdkd {
    private final Executor zza;
    private final zzdjy zzb;

    public zzdkd(Executor executor, zzdjy zzdjyVar) {
        this.zza = executor;
        this.zzb = zzdjyVar;
    }

    public final zzfla<List<zzdkc>> zza(JSONObject jSONObject, String str) {
        zzfla zza;
        JSONArray optJSONArray = jSONObject.optJSONArray("custom_assets");
        if (optJSONArray == null) {
            return zzfks.zza(Collections.emptyList());
        }
        ArrayList arrayList = new ArrayList();
        int length = optJSONArray.length();
        for (int i = 0; i < length; i++) {
            JSONObject optJSONObject = optJSONArray.optJSONObject(i);
            if (optJSONObject == null) {
                zza = zzfks.zza(null);
            } else {
                final String optString = optJSONObject.optString(AppMeasurementSdk.ConditionalUserProperty.NAME);
                if (optString == null) {
                    zza = zzfks.zza(null);
                } else {
                    String optString2 = optJSONObject.optString("type");
                    if (TypedValues.Custom.S_STRING.equals(optString2)) {
                        zza = zzfks.zza(new zzdkc(optString, optJSONObject.optString("string_value")));
                    } else if ("image".equals(optString2)) {
                        zza = zzfks.zzj(this.zzb.zza(optJSONObject, "image_value"), new zzfei(optString) { // from class: com.google.android.gms.internal.ads.zzdkb
                            private final String zza;

                            /* JADX INFO: Access modifiers changed from: package-private */
                            {
                                this.zza = optString;
                            }

                            @Override // com.google.android.gms.internal.ads.zzfei
                            public final Object apply(Object obj) {
                                return new zzdkc(this.zza, (zzbhu) obj);
                            }
                        }, this.zza);
                    } else {
                        zza = zzfks.zza(null);
                    }
                }
            }
            arrayList.add(zza);
        }
        return zzfks.zzj(zzfks.zzk(arrayList), zzdka.zza, this.zza);
    }
}
