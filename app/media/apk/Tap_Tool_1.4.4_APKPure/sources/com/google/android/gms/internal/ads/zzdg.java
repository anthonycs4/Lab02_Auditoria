package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzdg extends zzfym<zzdg, zzdf> implements zzfzv {
    private static final zzdg zzi;
    private int zzb;
    private zzfxj zze = zzfxj.zzb;
    private zzfxj zzf = zzfxj.zzb;
    private zzfxj zzg = zzfxj.zzb;
    private zzfxj zzh = zzfxj.zzb;

    static {
        zzdg zzdgVar = new zzdg();
        zzi = zzdgVar;
        zzfym.zzay(zzdg.class, zzdgVar);
    }

    private zzdg() {
    }

    public static zzdg zzf(byte[] bArr, zzfxy zzfxyVar) throws zzfyy {
        return (zzdg) zzfym.zzaK(zzi, bArr, zzfxyVar);
    }

    public static zzdf zzg() {
        return zzi.zzas();
    }

    public static /* synthetic */ zzdg zzh() {
        return zzi;
    }

    public static /* synthetic */ void zzi(zzdg zzdgVar, zzfxj zzfxjVar) {
        zzdgVar.zzb |= 1;
        zzdgVar.zze = zzfxjVar;
    }

    public static /* synthetic */ void zzj(zzdg zzdgVar, zzfxj zzfxjVar) {
        zzdgVar.zzb |= 2;
        zzdgVar.zzf = zzfxjVar;
    }

    public static /* synthetic */ void zzk(zzdg zzdgVar, zzfxj zzfxjVar) {
        zzdgVar.zzb |= 4;
        zzdgVar.zzg = zzfxjVar;
    }

    public static /* synthetic */ void zzl(zzdg zzdgVar, zzfxj zzfxjVar) {
        zzdgVar.zzb |= 8;
        zzdgVar.zzh = zzfxjVar;
    }

    public final zzfxj zza() {
        return this.zze;
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
                    return new zzdf(null);
                }
                return new zzdg();
            }
            return zzaz(zzi, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ည\u0000\u0002ည\u0001\u0003ည\u0002\u0004ည\u0003", new Object[]{"zzb", "zze", "zzf", "zzg", "zzh"});
        }
        return (byte) 1;
    }

    public final zzfxj zzc() {
        return this.zzf;
    }

    public final zzfxj zzd() {
        return this.zzg;
    }

    public final zzfxj zze() {
        return this.zzh;
    }
}
