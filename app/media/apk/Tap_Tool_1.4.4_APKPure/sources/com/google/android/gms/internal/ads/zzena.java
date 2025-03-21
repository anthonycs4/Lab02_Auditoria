package com.google.android.gms.internal.ads;

import android.os.Bundle;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzena implements zzelc<JSONObject> {
    private final Bundle zza;

    public zzena(Bundle bundle) {
        this.zza = bundle;
    }

    @Override // com.google.android.gms.internal.ads.zzelc
    public final /* bridge */ /* synthetic */ void zzd(JSONObject jSONObject) {
        JSONObject jSONObject2 = jSONObject;
        if (this.zza != null) {
            try {
                com.google.android.gms.ads.internal.util.zzbv.zzg(com.google.android.gms.ads.internal.util.zzbv.zzg(jSONObject2, "device"), "play_store").put("parental_controls", com.google.android.gms.ads.internal.zzs.zzc().zzh(this.zza));
            } catch (JSONException unused) {
                com.google.android.gms.ads.internal.util.zze.zza("Failed putting parental controls bundle.");
            }
        }
    }
}
