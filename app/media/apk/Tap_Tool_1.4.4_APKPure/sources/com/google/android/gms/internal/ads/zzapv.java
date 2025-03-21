package com.google.android.gms.internal.ads;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import java.util.Arrays;
import java.util.Map;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public abstract class zzapv extends zzapz {
    private final SparseArray<Map<zzapl, zzapu>> zza = new SparseArray<>();
    private final SparseBooleanArray zzb = new SparseBooleanArray();
    private zzapt zzc;

    protected abstract zzapp[] zzb(zzajz[] zzajzVarArr, zzapl[] zzaplVarArr, int[][][] iArr) throws zzajf;

    public final void zzc(int i, boolean z) {
        if (this.zzb.get(i) == z) {
            return;
        }
        this.zzb.put(i, z);
        zzg();
    }

    @Override // com.google.android.gms.internal.ads.zzapz
    public final zzaqa zzd(zzajz[] zzajzVarArr, zzapl zzaplVar) throws zzajf {
        int[] iArr;
        int[] iArr2 = new int[3];
        zzapk[][] zzapkVarArr = new zzapk[3];
        int[][][] iArr3 = new int[3][];
        for (int i = 0; i < 3; i++) {
            int i2 = zzaplVar.zzb;
            zzapkVarArr[i] = new zzapk[i2];
            iArr3[i] = new int[i2];
        }
        int i3 = 2;
        int[] iArr4 = new int[2];
        for (int i4 = 0; i4 < 2; i4++) {
            zzajzVarArr[i4].zzq();
            iArr4[i4] = 4;
        }
        int i5 = 0;
        while (i5 < zzaplVar.zzb) {
            zzapk zza = zzaplVar.zza(i5);
            int i6 = 0;
            int i7 = 0;
            int i8 = 2;
            while (true) {
                if (i6 >= i3) {
                    i6 = i8;
                    break;
                }
                zzajz zzajzVar = zzajzVarArr[i6];
                for (int i9 = 0; i9 < zza.zza; i9++) {
                    int zzG = zzajzVar.zzG(zza.zza(i9)) & 3;
                    if (zzG > i7) {
                        if (zzG == 3) {
                            break;
                        }
                        i8 = i6;
                        i7 = zzG;
                    }
                }
                i6++;
                i3 = 2;
            }
            if (i6 == 2) {
                iArr = new int[zza.zza];
            } else {
                zzajz zzajzVar2 = zzajzVarArr[i6];
                int[] iArr5 = new int[zza.zza];
                for (int i10 = 0; i10 < zza.zza; i10++) {
                    iArr5[i10] = zzajzVar2.zzG(zza.zza(i10));
                }
                iArr = iArr5;
            }
            int i11 = iArr2[i6];
            zzapkVarArr[i6][i11] = zza;
            iArr3[i6][i11] = iArr;
            iArr2[i6] = i11 + 1;
            i5++;
            i3 = 2;
        }
        zzapl[] zzaplVarArr = new zzapl[2];
        int[] iArr6 = new int[2];
        int i12 = 0;
        for (int i13 = 2; i12 < i13; i13 = 2) {
            int i14 = iArr2[i12];
            zzaplVarArr[i12] = new zzapl((zzapk[]) Arrays.copyOf(zzapkVarArr[i12], i14));
            iArr3[i12] = (int[][]) Arrays.copyOf(iArr3[i12], i14);
            iArr6[i12] = zzajzVarArr[i12].zza();
            i12++;
        }
        zzapl zzaplVar2 = new zzapl((zzapk[]) Arrays.copyOf(zzapkVarArr[2], iArr2[2]));
        zzapp[] zzb = zzb(zzajzVarArr, zzaplVarArr, iArr3);
        int i15 = 0;
        for (int i16 = 2; i15 < i16; i16 = 2) {
            if (this.zzb.get(i15)) {
                zzb[i15] = null;
            } else {
                zzapl zzaplVar3 = zzaplVarArr[i15];
                Map<zzapl, zzapu> map = this.zza.get(i15);
                if ((map == null ? null : map.get(zzaplVar3)) != null) {
                    throw null;
                }
            }
            i15++;
        }
        zzapt zzaptVar = new zzapt(iArr6, zzaplVarArr, iArr4, iArr3, zzaplVar2);
        zzaka[] zzakaVarArr = new zzaka[2];
        for (int i17 = 0; i17 < 2; i17++) {
            zzakaVarArr[i17] = zzb[i17] != null ? zzaka.zza : null;
        }
        return new zzaqa(zzaplVar, new zzapx(zzb, null), zzaptVar, zzakaVarArr);
    }

    @Override // com.google.android.gms.internal.ads.zzapz
    public final void zze(Object obj) {
        this.zzc = (zzapt) obj;
    }
}
