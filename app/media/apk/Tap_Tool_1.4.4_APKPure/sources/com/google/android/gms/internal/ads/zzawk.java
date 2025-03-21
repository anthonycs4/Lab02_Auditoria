package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.RequestConfiguration;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzawk extends zzfym<zzawk, zzawj> implements zzfzv {
    private static final zzawk zzh;
    private int zzb;
    private String zze = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
    private zzfyv<zzawi> zzf = zzaE();
    private int zzg;

    static {
        zzawk zzawkVar = new zzawk();
        zzh = zzawkVar;
        zzfym.zzay(zzawk.class, zzawkVar);
    }

    private zzawk() {
    }

    @Override // com.google.android.gms.internal.ads.zzfym
    public final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 != 2) {
                if (i2 != 3) {
                    if (i2 != 4) {
                        if (i2 != 5) {
                            return null;
                        }
                        return zzh;
                    }
                    return new zzawj(null);
                }
                return new zzawk();
            }
            return zzaz(zzh, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001b\u0003ဌ\u0001", new Object[]{"zzb", "zze", "zzf", zzawi.class, "zzg", zzawy.zzc()});
        }
        return (byte) 1;
    }
}
