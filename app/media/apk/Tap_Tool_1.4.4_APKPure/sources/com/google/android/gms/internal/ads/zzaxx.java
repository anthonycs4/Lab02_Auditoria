package com.google.android.gms.internal.ads;

import kotlin.text.Typography;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public enum zzaxx implements zzfyo {
    UNSPECIFIED(0),
    CONNECTING(1),
    CONNECTED(2),
    DISCONNECTING(3),
    DISCONNECTED(4),
    SUSPENDED(5);
    
    private static final zzfyp<zzaxx> zzg = new zzfyp<zzaxx>() { // from class: com.google.android.gms.internal.ads.zzaxv
    };
    private final int zzh;

    zzaxx(int i) {
        this.zzh = i;
    }

    public static zzaxx zzb(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            if (i != 5) {
                                return null;
                            }
                            return SUSPENDED;
                        }
                        return DISCONNECTED;
                    }
                    return DISCONNECTING;
                }
                return CONNECTED;
            }
            return CONNECTING;
        }
        return UNSPECIFIED;
    }

    public static zzfyq zzc() {
        return zzaxw.zza;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "<" + getClass().getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.zzh + " name=" + name() + Typography.greater;
    }

    public final int zza() {
        return this.zzh;
    }
}
