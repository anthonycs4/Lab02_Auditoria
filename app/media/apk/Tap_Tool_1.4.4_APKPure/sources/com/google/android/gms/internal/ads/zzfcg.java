package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.RequestConfiguration;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzfcg extends zzfym<zzfcg, zzfcc> implements zzfzv {
    private static final zzfcg zzi;
    private int zzb;
    private int zze;
    private String zzf = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
    private String zzg = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
    private zzfca zzh;

    static {
        zzfcg zzfcgVar = new zzfcg();
        zzi = zzfcgVar;
        zzfym.zzay(zzfcg.class, zzfcgVar);
    }

    private zzfcg() {
    }

    public static zzfcc zza() {
        return zzi.zzas();
    }

    public static /* synthetic */ zzfcg zzc() {
        return zzi;
    }

    public static /* synthetic */ void zzd(zzfcg zzfcgVar, zzfcf zzfcfVar) {
        zzfcgVar.zze = zzfcfVar.zza();
        zzfcgVar.zzb |= 1;
    }

    public static /* synthetic */ void zze(zzfcg zzfcgVar, String str) {
        str.getClass();
        zzfcgVar.zzb |= 2;
        zzfcgVar.zzf = str;
    }

    public static /* synthetic */ void zzf(zzfcg zzfcgVar, zzfca zzfcaVar) {
        zzfcaVar.getClass();
        zzfcgVar.zzh = zzfcaVar;
        zzfcgVar.zzb |= 8;
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
                    return new zzfcc(null);
                }
                return new zzfcg();
            }
            return zzaz(zzi, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဉ\u0003", new Object[]{"zzb", "zze", zzfcf.zzc(), "zzf", "zzg", "zzh"});
        }
        return (byte) 1;
    }
}
