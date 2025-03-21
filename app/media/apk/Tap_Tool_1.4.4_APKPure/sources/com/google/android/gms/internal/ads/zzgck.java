package com.google.android.gms.internal.ads;

import kotlin.text.Typography;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public enum zzgck implements zzfyo {
    TYPE_UNKNOWN(0),
    TYPE_CREATIVE(1);
    
    private static final zzfyp<zzgck> zzc = new zzfyp<zzgck>() { // from class: com.google.android.gms.internal.ads.zzgci
    };
    private final int zzd;

    zzgck(int i) {
        this.zzd = i;
    }

    public static zzgck zzb(int i) {
        if (i != 0) {
            if (i != 1) {
                return null;
            }
            return TYPE_CREATIVE;
        }
        return TYPE_UNKNOWN;
    }

    public static zzfyq zzc() {
        return zzgcj.zza;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "<" + getClass().getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.zzd + " name=" + name() + Typography.greater;
    }

    public final int zza() {
        return this.zzd;
    }
}
