package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.Map;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzbkt implements zzblp<zzcib> {
    @Override // com.google.android.gms.internal.ads.zzblp
    public final /* bridge */ /* synthetic */ void zza(zzcib zzcibVar, Map map) {
        zzcib zzcibVar2 = zzcibVar;
        String str = (String) map.get("action");
        if ("tick".equals(str)) {
            String str2 = (String) map.get("label");
            String str3 = (String) map.get("start_label");
            String str4 = (String) map.get("timestamp");
            if (TextUtils.isEmpty(str2)) {
                com.google.android.gms.ads.internal.util.zze.zzi("No label given for CSI tick.");
            } else if (TextUtils.isEmpty(str4)) {
                com.google.android.gms.ads.internal.util.zze.zzi("No timestamp given for CSI tick.");
            } else {
                try {
                    long elapsedRealtime = com.google.android.gms.ads.internal.zzs.zzj().elapsedRealtime() + (Long.parseLong(str4) - com.google.android.gms.ads.internal.zzs.zzj().currentTimeMillis());
                    if (true == TextUtils.isEmpty(str3)) {
                        str3 = "native:view_load";
                    }
                    zzcibVar2.zzq().zzb(str2, str3, elapsedRealtime);
                } catch (NumberFormatException e) {
                    com.google.android.gms.ads.internal.util.zze.zzj("Malformed timestamp for CSI tick.", e);
                }
            }
        } else if ("experiment".equals(str)) {
            String str5 = (String) map.get(AppMeasurementSdk.ConditionalUserProperty.VALUE);
            if (TextUtils.isEmpty(str5)) {
                com.google.android.gms.ads.internal.util.zze.zzi("No value given for CSI experiment.");
            } else {
                zzcibVar2.zzq().zzc().zzd("e", str5);
            }
        } else if ("extra".equals(str)) {
            String str6 = (String) map.get(AppMeasurementSdk.ConditionalUserProperty.NAME);
            String str7 = (String) map.get(AppMeasurementSdk.ConditionalUserProperty.VALUE);
            if (TextUtils.isEmpty(str7)) {
                com.google.android.gms.ads.internal.util.zze.zzi("No value given for CSI extra.");
            } else if (TextUtils.isEmpty(str6)) {
                com.google.android.gms.ads.internal.util.zze.zzi("No name given for CSI extra.");
            } else {
                zzcibVar2.zzq().zzc().zzd(str6, str7);
            }
        }
    }
}
