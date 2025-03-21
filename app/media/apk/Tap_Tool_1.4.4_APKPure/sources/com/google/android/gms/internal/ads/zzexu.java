package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;
import androidx.core.os.EnvironmentCompat;
import java.util.HashMap;
import java.util.Map;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzexu {
    private final HashMap<String, String> zza = new HashMap<>();
    private final zzeya zzb = new zzeya(com.google.android.gms.ads.internal.zzs.zzj());

    private zzexu() {
    }

    public static zzexu zza(String str) {
        zzexu zzexuVar = new zzexu();
        zzexuVar.zza.put("action", str);
        return zzexuVar;
    }

    public static zzexu zzb(String str) {
        zzexu zzexuVar = new zzexu();
        zzexuVar.zza.put("request_id", str);
        return zzexuVar;
    }

    public final zzexu zzc(String str, String str2) {
        this.zza.put(str, str2);
        return this;
    }

    public final zzexu zzd(String str) {
        this.zzb.zza(str);
        return this;
    }

    public final zzexu zze(String str, String str2) {
        this.zzb.zzb(str, str2);
        return this;
    }

    public final zzexu zzf(Bundle bundle) {
        if (bundle.containsKey("cnt")) {
            this.zza.put("network_coarse", Integer.toString(bundle.getInt("cnt")));
        }
        if (bundle.containsKey("gnt")) {
            this.zza.put("network_fine", Integer.toString(bundle.getInt("gnt")));
        }
        return this;
    }

    public final zzexu zzg(zzete zzeteVar, zzccc zzcccVar) {
        zzetd zzetdVar = zzeteVar.zzb;
        zzh(zzetdVar.zzb);
        if (!zzetdVar.zza.isEmpty()) {
            switch (zzetdVar.zza.get(0).zzb) {
                case 1:
                    this.zza.put("ad_format", "banner");
                    break;
                case 2:
                    this.zza.put("ad_format", "interstitial");
                    break;
                case 3:
                    this.zza.put("ad_format", "native_express");
                    break;
                case 4:
                    this.zza.put("ad_format", "native_advanced");
                    break;
                case 5:
                    this.zza.put("ad_format", "rewarded");
                    break;
                case 6:
                    this.zza.put("ad_format", "app_open_ad");
                    if (zzcccVar != null) {
                        this.zza.put("as", true != zzcccVar.zzi() ? "0" : "1");
                        break;
                    }
                    break;
                default:
                    this.zza.put("ad_format", EnvironmentCompat.MEDIA_UNKNOWN);
                    break;
            }
        }
        return this;
    }

    public final zzexu zzh(zzesv zzesvVar) {
        if (!TextUtils.isEmpty(zzesvVar.zzb)) {
            this.zza.put("gqi", zzesvVar.zzb);
        }
        return this;
    }

    public final zzexu zzi(zzess zzessVar) {
        this.zza.put("aai", zzessVar.zzv);
        return this;
    }

    public final Map<String, String> zzj() {
        HashMap hashMap = new HashMap(this.zza);
        for (zzexz zzexzVar : this.zzb.zzc()) {
            hashMap.put(zzexzVar.zza, zzexzVar.zzb);
        }
        return hashMap;
    }
}
