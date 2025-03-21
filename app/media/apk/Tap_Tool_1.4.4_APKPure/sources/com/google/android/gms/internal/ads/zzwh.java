package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzwh {
    public static int zza(byte[] bArr, int i, int i2) {
        while (i < i2 && bArr[i] != 71) {
            i++;
        }
        return i;
    }

    public static long zzb(zzahd zzahdVar, int i, int i2) {
        zzahdVar.zzh(i);
        if (zzahdVar.zzd() < 5) {
            return -9223372036854775807L;
        }
        int zzv = zzahdVar.zzv();
        if ((8388608 & zzv) == 0 && ((zzv >> 8) & 8191) == i2 && (zzv & 32) != 0 && zzahdVar.zzn() >= 7 && zzahdVar.zzd() >= 7 && (zzahdVar.zzn() & 16) == 16) {
            byte[] bArr = new byte[6];
            zzahdVar.zzm(bArr, 0, 6);
            byte b = bArr[0];
            byte b2 = bArr[1];
            byte b3 = bArr[2];
            long j = bArr[3] & 255;
            return ((b2 & 255) << 17) | ((b & 255) << 25) | ((b3 & 255) << 9) | (j + j) | ((bArr[4] & 255) >> 7);
        }
        return -9223372036854775807L;
    }
}
