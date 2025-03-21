package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzawd extends zzfym<zzawd, zzavv> implements zzfzv {
    private static final zzawd zze;
    private zzfyv<zzavu> zzb = zzaE();

    static {
        zzawd zzawdVar = new zzawd();
        zze = zzawdVar;
        zzfym.zzay(zzawd.class, zzawdVar);
    }

    private zzawd() {
    }

    public static zzavv zza() {
        return zze.zzas();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzd(zzawd zzawdVar, zzavu zzavuVar) {
        zzavuVar.getClass();
        zzfyv<zzavu> zzfyvVar = zzawdVar.zzb;
        if (!zzfyvVar.zza()) {
            zzawdVar.zzb = zzfym.zzaF(zzfyvVar);
        }
        zzawdVar.zzb.add(zzavuVar);
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
                        return zze;
                    }
                    return new zzavv(null);
                }
                return new zzawd();
            }
            return zzaz(zze, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zzb", zzavu.class});
        }
        return (byte) 1;
    }
}
