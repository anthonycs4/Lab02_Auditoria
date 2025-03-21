package com.google.android.gms.internal.ads;

import android.os.Looper;
import android.util.Log;
import androidx.constraintlayout.core.widgets.analyzer.BasicMeasure;
import java.io.IOException;
import java.util.Objects;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzabw implements zzqq {
    private zzjq zzA;
    private boolean zzB;
    private boolean zzC;
    private zzpa zzD;
    private final zzabq zza;
    private final zzoz zzd;
    private final zzou zze;
    private final Looper zzf;
    private zzabv zzg;
    private zzjq zzh;
    private int zzp;
    private int zzq;
    private int zzr;
    private int zzs;
    private boolean zzw;
    private zzjq zzz;
    private final zzabt zzb = new zzabt();
    private int zzi = 1000;
    private int[] zzj = new int[1000];
    private long[] zzk = new long[1000];
    private long[] zzn = new long[1000];
    private int[] zzm = new int[1000];
    private int[] zzl = new int[1000];
    private zzqp[] zzo = new zzqp[1000];
    private final zzacd<zzabu> zzc = new zzacd<>(zzabr.zza);
    private long zzt = Long.MIN_VALUE;
    private long zzu = Long.MIN_VALUE;
    private long zzv = Long.MIN_VALUE;
    private boolean zzy = true;
    private boolean zzx = true;

    /* JADX INFO: Access modifiers changed from: protected */
    public zzabw(zzaek zzaekVar, Looper looper, zzoz zzozVar, zzou zzouVar, byte[] bArr) {
        this.zzf = looper;
        this.zzd = zzozVar;
        this.zze = zzouVar;
        this.zza = new zzabq(zzaekVar, null);
    }

    private final synchronized int zzA(zzjr zzjrVar, zzol zzolVar, boolean z, boolean z2, zzabt zzabtVar) {
        zzolVar.zzc = false;
        if (!zzG()) {
            if (!z2 && !this.zzw) {
                zzjq zzjqVar = this.zzA;
                if (zzjqVar == null || (!z && zzjqVar == this.zzh)) {
                    return -3;
                }
                zzH(zzjqVar, zzjrVar);
                return -5;
            }
            zzolVar.zzf(4);
            return -4;
        }
        zzjq zzjqVar2 = this.zzc.zza(this.zzq + this.zzs).zza;
        if (!z && zzjqVar2 == this.zzh) {
            int zzL = zzL(this.zzs);
            if (!zzI(zzL)) {
                zzolVar.zzc = true;
                return -3;
            }
            zzolVar.zzf(this.zzm[zzL]);
            long j = this.zzn[zzL];
            zzolVar.zzd = j;
            if (j < this.zzt) {
                zzolVar.zzg(Integer.MIN_VALUE);
            }
            zzabtVar.zza = this.zzl[zzL];
            zzabtVar.zzb = this.zzk[zzL];
            zzabtVar.zzc = this.zzo[zzL];
            return -4;
        }
        zzH(zzjqVar2, zzjrVar);
        return -5;
    }

    private final synchronized boolean zzB(zzjq zzjqVar) {
        this.zzy = false;
        if (zzaht.zzc(zzjqVar, this.zzA)) {
            return false;
        }
        if (!this.zzc.zzf() && this.zzc.zzc().zza.equals(zzjqVar)) {
            this.zzA = this.zzc.zzc().zza;
        } else {
            this.zzA = zzjqVar;
        }
        zzjq zzjqVar2 = this.zzA;
        this.zzB = zzags.zzc(zzjqVar2.zzl, zzjqVar2.zzi);
        this.zzC = false;
        return true;
    }

    private final synchronized long zzC(long j, boolean z, boolean z2) {
        int i;
        int i2 = this.zzp;
        if (i2 != 0) {
            long[] jArr = this.zzn;
            int i3 = this.zzr;
            if (j >= jArr[i3]) {
                if (z2 && (i = this.zzs) != i2) {
                    i2 = i + 1;
                }
                int zzJ = zzJ(i3, i2, j, false);
                if (zzJ == -1) {
                    return -1L;
                }
                return zzK(zzJ);
            }
        }
        return -1L;
    }

    private final synchronized long zzD() {
        int i = this.zzp;
        if (i == 0) {
            return -1L;
        }
        return zzK(i);
    }

    private final void zzE() {
        if (this.zzD != null) {
            this.zzD = null;
            this.zzh = null;
        }
    }

    private final synchronized void zzF(long j, int i, long j2, int i2, zzqp zzqpVar) {
        int i3 = this.zzp;
        if (i3 > 0) {
            int zzL = zzL(i3 - 1);
            zzafs.zza(this.zzk[zzL] + ((long) this.zzl[zzL]) <= j2);
        }
        this.zzw = (536870912 & i) != 0;
        this.zzv = Math.max(this.zzv, j);
        int zzL2 = zzL(this.zzp);
        this.zzn[zzL2] = j;
        this.zzk[zzL2] = j2;
        this.zzl[zzL2] = i2;
        this.zzm[zzL2] = i;
        this.zzo[zzL2] = zzqpVar;
        this.zzj[zzL2] = 0;
        if (this.zzc.zzf() || !this.zzc.zzc().zza.equals(this.zzA)) {
            zzoy zzoyVar = zzoy.zzb;
            zzacd<zzabu> zzacdVar = this.zzc;
            int i4 = this.zzq + this.zzp;
            zzjq zzjqVar = this.zzA;
            Objects.requireNonNull(zzjqVar);
            zzacdVar.zzb(i4, new zzabu(zzjqVar, zzoyVar, null));
        }
        int i5 = this.zzp + 1;
        this.zzp = i5;
        int i6 = this.zzi;
        if (i5 == i6) {
            int i7 = i6 + 1000;
            int[] iArr = new int[i7];
            long[] jArr = new long[i7];
            long[] jArr2 = new long[i7];
            int[] iArr2 = new int[i7];
            int[] iArr3 = new int[i7];
            zzqp[] zzqpVarArr = new zzqp[i7];
            int i8 = this.zzr;
            int i9 = i6 - i8;
            System.arraycopy(this.zzk, i8, jArr, 0, i9);
            System.arraycopy(this.zzn, this.zzr, jArr2, 0, i9);
            System.arraycopy(this.zzm, this.zzr, iArr2, 0, i9);
            System.arraycopy(this.zzl, this.zzr, iArr3, 0, i9);
            System.arraycopy(this.zzo, this.zzr, zzqpVarArr, 0, i9);
            System.arraycopy(this.zzj, this.zzr, iArr, 0, i9);
            int i10 = this.zzr;
            System.arraycopy(this.zzk, 0, jArr, i9, i10);
            System.arraycopy(this.zzn, 0, jArr2, i9, i10);
            System.arraycopy(this.zzm, 0, iArr2, i9, i10);
            System.arraycopy(this.zzl, 0, iArr3, i9, i10);
            System.arraycopy(this.zzo, 0, zzqpVarArr, i9, i10);
            System.arraycopy(this.zzj, 0, iArr, i9, i10);
            this.zzk = jArr;
            this.zzn = jArr2;
            this.zzm = iArr2;
            this.zzl = iArr3;
            this.zzo = zzqpVarArr;
            this.zzj = iArr;
            this.zzr = 0;
            this.zzi = i7;
        }
    }

    private final boolean zzG() {
        return this.zzs != this.zzp;
    }

    private final void zzH(zzjq zzjqVar, zzjr zzjrVar) {
        zzjq zzjqVar2 = this.zzh;
        zzor zzorVar = zzjqVar2 == null ? null : zzjqVar2.zzo;
        this.zzh = zzjqVar;
        zzor zzorVar2 = zzjqVar.zzo;
        zzjrVar.zza = zzjqVar.zzb(this.zzd.zza(zzjqVar));
        zzjrVar.zzb = this.zzD;
        if (zzjqVar2 == null || !zzaht.zzc(zzorVar, zzorVar2)) {
            zzpa zzpaVar = zzjqVar.zzo != null ? new zzpa(new zzos(new zzpc(1))) : null;
            this.zzD = zzpaVar;
            zzjrVar.zzb = zzpaVar;
        }
    }

    private final boolean zzI(int i) {
        if (this.zzD != null) {
            return (this.zzm[i] & BasicMeasure.EXACTLY) != 0 ? false : false;
        }
        return true;
    }

    private final int zzJ(int i, int i2, long j, boolean z) {
        int i3 = -1;
        for (int i4 = 0; i4 < i2; i4++) {
            int i5 = (this.zzn[i] > j ? 1 : (this.zzn[i] == j ? 0 : -1));
            if (i5 > 0) {
                break;
            }
            if (!z || (this.zzm[i] & 1) != 0) {
                i3 = i4;
                if (i5 == 0) {
                    break;
                }
            }
            i++;
            if (i == this.zzi) {
                i = 0;
            }
        }
        return i3;
    }

    private final int zzL(int i) {
        int i2 = this.zzr + i;
        int i3 = this.zzi;
        return i2 < i3 ? i2 : i2 - i3;
    }

    private final synchronized void zzz() {
        this.zzs = 0;
        this.zza.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzqq
    public final void zza(zzjq zzjqVar) {
        this.zzz = zzjqVar;
        boolean zzB = zzB(zzjqVar);
        zzabv zzabvVar = this.zzg;
        if (zzabvVar == null || !zzB) {
            return;
        }
        zzabvVar.zzv(zzjqVar);
    }

    @Override // com.google.android.gms.internal.ads.zzqq
    public final int zzb(zzaec zzaecVar, int i, boolean z, int i2) throws IOException {
        return this.zza.zzg(zzaecVar, i, z);
    }

    @Override // com.google.android.gms.internal.ads.zzqq
    public final void zzc(zzahd zzahdVar, int i, int i2) {
        this.zza.zzh(zzahdVar, i);
    }

    @Override // com.google.android.gms.internal.ads.zzqq
    public final void zzd(long j, int i, int i2, int i3, zzqp zzqpVar) {
        int i4 = i & 1;
        if (this.zzx) {
            if (i4 == 0) {
                return;
            }
            this.zzx = false;
        }
        if (this.zzB) {
            if (j < this.zzt) {
                return;
            }
            if (i4 == 0) {
                if (!this.zzC) {
                    String valueOf = String.valueOf(this.zzA);
                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 50);
                    sb.append("Overriding unexpected non-sync sample for format: ");
                    sb.append(valueOf);
                    Log.w("SampleQueue", sb.toString());
                    this.zzC = true;
                }
                i |= 1;
            }
        }
        zzF(j, i, (this.zza.zzf() - i2) - i3, i2, zzqpVar);
    }

    @Override // com.google.android.gms.internal.ads.zzqq
    public final int zze(zzaec zzaecVar, int i, boolean z) throws IOException {
        return zzqo.zza(this, zzaecVar, i, true);
    }

    @Override // com.google.android.gms.internal.ads.zzqq
    public final void zzf(zzahd zzahdVar, int i) {
        zzqo.zzb(this, zzahdVar, i);
    }

    public final void zzg() {
        zzh(true);
        zzE();
    }

    public final void zzh(boolean z) {
        this.zza.zza();
        this.zzp = 0;
        this.zzq = 0;
        this.zzr = 0;
        this.zzs = 0;
        this.zzx = true;
        this.zzt = Long.MIN_VALUE;
        this.zzu = Long.MIN_VALUE;
        this.zzv = Long.MIN_VALUE;
        this.zzw = false;
        this.zzc.zze();
        if (z) {
            this.zzz = null;
            this.zzA = null;
            this.zzy = true;
        }
    }

    public final void zzi(long j) {
        this.zzt = j;
    }

    public final int zzj() {
        return this.zzq + this.zzp;
    }

    public final void zzk() {
        zzw();
        zzE();
    }

    public final void zzl() throws IOException {
        zzpa zzpaVar = this.zzD;
        if (zzpaVar != null) {
            throw zzpaVar.zza();
        }
    }

    public final int zzm() {
        return this.zzq + this.zzs;
    }

    public final synchronized zzjq zzn() {
        if (this.zzy) {
            return null;
        }
        return this.zzA;
    }

    public final synchronized long zzo() {
        return this.zzv;
    }

    public final synchronized boolean zzp() {
        return this.zzw;
    }

    public final synchronized boolean zzq(boolean z) {
        boolean z2 = true;
        if (zzG()) {
            if (this.zzc.zza(this.zzq + this.zzs).zza != this.zzh) {
                return true;
            }
            return zzI(zzL(this.zzs));
        }
        if (!z && !this.zzw) {
            zzjq zzjqVar = this.zzA;
            if (zzjqVar == null) {
                z2 = false;
            } else if (zzjqVar == this.zzh) {
                return false;
            }
        }
        return z2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0034, code lost:
        if (r9 != 0) goto L17;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int zzr(com.google.android.gms.internal.ads.zzjr r9, com.google.android.gms.internal.ads.zzol r10, int r11, boolean r12) {
        /*
            r8 = this;
            r0 = r11 & 2
            r1 = 1
            if (r0 == 0) goto L7
            r5 = 1
            goto L9
        L7:
            r0 = 0
            r5 = 0
        L9:
            com.google.android.gms.internal.ads.zzabt r7 = r8.zzb
            r2 = r8
            r3 = r9
            r4 = r10
            r6 = r12
            int r9 = r2.zzA(r3, r4, r5, r6, r7)
            r12 = -4
            if (r9 != r12) goto L3e
            boolean r9 = r10.zzc()
            if (r9 != 0) goto L3d
            r9 = r11 & 1
            r11 = r11 & 4
            if (r11 != 0) goto L34
            if (r9 == 0) goto L2c
            com.google.android.gms.internal.ads.zzabq r9 = r8.zza
            com.google.android.gms.internal.ads.zzabt r11 = r8.zzb
            r9.zzd(r10, r11)
            goto L3d
        L2c:
            com.google.android.gms.internal.ads.zzabq r9 = r8.zza
            com.google.android.gms.internal.ads.zzabt r11 = r8.zzb
            r9.zzc(r10, r11)
            goto L37
        L34:
            if (r9 == 0) goto L37
            goto L3d
        L37:
            int r9 = r8.zzs
            int r9 = r9 + r1
            r8.zzs = r9
            return r12
        L3d:
            r9 = -4
        L3e:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzabw.zzr(com.google.android.gms.internal.ads.zzjr, com.google.android.gms.internal.ads.zzol, int, boolean):int");
    }

    public final synchronized boolean zzs(long j, boolean z) {
        zzz();
        int zzL = zzL(this.zzs);
        if (!zzG() || j < this.zzn[zzL] || (j > this.zzv && !z)) {
            return false;
        }
        int zzJ = zzJ(zzL, this.zzp - this.zzs, j, true);
        if (zzJ == -1) {
            return false;
        }
        this.zzt = j;
        this.zzs += zzJ;
        return true;
    }

    public final synchronized int zzt(long j, boolean z) {
        int zzL = zzL(this.zzs);
        if (zzG() && j >= this.zzn[zzL]) {
            if (j > this.zzv && z) {
                return this.zzp - this.zzs;
            }
            int zzJ = zzJ(zzL, this.zzp - this.zzs, j, true);
            if (zzJ == -1) {
                return 0;
            }
            return zzJ;
        }
        return 0;
    }

    public final synchronized void zzu(int i) {
        boolean z = false;
        if (i >= 0) {
            try {
                if (this.zzs + i <= this.zzp) {
                    z = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        zzafs.zza(z);
        this.zzs += i;
    }

    public final void zzv(long j, boolean z, boolean z2) {
        this.zza.zze(zzC(j, false, z2));
    }

    public final void zzw() {
        this.zza.zze(zzD());
    }

    public final void zzx(zzabv zzabvVar) {
        this.zzg = zzabvVar;
    }

    private final long zzK(int i) {
        int i2;
        long j = this.zzu;
        long j2 = Long.MIN_VALUE;
        if (i != 0) {
            int zzL = zzL(i - 1);
            for (int i3 = 0; i3 < i; i3++) {
                j2 = Math.max(j2, this.zzn[zzL]);
                if ((this.zzm[zzL] & 1) != 0) {
                    break;
                }
                zzL--;
                if (zzL == -1) {
                    zzL = this.zzi - 1;
                }
            }
        }
        this.zzu = Math.max(j, j2);
        this.zzp -= i;
        int i4 = this.zzq + i;
        this.zzq = i4;
        int i5 = this.zzr + i;
        this.zzr = i5;
        int i6 = this.zzi;
        if (i5 >= i6) {
            this.zzr = i5 - i6;
        }
        int i7 = this.zzs - i;
        this.zzs = i7;
        if (i7 < 0) {
            this.zzs = 0;
        }
        this.zzc.zzd(i4);
        if (this.zzp == 0) {
            int i8 = this.zzr;
            if (i8 == 0) {
                i8 = this.zzi;
            }
            return this.zzk[i8 - 1] + this.zzl[i2];
        }
        return this.zzk[this.zzr];
    }
}
