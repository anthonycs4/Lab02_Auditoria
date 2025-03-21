package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzgcc extends zzfym<zzgcc, zzgbz> implements zzfzv {
    private static final zzgcc zzk;
    private int zzb;
    private zzgcb zze;
    private int zzi;
    private byte zzj = 2;
    private zzfyv<zzgby> zzf = zzaE();
    private zzfxj zzg = zzfxj.zzb;
    private zzfxj zzh = zzfxj.zzb;

    static {
        zzgcc zzgccVar = new zzgcc();
        zzk = zzgccVar;
        zzfym.zzay(zzgcc.class, zzgccVar);
    }

    private zzgcc() {
    }

    public static zzgbz zza() {
        return zzk.zzas();
    }

    public static /* synthetic */ void zzd(zzgcc zzgccVar, zzgby zzgbyVar) {
        zzgbyVar.getClass();
        zzfyv<zzgby> zzfyvVar = zzgccVar.zzf;
        if (!zzfyvVar.zza()) {
            zzgccVar.zzf = zzfym.zzaF(zzfyvVar);
        }
        zzgccVar.zzf.add(zzgbyVar);
    }

    @Override // com.google.android.gms.internal.ads.zzfym
    public final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 != 2) {
                if (i2 != 3) {
                    if (i2 != 4) {
                        if (i2 != 5) {
                            this.zzj = obj == null ? (byte) 0 : (byte) 1;
                            return null;
                        }
                        return zzk;
                    }
                    return new zzgbz(null);
                }
                return new zzgcc();
            }
            return zzaz(zzk, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0001\u0001ဉ\u0000\u0002Л\u0003ည\u0001\u0004ည\u0002\u0005င\u0003", new Object[]{"zzb", "zze", "zzf", zzgby.class, "zzg", "zzh", "zzi"});
        }
        return Byte.valueOf(this.zzj);
    }
}
