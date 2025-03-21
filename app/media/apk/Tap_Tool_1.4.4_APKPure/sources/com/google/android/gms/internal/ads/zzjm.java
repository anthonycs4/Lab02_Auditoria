package com.google.android.gms.internal.ads;

import android.os.Build;
import java.util.HashSet;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzjm {
    @Deprecated
    public static final String zza;
    private static final HashSet<String> zzb;
    private static final String zzc;

    static {
        String str = Build.VERSION.RELEASE;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 57);
        sb.append("ExoPlayerLib/2.13.2 (Linux; Android ");
        sb.append(str);
        sb.append(") ExoPlayerLib/2.13.2");
        zza = sb.toString();
        zzb = new HashSet<>();
        zzc = "goog.exo.core";
    }

    public static synchronized String zza() {
        String str;
        synchronized (zzjm.class) {
            str = zzc;
        }
        return str;
    }
}
