package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.interfaces.ECPrivateKey;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzfvh implements zzfly {
    private final ECPrivateKey zza;
    private final zzfvj zzb;
    private final String zzc;
    private final byte[] zzd;
    private final zzfvg zze;

    public zzfvh(ECPrivateKey eCPrivateKey, byte[] bArr, String str, int i, zzfvg zzfvgVar) throws GeneralSecurityException {
        this.zza = eCPrivateKey;
        this.zzb = new zzfvj(eCPrivateKey);
        this.zzd = bArr;
        this.zzc = str;
        this.zze = zzfvgVar;
    }
}
