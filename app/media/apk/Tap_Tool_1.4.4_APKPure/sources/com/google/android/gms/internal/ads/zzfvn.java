package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.Arrays;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzfvn implements zzflu {
    private final zzfvy zza;
    private final zzfmj zzb;

    public zzfvn(zzfvy zzfvyVar, zzfmj zzfmjVar, int i) {
        this.zza = zzfvyVar;
        this.zzb = zzfmjVar;
    }

    @Override // com.google.android.gms.internal.ads.zzflu
    public final byte[] zza(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        byte[] zza = this.zza.zza(bArr);
        return zzfvb.zza(zza, this.zzb.zza(zzfvb.zza(bArr2, zza, Arrays.copyOf(ByteBuffer.allocate(8).putLong(bArr2.length * 8).array(), 8))));
    }
}
