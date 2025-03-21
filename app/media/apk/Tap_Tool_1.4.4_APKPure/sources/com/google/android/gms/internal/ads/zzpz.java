package com.google.android.gms.internal.ads;

import java.io.IOException;
import kotlin.UByte;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzpz {
    /* JADX WARN: Code restructure failed: missing block: B:37:0x007f, code lost:
        if (r7 != r18.zzf) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x008c, code lost:
        if ((r17.zzn() * 1000) == r3) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x009b, code lost:
        if (r4 == r3) goto L39;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean zza(com.google.android.gms.internal.ads.zzahd r17, com.google.android.gms.internal.ads.zzqe r18, int r19, com.google.android.gms.internal.ads.zzpy r20) {
        /*
            r0 = r17
            r1 = r18
            int r2 = r17.zzg()
            long r3 = r17.zzt()
            r5 = 16
            long r5 = r3 >>> r5
            r7 = r19
            long r7 = (long) r7
            r9 = 0
            int r10 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r10 == 0) goto L19
            return r9
        L19:
            r7 = 1
            long r5 = r5 & r7
            r10 = 1
            int r11 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r11 != 0) goto L23
            r5 = 1
            goto L24
        L23:
            r5 = 0
        L24:
            r6 = 12
            long r11 = r3 >> r6
            r13 = 15
            long r11 = r11 & r13
            int r12 = (int) r11
            r11 = 8
            long r15 = r3 >> r11
            long r6 = r15 & r13
            int r7 = (int) r6
            r6 = 4
            long r15 = r3 >> r6
            long r13 = r13 & r15
            int r6 = (int) r13
            long r13 = r3 >> r10
            r15 = 7
            long r13 = r13 & r15
            int r8 = (int) r13
            r13 = 1
            long r3 = r3 & r13
            r11 = 7
            r13 = -1
            if (r6 > r11) goto L4b
            int r11 = r1.zzg
            int r11 = r11 + r13
            if (r6 != r11) goto Lb1
            goto L54
        L4b:
            r11 = 10
            if (r6 > r11) goto Lb1
            int r6 = r1.zzg
            r11 = 2
            if (r6 != r11) goto Lb1
        L54:
            if (r8 != 0) goto L59
        L56:
            r14 = 1
            goto L5e
        L59:
            int r6 = r1.zzi
            if (r8 != r6) goto Lb1
            goto L56
        L5e:
            int r6 = (r3 > r14 ? 1 : (r3 == r14 ? 0 : -1))
            if (r6 == 0) goto Lb1
            r3 = r20
            boolean r3 = zze(r0, r1, r5, r3)
            if (r3 == 0) goto Lb1
            int r3 = zzd(r0, r12)
            if (r3 == r13) goto Lb1
            int r4 = r1.zzb
            if (r3 > r4) goto Lb1
            int r3 = r1.zze
            if (r7 != 0) goto L79
            goto L9d
        L79:
            r4 = 11
            if (r7 > r4) goto L82
            int r1 = r1.zzf
            if (r7 == r1) goto L9d
            goto Lb1
        L82:
            r1 = 12
            if (r7 != r1) goto L8f
            int r1 = r17.zzn()
            int r1 = r1 * 1000
            if (r1 != r3) goto Lb1
            goto L9d
        L8f:
            r1 = 14
            if (r7 > r1) goto Lb1
            int r4 = r17.zzo()
            if (r7 != r1) goto L9b
            int r4 = r4 * 10
        L9b:
            if (r4 != r3) goto Lb1
        L9d:
            int r1 = r17.zzn()
            int r3 = r17.zzg()
            byte[] r0 = r17.zzi()
            int r3 = r3 + r13
            int r0 = com.google.android.gms.internal.ads.zzaht.zzT(r0, r2, r3, r9)
            if (r1 != r0) goto Lb1
            return r10
        Lb1:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzpz.zza(com.google.android.gms.internal.ads.zzahd, com.google.android.gms.internal.ads.zzqe, int, com.google.android.gms.internal.ads.zzpy):boolean");
    }

    public static boolean zzb(zzps zzpsVar, zzqe zzqeVar, int i, zzpy zzpyVar) throws IOException {
        long zzm = zzpsVar.zzm();
        byte[] bArr = new byte[2];
        zzpo zzpoVar = (zzpo) zzpsVar;
        zzpoVar.zzh(bArr, 0, 2, false);
        if ((((bArr[0] & UByte.MAX_VALUE) << 8) | (bArr[1] & UByte.MAX_VALUE)) != i) {
            zzpsVar.zzl();
            zzpoVar.zzj((int) (zzm - zzpsVar.zzn()), false);
            return false;
        }
        zzahd zzahdVar = new zzahd(16);
        System.arraycopy(bArr, 0, zzahdVar.zzi(), 0, 2);
        zzahdVar.zzf(zzpv.zza(zzpsVar, zzahdVar.zzi(), 2, 14));
        zzpsVar.zzl();
        zzpoVar.zzj((int) (zzm - zzpsVar.zzn()), false);
        return zza(zzahdVar, zzqeVar, i, zzpyVar);
    }

    public static long zzc(zzps zzpsVar, zzqe zzqeVar) throws IOException {
        zzpsVar.zzl();
        zzpo zzpoVar = (zzpo) zzpsVar;
        zzpoVar.zzj(1, false);
        byte[] bArr = new byte[1];
        zzpoVar.zzh(bArr, 0, 1, false);
        int i = bArr[0] & 1;
        zzpoVar.zzj(2, false);
        int i2 = 1 != i ? 6 : 7;
        zzahd zzahdVar = new zzahd(i2);
        zzahdVar.zzf(zzpv.zza(zzpsVar, zzahdVar.zzi(), 0, i2));
        zzpsVar.zzl();
        zzpy zzpyVar = new zzpy();
        if (zze(zzahdVar, zzqeVar, 1 == i, zzpyVar)) {
            return zzpyVar.zza;
        }
        throw new zzkr();
    }

    public static int zzd(zzahd zzahdVar, int i) {
        switch (i) {
            case 1:
                return 192;
            case 2:
            case 3:
            case 4:
            case 5:
                return 576 << (i - 2);
            case 6:
                return zzahdVar.zzn() + 1;
            case 7:
                return zzahdVar.zzo() + 1;
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                return 256 << (i - 8);
            default:
                return -1;
        }
    }

    private static boolean zze(zzahd zzahdVar, zzqe zzqeVar, boolean z, zzpy zzpyVar) {
        try {
            long zzH = zzahdVar.zzH();
            if (!z) {
                zzH *= zzqeVar.zzb;
            }
            zzpyVar.zza = zzH;
            return true;
        } catch (NumberFormatException unused) {
            return false;
        }
    }
}
