package com.google.android.gms.internal.ads;

import org.json.JSONObject;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzecu implements zzdyc<zzbtl, zzdzw> {
    private final zzedy zza;

    public zzecu(zzedy zzedyVar) {
        this.zza = zzedyVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdyc
    public final zzdyd<zzbtl, zzdzw> zza(String str, JSONObject jSONObject) throws zzetp {
        zzbtl zzb = this.zza.zzb(str);
        if (zzb == null) {
            return null;
        }
        return new zzdyd<>(zzb, new zzdzw(), str);
    }
}
