package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzfqg extends zzfym<zzfqg, zzfqf> implements zzfzv {
    private static final zzfqg zzf;
    private zzfqj zzb;
    private int zze;

    static {
        zzfqg zzfqgVar = new zzfqg();
        zzf = zzfqgVar;
        zzfym.zzay(zzfqg.class, zzfqgVar);
    }

    private zzfqg() {
    }

    public static zzfqg zzd(zzfxj zzfxjVar, zzfxy zzfxyVar) throws zzfyy {
        return (zzfqg) zzfym.zzaI(zzf, zzfxjVar, zzfxyVar);
    }

    public static zzfqg zze() {
        return zzf;
    }

    public final zzfqj zza() {
        zzfqj zzfqjVar = this.zzb;
        return zzfqjVar == null ? zzfqj.zzc() : zzfqjVar;
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
                    return new zzfqf(null);
                }
                return new zzfqg();
            }
            return zzaz(zzf, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0002\u000b", new Object[]{"zzb", "zze"});
        }
        return (byte) 1;
    }

    public final int zzc() {
        return this.zze;
    }
}
