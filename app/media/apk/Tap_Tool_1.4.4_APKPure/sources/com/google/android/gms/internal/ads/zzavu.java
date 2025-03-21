package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzavu extends zzfym<zzavu, zzavt> implements zzfzv {
    private static final zzavu zzh;
    private int zzb;
    private int zze;
    private zzawa zzf;
    private zzawc zzg;

    static {
        zzavu zzavuVar = new zzavu();
        zzh = zzavuVar;
        zzfym.zzay(zzavu.class, zzavuVar);
    }

    private zzavu() {
    }

    public static zzavt zza() {
        return zzh.zzas();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzd(zzavu zzavuVar, zzavy zzavyVar) {
        zzavuVar.zze = zzavyVar.zza();
        zzavuVar.zzb |= 1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zze(zzavu zzavuVar, zzawa zzawaVar) {
        zzawaVar.getClass();
        zzavuVar.zzf = zzawaVar;
        zzavuVar.zzb |= 2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzf(zzavu zzavuVar, zzawc zzawcVar) {
        zzawcVar.getClass();
        zzavuVar.zzg = zzawcVar;
        zzavuVar.zzb |= 4;
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
                        return zzh;
                    }
                    return new zzavt(null);
                }
                return new zzavu();
            }
            return zzaz(zzh, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဉ\u0001\u0003ဉ\u0002", new Object[]{"zzb", "zze", zzavy.zzc(), "zzf", "zzg"});
        }
        return (byte) 1;
    }
}
