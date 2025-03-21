package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzaqz {
    public static boolean zza(String str) {
        return "audio".equals(zzc(str));
    }

    public static boolean zzb(String str) {
        return "video".equals(zzc(str));
    }

    private static String zzc(String str) {
        if (str == null) {
            return null;
        }
        int indexOf = str.indexOf(47);
        if (indexOf == -1) {
            throw new IllegalArgumentException(str.length() != 0 ? "Invalid mime type: ".concat(str) : new String("Invalid mime type: "));
        }
        return str.substring(0, indexOf);
    }
}
