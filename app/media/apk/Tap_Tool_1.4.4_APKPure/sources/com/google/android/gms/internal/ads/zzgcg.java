package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzgcg extends zzfym<zzgcg, zzgcd> implements zzfzv {
    private static final zzgcg zzl;
    private int zzb;
    private zzgcf zze;
    private int zzi;
    private byte zzk = 2;
    private zzfyv<zzgby> zzf = zzaE();
    private zzfxj zzg = zzfxj.zzb;
    private zzfxj zzh = zzfxj.zzb;
    private zzfxj zzj = zzfxj.zzb;

    static {
        zzgcg zzgcgVar = new zzgcg();
        zzl = zzgcgVar;
        zzfym.zzay(zzgcg.class, zzgcgVar);
    }

    private zzgcg() {
    }

    @Override // com.google.android.gms.internal.ads.zzfym
    public final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 != 2) {
                if (i2 != 3) {
                    if (i2 != 4) {
                        if (i2 != 5) {
                            this.zzk = obj == null ? (byte) 0 : (byte) 1;
                            return null;
                        }
                        return zzl;
                    }
                    return new zzgcd(null);
                }
                return new zzgcg();
            }
            return zzaz(zzl, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0001\u0001ဉ\u0000\u0002Л\u0003ည\u0001\u0004ည\u0002\u0005င\u0003\u0006ည\u0004", new Object[]{"zzb", "zze", "zzf", zzgby.class, "zzg", "zzh", "zzi", "zzj"});
        }
        return Byte.valueOf(this.zzk);
    }
}
