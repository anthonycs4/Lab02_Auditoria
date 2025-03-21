package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.RequestConfiguration;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzgbw extends zzfym<zzgbw, zzgbv> implements zzfzv {
    private static final zzgbw zzf;
    private int zzb;
    private String zze = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;

    static {
        zzgbw zzgbwVar = new zzgbw();
        zzf = zzgbwVar;
        zzfym.zzay(zzgbw.class, zzgbwVar);
    }

    private zzgbw() {
    }

    public static zzgbv zza() {
        return zzf.zzas();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzd(zzgbw zzgbwVar, String str) {
        zzgbwVar.zzb |= 1;
        zzgbwVar.zze = str;
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
                        return zzf;
                    }
                    return new zzgbv(null);
                }
                return new zzgbw();
            }
            return zzaz(zzf, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"zzb", "zze"});
        }
        return (byte) 1;
    }
}
