package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.RequestConfiguration;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;
import java.util.Locale;
import kotlin.UByte;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzyu {
    public static final zzys zza = zzyr.zza;

    /* JADX WARN: Removed duplicated region for block: B:38:0x00bd A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00be  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final com.google.android.gms.internal.ads.zzxu zza(byte[] r11, int r12, com.google.android.gms.internal.ads.zzys r13, com.google.android.gms.internal.ads.zzxv r14) {
        /*
            Method dump skipped, instructions count: 300
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzyu.zza(byte[], int, com.google.android.gms.internal.ads.zzys, com.google.android.gms.internal.ads.zzxv):com.google.android.gms.internal.ads.zzxu");
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x0085, code lost:
        if ((r10 & 128) != 0) goto L31;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static boolean zzb(com.google.android.gms.internal.ads.zzahd r19, int r20, int r21, boolean r22) {
        /*
            r1 = r19
            r0 = r20
            int r2 = r19.zzg()
        L8:
            int r3 = r19.zzd()     // Catch: java.lang.Throwable -> Lae
            r4 = 1
            r5 = r21
            if (r3 < r5) goto Laa
            r3 = 3
            r6 = 0
            if (r0 < r3) goto L22
            int r7 = r19.zzv()     // Catch: java.lang.Throwable -> Lae
            long r8 = r19.zzt()     // Catch: java.lang.Throwable -> Lae
            int r10 = r19.zzo()     // Catch: java.lang.Throwable -> Lae
            goto L2c
        L22:
            int r7 = r19.zzr()     // Catch: java.lang.Throwable -> Lae
            int r8 = r19.zzr()     // Catch: java.lang.Throwable -> Lae
            long r8 = (long) r8
            r10 = 0
        L2c:
            r11 = 0
            if (r7 != 0) goto L3b
            int r7 = (r8 > r11 ? 1 : (r8 == r11 ? 0 : -1))
            if (r7 != 0) goto L3b
            if (r10 == 0) goto L37
            goto L3b
        L37:
            r1.zzh(r2)
            return r4
        L3b:
            r7 = 4
            if (r0 != r7) goto L6a
            if (r22 != 0) goto L6a
            r13 = 8421504(0x808080, double:4.160776E-317)
            long r13 = r13 & r8
            int r15 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
            if (r15 == 0) goto L4c
            r1.zzh(r2)
            return r6
        L4c:
            r11 = 255(0xff, double:1.26E-321)
            long r13 = r8 & r11
            r15 = 8
            long r15 = r8 >> r15
            long r15 = r15 & r11
            r17 = 7
            long r15 = r15 << r17
            long r13 = r13 | r15
            r15 = 16
            long r15 = r8 >> r15
            long r11 = r11 & r15
            r15 = 14
            long r11 = r11 << r15
            long r11 = r11 | r13
            r13 = 24
            long r8 = r8 >> r13
            r13 = 21
            long r8 = r8 << r13
            long r8 = r8 | r11
        L6a:
            if (r0 != r7) goto L7a
            r3 = r10 & 64
            if (r3 == 0) goto L71
            goto L72
        L71:
            r4 = 0
        L72:
            r3 = r10 & 1
            r18 = r4
            r4 = r3
            r3 = r18
            goto L8a
        L7a:
            if (r0 != r3) goto L88
            r3 = r10 & 32
            if (r3 == 0) goto L82
            r3 = 1
            goto L83
        L82:
            r3 = 0
        L83:
            r7 = r10 & 128(0x80, float:1.794E-43)
            if (r7 == 0) goto L89
            goto L8a
        L88:
            r3 = 0
        L89:
            r4 = 0
        L8a:
            if (r4 == 0) goto L8e
            int r3 = r3 + 4
        L8e:
            long r3 = (long) r3
            int r7 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r7 >= 0) goto L97
            r1.zzh(r2)
            return r6
        L97:
            int r3 = r19.zzd()     // Catch: java.lang.Throwable -> Lae
            long r3 = (long) r3
            int r7 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r7 >= 0) goto La4
            r1.zzh(r2)
            return r6
        La4:
            int r3 = (int) r8
            r1.zzk(r3)     // Catch: java.lang.Throwable -> Lae
            goto L8
        Laa:
            r1.zzh(r2)
            return r4
        Lae:
            r0 = move-exception
            r1.zzh(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzyu.zzb(com.google.android.gms.internal.ads.zzahd, int, int, boolean):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:140:0x0273, code lost:
        if (r9 == 67) goto L121;
     */
    /* JADX WARN: Not initialized variable reg: 22, insn: 0x0567: MOVE  (r2 I:??[OBJECT, ARRAY]) = (r22 I:??[OBJECT, ARRAY]), block:B:247:0x0565 */
    /* JADX WARN: Removed duplicated region for block: B:221:0x04a1  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x050f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static com.google.android.gms.internal.ads.zzyv zzc(int r34, com.google.android.gms.internal.ads.zzahd r35, boolean r36, int r37, com.google.android.gms.internal.ads.zzys r38) {
        /*
            Method dump skipped, instructions count: 1415
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzyu.zzc(int, com.google.android.gms.internal.ads.zzahd, boolean, int, com.google.android.gms.internal.ads.zzys):com.google.android.gms.internal.ads.zzyv");
    }

    private static int zzd(zzahd zzahdVar, int i) {
        byte[] zzi = zzahdVar.zzi();
        int zzg = zzahdVar.zzg();
        int i2 = zzg;
        while (true) {
            int i3 = i2 + 1;
            if (i3 >= zzg + i) {
                return i;
            }
            if ((zzi[i2] & UByte.MAX_VALUE) == 255 && zzi[i3] == 0) {
                System.arraycopy(zzi, i2 + 2, zzi, i3, (i - (i2 - zzg)) - 2);
                i--;
            }
            i2 = i3;
        }
    }

    private static String zze(int i) {
        return i != 1 ? i != 2 ? i != 3 ? "ISO-8859-1" : "UTF-8" : "UTF-16BE" : "UTF-16";
    }

    private static String zzf(int i, int i2, int i3, int i4, int i5) {
        return i == 2 ? String.format(Locale.US, "%c%c%c", Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)) : String.format(Locale.US, "%c%c%c%c", Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5));
    }

    private static int zzg(byte[] bArr, int i, int i2) {
        int zzh = zzh(bArr, i);
        if (i2 == 0 || i2 == 3) {
            return zzh;
        }
        while (true) {
            int length = bArr.length;
            if (zzh >= length - 1) {
                return length;
            }
            if (zzh % 2 == 0 && bArr[zzh + 1] == 0) {
                return zzh;
            }
            zzh = zzh(bArr, zzh + 1);
        }
    }

    private static int zzh(byte[] bArr, int i) {
        while (true) {
            int length = bArr.length;
            if (i >= length) {
                return length;
            }
            if (bArr[i] == 0) {
                return i;
            }
            i++;
        }
    }

    private static int zzi(int i) {
        return (i == 0 || i == 3) ? 1 : 2;
    }

    private static byte[] zzj(byte[] bArr, int i, int i2) {
        if (i2 <= i) {
            return zzaht.zzf;
        }
        return Arrays.copyOfRange(bArr, i, i2);
    }

    private static String zzk(byte[] bArr, int i, int i2, String str) throws UnsupportedEncodingException {
        return (i2 <= i || i2 > bArr.length) ? RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED : new String(bArr, i, i2 - i, str);
    }
}
