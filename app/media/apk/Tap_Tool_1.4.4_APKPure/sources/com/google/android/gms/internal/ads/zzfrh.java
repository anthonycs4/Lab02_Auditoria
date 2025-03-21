package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzfrh extends zzfym<zzfrh, zzfrg> implements zzfzv {
    private static final zzfrh zzf;
    private int zzb;
    private zzfxj zze = zzfxj.zzb;

    static {
        zzfrh zzfrhVar = new zzfrh();
        zzf = zzfrhVar;
        zzfym.zzay(zzfrh.class, zzfrhVar);
    }

    private zzfrh() {
    }

    public static zzfrh zzd(zzfxj zzfxjVar, zzfxy zzfxyVar) throws zzfyy {
        return (zzfrh) zzfym.zzaI(zzf, zzfxjVar, zzfxyVar);
    }

    public static zzfrg zze() {
        return zzf.zzas();
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
                    return new zzfrg(null);
                }
                return new zzfrh();
            }
            return zzaz(zzf, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\n", new Object[]{"zzb", "zze"});
        }
        return (byte) 1;
    }

    public final zzfxj zzc() {
        return this.zze;
    }
}
