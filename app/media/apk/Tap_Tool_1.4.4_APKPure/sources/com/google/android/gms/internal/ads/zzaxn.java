package com.google.android.gms.internal.ads;

import kotlin.text.Typography;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public enum zzaxn implements zzfyo {
    NETWORKTYPE_UNSPECIFIED(0),
    CELL(1),
    WIFI(2);
    
    private static final zzfyp<zzaxn> zzd = new zzfyp<zzaxn>() { // from class: com.google.android.gms.internal.ads.zzaxl
    };
    private final int zze;

    zzaxn(int i) {
        this.zze = i;
    }

    public static zzaxn zzb(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    return null;
                }
                return WIFI;
            }
            return CELL;
        }
        return NETWORKTYPE_UNSPECIFIED;
    }

    public static zzfyq zzc() {
        return zzaxm.zza;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "<" + getClass().getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.zze + " name=" + name() + Typography.greater;
    }

    public final int zza() {
        return this.zze;
    }
}
