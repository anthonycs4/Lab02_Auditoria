package com.google.android.gms.internal.ads;

import org.json.JSONObject;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzbmb implements zzbmc {
    final /* synthetic */ zzcde zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbmb(zzbmd zzbmdVar, zzcde zzcdeVar) {
        this.zza = zzcdeVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbmc
    public final void zza(JSONObject jSONObject) {
        this.zza.zzc(jSONObject);
    }

    @Override // com.google.android.gms.internal.ads.zzbmc
    public final void zzb(String str) {
        this.zza.zzd(new zzbpt(str));
    }
}
