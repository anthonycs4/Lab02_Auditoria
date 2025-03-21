package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.RequestConfiguration;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzfua extends zzfym<zzfua, zzftz> implements zzfzv {
    private static final zzfua zze;
    private String zzb = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;

    static {
        zzfua zzfuaVar = new zzfua();
        zze = zzfuaVar;
        zzfym.zzay(zzfua.class, zzfuaVar);
    }

    private zzfua() {
    }

    public static zzfua zzc(zzfxj zzfxjVar, zzfxy zzfxyVar) throws zzfyy {
        return (zzfua) zzfym.zzaI(zze, zzfxjVar, zzfxyVar);
    }

    public static zzfua zzd() {
        return zze;
    }

    public final String zza() {
        return this.zzb;
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
                        return zze;
                    }
                    return new zzftz(null);
                }
                return new zzfua();
            }
            return zzaz(zze, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"zzb"});
        }
        return (byte) 1;
    }
}
