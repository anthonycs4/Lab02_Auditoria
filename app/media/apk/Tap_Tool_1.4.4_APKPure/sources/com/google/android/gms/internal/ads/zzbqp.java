package com.google.android.gms.internal.ads;

import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
final class zzbqp implements zzbmc {
    final /* synthetic */ zzbqq zza;
    private final zzcde zzb;

    public zzbqp(zzbqq zzbqqVar, zzcde zzcdeVar) {
        this.zza = zzbqqVar;
        this.zzb = zzcdeVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbmc
    public final void zza(JSONObject jSONObject) {
        try {
            this.zzb.zzc(jSONObject);
        } catch (IllegalStateException unused) {
        } catch (JSONException e) {
            this.zzb.zzd(e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbmc
    public final void zzb(String str) {
        try {
            if (str == null) {
                this.zzb.zzd(new zzbpt());
            } else {
                this.zzb.zzd(new zzbpt(str));
            }
        } catch (IllegalStateException unused) {
        }
    }
}
