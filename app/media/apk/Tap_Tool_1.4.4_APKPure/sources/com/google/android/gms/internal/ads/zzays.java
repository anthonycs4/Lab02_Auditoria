package com.google.android.gms.internal.ads;

import kotlin.text.Typography;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public enum zzays implements zzfyo {
    VIDEO_ERROR_CODE_UNSPECIFIED(0),
    OPENGL_RENDERING_FAILED(1),
    CACHE_LOAD_FAILED(2),
    ANDROID_TARGET_API_TOO_LOW(3);
    
    private static final zzfyp<zzays> zze = new zzfyp<zzays>() { // from class: com.google.android.gms.internal.ads.zzayq
    };
    private final int zzf;

    zzays(int i) {
        this.zzf = i;
    }

    public static zzays zza(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        return null;
                    }
                    return ANDROID_TARGET_API_TOO_LOW;
                }
                return CACHE_LOAD_FAILED;
            }
            return OPENGL_RENDERING_FAILED;
        }
        return VIDEO_ERROR_CODE_UNSPECIFIED;
    }

    public static zzfyq zzb() {
        return zzayr.zza;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "<" + getClass().getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.zzf + " name=" + name() + Typography.greater;
    }
}
