package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzfrv extends zzfym<zzfrv, zzfru> implements zzfzv {
    private static final zzfrv zze;
    private zzfth zzb;

    static {
        zzfrv zzfrvVar = new zzfrv();
        zze = zzfrvVar;
        zzfym.zzay(zzfrv.class, zzfrvVar);
    }

    private zzfrv() {
    }

    public static zzfrv zzc() {
        return zze;
    }

    public final zzfth zza() {
        zzfth zzfthVar = this.zzb;
        return zzfthVar == null ? zzfth.zzd() : zzfthVar;
    }

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
                        return zze;
                    }
                    return new zzfru(null);
                }
                return new zzfrv();
            }
            return zzaz(zze, "\u0000\u0001\u0000\u0000\u0002\u0002\u0001\u0000\u0000\u0000\u0002\t", new Object[]{"zzb"});
        }
        return (byte) 1;
    }
}
