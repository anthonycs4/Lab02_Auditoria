package com.google.android.gms.internal.ads;

import kotlin.text.Typography;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public enum zzavy implements zzfyo {
    UNSPECIFIED(0),
    IN_MEMORY(1);
    
    private static final zzfyp<zzavy> zzc = new zzfyp<zzavy>() { // from class: com.google.android.gms.internal.ads.zzavw
    };
    private final int zzd;

    zzavy(int i) {
        this.zzd = i;
    }

    public static zzavy zzb(int i) {
        if (i != 0) {
            if (i != 1) {
                return null;
            }
            return IN_MEMORY;
        }
        return UNSPECIFIED;
    }

    public static zzfyq zzc() {
        return zzavx.zza;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "<" + getClass().getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.zzd + " name=" + name() + Typography.greater;
    }

    public final int zza() {
        return this.zzd;
    }
}
