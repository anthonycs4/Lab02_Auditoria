package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import java.util.List;
import java.util.Map;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzeyd {
    private final Context zza;
    private final String zzb;
    private final String zzc;

    public zzeyd(Context context, zzcct zzcctVar) {
        this.zza = context;
        this.zzb = context.getPackageName();
        this.zzc = zzcctVar.zza;
    }

    public final void zza(Map<String, String> map) {
        map.put("s", "gmob_sdk");
        map.put("v", "3");
        map.put("os", Build.VERSION.RELEASE);
        map.put("api_v", Build.VERSION.SDK);
        com.google.android.gms.ads.internal.zzs.zzc();
        map.put("device", com.google.android.gms.ads.internal.util.zzr.zzx());
        map.put("app", this.zzb);
        com.google.android.gms.ads.internal.zzs.zzc();
        map.put("is_lite_sdk", true != com.google.android.gms.ads.internal.util.zzr.zzH(this.zza) ? "0" : "1");
        List<String> zzd = zzbfq.zzd();
        if (((Boolean) zzbba.zzc().zzb(zzbfq.zzeW)).booleanValue()) {
            zzd.addAll(com.google.android.gms.ads.internal.zzs.zzg().zzl().zzn().zzh());
        }
        map.put("e", TextUtils.join(",", zzd));
        map.put("sdkVersion", this.zzc);
    }
}
