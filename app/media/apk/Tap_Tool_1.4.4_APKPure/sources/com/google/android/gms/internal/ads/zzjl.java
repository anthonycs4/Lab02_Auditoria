package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.SystemClock;
import android.util.Log;
import android.util.Pair;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.UUID;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
final class zzjl implements Handler.Callback, zzaag, zzado, zzkp, zzia, zzlb {
    private boolean zzA;
    private boolean zzB;
    private boolean zzC;
    private int zzD;
    private zzjk zzE;
    private long zzF;
    private int zzG;
    private boolean zzH;
    private zzid zzI;
    private final zzchd zzJ;
    private final zzhz zzK;
    private final zzlg[] zza;
    private final zzlh[] zzb;
    private final zzadp zzc;
    private final zzadq zzd;
    private final zzadx zze;
    private final zzagf zzf;
    private final HandlerThread zzg;
    private final Looper zzh;
    private final zzlp zzi;
    private final zzln zzj;
    private final zzib zzk;
    private final ArrayList<zzjh> zzl;
    private final zzaft zzm;
    private final zzjj zzn;
    private final zzkj zzo;
    private final zzkq zzp;
    private zzlj zzq;
    private zzks zzr;
    private zzji zzs;
    private boolean zzt;
    private boolean zzv;
    private boolean zzw;
    private boolean zzx;
    private int zzy = 0;
    private boolean zzz = false;
    private boolean zzu = false;

    public zzjl(zzlg[] zzlgVarArr, zzadp zzadpVar, zzadq zzadqVar, zzchd zzchdVar, zzadx zzadxVar, int i, boolean z, zzlr zzlrVar, zzlj zzljVar, zzhz zzhzVar, long j, boolean z2, Looper looper, zzaft zzaftVar, zzjj zzjjVar, byte[] bArr) {
        this.zzn = zzjjVar;
        this.zza = zzlgVarArr;
        this.zzc = zzadpVar;
        this.zzd = zzadqVar;
        this.zzJ = zzchdVar;
        this.zze = zzadxVar;
        this.zzq = zzljVar;
        this.zzK = zzhzVar;
        this.zzm = zzaftVar;
        zzks zza = zzks.zza(zzadqVar);
        this.zzr = zza;
        this.zzs = new zzji(zza);
        this.zzb = new zzlh[2];
        for (int i2 = 0; i2 < 2; i2++) {
            zzlgVarArr[i2].zzc(i2);
            this.zzb[i2] = zzlgVarArr[i2].zzb();
        }
        this.zzk = new zzib(this, zzaftVar);
        this.zzl = new ArrayList<>();
        this.zzi = new zzlp();
        this.zzj = new zzln();
        zzadpVar.zzk(this, zzadxVar);
        this.zzH = true;
        Handler handler = new Handler(looper);
        this.zzo = new zzkj(null, handler);
        this.zzp = new zzkq(this, null, handler);
        HandlerThread handlerThread = new HandlerThread("ExoPlayer:Playback", -16);
        this.zzg = handlerThread;
        handlerThread.start();
        Looper looper2 = handlerThread.getLooper();
        this.zzh = looper2;
        this.zzf = zzaftVar.zza(looper2, this);
    }

    private final long zzA(zzlq zzlqVar, Object obj, long j) {
        zzlqVar.zze(zzlqVar.zzf(obj, this.zzj).zzc, this.zzi, 0L);
        zzlp zzlpVar = this.zzi;
        if (zzlpVar.zzf != -9223372036854775807L && zzlpVar.zzb()) {
            zzlp zzlpVar2 = this.zzi;
            if (zzlpVar2.zzi) {
                return zzhx.zzb(zzaht.zzX(zzlpVar2.zzg) - this.zzi.zzf) - j;
            }
        }
        return -9223372036854775807L;
    }

    private final boolean zzB(zzlq zzlqVar, zzaaj zzaajVar) {
        if (!zzaajVar.zzb() && !zzlqVar.zzt()) {
            zzlqVar.zze(zzlqVar.zzf(zzaajVar.zza, this.zzj).zzc, this.zzi, 0L);
            if (this.zzi.zzb()) {
                zzlp zzlpVar = this.zzi;
                if (zzlpVar.zzi && zzlpVar.zzf != -9223372036854775807L) {
                    return true;
                }
            }
        }
        return false;
    }

    private final void zzC(long j, long j2) {
        this.zzf.zzh(2);
        this.zzf.zzg(2, j + j2);
    }

    private final long zzD(zzaaj zzaajVar, long j, boolean z) throws zzid {
        return zzE(zzaajVar, j, this.zzo.zzh() != this.zzo.zzi(), z);
    }

    private final long zzE(zzaaj zzaajVar, long j, boolean z, boolean z2) throws zzid {
        zzy();
        this.zzw = false;
        if (z2 || this.zzr.zze == 3) {
            zzt(2);
        }
        zzkh zzh = this.zzo.zzh();
        zzkh zzkhVar = zzh;
        while (zzkhVar != null && !zzaajVar.equals(zzkhVar.zzf.zza)) {
            zzkhVar = zzkhVar.zzo();
        }
        if (z || zzh != zzkhVar || (zzkhVar != null && zzkhVar.zza() + j < 0)) {
            zzlg[] zzlgVarArr = this.zza;
            for (int i = 0; i < 2; i++) {
                zzK(zzlgVarArr[i]);
            }
            if (zzkhVar != null) {
                while (this.zzo.zzh() != zzkhVar) {
                    this.zzo.zzk();
                }
                this.zzo.zzl(zzkhVar);
                zzkhVar.zzb(0L);
                zzV();
            }
        }
        if (zzkhVar != null) {
            this.zzo.zzl(zzkhVar);
            if (!zzkhVar.zzd) {
                zzkhVar.zzf = zzkhVar.zzf.zza(j);
            } else {
                long j2 = zzkhVar.zzf.zze;
                if (j2 != -9223372036854775807L && j >= j2) {
                    j = Math.max(0L, j2 - 1);
                }
                if (zzkhVar.zze) {
                    long zzh2 = zzkhVar.zza.zzh(j);
                    zzkhVar.zza.zzd(zzh2, false);
                    j = zzh2;
                }
            }
            zzF(j);
            zzR();
        } else {
            this.zzo.zzm();
            zzF(j);
        }
        zzX(false);
        this.zzf.zzf(2);
        return j;
    }

    private final void zzF(long j) throws zzid {
        zzacs[] zzacsVarArr;
        zzkh zzh = this.zzo.zzh();
        if (zzh != null) {
            j += zzh.zza();
        }
        this.zzF = j;
        this.zzk.zzc(j);
        zzlg[] zzlgVarArr = this.zza;
        for (int i = 0; i < 2; i++) {
            zzlg zzlgVar = zzlgVarArr[i];
            if (zzae(zzlgVar)) {
                zzlgVar.zzo(this.zzF);
            }
        }
        for (zzkh zzh2 = this.zzo.zzh(); zzh2 != null; zzh2 = zzh2.zzo()) {
            for (zzacs zzacsVar : zzh2.zzq().zzd) {
            }
        }
    }

