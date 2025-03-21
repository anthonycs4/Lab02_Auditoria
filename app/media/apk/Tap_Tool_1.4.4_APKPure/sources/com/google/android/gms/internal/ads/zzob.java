package com.google.android.gms.internal.ads;

import java.nio.ShortBuffer;
import java.util.Arrays;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
final class zzob {
    private final int zza;
    private final int zzb;
    private final float zzc;
    private final float zzd;
    private final float zze;
    private final int zzf;
    private final int zzg;
    private final int zzh;
    private final short[] zzi;
    private short[] zzj;
    private int zzk;
    private short[] zzl;
    private int zzm;
    private short[] zzn;
    private int zzo;
    private int zzp;
    private int zzq;
    private int zzr;
    private int zzs;
    private int zzt;
    private int zzu;
    private int zzv;

    public zzob(int i, int i2, float f, float f2, int i3) {
        this.zza = i;
        this.zzb = i2;
        this.zzc = f;
        this.zzd = f2;
        this.zze = i / i3;
        this.zzf = i / 400;
        int i4 = i / 65;
        this.zzg = i4;
        int i5 = i4 + i4;
        this.zzh = i5;
        this.zzi = new short[i5];
        int i6 = i5 * i2;
        this.zzj = new short[i6];
        this.zzl = new short[i6];
        this.zzn = new short[i6];
    }

    private final short[] zzg(short[] sArr, int i, int i2) {
        int length = sArr.length;
        int i3 = this.zzb;
        int i4 = length / i3;
        return i + i2 <= i4 ? sArr : Arrays.copyOf(sArr, (((i4 * 3) / 2) + i2) * i3);
    }

    private final void zzh(short[] sArr, int i, int i2) {
        short[] zzg = zzg(this.zzl, this.zzm, i2);
        this.zzl = zzg;
        int i3 = this.zzb;
        System.arraycopy(sArr, i * i3, zzg, this.zzm * i3, i3 * i2);
        this.zzm += i2;
    }

    private final void zzi(short[] sArr, int i, int i2) {
        int i3 = this.zzh / i2;
        int i4 = this.zzb;
        int i5 = i2 * i4;
        int i6 = i * i4;
        for (int i7 = 0; i7 < i3; i7++) {
            int i8 = 0;
            for (int i9 = 0; i9 < i5; i9++) {
                i8 += sArr[(i7 * i5) + i6 + i9];
            }
            this.zzi[i7] = (short) (i8 / i5);
        }
    }

    private final int zzj(short[] sArr, int i, int i2, int i3) {
        int i4 = i * this.zzb;
        int i5 = 1;
        int i6 = 255;
        int i7 = 0;
        int i8 = 0;
        while (i2 <= i3) {
            int i9 = 0;
            for (int i10 = 0; i10 < i2; i10++) {
                i9 += Math.abs(sArr[i4 + i10] - sArr[(i4 + i2) + i10]);
            }
            int i11 = i9 * i7;
            int i12 = i5 * i2;
            if (i11 < i12) {
                i5 = i9;
            }
            if (i11 < i12) {
                i7 = i2;
            }
            int i13 = i9 * i6;
            int i14 = i8 * i2;
            if (i13 > i14) {
                i8 = i9;
            }
            if (i13 > i14) {
                i6 = i2;
            }
            i2++;
        }
        this.zzu = i5 / i7;
        this.zzv = i8 / i6;
        return i7;
    }

    private static void zzl(int i, int i2, short[] sArr, int i3, short[] sArr2, int i4, short[] sArr3, int i5) {
        for (int i6 = 0; i6 < i2; i6++) {
            int i7 = (i3 * i2) + i6;
            int i8 = (i5 * i2) + i6;
            int i9 = (i4 * i2) + i6;
            for (int i10 = 0; i10 < i; i10++) {
                sArr[i7] = (short) (((sArr2[i9] * (i - i10)) + (sArr3[i8] * i10)) / i);
                i7 += i2;
                i9 += i2;
                i8 += i2;
            }
        }
    }

    public final int zza() {
        int i = this.zzk * this.zzb;
        return i + i;
    }

