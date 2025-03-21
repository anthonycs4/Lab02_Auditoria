package com.google.android.gms.internal.ads;

import java.util.Arrays;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzagv {
    public static final byte[] zza = {0, 0, 0, 1};
    public static final float[] zzb = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 2.1818182f, 1.8181819f, 2.909091f, 2.4242425f, 1.6363636f, 1.3636364f, 1.939394f, 1.6161616f, 1.3333334f, 1.5f, 2.0f};
    private static final Object zzc = new Object();
    private static int[] zzd = new int[10];

    public static int zza(byte[] bArr, int i) {
        int i2;
        synchronized (zzc) {
            int i3 = 0;
            int i4 = 0;
            while (i3 < i) {
                while (true) {
                    if (i3 >= i - 2) {
                        i3 = i;
                        break;
                    }
                    try {
                        if (bArr[i3] == 0 && bArr[i3 + 1] == 0 && bArr[i3 + 2] == 3) {
                            break;
                        }
                        i3++;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                if (i3 < i) {
                    int[] iArr = zzd;
                    if (iArr.length <= i4) {
                        int length = iArr.length;
                        zzd = Arrays.copyOf(iArr, length + length);
                    }
                    zzd[i4] = i3;
                    i3 += 3;
                    i4++;
                }
            }
            i2 = i - i4;
            int i5 = 0;
            int i6 = 0;
            for (int i7 = 0; i7 < i4; i7++) {
                int i8 = zzd[i7] - i5;
                System.arraycopy(bArr, i5, bArr, i6, i8);
                int i9 = i6 + i8;
                int i10 = i9 + 1;
                bArr[i9] = 0;
                i6 = i10 + 1;
                bArr[i10] = 0;
                i5 += i8 + 3;
            }
            System.arraycopy(bArr, i5, bArr, i6, i2 - i6);
        }
        return i2;
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0168  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.google.android.gms.internal.ads.zzagu zzb(byte[] r22, int r23, int r24) {
        /*
            Method dump skipped, instructions count: 406
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzagv.zzb(byte[], int, int):com.google.android.gms.internal.ads.zzagu");
    }

    public static zzagt zzc(byte[] bArr, int i, int i2) {
        zzahe zzaheVar = new zzahe(bArr, 3, i2);
        zzaheVar.zzc(8);
        int zzf = zzaheVar.zzf();
        int zzf2 = zzaheVar.zzf();
        zzaheVar.zzb();
        return new zzagt(zzf, zzf2, zzaheVar.zzd());
    }

    public static int zzd(byte[] bArr, int i, int i2, boolean[] zArr) {
        int i3 = i2 - i;
        zzafs.zzd(i3 >= 0);
        if (i3 == 0) {
            return i2;
        }
        if (zArr[0]) {
            zze(zArr);
            return i - 3;
        } else if (i3 <= 1 || !zArr[1] || bArr[i] != 1) {
            if (i3 <= 2 || !zArr[2] || bArr[i] != 0 || bArr[i + 1] != 1) {
                int i4 = i2 - 1;
                int i5 = i + 2;
                while (i5 < i4) {
                    byte b = bArr[i5];
                    if ((b & 254) == 0) {
                        int i6 = i5 - 2;
                        if (bArr[i6] == 0 && bArr[i5 - 1] == 0 && b == 1) {
                            zze(zArr);
                            return i6;
                        }
                        i5 = i6;
                    }
                    i5 += 3;
                }
                zArr[0] = i3 <= 2 ? !(i3 != 2 ? !(zArr[1] && bArr[i4] == 1) : !(zArr[2] && bArr[i2 + (-2)] == 0 && bArr[i4] == 1)) : bArr[i2 + (-3)] == 0 && bArr[i2 + (-2)] == 0 && bArr[i4] == 1;
                zArr[1] = i3 <= 1 ? zArr[2] && bArr[i4] == 0 : bArr[i2 + (-2)] == 0 && bArr[i4] == 0;
                zArr[2] = bArr[i4] == 0;
                return i2;
            }
            zze(zArr);
            return i - 1;
        } else {
            zze(zArr);
            return i - 2;
        }
    }

    public static void zze(boolean[] zArr) {
        zArr[0] = false;
        zArr[1] = false;
        zArr[2] = false;
    }
}
