package com.google.android.gms.common.util;

import android.text.TextUtils;
import java.util.regex.Pattern;
/* compiled from: com.google.android.gms:play-services-basement@@17.6.0 */
/* loaded from: classes.dex */
public class Strings {
    private static final Pattern zza = Pattern.compile("\\$\\{(.*?)\\}");

    private Strings() {
    }

    public static String emptyToNull(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return str;
    }

    public static boolean isEmptyOrWhitespace(String str) {
        return str == null || str.trim().isEmpty();
    }
}
