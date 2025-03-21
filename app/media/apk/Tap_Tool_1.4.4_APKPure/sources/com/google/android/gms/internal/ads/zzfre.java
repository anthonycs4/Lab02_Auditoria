package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzfre extends zzfym<zzfre, zzfrd> implements zzfzv {
    private static final zzfre zzf;
    private int zzb;
    private int zze;

    static {
        zzfre zzfreVar = new zzfre();
        zzf = zzfreVar;
        zzfym.zzay(zzfre.class, zzfreVar);
    }

    private zzfre() {
    }

    public static zzfre zzc(zzfxj zzfxjVar, zzfxy zzfxyVar) throws zzfyy {
        return (zzfre) zzfym.zzaI(zzf, zzfxjVar, zzfxyVar);
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
                    return new zzfrd(null);
                }
                return new zzfre();
            }
            return zzaz(zzf, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\u000b", new Object[]{"zze", "zzb"});
        }
        return (byte) 1;
    }
}
