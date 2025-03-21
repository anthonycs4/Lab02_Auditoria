package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.RequestConfiguration;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzfca extends zzfym<zzfca, zzfbz> implements zzfzv {
    private static final zzfys<Integer, zzfby> zzf = new zzfbv();
    private static final zzfca zzj;
    private int zzb;
    private zzfyr zze = zzaB();
    private String zzg = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
    private String zzh = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
    private String zzi = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;

    static {
        zzfca zzfcaVar = new zzfca();
        zzj = zzfcaVar;
        zzfym.zzay(zzfca.class, zzfcaVar);
    }

    private zzfca() {
    }

    public static zzfbz zza() {
        return zzj.zzas();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzd(zzfca zzfcaVar, zzfby zzfbyVar) {
        zzfbyVar.getClass();
        zzfyr zzfyrVar = zzfcaVar.zze;
        if (!zzfyrVar.zza()) {
            zzfcaVar.zze = zzfym.zzaC(zzfyrVar);
        }
        zzfcaVar.zze.zzh(zzfbyVar.zza());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zze(zzfca zzfcaVar, String str) {
        str.getClass();
        zzfcaVar.zzb |= 1;
        zzfcaVar.zzg = str;
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
                        return zzj;
                    }
                    return new zzfbz(null);
                }
                return new zzfca();
            }
            return zzaz(zzj, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001\u001e\u0002ဈ\u0000\u0003ဈ\u0001\u0004ဈ\u0002", new Object[]{"zzb", "zze", zzfby.zzc(), "zzg", "zzh", "zzi"});
        }
        return (byte) 1;
    }
}
