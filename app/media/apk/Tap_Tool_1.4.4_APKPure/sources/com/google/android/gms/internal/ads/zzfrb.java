package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzfrb extends zzfym<zzfrb, zzfra> implements zzfzv {
    private static final zzfrb zzf;
    private int zzb;
    private zzfxj zze = zzfxj.zzb;

    static {
        zzfrb zzfrbVar = new zzfrb();
        zzf = zzfrbVar;
        zzfym.zzay(zzfrb.class, zzfrbVar);
    }

    private zzfrb() {
    }

    public static zzfrb zzd(zzfxj zzfxjVar, zzfxy zzfxyVar) throws zzfyy {
        return (zzfrb) zzfym.zzaI(zzf, zzfxjVar, zzfxyVar);
    }

    public static zzfra zze() {
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
                    return new zzfra(null);
                }
                return new zzfrb();
            }
            return zzaz(zzf, "\u0000\u0002\u0000\u0000\u0001\u0003\u0002\u0000\u0000\u0000\u0001\u000b\u0003\n", new Object[]{"zzb", "zze"});
        }
        return (byte) 1;
    }

    public final zzfxj zzc() {
        return this.zze;
    }
}
