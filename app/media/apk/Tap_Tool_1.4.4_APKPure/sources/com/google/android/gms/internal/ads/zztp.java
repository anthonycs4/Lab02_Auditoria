package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
final class zztp {
    public final zztm zza;
    public final int zzb;
    public final long[] zzc;
    public final int[] zzd;
    public final int zze;
    public final long[] zzf;
    public final int[] zzg;
    public final long zzh;

    public zztp(zztm zztmVar, long[] jArr, int[] iArr, int i, long[] jArr2, int[] iArr2, long j) {
        int length = iArr.length;
        int length2 = jArr2.length;
        zzafs.zza(length == length2);
        int length3 = jArr.length;
        zzafs.zza(length3 == length2);
        int length4 = iArr2.length;
        zzafs.zza(length4 == length2);
        this.zza = zztmVar;
        this.zzc = jArr;
        this.zzd = iArr;
        this.zze = i;
        this.zzf = jArr2;
        this.zzg = iArr2;
        this.zzh = j;
        this.zzb = length3;
        if (length4 > 0) {
            int i2 = length4 - 1;
            iArr2[i2] = iArr2[i2] | 536870912;
        }
    }

    public final int zza(long j) {
        for (int zzE = zzaht.zzE(this.zzf, j, true, false); zzE >= 0; zzE--) {
            if ((this.zzg[zzE] & 1) != 0) {
                return zzE;
            }
        }
        return -1;
    }

    public final int zzb(long j) {
        for (int zzF = zzaht.zzF(this.zzf, j, true, false); zzF < this.zzf.length; zzF++) {
            if ((this.zzg[zzF] & 1) != 0) {
                return zzF;
            }
        }
        return -1;
    }
}
