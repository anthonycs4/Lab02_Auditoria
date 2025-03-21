package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.RequestConfiguration;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzaxc extends zzfym<zzaxc, zzaxb> implements zzfzv {
    private static final zzaxc zzi;
    private int zzb;
    private int zzf;
    private zzayi zzh;
    private String zze = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
    private zzfyr zzg = zzaB();

    static {
        zzaxc zzaxcVar = new zzaxc();
        zzi = zzaxcVar;
        zzfym.zzay(zzaxc.class, zzaxcVar);
    }

    private zzaxc() {
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
                    return new zzaxb(null);
                }
                return new zzaxc();
            }
            return zzaz(zzi, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဌ\u0001\u0003\u0016\u0004ဉ\u0002", new Object[]{"zzb", "zze", "zzf", zzawy.zzc(), "zzg", "zzh"});
        }
        return (byte) 1;
    }
}
