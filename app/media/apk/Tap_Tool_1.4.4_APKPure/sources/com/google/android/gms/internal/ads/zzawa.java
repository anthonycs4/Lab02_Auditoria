package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzawa extends zzfym<zzawa, zzavz> implements zzfzv {
    private static final zzawa zzg;
    private int zzb;
    private boolean zze;
    private int zzf;

    static {
        zzawa zzawaVar = new zzawa();
        zzg = zzawaVar;
        zzfym.zzay(zzawa.class, zzawaVar);
    }

    private zzawa() {
    }

    public static zzavz zza() {
        return zzg.zzas();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzd(zzawa zzawaVar, boolean z) {
        zzawaVar.zzb |= 1;
        zzawaVar.zze = z;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zze(zzawa zzawaVar, int i) {
        zzawaVar.zzb |= 2;
        zzawaVar.zzf = i;
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
                        return zzg;
                    }
                    return new zzavz(null);
                }
                return new zzawa();
            }
            return zzaz(zzg, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဋ\u0001", new Object[]{"zzb", "zze", "zzf"});
        }
        return (byte) 1;
    }
}
