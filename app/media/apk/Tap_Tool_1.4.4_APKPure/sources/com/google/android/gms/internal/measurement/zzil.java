package com.google.android.gms.internal.measurement;

import com.google.android.gms.ads.RequestConfiguration;
/* compiled from: com.google.android.gms:play-services-measurement-base@@18.0.0 */
/* loaded from: classes.dex */
public enum zzil {
    VOID(Void.class, Void.class, null),
    INT(Integer.TYPE, Integer.class, 0),
    LONG(Long.TYPE, Long.class, 0L),
    FLOAT(Float.TYPE, Float.class, Float.valueOf(0.0f)),
    DOUBLE(Double.TYPE, Double.class, Double.valueOf(0.0d)),
    BOOLEAN(Boolean.TYPE, Boolean.class, false),
    STRING(String.class, String.class, RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED),
    BYTE_STRING(zzgp.class, zzgp.class, zzgp.zza),
    ENUM(Integer.TYPE, Integer.class, null),
    MESSAGE(Object.class, Object.class, null);
    
    private final Class<?> zzk;
    private final Class<?> zzl;
    private final Object zzm;

    zzil(Class cls, Class cls2, Object obj) {
        this.zzk = cls;
        this.zzl = cls2;
        this.zzm = obj;
    }

    public final Class<?> zza() {
        return this.zzl;
    }
}
