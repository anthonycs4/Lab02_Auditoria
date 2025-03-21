package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzfph {
    @Deprecated
    public static final zzful zza;
    @Deprecated
    public static final zzful zzb;
    @Deprecated
    public static final zzful zzc;

    static {
        new zzfpg();
        zzful zzc2 = zzful.zzc();
        zza = zzc2;
        zzb = zzc2;
        zzc = zzc2;
        try {
            zza();
        } catch (GeneralSecurityException e) {
            throw new ExceptionInInitializerError(e);
        }
    }

    public static void zza() throws GeneralSecurityException {
        zzfmx.zze(new zzfpk());
        zzfmx.zzc(new zzfpg(), true);
        zzfmx.zzc(new zzfpd(), true);
    }
}
