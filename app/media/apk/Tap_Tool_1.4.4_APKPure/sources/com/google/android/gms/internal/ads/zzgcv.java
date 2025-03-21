package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.RequestConfiguration;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzgcv extends zzfym<zzgcv, zzgcu> implements zzfzv {
    private static final zzgcv zzh;
    private int zzb;
    private String zze = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
    private long zzf;
    private boolean zzg;

    static {
        zzgcv zzgcvVar = new zzgcv();
        zzh = zzgcvVar;
        zzfym.zzay(zzgcv.class, zzgcvVar);
    }

    private zzgcv() {
    }

    public static zzgcu zza() {
        return zzh.zzas();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzd(zzgcv zzgcvVar, String str) {
        zzgcvVar.zzb |= 1;
        zzgcvVar.zze = str;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zze(zzgcv zzgcvVar, long j) {
        zzgcvVar.zzb |= 2;
        zzgcvVar.zzf = j;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzf(zzgcv zzgcvVar, boolean z) {
        zzgcvVar.zzb |= 4;
        zzgcvVar.zzg = z;
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
                    return new zzgcu(null);
                }
                return new zzgcv();
            }
            return zzaz(zzh, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဂ\u0001\u0003ဇ\u0002", new Object[]{"zzb", "zze", "zzf", "zzg"});
        }
        return (byte) 1;
    }
}
