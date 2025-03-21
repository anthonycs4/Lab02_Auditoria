package com.google.android.gms.internal.measurement;

import com.google.android.gms.ads.RequestConfiguration;
/* compiled from: com.google.android.gms:play-services-measurement-base@@18.0.0 */
/* loaded from: classes.dex */
public enum zzln {
    INT(0),
    LONG(0L),
    FLOAT(Float.valueOf(0.0f)),
    DOUBLE(Double.valueOf(0.0d)),
    BOOLEAN(false),
    STRING(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED),
    BYTE_STRING(zzgp.zza),
    ENUM(null),
    MESSAGE(null);
    
    private final Object zzj;

    zzln(Object obj) {
        this.zzj = obj;
    }
}
