package com.google.android.gms.internal.ads;

import kotlin.text.Typography;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public enum zzawu implements zzfyo {
    PLATFORM_UNSPECIFIED(0),
    IOS(1),
    ANDROID(2);
    
    private static final zzfyp<zzawu> zzd = new zzfyp<zzawu>() { // from class: com.google.android.gms.internal.ads.zzaws
    };
    private final int zze;

    zzawu(int i) {
        this.zze = i;
    }

    public static zzawu zza(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    return null;
                }
                return ANDROID;
            }
            return IOS;
        }
        return PLATFORM_UNSPECIFIED;
    }

    public static zzfyq zzb() {
        return zzawt.zza;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "<" + getClass().getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.zze + " name=" + name() + Typography.greater;
    }
}
