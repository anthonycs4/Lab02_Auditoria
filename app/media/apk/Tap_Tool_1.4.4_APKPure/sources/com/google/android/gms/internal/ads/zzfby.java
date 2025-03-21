package com.google.android.gms.internal.ads;

import kotlin.text.Typography;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public enum zzfby implements zzfyo {
    BLOCKED_REASON_UNKNOWN(1),
    BLOCKED_REASON_BACKGROUND(2);
    
    private static final zzfyp<zzfby> zzc = new zzfyp<zzfby>() { // from class: com.google.android.gms.internal.ads.zzfbw
    };
    private final int zzd;

    zzfby(int i) {
        this.zzd = i;
    }

    public static zzfby zzb(int i) {
        if (i != 1) {
            if (i != 2) {
                return null;
            }
            return BLOCKED_REASON_BACKGROUND;
        }
        return BLOCKED_REASON_UNKNOWN;
    }

    public static zzfyq zzc() {
        return zzfbx.zza;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "<" + getClass().getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.zzd + " name=" + name() + Typography.greater;
    }

    public final int zza() {
        return this.zzd;
    }
}
