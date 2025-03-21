package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzfok {
    public static final String zza;
    @Deprecated
    public static final zzful zzb;
    @Deprecated
    public static final zzful zzc;

    static {
        new zzfoj();
        zza = "type.googleapis.com/google.crypto.tink.AesSivKey";
        zzb = zzful.zzc();
        zzc = zzful.zzc();
        try {
            zzfmx.zze(new zzfom());
            zzfmx.zzc(new zzfoj(), true);
        } catch (GeneralSecurityException e) {
            throw new ExceptionInInitializerError(e);
        }
    }
}
