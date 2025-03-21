package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import java.util.Arrays;
import java.util.Collection;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import kotlin.jvm.internal.ByteCompanionObject;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzfuz implements zzflx {
    private static final Collection<Integer> zza = Arrays.asList(64);
    private static final byte[] zzb = new byte[16];
    private final zzfwa zzc;
    private final byte[] zzd;

    public zzfuz(byte[] bArr) throws GeneralSecurityException {
        Collection<Integer> collection = zza;
        int length = bArr.length;
        if (!collection.contains(Integer.valueOf(length))) {
            StringBuilder sb = new StringBuilder(59);
            sb.append("invalid key size: ");
            sb.append(length);
            sb.append(" bytes; key must have 64 bytes");
            throw new InvalidKeyException(sb.toString());
        }
        int i = length >> 1;
        byte[] copyOfRange = Arrays.copyOfRange(bArr, 0, i);
        this.zzd = Arrays.copyOfRange(bArr, i, length);
        this.zzc = new zzfwa(copyOfRange);
    }

    @Override // com.google.android.gms.internal.ads.zzflx
    public final byte[] zza(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        byte[] zzd;
        if (bArr.length > 2147483631) {
            throw new GeneralSecurityException("plaintext too long");
        }
        Cipher zza2 = zzfvo.zza.zza("AES/CTR/NoPadding");
        byte[][] bArr3 = {bArr2, bArr};
        byte[] zza3 = this.zzc.zza(zzb, 16);
        for (char c = 0; c <= 0; c = 1) {
            byte[] bArr4 = bArr3[0];
            if (bArr4 == null) {
                bArr4 = new byte[0];
            }
            zza3 = zzfvb.zzd(zzfva.zza(zza3), this.zzc.zza(bArr4, 16));
        }
        byte[] bArr5 = bArr3[1];
        int length = bArr5.length;
        if (length >= 16) {
            int length2 = zza3.length;
            if (length < length2) {
                throw new IllegalArgumentException("xorEnd requires a.length >= b.length");
            }
            int i = length - length2;
            zzd = Arrays.copyOf(bArr5, length);
            for (int i2 = 0; i2 < zza3.length; i2++) {
                int i3 = i + i2;
                zzd[i3] = (byte) (zzd[i3] ^ zza3[i2]);
            }
        } else {
            zzd = zzfvb.zzd(zzfva.zzb(bArr5), zzfva.zza(zza3));
        }
        byte[] zza4 = this.zzc.zza(zzd, 16);
        byte[] bArr6 = (byte[]) zza4.clone();
        bArr6[8] = (byte) (bArr6[8] & ByteCompanionObject.MAX_VALUE);
        bArr6[12] = (byte) (bArr6[12] & ByteCompanionObject.MAX_VALUE);
        zza2.init(1, new SecretKeySpec(this.zzd, "AES"), new IvParameterSpec(bArr6));
        return zzfvb.zza(zza4, zza2.doFinal(bArr));
    }
}
