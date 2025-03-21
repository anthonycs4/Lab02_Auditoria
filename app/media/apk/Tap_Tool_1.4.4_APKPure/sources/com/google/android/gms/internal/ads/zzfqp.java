package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzfqp extends zzfym<zzfqp, zzfqo> implements zzfzv {
    private static final zzfqp zzf;
    private zzfqs zzb;
    private int zze;

    static {
        zzfqp zzfqpVar = new zzfqp();
        zzf = zzfqpVar;
        zzfym.zzay(zzfqp.class, zzfqpVar);
    }

    private zzfqp() {
    }

    public static zzfqp zzd(zzfxj zzfxjVar, zzfxy zzfxyVar) throws zzfyy {
        return (zzfqp) zzfym.zzaI(zzf, zzfxjVar, zzfxyVar);
    }

    public final zzfqs zza() {
        zzfqs zzfqsVar = this.zzb;
        return zzfqsVar == null ? zzfqs.zzc() : zzfqsVar;
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
                        return zzf;
                    }
                    return new zzfqo(null);
                }
                return new zzfqp();
            }
            return zzaz(zzf, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0002\u000b", new Object[]{"zzb", "zze"});
        }
        return (byte) 1;
    }

    public final int zzc() {
        return this.zze;
    }
}
