package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzfqa extends zzfym<zzfqa, zzfpz> implements zzfzv {
    private static final zzfqa zzf;
    private zzfqg zzb;
    private zzfsu zze;

    static {
        zzfqa zzfqaVar = new zzfqa();
        zzf = zzfqaVar;
        zzfym.zzay(zzfqa.class, zzfqaVar);
    }

    private zzfqa() {
    }

    public static zzfqa zzd(zzfxj zzfxjVar, zzfxy zzfxyVar) throws zzfyy {
        return (zzfqa) zzfym.zzaI(zzf, zzfxjVar, zzfxyVar);
    }

    public final zzfqg zza() {
        zzfqg zzfqgVar = this.zzb;
        return zzfqgVar == null ? zzfqg.zze() : zzfqgVar;
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
                    return new zzfpz(null);
                }
                return new zzfqa();
            }
            return zzaz(zzf, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0002\t", new Object[]{"zzb", "zze"});
        }
        return (byte) 1;
    }

    public final zzfsu zzc() {
        zzfsu zzfsuVar = this.zze;
        return zzfsuVar == null ? zzfsu.zze() : zzfsuVar;
    }
}
