package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.RequestConfiguration;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzawv extends zzfym<zzawv, zzawr> implements zzfzv {
    private static final zzawv zzi;
    private int zzb;
    private int zze;
    private zzayk zzf;
    private String zzg = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
    private String zzh = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;

    static {
        zzawv zzawvVar = new zzawv();
        zzi = zzawvVar;
        zzfym.zzay(zzawv.class, zzawvVar);
    }

    private zzawv() {
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
                        return zzi;
                    }
                    return new zzawr(null);
                }
                return new zzawv();
            }
            return zzaz(zzi, "\u0001\u0004\u0000\u0001\u0005\b\u0004\u0000\u0000\u0000\u0005ဌ\u0000\u0006ဉ\u0001\u0007ဈ\u0002\bဈ\u0003", new Object[]{"zzb", "zze", zzawu.zzb(), "zzf", "zzg", "zzh"});
        }
        return (byte) 1;
    }
}
