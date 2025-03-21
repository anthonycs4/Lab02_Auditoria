package com.google.android.gms.internal.ads;

import java.util.HashSet;
import org.json.JSONObject;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzfah {
    private JSONObject zza;
    private final zzfaq zzb;

    public zzfah(zzfaq zzfaqVar) {
        this.zzb = zzfaqVar;
    }

    public final void zza(JSONObject jSONObject, HashSet<String> hashSet, long j) {
        this.zzb.zza(new zzfat(this, hashSet, jSONObject, j, null));
    }

    public final void zzb(JSONObject jSONObject, HashSet<String> hashSet, long j) {
        this.zzb.zza(new zzfas(this, hashSet, jSONObject, j, null));
    }

    public final void zzc() {
        this.zzb.zza(new zzfar(this, null));
    }

    public final JSONObject zzd() {
        return this.zza;
    }

    public final void zze(JSONObject jSONObject) {
        this.zza = jSONObject;
    }
}
