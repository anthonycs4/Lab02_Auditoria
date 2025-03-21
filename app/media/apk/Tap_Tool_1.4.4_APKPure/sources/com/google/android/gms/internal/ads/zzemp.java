package com.google.android.gms.internal.ads;

import android.content.Context;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
final class zzemp implements zzeld<zzelc<JSONObject>> {
    private final JSONObject zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzemp(Context context) {
        this.zza = zzbxp.zzb(context);
    }

    @Override // com.google.android.gms.internal.ads.zzeld
    public final zzfla<zzelc<JSONObject>> zza() {
        return zzfks.zza(new zzelc(this) { // from class: com.google.android.gms.internal.ads.zzemo
            private final zzemp zza;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zza = this;
            }

            @Override // com.google.android.gms.internal.ads.zzelc
            public final void zzd(Object obj) {
                this.zza.zzb((JSONObject) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzb(JSONObject jSONObject) {
        try {
            jSONObject.put("gms_sdk_env", this.zza);
        } catch (JSONException unused) {
            com.google.android.gms.ads.internal.util.zze.zza("Failed putting version constants.");
        }
    }
}
