package com.google.android.gms.internal.ads;

import android.content.Context;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzeua {
    public static void zza(int i, Throwable th, String str) {
        StringBuilder sb = new StringBuilder(31);
        sb.append("Ad failed to load : ");
        sb.append(i);
        com.google.android.gms.ads.internal.util.zze.zzh(sb.toString());
        com.google.android.gms.ads.internal.util.zze.zzb(str, th);
        if (i == 3) {
            return;
        }
        com.google.android.gms.ads.internal.zzs.zzg().zzh(th, str);
    }

    public static void zzb(Context context, boolean z) {
        if (z) {
            com.google.android.gms.ads.internal.util.zze.zzh("This request is sent from a test device.");
            return;
        }
        zzbay.zza();
        String zzt = zzccg.zzt(context);
        StringBuilder sb = new StringBuilder(String.valueOf(zzt).length() + 102);
        sb.append("Use RequestConfiguration.Builder().setTestDeviceIds(Arrays.asList(\"");
        sb.append(zzt);
        sb.append("\")) to get test ads on this device.");
        com.google.android.gms.ads.internal.util.zze.zzh(sb.toString());
    }
}
