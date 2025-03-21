package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzawc extends zzfym<zzawc, zzawb> implements zzfzv {
    private static final zzawc zzh;
    private int zzb;
    private boolean zze;
    private boolean zzf;
    private int zzg;

    static {
        zzawc zzawcVar = new zzawc();
        zzh = zzawcVar;
        zzfym.zzay(zzawc.class, zzawcVar);
    }

    private zzawc() {
    }

    public static zzawb zza() {
        return zzh.zzas();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzd(zzawc zzawcVar, boolean z) {
        zzawcVar.zzb |= 1;
        zzawcVar.zze = z;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zze(zzawc zzawcVar, boolean z) {
        zzawcVar.zzb |= 2;
        zzawcVar.zzf = z;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzf(zzawc zzawcVar, int i) {
        zzawcVar.zzb |= 4;
        zzawcVar.zzg = i;
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
                    return new zzawb(null);
                }
                return new zzawc();
            }
            return zzaz(zzh, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001\u0003ဋ\u0002", new Object[]{"zzb", "zze", "zzf", "zzg"});
        }
        return (byte) 1;
    }
}
