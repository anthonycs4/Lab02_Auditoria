package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzecd implements zzdyc<zzeub, zzdzx> {
    private final Map<String, zzdyd<zzeub, zzdzx>> zza = new HashMap();
    private final zzdnl zzb;

    public zzecd(zzdnl zzdnlVar) {
        this.zzb = zzdnlVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdyc
    public final zzdyd<zzeub, zzdzx> zza(String str, JSONObject jSONObject) throws zzetp {
        zzdyd<zzeub, zzdzx> zzdydVar;
        synchronized (this) {
            zzdydVar = this.zza.get(str);
            if (zzdydVar == null) {
                zzdydVar = new zzdyd<>(this.zzb.zzb(str, jSONObject), new zzdzx(), str);
                this.zza.put(str, zzdydVar);
            }
        }
        return zzdydVar;
    }
}
