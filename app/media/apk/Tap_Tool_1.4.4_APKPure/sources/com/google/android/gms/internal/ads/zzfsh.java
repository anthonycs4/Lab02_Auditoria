package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzfsh extends zzfym<zzfsh, zzfsg> implements zzfzv {
    private static final zzfsh zzh;
    private int zzb;
    private zzfsb zze;
    private zzfxj zzf = zzfxj.zzb;
    private zzfxj zzg = zzfxj.zzb;

    static {
        zzfsh zzfshVar = new zzfsh();
        zzh = zzfshVar;
        zzfym.zzay(zzfsh.class, zzfshVar);
    }

    private zzfsh() {
    }

    public static zzfsh zzf(zzfxj zzfxjVar, zzfxy zzfxyVar) throws zzfyy {
        return (zzfsh) zzfym.zzaI(zzh, zzfxjVar, zzfxyVar);
    }

    public static zzfsg zzg() {
        return zzh.zzas();
    }

    public static zzfsh zzh() {
        return zzh;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzk(zzfsh zzfshVar, zzfsb zzfsbVar) {
        zzfsbVar.getClass();
        zzfshVar.zze = zzfsbVar;
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
                        return zzh;
                    }
                    return new zzfsg(null);
                }
                return new zzfsh();
            }
            return zzaz(zzh, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\n\u0004\n", new Object[]{"zzb", "zze", "zzf", "zzg"});
        }
        return (byte) 1;
    }

    public final zzfsb zzc() {
        zzfsb zzfsbVar = this.zze;
        return zzfsbVar == null ? zzfsb.zze() : zzfsbVar;
    }

    public final zzfxj zzd() {
        return this.zzf;
    }

    public final zzfxj zze() {
        return this.zzg;
    }
}
