package com.google.android.gms.internal.ads;

import java.util.Map;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
final class zzbll implements zzblp<zzcib> {
    @Override // com.google.android.gms.internal.ads.zzblp
    public final /* bridge */ /* synthetic */ void zza(zzcib zzcibVar, Map map) {
        zzcib zzcibVar2 = zzcibVar;
        String str = (String) map.get("action");
        if ("pause".equals(str)) {
            zzcibVar2.zzbv();
        } else if ("resume".equals(str)) {
            zzcibVar2.zzbw();
        }
    }
}
