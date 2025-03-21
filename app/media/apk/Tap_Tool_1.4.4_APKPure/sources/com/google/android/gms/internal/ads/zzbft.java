package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Build;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Future;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzbft {
    private final String zza = zzbgy.zzb.zze();
    private final Map<String, String> zzb;
    private final Context zzc;
    private final String zzd;

    public zzbft(Context context, String str) {
        String packageName;
        this.zzc = context;
        this.zzd = str;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.zzb = linkedHashMap;
        linkedHashMap.put("s", "gmob_sdk");
        linkedHashMap.put("v", "3");
        linkedHashMap.put("os", Build.VERSION.RELEASE);
        linkedHashMap.put("api_v", Build.VERSION.SDK);
        com.google.android.gms.ads.internal.zzs.zzc();
        linkedHashMap.put("device", com.google.android.gms.ads.internal.util.zzr.zzx());
        if (context.getApplicationContext() != null) {
            packageName = context.getApplicationContext().getPackageName();
        } else {
            packageName = context.getPackageName();
        }
        linkedHashMap.put("app", packageName);
        com.google.android.gms.ads.internal.zzs.zzc();
        linkedHashMap.put("is_lite_sdk", true != com.google.android.gms.ads.internal.util.zzr.zzH(context) ? "0" : "1");
        Future<zzbxk> zza = com.google.android.gms.ads.internal.zzs.zzn().zza(context);
        try {
            linkedHashMap.put("network_coarse", Integer.toString(zza.get().zzk));
            linkedHashMap.put("network_fine", Integer.toString(zza.get().zzl));
        } catch (Exception e) {
            com.google.android.gms.ads.internal.zzs.zzg().zzg(e, "CsiConfiguration.CsiConfiguration");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final String zza() {
        return this.zza;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Context zzb() {
        return this.zzc;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final String zzc() {
        return this.zzd;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Map<String, String> zzd() {
        return this.zzb;
    }
}
