package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.RequestConfiguration;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzawm extends zzfym<zzawm, zzawl> implements zzfzv {
    private static final zzawm zzj;
    private int zzb;
    private String zze = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
    private zzfyv<zzawi> zzf = zzaE();
    private int zzg = 1000;
    private int zzh = 1000;
    private int zzi = 1000;

    static {
        zzawm zzawmVar = new zzawm();
        zzj = zzawmVar;
        zzfym.zzay(zzawm.class, zzawmVar);
    }

    private zzawm() {
    }

    public static zzawm zza() {
        return zzj;
    }

    public static /* synthetic */ void zzd(zzawm zzawmVar, String str) {
        str.getClass();
        zzawmVar.zzb |= 1;
        zzawmVar.zze = str;
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
                        return zzj;
                    }
                    return new zzawl(null);
                }
                return new zzawm();
            }
            return zzaz(zzj, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001b\u0003ဌ\u0001\u0004ဌ\u0002\u0005ဌ\u0003", new Object[]{"zzb", "zze", "zzf", zzawi.class, "zzg", zzawy.zzc(), "zzh", zzawy.zzc(), "zzi", zzawy.zzc()});
        }
        return (byte) 1;
    }
}
