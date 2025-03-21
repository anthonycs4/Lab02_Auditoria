package com.google.android.gms.internal.ads;

import java.io.IOException;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
final class zztl {
    private static final int[] zza = {1769172845, 1769172786, 1769172787, 1769172788, 1769172789, 1769172790, 1769172793, 1635148593, 1752589105, 1751479857, 1635135537, 1836069937, 1836069938, 862401121, 862401122, 862417462, 862417718, 862414134, 862414646, 1295275552, 1295270176, 1714714144, 1801741417, 1295275600, 1903435808, 1297305174, 1684175153, 1769172332, 1885955686};

    public static boolean zza(zzps zzpsVar) throws IOException {
        return zzc(zzpsVar, true, false);
    }

    public static boolean zzb(zzps zzpsVar, boolean z) throws IOException {
        return zzc(zzpsVar, false, false);
    }

    private static boolean zzc(zzps zzpsVar, boolean z, boolean z2) throws IOException {
        boolean z3;
        long zzo = zzpsVar.zzo();
        long j = -1;
        long j2 = 4096;
        int i = (zzo > (-1L) ? 1 : (zzo == (-1L) ? 0 : -1));
        if (i != 0 && zzo <= 4096) {
            j2 = zzo;
        }
        int i2 = (int) j2;
        zzahd zzahdVar = new zzahd(64);
        boolean z4 = false;
        int i3 = 0;
        boolean z5 = false;
        while (i3 < i2) {
            zzahdVar.zza(8);
            if (!zzpsVar.zzh(zzahdVar.zzi(), z4 ? 1 : 0, 8, true)) {
                break;
            }
            long zzt = zzahdVar.zzt();
            int zzv = zzahdVar.zzv();
            int i4 = 16;
            if (zzt == 1) {
                zzpsVar.zzi(zzahdVar.zzi(), 8, 8);
                zzahdVar.zzf(16);
                zzt = zzahdVar.zzx();
            } else {
                if (zzt == 0) {
                    long zzo2 = zzpsVar.zzo();
                    if (zzo2 != j) {
                        zzt = (zzo2 - zzpsVar.zzm()) + 8;
                    }
                }
                i4 = 8;
            }
            long j3 = i4;
            if (zzt < j3) {
                return z4;
            }
            i3 += i4;
            if (zzv == 1836019574) {
                i2 += (int) zzt;
                if (i != 0 && i2 > zzo) {
                    i2 = (int) zzo;
                }
                j = -1;
            } else if (zzv == 1836019558 || zzv == 1836475768) {
                z3 = true;
                break;
            } else {
                long j4 = zzo;
                if ((i3 + zzt) - j3 >= i2) {
                    break;
                }
                int i5 = (int) (zzt - j3);
                i3 += i5;
                if (zzv == 1718909296) {
                    if (i5 < 8) {
                        return false;
                    }
                    zzahdVar.zza(i5);
                    zzpsVar.zzi(zzahdVar.zzi(), 0, i5);
                    int i6 = i5 >> 2;
                    for (int i7 = 0; i7 < i6; i7++) {
                        if (i7 == 1) {
                            zzahdVar.zzk(4);
                        } else {
                            int zzv2 = zzahdVar.zzv();
                            if ((zzv2 >>> 8) != 3368816) {
                                if (zzv2 == 1751476579) {
                                    zzv2 = 1751476579;
                                }
                                int[] iArr = zza;
                                for (int i8 = 0; i8 < 29; i8++) {
                                    if (iArr[i8] != zzv2) {
                                    }
                                }
                                continue;
                            }
                            z5 = true;
                            break;
                        }
                    }
                    if (!z5) {
                        return false;
                    }
                } else if (i5 != 0) {
                    zzpsVar.zzk(i5);
                }
                zzo = j4;
                j = -1;
                z4 = false;
            }
        }
        z3 = false;
        return z5 && z == z3;
    }
}