    public final void zzb(ShortBuffer shortBuffer) {
        int remaining = shortBuffer.remaining();
        int i = this.zzb;
        int i2 = remaining / i;
        int i3 = i * i2;
        short[] zzg = zzg(this.zzj, this.zzk, i2);
        this.zzj = zzg;
        shortBuffer.get(zzg, this.zzk * this.zzb, (i3 + i3) / 2);
        this.zzk += i2;
        zzk();
    }

    public final void zzc(ShortBuffer shortBuffer) {
        int min = Math.min(shortBuffer.remaining() / this.zzb, this.zzm);
        shortBuffer.put(this.zzl, 0, this.zzb * min);
        int i = this.zzm - min;
        this.zzm = i;
        short[] sArr = this.zzl;
        int i2 = this.zzb;
        System.arraycopy(sArr, min * i2, sArr, 0, i * i2);
    }

    public final void zzd() {
        int i;
        int i2 = this.zzk;
        float f = this.zzc;
        float f2 = this.zzd;
        int i3 = this.zzm + ((int) ((((i2 / (f / f2)) + this.zzo) / (this.zze * f2)) + 0.5f));
        short[] sArr = this.zzj;
        int i4 = this.zzh;
        this.zzj = zzg(sArr, i2, i4 + i4 + i2);
        int i5 = 0;
        while (true) {
            int i6 = this.zzh;
            i = i6 + i6;
            int i7 = this.zzb;
            if (i5 >= i * i7) {
                break;
            }
            this.zzj[(i7 * i2) + i5] = 0;
            i5++;
        }
        this.zzk += i;
        zzk();
        if (this.zzm > i3) {
            this.zzm = i3;
        }
        this.zzk = 0;
        this.zzr = 0;
        this.zzo = 0;
    }

    public final void zze() {
        this.zzk = 0;
        this.zzm = 0;
        this.zzo = 0;
        this.zzp = 0;
        this.zzq = 0;
        this.zzr = 0;
        this.zzs = 0;
        this.zzt = 0;
        this.zzu = 0;
        this.zzv = 0;
    }

    public final int zzf() {
        int i = this.zzm * this.zzb;
        return i + i;
    }

