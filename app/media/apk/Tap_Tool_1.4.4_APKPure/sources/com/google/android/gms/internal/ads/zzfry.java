package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzfry extends zzfym<zzfry, zzfrx> implements zzfzv {
    private static final zzfry zze;
    private zzfsb zzb;

    static {
        zzfry zzfryVar = new zzfry();
        zze = zzfryVar;
        zzfym.zzay(zzfry.class, zzfryVar);
    }

    private zzfry() {
    }

    public static zzfry zzc(zzfxj zzfxjVar, zzfxy zzfxyVar) throws zzfyy {
        return (zzfry) zzfym.zzaI(zze, zzfxjVar, zzfxyVar);
    }

    public final zzfsb zza() {
        zzfsb zzfsbVar = this.zzb;
        return zzfsbVar == null ? zzfsb.zze() : zzfsbVar;
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
                    return new zzfrx(null);
                }
                return new zzfry();
            }
            return zzaz(zze, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\t", new Object[]{"zzb"});
        }
        return (byte) 1;
    }
}
