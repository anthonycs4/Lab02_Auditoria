package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzfsu extends zzfym<zzfsu, zzfst> implements zzfzv {
    private static final zzfsu zzg;
    private zzfsx zzb;
    private int zze;
    private int zzf;

    static {
        zzfsu zzfsuVar = new zzfsu();
        zzg = zzfsuVar;
        zzfym.zzay(zzfsu.class, zzfsuVar);
    }

    private zzfsu() {
    }

    public static zzfsu zzd(zzfxj zzfxjVar, zzfxy zzfxyVar) throws zzfyy {
        return (zzfsu) zzfym.zzaI(zzg, zzfxjVar, zzfxyVar);
    }

    public static zzfsu zze() {
        return zzg;
    }

    public final zzfsx zza() {
        zzfsx zzfsxVar = this.zzb;
        return zzfsxVar == null ? zzfsx.zzd() : zzfsxVar;
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
                        return zzg;
                    }
                    return new zzfst(null);
                }
                return new zzfsu();
            }
            return zzaz(zzg, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\t\u0002\u000b\u0003\u000b", new Object[]{"zzb", "zze", "zzf"});
        }
        return (byte) 1;
    }

    public final int zzc() {
        return this.zze;
    }
}