    private final void zzG(boolean z, boolean z2) {
        zzH(z || !this.zzA, false, true, false);
        this.zzs.zza(z2 ? 1 : 0);
        this.zzJ.zzb();
        zzt(1);
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:64:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void zzH(boolean r31, boolean r32, boolean r33, boolean r34) {
        /*
            Method dump skipped, instructions count: 251
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzjl.zzH(boolean, boolean, boolean, boolean):void");
    }

    private final Pair<zzaaj, Long> zzI(zzlq zzlqVar) {
        long j = 0;
        if (zzlqVar.zzt()) {
            return Pair.create(zzks.zzb(), 0L);
        }
        Pair<Object, Long> zzv = zzlqVar.zzv(this.zzi, this.zzj, zzlqVar.zzd(this.zzz), -9223372036854775807L);
        zzaaj zzp = this.zzo.zzp(zzlqVar, zzv.first, 0L);
        long longValue = ((Long) zzv.second).longValue();
        if (zzp.zzb()) {
            zzlqVar.zzf(zzp.zza, this.zzj);
            if (zzp.zzc == this.zzj.zzc(zzp.zzb)) {
                this.zzj.zzh();
            }
        } else {
            j = longValue;
        }
        return Pair.create(zzp, Long.valueOf(j));
    }

    private final void zzJ(zzlq zzlqVar, zzlq zzlqVar2) {
        if (zzlqVar.zzt() && zzlqVar2.zzt()) {
            return;
        }
        int size = this.zzl.size() - 1;
        if (size >= 0) {
            zzjh zzjhVar = this.zzl.get(size);
            Object obj = zzjhVar.zzb;
            zzld zzldVar = zzjhVar.zza;
            UUID uuid = zzhx.zza;
            throw null;
        }
        Collections.sort(this.zzl);
    }

    private final void zzK(zzlg zzlgVar) throws zzid {
        if (zzae(zzlgVar)) {
            this.zzk.zze(zzlgVar);
            zzag(zzlgVar);
            zzlgVar.zzq();
            this.zzD--;
        }
    }

    private final boolean zzL() {
        zzkh zzh = this.zzo.zzh();
        long j = zzh.zzf.zze;
        if (zzh.zzd) {
            return j == -9223372036854775807L || this.zzr.zzs < j || !zzab();
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:167:0x02fb  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x033d  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x0366  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void zzM(com.google.android.gms.internal.ads.zzlq r30, boolean r31) throws com.google.android.gms.internal.ads.zzid {
        /*
            Method dump skipped, instructions count: 877
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzjl.zzM(com.google.android.gms.internal.ads.zzlq, boolean):void");
    }

    private final void zzN(zzlq zzlqVar, zzaaj zzaajVar, zzlq zzlqVar2, zzaaj zzaajVar2, long j) {
        if (zzlqVar.zzt() || !zzB(zzlqVar, zzaajVar)) {
            float f = this.zzk.zzi().zzb;
            zzku zzkuVar = this.zzr.zzn;
            if (f != zzkuVar.zzb) {
                this.zzk.zzh(zzkuVar);
                return;
            }
            return;
        }
        zzlqVar.zze(zzlqVar.zzf(zzaajVar.zza, this.zzj).zzc, this.zzi, 0L);
        zzhz zzhzVar = this.zzK;
        zzkb zzkbVar = this.zzi.zzk;
        int i = zzaht.zza;
        zzhzVar.zza(zzkbVar);
        if (j != -9223372036854775807L) {
            this.zzK.zzb(zzA(zzlqVar, zzaajVar.zza, j));
            return;
        }
        if (zzaht.zzc(!zzlqVar2.zzt() ? zzlqVar2.zze(zzlqVar2.zzf(zzaajVar2.zza, this.zzj).zzc, this.zzi, 0L).zzb : null, this.zzi.zzb)) {
            return;
        }
        this.zzK.zzb(-9223372036854775807L);
    }

    private final void zzO() {
        zzkh zzh = this.zzo.zzh();
        boolean z = false;
        if (zzh != null && zzh.zzf.zzg && this.zzu) {
            z = true;
        }
        this.zzv = z;
    }

    private final void zzP(zzku zzkuVar, boolean z) throws zzid {
        zzQ(zzkuVar, zzkuVar.zzb, true, z);
    }

    private final void zzQ(zzku zzkuVar, float f, boolean z, boolean z2) throws zzid {
        int i;
        zzjl zzjlVar = this;
        if (z) {
            if (z2) {
                zzjlVar.zzs.zza(1);
            }
            zzks zzksVar = zzjlVar.zzr;
            zzjlVar = this;
            zzjlVar.zzr = new zzks(zzksVar.zza, zzksVar.zzb, zzksVar.zzc, zzksVar.zzd, zzksVar.zze, zzksVar.zzf, zzksVar.zzg, zzksVar.zzh, zzksVar.zzi, zzksVar.zzj, zzksVar.zzk, zzksVar.zzl, zzksVar.zzm, zzkuVar, zzksVar.zzq, zzksVar.zzr, zzksVar.zzs, zzksVar.zzo, zzksVar.zzp);
        }
        float f2 = zzkuVar.zzb;
        zzkh zzh = zzjlVar.zzo.zzh();
        while (true) {
            i = 0;
            if (zzh == null) {
                break;
            }
            zzacs[] zzacsVarArr = zzh.zzq().zzd;
            int length = zzacsVarArr.length;
            while (i < length) {
                zzacs zzacsVar = zzacsVarArr[i];
                i++;
            }
            zzh = zzh.zzo();
        }
        zzlg[] zzlgVarArr = zzjlVar.zza;
        while (i < 2) {
            zzlg zzlgVar = zzlgVarArr[i];
            if (zzlgVar != null) {
                zzlgVar.zzI(f, zzkuVar.zzb);
            }
            i++;
        }
    }

    private final void zzR() {
        long zza;
        long j;
        boolean zzd;
        if (zzS()) {
            zzkh zzg = this.zzo.zzg();
            long zzZ = zzZ(zzg.zzf());
            if (zzg == this.zzo.zzh()) {
                zza = this.zzF;
                j = zzg.zza();
            } else {
                zza = this.zzF - zzg.zza();
                j = zzg.zzf.zzb;
            }
            zzd = this.zzJ.zzd(zza - j, zzZ, this.zzk.zzi().zzb);
        } else {
            zzd = false;
        }
        this.zzx = zzd;
        if (zzd) {
            this.zzo.zzg().zzi(this.zzF);
        }
        zzT();
    }

    private final boolean zzS() {
        zzkh zzg = this.zzo.zzg();
        return (zzg == null || zzg.zzf() == Long.MIN_VALUE) ? false : true;
    }

    private final void zzT() {
        zzkh zzg = this.zzo.zzg();
        boolean z = this.zzx || (zzg != null && zzg.zza.zzn());
        zzks zzksVar = this.zzr;
        if (z != zzksVar.zzg) {
            this.zzr = new zzks(zzksVar.zza, zzksVar.zzb, zzksVar.zzc, zzksVar.zzd, zzksVar.zze, zzksVar.zzf, z, zzksVar.zzh, zzksVar.zzi, zzksVar.zzj, zzksVar.zzk, zzksVar.zzl, zzksVar.zzm, zzksVar.zzn, zzksVar.zzq, zzksVar.zzr, zzksVar.zzs, zzksVar.zzo, zzksVar.zzp);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x00b1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final com.google.android.gms.internal.ads.zzks zzU(com.google.android.gms.internal.ads.zzaaj r17, long r18, long r20, long r22, boolean r24, int r25) {
        /*
            r16 = this;
            r0 = r16
            r2 = r17
            r5 = r20
            boolean r1 = r0.zzH
            r3 = 0
            r4 = 1
            if (r1 != 0) goto L21
            com.google.android.gms.internal.ads.zzks r1 = r0.zzr
            long r7 = r1.zzs
            int r1 = (r18 > r7 ? 1 : (r18 == r7 ? 0 : -1))
            if (r1 != 0) goto L21
            com.google.android.gms.internal.ads.zzks r1 = r0.zzr
            com.google.android.gms.internal.ads.zzaaj r1 = r1.zzb
            boolean r1 = r2.equals(r1)
            if (r1 != 0) goto L1f
            goto L21
        L1f:
            r1 = 0
            goto L22
        L21:
            r1 = 1
        L22:
            r0.zzH = r1
            r16.zzO()
            com.google.android.gms.internal.ads.zzks r1 = r0.zzr
            com.google.android.gms.internal.ads.zzach r7 = r1.zzh
            com.google.android.gms.internal.ads.zzadq r8 = r1.zzi
            java.util.List<com.google.android.gms.internal.ads.zzxu> r1 = r1.zzj
            com.google.android.gms.internal.ads.zzkq r9 = r0.zzp
            boolean r9 = r9.zza()
            if (r9 == 0) goto L96
            com.google.android.gms.internal.ads.zzkj r1 = r0.zzo
            com.google.android.gms.internal.ads.zzkh r1 = r1.zzh()
            if (r1 != 0) goto L42
            com.google.android.gms.internal.ads.zzach r7 = com.google.android.gms.internal.ads.zzach.zza
            goto L46
        L42:
            com.google.android.gms.internal.ads.zzach r7 = r1.zzp()
        L46:
            if (r1 != 0) goto L4b
            com.google.android.gms.internal.ads.zzadq r8 = r0.zzd
            goto L4f
        L4b:
            com.google.android.gms.internal.ads.zzadq r8 = r1.zzq()
        L4f:
            com.google.android.gms.internal.ads.zzacs[] r9 = r8.zzd
            com.google.android.gms.internal.ads.zzfgw r10 = new com.google.android.gms.internal.ads.zzfgw
            r10.<init>()
            int r11 = r9.length
            r12 = 0
            r13 = 0
        L59:
            if (r12 >= r11) goto L79
            r14 = r9[r12]
            if (r14 == 0) goto L76
            com.google.android.gms.internal.ads.zzjq r14 = r14.zzd(r3)
            com.google.android.gms.internal.ads.zzxu r14 = r14.zzj
            if (r14 != 0) goto L72
            com.google.android.gms.internal.ads.zzxu r14 = new com.google.android.gms.internal.ads.zzxu
            com.google.android.gms.internal.ads.zzxt[] r15 = new com.google.android.gms.internal.ads.zzxt[r3]
            r14.<init>(r15)
            r10.zze(r14)
            goto L76
        L72:
            r10.zze(r14)
            r13 = 1
        L76:
            int r12 = r12 + 1
            goto L59
        L79:
            if (r13 == 0) goto L80
            com.google.android.gms.internal.ads.zzfgz r3 = r10.zzf()
            goto L84
        L80:
            com.google.android.gms.internal.ads.zzfgz r3 = com.google.android.gms.internal.ads.zzfgz.zzi()
        L84:
            if (r1 == 0) goto L94
            com.google.android.gms.internal.ads.zzki r4 = r1.zzf
            long r9 = r4.zzc
            int r11 = (r9 > r5 ? 1 : (r9 == r5 ? 0 : -1))
            if (r11 == 0) goto L94
            com.google.android.gms.internal.ads.zzki r4 = r4.zzb(r5)
            r1.zzf = r4
        L94:
            r13 = r3
            goto Lad
        L96:
            com.google.android.gms.internal.ads.zzks r3 = r0.zzr
            com.google.android.gms.internal.ads.zzaaj r3 = r3.zzb
            boolean r3 = r2.equals(r3)
            if (r3 != 0) goto Lac
            com.google.android.gms.internal.ads.zzach r1 = com.google.android.gms.internal.ads.zzach.zza
            com.google.android.gms.internal.ads.zzadq r3 = r0.zzd
            com.google.android.gms.internal.ads.zzfgz r4 = com.google.android.gms.internal.ads.zzfgz.zzi()
            r11 = r1
            r12 = r3
            r13 = r4
            goto Laf
        Lac:
            r13 = r1
        Lad:
            r11 = r7
            r12 = r8
        Laf:
            if (r24 == 0) goto Lb8
            com.google.android.gms.internal.ads.zzji r1 = r0.zzs
            r3 = r25
            r1.zzc(r3)
        Lb8:
            com.google.android.gms.internal.ads.zzks r1 = r0.zzr
            long r9 = r16.zzY()
            r2 = r17
            r3 = r18
            r5 = r20
            r7 = r22
            com.google.android.gms.internal.ads.zzks r1 = r1.zzc(r2, r3, r5, r7, r9, r11, r12, r13)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzjl.zzU(com.google.android.gms.internal.ads.zzaaj, long, long, long, boolean, int):com.google.android.gms.internal.ads.zzks");
    }

    private final void zzV() throws zzid {
        zzW(new boolean[2]);
    }

    private final void zzW(boolean[] zArr) throws zzid {
        zzkh zzi = this.zzo.zzi();
        zzadq zzq = zzi.zzq();
        for (int i = 0; i < 2; i++) {
            if (!zzq.zza(i)) {
                this.zza[i].zzr();
            }
        }
        for (int i2 = 0; i2 < 2; i2++) {
            if (zzq.zza(i2)) {
                boolean z = zArr[i2];
                zzlg zzlgVar = this.zza[i2];
                if (!zzae(zzlgVar)) {
                    zzkh zzi2 = this.zzo.zzi();
                    boolean z2 = zzi2 == this.zzo.zzh();
                    zzadq zzq2 = zzi2.zzq();
                    zzli zzliVar = zzq2.zzb[i2];
                    zzjq[] zzai = zzai(zzq2.zzd[i2]);
                    boolean z3 = zzab() && this.zzr.zze == 3;
                    boolean z4 = !z && z3;
                    this.zzD++;
                    zzlgVar.zzf(zzliVar, zzai, zzi2.zzc[i2], this.zzF, z4, z2, zzi2.zzc(), zzi2.zza());
                    zzlgVar.zzt(103, new zzje(this));
                    this.zzk.zzd(zzlgVar);
                    if (z3) {
                        zzlgVar.zzbf();
                    }
                }
            }
        }
        zzi.zzg = true;
    }

    private final void zzX(boolean z) {
        long zze;
        zzkh zzg = this.zzo.zzg();
        zzaaj zzaajVar = zzg == null ? this.zzr.zzb : zzg.zzf.zza;
        boolean z2 = !this.zzr.zzk.equals(zzaajVar);
        if (z2) {
            this.zzr = this.zzr.zzg(zzaajVar);
        }
        zzks zzksVar = this.zzr;
        if (zzg == null) {
            zze = zzksVar.zzs;
        } else {
            zze = zzg.zze();
        }
        zzksVar.zzq = zze;
        this.zzr.zzr = zzY();
        if ((z2 || z) && zzg != null && zzg.zzd) {
            zzaa(zzg.zzp(), zzg.zzq());
        }
    }

    private final long zzY() {
        return zzZ(this.zzr.zzq);
    }

    private final long zzZ(long j) {
        zzkh zzg = this.zzo.zzg();
        if (zzg == null) {
            return 0L;
        }
        return Math.max(0L, j - (this.zzF - zzg.zza()));
    }

    private final void zzaa(zzach zzachVar, zzadq zzadqVar) {
        this.zzJ.zzl(this.zza, zzachVar, zzadqVar.zzd);
    }

    private final boolean zzab() {
        zzks zzksVar = this.zzr;
        return zzksVar.zzl && zzksVar.zzm == 0;
    }

    private static boolean zzac(zzks zzksVar, zzln zzlnVar) {
        zzaaj zzaajVar = zzksVar.zzb;
        zzlq zzlqVar = zzksVar.zza;
        return zzaajVar.zzb() || zzlqVar.zzt() || zzlqVar.zzf(zzaajVar.zza, zzlnVar).zzf;
    }

    private static Pair<Object, Long> zzad(zzlq zzlqVar, zzjk zzjkVar, boolean z, int i, boolean z2, zzlp zzlpVar, zzln zzlnVar) {
        Pair<Object, Long> zzv;
        zzlq zzlqVar2 = zzjkVar.zza;
        if (zzlqVar.zzt()) {
            return null;
        }
        zzlq zzlqVar3 = true == zzlqVar2.zzt() ? zzlqVar : zzlqVar2;
        try {
            zzv = zzlqVar3.zzv(zzlpVar, zzlnVar, zzjkVar.zzb, zzjkVar.zzc);
        } catch (IndexOutOfBoundsException unused) {
        }
        if (zzlqVar.equals(zzlqVar3)) {
            return zzv;
        }
        if (zzlqVar.zzh(zzv.first) != -1) {
            return (zzlqVar3.zzf(zzv.first, zzlnVar).zzf && zzlqVar3.zze(zzlnVar.zzc, zzlpVar, 0L).zzo == zzlqVar3.zzh(zzv.first)) ? zzlqVar.zzv(zzlpVar, zzlnVar, zzlqVar.zzf(zzv.first, zzlnVar).zzc, zzjkVar.zzc) : zzv;
        }
        Object zzl = zzl(zzlpVar, zzlnVar, i, z2, zzv.first, zzlqVar3, zzlqVar);
        if (zzl != null) {
            return zzlqVar.zzv(zzlpVar, zzlnVar, zzlqVar.zzf(zzl, zzlnVar).zzc, -9223372036854775807L);
        }
        return null;
    }

    private static boolean zzae(zzlg zzlgVar) {
        return zzlgVar.zze() != 0;
    }

    private static final void zzaf(zzld zzldVar) throws zzid {
        zzldVar.zzh();
        try {
            zzldVar.zza().zzt(zzldVar.zzc(), zzldVar.zze());
        } finally {
            zzldVar.zzi(true);
        }
    }

    private static final void zzag(zzlg zzlgVar) throws zzid {
        if (zzlgVar.zze() == 2) {
            zzlgVar.zzp();
        }
    }

    private static final void zzah(zzlg zzlgVar, long j) {
        zzlgVar.zzl();
        if (zzlgVar instanceof zzacn) {
            zzacn zzacnVar = (zzacn) zzlgVar;
            throw null;
        }
    }

    private static zzjq[] zzai(zzacs zzacsVar) {
        int zzc = zzacsVar != null ? zzacsVar.zzc() : 0;
        zzjq[] zzjqVarArr = new zzjq[zzc];
        for (int i = 0; i < zzc; i++) {
            zzjqVarArr[i] = zzacsVar.zzd(i);
        }
        return zzjqVarArr;
    }

    static Object zzl(zzlp zzlpVar, zzln zzlnVar, int i, boolean z, Object obj, zzlq zzlqVar, zzlq zzlqVar2) {
        int zzh = zzlqVar.zzh(obj);
        int zzs = zzlqVar.zzs();
        int i2 = 0;
        int i3 = zzh;
        int i4 = -1;
        while (true) {
            if (i2 >= zzs || i4 != -1) {
                break;
            }
            i3 = zzlqVar.zzu(i3, zzlnVar, zzlpVar, i, z);
            if (i3 == -1) {
                i4 = -1;
                break;
            }
            i4 = zzlqVar2.zzh(zzlqVar.zzi(i3));
            i2++;
        }
        if (i4 == -1) {
            return null;
        }
        return zzlqVar2.zzi(i4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ boolean zzo(zzjl zzjlVar, boolean z) {
        zzjlVar.zzB = true;
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final /* synthetic */ void zzr(zzld zzldVar) {
        try {
            zzaf(zzldVar);
        } catch (zzid e) {
            zzagm.zzb("ExoPlayerImplInternal", "Unexpected error delivering message on external thread.", e);
            throw new RuntimeException(e);
        }
    }

    private final synchronized void zzs(zzffb<Boolean> zzffbVar, long j) {
        long elapsedRealtime = SystemClock.elapsedRealtime() + 500;
        boolean z = false;
        for (long j2 = 500; !zzffbVar.zza().booleanValue() && j2 > 0; j2 = elapsedRealtime - SystemClock.elapsedRealtime()) {
            try {
                wait(j2);
            } catch (InterruptedException unused) {
                z = true;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
    }

    private final void zzt(int i) {
        zzks zzksVar = this.zzr;
        if (zzksVar.zze != i) {
            this.zzr = zzksVar.zze(i);
        }
    }

    private final void zzu() {
        boolean z;
        this.zzs.zzb(this.zzr);
        z = this.zzs.zzg;
        if (z) {
            this.zzn.zza(this.zzs);
            this.zzs = new zzji(this.zzr);
        }
    }

    private final void zzv(boolean z, int i, boolean z2, int i2) throws zzid {
        zzacs[] zzacsVarArr;
        this.zzs.zza(z2 ? 1 : 0);
        this.zzs.zzd(i2);
        this.zzr = this.zzr.zzh(z, i);
        this.zzw = false;
        for (zzkh zzh = this.zzo.zzh(); zzh != null; zzh = zzh.zzo()) {
            for (zzacs zzacsVar : zzh.zzq().zzd) {
            }
        }
        if (!zzab()) {
            zzy();
            zzz();
            return;
        }
        int i3 = this.zzr.zze;
        if (i3 == 3) {
            zzx();
            this.zzf.zzf(2);
        } else if (i3 == 2) {
            this.zzf.zzf(2);
        }
    }

    private final void zzw(boolean z) throws zzid {
        zzaaj zzaajVar = this.zzo.zzh().zzf.zza;
        long zzE = zzE(zzaajVar, this.zzr.zzs, true, false);
        if (zzE != this.zzr.zzs) {
            zzks zzksVar = this.zzr;
            this.zzr = zzU(zzaajVar, zzE, zzksVar.zzc, zzksVar.zzd, z, 5);
        }
    }

    private final void zzx() throws zzid {
        this.zzw = false;
        this.zzk.zza();
        zzlg[] zzlgVarArr = this.zza;
        for (int i = 0; i < 2; i++) {
            zzlg zzlgVar = zzlgVarArr[i];
            if (zzae(zzlgVar)) {
                zzlgVar.zzbf();
            }
        }
    }

    private final void zzy() throws zzid {
        this.zzk.zzb();
        zzlg[] zzlgVarArr = this.zza;
        for (int i = 0; i < 2; i++) {
            zzlg zzlgVar = zzlgVarArr[i];
            if (zzae(zzlgVar)) {
                zzag(zzlgVar);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00ac A[LOOP:0: B:30:0x009c->B:37:0x00ac, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x009b A[SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x009b -> B:30:0x009c). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void zzz() throws com.google.android.gms.internal.ads.zzid {
        /*
            Method dump skipped, instructions count: 326
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzjl.zzz():void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:456:0x08c4, code lost:
        if (r46.zzJ.zze(zzY(), r46.zzk.zzi().zzb, r46.zzw, r33) == false) goto L569;
     */
    /* JADX WARN: Code restructure failed: missing block: B:467:0x08e7, code lost:
        if (r7 == false) goto L576;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:409:0x0809 A[Catch: RuntimeException -> 0x0a59, IOException -> 0x0a7d, zzid -> 0x0aaa, TryCatch #9 {RuntimeException -> 0x0a59, blocks: (B:8:0x0017, B:540:0x0a55, B:9:0x001c, B:13:0x0023, B:15:0x0027, B:20:0x0034, B:21:0x003b, B:22:0x0043, B:26:0x004a, B:28:0x0053, B:30:0x0061, B:31:0x0069, B:32:0x0074, B:33:0x0088, B:34:0x00a0, B:35:0x00bc, B:37:0x00cb, B:38:0x00cf, B:39:0x00e0, B:41:0x00ef, B:42:0x010b, B:43:0x011e, B:44:0x0127, B:46:0x0139, B:47:0x0145, B:48:0x0155, B:50:0x0161, B:53:0x016c, B:54:0x0173, B:55:0x0180, B:59:0x0187, B:61:0x018f, B:63:0x0193, B:65:0x0198, B:67:0x01a0, B:68:0x01a3, B:70:0x01a8, B:77:0x01b5, B:78:0x01b6, B:82:0x01bd, B:84:0x01cb, B:85:0x01ce, B:86:0x01d3, B:88:0x01e3, B:89:0x01e6, B:90:0x01eb, B:92:0x0202, B:94:0x0206, B:96:0x0214, B:100:0x021e, B:102:0x0223, B:104:0x0229, B:108:0x0231, B:110:0x0239, B:112:0x025a, B:116:0x0265, B:118:0x0286, B:119:0x0289, B:121:0x028e, B:123:0x029e, B:125:0x02a4, B:126:0x02a8, B:128:0x02ac, B:129:0x02b1, B:130:0x02b4, B:137:0x02d6, B:139:0x02e0, B:131:0x02b8, B:133:0x02c2, B:140:0x02ed, B:142:0x02f9, B:143:0x0305, B:145:0x0311, B:147:0x0339, B:148:0x0359, B:152:0x0363, B:153:0x0370, B:160:0x037b, B:166:0x0386, B:167:0x038e, B:168:0x03a3, B:170:0x03c3, B:234:0x04e3, B:219:0x04ae, B:218:0x04aa, B:243:0x04f8, B:244:0x0509, B:171:0x03e7, B:175:0x03fb, B:177:0x040b, B:179:0x0422, B:181:0x042c, B:245:0x050a, B:247:0x0519, B:250:0x0523, B:252:0x0532, B:254:0x053e, B:256:0x056d, B:259:0x0578, B:261:0x057c, B:263:0x0589, B:327:0x068d, B:329:0x0695, B:331:0x069d, B:334:0x06a2, B:336:0x06b0, B:338:0x06ba, B:342:0x06cb, B:344:0x06d1, B:345:0x06eb, B:347:0x06f1, B:349:0x06f6, B:351:0x06fb, B:353:0x06ff, B:355:0x0705, B:357:0x0709, B:359:0x0711, B:361:0x0717, B:363:0x0721, B:366:0x0727, B:367:0x072a, B:266:0x0593, B:268:0x0599, B:271:0x059f, B:275:0x05ac, B:278:0x05bc, B:280:0x05c2, B:281:0x05c5, B:283:0x05cd, B:285:0x05db, B:287:0x05ed, B:289:0x05f7, B:291:0x0600, B:293:0x0608, B:294:0x060b, B:297:0x0611, B:299:0x061b, B:301:0x0625, B:303:0x0636, B:305:0x063c, B:306:0x0647, B:307:0x064a, B:309:0x0650, B:313:0x0657, B:315:0x0661, B:317:0x0667, B:319:0x066d, B:323:0x067b, B:325:0x0687, B:326:0x068a, B:262:0x0586, B:368:0x077a, B:373:0x0788, B:375:0x0792, B:376:0x0799, B:378:0x07a9, B:380:0x07be, B:411:0x080d, B:383:0x07c9, B:385:0x07d0, B:389:0x07d9, B:391:0x07e3, B:397:0x07f0, B:399:0x07f6, B:409:0x0809, B:413:0x0819, B:415:0x081f, B:419:0x0827, B:421:0x082f, B:423:0x0833, B:424:0x083e, B:426:0x0844, B:478:0x091a, B:482:0x0923, B:484:0x092d, B:486:0x093b, B:487:0x0942, B:488:0x0945, B:490:0x094b, B:492:0x0954, B:495:0x095b, B:496:0x0962, B:497:0x0963, B:499:0x096b, B:500:0x0971, B:502:0x0977, B:506:0x0983, B:508:0x0987, B:512:0x0997, B:520:0x09ad, B:522:0x09b3, B:525:0x0a0f, B:511:0x098f, B:504:0x097d, B:513:0x099a, B:517:0x09a1, B:518:0x09a7, B:427:0x084d, B:429:0x0853, B:431:0x0857, B:457:0x08c6, B:459:0x08d2, B:436:0x0862, B:438:0x0866, B:440:0x0878, B:441:0x087e, B:443:0x088c, B:447:0x0895, B:449:0x089f, B:455:0x08aa, B:460:0x08d6, B:462:0x08dc, B:464:0x08e0, B:468:0x08e9, B:470:0x08f6, B:472:0x08fe, B:474:0x0908, B:475:0x090d, B:476:0x0912, B:477:0x0917, B:412:0x0812, B:526:0x0a13, B:527:0x0a19, B:531:0x0a20, B:532:0x0a27, B:535:0x0a33, B:539:0x0a46), top: B:576:0x0012 }] */
    /* JADX WARN: Removed duplicated region for block: B:459:0x08d2 A[Catch: RuntimeException -> 0x0a59, IOException -> 0x0a7d, zzid -> 0x0aaa, TryCatch #9 {RuntimeException -> 0x0a59, blocks: (B:8:0x0017, B:540:0x0a55, B:9:0x001c, B:13:0x0023, B:15:0x0027, B:20:0x0034, B:21:0x003b, B:22:0x0043, B:26:0x004a, B:28:0x0053, B:30:0x0061, B:31:0x0069, B:32:0x0074, B:33:0x0088, B:34:0x00a0, B:35:0x00bc, B:37:0x00cb, B:38:0x00cf, B:39:0x00e0, B:41:0x00ef, B:42:0x010b, B:43:0x011e, B:44:0x0127, B:46:0x0139, B:47:0x0145, B:48:0x0155, B:50:0x0161, B:53:0x016c, B:54:0x0173, B:55:0x0180, B:59:0x0187, B:61:0x018f, B:63:0x0193, B:65:0x0198, B:67:0x01a0, B:68:0x01a3, B:70:0x01a8, B:77:0x01b5, B:78:0x01b6, B:82:0x01bd, B:84:0x01cb, B:85:0x01ce, B:86:0x01d3, B:88:0x01e3, B:89:0x01e6, B:90:0x01eb, B:92:0x0202, B:94:0x0206, B:96:0x0214, B:100:0x021e, B:102:0x0223, B:104:0x0229, B:108:0x0231, B:110:0x0239, B:112:0x025a, B:116:0x0265, B:118:0x0286, B:119:0x0289, B:121:0x028e, B:123:0x029e, B:125:0x02a4, B:126:0x02a8, B:128:0x02ac, B:129:0x02b1, B:130:0x02b4, B:137:0x02d6, B:139:0x02e0, B:131:0x02b8, B:133:0x02c2, B:140:0x02ed, B:142:0x02f9, B:143:0x0305, B:145:0x0311, B:147:0x0339, B:148:0x0359, B:152:0x0363, B:153:0x0370, B:160:0x037b, B:166:0x0386, B:167:0x038e, B:168:0x03a3, B:170:0x03c3, B:234:0x04e3, B:219:0x04ae, B:218:0x04aa, B:243:0x04f8, B:244:0x0509, B:171:0x03e7, B:175:0x03fb, B:177:0x040b, B:179:0x0422, B:181:0x042c, B:245:0x050a, B:247:0x0519, B:250:0x0523, B:252:0x0532, B:254:0x053e, B:256:0x056d, B:259:0x0578, B:261:0x057c, B:263:0x0589, B:327:0x068d, B:329:0x0695, B:331:0x069d, B:334:0x06a2, B:336:0x06b0, B:338:0x06ba, B:342:0x06cb, B:344:0x06d1, B:345:0x06eb, B:347:0x06f1, B:349:0x06f6, B:351:0x06fb, B:353:0x06ff, B:355:0x0705, B:357:0x0709, B:359:0x0711, B:361:0x0717, B:363:0x0721, B:366:0x0727, B:367:0x072a, B:266:0x0593, B:268:0x0599, B:271:0x059f, B:275:0x05ac, B:278:0x05bc, B:280:0x05c2, B:281:0x05c5, B:283:0x05cd, B:285:0x05db, B:287:0x05ed, B:289:0x05f7, B:291:0x0600, B:293:0x0608, B:294:0x060b, B:297:0x0611, B:299:0x061b, B:301:0x0625, B:303:0x0636, B:305:0x063c, B:306:0x0647, B:307:0x064a, B:309:0x0650, B:313:0x0657, B:315:0x0661, B:317:0x0667, B:319:0x066d, B:323:0x067b, B:325:0x0687, B:326:0x068a, B:262:0x0586, B:368:0x077a, B:373:0x0788, B:375:0x0792, B:376:0x0799, B:378:0x07a9, B:380:0x07be, B:411:0x080d, B:383:0x07c9, B:385:0x07d0, B:389:0x07d9, B:391:0x07e3, B:397:0x07f0, B:399:0x07f6, B:409:0x0809, B:413:0x0819, B:415:0x081f, B:419:0x0827, B:421:0x082f, B:423:0x0833, B:424:0x083e, B:426:0x0844, B:478:0x091a, B:482:0x0923, B:484:0x092d, B:486:0x093b, B:487:0x0942, B:488:0x0945, B:490:0x094b, B:492:0x0954, B:495:0x095b, B:496:0x0962, B:497:0x0963, B:499:0x096b, B:500:0x0971, B:502:0x0977, B:506:0x0983, B:508:0x0987, B:512:0x0997, B:520:0x09ad, B:522:0x09b3, B:525:0x0a0f, B:511:0x098f, B:504:0x097d, B:513:0x099a, B:517:0x09a1, B:518:0x09a7, B:427:0x084d, B:429:0x0853, B:431:0x0857, B:457:0x08c6, B:459:0x08d2, B:436:0x0862, B:438:0x0866, B:440:0x0878, B:441:0x087e, B:443:0x088c, B:447:0x0895, B:449:0x089f, B:455:0x08aa, B:460:0x08d6, B:462:0x08dc, B:464:0x08e0, B:468:0x08e9, B:470:0x08f6, B:472:0x08fe, B:474:0x0908, B:475:0x090d, B:476:0x0912, B:477:0x0917, B:412:0x0812, B:526:0x0a13, B:527:0x0a19, B:531:0x0a20, B:532:0x0a27, B:535:0x0a33, B:539:0x0a46), top: B:576:0x0012 }] */
    /* JADX WARN: Removed duplicated region for block: B:480:0x0920  */
    /* JADX WARN: Removed duplicated region for block: B:499:0x096b A[Catch: RuntimeException -> 0x0a59, IOException -> 0x0a7d, zzid -> 0x0aaa, TryCatch #9 {RuntimeException -> 0x0a59, blocks: (B:8:0x0017, B:540:0x0a55, B:9:0x001c, B:13:0x0023, B:15:0x0027, B:20:0x0034, B:21:0x003b, B:22:0x0043, B:26:0x004a, B:28:0x0053, B:30:0x0061, B:31:0x0069, B:32:0x0074, B:33:0x0088, B:34:0x00a0, B:35:0x00bc, B:37:0x00cb, B:38:0x00cf, B:39:0x00e0, B:41:0x00ef, B:42:0x010b, B:43:0x011e, B:44:0x0127, B:46:0x0139, B:47:0x0145, B:48:0x0155, B:50:0x0161, B:53:0x016c, B:54:0x0173, B:55:0x0180, B:59:0x0187, B:61:0x018f, B:63:0x0193, B:65:0x0198, B:67:0x01a0, B:68:0x01a3, B:70:0x01a8, B:77:0x01b5, B:78:0x01b6, B:82:0x01bd, B:84:0x01cb, B:85:0x01ce, B:86:0x01d3, B:88:0x01e3, B:89:0x01e6, B:90:0x01eb, B:92:0x0202, B:94:0x0206, B:96:0x0214, B:100:0x021e, B:102:0x0223, B:104:0x0229, B:108:0x0231, B:110:0x0239, B:112:0x025a, B:116:0x0265, B:118:0x0286, B:119:0x0289, B:121:0x028e, B:123:0x029e, B:125:0x02a4, B:126:0x02a8, B:128:0x02ac, B:129:0x02b1, B:130:0x02b4, B:137:0x02d6, B:139:0x02e0, B:131:0x02b8, B:133:0x02c2, B:140:0x02ed, B:142:0x02f9, B:143:0x0305, B:145:0x0311, B:147:0x0339, B:148:0x0359, B:152:0x0363, B:153:0x0370, B:160:0x037b, B:166:0x0386, B:167:0x038e, B:168:0x03a3, B:170:0x03c3, B:234:0x04e3, B:219:0x04ae, B:218:0x04aa, B:243:0x04f8, B:244:0x0509, B:171:0x03e7, B:175:0x03fb, B:177:0x040b, B:179:0x0422, B:181:0x042c, B:245:0x050a, B:247:0x0519, B:250:0x0523, B:252:0x0532, B:254:0x053e, B:256:0x056d, B:259:0x0578, B:261:0x057c, B:263:0x0589, B:327:0x068d, B:329:0x0695, B:331:0x069d, B:334:0x06a2, B:336:0x06b0, B:338:0x06ba, B:342:0x06cb, B:344:0x06d1, B:345:0x06eb, B:347:0x06f1, B:349:0x06f6, B:351:0x06fb, B:353:0x06ff, B:355:0x0705, B:357:0x0709, B:359:0x0711, B:361:0x0717, B:363:0x0721, B:366:0x0727, B:367:0x072a, B:266:0x0593, B:268:0x0599, B:271:0x059f, B:275:0x05ac, B:278:0x05bc, B:280:0x05c2, B:281:0x05c5, B:283:0x05cd, B:285:0x05db, B:287:0x05ed, B:289:0x05f7, B:291:0x0600, B:293:0x0608, B:294:0x060b, B:297:0x0611, B:299:0x061b, B:301:0x0625, B:303:0x0636, B:305:0x063c, B:306:0x0647, B:307:0x064a, B:309:0x0650, B:313:0x0657, B:315:0x0661, B:317:0x0667, B:319:0x066d, B:323:0x067b, B:325:0x0687, B:326:0x068a, B:262:0x0586, B:368:0x077a, B:373:0x0788, B:375:0x0792, B:376:0x0799, B:378:0x07a9, B:380:0x07be, B:411:0x080d, B:383:0x07c9, B:385:0x07d0, B:389:0x07d9, B:391:0x07e3, B:397:0x07f0, B:399:0x07f6, B:409:0x0809, B:413:0x0819, B:415:0x081f, B:419:0x0827, B:421:0x082f, B:423:0x0833, B:424:0x083e, B:426:0x0844, B:478:0x091a, B:482:0x0923, B:484:0x092d, B:486:0x093b, B:487:0x0942, B:488:0x0945, B:490:0x094b, B:492:0x0954, B:495:0x095b, B:496:0x0962, B:497:0x0963, B:499:0x096b, B:500:0x0971, B:502:0x0977, B:506:0x0983, B:508:0x0987, B:512:0x0997, B:520:0x09ad, B:522:0x09b3, B:525:0x0a0f, B:511:0x098f, B:504:0x097d, B:513:0x099a, B:517:0x09a1, B:518:0x09a7, B:427:0x084d, B:429:0x0853, B:431:0x0857, B:457:0x08c6, B:459:0x08d2, B:436:0x0862, B:438:0x0866, B:440:0x0878, B:441:0x087e, B:443:0x088c, B:447:0x0895, B:449:0x089f, B:455:0x08aa, B:460:0x08d6, B:462:0x08dc, B:464:0x08e0, B:468:0x08e9, B:470:0x08f6, B:472:0x08fe, B:474:0x0908, B:475:0x090d, B:476:0x0912, B:477:0x0917, B:412:0x0812, B:526:0x0a13, B:527:0x0a19, B:531:0x0a20, B:532:0x0a27, B:535:0x0a33, B:539:0x0a46), top: B:576:0x0012 }] */
    /* JADX WARN: Removed duplicated region for block: B:502:0x0977 A[Catch: RuntimeException -> 0x0a59, IOException -> 0x0a7d, zzid -> 0x0aaa, TryCatch #9 {RuntimeException -> 0x0a59, blocks: (B:8:0x0017, B:540:0x0a55, B:9:0x001c, B:13:0x0023, B:15:0x0027, B:20:0x0034, B:21:0x003b, B:22:0x0043, B:26:0x004a, B:28:0x0053, B:30:0x0061, B:31:0x0069, B:32:0x0074, B:33:0x0088, B:34:0x00a0, B:35:0x00bc, B:37:0x00cb, B:38:0x00cf, B:39:0x00e0, B:41:0x00ef, B:42:0x010b, B:43:0x011e, B:44:0x0127, B:46:0x0139, B:47:0x0145, B:48:0x0155, B:50:0x0161, B:53:0x016c, B:54:0x0173, B:55:0x0180, B:59:0x0187, B:61:0x018f, B:63:0x0193, B:65:0x0198, B:67:0x01a0, B:68:0x01a3, B:70:0x01a8, B:77:0x01b5, B:78:0x01b6, B:82:0x01bd, B:84:0x01cb, B:85:0x01ce, B:86:0x01d3, B:88:0x01e3, B:89:0x01e6, B:90:0x01eb, B:92:0x0202, B:94:0x0206, B:96:0x0214, B:100:0x021e, B:102:0x0223, B:104:0x0229, B:108:0x0231, B:110:0x0239, B:112:0x025a, B:116:0x0265, B:118:0x0286, B:119:0x0289, B:121:0x028e, B:123:0x029e, B:125:0x02a4, B:126:0x02a8, B:128:0x02ac, B:129:0x02b1, B:130:0x02b4, B:137:0x02d6, B:139:0x02e0, B:131:0x02b8, B:133:0x02c2, B:140:0x02ed, B:142:0x02f9, B:143:0x0305, B:145:0x0311, B:147:0x0339, B:148:0x0359, B:152:0x0363, B:153:0x0370, B:160:0x037b, B:166:0x0386, B:167:0x038e, B:168:0x03a3, B:170:0x03c3, B:234:0x04e3, B:219:0x04ae, B:218:0x04aa, B:243:0x04f8, B:244:0x0509, B:171:0x03e7, B:175:0x03fb, B:177:0x040b, B:179:0x0422, B:181:0x042c, B:245:0x050a, B:247:0x0519, B:250:0x0523, B:252:0x0532, B:254:0x053e, B:256:0x056d, B:259:0x0578, B:261:0x057c, B:263:0x0589, B:327:0x068d, B:329:0x0695, B:331:0x069d, B:334:0x06a2, B:336:0x06b0, B:338:0x06ba, B:342:0x06cb, B:344:0x06d1, B:345:0x06eb, B:347:0x06f1, B:349:0x06f6, B:351:0x06fb, B:353:0x06ff, B:355:0x0705, B:357:0x0709, B:359:0x0711, B:361:0x0717, B:363:0x0721, B:366:0x0727, B:367:0x072a, B:266:0x0593, B:268:0x0599, B:271:0x059f, B:275:0x05ac, B:278:0x05bc, B:280:0x05c2, B:281:0x05c5, B:283:0x05cd, B:285:0x05db, B:287:0x05ed, B:289:0x05f7, B:291:0x0600, B:293:0x0608, B:294:0x060b, B:297:0x0611, B:299:0x061b, B:301:0x0625, B:303:0x0636, B:305:0x063c, B:306:0x0647, B:307:0x064a, B:309:0x0650, B:313:0x0657, B:315:0x0661, B:317:0x0667, B:319:0x066d, B:323:0x067b, B:325:0x0687, B:326:0x068a, B:262:0x0586, B:368:0x077a, B:373:0x0788, B:375:0x0792, B:376:0x0799, B:378:0x07a9, B:380:0x07be, B:411:0x080d, B:383:0x07c9, B:385:0x07d0, B:389:0x07d9, B:391:0x07e3, B:397:0x07f0, B:399:0x07f6, B:409:0x0809, B:413:0x0819, B:415:0x081f, B:419:0x0827, B:421:0x082f, B:423:0x0833, B:424:0x083e, B:426:0x0844, B:478:0x091a, B:482:0x0923, B:484:0x092d, B:486:0x093b, B:487:0x0942, B:488:0x0945, B:490:0x094b, B:492:0x0954, B:495:0x095b, B:496:0x0962, B:497:0x0963, B:499:0x096b, B:500:0x0971, B:502:0x0977, B:506:0x0983, B:508:0x0987, B:512:0x0997, B:520:0x09ad, B:522:0x09b3, B:525:0x0a0f, B:511:0x098f, B:504:0x097d, B:513:0x099a, B:517:0x09a1, B:518:0x09a7, B:427:0x084d, B:429:0x0853, B:431:0x0857, B:457:0x08c6, B:459:0x08d2, B:436:0x0862, B:438:0x0866, B:440:0x0878, B:441:0x087e, B:443:0x088c, B:447:0x0895, B:449:0x089f, B:455:0x08aa, B:460:0x08d6, B:462:0x08dc, B:464:0x08e0, B:468:0x08e9, B:470:0x08f6, B:472:0x08fe, B:474:0x0908, B:475:0x090d, B:476:0x0912, B:477:0x0917, B:412:0x0812, B:526:0x0a13, B:527:0x0a19, B:531:0x0a20, B:532:0x0a27, B:535:0x0a33, B:539:0x0a46), top: B:576:0x0012 }] */
    /* JADX WARN: Removed duplicated region for block: B:515:0x099e  */
    /* JADX WARN: Removed duplicated region for block: B:522:0x09b3 A[Catch: RuntimeException -> 0x0a59, IOException -> 0x0a7d, zzid -> 0x0aaa, TRY_LEAVE, TryCatch #9 {RuntimeException -> 0x0a59, blocks: (B:8:0x0017, B:540:0x0a55, B:9:0x001c, B:13:0x0023, B:15:0x0027, B:20:0x0034, B:21:0x003b, B:22:0x0043, B:26:0x004a, B:28:0x0053, B:30:0x0061, B:31:0x0069, B:32:0x0074, B:33:0x0088, B:34:0x00a0, B:35:0x00bc, B:37:0x00cb, B:38:0x00cf, B:39:0x00e0, B:41:0x00ef, B:42:0x010b, B:43:0x011e, B:44:0x0127, B:46:0x0139, B:47:0x0145, B:48:0x0155, B:50:0x0161, B:53:0x016c, B:54:0x0173, B:55:0x0180, B:59:0x0187, B:61:0x018f, B:63:0x0193, B:65:0x0198, B:67:0x01a0, B:68:0x01a3, B:70:0x01a8, B:77:0x01b5, B:78:0x01b6, B:82:0x01bd, B:84:0x01cb, B:85:0x01ce, B:86:0x01d3, B:88:0x01e3, B:89:0x01e6, B:90:0x01eb, B:92:0x0202, B:94:0x0206, B:96:0x0214, B:100:0x021e, B:102:0x0223, B:104:0x0229, B:108:0x0231, B:110:0x0239, B:112:0x025a, B:116:0x0265, B:118:0x0286, B:119:0x0289, B:121:0x028e, B:123:0x029e, B:125:0x02a4, B:126:0x02a8, B:128:0x02ac, B:129:0x02b1, B:130:0x02b4, B:137:0x02d6, B:139:0x02e0, B:131:0x02b8, B:133:0x02c2, B:140:0x02ed, B:142:0x02f9, B:143:0x0305, B:145:0x0311, B:147:0x0339, B:148:0x0359, B:152:0x0363, B:153:0x0370, B:160:0x037b, B:166:0x0386, B:167:0x038e, B:168:0x03a3, B:170:0x03c3, B:234:0x04e3, B:219:0x04ae, B:218:0x04aa, B:243:0x04f8, B:244:0x0509, B:171:0x03e7, B:175:0x03fb, B:177:0x040b, B:179:0x0422, B:181:0x042c, B:245:0x050a, B:247:0x0519, B:250:0x0523, B:252:0x0532, B:254:0x053e, B:256:0x056d, B:259:0x0578, B:261:0x057c, B:263:0x0589, B:327:0x068d, B:329:0x0695, B:331:0x069d, B:334:0x06a2, B:336:0x06b0, B:338:0x06ba, B:342:0x06cb, B:344:0x06d1, B:345:0x06eb, B:347:0x06f1, B:349:0x06f6, B:351:0x06fb, B:353:0x06ff, B:355:0x0705, B:357:0x0709, B:359:0x0711, B:361:0x0717, B:363:0x0721, B:366:0x0727, B:367:0x072a, B:266:0x0593, B:268:0x0599, B:271:0x059f, B:275:0x05ac, B:278:0x05bc, B:280:0x05c2, B:281:0x05c5, B:283:0x05cd, B:285:0x05db, B:287:0x05ed, B:289:0x05f7, B:291:0x0600, B:293:0x0608, B:294:0x060b, B:297:0x0611, B:299:0x061b, B:301:0x0625, B:303:0x0636, B:305:0x063c, B:306:0x0647, B:307:0x064a, B:309:0x0650, B:313:0x0657, B:315:0x0661, B:317:0x0667, B:319:0x066d, B:323:0x067b, B:325:0x0687, B:326:0x068a, B:262:0x0586, B:368:0x077a, B:373:0x0788, B:375:0x0792, B:376:0x0799, B:378:0x07a9, B:380:0x07be, B:411:0x080d, B:383:0x07c9, B:385:0x07d0, B:389:0x07d9, B:391:0x07e3, B:397:0x07f0, B:399:0x07f6, B:409:0x0809, B:413:0x0819, B:415:0x081f, B:419:0x0827, B:421:0x082f, B:423:0x0833, B:424:0x083e, B:426:0x0844, B:478:0x091a, B:482:0x0923, B:484:0x092d, B:486:0x093b, B:487:0x0942, B:488:0x0945, B:490:0x094b, B:492:0x0954, B:495:0x095b, B:496:0x0962, B:497:0x0963, B:499:0x096b, B:500:0x0971, B:502:0x0977, B:506:0x0983, B:508:0x0987, B:512:0x0997, B:520:0x09ad, B:522:0x09b3, B:525:0x0a0f, B:511:0x098f, B:504:0x097d, B:513:0x099a, B:517:0x09a1, B:518:0x09a7, B:427:0x084d, B:429:0x0853, B:431:0x0857, B:457:0x08c6, B:459:0x08d2, B:436:0x0862, B:438:0x0866, B:440:0x0878, B:441:0x087e, B:443:0x088c, B:447:0x0895, B:449:0x089f, B:455:0x08aa, B:460:0x08d6, B:462:0x08dc, B:464:0x08e0, B:468:0x08e9, B:470:0x08f6, B:472:0x08fe, B:474:0x0908, B:475:0x090d, B:476:0x0912, B:477:0x0917, B:412:0x0812, B:526:0x0a13, B:527:0x0a19, B:531:0x0a20, B:532:0x0a27, B:535:0x0a33, B:539:0x0a46), top: B:576:0x0012 }] */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r2v26, types: [com.google.android.gms.internal.ads.zzadx, com.google.android.gms.internal.ads.zzafp] */
    @Override // android.os.Handler.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean handleMessage(android.os.Message r47) {
        /*
            Method dump skipped, instructions count: 2872
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzjl.handleMessage(android.os.Message):boolean");
    }

    @Override // com.google.android.gms.internal.ads.zzia
    public final void zza(zzku zzkuVar) {
        this.zzf.zzc(16, zzkuVar).zza();
    }

    public final void zzb() {
        this.zzf.zzb(0).zza();
    }

    public final void zzc(boolean z, int i) {
        this.zzf.zzd(1, z ? 1 : 0, 0).zza();
    }

    public final void zzd(zzlq zzlqVar, int i, long j) {
        this.zzf.zzc(3, new zzjk(zzlqVar, i, j)).zza();
    }

    public final void zze() {
        this.zzf.zzb(6).zza();
    }

    @Override // com.google.android.gms.internal.ads.zzlb
    public final synchronized void zzf(zzld zzldVar) {
        if (!this.zzt && this.zzg.isAlive()) {
            this.zzf.zzc(14, zzldVar).zza();
            return;
        }
        Log.w("ExoPlayerImplInternal", "Ignoring messages sent after release.");
        zzldVar.zzi(false);
    }

    public final synchronized boolean zzg() {
        if (!this.zzt && this.zzg.isAlive()) {
            this.zzf.zzf(7);
            zzs(new zzffb(this) { // from class: com.google.android.gms.internal.ads.zzjc
                private final zzjl zza;

                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    this.zza = this;
                }

                @Override // com.google.android.gms.internal.ads.zzffb
                public final Object zza() {
                    return this.zza.zzn();
                }
            }, 500L);
            return this.zzt;
        }
        return true;
    }

    public final Looper zzh() {
        return this.zzh;
    }

    @Override // com.google.android.gms.internal.ads.zzkp
    public final void zzi() {
        this.zzf.zzf(22);
    }

    @Override // com.google.android.gms.internal.ads.zzaag
    public final void zzj(zzaah zzaahVar) {
        this.zzf.zzc(8, zzaahVar).zza();
    }

    @Override // com.google.android.gms.internal.ads.zzado
    public final void zzk() {
        this.zzf.zzf(10);
    }

    @Override // com.google.android.gms.internal.ads.zzaby
    public final /* bridge */ /* synthetic */ void zzm(zzaah zzaahVar) {
        this.zzf.zzc(9, zzaahVar).zza();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ Boolean zzn() {
        return Boolean.valueOf(this.zzt);
    }

    public final void zzq(List<zzko> list, int i, long j, zzaca zzacaVar) {
        this.zzf.zzc(17, new zzjf(list, zzacaVar, i, j, null, null)).zza();
    }
}
