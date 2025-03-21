package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzfsb extends zzfym<zzfsb, zzfsa> implements zzfzv {
    private static final zzfsb zzg;
    private zzfsk zzb;
    private zzfrv zze;
    private int zzf;

    static {
        zzfsb zzfsbVar = new zzfsb();
        zzg = zzfsbVar;
        zzfym.zzay(zzfsb.class, zzfsbVar);
    }

    private zzfsb() {
    }

    public static zzfsb zze() {
        return zzg;
    }

    public final zzfsk zza() {
        zzfsk zzfskVar = this.zzb;
        return zzfskVar == null ? zzfsk.zze() : zzfskVar;
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
                        return zzg;
                    }
                    return new zzfsa(null);
                }
                return new zzfsb();
            }
            return zzaz(zzg, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\t\u0002\t\u0003\f", new Object[]{"zzb", "zze", "zzf"});
        }
        return (byte) 1;
    }

    public final zzfrv zzc() {
        zzfrv zzfrvVar = this.zze;
        return zzfrvVar == null ? zzfrv.zzc() : zzfrvVar;
    }

    public final zzfrs zzd() {
        zzfrs zza = zzfrs.zza(this.zzf);
        return zza == null ? zzfrs.UNRECOGNIZED : zza;
    }
}
