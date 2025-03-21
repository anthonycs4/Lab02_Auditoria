package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;
import androidx.core.os.EnvironmentCompat;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
@Deprecated
/* loaded from: classes.dex */
public final class zzdpj {
    private final ConcurrentHashMap<String, String> zza;
    private final zzccc zzb;

    public zzdpj(zzdps zzdpsVar, zzccc zzcccVar) {
        this.zza = new ConcurrentHashMap<>(zzdpsVar.zzb);
        this.zzb = zzcccVar;
    }

    public final void zza(zzete zzeteVar) {
        if (zzeteVar.zzb.zza.size() > 0) {
            switch (zzeteVar.zzb.zza.get(0).zzb) {
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
                    this.zza.put("as", true != this.zzb.zzi() ? "0" : "1");
                    break;
                default:
                    this.zza.put("ad_format", EnvironmentCompat.MEDIA_UNKNOWN);
                    break;
            }
        }
        if (TextUtils.isEmpty(zzeteVar.zzb.zzb.zzb)) {
            return;
        }
        this.zza.put("gqi", zzeteVar.zzb.zzb.zzb);
    }

    public final void zzb(Bundle bundle) {
        if (bundle.containsKey("cnt")) {
            this.zza.put("network_coarse", Integer.toString(bundle.getInt("cnt")));
        }
        if (bundle.containsKey("gnt")) {
            this.zza.put("network_fine", Integer.toString(bundle.getInt("gnt")));
        }
    }

    public final Map<String, String> zzc() {
        return this.zza;
    }
}
