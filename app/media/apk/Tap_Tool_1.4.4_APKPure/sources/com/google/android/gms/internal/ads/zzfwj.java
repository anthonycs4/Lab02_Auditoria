package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzfwj extends zzfvf {
    public zzfwj(byte[] bArr) throws GeneralSecurityException {
        super(bArr);
    }

    @Override // com.google.android.gms.internal.ads.zzfvf
    final zzfvd zzb(byte[] bArr, int i) throws InvalidKeyException {
        return new zzfwi(bArr, i);
    }
}
