package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.RequestConfiguration;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzayg extends zzfym<zzayg, zzayf> implements zzfzv {
    private static final zzayg zzh;
    private int zzb;
    private String zze = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
    private int zzf;
    private zzayi zzg;

    static {
        zzayg zzaygVar = new zzayg();
        zzh = zzaygVar;
        zzfym.zzay(zzayg.class, zzaygVar);
    }

    private zzayg() {
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
                    return new zzayf(null);
                }
                return new zzayg();
            }
            return zzaz(zzh, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဌ\u0001\u0003ဉ\u0002", new Object[]{"zzb", "zze", "zzf", zzawy.zzc(), "zzg"});
        }
        return (byte) 1;
    }
}
