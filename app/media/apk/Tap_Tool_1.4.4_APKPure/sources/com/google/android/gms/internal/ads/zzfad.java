package com.google.android.gms.internal.ads;

import android.text.TextUtils;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzfad {
    public static void zza(Object obj, String str) {
        if (obj == null) {
            throw new IllegalArgumentException(str);
        }
    }

    public static void zzb(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException(str2);
        }
    }

    public static void zzc(zzezd zzezdVar, zzeza zzezaVar, zzezc zzezcVar) {
        if (zzezdVar == zzezd.NONE) {
            throw new IllegalArgumentException("Impression owner is none");
        }
        if (zzezaVar != zzeza.DEFINED_BY_JAVASCRIPT || zzezdVar != zzezd.NATIVE) {
            if (zzezcVar == zzezc.DEFINED_BY_JAVASCRIPT && zzezdVar == zzezd.NATIVE) {
                throw new IllegalArgumentException("ImpressionType/CreativeType can only be defined as DEFINED_BY_JAVASCRIPT if Impression Owner is JavaScript");
            }
            return;
        }
        throw new IllegalArgumentException("ImpressionType/CreativeType can only be defined as DEFINED_BY_JAVASCRIPT if Impression Owner is JavaScript");
    }
}
