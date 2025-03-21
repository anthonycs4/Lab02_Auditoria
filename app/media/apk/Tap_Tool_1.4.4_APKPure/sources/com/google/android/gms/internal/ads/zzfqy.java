package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzfqy extends zzfym<zzfqy, zzfqx> implements zzfzv {
    private static final zzfqy zzf;
    private int zzb;
    private int zze;

    static {
        zzfqy zzfqyVar = new zzfqy();
        zzf = zzfqyVar;
        zzfym.zzay(zzfqy.class, zzfqyVar);
    }

    private zzfqy() {
    }

    public static zzfqy zzc(zzfxj zzfxjVar, zzfxy zzfxyVar) throws zzfyy {
        return (zzfqy) zzfym.zzaI(zzf, zzfxjVar, zzfxyVar);
    }

    public final int zza() {
        return this.zzb;
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
                        return zzf;
                    }
                    return new zzfqx(null);
                }
                return new zzfqy();
            }
            return zzaz(zzf, "\u0000\u0002\u0000\u0000\u0002\u0003\u0002\u0000\u0000\u0000\u0002\u000b\u0003\u000b", new Object[]{"zzb", "zze"});
        }
        return (byte) 1;
    }
}
