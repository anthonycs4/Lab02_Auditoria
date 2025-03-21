package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.RequestConfiguration;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzawq extends zzfym<zzawq, zzawp> implements zzfzv {
    private static final zzawq zzm;
    private int zzb;
    private zzayi zzf;
    private int zzg;
    private zzayk zzh;
    private int zzi;
    private String zze = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
    private int zzj = 1000;
    private int zzk = 1000;
    private int zzl = 1000;

    static {
        zzawq zzawqVar = new zzawq();
        zzm = zzawqVar;
        zzfym.zzay(zzawq.class, zzawqVar);
    }

    private zzawq() {
    }

    public static zzawq zza() {
        return zzm;
    }

    public static /* synthetic */ void zzd(zzawq zzawqVar, String str) {
        zzawqVar.zzb |= 1;
        zzawqVar.zze = str;
    }

    public static /* synthetic */ void zze(zzawq zzawqVar, zzayk zzaykVar) {
        zzaykVar.getClass();
        zzawqVar.zzh = zzaykVar;
        zzawqVar.zzb |= 8;
    }

    /* JADX INFO: Access modifiers changed from: protected */
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
                        return zzm;
                    }
                    return new zzawp(null);
                }
                return new zzawq();
            }
            return zzaz(zzm, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဉ\u0001\u0003င\u0002\u0004ဉ\u0003\u0005င\u0004\u0006ဌ\u0005\u0007ဌ\u0006\bဌ\u0007", new Object[]{"zzb", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", zzawy.zzc(), "zzk", zzawy.zzc(), "zzl", zzawy.zzc()});
        }
        return (byte) 1;
    }
}
