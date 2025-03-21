package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzayk extends zzfym<zzayk, zzayj> implements zzfzv {
    private static final zzayk zzh;
    private int zzb;
    private int zze;
    private int zzf;
    private int zzg;

    static {
        zzayk zzaykVar = new zzayk();
        zzh = zzaykVar;
        zzfym.zzay(zzayk.class, zzaykVar);
    }

    private zzayk() {
    }

    public static zzayj zza() {
        return zzh.zzas();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzd(zzayk zzaykVar, int i) {
        zzaykVar.zzb |= 1;
        zzaykVar.zze = i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zze(zzayk zzaykVar, int i) {
        zzaykVar.zzb |= 2;
        zzaykVar.zzf = i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzf(zzayk zzaykVar, int i) {
        zzaykVar.zzb |= 4;
        zzaykVar.zzg = i;
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
                    return new zzayj(null);
                }
                return new zzayk();
            }
            return zzaz(zzh, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\u0003င\u0002", new Object[]{"zzb", "zze", "zzf", "zzg"});
        }
        return (byte) 1;
    }
}
