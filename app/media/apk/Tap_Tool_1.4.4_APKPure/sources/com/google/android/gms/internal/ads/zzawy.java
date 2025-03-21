package com.google.android.gms.internal.ads;

import kotlin.text.Typography;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public enum zzawy implements zzfyo {
    ENUM_FALSE(0),
    ENUM_TRUE(1),
    ENUM_UNKNOWN(1000);
    
    private static final zzfyp<zzawy> zzd = new zzfyp<zzawy>() { // from class: com.google.android.gms.internal.ads.zzaww
    };
    private final int zze;

    zzawy(int i) {
        this.zze = i;
    }

    public static zzawy zzb(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 1000) {
                    return null;
                }
                return ENUM_UNKNOWN;
            }
            return ENUM_TRUE;
        }
        return ENUM_FALSE;
    }

    public static zzfyq zzc() {
        return zzawx.zza;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "<" + getClass().getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.zze + " name=" + name() + Typography.greater;
    }

    public final int zza() {
        return this.zze;
    }
}
