package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.RequestConfiguration;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
@Deprecated
/* loaded from: classes.dex */
public final class zzftk extends zzfym<zzftk, zzftj> implements zzfzv {
    private static final zzftk zzi;
    private int zzf;
    private boolean zzg;
    private String zzb = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
    private String zze = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
    private String zzh = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;

    static {
        zzftk zzftkVar = new zzftk();
        zzi = zzftkVar;
        zzfym.zzay(zzftk.class, zzftkVar);
    }

    private zzftk() {
    }

    public final String zza() {
        return this.zzb;
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
                        return zzi;
                    }
                    return new zzftj(null);
                }
                return new zzftk();
            }
            return zzaz(zzi, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003\u000b\u0004\u0007\u0005Ȉ", new Object[]{"zzb", "zze", "zzf", "zzg", "zzh"});
        }
        return (byte) 1;
    }

    public final String zzc() {
        return this.zze;
    }

    public final int zzd() {
        return this.zzf;
    }

    public final boolean zze() {
        return this.zzg;
    }

    public final String zzf() {
        return this.zzh;
    }
}
