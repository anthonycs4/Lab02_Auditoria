package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzfto extends zzfym<zzfto, zzftn> implements zzfzv {
    private static final zzfto zzh;
    private zzftc zzb;
    private int zze;
    private int zzf;
    private int zzg;

    static {
        zzfto zzftoVar = new zzfto();
        zzh = zzftoVar;
        zzfym.zzay(zzfto.class, zzftoVar);
    }

    private zzfto() {
    }

    public final boolean zza() {
        return this.zzb != null;
    }

    @Override // com.google.android.gms.internal.ads.zzfym
    protected final Object zzb(int i, Object obj, Object obj2) {
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
                    return new zzftn(null);
                }
                return new zzfto();
            }
            return zzaz(zzh, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\t\u0002\f\u0003\u000b\u0004\f", new Object[]{"zzb", "zze", "zzf", "zzg"});
        }
        return (byte) 1;
    }

    public final zzftc zzc() {
        zzftc zzftcVar = this.zzb;
        return zzftcVar == null ? zzftc.zzf() : zzftcVar;
    }

    public final zzfte zzd() {
        zzfte zzb = zzfte.zzb(this.zze);
        return zzb == null ? zzfte.UNRECOGNIZED : zzb;
    }

    public final int zze() {
        return this.zzf;
    }

    public final zzfui zzf() {
        zzfui zzb = zzfui.zzb(this.zzg);
        return zzb == null ? zzfui.UNRECOGNIZED : zzb;
    }
}
