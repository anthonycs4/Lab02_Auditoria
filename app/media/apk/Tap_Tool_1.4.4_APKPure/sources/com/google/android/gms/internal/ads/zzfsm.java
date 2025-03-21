package com.google.android.gms.internal.ads;

import kotlin.text.Typography;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public enum zzfsm implements zzfyo {
    UNKNOWN_CURVE(0),
    NIST_P256(2),
    NIST_P384(3),
    NIST_P521(4),
    CURVE25519(5),
    UNRECOGNIZED(-1);
    
    private static final zzfyp<zzfsm> zzg = new zzfyp<zzfsm>() { // from class: com.google.android.gms.internal.ads.zzfsl
    };
    private final int zzh;

    zzfsm(int i) {
        this.zzh = i;
    }

    public static zzfsm zza(int i) {
        if (i != 0) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        if (i != 5) {
                            return null;
                        }
                        return CURVE25519;
                    }
                    return NIST_P521;
                }
                return NIST_P384;
            }
            return NIST_P256;
        }
        return UNKNOWN_CURVE;
    }

    @Override // java.lang.Enum
    public final String toString() {
        StringBuilder sb = new StringBuilder("<");
        sb.append(getClass().getName());
        sb.append('@');
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        zzfsm zzfsmVar = UNRECOGNIZED;
        if (this != zzfsmVar) {
            sb.append(" number=");
            if (this != zzfsmVar) {
                sb.append(this.zzh);
            } else {
                throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
            }
        }
        sb.append(" name=");
        sb.append(name());
        sb.append(Typography.greater);
        return sb.toString();
    }
}
