package com.google.android.gms.internal.ads;

import java.util.Map;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
final /* synthetic */ class zzbla implements zzblp {
    static final zzblp zza = new zzbla();

    private zzbla() {
    }

    @Override // com.google.android.gms.internal.ads.zzblp
    public final void zza(Object obj, Map map) {
        zzcib zzcibVar = (zzcib) obj;
        zzblp<zzcib> zzblpVar = zzblo.zza;
        String str = (String) map.get("u");
        if (str == null) {
            com.google.android.gms.ads.internal.util.zze.zzi("URL missing from click GMSG.");
        } else {
            zzfks.zzp(zzblo.zza(zzcibVar, str), new zzblf(zzcibVar), zzccz.zza);
        }
    }
}
