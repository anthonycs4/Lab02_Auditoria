package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzazh extends zzfym<zzazh, zzazg> implements zzfzv {
    private static final zzazh zzg;
    private int zzb;
    private boolean zze;
    private int zzf;

    static {
        zzazh zzazhVar = new zzazh();
        zzg = zzazhVar;
        zzfym.zzay(zzazh.class, zzazhVar);
    }

    private zzazh() {
    }

    public static zzazg zzc() {
        return zzg.zzas();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zze(zzazh zzazhVar, boolean z) {
        zzazhVar.zzb |= 1;
        zzazhVar.zze = z;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzf(zzazh zzazhVar, int i) {
        zzazhVar.zzb |= 2;
        zzazhVar.zzf = i;
    }

    public final boolean zza() {
        return this.zze;
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
                        return zzg;
                    }
                    return new zzazg(null);
                }
                return new zzazh();
            }
            return zzaz(zzg, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဇ\u0000\u0002င\u0001", new Object[]{"zzb", "zze", "zzf"});
        }
        return (byte) 1;
    }
}
