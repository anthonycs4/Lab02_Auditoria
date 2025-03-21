package com.google.android.gms.internal.ads;

import kotlin.text.Typography;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public enum zzcj implements zzfyo {
    ENUM_SIGNAL_SOURCE_UNKNOWN(0),
    ENUM_SIGNAL_SOURCE_DISABLE(1),
    ENUM_SIGNAL_SOURCE_ADSHIELD(2),
    ENUM_SIGNAL_SOURCE_GASS(3),
    ENUM_SIGNAL_SOURCE_CALLER_PROVIDED(4);
    
    private static final zzfyp<zzcj> zzf = new zzfyp<zzcj>() { // from class: com.google.android.gms.internal.ads.zzch
    };
    private final int zzg;

    zzcj(int i) {
        this.zzg = i;
    }

    public static zzcj zza(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            return null;
                        }
                        return ENUM_SIGNAL_SOURCE_CALLER_PROVIDED;
                    }
                    return ENUM_SIGNAL_SOURCE_GASS;
                }
                return ENUM_SIGNAL_SOURCE_ADSHIELD;
            }
            return ENUM_SIGNAL_SOURCE_DISABLE;
        }
        return ENUM_SIGNAL_SOURCE_UNKNOWN;
    }

    public static zzfyq zzb() {
        return zzci.zza;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "<" + getClass().getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.zzg + " name=" + name() + Typography.greater;
    }
}
