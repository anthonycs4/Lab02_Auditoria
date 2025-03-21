package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzftx extends zzfym<zzftx, zzftw> implements zzfzv {
    private static final zzftx zzf;
    private int zzb;
    private zzfua zze;

    static {
        zzftx zzftxVar = new zzftx();
        zzf = zzftxVar;
        zzfym.zzay(zzftx.class, zzftxVar);
    }

    private zzftx() {
    }

    public static zzftx zzd(zzfxj zzfxjVar, zzfxy zzfxyVar) throws zzfyy {
        return (zzftx) zzfym.zzaI(zzf, zzfxjVar, zzfxyVar);
    }

    public static zzftw zze() {
        return zzf.zzas();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzh(zzftx zzftxVar, zzfua zzfuaVar) {
        zzfuaVar.getClass();
        zzftxVar.zze = zzfuaVar;
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
                        return zzf;
                    }
                    return new zzftw(null);
                }
                return new zzftx();
            }
            return zzaz(zzf, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\t", new Object[]{"zzb", "zze"});
        }
        return (byte) 1;
    }

    public final zzfua zzc() {
        zzfua zzfuaVar = this.zze;
        return zzfuaVar == null ? zzfua.zzd() : zzfuaVar;
    }
}
