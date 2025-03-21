package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.RequestConfiguration;
import java.util.List;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
@Deprecated
/* loaded from: classes.dex */
public final class zzful extends zzfym<zzful, zzfuk> implements zzfzv {
    private static final zzful zzf;
    private String zzb = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
    private zzfyv<zzftk> zze = zzaE();

    static {
        zzful zzfulVar = new zzful();
        zzf = zzfulVar;
        zzfym.zzay(zzful.class, zzfulVar);
    }

    private zzful() {
    }

    public static zzful zzc() {
        return zzf;
    }

    public final List<zzftk> zza() {
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
                        return zzf;
                    }
                    return new zzfuk(null);
                }
                return new zzful();
            }
            return zzaz(zzf, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001Ȉ\u0002\u001b", new Object[]{"zzb", "zze", zzftk.class});
        }
        return (byte) 1;
    }
}
