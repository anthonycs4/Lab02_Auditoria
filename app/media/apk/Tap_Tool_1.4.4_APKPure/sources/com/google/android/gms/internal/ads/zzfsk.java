package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzfsk extends zzfym<zzfsk, zzfsj> implements zzfzv {
    private static final zzfsk zzg;
    private int zzb;
    private int zze;
    private zzfxj zzf = zzfxj.zzb;

    static {
        zzfsk zzfskVar = new zzfsk();
        zzg = zzfskVar;
        zzfym.zzay(zzfsk.class, zzfskVar);
    }

    private zzfsk() {
    }

    public static zzfsk zze() {
        return zzg;
    }

    public final zzfsm zza() {
        zzfsm zza = zzfsm.zza(this.zzb);
        return zza == null ? zzfsm.UNRECOGNIZED : zza;
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
                    return new zzfsj(null);
                }
                return new zzfsk();
            }
            return zzaz(zzg, "\u0000\u0003\u0000\u0000\u0001\u000b\u0003\u0000\u0000\u0000\u0001\f\u0002\f\u000b\n", new Object[]{"zzb", "zze", "zzf"});
        }
        return (byte) 1;
    }

    public final zzfso zzc() {
        zzfso zza = zzfso.zza(this.zze);
        return zza == null ? zzfso.UNRECOGNIZED : zza;
    }

    public final zzfxj zzd() {
        return this.zzf;
    }
}
