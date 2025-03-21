package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.CollectionUtils;
import java.util.Map;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzblw implements zzblp<zzcib> {
    static final Map<String, Integer> zza = CollectionUtils.mapOfKeyValueArrays(new String[]{"resize", "playVideo", "storePicture", "createCalendarEvent", "setOrientationProperties", "closeResizedAd", "unload"}, new Integer[]{1, 2, 3, 4, 5, 6, 7});
    private final com.google.android.gms.ads.internal.zzb zzb;
    private final zzbuh zzc;
    private final zzbuo zzd;

    public zzblw(com.google.android.gms.ads.internal.zzb zzbVar, zzbuh zzbuhVar, zzbuo zzbuoVar) {
        this.zzb = zzbVar;
        this.zzc = zzbuhVar;
        this.zzd = zzbuoVar;
    }

    @Override // com.google.android.gms.internal.ads.zzblp
    public final /* bridge */ /* synthetic */ void zza(zzcib zzcibVar, Map map) {
        zzcib zzcibVar2 = zzcibVar;
        int intValue = zza.get((String) map.get("a")).intValue();
        int i = 6;
        if (intValue != 5) {
            if (intValue != 7) {
                if (!this.zzb.zzb()) {
                    this.zzb.zzc(null);
                    return;
                } else if (intValue == 1) {
                    this.zzc.zza(map);
                    return;
                } else if (intValue == 3) {
                    new zzbuk(zzcibVar2, map).zza();
                    return;
                } else if (intValue == 4) {
                    new zzbuf(zzcibVar2, map).zza();
                    return;
                } else if (intValue != 5) {
                    if (intValue == 6) {
                        this.zzc.zzb(true);
                        return;
                    } else if (intValue != 7) {
                        com.google.android.gms.ads.internal.util.zze.zzh("Unknown MRAID command called.");
                        return;
                    }
                }
            }
            this.zzd.zzc();
            return;
        }
        String str = (String) map.get("forceOrientation");
        boolean parseBoolean = map.containsKey("allowOrientationChange") ? Boolean.parseBoolean((String) map.get("allowOrientationChange")) : true;
        if (zzcibVar2 == null) {
            com.google.android.gms.ads.internal.util.zze.zzi("AdWebView is null");
            return;
        }
        if ("portrait".equalsIgnoreCase(str)) {
            i = 7;
        } else if (!"landscape".equalsIgnoreCase(str)) {
            i = parseBoolean ? -1 : com.google.android.gms.ads.internal.zzs.zze().zzh();
        }
        zzcibVar2.zzal(i);
    }
}
