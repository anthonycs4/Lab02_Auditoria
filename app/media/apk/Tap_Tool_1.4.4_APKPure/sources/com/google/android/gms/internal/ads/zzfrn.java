package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzfrn extends zzfym<zzfrn, zzfrm> implements zzfzv {
    private static final zzfrn zzf;
    private int zzb;
    private zzfxj zze = zzfxj.zzb;

    static {
        zzfrn zzfrnVar = new zzfrn();
        zzf = zzfrnVar;
        zzfym.zzay(zzfrn.class, zzfrnVar);
    }

    private zzfrn() {
    }

    public static zzfrn zzd(zzfxj zzfxjVar, zzfxy zzfxyVar) throws zzfyy {
        return (zzfrn) zzfym.zzaI(zzf, zzfxjVar, zzfxyVar);
    }

    public static zzfrm zze() {
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
                    return new zzfrm(null);
                }
                return new zzfrn();
            }
            return zzaz(zzf, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\n", new Object[]{"zzb", "zze"});
        }
        return (byte) 1;
    }

    public final zzfxj zzc() {
        return this.zze;
    }
}
