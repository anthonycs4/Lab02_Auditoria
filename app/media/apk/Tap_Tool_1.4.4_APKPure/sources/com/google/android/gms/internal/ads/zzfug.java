package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.RequestConfiguration;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzfug extends zzfym<zzfug, zzfuf> implements zzfzv {
    private static final zzfug zzf;
    private String zzb = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
    private zzfth zze;

    static {
        zzfug zzfugVar = new zzfug();
        zzf = zzfugVar;
        zzfym.zzay(zzfug.class, zzfugVar);
    }

    private zzfug() {
    }

    public static zzfug zze(zzfxj zzfxjVar, zzfxy zzfxyVar) throws zzfyy {
        return (zzfug) zzfym.zzaI(zzf, zzfxjVar, zzfxyVar);
    }

    public static zzfug zzf() {
        return zzf;
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
                        return zzf;
                    }
                    return new zzfuf(null);
                }
                return new zzfug();
            }
            return zzaz(zzf, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002\t", new Object[]{"zzb", "zze"});
        }
        return (byte) 1;
    }

    public final boolean zzc() {
        return this.zze != null;
    }

    public final zzfth zzd() {
        zzfth zzfthVar = this.zze;
        return zzfthVar == null ? zzfth.zzd() : zzfthVar;
    }
}
