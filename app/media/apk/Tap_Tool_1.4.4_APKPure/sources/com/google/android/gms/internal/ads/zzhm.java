package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzhm extends zzfym<zzhm, zzhl> implements zzfzv {
    private static final zzhm zzh;
    private int zzb;
    private zzhp zze;
    private zzfxj zzf = zzfxj.zzb;
    private zzfxj zzg = zzfxj.zzb;

    static {
        zzhm zzhmVar = new zzhm();
        zzh = zzhmVar;
        zzfym.zzay(zzhm.class, zzhmVar);
    }

    private zzhm() {
    }

    public static zzhm zze(zzfxj zzfxjVar, zzfxy zzfxyVar) throws zzfyy {
        return (zzhm) zzfym.zzaI(zzh, zzfxjVar, zzfxyVar);
    }

    public final zzhp zza() {
        zzhp zzhpVar = this.zze;
        return zzhpVar == null ? zzhp.zzj() : zzhpVar;
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
                    return new zzhl(null);
                }
                return new zzhm();
            }
            return zzaz(zzh, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ည\u0001\u0003ည\u0002", new Object[]{"zzb", "zze", "zzf", "zzg"});
        }
        return (byte) 1;
    }

    public final zzfxj zzc() {
        return this.zzf;
    }

    public final zzfxj zzd() {
        return this.zzg;
    }
}
