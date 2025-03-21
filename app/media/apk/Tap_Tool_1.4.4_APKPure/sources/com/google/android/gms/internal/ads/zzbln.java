package com.google.android.gms.internal.ads;

import java.util.Map;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
final class zzbln implements zzblp<zzcib> {
    @Override // com.google.android.gms.internal.ads.zzblp
    public final /* bridge */ /* synthetic */ void zza(zzcib zzcibVar, Map map) {
        zzcib zzcibVar2 = zzcibVar;
        if (map.keySet().contains("start")) {
            zzcibVar2.zzar(true);
        }
        if (map.keySet().contains("stop")) {
            zzcibVar2.zzar(false);
        }
    }
}
