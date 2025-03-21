package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzapr extends zzapv {
    private final AtomicReference<zzapq> zza;

    public zzapr() {
        this(null);
    }

    protected static boolean zza(int i, boolean z) {
        int i2 = i & 3;
        return i2 == 3 || (z && i2 == 2);
    }

    private static int zzh(int i, int i2) {
        if (i == -1) {
            return i2 != -1 ? -1 : 0;
        } else if (i2 == -1) {
            return 1;
        } else {
            return i - i2;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzapv
    protected final zzapp[] zzb(zzajz[] zzajzVarArr, zzapl[] zzaplVarArr, int[][][] iArr) throws zzajf {
        zzapk zzapkVar;
        int[] iArr2;
        ArrayList arrayList;
        boolean z;
        boolean z2;
        int i;
        int zzh;
        int i2 = 2;
        zzapp[] zzappVarArr = new zzapp[2];
        zzapq zzapqVar = this.zza.get();
        int i3 = 0;
        boolean z3 = false;
        while (true) {
            int i4 = -1;
            if (i3 >= i2) {
                break;
            }
            if (zzajzVarArr[i3].zza() == i2) {
                if (!z3) {
                    zzajz zzajzVar = zzajzVarArr[i3];
                    zzapl zzaplVar = zzaplVarArr[i3];
                    int[][] iArr3 = iArr[i3];
                    int i5 = zzapqVar.zzd;
                    int i6 = zzapqVar.zze;
                    int i7 = zzapqVar.zzf;
                    boolean z4 = zzapqVar.zzc;
                    boolean z5 = zzapqVar.zzb;
                    int i8 = zzapqVar.zzi;
                    int i9 = zzapqVar.zzj;
                    boolean z6 = zzapqVar.zzk;
                    boolean z7 = zzapqVar.zzg;
                    boolean z8 = zzapqVar.zzh;
                    int i10 = -1;
                    zzapk zzapkVar2 = null;
                    int i11 = 0;
                    int i12 = 0;
                    for (int i13 = 0; i13 < zzaplVar.zzb; i13++) {
                        zzapk zza = zzaplVar.zza(i13);
                        ArrayList arrayList2 = new ArrayList(zza.zza);
                        for (int i14 = 0; i14 < zza.zza; i14++) {
                            arrayList2.add(Integer.valueOf(i14));
                        }
                        int[] iArr4 = iArr3[i13];
                        int i15 = 0;
                        while (i15 < zza.zza) {
                            zzapl zzaplVar2 = zzaplVar;
                            if (zza(iArr4[i15], true)) {
                                zzajt zza2 = zza.zza(i15);
                                if (arrayList2.contains(Integer.valueOf(i15))) {
                                    int i16 = zza2.zzj;
                                    int i17 = zza2.zzk;
                                    int i18 = zza2.zzb;
                                    zzapkVar = zza;
                                    z = true;
                                    z2 = true;
                                } else {
                                    zzapkVar = zza;
                                    z = true;
                                    z2 = false;
                                }
                                if (z != z2) {
                                    arrayList = arrayList2;
                                    i = 1;
                                } else {
                                    arrayList = arrayList2;
                                    i = 2;
                                }
                                iArr2 = iArr4;
                                boolean zza3 = zza(iArr4[i15], false);
                                if (zza3) {
                                    i += 1000;
                                }
                                boolean z9 = i > i12;
                                if (i == i12) {
                                    if (zza2.zzk() != i10) {
                                        zzh = zzh(zza2.zzk(), i10);
                                    } else {
                                        zzh = zzh(zza2.zzb, i4);
                                    }
                                    z9 = !(zza3 && z2) ? zzh >= 0 : zzh <= 0;
                                }
                                if (z9) {
                                    i4 = zza2.zzb;
                                    i10 = zza2.zzk();
                                    i12 = i;
                                    i11 = i15;
                                    zzapkVar2 = zzapkVar;
                                }
                            } else {
                                zzapkVar = zza;
                                iArr2 = iArr4;
                                arrayList = arrayList2;
                            }
                            i15++;
                            zzaplVar = zzaplVar2;
                            zza = zzapkVar;
                            arrayList2 = arrayList;
                            iArr4 = iArr2;
                        }
                    }
                    zzaps zzapsVar = zzapkVar2 == null ? null : new zzaps(zzapkVar2, i11, 0, null);
                    zzappVarArr[i3] = zzapsVar;
                    z3 = zzapsVar != null;
                }
                int i19 = zzaplVarArr[i3].zzb;
            }
            i3++;
            i2 = 2;
        }
        int i20 = 0;
        boolean z10 = false;
        while (i20 < i2) {
            if (zzajzVarArr[i20].zza() == 1 && !z10) {
                zzapl zzaplVar3 = zzaplVarArr[i20];
                int[][] iArr5 = iArr[i20];
                String str = zzapqVar.zza;
                boolean z11 = zzapqVar.zzh;
                boolean z12 = zzapqVar.zzb;
                int i21 = 0;
                int i22 = 0;
                int i23 = -1;
                int i24 = -1;
                while (i21 < zzaplVar3.zzb) {
                    zzapk zza4 = zzaplVar3.zza(i21);
                    int[] iArr6 = iArr5[i21];
                    int i25 = i24;
                    int i26 = i23;
                    int i27 = i22;
                    for (int i28 = 0; i28 < zza4.zza; i28++) {
                        if (zza(iArr6[i28], true)) {
                            zzajt zza5 = zza4.zza(i28);
                            int i29 = iArr6[i28];
                            int i30 = 1 != (zza5.zzx & 1) ? 1 : 2;
                            if (zza(i29, false)) {
                                i30 += 1000;
                            }
                            if (i30 > i27) {
                                i26 = i21;
                                i25 = i28;
                                i27 = i30;
                            }
                        }
                    }
                    i21++;
                    i22 = i27;
                    i23 = i26;
                    i24 = i25;
                }
                zzaps zzapsVar2 = i23 == -1 ? null : new zzaps(zzaplVar3.zza(i23), i24, 0, null);
                zzappVarArr[i20] = zzapsVar2;
                z10 = zzapsVar2 != null;
            }
            i20++;
            i2 = 2;
        }
        return zzappVarArr;
    }

    public zzapr(zzapw zzapwVar) {
        this.zza = new AtomicReference<>(new zzapq());
    }
}
