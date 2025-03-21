package com.google.android.gms.ads.internal;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.internal.ads.zzbba;
import com.google.android.gms.internal.ads.zzbfq;
import com.google.android.gms.internal.ads.zzbpu;
import com.google.android.gms.internal.ads.zzbqb;
import com.google.android.gms.internal.ads.zzcbu;
import com.google.android.gms.internal.ads.zzcct;
import com.google.android.gms.internal.ads.zzccz;
import com.google.android.gms.internal.ads.zzcdc;
import com.google.android.gms.internal.ads.zzfks;
import com.google.android.gms.internal.ads.zzfla;
import javax.annotation.ParametersAreNonnullByDefault;
import org.json.JSONObject;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
@ParametersAreNonnullByDefault
/* loaded from: classes.dex */
public final class zze {
    private Context zza;
    private long zzb = 0;

    public final void zza(Context context, zzcct zzcctVar, String str, Runnable runnable) {
        zzc(context, zzcctVar, true, null, str, null, runnable);
    }

    public final void zzb(Context context, zzcct zzcctVar, String str, zzcbu zzcbuVar) {
        zzc(context, zzcctVar, false, zzcbuVar, zzcbuVar != null ? zzcbuVar.zze() : null, str, null);
    }

    final void zzc(Context context, zzcct zzcctVar, boolean z, zzcbu zzcbuVar, String str, String str2, Runnable runnable) {
        if (zzs.zzj().elapsedRealtime() - this.zzb < 5000) {
            com.google.android.gms.ads.internal.util.zze.zzi("Not retrying to fetch app settings");
            return;
        }
        this.zzb = zzs.zzj().elapsedRealtime();
        if (zzcbuVar != null) {
            long zzb = zzcbuVar.zzb();
            if (zzs.zzj().currentTimeMillis() - zzb <= ((Long) zzbba.zzc().zzb(zzbfq.zzco)).longValue() && zzcbuVar.zzc()) {
                return;
            }
        }
        if (context == null) {
            com.google.android.gms.ads.internal.util.zze.zzi("Context not provided to fetch application settings");
        } else if (!TextUtils.isEmpty(str) || !TextUtils.isEmpty(str2)) {
            Context applicationContext = context.getApplicationContext();
            if (applicationContext == null) {
                applicationContext = context;
            }
            this.zza = applicationContext;
            zzbpu zza = zzs.zzp().zzb(this.zza, zzcctVar).zza("google.afma.config.fetchAppSettings", zzbqb.zza, zzbqb.zza);
            try {
                JSONObject jSONObject = new JSONObject();
                if (!TextUtils.isEmpty(str)) {
                    jSONObject.put("app_id", str);
                } else if (!TextUtils.isEmpty(str2)) {
                    jSONObject.put("ad_unit_id", str2);
                }
                jSONObject.put("is_init", z);
                jSONObject.put("pn", context.getPackageName());
                zzfla zzb2 = zza.zzb(jSONObject);
                zzfla zzi = zzfks.zzi(zzb2, zzd.zza, zzccz.zzf);
                if (runnable != null) {
                    zzb2.zze(runnable, zzccz.zzf);
                }
                zzcdc.zza(zzi, "ConfigLoader.maybeFetchNewAppSettings");
            } catch (Exception e) {
                com.google.android.gms.ads.internal.util.zze.zzg("Error requesting application settings", e);
            }
        } else {
            com.google.android.gms.ads.internal.util.zze.zzi("App settings could not be fetched. Required parameters missing");
        }
    }
}
