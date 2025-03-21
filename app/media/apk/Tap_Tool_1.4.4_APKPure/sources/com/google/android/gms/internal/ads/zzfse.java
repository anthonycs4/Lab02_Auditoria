package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzfse extends zzfym<zzfse, zzfsd> implements zzfzv {
    private static final zzfse zzg;
    private int zzb;
    private zzfsh zze;
    private zzfxj zzf = zzfxj.zzb;

    static {
        zzfse zzfseVar = new zzfse();
        zzg = zzfseVar;
        zzfym.zzay(zzfse.class, zzfseVar);
    }

    private zzfse() {
    }

    public static zzfse zze(zzfxj zzfxjVar, zzfxy zzfxyVar) throws zzfyy {
        return (zzfse) zzfym.zzaI(zzg, zzfxjVar, zzfxyVar);
    }

    public static zzfsd zzf() {
        return zzg.zzas();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzi(zzfse zzfseVar, zzfsh zzfshVar) {
        zzfshVar.getClass();
        zzfseVar.zze = zzfshVar;
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
                    return new zzfsd(null);
                }
                return new zzfse();
            }
            return zzaz(zzg, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\n", new Object[]{"zzb", "zze", "zzf"});
        }
        return (byte) 1;
    }

    public final zzfsh zzc() {
        zzfsh zzfshVar = this.zze;
        return zzfshVar == null ? zzfsh.zzh() : zzfshVar;
    }

    public final zzfxj zzd() {
        return this.zzf;
    }
}
