package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Stack;
import kotlin.jvm.internal.LongCompanionObject;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzanf implements zzalu, zzamb {
    public static final zzalw zza = new zzand();
    private static final int zzb = zzarj.zzl("qt  ");
    private int zzg;
    private int zzh;
    private long zzi;
    private int zzj;
    private zzarc zzk;
    private int zzl;
    private int zzm;
    private zzalv zzn;
    private zzane[] zzo;
    private long zzp;
    private boolean zzq;
    private final zzarc zze = new zzarc(16);
    private final Stack<zzamn> zzf = new Stack<>();
    private final zzarc zzc = new zzarc(zzara.zza);
    private final zzarc zzd = new zzarc(4);

    private final void zzh() {
        this.zzg = 0;
        this.zzj = 0;
    }

    private final void zzi(long j) throws zzajw {
        zzanz zzanzVar;
        zzaly zzalyVar;
        zzanz zzanzVar2;
        zzanh zza2;
        while (!this.zzf.isEmpty() && this.zzf.peek().zza == j) {
            zzamn pop = this.zzf.pop();
            if (pop.zzaR == zzamp.zzE) {
                ArrayList arrayList = new ArrayList();
                zzaly zzalyVar2 = new zzaly();
                zzamo zzc = pop.zzc(zzamp.zzaC);
                if (zzc != null) {
                    zzanzVar = zzamw.zzc(zzc, this.zzq);
                    if (zzanzVar != null) {
                        zzalyVar2.zza(zzanzVar);
                    }
                } else {
                    zzanzVar = null;
                }
                long j2 = -9223372036854775807L;
                long j3 = LongCompanionObject.MAX_VALUE;
                int i = 0;
                while (i < pop.zzc.size()) {
                    zzamn zzamnVar = pop.zzc.get(i);
                    if (zzamnVar.zzaR == zzamp.zzG && (zza2 = zzamw.zza(zzamnVar, pop.zzc(zzamp.zzF), -9223372036854775807L, null, this.zzq)) != null) {
                        zzank zzb2 = zzamw.zzb(zza2, zzamnVar.zzd(zzamp.zzH).zzd(zzamp.zzI).zzd(zzamp.zzJ), zzalyVar2);
                        if (zzb2.zza != 0) {
                            zzane zzaneVar = new zzane(zza2, zzb2, this.zzn.zzbl(i, zza2.zzb));
                            zzajt zzg = zza2.zzf.zzg(zzb2.zzd + 30);
                            if (zza2.zzb == 1) {
                                if (zzalyVar2.zzb()) {
                                    zzg = zzg.zzh(zzalyVar2.zzb, zzalyVar2.zzc);
                                }
                                if (zzanzVar != null) {
                                    zzg = zzg.zzj(zzanzVar);
                                }
                            }
                            zzaneVar.zzc.zza(zzg);
                            zzalyVar = zzalyVar2;
                            zzanzVar2 = zzanzVar;
                            long max = Math.max(j2, zza2.zze);
                            arrayList.add(zzaneVar);
                            long j4 = zzb2.zzb[0];
                            if (j4 < j3) {
                                j2 = max;
                                j3 = j4;
                            } else {
                                j2 = max;
                            }
                            i++;
                            zzalyVar2 = zzalyVar;
                            zzanzVar = zzanzVar2;
                        }
                    }
                    zzalyVar = zzalyVar2;
                    zzanzVar2 = zzanzVar;
                    i++;
                    zzalyVar2 = zzalyVar;
                    zzanzVar = zzanzVar2;
                }
                this.zzp = j2;
                this.zzo = (zzane[]) arrayList.toArray(new zzane[arrayList.size()]);
                this.zzn.zzbm();
                this.zzn.zzc(this);
                this.zzf.clear();
                this.zzg = 2;
            } else if (!this.zzf.isEmpty()) {
                this.zzf.peek().zzb(pop);
            }
        }
        if (this.zzg != 2) {
            zzh();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzamb
    public final boolean zza() {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzamb
    public final long zzb() {
        return this.zzp;
    }

    @Override // com.google.android.gms.internal.ads.zzamb
    public final long zzc(long j) {
        zzane[] zzaneVarArr = this.zzo;
        long j2 = LongCompanionObject.MAX_VALUE;
        for (zzane zzaneVar : zzaneVarArr) {
            zzank zzankVar = zzaneVar.zzb;
            int zza2 = zzankVar.zza(j);
            if (zza2 == -1) {
                zza2 = zzankVar.zzb(j);
            }
            long j3 = zzankVar.zzb[zza2];
            if (j3 < j2) {
                j2 = j3;
            }
        }
        return j2;
    }

    @Override // com.google.android.gms.internal.ads.zzalu
    public final void zzd(zzalv zzalvVar) {
        this.zzn = zzalvVar;
    }

    @Override // com.google.android.gms.internal.ads.zzalu
    public final void zze(long j, long j2) {
        this.zzf.clear();
        this.zzj = 0;
        this.zzl = 0;
        this.zzm = 0;
        if (j == 0) {
            zzh();
            return;
        }
        zzane[] zzaneVarArr = this.zzo;
        if (zzaneVarArr != null) {
            for (zzane zzaneVar : zzaneVarArr) {
                zzank zzankVar = zzaneVar.zzb;
                int zza2 = zzankVar.zza(j2);
                if (zza2 == -1) {
                    zza2 = zzankVar.zzb(j2);
                }
                zzaneVar.zzd = zza2;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzalu
    public final boolean zzf(zzalt zzaltVar) throws IOException, InterruptedException {
        return zzang.zzb(zzaltVar);
    }

    @Override // com.google.android.gms.internal.ads.zzalu
    public final int zzg(zzalt zzaltVar, zzalz zzalzVar) throws IOException, InterruptedException {
        zzane[] zzaneVarArr;
        boolean z;
        boolean z2;
        while (true) {
            int i = this.zzg;
            if (i == 0) {
                if (this.zzj == 0) {
                    if (!zzaltVar.zzb(this.zze.zza, 0, 8, true)) {
                        return -1;
                    }
                    this.zzj = 8;
                    this.zze.zzi(0);
                    this.zzi = this.zze.zzp();
                    this.zzh = this.zze.zzr();
                }
                if (this.zzi == 1) {
                    zzaltVar.zzb(this.zze.zza, 8, 8, false);
                    this.zzj += 8;
                    this.zzi = this.zze.zzv();
                }
                int i2 = this.zzh;
                if (i2 == zzamp.zzE || i2 == zzamp.zzG || i2 == zzamp.zzH || i2 == zzamp.zzI || i2 == zzamp.zzJ || i2 == zzamp.zzS) {
                    long zzh = (zzaltVar.zzh() + this.zzi) - this.zzj;
                    this.zzf.add(new zzamn(this.zzh, zzh));
                    if (this.zzi == this.zzj) {
                        zzi(zzh);
                    } else {
                        zzh();
                    }
                } else {
                    int i3 = this.zzh;
                    if (i3 == zzamp.zzU || i3 == zzamp.zzF || i3 == zzamp.zzV || i3 == zzamp.zzW || i3 == zzamp.zzao || i3 == zzamp.zzap || i3 == zzamp.zzaq || i3 == zzamp.zzT || i3 == zzamp.zzar || i3 == zzamp.zzas || i3 == zzamp.zzat || i3 == zzamp.zzau || i3 == zzamp.zzav || i3 == zzamp.zzR || i3 == zzamp.zzd || i3 == zzamp.zzaC) {
                        zzaqu.zzd(this.zzj == 8);
                        zzaqu.zzd(this.zzi <= 2147483647L);
                        this.zzk = new zzarc((int) this.zzi);
                        System.arraycopy(this.zze.zza, 0, this.zzk.zza, 0, 8);
                    } else {
                        this.zzk = null;
                    }
                    this.zzg = 1;
                }
            } else if (i != 1) {
                long j = LongCompanionObject.MAX_VALUE;
                int i4 = 0;
                int i5 = -1;
                while (true) {
                    zzaneVarArr = this.zzo;
                    if (i4 >= zzaneVarArr.length) {
                        break;
                    }
                    zzane zzaneVar = zzaneVarArr[i4];
                    int i6 = zzaneVar.zzd;
                    zzank zzankVar = zzaneVar.zzb;
                    if (i6 != zzankVar.zza) {
                        long j2 = zzankVar.zzb[i6];
                        if (j2 < j) {
                            i5 = i4;
                            j = j2;
                        }
                    }
                    i4++;
                }
                if (i5 == -1) {
                    return -1;
                }
                zzane zzaneVar2 = zzaneVarArr[i5];
                zzamd zzamdVar = zzaneVar2.zzc;
                int i7 = zzaneVar2.zzd;
                zzank zzankVar2 = zzaneVar2.zzb;
                long j3 = zzankVar2.zzb[i7];
                int i8 = zzankVar2.zzc[i7];
                if (zzaneVar2.zza.zzg == 1) {
                    j3 += 8;
                    i8 -= 8;
                }
                long zzh2 = (j3 - zzaltVar.zzh()) + this.zzl;
                if (zzh2 < 0 || zzh2 >= 262144) {
                    zzalzVar.zza = j3;
                    return 1;
                }
                int i9 = (int) zzh2;
                boolean z3 = false;
                zzaltVar.zzd(i9, false);
                int i10 = zzaneVar2.zza.zzk;
                if (i10 == 0) {
                    while (true) {
                        int i11 = this.zzl;
                        if (i11 >= i8) {
                            break;
                        }
                        int zzd = zzamdVar.zzd(zzaltVar, i8 - i11, false);
                        this.zzl += zzd;
                        this.zzm -= zzd;
                    }
                } else {
                    byte[] bArr = this.zzd.zza;
                    bArr[0] = 0;
                    bArr[1] = 0;
                    bArr[2] = 0;
                    int i12 = 4 - i10;
                    while (this.zzl < i8) {
                        int i13 = this.zzm;
                        if (i13 == 0) {
                            zzaltVar.zzb(this.zzd.zza, i12, i10, z3);
                            this.zzd.zzi(z3 ? 1 : 0);
                            this.zzm = this.zzd.zzu();
                            this.zzc.zzi(z3 ? 1 : 0);
                            zzamdVar.zzb(this.zzc, 4);
                            this.zzl += 4;
                            i8 += i12;
                        } else {
                            int zzd2 = zzamdVar.zzd(zzaltVar, i13, z3);
                            this.zzl += zzd2;
                            this.zzm -= zzd2;
                            z3 = false;
                        }
                    }
                }
                int i14 = i8;
                zzank zzankVar3 = zzaneVar2.zzb;
                zzamdVar.zzc(zzankVar3.zze[i7], zzankVar3.zzf[i7], i14, 0, null);
                zzaneVar2.zzd++;
                this.zzl = 0;
                this.zzm = 0;
                return 0;
            } else {
                long j4 = this.zzi - this.zzj;
                long zzh3 = zzaltVar.zzh() + j4;
                zzarc zzarcVar = this.zzk;
                if (zzarcVar != null) {
                    zzaltVar.zzb(zzarcVar.zza, this.zzj, (int) j4, false);
                    if (this.zzh == zzamp.zzd) {
                        zzarc zzarcVar2 = this.zzk;
                        zzarcVar2.zzi(8);
                        if (zzarcVar2.zzr() == zzb) {
                            z2 = true;
                            break;
                        }
                        zzarcVar2.zzj(4);
                        while (zzarcVar2.zzd() > 0) {
                            if (zzarcVar2.zzr() == zzb) {
                                z2 = true;
                                break;
                            }
                        }
                        z2 = false;
                        this.zzq = z2;
                    } else if (!this.zzf.isEmpty()) {
                        this.zzf.peek().zza(new zzamo(this.zzh, this.zzk));
                    }
                } else if (j4 < 262144) {
                    zzaltVar.zzd((int) j4, false);
                } else {
                    zzalzVar.zza = zzaltVar.zzh() + j4;
                    z = true;
                    zzi(zzh3);
                    if (z && this.zzg != 2) {
                        return 1;
                    }
                }
                z = false;
                zzi(zzh3);
                if (z) {
                    return 1;
                }
                continue;
            }
        }
    }
}
