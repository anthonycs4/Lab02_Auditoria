package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.RequestConfiguration;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzgcl extends zzfym<zzgcl, zzgch> implements zzfzv {
    private static final zzgcl zzh;
    private int zzb;
    private int zze;
    private String zzf = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
    private zzfxj zzg = zzfxj.zzb;

    static {
        zzgcl zzgclVar = new zzgcl();
        zzh = zzgclVar;
        zzfym.zzay(zzgcl.class, zzgclVar);
    }

    private zzgcl() {
    }

    public static zzgch zza() {
        return zzh.zzas();
    }

    public static /* synthetic */ zzgcl zzc() {
        return zzh;
    }

    public static /* synthetic */ void zzd(zzgcl zzgclVar, zzgck zzgckVar) {
        zzgclVar.zze = zzgckVar.zza();
        zzgclVar.zzb |= 1;
    }

    public static /* synthetic */ void zze(zzgcl zzgclVar, String str) {
        zzgclVar.zzb |= 2;
        zzgclVar.zzf = "image/png";
    }

    public static /* synthetic */ void zzf(zzgcl zzgclVar, zzfxj zzfxjVar) {
        zzfxjVar.getClass();
        zzgclVar.zzb |= 4;
        zzgclVar.zzg = zzfxjVar;
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
                        return zzh;
                    }
                    return new zzgch(null);
                }
                return new zzgcl();
            }
            return zzaz(zzh, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဈ\u0001\u0003ည\u0002", new Object[]{"zzb", "zze", zzgck.zzc(), "zzf", "zzg"});
        }
        return (byte) 1;
    }
}
