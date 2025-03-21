package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzfpo extends zzfym<zzfpo, zzfpn> implements zzfzv {
    private static final zzfpo zzg;
    private int zzb;
    private zzfxj zze = zzfxj.zzb;
    private zzfpu zzf;

    static {
        zzfpo zzfpoVar = new zzfpo();
        zzg = zzfpoVar;
        zzfym.zzay(zzfpo.class, zzfpoVar);
    }

    private zzfpo() {
    }

    public static zzfpo zze(zzfxj zzfxjVar, zzfxy zzfxyVar) throws zzfyy {
        return (zzfpo) zzfym.zzaI(zzg, zzfxjVar, zzfxyVar);
    }

    public static zzfpn zzf() {
        return zzg.zzas();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzj(zzfpo zzfpoVar, zzfpu zzfpuVar) {
        zzfpuVar.getClass();
        zzfpoVar.zzf = zzfpuVar;
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
                    return new zzfpn(null);
                }
                return new zzfpo();
            }
            return zzaz(zzg, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\n\u0003\t", new Object[]{"zzb", "zze", "zzf"});
        }
        return (byte) 1;
    }

    public final zzfxj zzc() {
        return this.zze;
    }

    public final zzfpu zzd() {
        zzfpu zzfpuVar = this.zzf;
        return zzfpuVar == null ? zzfpu.zzc() : zzfpuVar;
    }
}
