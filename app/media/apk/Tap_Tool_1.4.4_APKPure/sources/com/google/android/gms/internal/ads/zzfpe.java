package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import javax.crypto.spec.SecretKeySpec;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
final class zzfpe extends zzfme<zzfmj, zzfsr> {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzfpe(Class cls) {
        super(cls);
    }

    @Override // com.google.android.gms.internal.ads.zzfme
    public final /* bridge */ /* synthetic */ zzfmj zzb(zzfsr zzfsrVar) throws GeneralSecurityException {
        zzfsr zzfsrVar2 = zzfsrVar;
        zzfso zza = zzfsrVar2.zzc().zza();
        SecretKeySpec secretKeySpec = new SecretKeySpec(zzfsrVar2.zzd().zzz(), "HMAC");
        int zzc = zzfsrVar2.zzc().zzc();
        zzfso zzfsoVar = zzfso.UNKNOWN_HASH;
        int ordinal = zza.ordinal();
        if (ordinal != 1) {
            if (ordinal != 2) {
                if (ordinal != 3) {
                    if (ordinal != 4) {
                        if (ordinal == 5) {
                            return new zzfwd(new zzfwc("HMACSHA224", secretKeySpec), zzc);
                        }
                        throw new GeneralSecurityException("unknown hash");
                    }
                    return new zzfwd(new zzfwc("HMACSHA512", secretKeySpec), zzc);
                }
                return new zzfwd(new zzfwc("HMACSHA256", secretKeySpec), zzc);
            }
            return new zzfwd(new zzfwc("HMACSHA384", secretKeySpec), zzc);
        }
        return new zzfwd(new zzfwc("HMACSHA1", secretKeySpec), zzc);
    }
}
