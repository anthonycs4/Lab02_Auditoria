package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzdv extends zzfym<zzdv, zzdu> implements zzfzv {
    private static final zzdv zzi;
    private int zzb;
    private zzfyv<zzfxj> zze = zzaE();
    private zzfxj zzf = zzfxj.zzb;
    private int zzg = 1;
    private int zzh = 1;

    static {
        zzdv zzdvVar = new zzdv();
        zzi = zzdvVar;
        zzfym.zzay(zzdv.class, zzdvVar);
    }

    private zzdv() {
    }

    public static zzdu zza() {
        return zzi.zzas();
    }

    public static /* synthetic */ void zzd(zzdv zzdvVar, zzfxj zzfxjVar) {
        zzfyv<zzfxj> zzfyvVar = zzdvVar.zze;
        if (!zzfyvVar.zza()) {
            zzdvVar.zze = zzfym.zzaF(zzfyvVar);
        }
        zzdvVar.zze.add(zzfxjVar);
    }

    public static /* synthetic */ void zze(zzdv zzdvVar, zzfxj zzfxjVar) {
        zzdvVar.zzb |= 1;
        zzdvVar.zzf = zzfxjVar;
    }

    public static /* synthetic */ void zzf(zzdv zzdvVar, zzdj zzdjVar) {
        zzdvVar.zzh = zzdjVar.zza();
        zzdvVar.zzb |= 4;
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
                        return zzi;
                    }
                    return new zzdu(null);
                }
                return new zzdv();
            }
            return zzaz(zzi, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001\u001c\u0002ည\u0000\u0003ဌ\u0001\u0004ဌ\u0002", new Object[]{"zzb", "zze", "zzf", "zzg", zzdp.zzb(), "zzh", zzdj.zzc()});
        }
        return (byte) 1;
    }
}
