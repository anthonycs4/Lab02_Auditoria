package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzgby extends zzfym<zzgby, zzgbx> implements zzfzv {
    private static final zzgby zzh;
    private int zzb;
    private byte zzg = 2;
    private zzfxj zze = zzfxj.zzb;
    private zzfxj zzf = zzfxj.zzb;

    static {
        zzgby zzgbyVar = new zzgby();
        zzh = zzgbyVar;
        zzfym.zzay(zzgby.class, zzgbyVar);
    }

    private zzgby() {
    }

    public static zzgbx zza() {
        return zzh.zzas();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzd(zzgby zzgbyVar, zzfxj zzfxjVar) {
        zzgbyVar.zzb |= 1;
        zzgbyVar.zze = zzfxjVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zze(zzgby zzgbyVar, zzfxj zzfxjVar) {
        zzgbyVar.zzb |= 2;
        zzgbyVar.zzf = zzfxjVar;
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
                            this.zzg = obj == null ? (byte) 0 : (byte) 1;
                            return null;
                        }
                        return zzh;
                    }
                    return new zzgbx(null);
                }
                return new zzgby();
            }
            return zzaz(zzh, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001ᔊ\u0000\u0002ည\u0001", new Object[]{"zzb", "zze", "zzf"});
        }
        return Byte.valueOf(this.zzg);
    }
}
