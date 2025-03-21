package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.ArrayList;
import java.util.IdentityHashMap;
import kotlin.jvm.internal.LongCompanionObject;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
final class zzaox implements zzaou, zzaot {
    public final zzaou[] zza;
    private final IdentityHashMap<zzapg, Integer> zzb = new IdentityHashMap<>();
    private zzaot zzc;
    private int zzd;
    private zzapl zze;
    private zzaou[] zzf;
    private zzapi zzg;

    public zzaox(zzaou... zzaouVarArr) {
        this.zza = zzaouVarArr;
    }

    @Override // com.google.android.gms.internal.ads.zzaou
    public final long zzB(zzapp[] zzappVarArr, boolean[] zArr, zzapg[] zzapgVarArr, boolean[] zArr2, long j) {
        int length;
        zzapg[] zzapgVarArr2 = zzapgVarArr;
        int length2 = zzappVarArr.length;
        int[] iArr = new int[length2];
        int[] iArr2 = new int[length2];
        int i = 0;
        while (true) {
            length = zzappVarArr.length;
            if (i >= length) {
                break;
            }
            zzapg zzapgVar = zzapgVarArr2[i];
            iArr[i] = zzapgVar == null ? -1 : this.zzb.get(zzapgVar).intValue();
            iArr2[i] = -1;
            zzapp zzappVar = zzappVarArr[i];
            if (zzappVar != null) {
                zzapk zza = zzappVar.zza();
                int i2 = 0;
                while (true) {
                    zzaou[] zzaouVarArr = this.zza;
                    if (i2 >= zzaouVarArr.length) {
                        break;
                    } else if (zzaouVarArr[i2].zzg().zzb(zza) != -1) {
                        iArr2[i] = i2;
                        break;
                    } else {
                        i2++;
                    }
                }
            }
            i++;
        }
        this.zzb.clear();
        zzapg[] zzapgVarArr3 = new zzapg[length];
        zzapg[] zzapgVarArr4 = new zzapg[length];
        zzapp[] zzappVarArr2 = new zzapp[length];
        ArrayList arrayList = new ArrayList(this.zza.length);
        long j2 = j;
        int i3 = 0;
        while (i3 < this.zza.length) {
            for (int i4 = 0; i4 < zzappVarArr.length; i4++) {
                zzapp zzappVar2 = null;
                zzapgVarArr4[i4] = iArr[i4] == i3 ? zzapgVarArr2[i4] : null;
                if (iArr2[i4] == i3) {
                    zzappVar2 = zzappVarArr[i4];
                }
                zzappVarArr2[i4] = zzappVar2;
            }
            int i5 = i3;
            zzapp[] zzappVarArr3 = zzappVarArr2;
            ArrayList arrayList2 = arrayList;
            long zzB = this.zza[i3].zzB(zzappVarArr2, zArr, zzapgVarArr4, zArr2, j2);
            if (i5 == 0) {
                j2 = zzB;
            } else if (zzB != j2) {
                throw new IllegalStateException("Children enabled at different positions");
            }
            boolean z = false;
            for (int i6 = 0; i6 < zzappVarArr.length; i6++) {
                if (iArr2[i6] == i5) {
                    zzaqu.zzd(zzapgVarArr4[i6] != null);
                    zzapg zzapgVar2 = zzapgVarArr4[i6];
                    zzapgVarArr3[i6] = zzapgVar2;
                    this.zzb.put(zzapgVar2, Integer.valueOf(i5));
                    z = true;
                } else if (iArr[i6] == i5) {
                    zzaqu.zzd(zzapgVarArr4[i6] == null);
                }
            }
            if (z) {
                arrayList2.add(this.zza[i5]);
            }
            i3 = i5 + 1;
            arrayList = arrayList2;
            zzappVarArr2 = zzappVarArr3;
            zzapgVarArr2 = zzapgVarArr;
        }
        zzapg[] zzapgVarArr5 = zzapgVarArr2;
        ArrayList arrayList3 = arrayList;
        System.arraycopy(zzapgVarArr3, 0, zzapgVarArr5, 0, length);
        zzaou[] zzaouVarArr2 = new zzaou[arrayList3.size()];
        this.zzf = zzaouVarArr2;
        arrayList3.toArray(zzaouVarArr2);
        this.zzg = new zzaoi(this.zzf);
        return j2;
    }

