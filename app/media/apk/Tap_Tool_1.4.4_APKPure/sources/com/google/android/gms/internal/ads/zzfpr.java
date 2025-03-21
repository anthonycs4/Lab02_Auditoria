package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzfpr extends zzfym<zzfpr, zzfpq> implements zzfzv {
    private static final zzfpr zzf;
    private int zzb;
    private zzfpu zze;

    static {
        zzfpr zzfprVar = new zzfpr();
        zzf = zzfprVar;
        zzfym.zzay(zzfpr.class, zzfprVar);
    }

    private zzfpr() {
    }

    public static zzfpr zzd(zzfxj zzfxjVar, zzfxy zzfxyVar) throws zzfyy {
        return (zzfpr) zzfym.zzaI(zzf, zzfxjVar, zzfxyVar);
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
                    return new zzfpq(null);
                }
                return new zzfpr();
            }
            return zzaz(zzf, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\t", new Object[]{"zzb", "zze"});
        }
        return (byte) 1;
    }

    public final zzfpu zzc() {
        zzfpu zzfpuVar = this.zze;
        return zzfpuVar == null ? zzfpu.zzc() : zzfpuVar;
    }
}
