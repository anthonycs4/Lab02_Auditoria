package com.google.android.gms.internal.ads;

import java.util.Map;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
final /* synthetic */ class zzblb implements zzblp {
    static final zzblp zza = new zzblb();

    private zzblb() {
    }

    @Override // com.google.android.gms.internal.ads.zzblp
    public final void zza(Object obj, Map map) {
        zzcjd zzcjdVar = (zzcjd) obj;
        zzblp<zzcib> zzblpVar = zzblo.zza;
        String str = (String) map.get("u");
        if (str == null) {
            com.google.android.gms.ads.internal.util.zze.zzi("URL missing from httpTrack GMSG.");
        } else {
            new com.google.android.gms.ads.internal.util.zzbz(zzcjdVar.getContext(), ((zzcjl) zzcjdVar).zzt().zza, str).zzb();
        }
    }
}