    @Override // com.google.android.gms.internal.ads.zzaou, com.google.android.gms.internal.ads.zzapi
    public final long zza() {
        return this.zzg.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzaou, com.google.android.gms.internal.ads.zzapi
    public final boolean zzb(long j) {
        return this.zzg.zzb(j);
    }

    @Override // com.google.android.gms.internal.ads.zzaot
    public final void zzbn(zzaou zzaouVar) {
        int i = this.zzd - 1;
        this.zzd = i;
        if (i > 0) {
            return;
        }
        int i2 = 0;
        for (zzaou zzaouVar2 : this.zza) {
            i2 += zzaouVar2.zzg().zzb;
        }
        zzapk[] zzapkVarArr = new zzapk[i2];
        int i3 = 0;
        for (zzaou zzaouVar3 : this.zza) {
            zzapl zzg = zzaouVar3.zzg();
            int i4 = zzg.zzb;
            int i5 = 0;
            while (i5 < i4) {
                zzapkVarArr[i3] = zzg.zza(i5);
                i5++;
                i3++;
            }
        }
        this.zze = new zzapl(zzapkVarArr);
        this.zzc.zzbn(this);
    }

    @Override // com.google.android.gms.internal.ads.zzaou
    public final void zze(zzaot zzaotVar, long j) {
        this.zzc = zzaotVar;
        zzaou[] zzaouVarArr = this.zza;
        this.zzd = zzaouVarArr.length;
        for (zzaou zzaouVar : zzaouVarArr) {
            zzaouVar.zze(this, j);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaou
    public final void zzf() throws IOException {
        for (zzaou zzaouVar : this.zza) {
            zzaouVar.zzf();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaou
    public final zzapl zzg() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzaou
    public final void zzh(long j) {
        for (zzaou zzaouVar : this.zzf) {
            zzaouVar.zzh(j);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaou
    public final long zzi() {
        zzaou[] zzaouVarArr;
        long zzi = this.zza[0].zzi();
        int i = 1;
        while (true) {
            zzaou[] zzaouVarArr2 = this.zza;
            if (i >= zzaouVarArr2.length) {
                if (zzi != -9223372036854775807L) {
                    for (zzaou zzaouVar : this.zzf) {
                        if (zzaouVar != this.zza[0] && zzaouVar.zzk(zzi) != zzi) {
                            throw new IllegalStateException("Children seeked to different positions");
                        }
                    }
                }
                return zzi;
            } else if (zzaouVarArr2[i].zzi() != -9223372036854775807L) {
                throw new IllegalStateException("Child reported discontinuity");
            } else {
                i++;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaou
    public final long zzj() {
        long j = Long.MAX_VALUE;
        for (zzaou zzaouVar : this.zzf) {
            long zzj = zzaouVar.zzj();
            if (zzj != Long.MIN_VALUE) {
                j = Math.min(j, zzj);
            }
        }
        if (j == LongCompanionObject.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        return j;
    }

    @Override // com.google.android.gms.internal.ads.zzaou
    public final long zzk(long j) {
        long zzk = this.zzf[0].zzk(j);
        int i = 1;
        while (true) {
            zzaou[] zzaouVarArr = this.zzf;
            if (i >= zzaouVarArr.length) {
                return zzk;
            }
            if (zzaouVarArr[i].zzk(zzk) != zzk) {
                throw new IllegalStateException("Children seeked to different positions");
            }
            i++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaph
    public final /* bridge */ /* synthetic */ void zzn(zzaou zzaouVar) {
        if (this.zze == null) {
            return;
        }
        this.zzc.zzn(this);
    }
}
