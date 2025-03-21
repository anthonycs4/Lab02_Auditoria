package com.google.android.gms.internal.ads;

import kotlin.text.Typography;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public enum zzca implements zzfyo {
    UNKNOWN(0),
    ENABLED(1),
    DISABLED(2);
    
    private static final zzfyp<zzca> zzd = new zzfyp<zzca>() { // from class: com.google.android.gms.internal.ads.zzby
    };
    private final int zze;

    zzca(int i) {
        this.zze = i;
    }

    public static zzca zzb(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    return null;
                }
                return DISABLED;
            }
            return ENABLED;
        }
        return UNKNOWN;
    }

    public static zzfyq zzc() {
        return zzbz.zza;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "<" + getClass().getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.zze + " name=" + name() + Typography.greater;
    }

    public final int zza() {
        return this.zze;
    }
}
