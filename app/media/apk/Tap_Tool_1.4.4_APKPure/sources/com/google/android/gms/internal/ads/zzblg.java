package com.google.android.gms.internal.ads;

import java.util.Map;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
final class zzblg implements zzblp<zzcib> {
    @Override // com.google.android.gms.internal.ads.zzblp
    public final /* bridge */ /* synthetic */ void zza(zzcib zzcibVar, Map map) {
        zzcib zzcibVar2 = zzcibVar;
        if (zzcibVar2.zzay() != null) {
            zzcibVar2.zzay().zza();
        }
        com.google.android.gms.ads.internal.overlay.zzl zzN = zzcibVar2.zzN();
        if (zzN != null) {
            zzN.zzb();
            return;
        }
        com.google.android.gms.ads.internal.overlay.zzl zzO = zzcibVar2.zzO();
        if (zzO != null) {
            zzO.zzb();
        } else {
            com.google.android.gms.ads.internal.util.zze.zzi("A GMSG tried to close something that wasn't an overlay.");
        }
    }
}
