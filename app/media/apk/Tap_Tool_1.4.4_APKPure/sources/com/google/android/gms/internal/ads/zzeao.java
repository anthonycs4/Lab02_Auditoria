package com.google.android.gms.internal.ads;

import org.json.JSONObject;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzeao implements zzdyc<zzeub, zzdzw> {
    private final zzdnl zza;

    public zzeao(zzdnl zzdnlVar) {
        this.zza = zzdnlVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdyc
    public final zzdyd<zzeub, zzdzw> zza(String str, JSONObject jSONObject) throws zzetp {
        return new zzdyd<>(this.zza.zzb(str, jSONObject), new zzdzw(), str);
    }
}
