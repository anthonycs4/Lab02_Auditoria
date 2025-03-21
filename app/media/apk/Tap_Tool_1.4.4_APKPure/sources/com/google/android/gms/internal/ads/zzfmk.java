package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
@Deprecated
/* loaded from: classes.dex */
public final class zzfmk {
    @Deprecated
    public static final zzfmg zza(byte[] bArr) throws GeneralSecurityException {
        try {
            zzftp zze = zzftp.zze(bArr, zzfxy.zza());
            for (zzfto zzftoVar : zze.zzc()) {
                if (zzftoVar.zzc().zzd() == zzftb.UNKNOWN_KEYMATERIAL || zzftoVar.zzc().zzd() == zzftb.SYMMETRIC || zzftoVar.zzc().zzd() == zzftb.ASYMMETRIC_PRIVATE) {
                    throw new GeneralSecurityException("keyset contains secret key material");
                }
            }
            return zzfmg.zza(zze);
        } catch (zzfyy unused) {
            throw new GeneralSecurityException("invalid keyset");
        }
    }
}
