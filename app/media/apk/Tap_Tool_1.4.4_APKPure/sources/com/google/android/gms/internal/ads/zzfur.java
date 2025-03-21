package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzfur extends zzfym<zzfur, zzfuq> implements zzfzv {
    private static final zzfur zze;
    private int zzb;

    static {
        zzfur zzfurVar = new zzfur();
        zze = zzfurVar;
        zzfym.zzay(zzfur.class, zzfurVar);
    }

    private zzfur() {
    }

    public static zzfur zza(zzfxj zzfxjVar, zzfxy zzfxyVar) throws zzfyy {
        return (zzfur) zzfym.zzaI(zze, zzfxjVar, zzfxyVar);
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
                        return zze;
                    }
                    return new zzfuq(null);
                }
                return new zzfur();
            }
            return zzaz(zze, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b", new Object[]{"zzb"});
        }
        return (byte) 1;
    }
}
