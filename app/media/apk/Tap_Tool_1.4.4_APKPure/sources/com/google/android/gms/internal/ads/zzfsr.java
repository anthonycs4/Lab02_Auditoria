package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzfsr extends zzfym<zzfsr, zzfsq> implements zzfzv {
    private static final zzfsr zzg;
    private int zzb;
    private zzfsx zze;
    private zzfxj zzf = zzfxj.zzb;

    static {
        zzfsr zzfsrVar = new zzfsr();
        zzg = zzfsrVar;
        zzfym.zzay(zzfsr.class, zzfsrVar);
    }

    private zzfsr() {
    }

    public static zzfsr zze(zzfxj zzfxjVar, zzfxy zzfxyVar) throws zzfyy {
        return (zzfsr) zzfym.zzaI(zzg, zzfxjVar, zzfxyVar);
    }

    public static zzfsq zzf() {
        return zzg.zzas();
    }

    public static zzfsr zzg() {
        return zzg;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzj(zzfsr zzfsrVar, zzfsx zzfsxVar) {
        zzfsxVar.getClass();
        zzfsrVar.zze = zzfsxVar;
    }

    public final int zza() {
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
                        return zzg;
                    }
                    return new zzfsq(null);
                }
                return new zzfsr();
            }
            return zzaz(zzg, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\n", new Object[]{"zzb", "zze", "zzf"});
        }
        return (byte) 1;
    }

    public final zzfsx zzc() {
        zzfsx zzfsxVar = this.zze;
        return zzfsxVar == null ? zzfsx.zzd() : zzfsxVar;
    }

    public final zzfxj zzd() {
        return this.zzf;
    }
}
