package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzacq extends zzacs {
    private final zzadx zzd;
    private final zzfgz<zzaco> zze;
    private final zzaft zzf;

    /* JADX INFO: Access modifiers changed from: protected */
    public zzacq(zzacf zzacfVar, int[] iArr, int i, zzadx zzadxVar, long j, long j2, long j3, float f, float f2, List<zzaco> list, zzaft zzaftVar) {
        super(zzacfVar, iArr, i);
        this.zzd = zzadxVar;
        this.zze = zzfgz.zzp(list);
        this.zzf = zzaftVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ zzfgz zza(zzadg[] zzadgVarArr) {
        int length;
        int i;
        int[] iArr;
        int[] iArr2;
        ArrayList arrayList = new ArrayList();
        char c = 0;
        int i2 = 0;
        while (true) {
            length = zzadgVarArr.length;
            i = 1;
            if (i2 >= length) {
                break;
            }
            zzadg zzadgVar = zzadgVarArr[i2];
            if (zzadgVar == null || zzadgVar.zzb.length <= 1) {
                arrayList.add(null);
            } else {
                zzfgw zzu = zzfgz.zzu();
                zzu.zze((zzfgw) new zzaco(0L, 0L));
                arrayList.add(zzu);
            }
            i2++;
        }
        long[][] jArr = new long[length];
        for (int i3 = 0; i3 < zzadgVarArr.length; i3++) {
            zzadg zzadgVar2 = zzadgVarArr[i3];
            if (zzadgVar2 == null) {
                jArr[i3] = new long[0];
            } else {
                jArr[i3] = new long[zzadgVar2.zzb.length];
                int i4 = 0;
                while (true) {
                    if (i4 >= zzadgVar2.zzb.length) {
                        break;
                    }
                    jArr[i3][i4] = zzadgVar2.zza.zza(iArr2[i4]).zzh;
                    i4++;
                }
                Arrays.sort(jArr[i3]);
            }
        }
        int[] iArr3 = new int[length];
        long[] jArr2 = new long[length];
        for (int i5 = 0; i5 < length; i5++) {
            long[] jArr3 = jArr[i5];
            jArr2[i5] = jArr3.length == 0 ? 0L : jArr3[0];
        }
        zzf(arrayList, jArr2);
        zzfho zza = zzfig.zzc(zzfil.zzb()).zzb(2).zza();
        int i6 = 0;
        while (i6 < length) {
            int length2 = jArr[i6].length;
            if (length2 <= i) {
                iArr = iArr3;
            } else {
                double[] dArr = new double[length2];
                int i7 = 0;
                while (true) {
                    long[] jArr4 = jArr[i6];
                    double d = 0.0d;
                    if (i7 >= jArr4.length) {
                        break;
                    }
                    int[] iArr4 = iArr3;
                    long j = jArr4[i7];
                    if (j != -1) {
                        d = Math.log(j);
                    }
                    dArr[i7] = d;
                    i7++;
                    iArr3 = iArr4;
                }
                iArr = iArr3;
                int i8 = length2 - 1;
                double d2 = dArr[i8] - dArr[c];
                int i9 = 0;
                while (i9 < i8) {
                    int i10 = i9 + 1;
                    zza.zze(Double.valueOf(d2 == 0.0d ? 1.0d : (((dArr[i9] + dArr[i10]) * 0.5d) - dArr[c]) / d2), Integer.valueOf(i6));
                    i9 = i10;
                    c = 0;
                }
            }
            i6++;
            iArr3 = iArr;
            c = 0;
            i = 1;
        }
        int[] iArr5 = iArr3;
        zzfgz zzp = zzfgz.zzp(zza.zzv());
        for (int i11 = 0; i11 < zzp.size(); i11++) {
            int intValue = ((Integer) zzp.get(i11)).intValue();
            int i12 = iArr5[intValue] + 1;
            iArr5[intValue] = i12;
            jArr2[intValue] = jArr[intValue][i12];
            zzf(arrayList, jArr2);
        }
        for (int i13 = 0; i13 < zzadgVarArr.length; i13++) {
            if (arrayList.get(i13) != null) {
                long j2 = jArr2[i13];
                jArr2[i13] = j2 + j2;
            }
        }
        zzf(arrayList, jArr2);
        zzfgw zzu2 = zzfgz.zzu();
        for (int i14 = 0; i14 < arrayList.size(); i14++) {
            zzfgw zzfgwVar = (zzfgw) arrayList.get(i14);
            zzu2.zze((zzfgw) (zzfgwVar == null ? zzfgz.zzi() : zzfgwVar.zzf()));
        }
        return zzu2.zzf();
    }

    private static void zzf(List<zzfgw<zzaco>> list, long[] jArr) {
        long j = 0;
        for (long j2 : jArr) {
            j += j2;
        }
        for (int i = 0; i < list.size(); i++) {
            zzfgw<zzaco> zzfgwVar = list.get(i);
            if (zzfgwVar != null) {
                zzfgwVar.zze((zzfgw<zzaco>) new zzaco(j, jArr[i]));
            }
        }
    }
}
