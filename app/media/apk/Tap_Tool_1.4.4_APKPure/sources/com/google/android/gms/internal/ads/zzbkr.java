package com.google.android.gms.internal.ads;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.Map;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzbkr implements zzblp<Object> {
    private final zzbks zza;

    public zzbkr(zzbks zzbksVar) {
        this.zza = zzbksVar;
    }

    @Override // com.google.android.gms.internal.ads.zzblp
    public final void zza(Object obj, Map<String, String> map) {
        String str = map.get(AppMeasurementSdk.ConditionalUserProperty.NAME);
        if (str == null) {
            com.google.android.gms.ads.internal.util.zze.zzi("App event with no name parameter.");
        } else {
            this.zza.zzbL(str, map.get("info"));
        }
    }
}
