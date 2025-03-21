package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zznw {
    public int zza;
    public String zzb;
    public int zzc;
    public int zzd;
    public int zze;
    public int zzf;
    public int zzg;

    public final boolean zza(int i) {
        boolean zzl;
        int i2;
        int i3;
        int i4;
        int i5;
        String[] strArr;
        int[] iArr;
        int zzm;
        int[] iArr2;
        int[] iArr3;
        int i6;
        int[] iArr4;
        int[] iArr5;
        int i7;
        int[] iArr6;
        zzl = zznx.zzl(i);
        if (!zzl || (i2 = (i >>> 19) & 3) == 1 || (i3 = (i >>> 17) & 3) == 0 || (i4 = (i >>> 12) & 15) == 0 || i4 == 15 || (i5 = (i >>> 10) & 3) == 3) {
            return false;
        }
        this.zza = i2;
        strArr = zznx.zza;
        this.zzb = strArr[3 - i3];
        iArr = zznx.zzb;
        int i8 = iArr[i5];
        this.zzd = i8;
        if (i2 == 2) {
            this.zzd = i8 / 2;
        } else if (i2 == 0) {
            this.zzd = i8 / 4;
        }
        int i9 = (i >>> 9) & 1;
        zzm = zznx.zzm(i2, i3);
        this.zzg = zzm;
        if (i3 == 3) {
            if (i2 == 3) {
                iArr6 = zznx.zzc;
                i7 = iArr6[i4 - 1];
            } else {
                iArr5 = zznx.zzd;
                i7 = iArr5[i4 - 1];
            }
            this.zzf = i7;
            this.zzc = (((i7 * 12) / this.zzd) + i9) * 4;
        } else {
            if (i2 == 3) {
                if (i3 == 2) {
                    iArr4 = zznx.zze;
                    i6 = iArr4[i4 - 1];
                } else {
                    iArr3 = zznx.zzf;
                    i6 = iArr3[i4 - 1];
                }
                this.zzf = i6;
                this.zzc = ((i6 * 144) / this.zzd) + i9;
            } else {
                iArr2 = zznx.zzg;
                int i10 = iArr2[i4 - 1];
                this.zzf = i10;
                this.zzc = (((i3 == 1 ? 72 : 144) * i10) / this.zzd) + i9;
            }
        }
        this.zze = ((i >> 6) & 3) == 3 ? 1 : 2;
        return true;
    }
}
