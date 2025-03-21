package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzgbn {
    private static final zzgbk zza;

    static {
        if (zzgbi.zza() && zzgbi.zzb()) {
            int i = zzfwv.zza;
        }
        zza = new zzgbl();
    }

    public static boolean zza(byte[] bArr) {
        return zza.zza(bArr, 0, bArr.length);
    }

    public static boolean zzb(byte[] bArr, int i, int i2) {
        return zza.zza(bArr, i, i2);
    }

    public static int zzc(int i, byte[] bArr, int i2, int i3) {
        return zza.zzb(i, bArr, i2, i3);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzd(CharSequence charSequence) {
        int length = charSequence.length();
        int i = 0;
        int i2 = 0;
        while (i2 < length && charSequence.charAt(i2) < 128) {
            i2++;
        }
        int i3 = length;
        while (true) {
            if (i2 >= length) {
                break;
            }
            char charAt = charSequence.charAt(i2);
            if (charAt < 2048) {
                i3 += (127 - charAt) >>> 31;
                i2++;
            } else {
                int length2 = charSequence.length();
                while (i2 < length2) {
                    char charAt2 = charSequence.charAt(i2);
                    if (charAt2 < 2048) {
                        i += (127 - charAt2) >>> 31;
                    } else {
                        i += 2;
                        if (charAt2 >= 55296 && charAt2 <= 57343) {
                            if (Character.codePointAt(charSequence, i2) < 65536) {
                                throw new zzgbm(i2, length2);
                            }
                            i2++;
                        }
                    }
                    i2++;
                }
                i3 += i;
            }
        }
        if (i3 >= length) {
            return i3;
        }
        StringBuilder sb = new StringBuilder(54);
        sb.append("UTF-8 length does not fit in int: ");
        sb.append(i3 + 4294967296L);
        throw new IllegalArgumentException(sb.toString());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0100, code lost:
        return r9 + r0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int zze(java.lang.CharSequence r7, byte[] r8, int r9, int r10) {
        /*
            Method dump skipped, instructions count: 257
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzgbn.zze(java.lang.CharSequence, byte[], int, int):int");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String zzf(ByteBuffer byteBuffer, int i, int i2) throws zzfyy {
        zzgbk zzgbkVar = zza;
        if (byteBuffer.hasArray()) {
            return zzgbkVar.zzc(byteBuffer.array(), byteBuffer.arrayOffset() + i, i2);
        } else if (!byteBuffer.isDirect()) {
            return zzgbk.zzd(byteBuffer, i, i2);
        } else {
            return zzgbl.zzd(byteBuffer, i, i2);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String zzg(byte[] bArr, int i, int i2) throws zzfyy {
        return zza.zzc(bArr, i, i2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ int zzj(byte[] bArr, int i, int i2) {
        byte b = bArr[i - 1];
        int i3 = i2 - i;
        if (i3 == 0) {
            if (b > -12) {
                return -1;
            }
            return b;
        } else if (i3 != 1) {
            if (i3 == 2) {
                return zzl(b, bArr[i], bArr[i + 1]);
            }
            throw new AssertionError();
        } else {
            return zzk(b, bArr[i]);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int zzk(int i, int i2) {
        if (i > -12 || i2 > -65) {
            return -1;
        }
        return i ^ (i2 << 8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int zzl(int i, int i2, int i3) {
        if (i > -12 || i2 > -65 || i3 > -65) {
            return -1;
        }
        return (i ^ (i2 << 8)) ^ (i3 << 16);
    }
}
