package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzfrq extends zzfym<zzfrq, zzfrp> implements zzfzv {
    private static final zzfrq zzb;

    static {
        zzfrq zzfrqVar = new zzfrq();
        zzb = zzfrqVar;
        zzfym.zzay(zzfrq.class, zzfrqVar);
    }

    private zzfrq() {
    }

    public static zzfrq zza(zzfxj zzfxjVar, zzfxy zzfxyVar) throws zzfyy {
        return (zzfrq) zzfym.zzaI(zzb, zzfxjVar, zzfxyVar);
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
                        return zzb;
                    }
                    return new zzfrp(null);
                }
                return new zzfrq();
            }
            return zzaz(zzb, "\u0000\u0000", null);
        }
        return (byte) 1;
    }
}
