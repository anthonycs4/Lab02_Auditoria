package com.google.android.gms.internal.ads;

import kotlin.text.Typography;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public enum zzdm implements zzfyo {
    ENUM_FALSE(0),
    ENUM_TRUE(1),
    ENUM_FAILURE(2),
    ENUM_UNKNOWN(1000);
    
    private static final zzfyp<zzdm> zze = new zzfyp<zzdm>() { // from class: com.google.android.gms.internal.ads.zzdk
    };
    private final int zzf;

    zzdm(int i) {
        this.zzf = i;
    }

    public static zzdm zzb(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 1000) {
                        return null;
                    }
                    return ENUM_UNKNOWN;
                }
                return ENUM_FAILURE;
            }
            return ENUM_TRUE;
        }
        return ENUM_FALSE;
    }

    public static zzfyq zzc() {
        return zzdl.zza;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "<" + getClass().getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.zzf + " name=" + name() + Typography.greater;
    }

    public final int zza() {
        return this.zzf;
    }
}
