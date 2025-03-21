package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Objects;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
final class zzaax implements zzaah, zzaag {
    private final zzaah[] zza;
    private zzaag zzd;
    private zzach zze;
    private final zzzv zzh;
    private final ArrayList<zzaah> zzc = new ArrayList<>();
    private zzabz zzg = new zzzu(new zzabz[0]);
    private final IdentityHashMap<zzabx, Integer> zzb = new IdentityHashMap<>();
    private zzaah[] zzf = new zzaah[0];

    public zzaax(zzzv zzzvVar, long[] jArr, zzaah[] zzaahVarArr, byte... bArr) {
        this.zzh = zzzvVar;
        this.zza = zzaahVarArr;
        for (int i = 0; i < zzaahVarArr.length; i++) {
            long j = jArr[i];
            if (j != 0) {
                this.zza[i] = new zzaav(zzaahVarArr[i], j);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaah
    public final void zza(zzaag zzaagVar, long j) {
        this.zzd = zzaagVar;
        Collections.addAll(this.zzc, this.zza);
        for (zzaah zzaahVar : this.zza) {
            zzaahVar.zza(this, j);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaah
    public final void zzb() throws IOException {
        for (zzaah zzaahVar : this.zza) {
            zzaahVar.zzb();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaah
    public final zzach zzc() {
        zzach zzachVar = this.zze;
        Objects.requireNonNull(zzachVar);
        return zzachVar;
    }

    @Override // com.google.android.gms.internal.ads.zzaah
    public final void zzd(long j, boolean z) {
        for (zzaah zzaahVar : this.zzf) {
            zzaahVar.zzd(j, false);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaah, com.google.android.gms.internal.ads.zzabz
    public final void zze(long j) {
        this.zzg.zze(j);
    }

    @Override // com.google.android.gms.internal.ads.zzaah
    public final long zzf() {
        zzaah[] zzaahVarArr;
        zzaah[] zzaahVarArr2;
        long j = -9223372036854775807L;
        for (zzaah zzaahVar : this.zzf) {
            long zzf = zzaahVar.zzf();
            if (zzf != -9223372036854775807L) {
                if (j == -9223372036854775807L) {
                    for (zzaah zzaahVar2 : this.zzf) {
                        if (zzaahVar2 == zzaahVar) {
                            break;
                        } else if (zzaahVar2.zzh(zzf) != zzf) {
                            throw new IllegalStateException("Unexpected child seekToUs result.");
                        }
                    }
                    j = zzf;
                } else if (zzf != j) {
                    throw new IllegalStateException("Conflicting discontinuities.");
                }
            } else if (j != -9223372036854775807L && zzaahVar.zzh(j) != j) {
                throw new IllegalStateException("Unexpected child seekToUs result.");
            }
        }
        return j;
    }

    @Override // com.google.android.gms.internal.ads.zzaah, com.google.android.gms.internal.ads.zzabz
    public final long zzg() {
        return this.zzg.zzg();
    }

    @Override // com.google.android.gms.internal.ads.zzaah
    public final long zzh(long j) {
        long zzh = this.zzf[0].zzh(j);
        int i = 1;
        while (true) {
            zzaah[] zzaahVarArr = this.zzf;
            if (i >= zzaahVarArr.length) {
                return zzh;
            }
            if (zzaahVarArr[i].zzh(zzh) != zzh) {
                throw new IllegalStateException("Unexpected child seekToUs result.");
            }
            i++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaah
    public final long zzi(long j, zzlj zzljVar) {
        zzaah[] zzaahVarArr = this.zzf;
        return (zzaahVarArr.length > 0 ? zzaahVarArr[0] : this.zza[0]).zzi(j, zzljVar);
    }

    @Override // com.google.android.gms.internal.ads.zzaag
    public final void zzj(zzaah zzaahVar) {
        this.zzc.remove(zzaahVar);
        if (this.zzc.isEmpty()) {
            int i = 0;
            for (zzaah zzaahVar2 : this.zza) {
                i += zzaahVar2.zzc().zzb;
            }
            zzacf[] zzacfVarArr = new zzacf[i];
            int i2 = 0;
            for (zzaah zzaahVar3 : this.zza) {
                zzach zzc = zzaahVar3.zzc();
                int i3 = zzc.zzb;
                int i4 = 0;
                while (i4 < i3) {
                    zzacfVarArr[i2] = zzc.zza(i4);
                    i4++;
                    i2++;
                }
            }
            this.zze = new zzach(zzacfVarArr);
            zzaag zzaagVar = this.zzd;
            Objects.requireNonNull(zzaagVar);
            zzaagVar.zzj(this);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaah, com.google.android.gms.internal.ads.zzabz
    public final long zzk() {
        return this.zzg.zzk();
    }

    @Override // com.google.android.gms.internal.ads.zzaah, com.google.android.gms.internal.ads.zzabz
    public final boolean zzl(long j) {
        if (!this.zzc.isEmpty()) {
            int size = this.zzc.size();
            for (int i = 0; i < size; i++) {
                this.zzc.get(i).zzl(j);
            }
            return false;
        }
        return this.zzg.zzl(j);
    }

    @Override // com.google.android.gms.internal.ads.zzaby
    public final /* bridge */ /* synthetic */ void zzm(zzaah zzaahVar) {
        zzaag zzaagVar = this.zzd;
        Objects.requireNonNull(zzaagVar);
        zzaagVar.zzm(this);
    }

    @Override // com.google.android.gms.internal.ads.zzaah, com.google.android.gms.internal.ads.zzabz
    public final boolean zzn() {
        return this.zzg.zzn();
    }

    public final zzaah zzo(int i) {
        zzaah zzaahVar;
        zzaah zzaahVar2 = this.zza[i];
        if (zzaahVar2 instanceof zzaav) {
            zzaahVar = ((zzaav) zzaahVar2).zza;
            return zzaahVar;
        }
        return zzaahVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzaah
    public final long zzp(zzacs[] zzacsVarArr, boolean[] zArr, zzabx[] zzabxVarArr, boolean[] zArr2, long j) {
        int length;
        int length2 = zzacsVarArr.length;
        int[] iArr = new int[length2];
        int[] iArr2 = new int[length2];
        int i = 0;
        while (true) {
            length = zzacsVarArr.length;
            if (i >= length) {
                break;
            }
            zzabx zzabxVar = zzabxVarArr[i];
            Integer num = zzabxVar == null ? null : this.zzb.get(zzabxVar);
            iArr[i] = num == null ? -1 : num.intValue();
            iArr2[i] = -1;
            zzacs zzacsVar = zzacsVarArr[i];
            if (zzacsVar != null) {
                zzacf zzb = zzacsVar.zzb();
                int i2 = 0;
                while (true) {
                    zzaah[] zzaahVarArr = this.zza;
                    if (i2 >= zzaahVarArr.length) {
                        break;
                    } else if (zzaahVarArr[i2].zzc().zzb(zzb) != -1) {
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
        zzabx[] zzabxVarArr2 = new zzabx[length];
        zzabx[] zzabxVarArr3 = new zzabx[length];
        zzacs[] zzacsVarArr2 = new zzacs[length];
        ArrayList arrayList = new ArrayList(this.zza.length);
        long j2 = j;
        int i3 = 0;
        while (i3 < this.zza.length) {
            for (int i4 = 0; i4 < zzacsVarArr.length; i4++) {
                zzabxVarArr3[i4] = iArr[i4] == i3 ? zzabxVarArr[i4] : null;
                zzacsVarArr2[i4] = iArr2[i4] == i3 ? zzacsVarArr[i4] : null;
            }
            int i5 = i3;
            ArrayList arrayList2 = arrayList;
            zzabx[] zzabxVarArr4 = zzabxVarArr3;
            zzacs[] zzacsVarArr3 = zzacsVarArr2;
            long zzp = this.zza[i3].zzp(zzacsVarArr2, zArr, zzabxVarArr3, zArr2, j2);
            if (i5 == 0) {
                j2 = zzp;
            } else if (zzp != j2) {
                throw new IllegalStateException("Children enabled at different positions.");
            }
            boolean z = false;
            for (int i6 = 0; i6 < zzacsVarArr.length; i6++) {
                if (iArr2[i6] == i5) {
                    zzabx zzabxVar2 = zzabxVarArr4[i6];
                    Objects.requireNonNull(zzabxVar2);
                    zzabxVarArr2[i6] = zzabxVar2;
                    this.zzb.put(zzabxVar2, Integer.valueOf(i5));
                    z = true;
                } else if (iArr[i6] == i5) {
                    zzafs.zzd(zzabxVarArr4[i6] == null);
                }
            }
            if (z) {
                arrayList2.add(this.zza[i5]);
            }
            i3 = i5 + 1;
            arrayList = arrayList2;
            zzabxVarArr3 = zzabxVarArr4;
            zzacsVarArr2 = zzacsVarArr3;
        }
        System.arraycopy(zzabxVarArr2, 0, zzabxVarArr, 0, length);
        zzaah[] zzaahVarArr2 = (zzaah[]) arrayList.toArray(new zzaah[0]);
        this.zzf = zzaahVarArr2;
        this.zzg = new zzzu(zzaahVarArr2);
        return j2;
    }
}
