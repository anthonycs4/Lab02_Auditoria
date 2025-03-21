package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import androidx.work.WorkRequest;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import kotlin.jvm.internal.LongCompanionObject;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzabk implements zzaah, zzpu, zzafe, zzafi, zzabv {
    private static final Map<String, String> zzb;
    private static final zzjq zzc;
    private boolean zzA;
    private boolean zzC;
    private boolean zzD;
    private int zzE;
    private long zzG;
    private boolean zzI;
    private int zzJ;
    private boolean zzK;
    private boolean zzL;
    private final zzaet zzM;
    private final zzaek zzN;
    private final Uri zzd;
    private final zzaef zze;
    private final zzoz zzf;
    private final zzaas zzg;
    private final zzou zzh;
    private final zzabg zzi;
    private final long zzj;
    private final zzabb zzl;
    private zzaag zzq;
    private zzye zzr;
    private boolean zzu;
    private boolean zzv;
    private boolean zzw;
    private zzabj zzx;
    private zzqm zzy;
    private final zzafl zzk = new zzafl("ProgressiveMediaPeriod");
    private final zzafv zzm = new zzafv(zzaft.zza);
    private final Runnable zzn = new Runnable(this) { // from class: com.google.android.gms.internal.ads.zzabc
        private final zzabk zza;

        /* JADX INFO: Access modifiers changed from: package-private */
        {
            this.zza = this;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.zza.zzJ();
        }
    };
    private final Runnable zzo = new Runnable(this) { // from class: com.google.android.gms.internal.ads.zzabd
        private final zzabk zza;

        /* JADX INFO: Access modifiers changed from: package-private */
        {
            this.zza = this;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.zza.zzA();
        }
    };
    private final Handler zzp = zzaht.zzh(null);
    private zzabi[] zzt = new zzabi[0];
    private zzabw[] zzs = new zzabw[0];
    private long zzH = -9223372036854775807L;
    private long zzF = -1;
    private long zzz = -9223372036854775807L;
    private int zzB = 1;

    static {
        HashMap hashMap = new HashMap();
        hashMap.put("Icy-MetaData", "1");
        zzb = Collections.unmodifiableMap(hashMap);
        zzjp zzjpVar = new zzjp();
        zzjpVar.zza("icy");
        zzjpVar.zzj("application/x-icy");
        zzc = zzjpVar.zzD();
    }

    public zzabk(Uri uri, zzaef zzaefVar, zzabb zzabbVar, zzoz zzozVar, zzou zzouVar, zzaet zzaetVar, zzaas zzaasVar, zzabg zzabgVar, zzaek zzaekVar, String str, int i, byte[] bArr) {
        this.zzd = uri;
        this.zze = zzaefVar;
        this.zzf = zzozVar;
        this.zzh = zzouVar;
        this.zzM = zzaetVar;
        this.zzg = zzaasVar;
        this.zzi = zzabgVar;
        this.zzN = zzaekVar;
        this.zzj = i;
        this.zzl = zzabbVar;
    }

    private final void zzK(int i) {
        zzU();
        zzabj zzabjVar = this.zzx;
        boolean[] zArr = zzabjVar.zzd;
        if (zArr[i]) {
            return;
        }
        zzjq zza = zzabjVar.zza.zza(i).zza(0);
        this.zzg.zzl(zzags.zzf(zza.zzl), zza, 0, null, this.zzG);
        zArr[i] = true;
    }

    private final void zzL(int i) {
        zzU();
        boolean[] zArr = this.zzx.zzb;
        if (this.zzI && zArr[i] && !this.zzs[i].zzq(false)) {
            this.zzH = 0L;
            this.zzI = false;
            this.zzD = true;
            this.zzG = 0L;
            this.zzJ = 0;
            for (zzabw zzabwVar : this.zzs) {
                zzabwVar.zzh(false);
            }
            zzaag zzaagVar = this.zzq;
            Objects.requireNonNull(zzaagVar);
            zzaagVar.zzm(this);
        }
    }

    private final boolean zzM() {
        return this.zzD || zzT();
    }

    private final zzqq zzN(zzabi zzabiVar) {
        int length = this.zzs.length;
        for (int i = 0; i < length; i++) {
            if (zzabiVar.equals(this.zzt[i])) {
                return this.zzs[i];
            }
        }
        zzaek zzaekVar = this.zzN;
        Looper looper = this.zzp.getLooper();
        zzoz zzozVar = this.zzf;
        zzou zzouVar = this.zzh;
        Objects.requireNonNull(looper);
        Objects.requireNonNull(zzozVar);
        zzabw zzabwVar = new zzabw(zzaekVar, looper, zzozVar, zzouVar, null);
        zzabwVar.zzx(this);
        int i2 = length + 1;
        zzabi[] zzabiVarArr = (zzabi[]) Arrays.copyOf(this.zzt, i2);
        zzabiVarArr[length] = zzabiVar;
        this.zzt = (zzabi[]) zzaht.zze(zzabiVarArr);
        zzabw[] zzabwVarArr = (zzabw[]) Arrays.copyOf(this.zzs, i2);
        zzabwVarArr[length] = zzabwVar;
        this.zzs = (zzabw[]) zzaht.zze(zzabwVarArr);
        return zzabwVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzO */
    public final void zzJ() {
        zzxu zzd;
        if (this.zzL || this.zzv || !this.zzu || this.zzy == null) {
            return;
        }
        for (zzabw zzabwVar : this.zzs) {
            if (zzabwVar.zzn() == null) {
                return;
            }
        }
        this.zzm.zzb();
        int length = this.zzs.length;
        zzacf[] zzacfVarArr = new zzacf[length];
        boolean[] zArr = new boolean[length];
        for (int i = 0; i < length; i++) {
            zzjq zzn = this.zzs[i].zzn();
            Objects.requireNonNull(zzn);
            String str = zzn.zzl;
            boolean zza = zzags.zza(str);
            boolean z = zza || zzags.zzb(str);
            zArr[i] = z;
            this.zzw = z | this.zzw;
            zzye zzyeVar = this.zzr;
            if (zzyeVar != null) {
                if (zza || this.zzt[i].zzb) {
                    zzxu zzxuVar = zzn.zzj;
                    if (zzxuVar == null) {
                        zzd = new zzxu(zzyeVar);
                    } else {
                        zzd = zzxuVar.zzd(zzyeVar);
                    }
                    zzjp zza2 = zzn.zza();
                    zza2.zzi(zzd);
                    zzn = zza2.zzD();
                }
                if (zza && zzn.zzf == -1 && zzn.zzg == -1 && zzyeVar.zza != -1) {
                    zzjp zza3 = zzn.zza();
                    zza3.zzf(zzyeVar.zza);
                    zzn = zza3.zzD();
                }
            }
            zzacfVarArr[i] = new zzacf(zzn.zzb(this.zzf.zza(zzn)));
        }
        this.zzx = new zzabj(new zzach(zzacfVarArr), zArr);
        this.zzv = true;
        zzaag zzaagVar = this.zzq;
        Objects.requireNonNull(zzaagVar);
        zzaagVar.zzj(this);
    }

    private final void zzP(zzabf zzabfVar) {
        if (this.zzF == -1) {
            this.zzF = zzabf.zzh(zzabfVar);
        }
    }

    private final void zzQ() {
        zzabf zzabfVar = new zzabf(this, this.zzd, this.zze, this.zzl, this, this.zzm);
        if (this.zzv) {
            zzafs.zzd(zzT());
            long j = this.zzz;
            if (j == -9223372036854775807L || this.zzH <= j) {
                zzqm zzqmVar = this.zzy;
                Objects.requireNonNull(zzqmVar);
                zzabf.zzi(zzabfVar, zzqmVar.zzb(this.zzH).zza.zzc, this.zzH);
                for (zzabw zzabwVar : this.zzs) {
                    zzabwVar.zzi(this.zzH);
                }
                this.zzH = -9223372036854775807L;
            } else {
                this.zzK = true;
                this.zzH = -9223372036854775807L;
                return;
            }
        }
        this.zzJ = zzR();
        long zzd = this.zzk.zzd(zzabfVar, this, zzaet.zza(this.zzB));
        zzaej zzf = zzabf.zzf(zzabfVar);
        this.zzg.zzd(new zzaaa(zzabf.zze(zzabfVar), zzf, zzf.zza, Collections.emptyMap(), zzd, 0L, 0L), 1, -1, null, 0, null, zzabf.zzg(zzabfVar), this.zzz);
    }

    private final int zzR() {
        int i = 0;
        for (zzabw zzabwVar : this.zzs) {
            i += zzabwVar.zzj();
        }
        return i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long zzS() {
        long j = Long.MIN_VALUE;
        for (zzabw zzabwVar : this.zzs) {
            j = Math.max(j, zzabwVar.zzo());
        }
        return j;
    }

    private final boolean zzT() {
        return this.zzH != -9223372036854775807L;
    }

    @EnsuresNonNull({"trackState", "seekMap"})
    private final void zzU() {
        zzafs.zzd(this.zzv);
        Objects.requireNonNull(this.zzx);
        Objects.requireNonNull(this.zzy);
    }

    @Override // com.google.android.gms.internal.ads.zzaah
    public final void zza(zzaag zzaagVar, long j) {
        this.zzq = zzaagVar;
        this.zzm.zza();
        zzQ();
    }

    @Override // com.google.android.gms.internal.ads.zzaah
    public final void zzb() throws IOException {
        zzr();
        if (this.zzK && !this.zzv) {
            throw new zzkr("Loading finished before preparation is complete.");
        }
    }

    @Override // com.google.android.gms.internal.ads.zzpu
    public final zzqq zzbi(int i, int i2) {
        return zzN(new zzabi(i, false));
    }

    @Override // com.google.android.gms.internal.ads.zzpu
    public final void zzbj() {
        this.zzu = true;
        this.zzp.post(this.zzn);
    }

    @Override // com.google.android.gms.internal.ads.zzpu
    public final void zzbk(final zzqm zzqmVar) {
        this.zzp.post(new Runnable(this, zzqmVar) { // from class: com.google.android.gms.internal.ads.zzabe
            private final zzabk zza;
            private final zzqm zzb;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zza = this;
                this.zzb = zzqmVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzz(this.zzb);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzaah
    public final zzach zzc() {
        zzU();
        return this.zzx.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzaah
    public final void zzd(long j, boolean z) {
        zzU();
        if (zzT()) {
            return;
        }
        boolean[] zArr = this.zzx.zzc;
        int length = this.zzs.length;
        for (int i = 0; i < length; i++) {
            this.zzs[i].zzv(j, false, zArr[i]);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaah, com.google.android.gms.internal.ads.zzabz
    public final void zze(long j) {
    }

    @Override // com.google.android.gms.internal.ads.zzaah
    public final long zzf() {
        if (this.zzD) {
            if (this.zzK || zzR() > this.zzJ) {
                this.zzD = false;
                return this.zzG;
            }
            return -9223372036854775807L;
        }
        return -9223372036854775807L;
    }

    @Override // com.google.android.gms.internal.ads.zzaah, com.google.android.gms.internal.ads.zzabz
    public final long zzg() {
        long j;
        zzU();
        boolean[] zArr = this.zzx.zzb;
        if (this.zzK) {
            return Long.MIN_VALUE;
        }
        if (zzT()) {
            return this.zzH;
        }
        if (this.zzw) {
            int length = this.zzs.length;
            j = Long.MAX_VALUE;
            for (int i = 0; i < length; i++) {
                if (zArr[i] && !this.zzs[i].zzp()) {
                    j = Math.min(j, this.zzs[i].zzo());
                }
            }
        } else {
            j = Long.MAX_VALUE;
        }
        if (j == LongCompanionObject.MAX_VALUE) {
            j = zzS();
        }
        return j == Long.MIN_VALUE ? this.zzG : j;
    }

    @Override // com.google.android.gms.internal.ads.zzaah
    public final long zzh(long j) {
        int i;
        zzU();
        boolean[] zArr = this.zzx.zzb;
        if (true != this.zzy.zza()) {
            j = 0;
        }
        this.zzD = false;
        this.zzG = j;
        if (zzT()) {
            this.zzH = j;
            return j;
        }
        if (this.zzB != 7) {
            int length = this.zzs.length;
            while (i < length) {
                i = (this.zzs[i].zzs(j, false) || (!zArr[i] && this.zzw)) ? i + 1 : 0;
            }
            return j;
        }
        this.zzI = false;
        this.zzH = j;
        this.zzK = false;
        if (this.zzk.zze()) {
            for (zzabw zzabwVar : this.zzs) {
                zzabwVar.zzw();
            }
            this.zzk.zzf();
        } else {
            this.zzk.zzc();
            for (zzabw zzabwVar2 : this.zzs) {
                zzabwVar2.zzh(false);
            }
        }
        return j;
    }

    @Override // com.google.android.gms.internal.ads.zzaah
    public final long zzi(long j, zzlj zzljVar) {
        zzU();
        if (this.zzy.zza()) {
            zzqk zzb2 = this.zzy.zzb(j);
            long j2 = zzb2.zza.zzb;
            long j3 = zzb2.zzb.zzb;
            long j4 = zzljVar.zzf;
            if (j4 == 0 && zzljVar.zzg == 0) {
                return j;
            }
            long zzC = zzaht.zzC(j, j4, Long.MIN_VALUE);
            long zzB = zzaht.zzB(j, zzljVar.zzg, LongCompanionObject.MAX_VALUE);
            boolean z = true;
            boolean z2 = zzC <= j2 && j2 <= zzB;
            z = (zzC > j3 || j3 > zzB) ? false : false;
            if (z2 && z) {
                if (Math.abs(j2 - j) > Math.abs(j3 - j)) {
                    return j3;
                }
            } else if (!z2) {
                return z ? j3 : zzC;
            }
            return j2;
        }
        return 0L;
    }

    public final void zzj() {
        if (this.zzv) {
            for (zzabw zzabwVar : this.zzs) {
                zzabwVar.zzk();
            }
        }
        this.zzk.zzg(this);
        this.zzp.removeCallbacksAndMessages(null);
        this.zzq = null;
        this.zzL = true;
    }

    @Override // com.google.android.gms.internal.ads.zzaah, com.google.android.gms.internal.ads.zzabz
    public final long zzk() {
        if (this.zzE == 0) {
            return Long.MIN_VALUE;
        }
        return zzg();
    }

    @Override // com.google.android.gms.internal.ads.zzaah, com.google.android.gms.internal.ads.zzabz
    public final boolean zzl(long j) {
        if (this.zzK || this.zzk.zzb() || this.zzI) {
            return false;
        }
        if (this.zzv && this.zzE == 0) {
            return false;
        }
        boolean zza = this.zzm.zza();
        if (this.zzk.zze()) {
            return zza;
        }
        zzQ();
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzafi
    public final void zzm() {
        for (zzabw zzabwVar : this.zzs) {
            zzabwVar.zzg();
        }
        this.zzl.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzaah, com.google.android.gms.internal.ads.zzabz
    public final boolean zzn() {
        return this.zzk.zze() && this.zzm.zzd();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean zzo(int i) {
        return !zzM() && this.zzs[i].zzq(this.zzK);
    }

    @Override // com.google.android.gms.internal.ads.zzaah
    public final long zzp(zzacs[] zzacsVarArr, boolean[] zArr, zzabx[] zzabxVarArr, boolean[] zArr2, long j) {
        zzacs zzacsVar;
        int i;
        zzU();
        zzabj zzabjVar = this.zzx;
        zzach zzachVar = zzabjVar.zza;
        boolean[] zArr3 = zzabjVar.zzc;
        int i2 = this.zzE;
        int i3 = 0;
        for (int i4 = 0; i4 < zzacsVarArr.length; i4++) {
            zzabx zzabxVar = zzabxVarArr[i4];
            if (zzabxVar != null && (zzacsVarArr[i4] == null || !zArr[i4])) {
                i = ((zzabh) zzabxVar).zzb;
                zzafs.zzd(zArr3[i]);
                this.zzE--;
                zArr3[i] = false;
                zzabxVarArr[i4] = null;
            }
        }
        boolean z = !this.zzC ? j == 0 : i2 != 0;
        for (int i5 = 0; i5 < zzacsVarArr.length; i5++) {
            if (zzabxVarArr[i5] == null && (zzacsVar = zzacsVarArr[i5]) != null) {
                zzafs.zzd(zzacsVar.zzc() == 1);
                zzafs.zzd(zzacsVar.zze(0) == 0);
                int zzb2 = zzachVar.zzb(zzacsVar.zzb());
                zzafs.zzd(!zArr3[zzb2]);
                this.zzE++;
                zArr3[zzb2] = true;
                zzabxVarArr[i5] = new zzabh(this, zzb2);
                zArr2[i5] = true;
                if (!z) {
                    zzabw zzabwVar = this.zzs[zzb2];
                    z = (zzabwVar.zzs(j, true) || zzabwVar.zzm() == 0) ? false : true;
                }
            }
        }
        if (this.zzE == 0) {
            this.zzI = false;
            this.zzD = false;
            if (this.zzk.zze()) {
                zzabw[] zzabwVarArr = this.zzs;
                int length = zzabwVarArr.length;
                while (i3 < length) {
                    zzabwVarArr[i3].zzw();
                    i3++;
                }
                this.zzk.zzf();
            } else {
                for (zzabw zzabwVar2 : this.zzs) {
                    zzabwVar2.zzh(false);
                }
            }
        } else if (z) {
            j = zzh(j);
            while (i3 < zzabxVarArr.length) {
                if (zzabxVarArr[i3] != null) {
                    zArr2[i3] = true;
                }
                i3++;
            }
        }
        this.zzC = true;
        return j;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzq(int i) throws IOException {
        this.zzs[i].zzl();
        zzr();
    }

    final void zzr() throws IOException {
        this.zzk.zzh(zzaet.zza(this.zzB));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int zzs(int i, zzjr zzjrVar, zzol zzolVar, int i2) {
        if (zzM()) {
            return -3;
        }
        zzK(i);
        int zzr = this.zzs[i].zzr(zzjrVar, zzolVar, i2, this.zzK);
        if (zzr == -3) {
            zzL(i);
        }
        return zzr;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int zzt(int i, long j) {
        if (zzM()) {
            return 0;
        }
        zzK(i);
        zzabw zzabwVar = this.zzs[i];
        int zzt = zzabwVar.zzt(j, this.zzK);
        zzabwVar.zzu(zzt);
        if (zzt == 0) {
            zzL(i);
            return 0;
        }
        return zzt;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final zzqq zzu() {
        return zzN(new zzabi(0, true));
    }

    @Override // com.google.android.gms.internal.ads.zzabv
    public final void zzv(zzjq zzjqVar) {
        this.zzp.post(this.zzn);
    }

    @Override // com.google.android.gms.internal.ads.zzafe
    public final /* bridge */ /* synthetic */ zzaff zzw(zzafh zzafhVar, long j, long j2, IOException iOException, int i) {
        zzaff zza;
        zzqm zzqmVar;
        zzabf zzabfVar = (zzabf) zzafhVar;
        zzP(zzabfVar);
        zzafo zzd = zzabf.zzd(zzabfVar);
        zzaaa zzaaaVar = new zzaaa(zzabf.zze(zzabfVar), zzabf.zzf(zzabfVar), zzd.zzh(), zzd.zzi(), j, j2, zzd.zzg());
        new zzaaf(1, -1, null, 0, null, zzhx.zza(zzabf.zzg(zzabfVar)), zzhx.zza(this.zzz));
        long min = ((iOException instanceof zzkr) || (iOException instanceof FileNotFoundException) || (iOException instanceof zzaex) || (iOException instanceof zzafk)) ? -9223372036854775807L : Math.min((i - 1) * 1000, 5000);
        if (min == -9223372036854775807L) {
            zza = zzafl.zzd;
        } else {
            int zzR = zzR();
            boolean z = zzR > this.zzJ;
            if (this.zzF != -1 || ((zzqmVar = this.zzy) != null && zzqmVar.zzc() != -9223372036854775807L)) {
                this.zzJ = zzR;
            } else if (!this.zzv || zzM()) {
                this.zzD = this.zzv;
                this.zzG = 0L;
                this.zzJ = 0;
                for (zzabw zzabwVar : this.zzs) {
                    zzabwVar.zzh(false);
                }
                zzabf.zzi(zzabfVar, 0L, 0L);
            } else {
                this.zzI = true;
                zza = zzafl.zzc;
            }
            zza = zzafl.zza(z, min);
        }
        zzaff zzaffVar = zza;
        boolean z2 = !zzaffVar.zza();
        this.zzg.zzj(zzaaaVar, 1, -1, null, 0, null, zzabf.zzg(zzabfVar), this.zzz, iOException, z2);
        if (z2) {
            zzabf.zze(zzabfVar);
        }
        return zzaffVar;
    }

    @Override // com.google.android.gms.internal.ads.zzafe
    public final /* bridge */ /* synthetic */ void zzx(zzafh zzafhVar, long j, long j2, boolean z) {
        zzabf zzabfVar = (zzabf) zzafhVar;
        zzafo zzd = zzabf.zzd(zzabfVar);
        zzaaa zzaaaVar = new zzaaa(zzabf.zze(zzabfVar), zzabf.zzf(zzabfVar), zzd.zzh(), zzd.zzi(), j, j2, zzd.zzg());
        zzabf.zze(zzabfVar);
        this.zzg.zzh(zzaaaVar, 1, -1, null, 0, null, zzabf.zzg(zzabfVar), this.zzz);
        if (z) {
            return;
        }
        zzP(zzabfVar);
        for (zzabw zzabwVar : this.zzs) {
            zzabwVar.zzh(false);
        }
        if (this.zzE > 0) {
            zzaag zzaagVar = this.zzq;
            Objects.requireNonNull(zzaagVar);
            zzaagVar.zzm(this);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzafe
    public final /* bridge */ /* synthetic */ void zzy(zzafh zzafhVar, long j, long j2) {
        zzqm zzqmVar;
        if (this.zzz == -9223372036854775807L && (zzqmVar = this.zzy) != null) {
            boolean zza = zzqmVar.zza();
            long zzS = zzS();
            long j3 = zzS == Long.MIN_VALUE ? 0L : zzS + WorkRequest.MIN_BACKOFF_MILLIS;
            this.zzz = j3;
            this.zzi.zzb(j3, zza, this.zzA);
        }
        zzabf zzabfVar = (zzabf) zzafhVar;
        zzafo zzd = zzabf.zzd(zzabfVar);
        zzaaa zzaaaVar = new zzaaa(zzabf.zze(zzabfVar), zzabf.zzf(zzabfVar), zzd.zzh(), zzd.zzi(), j, j2, zzd.zzg());
        zzabf.zze(zzabfVar);
        this.zzg.zzf(zzaaaVar, 1, -1, null, 0, null, zzabf.zzg(zzabfVar), this.zzz);
        zzP(zzabfVar);
        this.zzK = true;
        zzaag zzaagVar = this.zzq;
        Objects.requireNonNull(zzaagVar);
        zzaagVar.zzm(this);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzA() {
        if (this.zzL) {
            return;
        }
        zzaag zzaagVar = this.zzq;
        Objects.requireNonNull(zzaagVar);
        zzaagVar.zzm(this);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzz(zzqm zzqmVar) {
        this.zzy = this.zzr == null ? zzqmVar : new zzql(-9223372036854775807L, 0L);
        this.zzz = zzqmVar.zzc();
        boolean z = false;
        if (this.zzF == -1 && zzqmVar.zzc() == -9223372036854775807L) {
            z = true;
        }
        this.zzA = z;
        this.zzB = true == z ? 7 : 1;
        this.zzi.zzb(this.zzz, zzqmVar.zza(), this.zzA);
        if (this.zzv) {
            return;
        }
        zzJ();
    }
}
