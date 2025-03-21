package com.google.android.gms.internal.ads;

import kotlin.text.Typography;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public enum zzfcf implements zzfyo {
    EVENT_TYPE_UNKNOWN(0),
    BLOCKED_IMPRESSION(1);
    
    private static final zzfyp<zzfcf> zzc = new zzfyp<zzfcf>() { // from class: com.google.android.gms.internal.ads.zzfcd
    };
    private final int zzd;

    zzfcf(int i) {
        this.zzd = i;
    }

    public static zzfcf zzb(int i) {
        if (i != 0) {
            if (i != 1) {
                return null;
            }
            return BLOCKED_IMPRESSION;
        }
        return EVENT_TYPE_UNKNOWN;
    }

    public static zzfyq zzc() {
        return zzfce.zza;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "<" + getClass().getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.zzd + " name=" + name() + Typography.greater;
    }

    public final int zza() {
        return this.zzd;
    }
}
