package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.Handler;
import android.util.SparseArray;
import androidx.work.WorkRequest;
import java.io.IOException;
import kotlin.jvm.internal.LongCompanionObject;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzaoq implements zzaou, zzalv, zzaqo, zzape {
    private long zzB;
    private int zzD;
    private boolean zzE;
    private boolean zzF;
    private final zzaqh zzG;
    private final Uri zza;
    private final zzaqe zzb;
    private final int zzc;
    private final Handler zzd;
    private final zzaor zze;
    private final zzaov zzf;
    private final long zzg;
    private final zzaoo zzi;
    private zzaot zzo;
    private zzamb zzp;
    private boolean zzq;
    private boolean zzr;
    private boolean zzs;
    private boolean zzt;
    private int zzu;
    private zzapl zzv;
    private long zzw;
    private boolean[] zzx;
    private boolean[] zzy;
    private boolean zzz;
    private final zzaqs zzh = new zzaqs("Loader:ExtractorMediaPeriod");
    private final zzaqw zzj = new zzaqw();
    private final Runnable zzk = new zzaoj(this);
    private final Runnable zzl = new zzaok(this);
    private final Handler zzm = new Handler();
    private long zzC = -9223372036854775807L;
    private final SparseArray<zzapf> zzn = new SparseArray<>();
    private long zzA = -1;

    public zzaoq(Uri uri, zzaqe zzaqeVar, zzalu[] zzaluVarArr, int i, Handler handler, zzaor zzaorVar, zzaov zzaovVar, zzaqh zzaqhVar, String str, int i2, byte[] bArr) {
        this.zza = uri;
        this.zzb = zzaqeVar;
        this.zzc = i;
        this.zzd = handler;
        this.zze = zzaorVar;
        this.zzf = zzaovVar;
        this.zzG = zzaqhVar;
        this.zzg = i2;
        this.zzi = new zzaoo(zzaluVarArr, this);
    }

    private final void zzC(zzaon zzaonVar) {
        long j;
        if (this.zzA == -1) {
            j = zzaonVar.zzj;
            this.zzA = j;
        }
    }

    private final void zzD() {
        zzamb zzambVar;
        zzaon zzaonVar = new zzaon(this, this.zza, this.zzb, this.zzi, this.zzj);
        if (this.zzr) {
            zzaqu.zzd(zzG());
            long j = this.zzw;
            if (j == -9223372036854775807L || this.zzC < j) {
                zzaonVar.zza(this.zzp.zzc(this.zzC), this.zzC);
                this.zzC = -9223372036854775807L;
            } else {
                this.zzE = true;
                this.zzC = -9223372036854775807L;
                return;
            }
        }
        this.zzD = zzE();
        int i = this.zzc;
        if (i == -1) {
            i = (this.zzr && this.zzA == -1 && ((zzambVar = this.zzp) == null || zzambVar.zzb() == -9223372036854775807L)) ? 6 : 3;
        }
        this.zzh.zza(zzaonVar, this, i);
    }

    private final int zzE() {
        int size = this.zzn.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            i += this.zzn.valueAt(i2).zzf();
        }
        return i;
    }

    private final long zzF() {
        int size = this.zzn.size();
        long j = Long.MIN_VALUE;
        for (int i = 0; i < size; i++) {
            j = Math.max(j, this.zzn.valueAt(i).zzj());
        }
        return j;
    }

    private final boolean zzG() {
        return this.zzC != -9223372036854775807L;
    }

    public static /* synthetic */ void zzt(zzaoq zzaoqVar) {
        if (zzaoqVar.zzF || zzaoqVar.zzr || zzaoqVar.zzp == null || !zzaoqVar.zzq) {
            return;
        }
        int size = zzaoqVar.zzn.size();
        for (int i = 0; i < size; i++) {
            if (zzaoqVar.zzn.valueAt(i).zzi() == null) {
                return;
            }
        }
        zzaoqVar.zzj.zzb();
        zzapk[] zzapkVarArr = new zzapk[size];
        zzaoqVar.zzy = new boolean[size];
        zzaoqVar.zzx = new boolean[size];
        zzaoqVar.zzw = zzaoqVar.zzp.zzb();
        int i2 = 0;
        while (true) {
            boolean z = true;
            if (i2 < size) {
                zzajt zzi = zzaoqVar.zzn.valueAt(i2).zzi();
                zzapkVarArr[i2] = new zzapk(zzi);
                String str = zzi.zzf;
                if (!zzaqz.zzb(str) && !zzaqz.zza(str)) {
                    z = false;
                }
                zzaoqVar.zzy[i2] = z;
                zzaoqVar.zzz = z | zzaoqVar.zzz;
                i2++;
            } else {
                zzaoqVar.zzv = new zzapl(zzapkVarArr);
                zzaoqVar.zzr = true;
                zzaoqVar.zzf.zzi(new zzapj(zzaoqVar.zzw, zzaoqVar.zzp.zza()), null);
                zzaoqVar.zzo.zzbn(zzaoqVar);
                return;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaou
    public final long zzB(zzapp[] zzappVarArr, boolean[] zArr, zzapg[] zzapgVarArr, boolean[] zArr2, long j) {
        zzapp zzappVar;
        int i;
        zzaqu.zzd(this.zzr);
        for (int i2 = 0; i2 < zzappVarArr.length; i2++) {
            zzapg zzapgVar = zzapgVarArr[i2];
            if (zzapgVar != null && (zzappVarArr[i2] == null || !zArr[i2])) {
                i = ((zzaop) zzapgVar).zzb;
                zzaqu.zzd(this.zzx[i]);
                this.zzu--;
                this.zzx[i] = false;
                this.zzn.valueAt(i).zzg();
                zzapgVarArr[i2] = null;
            }
        }
        boolean z = false;
        for (int i3 = 0; i3 < zzappVarArr.length; i3++) {
            if (zzapgVarArr[i3] == null && (zzappVar = zzappVarArr[i3]) != null) {
                zzaqu.zzd(zzappVar.zzb() == 1);
                zzaqu.zzd(zzappVar.zzd(0) == 0);
                int zzb = this.zzv.zzb(zzappVar.zza());
                zzaqu.zzd(!this.zzx[zzb]);
                this.zzu++;
                this.zzx[zzb] = true;
                zzapgVarArr[i3] = new zzaop(this, zzb);
                zArr2[i3] = true;
                z = true;
            }
        }
        if (!this.zzs) {
            int size = this.zzn.size();
            for (int i4 = 0; i4 < size; i4++) {
                if (!this.zzx[i4]) {
                    this.zzn.valueAt(i4).zzg();
                }
            }
        }
        if (this.zzu == 0) {
            this.zzt = false;
            if (this.zzh.zzb()) {
                this.zzh.zzc();
            }
        } else if (!this.zzs ? j != 0 : z) {
            j = zzk(j);
            for (int i5 = 0; i5 < zzapgVarArr.length; i5++) {
                if (zzapgVarArr[i5] != null) {
                    zArr2[i5] = true;
                }
            }
        }
        this.zzs = true;
        return j;
    }

    @Override // com.google.android.gms.internal.ads.zzaou, com.google.android.gms.internal.ads.zzapi
    public final long zza() {
        if (this.zzu == 0) {
            return Long.MIN_VALUE;
        }
        return zzj();
    }

    @Override // com.google.android.gms.internal.ads.zzaou, com.google.android.gms.internal.ads.zzapi
    public final boolean zzb(long j) {
        if (this.zzE) {
            return false;
        }
        if (this.zzr && this.zzu == 0) {
            return false;
        }
        boolean zza = this.zzj.zza();
        if (this.zzh.zzb()) {
            return zza;
        }
        zzD();
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzalv
    public final zzamd zzbl(int i, int i2) {
        zzapf zzapfVar = this.zzn.get(i);
        if (zzapfVar == null) {
            zzapf zzapfVar2 = new zzapf(this.zzG, null);
            zzapfVar2.zzn(this);
            this.zzn.put(i, zzapfVar2);
            return zzapfVar2;
        }
        return zzapfVar;
    }

    @Override // com.google.android.gms.internal.ads.zzalv
    public final void zzbm() {
        this.zzq = true;
        this.zzm.post(this.zzk);
    }

    @Override // com.google.android.gms.internal.ads.zzalv
    public final void zzc(zzamb zzambVar) {
        this.zzp = zzambVar;
        this.zzm.post(this.zzk);
    }

    public final void zzd() {
        this.zzh.zzd(new zzaol(this, this.zzi));
        this.zzm.removeCallbacksAndMessages(null);
        this.zzF = true;
    }

    @Override // com.google.android.gms.internal.ads.zzaou
    public final void zze(zzaot zzaotVar, long j) {
        this.zzo = zzaotVar;
        this.zzj.zza();
        zzD();
    }

    @Override // com.google.android.gms.internal.ads.zzaou
    public final void zzf() throws IOException {
        this.zzh.zze(Integer.MIN_VALUE);
    }

    @Override // com.google.android.gms.internal.ads.zzaou
    public final zzapl zzg() {
        return this.zzv;
    }

    @Override // com.google.android.gms.internal.ads.zzaou
    public final void zzh(long j) {
    }

    @Override // com.google.android.gms.internal.ads.zzaou
    public final long zzi() {
        if (this.zzt) {
            this.zzt = false;
            return this.zzB;
        }
        return -9223372036854775807L;
    }

    @Override // com.google.android.gms.internal.ads.zzaou
    public final long zzj() {
        long zzF;
        if (this.zzE) {
            return Long.MIN_VALUE;
        }
        if (zzG()) {
            return this.zzC;
        }
        if (this.zzz) {
            int size = this.zzn.size();
            zzF = LongCompanionObject.MAX_VALUE;
            for (int i = 0; i < size; i++) {
                if (this.zzy[i]) {
                    zzF = Math.min(zzF, this.zzn.valueAt(i).zzj());
                }
            }
        } else {
            zzF = zzF();
        }
        return zzF == Long.MIN_VALUE ? this.zzB : zzF;
    }

    @Override // com.google.android.gms.internal.ads.zzaou
    public final long zzk(long j) {
        if (true != this.zzp.zza()) {
            j = 0;
        }
        this.zzB = j;
        int size = this.zzn.size();
        boolean zzG = true ^ zzG();
        int i = 0;
        while (true) {
            if (!zzG) {
                this.zzC = j;
                this.zzE = false;
                if (this.zzh.zzb()) {
                    this.zzh.zzc();
                } else {
                    for (int i2 = 0; i2 < size; i2++) {
                        this.zzn.valueAt(i2).zze(this.zzx[i2]);
                    }
                }
            } else if (i >= size) {
                break;
            } else {
                if (this.zzx[i]) {
                    zzG = this.zzn.valueAt(i).zzl(j, false);
                }
                i++;
            }
        }
        this.zzt = false;
        return j;
    }

    public final boolean zzl(int i) {
        return this.zzE || (!zzG() && this.zzn.valueAt(i).zzh());
    }

    public final void zzm() throws IOException {
        this.zzh.zze(Integer.MIN_VALUE);
    }

    public final int zzn(int i, zzaju zzajuVar, zzalm zzalmVar, boolean z) {
        if (this.zzt || zzG()) {
            return -3;
        }
        return this.zzn.valueAt(i).zzm(zzajuVar, zzalmVar, z, this.zzE, this.zzB);
    }

    public final void zzo(int i, long j) {
        zzapf valueAt = this.zzn.valueAt(i);
        if (!this.zzE || j <= valueAt.zzj()) {
            valueAt.zzl(j, true);
        } else {
            valueAt.zzk();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzape
    public final void zzp(zzajt zzajtVar) {
        this.zzm.post(this.zzk);
    }

    @Override // com.google.android.gms.internal.ads.zzaqo
    public final /* bridge */ /* synthetic */ int zzq(zzaqq zzaqqVar, long j, long j2, IOException iOException) {
        zzamb zzambVar;
        zzaon zzaonVar = (zzaon) zzaqqVar;
        zzC(zzaonVar);
        Handler handler = this.zzd;
        if (handler != null) {
            handler.post(new zzaom(this, iOException));
        }
        if (iOException instanceof zzapm) {
            return 3;
        }
        int zzE = zzE();
        int i = this.zzD;
        if (this.zzA == -1 && ((zzambVar = this.zzp) == null || zzambVar.zzb() == -9223372036854775807L)) {
            this.zzB = 0L;
            this.zzt = this.zzr;
            int size = this.zzn.size();
            for (int i2 = 0; i2 < size; i2++) {
                this.zzn.valueAt(i2).zze(!this.zzr || this.zzx[i2]);
            }
            zzaonVar.zza(0L, 0L);
        }
        this.zzD = zzE();
        return zzE <= i ? 0 : 1;
    }

    @Override // com.google.android.gms.internal.ads.zzaqo
    public final /* bridge */ /* synthetic */ void zzr(zzaqq zzaqqVar, long j, long j2, boolean z) {
        zzC((zzaon) zzaqqVar);
        if (z || this.zzu <= 0) {
            return;
        }
        int size = this.zzn.size();
        for (int i = 0; i < size; i++) {
            this.zzn.valueAt(i).zze(this.zzx[i]);
        }
        this.zzo.zzn(this);
    }

    @Override // com.google.android.gms.internal.ads.zzaqo
    public final /* bridge */ /* synthetic */ void zzs(zzaqq zzaqqVar, long j, long j2) {
        zzC((zzaon) zzaqqVar);
        this.zzE = true;
        if (this.zzw == -9223372036854775807L) {
            long zzF = zzF();
            long j3 = zzF == Long.MIN_VALUE ? 0L : zzF + WorkRequest.MIN_BACKOFF_MILLIS;
            this.zzw = j3;
            this.zzf.zzi(new zzapj(j3, this.zzp.zza()), null);
        }
        this.zzo.zzn(this);
    }
}
