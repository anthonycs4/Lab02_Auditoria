package com.google.android.gms.internal.ads;

import android.util.Pair;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import kotlin.jvm.internal.LongCompanionObject;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzti implements zzpr, zzqm {
    public static final zzpx zza = zztg.zza;
    private final zzahd zzb;
    private final zzahd zzc;
    private final zzahd zzd;
    private final zzahd zze;
    private final ArrayDeque<zzso> zzf;
    private final zztk zzg;
    private final List<zzxt> zzh;
    private int zzi;
    private int zzj;
    private long zzk;
    private int zzl;
    private zzahd zzm;
    private int zzn;
    private int zzo;
    private int zzp;
    private int zzq;
    private zzpu zzr;
    private zzth[] zzs;
    private long[][] zzt;
    private int zzu;
    private long zzv;
    private int zzw;
    private zzzj zzx;

    public zzti() {
        this(0);
    }

    private final void zzh() {
        this.zzi = 0;
        this.zzl = 0;
    }

    private final void zzi(long j) throws zzkr {
        zzti zztiVar;
        zzxu zzxuVar;
        zzxu zzxuVar2;
        long j2;
        List<zztp> list;
        int i;
        zzti zztiVar2;
        zzxu zzxuVar3;
        char c;
        int i2;
        zzti zztiVar3 = this;
        while (!zztiVar3.zzf.isEmpty() && zztiVar3.zzf.peek().zza == j) {
            zzso pop = zztiVar3.zzf.pop();
            if (pop.zzd == 1836019574) {
                ArrayList arrayList = new ArrayList();
                boolean z = zztiVar3.zzw == 1;
                zzqg zzqgVar = new zzqg();
                zzsp zzc = pop.zzc(1969517665);
                if (zzc != null) {
                    Pair<zzxu, zzxu> zzb = zzsx.zzb(zzc);
                    zzxu zzxuVar4 = (zzxu) zzb.first;
                    zzxu zzxuVar5 = (zzxu) zzb.second;
                    if (zzxuVar4 != null) {
                        zzqgVar.zza(zzxuVar4);
                    }
                    zzxuVar = zzxuVar5;
                    zzxuVar2 = zzxuVar4;
                } else {
                    zzxuVar = null;
                    zzxuVar2 = null;
                }
                zzso zzd = pop.zzd(1835365473);
                zzxu zzc2 = zzd != null ? zzsx.zzc(zzd) : null;
                List<zztp> zza2 = zzsx.zza(pop, zzqgVar, -9223372036854775807L, null, false, z, zztf.zza);
                zzpu zzpuVar = zztiVar3.zzr;
                Objects.requireNonNull(zzpuVar);
                int size = zza2.size();
                long j3 = -9223372036854775807L;
                long j4 = -9223372036854775807L;
                int i3 = 0;
                int i4 = -1;
                while (true) {
                    j2 = 0;
                    if (i3 >= size) {
                        break;
                    }
                    zztp zztpVar = zza2.get(i3);
                    if (zztpVar.zzb == 0) {
                        zztiVar2 = zztiVar3;
                        list = zza2;
                        i = size;
                    } else {
                        zztm zztmVar = zztpVar.zza;
                        ArrayList arrayList2 = arrayList;
                        long j5 = zztmVar.zze;
                        if (j5 == j3) {
                            j5 = zztpVar.zzh;
                        }
                        long max = Math.max(j4, j5);
                        zzth zzthVar = new zzth(zztmVar, zztpVar, zzpuVar.zzbi(i3, zztmVar.zzb));
                        int i5 = zztpVar.zze;
                        list = zza2;
                        zzjp zza3 = zztmVar.zzf.zza();
                        zza3.zzk(i5 + 30);
                        i = size;
                        if (zztmVar.zzb == 2 && j5 > 0 && (i2 = zztpVar.zzb) > 1) {
                            zza3.zzq(i2 / (((float) j5) / 1000000.0f));
                        }
                        int i6 = zztmVar.zzb;
                        int i7 = zzte.zzb;
                        if (i6 == 1 && zzqgVar.zzb()) {
                            zza3.zzz(zzqgVar.zza);
                            zza3.zzA(zzqgVar.zzb);
                        }
                        int i8 = zztmVar.zzb;
                        zzxu[] zzxuVarArr = new zzxu[2];
                        zzxuVarArr[0] = zzxuVar;
                        zztiVar2 = this;
                        if (zztiVar2.zzh.isEmpty()) {
                            c = 1;
                            zzxuVar3 = null;
                        } else {
                            zzxuVar3 = new zzxu(zztiVar2.zzh);
                            c = 1;
                        }
                        zzxuVarArr[c] = zzxuVar3;
                        zzxu zzxuVar6 = new zzxu(new zzxt[0]);
                        if (i8 == 1) {
                            if (zzxuVar2 != null) {
                                zzxuVar6 = zzxuVar2;
                            }
                        } else if (i8 == 2 && zzc2 != null) {
                            int i9 = 0;
                            while (true) {
                                if (i9 >= zzc2.zza()) {
                                    break;
                                }
                                zzxt zzb2 = zzc2.zzb(i9);
                                if (zzb2 instanceof zzzh) {
                                    zzzh zzzhVar = (zzzh) zzb2;
                                    if ("com.android.capture.fps".equals(zzzhVar.zza)) {
                                        zzxuVar6 = new zzxu(zzzhVar);
                                        break;
                                    }
                                }
                                i9++;
                            }
                        }
                        for (int i10 = 0; i10 < 2; i10++) {
                            zzxuVar6 = zzxuVar6.zzc(zzxuVarArr[i10]);
                        }
                        if (zzxuVar6.zza() > 0) {
                            zza3.zzi(zzxuVar6);
                        }
                        zzthVar.zzc.zza(zza3.zzD());
                        if (zztmVar.zzb == 2 && i4 == -1) {
                            i4 = arrayList2.size();
                        }
                        arrayList = arrayList2;
                        arrayList.add(zzthVar);
                        j4 = max;
                    }
                    i3++;
                    zztiVar3 = zztiVar2;
                    zza2 = list;
                    size = i;
                    j3 = -9223372036854775807L;
                }
                zztiVar = zztiVar3;
                zztiVar.zzu = i4;
                zztiVar.zzv = j4;
                zzth[] zzthVarArr = (zzth[]) arrayList.toArray(new zzth[0]);
                zztiVar.zzs = zzthVarArr;
                int length = zzthVarArr.length;
                long[][] jArr = new long[length];
                int[] iArr = new int[length];
                long[] jArr2 = new long[length];
                boolean[] zArr = new boolean[length];
                for (int i11 = 0; i11 < zzthVarArr.length; i11++) {
                    jArr[i11] = new long[zzthVarArr[i11].zzb.zzb];
                    jArr2[i11] = zzthVarArr[i11].zzb.zzf[0];
                }
                int i12 = 0;
                while (i12 < zzthVarArr.length) {
                    long j6 = LongCompanionObject.MAX_VALUE;
                    int i13 = -1;
                    for (int i14 = 0; i14 < zzthVarArr.length; i14++) {
                        if (!zArr[i14]) {
                            long j7 = jArr2[i14];
                            if (j7 <= j6) {
                                i13 = i14;
                                j6 = j7;
                            }
                        }
                    }
                    int i15 = iArr[i13];
                    long[] jArr3 = jArr[i13];
                    jArr3[i15] = j2;
                    zztp zztpVar2 = zzthVarArr[i13].zzb;
                    j2 += zztpVar2.zzd[i15];
                    int i16 = i15 + 1;
                    iArr[i13] = i16;
                    if (i16 < jArr3.length) {
                        jArr2[i13] = zztpVar2.zzf[i16];
                    } else {
                        zArr[i13] = true;
                        i12++;
                    }
                }
                zztiVar.zzt = jArr;
                zzpuVar.zzbj();
                zzpuVar.zzbk(zztiVar);
                zztiVar.zzf.clear();
                zztiVar.zzi = 2;
            } else {
                zztiVar = zztiVar3;
                if (!zztiVar.zzf.isEmpty()) {
                    zztiVar.zzf.peek().zzb(pop);
                }
            }
            zztiVar3 = zztiVar;
        }
        if (zztiVar3.zzi != 2) {
            zzh();
        }
    }

    private static long zzj(zztp zztpVar, long j, long j2) {
        int zzk = zzk(zztpVar, j);
        return zzk == -1 ? j2 : Math.min(zztpVar.zzc[zzk], j2);
    }

    private static int zzk(zztp zztpVar, long j) {
        int zza2 = zztpVar.zza(j);
        return zza2 == -1 ? zztpVar.zzb(j) : zza2;
    }

    private static int zzl(int i) {
        if (i != 1751476579) {
            return i != 1903435808 ? 0 : 1;
        }
        return 2;
    }

    @Override // com.google.android.gms.internal.ads.zzqm
    public final boolean zza() {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzqm
    public final zzqk zzb(long j) {
        long j2;
        long j3;
        int zzb;
        zzth[] zzthVarArr = this.zzs;
        Objects.requireNonNull(zzthVarArr);
        if (zzthVarArr.length == 0) {
            zzqn zzqnVar = zzqn.zza;
            return new zzqk(zzqnVar, zzqnVar);
        }
        int i = this.zzu;
        long j4 = -1;
        if (i != -1) {
            zztp zztpVar = zzthVarArr[i].zzb;
            int zzk = zzk(zztpVar, j);
            if (zzk == -1) {
                zzqn zzqnVar2 = zzqn.zza;
                return new zzqk(zzqnVar2, zzqnVar2);
            }
            long j5 = zztpVar.zzf[zzk];
            j2 = zztpVar.zzc[zzk];
            if (j5 >= j || zzk >= zztpVar.zzb - 1 || (zzb = zztpVar.zzb(j)) == -1 || zzb == zzk) {
                j3 = -9223372036854775807L;
            } else {
                j3 = zztpVar.zzf[zzb];
                j4 = zztpVar.zzc[zzb];
            }
            j = j5;
        } else {
            j2 = LongCompanionObject.MAX_VALUE;
            j3 = -9223372036854775807L;
        }
        int i2 = 0;
        while (true) {
            zzth[] zzthVarArr2 = this.zzs;
            if (i2 >= zzthVarArr2.length) {
                break;
            }
            if (i2 != this.zzu) {
                zztp zztpVar2 = zzthVarArr2[i2].zzb;
                long zzj = zzj(zztpVar2, j, j2);
                if (j3 != -9223372036854775807L) {
                    j4 = zzj(zztpVar2, j3, j4);
                }
                j2 = zzj;
            }
            i2++;
        }
        zzqn zzqnVar3 = new zzqn(j, j2);
        if (j3 == -9223372036854775807L) {
            return new zzqk(zzqnVar3, zzqnVar3);
        }
        return new zzqk(zzqnVar3, new zzqn(j3, j4));
    }

    @Override // com.google.android.gms.internal.ads.zzqm
    public final long zzc() {
        return this.zzv;
    }

    @Override // com.google.android.gms.internal.ads.zzpr
    public final boolean zzd(zzps zzpsVar) throws IOException {
        return zztl.zzb(zzpsVar, false);
    }

    @Override // com.google.android.gms.internal.ads.zzpr
    public final void zze(zzpu zzpuVar) {
        this.zzr = zzpuVar;
    }

    @Override // com.google.android.gms.internal.ads.zzpr
    public final void zzg(long j, long j2) {
        this.zzf.clear();
        this.zzl = 0;
        this.zzn = -1;
        this.zzo = 0;
        this.zzp = 0;
        this.zzq = 0;
        if (j == 0) {
            zzh();
            return;
        }
        zzth[] zzthVarArr = this.zzs;
        if (zzthVarArr != null) {
            for (zzth zzthVar : zzthVarArr) {
                zztp zztpVar = zzthVar.zzb;
                int zza2 = zztpVar.zza(j2);
                if (zza2 == -1) {
                    zza2 = zztpVar.zzb(j2);
                }
                zzthVar.zzd = zza2;
            }
        }
    }

    public zzti(int i) {
        this.zzi = 0;
        this.zzg = new zztk();
        this.zzh = new ArrayList();
        this.zze = new zzahd(16);
        this.zzf = new ArrayDeque<>();
        this.zzb = new zzahd(zzagv.zza);
        this.zzc = new zzahd(4);
        this.zzd = new zzahd();
        this.zzn = -1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:185:0x0367, code lost:
        r3 = true;
     */
    /* JADX WARN: Removed duplicated region for block: B:250:0x008d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0087  */
    @Override // com.google.android.gms.internal.ads.zzpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int zzf(com.google.android.gms.internal.ads.zzps r33, com.google.android.gms.internal.ads.zzqj r34) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 1011
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzti.zzf(com.google.android.gms.internal.ads.zzps, com.google.android.gms.internal.ads.zzqj):int");
    }
}
