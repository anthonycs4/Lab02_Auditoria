package com.google.android.gms.internal.ads;

import kotlin.UByte;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzlx {
    public static final /* synthetic */ int zza = 0;
    private static final int[] zzb = {1, 2, 3, 6};
    private static final int[] zzc = {48000, 44100, 32000};
    private static final int[] zzd = {24000, 22050, 16000};
    private static final int[] zze = {2, 1, 2, 3, 3, 4, 4, 5};
    private static final int[] zzf = {32, 40, 48, 56, 64, 80, 96, 112, 128, 160, 192, 224, 256, 320, 384, 448, 512, 576, 640};
    private static final int[] zzg = {69, 87, 104, 121, 139, 174, 208, 243, 278, 348, 417, 487, 557, 696, 835, 975, 1114, 1253, 1393};

    public static zzjq zza(zzahd zzahdVar, String str, String str2, zzor zzorVar) {
        int i = zzc[(zzahdVar.zzn() & 192) >> 6];
        int zzn = zzahdVar.zzn();
        int i2 = zze[(zzn & 56) >> 3];
        if ((zzn & 4) != 0) {
            i2++;
        }
        zzjp zzjpVar = new zzjp();
        zzjpVar.zza(str);
        zzjpVar.zzj("audio/ac3");
        zzjpVar.zzw(i2);
        zzjpVar.zzx(i);
        zzjpVar.zzm(zzorVar);
        zzjpVar.zzd(str2);
        return zzjpVar.zzD();
    }

    public static zzjq zzb(zzahd zzahdVar, String str, String str2, zzor zzorVar) {
        zzahdVar.zzk(2);
        int i = zzc[(zzahdVar.zzn() & 192) >> 6];
        int zzn = zzahdVar.zzn();
        int i2 = zze[(zzn & 14) >> 1];
        if ((zzn & 1) != 0) {
            i2++;
        }
        if (((zzahdVar.zzn() & 30) >> 1) > 0 && (2 & zzahdVar.zzn()) != 0) {
            i2 += 2;
        }
        String str3 = (zzahdVar.zzd() <= 0 || (zzahdVar.zzn() & 1) == 0) ? "audio/eac3" : "audio/eac3-joc";
        zzjp zzjpVar = new zzjp();
        zzjpVar.zza(str);
        zzjpVar.zzj(str3);
        zzjpVar.zzw(i2);
        zzjpVar.zzx(i);
        zzjpVar.zzm(zzorVar);
        zzjpVar.zzd(str2);
        return zzjpVar.zzD();
    }

    public static zzlw zzc(zzahc zzahcVar) {
        String str;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int zzh;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int zzc2 = zzahcVar.zzc();
        zzahcVar.zzf(40);
        int zzh2 = zzahcVar.zzh(5);
        zzahcVar.zzd(zzc2);
        int i11 = -1;
        if (zzh2 > 10) {
            zzahcVar.zzf(16);
            int zzh3 = zzahcVar.zzh(2);
            if (zzh3 == 0) {
                i11 = 0;
            } else if (zzh3 == 1) {
                i11 = 1;
            } else if (zzh3 == 2) {
                i11 = 2;
            }
            zzahcVar.zzf(3);
            int zzh4 = zzahcVar.zzh(11) + 1;
            int i12 = zzh4 + zzh4;
            int zzh5 = zzahcVar.zzh(2);
            if (zzh5 == 3) {
                i7 = zzd[zzahcVar.zzh(2)];
                zzh = 3;
                i6 = 6;
            } else {
                zzh = zzahcVar.zzh(2);
                i6 = zzb[zzh];
                i7 = zzc[zzh5];
            }
            int i13 = i6 * 256;
            int zzh6 = zzahcVar.zzh(3);
            boolean zzg2 = zzahcVar.zzg();
            int i14 = zze[zzh6] + (zzg2 ? 1 : 0);
            zzahcVar.zzf(10);
            if (zzahcVar.zzg()) {
                zzahcVar.zzf(8);
            }
            if (zzh6 == 0) {
                zzahcVar.zzf(5);
                if (zzahcVar.zzg()) {
                    zzahcVar.zzf(8);
                }
                i8 = 0;
                zzh6 = 0;
            } else {
                i8 = zzh6;
            }
            if (i11 == 1) {
                if (zzahcVar.zzg()) {
                    zzahcVar.zzf(16);
                }
                i9 = 1;
            } else {
                i9 = i11;
            }
            if (zzahcVar.zzg()) {
                if (i8 > 2) {
                    zzahcVar.zzf(2);
                }
                if ((i8 & 1) != 0 && i8 > 2) {
                    zzahcVar.zzf(6);
                }
                if ((i8 & 4) != 0) {
                    zzahcVar.zzf(6);
                }
                if (zzg2 && zzahcVar.zzg()) {
                    zzahcVar.zzf(5);
                }
                if (i9 == 0) {
                    if (zzahcVar.zzg()) {
                        zzahcVar.zzf(6);
                    }
                    if (i8 == 0 && zzahcVar.zzg()) {
                        zzahcVar.zzf(6);
                    }
                    if (zzahcVar.zzg()) {
                        zzahcVar.zzf(6);
                    }
                    int zzh7 = zzahcVar.zzh(2);
                    if (zzh7 == 1) {
                        zzahcVar.zzf(5);
                    } else if (zzh7 == 2) {
                        zzahcVar.zzf(12);
                    } else if (zzh7 == 3) {
                        int zzh8 = zzahcVar.zzh(5);
                        if (zzahcVar.zzg()) {
                            zzahcVar.zzf(5);
                            if (zzahcVar.zzg()) {
                                zzahcVar.zzf(4);
                            }
                            if (zzahcVar.zzg()) {
                                zzahcVar.zzf(4);
                            }
                            if (zzahcVar.zzg()) {
                                zzahcVar.zzf(4);
                            }
                            if (zzahcVar.zzg()) {
                                zzahcVar.zzf(4);
                            }
                            if (zzahcVar.zzg()) {
                                zzahcVar.zzf(4);
                            }
                            if (zzahcVar.zzg()) {
                                zzahcVar.zzf(4);
                            }
                            if (zzahcVar.zzg()) {
                                zzahcVar.zzf(4);
                            }
                            if (zzahcVar.zzg()) {
                                if (zzahcVar.zzg()) {
                                    zzahcVar.zzf(4);
                                }
                                if (zzahcVar.zzg()) {
                                    zzahcVar.zzf(4);
                                }
                            }
                        }
                        if (zzahcVar.zzg()) {
                            zzahcVar.zzf(5);
                            if (zzahcVar.zzg()) {
                                zzahcVar.zzf(7);
                                if (zzahcVar.zzg()) {
                                    zzahcVar.zzf(8);
                                    zzahcVar.zzf((zzh8 + 2) * 8);
                                    zzahcVar.zzj();
                                }
                            }
                        }
                        zzahcVar.zzf((zzh8 + 2) * 8);
                        zzahcVar.zzj();
                    }
                    if (i8 < 2) {
                        if (zzahcVar.zzg()) {
                            zzahcVar.zzf(14);
                        }
                        if (zzh6 == 0 && zzahcVar.zzg()) {
                            zzahcVar.zzf(14);
                        }
                    }
                    if (zzahcVar.zzg()) {
                        if (zzh == 0) {
                            zzahcVar.zzf(5);
                            i9 = 0;
                            zzh = 0;
                        } else {
                            for (int i15 = 0; i15 < i6; i15++) {
                                if (zzahcVar.zzg()) {
                                    zzahcVar.zzf(5);
                                }
                            }
                        }
                    }
                    i9 = 0;
                }
            }
            if (zzahcVar.zzg()) {
                zzahcVar.zzf(5);
                if (i8 == 2) {
                    zzahcVar.zzf(4);
                    i8 = 2;
                }
                if (i8 >= 6) {
                    zzahcVar.zzf(2);
                }
                if (zzahcVar.zzg()) {
                    i10 = 8;
                    zzahcVar.zzf(8);
                } else {
                    i10 = 8;
                }
                if (i8 == 0 && zzahcVar.zzg()) {
                    zzahcVar.zzf(i10);
                }
                if (zzh5 < 3) {
                    zzahcVar.zze();
                }
            }
            if (i9 == 0 && zzh != 3) {
                zzahcVar.zze();
            }
            if (i9 == 2 && (zzh == 3 || zzahcVar.zzg())) {
                zzahcVar.zzf(6);
            }
            str = (zzahcVar.zzg() && zzahcVar.zzh(6) == 1 && zzahcVar.zzh(8) == 1) ? "audio/eac3-joc" : "audio/eac3";
            i4 = i11;
            i = i12;
            i5 = i13;
            i2 = i7;
            i3 = i14;
        } else {
            zzahcVar.zzf(32);
            int zzh9 = zzahcVar.zzh(2);
            String str2 = zzh9 == 3 ? null : "audio/ac3";
            int zze2 = zze(zzh9, zzahcVar.zzh(6));
            zzahcVar.zzf(8);
            int zzh10 = zzahcVar.zzh(3);
            if ((zzh10 & 1) != 0 && zzh10 != 1) {
                zzahcVar.zzf(2);
            }
            if ((zzh10 & 4) != 0) {
                zzahcVar.zzf(2);
            }
            if (zzh10 == 2) {
                zzahcVar.zzf(2);
            }
            str = str2;
            i = zze2;
            i2 = zzh9 < 3 ? zzc[zzh9] : -1;
            i3 = zze[zzh10] + (zzahcVar.zzg() ? 1 : 0);
            i4 = -1;
            i5 = 1536;
        }
        return new zzlw(str, i4, i3, i2, i, i5, null);
    }

    public static int zzd(byte[] bArr) {
        if (bArr.length < 6) {
            return -1;
        }
        if (((bArr[5] & 248) >> 3) > 10) {
            int i = ((bArr[3] & UByte.MAX_VALUE) | ((bArr[2] & 7) << 8)) + 1;
            return i + i;
        }
        byte b = bArr[4];
        return zze((b & 192) >> 6, b & 63);
    }

    private static int zze(int i, int i2) {
        int i3 = i2 / 2;
        if (i < 0 || i >= 3 || i2 < 0 || i3 >= 19) {
            return -1;
        }
        int i4 = zzc[i];
        if (i4 == 44100) {
            int i5 = zzg[i3] + (i2 & 1);
            return i5 + i5;
        }
        int i6 = zzf[i3];
        return i4 == 32000 ? i6 * 6 : i6 * 4;
    }
}
