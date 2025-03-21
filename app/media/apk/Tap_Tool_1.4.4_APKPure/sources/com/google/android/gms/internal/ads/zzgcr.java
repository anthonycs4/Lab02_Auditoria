package com.google.android.gms.internal.ads;

import kotlin.text.Typography;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public enum zzgcr implements zzfyo {
    AD_RESOURCE_UNKNOWN(0),
    AD_RESOURCE_CREATIVE(1),
    AD_RESOURCE_POST_CLICK(2),
    AD_RESOURCE_AUTO_CLICK_DESTINATION(3);
    
    private static final zzfyp<zzgcr> zze = new zzfyp<zzgcr>() { // from class: com.google.android.gms.internal.ads.zzgcp
    };
    private final int zzf;

    zzgcr(int i) {
        this.zzf = i;
    }

    public static zzgcr zzb(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        return null;
                    }
                    return AD_RESOURCE_AUTO_CLICK_DESTINATION;
                }
                return AD_RESOURCE_POST_CLICK;
            }
            return AD_RESOURCE_CREATIVE;
        }
        return AD_RESOURCE_UNKNOWN;
    }

    public static zzfyq zzc() {
        return zzgcq.zza;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "<" + getClass().getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.zzf + " name=" + name() + Typography.greater;
    }

    public final int zza() {
        return this.zzf;
    }
}
