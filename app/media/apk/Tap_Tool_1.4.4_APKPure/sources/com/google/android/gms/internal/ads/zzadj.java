package com.google.android.gms.internal.ads;

import android.util.Pair;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public abstract class zzadj extends zzadp {
    private zzadi zza;

    protected abstract Pair<zzli[], zzacs[]> zzc(zzadi zzadiVar, int[][][] iArr, int[] iArr2, zzaaj zzaajVar, zzlq zzlqVar) throws zzid;

    @Override // com.google.android.gms.internal.ads.zzadp
    public final void zzi(Object obj) {
        this.zza = (zzadi) obj;
    }

    @Override // com.google.android.gms.internal.ads.zzadp
    public final zzadq zzj(zzlh[] zzlhVarArr, zzach zzachVar, zzaaj zzaajVar, zzlq zzlqVar) throws zzid {
        int[] iArr;
        int[] iArr2 = new int[3];
        zzacf[][] zzacfVarArr = new zzacf[3];
        int[][][] iArr3 = new int[3][];
        int i = 0;
        for (int i2 = 0; i2 < 3; i2++) {
            int i3 = zzachVar.zzb;
            zzacfVarArr[i2] = new zzacf[i3];
            iArr3[i2] = new int[i3];
        }
        int i4 = 2;
        int[] iArr4 = new int[2];
        for (int i5 = 0; i5 < 2; i5++) {
            iArr4[i5] = zzlhVarArr[i5].zzs();
        }
        int i6 = 0;
        while (i6 < zzachVar.zzb) {
            zzacf zza = zzachVar.zza(i6);
            int zzf = zzags.zzf(zza.zza(i).zzl);
            int i7 = 0;
            int i8 = 2;
            int i9 = 0;
            boolean z = true;
            while (i7 < i4) {
                zzlh zzlhVar = zzlhVarArr[i7];
                int i10 = 0;
                while (i < zza.zza) {
                    i10 = Math.max(i10, zzlhVar.zzN(zza.zza(i)) & 7);
                    i++;
                }
                boolean z2 = iArr2[i7] == 0;
                if (i10 > i9) {
                    z = z2;
                    i9 = i10;
                    i8 = i7;
                } else if (i10 == i9 && zzf == 5 && !z && z2) {
                    i9 = i10;
                    i8 = i7;
                    z = true;
                }
                i7++;
                i4 = 2;
                i = 0;
            }
            if (i8 == i4) {
                iArr = new int[zza.zza];
            } else {
                zzlh zzlhVar2 = zzlhVarArr[i8];
                int[] iArr5 = new int[zza.zza];
                for (int i11 = 0; i11 < zza.zza; i11++) {
                    iArr5[i11] = zzlhVar2.zzN(zza.zza(i11));
                }
                iArr = iArr5;
            }
            int i12 = iArr2[i8];
            zzacfVarArr[i8][i12] = zza;
            iArr3[i8][i12] = iArr;
            iArr2[i8] = i12 + 1;
            i6++;
            i4 = 2;
            i = 0;
        }
        zzach[] zzachVarArr = new zzach[i4];
        String[] strArr = new String[i4];
        int[] iArr6 = new int[i4];
        int i13 = 0;
        while (i13 < i4) {
            int i14 = iArr2[i13];
            zzachVarArr[i13] = new zzach((zzacf[]) zzaht.zzf(zzacfVarArr[i13], i14));
            iArr3[i13] = (int[][]) zzaht.zzf(iArr3[i13], i14);
            strArr[i13] = zzlhVarArr[i13].zzJ();
            iArr6[i13] = zzlhVarArr[i13].zza();
            i13++;
            i4 = 2;
        }
        zzadi zzadiVar = new zzadi(strArr, iArr6, zzachVarArr, iArr4, iArr3, new zzach((zzacf[]) zzaht.zzf(zzacfVarArr[2], iArr2[2])));
        Pair<zzli[], zzacs[]> zzc = zzc(zzadiVar, iArr3, iArr4, zzaajVar, zzlqVar);
        return new zzadq((zzli[]) zzc.first, (zzacs[]) zzc.second, zzadiVar, null);
    }
}
