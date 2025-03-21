package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzfut implements zzfvy {
    private static final ThreadLocal<Cipher> zza = new zzfus();
    private final SecretKeySpec zzb;
    private final int zzc;
    private final int zzd;

    public zzfut(byte[] bArr, int i) throws GeneralSecurityException {
        zzfwh.zza(bArr.length);
        this.zzb = new SecretKeySpec(bArr, "AES");
        int blockSize = zza.get().getBlockSize();
        this.zzd = blockSize;
        if (i < 12 || i > blockSize) {
            throw new GeneralSecurityException("invalid IV size");
        }
        this.zzc = i;
    }

    @Override // com.google.android.gms.internal.ads.zzfvy
    public final byte[] zza(byte[] bArr) throws GeneralSecurityException {
        int length = bArr.length;
        int i = this.zzc;
        int i2 = Integer.MAX_VALUE - i;
        if (length > i2) {
            StringBuilder sb = new StringBuilder(43);
            sb.append("plaintext length can not exceed ");
            sb.append(i2);
            throw new GeneralSecurityException(sb.toString());
        }
        byte[] bArr2 = new byte[i + length];
        byte[] zza2 = zzfwf.zza(i);
        System.arraycopy(zza2, 0, bArr2, 0, this.zzc);
        int i3 = this.zzc;
        Cipher cipher = zza.get();
        byte[] bArr3 = new byte[this.zzd];
        System.arraycopy(zza2, 0, bArr3, 0, this.zzc);
        cipher.init(1, this.zzb, new IvParameterSpec(bArr3));
        if (cipher.doFinal(bArr, 0, length, bArr2, i3) == length) {
            return bArr2;
        }
        throw new GeneralSecurityException("stored output's length does not match input's length");
    }
}
