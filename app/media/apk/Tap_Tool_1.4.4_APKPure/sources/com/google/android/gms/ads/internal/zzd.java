package com.google.android.gms.ads.internal;

import com.google.android.gms.internal.ads.zzfjz;
import com.google.android.gms.internal.ads.zzfks;
import com.google.android.gms.internal.ads.zzfla;
import org.json.JSONObject;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final /* synthetic */ class zzd implements zzfjz {
    static final zzfjz zza = new zzd();

    private zzd() {
    }

    @Override // com.google.android.gms.internal.ads.zzfjz
    public final zzfla zza(Object obj) {
        JSONObject jSONObject = (JSONObject) obj;
        if (jSONObject.optBoolean("isSuccessful", false)) {
            zzs.zzg().zzl().zzm(jSONObject.getString("appSettingsJson"));
        }
        return zzfks.zza(null);
    }
}
