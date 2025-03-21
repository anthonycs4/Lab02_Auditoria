package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzftu extends zzfym<zzftu, zzftr> implements zzfzv {
    private static final zzftu zzf;
    private int zzb;
    private zzfyv<zzftt> zze = zzaE();

    static {
        zzftu zzftuVar = new zzftu();
        zzf = zzftuVar;
        zzfym.zzay(zzftu.class, zzftuVar);
    }

    private zzftu() {
    }

    public static zzftr zza() {
        return zzf.zzas();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zze(zzftu zzftuVar, zzftt zzfttVar) {
        zzfttVar.getClass();
        zzfyv<zzftt> zzfyvVar = zzftuVar.zze;
        if (!zzfyvVar.zza()) {
            zzftuVar.zze = zzfym.zzaF(zzfyvVar);
        }
        zzftuVar.zze.add(zzfttVar);
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
                    return new zzftr(null);
                }
                return new zzftu();
            }
            return zzaz(zzf, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u000b\u0002\u001b", new Object[]{"zzb", "zze", zzftt.class});
        }
        return (byte) 1;
    }
}