    private final void zzk() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9 = this.zzm;
        float f = this.zzc;
        float f2 = this.zzd;
        float f3 = f / f2;
        float f4 = this.zze * f2;
        double d = f3;
        float f5 = 1.0f;
        int i10 = 1;
        if (d > 1.00001d || d < 0.99999d) {
            int i11 = this.zzk;
            if (i11 >= this.zzh) {
                int i12 = 0;
                while (true) {
                    int i13 = this.zzr;
                    if (i13 > 0) {
                        int min = Math.min(this.zzh, i13);
                        zzh(this.zzj, i12, min);
                        this.zzr -= min;
                        i12 += min;
                    } else {
                        short[] sArr = this.zzj;
                        int i14 = this.zza;
                        int i15 = i14 > 4000 ? i14 / 4000 : 1;
                        if (this.zzb == i10 && i15 == i10) {
                            i = zzj(sArr, i12, this.zzf, this.zzg);
                        } else {
                            zzi(sArr, i12, i15);
                            int zzj = zzj(this.zzi, 0, this.zzf / i15, this.zzg / i15);
                            if (i15 != i10) {
                                int i16 = zzj * i15;
                                int i17 = i15 * 4;
                                int i18 = i16 - i17;
                                int i19 = i16 + i17;
                                int i20 = this.zzf;
                                if (i18 < i20) {
                                    i18 = i20;
                                }
                                int i21 = this.zzg;
                                if (i19 > i21) {
                                    i19 = i21;
                                }
                                if (this.zzb == i10) {
                                    i = zzj(sArr, i12, i18, i19);
                                } else {
                                    zzi(sArr, i12, i10);
                                    i = zzj(this.zzi, 0, i18, i19);
                                }
                            } else {
                                i = zzj;
                            }
                        }
                        int i22 = this.zzu;
                        int i23 = (i22 == 0 || (i4 = this.zzs) == 0 || this.zzv > i22 * 3 || i22 + i22 <= this.zzt * 3) ? i : i4;
                        this.zzt = i22;
                        this.zzs = i;
                        if (d > 1.0d) {
                            short[] sArr2 = this.zzj;
                            if (f3 >= 2.0f) {
                                i3 = (int) (i23 / ((-1.0f) + f3));
                            } else {
                                this.zzr = (int) ((i23 * (2.0f - f3)) / ((-1.0f) + f3));
                                i3 = i23;
                            }
                            short[] zzg = zzg(this.zzl, this.zzm, i3);
                            this.zzl = zzg;
                            int i24 = i3;
                            zzl(i3, this.zzb, zzg, this.zzm, sArr2, i12, sArr2, i12 + i23);
                            this.zzm += i24;
                            i12 += i23 + i24;
                        } else {
                            int i25 = i23;
                            short[] sArr3 = this.zzj;
                            if (f3 < 0.5f) {
                                i2 = (int) ((i25 * f3) / (f5 - f3));
                            } else {
                                this.zzr = (int) ((i25 * ((f3 + f3) - 1.0f)) / (f5 - f3));
                                i2 = i25;
                            }
                            int i26 = i25 + i2;
                            short[] zzg2 = zzg(this.zzl, this.zzm, i26);
                            this.zzl = zzg2;
                            int i27 = this.zzb;
                            System.arraycopy(sArr3, i12 * i27, zzg2, this.zzm * i27, i27 * i25);
                            zzl(i2, this.zzb, this.zzl, this.zzm + i25, sArr3, i12 + i25, sArr3, i12);
                            this.zzm += i26;
                            i12 += i2;
                        }
                    }
                    if (this.zzh + i12 > i11) {
                        break;
                    }
                    f5 = 1.0f;
                    i10 = 1;
                }
                int i28 = this.zzk - i12;
                short[] sArr4 = this.zzj;
                int i29 = this.zzb;
                System.arraycopy(sArr4, i12 * i29, sArr4, 0, i29 * i28);
                this.zzk = i28;
                f5 = 1.0f;
            }
        } else {
            zzh(this.zzj, 0, this.zzk);
            this.zzk = 0;
        }
        if (f4 == f5 || this.zzm == i9) {
            return;
        }
        int i30 = this.zza;
        int i31 = (int) (i30 / f4);
        while (true) {
            if (i31 <= 16384 && i30 <= 16384) {
                break;
            }
            i31 /= 2;
            i30 /= 2;
        }
        int i32 = this.zzm - i9;
        short[] zzg3 = zzg(this.zzn, this.zzo, i32);
        this.zzn = zzg3;
        short[] sArr5 = this.zzl;
        int i33 = this.zzb;
        System.arraycopy(sArr5, i9 * i33, zzg3, this.zzo * i33, i33 * i32);
        this.zzm = i9;
        this.zzo += i32;
        int i34 = 0;
        while (true) {
            i5 = this.zzo;
            i6 = i5 - 1;
            if (i34 >= i6) {
                break;
            }
            while (true) {
                i7 = this.zzp + 1;
                i8 = this.zzq;
                if (i7 * i31 <= i8 * i30) {
                    break;
                }
                this.zzl = zzg(this.zzl, this.zzm, 1);
                int i35 = 0;
                while (true) {
                    int i36 = this.zzb;
                    if (i35 < i36) {
                        short[] sArr6 = this.zzl;
                        int i37 = this.zzm;
                        short[] sArr7 = this.zzn;
                        int i38 = (i34 * i36) + i35;
                        short s = sArr7[i38];
                        short s2 = sArr7[i38 + i36];
                        int i39 = this.zzq;
                        int i40 = this.zzp;
                        int i41 = (i40 + 1) * i31;
                        int i42 = i41 - (i39 * i30);
                        int i43 = i41 - (i40 * i31);
                        sArr6[(i37 * i36) + i35] = (short) (((s * i42) + ((i43 - i42) * s2)) / i43);
                        i35++;
                    }
                }
                this.zzq++;
                this.zzm++;
            }
            this.zzp = i7;
            if (i7 == i30) {
                this.zzp = 0;
                zzafs.zzd(i8 == i31);
                this.zzq = 0;
            }
            i34++;
        }
        if (i6 != 0) {
            short[] sArr8 = this.zzn;
            int i44 = this.zzb;
            System.arraycopy(sArr8, i6 * i44, sArr8, 0, (i5 - i6) * i44);
            this.zzo -= i6;
        }
    }
}
