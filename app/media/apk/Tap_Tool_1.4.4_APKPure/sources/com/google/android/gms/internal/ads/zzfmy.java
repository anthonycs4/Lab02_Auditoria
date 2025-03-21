package com.google.android.gms.internal.ads;

import java.nio.charset.Charset;
import java.security.GeneralSecurityException;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
final class zzfmy {
    public static final Charset zza = Charset.forName("UTF-8");

    public static zzftu zza(zzftp zzftpVar) {
        zzftr zza2 = zzftu.zza();
        zza2.zza(zzftpVar.zza());
        for (zzfto zzftoVar : zzftpVar.zzc()) {
            zzfts zza3 = zzftt.zza();
            zza3.zza(zzftoVar.zzc().zza());
            zza3.zzb(zzftoVar.zzd());
            zza3.zzd(zzftoVar.zzf());
            zza3.zzc(zzftoVar.zze());
            zza2.zzb(zza3.zzah());
        }
        return zza2.zzah();
    }

    public static void zzb(zzftp zzftpVar) throws GeneralSecurityException {
        int zza2 = zzftpVar.zza();
        int i = 0;
        boolean z = false;
        boolean z2 = true;
        for (zzfto zzftoVar : zzftpVar.zzc()) {
            if (zzftoVar.zzd() == zzfte.ENABLED) {
                if (zzftoVar.zza()) {
                    if (zzftoVar.zzf() != zzfui.UNKNOWN_PREFIX) {
                        if (zzftoVar.zzd() != zzfte.UNKNOWN_STATUS) {
                            if (zzftoVar.zze() == zza2) {
                                if (z) {
                                    throw new GeneralSecurityException("keyset contains multiple primary keys");
                                }
                                z = true;
                            }
                            z2 &= zzftoVar.zzc().zzd() == zzftb.ASYMMETRIC_PUBLIC;
                            i++;
                        } else {
                            throw new GeneralSecurityException(String.format("key %d has unknown status", Integer.valueOf(zzftoVar.zze())));
                        }
                    } else {
                        throw new GeneralSecurityException(String.format("key %d has unknown prefix", Integer.valueOf(zzftoVar.zze())));
                    }
                } else {
                    throw new GeneralSecurityException(String.format("key %d has no key data", Integer.valueOf(zzftoVar.zze())));
                }
            }
        }
        if (i == 0) {
            throw new GeneralSecurityException("keyset must contain at least one ENABLED key");
        }
        if (!z && !z2) {
            throw new GeneralSecurityException("keyset doesn't contain a valid primary key");
        }
    }
}
