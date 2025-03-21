package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzaxo extends zzfym<zzaxo, zzaxh> implements zzfzv {
    private static final zzaxo zzg;
    private int zzb;
    private int zze;
    private int zzf;

    static {
        zzaxo zzaxoVar = new zzaxo();
        zzg = zzaxoVar;
        zzfym.zzay(zzaxo.class, zzaxoVar);
    }

    private zzaxo() {
    }

    public static zzaxh zzf() {
        return zzg.zzas();
    }

    public static zzaxo zzg() {
        return zzg;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzi(zzaxo zzaxoVar, zzaxn zzaxnVar) {
        zzaxoVar.zze = zzaxnVar.zza();
        zzaxoVar.zzb |= 1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzj(zzaxo zzaxoVar, zzaxk zzaxkVar) {
        zzaxoVar.zzf = zzaxkVar.zza();
        zzaxoVar.zzb |= 2;
    }

    public final boolean zza() {
        return (this.zzb & 1) != 0;
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
                    return new zzaxh(null);
                }
                return new zzaxo();
            }
            return zzaz(zzg, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဌ\u0001", new Object[]{"zzb", "zze", zzaxn.zzc(), "zzf", zzaxk.zzc()});
        }
        return (byte) 1;
    }

    public final zzaxn zzc() {
        zzaxn zzb = zzaxn.zzb(this.zze);
        return zzb == null ? zzaxn.NETWORKTYPE_UNSPECIFIED : zzb;
    }

    public final boolean zzd() {
        return (this.zzb & 2) != 0;
    }

    public final zzaxk zze() {
        zzaxk zzb = zzaxk.zzb(this.zzf);
        return zzb == null ? zzaxk.CELLULAR_NETWORK_TYPE_UNSPECIFIED : zzb;
    }
}
