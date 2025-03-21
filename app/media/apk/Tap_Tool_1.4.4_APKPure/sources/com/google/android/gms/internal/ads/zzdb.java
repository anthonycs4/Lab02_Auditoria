package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzdb extends zzfym<zzdb, zzda> implements zzfzv {
    private static final zzdb zzk;
    private int zzb;
    private long zze = -1;
    private long zzf = -1;
    private long zzg = -1;
    private long zzh = -1;
    private long zzi = -1;
    private long zzj = -1;

    static {
        zzdb zzdbVar = new zzdb();
        zzk = zzdbVar;
        zzfym.zzay(zzdb.class, zzdbVar);
    }

    private zzdb() {
    }

    public static zzda zza() {
        return zzk.zzas();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzd(zzdb zzdbVar, long j) {
        zzdbVar.zzb |= 4;
        zzdbVar.zzg = j;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zze(zzdb zzdbVar, long j) {
        zzdbVar.zzb |= 8;
        zzdbVar.zzh = j;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzf(zzdb zzdbVar, long j) {
        zzdbVar.zzb |= 16;
        zzdbVar.zzi = j;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzg(zzdb zzdbVar, long j) {
        zzdbVar.zzb |= 32;
        zzdbVar.zzj = j;
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
                        return zzk;
                    }
                    return new zzda(null);
                }
                return new zzdb();
            }
            return zzaz(zzk, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဂ\u0001\u0003ဂ\u0002\u0004ဂ\u0003\u0005ဂ\u0004\u0006ဂ\u0005", new Object[]{"zzb", "zze", "zzf", "zzg", "zzh", "zzi", "zzj"});
        }
        return (byte) 1;
    }
}
