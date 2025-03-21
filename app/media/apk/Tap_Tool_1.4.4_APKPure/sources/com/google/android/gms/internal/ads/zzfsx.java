package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzfsx extends zzfym<zzfsx, zzfsw> implements zzfzv {
    private static final zzfsx zzf;
    private int zzb;
    private int zze;

    static {
        zzfsx zzfsxVar = new zzfsx();
        zzf = zzfsxVar;
        zzfym.zzay(zzfsx.class, zzfsxVar);
    }

    private zzfsx() {
    }

    public static zzfsx zzd() {
        return zzf;
    }

    public final zzfso zza() {
        zzfso zza = zzfso.zza(this.zzb);
        return zza == null ? zzfso.UNRECOGNIZED : zza;
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
                    return new zzfsw(null);
                }
                return new zzfsx();
            }
            return zzaz(zzf, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002\u000b", new Object[]{"zzb", "zze"});
        }
        return (byte) 1;
    }

    public final int zzc() {
        return this.zze;
    }
}
