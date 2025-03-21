package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzfmz {
    public static final String zza;
    public static final String zzb;
    @Deprecated
    public static final zzful zzc;
    @Deprecated
    public static final zzful zzd;
    @Deprecated
    public static final zzful zze;

    static {
        new zzfnf();
        zza = "type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey";
        new zzfno();
        zzb = "type.googleapis.com/google.crypto.tink.AesGcmKey";
        new zzfnr();
        new zzfnl();
        new zzfnx();
        new zzfob();
        new zzfnu();
        new zzfoe();
        zzful zzc2 = zzful.zzc();
        zzc = zzc2;
        zzd = zzc2;
        zze = zzc2;
        try {
            zza();
        } catch (GeneralSecurityException e) {
            throw new ExceptionInInitializerError(e);
        }
    }

    public static void zza() throws GeneralSecurityException {
        zzfmx.zze(new zzfnc());
        zzfph.zza();
        zzfmx.zzc(new zzfnf(), true);
        zzfmx.zzc(new zzfno(), true);
        zzfmx.zzc(new zzfnl(), true);
        zzfnr.zzj(true);
        zzfmx.zzc(new zzfnu(), true);
        zzfmx.zzc(new zzfnx(), true);
        zzfmx.zzc(new zzfob(), true);
        zzfmx.zzc(new zzfoe(), true);
    }
}
