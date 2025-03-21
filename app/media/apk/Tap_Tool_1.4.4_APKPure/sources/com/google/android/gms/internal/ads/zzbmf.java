package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.Map;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzbmf implements zzblp<Object> {
    private final zzbme zza;

    public zzbmf(zzbme zzbmeVar) {
        this.zza = zzbmeVar;
    }

    public static void zzb(zzcib zzcibVar, zzbme zzbmeVar) {
        zzcibVar.zzab("/reward", new zzbmf(zzbmeVar));
    }

    @Override // com.google.android.gms.internal.ads.zzblp
    public final void zza(Object obj, Map<String, String> map) {
        String str = map.get("action");
        if ("grant".equals(str)) {
            zzbyh zzbyhVar = null;
            try {
                int parseInt = Integer.parseInt(map.get("amount"));
                String str2 = map.get("type");
                if (!TextUtils.isEmpty(str2)) {
                    zzbyhVar = new zzbyh(str2, parseInt);
                }
            } catch (NumberFormatException e) {
                com.google.android.gms.ads.internal.util.zze.zzj("Unable to parse reward amount.", e);
            }
            this.zza.zzb(zzbyhVar);
        } else if ("video_start".equals(str)) {
            this.zza.zza();
        } else if ("video_complete".equals(str)) {
            this.zza.zzc();
        }
    }
}
