package com.google.android.gms.internal.ads;

import java.util.Map;
import org.json.JSONObject;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
final class zzble implements zzblp<zzcib> {
    @Override // com.google.android.gms.internal.ads.zzblp
    public final /* bridge */ /* synthetic */ void zza(zzcib zzcibVar, Map map) {
        JSONObject zzc;
        zzcib zzcibVar2 = zzcibVar;
        zzbhw zzaq = zzcibVar2.zzaq();
        if (zzaq == null || (zzc = zzaq.zzc()) == null) {
            zzcibVar2.zzd("nativeAdViewSignalsReady", new JSONObject());
        } else {
            zzcibVar2.zzd("nativeAdViewSignalsReady", zzc);
        }
    }
}
