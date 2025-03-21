package com.google.android.gms.internal.ads;

import kotlin.text.Typography;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public enum zzgbt implements zzfyo {
    SAFE(0),
    DANGEROUS(1),
    UNKNOWN(2),
    POTENTIALLY_UNWANTED(3),
    DANGEROUS_HOST(4);
    
    private static final zzfyp<zzgbt> zzf = new zzfyp<zzgbt>() { // from class: com.google.android.gms.internal.ads.zzgbr
    };
    private final int zzg;

    zzgbt(int i) {
        this.zzg = i;
    }

    public static zzgbt zza(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            return null;
                        }
                        return DANGEROUS_HOST;
                    }
                    return POTENTIALLY_UNWANTED;
                }
                return UNKNOWN;
            }
            return DANGEROUS;
        }
        return SAFE;
    }

    public static zzfyq zzb() {
        return zzgbs.zza;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "<" + getClass().getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.zzg + " name=" + name() + Typography.greater;
    }
}
