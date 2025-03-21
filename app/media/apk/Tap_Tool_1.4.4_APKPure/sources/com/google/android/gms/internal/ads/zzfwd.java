package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzfwd implements zzfmj {
    private final zzfpl zza;
    private final int zzb;

    @Override // com.google.android.gms.internal.ads.zzfmj
    public final byte[] zza(byte[] bArr) throws GeneralSecurityException {
        return this.zza.zza(bArr, this.zzb);
    }

    public zzfwd(zzfpl zzfplVar, int i) throws GeneralSecurityException {
        this.zza = zzfplVar;
        this.zzb = i;
        if (i < 10) {
            throw new InvalidAlgorithmParameterException("tag size too small, need at least 10 bytes");
        }
        zzfplVar.zza(new byte[0], i);
    }
}
