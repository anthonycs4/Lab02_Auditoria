package com.google.android.gms.internal.ads;

import kotlin.text.Typography;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public enum zzaxk implements zzfyo {
    CELLULAR_NETWORK_TYPE_UNSPECIFIED(0),
    TWO_G(1),
    THREE_G(2),
    LTE(4);
    
    private static final zzfyp<zzaxk> zze = new zzfyp<zzaxk>() { // from class: com.google.android.gms.internal.ads.zzaxi
    };
    private final int zzf;

    zzaxk(int i) {
        this.zzf = i;
    }

    public static zzaxk zzb(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 4) {
                        return null;
                    }
                    return LTE;
                }
                return THREE_G;
            }
            return TWO_G;
        }
        return CELLULAR_NETWORK_TYPE_UNSPECIFIED;
    }

    public static zzfyq zzc() {
        return zzaxj.zza;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "<" + getClass().getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.zzf + " name=" + name() + Typography.greater;
    }

    public final int zza() {
        return this.zzf;
    }
}
