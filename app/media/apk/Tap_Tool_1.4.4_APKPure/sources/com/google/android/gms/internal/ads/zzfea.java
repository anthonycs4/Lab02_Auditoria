package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads-lite@@20.2.0 */
/* loaded from: classes.dex */
public final class zzfea {
    public static boolean zza(CharSequence charSequence, CharSequence charSequence2) {
        int zzb;
        int length = "content-length".length();
        if (charSequence2 == "content-length") {
            return true;
        }
        if (length == charSequence2.length()) {
            for (int i = 0; i < length; i++) {
                char charAt = "content-length".charAt(i);
                char charAt2 = charSequence2.charAt(i);
                if (charAt != charAt2 && ((zzb = zzb(charAt)) >= 26 || zzb != zzb(charAt2))) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    private static int zzb(char c) {
        return (char) ((c | ' ') - 97);
    }
}
