package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.NoSuchAlgorithmException;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
final class zzfoy {
    public static void zza(zzfsb zzfsbVar) throws GeneralSecurityException {
        zzfvm.zzd(zzc(zzfsbVar.zza().zza()));
        zzb(zzfsbVar.zza().zzc());
        if (zzfsbVar.zzd() == zzfrs.UNKNOWN_FORMAT) {
            throw new GeneralSecurityException("unknown EC point format");
        }
        zzfmx.zzg(zzfsbVar.zzc().zza());
    }

    public static String zzb(zzfso zzfsoVar) throws NoSuchAlgorithmException {
        zzfrs zzfrsVar = zzfrs.UNKNOWN_FORMAT;
        zzfsm zzfsmVar = zzfsm.UNKNOWN_CURVE;
        zzfso zzfsoVar2 = zzfso.UNKNOWN_HASH;
        int ordinal = zzfsoVar.ordinal();
        if (ordinal != 1) {
            if (ordinal != 2) {
                if (ordinal != 3) {
                    if (ordinal != 4) {
                        if (ordinal == 5) {
                            return "HmacSha224";
                        }
                        String valueOf = String.valueOf(zzfsoVar);
                        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 27);
                        sb.append("hash unsupported for HMAC: ");
                        sb.append(valueOf);
                        throw new NoSuchAlgorithmException(sb.toString());
                    }
                    return "HmacSha512";
                }
                return "HmacSha256";
            }
            return "HmacSha384";
        }
        return "HmacSha1";
    }

    public static int zzc(zzfsm zzfsmVar) throws GeneralSecurityException {
        zzfrs zzfrsVar = zzfrs.UNKNOWN_FORMAT;
        zzfsm zzfsmVar2 = zzfsm.UNKNOWN_CURVE;
        zzfso zzfsoVar = zzfso.UNKNOWN_HASH;
        int ordinal = zzfsmVar.ordinal();
        int i = 1;
        if (ordinal != 1) {
            i = 2;
            if (ordinal != 2) {
                if (ordinal == 3) {
                    return 3;
                }
                String valueOf = String.valueOf(zzfsmVar);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 20);
                sb.append("unknown curve type: ");
                sb.append(valueOf);
                throw new GeneralSecurityException(sb.toString());
            }
        }
        return i;
    }

    public static int zzd(zzfrs zzfrsVar) throws GeneralSecurityException {
        zzfrs zzfrsVar2 = zzfrs.UNKNOWN_FORMAT;
        zzfsm zzfsmVar = zzfsm.UNKNOWN_CURVE;
        zzfso zzfsoVar = zzfso.UNKNOWN_HASH;
        int ordinal = zzfrsVar.ordinal();
        int i = 1;
        if (ordinal != 1) {
            i = 2;
            if (ordinal != 2) {
                if (ordinal == 3) {
                    return 3;
                }
                String valueOf = String.valueOf(zzfrsVar);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 22);
                sb.append("unknown point format: ");
                sb.append(valueOf);
                throw new GeneralSecurityException(sb.toString());
            }
        }
        return i;
    }
}
