package com.google.android.gms.internal.ads;

import java.util.Map;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
final /* synthetic */ class zzblc implements zzblp {
    static final zzblp zza = new zzblc();

    private zzblc() {
    }

    @Override // com.google.android.gms.internal.ads.zzblp
    public final void zza(Object obj, Map map) {
        zzcjk zzcjkVar = (zzcjk) obj;
        zzblp<zzcib> zzblpVar = zzblo.zza;
        String str = (String) map.get("tx");
        String str2 = (String) map.get("ty");
        String str3 = (String) map.get("td");
        try {
            int parseInt = Integer.parseInt(str);
            int parseInt2 = Integer.parseInt(str2);
            int parseInt3 = Integer.parseInt(str3);
            zzfb zzU = zzcjkVar.zzU();
            if (zzU != null) {
                zzU.zzb().zze(parseInt, parseInt2, parseInt3);
            }
        } catch (NumberFormatException unused) {
            com.google.android.gms.ads.internal.util.zze.zzi("Could not parse touch parameters from gmsg.");
        }
    }
}
