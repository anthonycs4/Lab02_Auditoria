package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.RequestConfiguration;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzftc extends zzfym<zzftc, zzfsz> implements zzfzv {
    private static final zzftc zzg;
    private String zzb = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
    private zzfxj zze = zzfxj.zzb;
    private int zzf;

    static {
        zzftc zzftcVar = new zzftc();
        zzg = zzftcVar;
        zzfym.zzay(zzftc.class, zzftcVar);
    }

    private zzftc() {
    }

    public static zzfsz zze() {
        return zzg.zzas();
    }

    public static zzftc zzf() {
        return zzg;
    }

    public final String zza() {
        return this.zzb;
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
                        return zzg;
                    }
                    return new zzfsz(null);
                }
                return new zzftc();
            }
            return zzaz(zzg, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\n\u0003\f", new Object[]{"zzb", "zze", "zzf"});
        }
        return (byte) 1;
    }

    public final zzfxj zzc() {
        return this.zze;
    }

    public final zzftb zzd() {
        zzftb zzb = zzftb.zzb(this.zzf);
        return zzb == null ? zzftb.UNRECOGNIZED : zzb;
    }
}
