package com.google.android.gms.internal.ads;

import android.media.AudioTrack;
import android.os.ConditionVariable;
import android.util.Log;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zznq implements zzmz {
    private float zzA;
    private zzmh[] zzB;
    private ByteBuffer[] zzC;
    private ByteBuffer zzD;
    private ByteBuffer zzE;
    private byte[] zzF;
    private int zzG;
    private int zzH;
    private boolean zzI;
    private boolean zzJ;
    private boolean zzK;
    private boolean zzL;
    private int zzM;
    private zzne zzN;
    private boolean zzO;
    private long zzP;
    private boolean zzQ;
    private boolean zzR;
    private final zznj zzS;
    private final zzng zza;
    private final zzod zzb;
    private final zzmh[] zzc;
    private final zzmh[] zzd;
    private final ConditionVariable zze;
    private final zznd zzf;
    private final ArrayDeque<zznk> zzg;
    private zznp zzh;
    private final zznl<zzmv> zzi;
    private final zznl<zzmy> zzj;
    private zzmw zzk;
    private zzni zzl;
    private zzni zzm;
    private AudioTrack zzn;
    private zzmd zzo;
    private zznk zzp;
    private zznk zzq;
    private final zzku zzr;
    private ByteBuffer zzs;
    private int zzt;
    private long zzu;
    private long zzv;
    private long zzw;
    private boolean zzx;
    private boolean zzy;
    private long zzz;

    public zznq(zzme zzmeVar, zzmh[] zzmhVarArr, boolean z) {
        zznj zznjVar = new zznj(zzmhVarArr);
        this.zzS = zznjVar;
        int i = zzaht.zza;
        this.zze = new ConditionVariable(true);
        this.zzf = new zznd(new zznm(this, null));
        zzng zzngVar = new zzng();
        this.zza = zzngVar;
        zzod zzodVar = new zzod();
        this.zzb = zzodVar;
        ArrayList arrayList = new ArrayList();
        Collections.addAll(arrayList, new zznz(), zzngVar, zzodVar);
        Collections.addAll(arrayList, zznjVar.zza());
        this.zzc = (zzmh[]) arrayList.toArray(new zzmh[0]);
        this.zzd = new zzmh[]{new zzns()};
        this.zzA = 1.0f;
        this.zzo = zzmd.zza;
        this.zzM = 0;
        this.zzN = new zzne(0, 0.0f);
        this.zzq = new zznk(zzku.zza, false, 0L, 0L, null);
        this.zzr = zzku.zza;
        this.zzH = -1;
        this.zzB = new zzmh[0];
        this.zzC = new ByteBuffer[0];
        this.zzg = new ArrayDeque<>();
        this.zzi = new zznl<>(100L);
        this.zzj = new zznl<>(100L);
    }

    private final void zzF() {
        int i = 0;
        while (true) {
            zzmh[] zzmhVarArr = this.zzB;
            if (i >= zzmhVarArr.length) {
                return;
            }
            zzmh zzmhVar = zzmhVarArr[i];
            zzmhVar.zzg();
            this.zzC[i] = zzmhVar.zze();
            i++;
        }
    }

    private final void zzG(long j) throws zzmy {
        ByteBuffer byteBuffer;
        int length = this.zzB.length;
        int i = length;
        while (i >= 0) {
            if (i > 0) {
                byteBuffer = this.zzC[i - 1];
            } else {
                byteBuffer = this.zzD;
                if (byteBuffer == null) {
                    byteBuffer = zzmh.zza;
                }
            }
            if (i == length) {
                zzH(byteBuffer, j);
            } else {
                zzmh zzmhVar = this.zzB[i];
                if (i > this.zzH) {
                    zzmhVar.zzc(byteBuffer);
                }
                ByteBuffer zze = zzmhVar.zze();
                this.zzC[i] = zze;
                if (zze.hasRemaining()) {
                    i++;
                }
            }
            if (byteBuffer.hasRemaining()) {
                return;
            }
            i--;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:47:0x00dd, code lost:
        if (r15 < r14) goto L51;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void zzH(java.nio.ByteBuffer r13, long r14) throws com.google.android.gms.internal.ads.zzmy {
        /*
            Method dump skipped, instructions count: 367
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zznq.zzH(java.nio.ByteBuffer, long):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0018  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x0029 -> B:5:0x0009). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final boolean zzI() throws com.google.android.gms.internal.ads.zzmy {
        /*
            r9 = this;
            int r0 = r9.zzH
            r1 = -1
            r2 = 1
            r3 = 0
            if (r0 != r1) goto Lb
            r9.zzH = r3
        L9:
            r0 = 1
            goto Lc
        Lb:
            r0 = 0
        Lc:
            int r4 = r9.zzH
            com.google.android.gms.internal.ads.zzmh[] r5 = r9.zzB
            int r6 = r5.length
            r7 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r4 >= r6) goto L2f
            r4 = r5[r4]
            if (r0 == 0) goto L1f
            r4.zzd()
        L1f:
            r9.zzG(r7)
            boolean r0 = r4.zzf()
            if (r0 != 0) goto L29
            return r3
        L29:
            int r0 = r9.zzH
            int r0 = r0 + r2
            r9.zzH = r0
            goto L9
        L2f:
            java.nio.ByteBuffer r0 = r9.zzE
            if (r0 == 0) goto L3b
            r9.zzH(r0, r7)
            java.nio.ByteBuffer r0 = r9.zzE
            if (r0 == 0) goto L3b
            return r3
        L3b:
            r9.zzH = r1
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zznq.zzI():boolean");
    }

    private final void zzJ() {
        if (zzO()) {
            if (zzaht.zza >= 21) {
                this.zzn.setVolume(this.zzA);
                return;
            }
            AudioTrack audioTrack = this.zzn;
            float f = this.zzA;
            audioTrack.setStereoVolume(f, f);
        }
    }

    private final void zzK(zzku zzkuVar, boolean z) {
        zznk zzL = zzL();
        if (zzkuVar.equals(zzL.zza) && z == zzL.zzb) {
            return;
        }
        zznk zznkVar = new zznk(zzkuVar, z, -9223372036854775807L, -9223372036854775807L, null);
        if (zzO()) {
            this.zzp = zznkVar;
        } else {
            this.zzq = zznkVar;
        }
    }

    private final zznk zzL() {
        zznk zznkVar = this.zzp;
        return zznkVar != null ? zznkVar : !this.zzg.isEmpty() ? this.zzg.getLast() : this.zzq;
    }

    private final void zzM(long j) {
        zzku zzkuVar;
        boolean z;
        if (zzN()) {
            zznj zznjVar = this.zzS;
            zzkuVar = zzL().zza;
            zznjVar.zzb(zzkuVar);
        } else {
            zzkuVar = zzku.zza;
        }
        zzku zzkuVar2 = zzkuVar;
        if (zzN()) {
            zznj zznjVar2 = this.zzS;
            boolean z2 = zzL().zzb;
            zznjVar2.zzc(z2);
            z = z2;
        } else {
            z = false;
        }
        this.zzg.add(new zznk(zzkuVar2, z, Math.max(0L, j), this.zzm.zza(zzQ()), null));
        zzmh[] zzmhVarArr = this.zzm.zzi;
        ArrayList arrayList = new ArrayList();
        for (zzmh zzmhVar : zzmhVarArr) {
            if (zzmhVar.zzb()) {
                arrayList.add(zzmhVar);
            } else {
                zzmhVar.zzg();
            }
        }
        int size = arrayList.size();
        this.zzB = (zzmh[]) arrayList.toArray(new zzmh[size]);
        this.zzC = new ByteBuffer[size];
        zzF();
        zzmw zzmwVar = this.zzk;
        if (zzmwVar != null) {
            zznv.zzac(((zznu) zzmwVar).zza).zzh(z);
        }
    }

    private final boolean zzN() {
        if (this.zzO || !"audio/raw".equals(this.zzm.zza.zzl)) {
            return false;
        }
        int i = this.zzm.zza.zzA;
        return true;
    }

    private final boolean zzO() {
        return this.zzn != null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long zzP() {
        zzni zzniVar = this.zzm;
        int i = zzniVar.zzc;
        return this.zzu / zzniVar.zzb;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long zzQ() {
        zzni zzniVar = this.zzm;
        int i = zzniVar.zzc;
        return this.zzv / zzniVar.zzd;
    }

    private static boolean zzR(AudioTrack audioTrack) {
        return zzaht.zza >= 29 && audioTrack.isOffloadedPlayback();
    }

    private final void zzS() {
        if (this.zzJ) {
            return;
        }
        this.zzJ = true;
        this.zzf.zzi(zzQ());
        this.zzn.stop();
        this.zzt = 0;
    }

    @Override // com.google.android.gms.internal.ads.zzmz
    public final void zza(zzmw zzmwVar) {
        this.zzk = zzmwVar;
    }

    @Override // com.google.android.gms.internal.ads.zzmz
    public final boolean zzb(zzjq zzjqVar) {
        return zzc(zzjqVar) != 0;
    }

    @Override // com.google.android.gms.internal.ads.zzmz
    public final int zzc(zzjq zzjqVar) {
        if ("audio/raw".equals(zzjqVar.zzl)) {
            if (zzaht.zzO(zzjqVar.zzA)) {
                return zzjqVar.zzA != 2 ? 1 : 2;
            }
            int i = zzjqVar.zzA;
            StringBuilder sb = new StringBuilder(33);
            sb.append("Invalid PCM encoding: ");
            sb.append(i);
            Log.w("DefaultAudioSink", sb.toString());
            return 0;
        }
        int i2 = zzaht.zza;
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzmz
    public final long zzd(boolean z) {
        long zzI;
        if (!zzO() || this.zzy) {
            return Long.MIN_VALUE;
        }
        long min = Math.min(this.zzf.zzb(z), this.zzm.zza(zzQ()));
        while (!this.zzg.isEmpty() && min >= this.zzg.getFirst().zzd) {
            this.zzq = this.zzg.remove();
        }
        zznk zznkVar = this.zzq;
        long j = min - zznkVar.zzd;
        if (zznkVar.zza.equals(zzku.zza)) {
            zzI = this.zzq.zzc + j;
        } else if (this.zzg.isEmpty()) {
            zzI = this.zzS.zzd(j) + this.zzq.zzc;
        } else {
            zznk first = this.zzg.getFirst();
            zzI = first.zzc - zzaht.zzI(first.zzd - min, this.zzq.zza.zzb);
        }
        return zzI + this.zzm.zza(this.zzS.zze());
    }

    @Override // com.google.android.gms.internal.ads.zzmz
    public final void zze(zzjq zzjqVar, int i, int[] iArr) throws zzmu {
        if ("audio/raw".equals(zzjqVar.zzl)) {
            zzafs.zza(zzaht.zzO(zzjqVar.zzA));
            int zzR = zzaht.zzR(zzjqVar.zzA, zzjqVar.zzy);
            int i2 = zzjqVar.zzA;
            zzmh[] zzmhVarArr = this.zzc;
            this.zzb.zzo(zzjqVar.zzB, zzjqVar.zzC);
            if (zzaht.zza < 21 && zzjqVar.zzy == 8 && iArr == null) {
                iArr = new int[6];
                for (int i3 = 0; i3 < 6; i3++) {
                    iArr[i3] = i3;
                }
            }
            this.zza.zzo(iArr);
            zzmf zzmfVar = new zzmf(zzjqVar.zzz, zzjqVar.zzy, zzjqVar.zzA);
            for (zzmh zzmhVar : zzmhVarArr) {
                try {
                    zzmf zza = zzmhVar.zza(zzmfVar);
                    if (true == zzmhVar.zzb()) {
                        zzmfVar = zza;
                    }
                } catch (zzmg e) {
                    throw new zzmu(e, zzjqVar);
                }
            }
            int i4 = zzmfVar.zzd;
            int i5 = zzmfVar.zzb;
            int zzQ = zzaht.zzQ(zzmfVar.zzc);
            int zzR2 = zzaht.zzR(i4, zzmfVar.zzc);
            if (i4 == 0) {
                String valueOf = String.valueOf(zzjqVar);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 48);
                sb.append("Invalid output encoding (mode=0) for: ");
                sb.append(valueOf);
                throw new zzmu(sb.toString(), zzjqVar);
            } else if (zzQ != 0) {
                this.zzQ = false;
                zzni zzniVar = new zzni(zzjqVar, zzR, 0, zzR2, i5, zzQ, i4, 0, false, zzmhVarArr);
                if (zzO()) {
                    this.zzl = zzniVar;
                    return;
                } else {
                    this.zzm = zzniVar;
                    return;
                }
            } else {
                String valueOf2 = String.valueOf(zzjqVar);
                StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 54);
                sb2.append("Invalid output channel config (mode=0) for: ");
                sb2.append(valueOf2);
                throw new zzmu(sb2.toString(), zzjqVar);
            }
        }
        int i6 = zzjqVar.zzz;
        int i7 = zzaht.zza;
        String valueOf3 = String.valueOf(zzjqVar);
        StringBuilder sb3 = new StringBuilder(String.valueOf(valueOf3).length() + 37);
        sb3.append("Unable to configure passthrough for: ");
        sb3.append(valueOf3);
        throw new zzmu(sb3.toString(), zzjqVar);
    }

    @Override // com.google.android.gms.internal.ads.zzmz
    public final void zzf() {
        this.zzK = true;
        if (zzO()) {
            this.zzf.zzc();
            this.zzn.play();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzmz
    public final void zzg() {
        this.zzx = true;
    }

    @Override // com.google.android.gms.internal.ads.zzmz
    public final boolean zzh(ByteBuffer byteBuffer, long j, int i) throws zzmv, zzmy {
        ByteBuffer byteBuffer2 = this.zzD;
        zzafs.zza(byteBuffer2 == null || byteBuffer == byteBuffer2);
        if (this.zzl != null) {
            if (!zzI()) {
                return false;
            }
            zzni zzniVar = this.zzl;
            zzni zzniVar2 = this.zzm;
            int i2 = zzniVar2.zzc;
            int i3 = zzniVar.zzc;
            if (zzniVar2.zzg != zzniVar.zzg || zzniVar2.zze != zzniVar.zze || zzniVar2.zzf != zzniVar.zzf || zzniVar2.zzd != zzniVar.zzd) {
                zzS();
                if (zzk()) {
                    return false;
                }
                zzv();
            } else {
                this.zzm = zzniVar;
                this.zzl = null;
                if (zzR(this.zzn)) {
                    this.zzn.setOffloadEndOfStream();
                    AudioTrack audioTrack = this.zzn;
                    zzjq zzjqVar = this.zzm.zza;
                    audioTrack.setOffloadDelayPadding(zzjqVar.zzB, zzjqVar.zzC);
                    this.zzR = true;
                }
            }
            zzM(j);
        }
        if (!zzO()) {
            try {
                this.zze.block();
                try {
                    zzni zzniVar3 = this.zzm;
                    Objects.requireNonNull(zzniVar3);
                    AudioTrack zzc = zzniVar3.zzc(this.zzO, this.zzo, this.zzM);
                    this.zzn = zzc;
                    if (zzR(zzc)) {
                        AudioTrack audioTrack2 = this.zzn;
                        if (this.zzh == null) {
                            this.zzh = new zznp(this);
                        }
                        this.zzh.zza(audioTrack2);
                        AudioTrack audioTrack3 = this.zzn;
                        zzjq zzjqVar2 = this.zzm.zza;
                        audioTrack3.setOffloadDelayPadding(zzjqVar2.zzB, zzjqVar2.zzC);
                    }
                    this.zzM = this.zzn.getAudioSessionId();
                    zznd zzndVar = this.zzf;
                    AudioTrack audioTrack4 = this.zzn;
                    zzni zzniVar4 = this.zzm;
                    int i4 = zzniVar4.zzc;
                    zzndVar.zza(audioTrack4, false, zzniVar4.zzg, zzniVar4.zzd, zzniVar4.zzh);
                    zzJ();
                    int i5 = this.zzN.zza;
                    this.zzy = true;
                } catch (zzmv e) {
                    zzmw zzmwVar = this.zzk;
                    if (zzmwVar != null) {
                        zzmwVar.zzb(e);
                    }
                    throw e;
                }
            } catch (zzmv e2) {
                this.zzi.zza(e2);
                return false;
            }
        }
        this.zzi.zzb();
        if (this.zzy) {
            this.zzz = Math.max(0L, j);
            this.zzx = false;
            this.zzy = false;
            zzM(j);
            if (this.zzK) {
                zzf();
            }
        }
        if (this.zzf.zze(zzQ())) {
            if (this.zzD == null) {
                zzafs.zza(byteBuffer.order() == ByteOrder.LITTLE_ENDIAN);
                if (!byteBuffer.hasRemaining()) {
                    return true;
                }
                int i6 = this.zzm.zzc;
                if (this.zzp != null) {
                    if (!zzI()) {
                        return false;
                    }
                    zzM(j);
                    this.zzp = null;
                }
                long zzP = this.zzz + (((zzP() - this.zzb.zzq()) * 1000000) / this.zzm.zza.zzz);
                if (!this.zzx && Math.abs(zzP - j) > 200000) {
                    this.zzk.zzb(new zzmx(j, zzP));
                    this.zzx = true;
                }
                if (this.zzx) {
                    if (!zzI()) {
                        return false;
                    }
                    long j2 = j - zzP;
                    this.zzz += j2;
                    this.zzx = false;
                    zzM(j);
                    zzmw zzmwVar2 = this.zzk;
                    if (zzmwVar2 != null && j2 != 0) {
                        ((zznu) zzmwVar2).zza.zzY();
                    }
                }
                int i7 = this.zzm.zzc;
                this.zzu += byteBuffer.remaining();
                this.zzD = byteBuffer;
            }
            zzG(j);
            if (!this.zzD.hasRemaining()) {
                this.zzD = null;
                return true;
            } else if (this.zzf.zzh(zzQ())) {
                Log.w("DefaultAudioSink", "Resetting stalled audio track");
                zzv();
                return true;
            } else {
                return false;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzmz
    public final void zzi() throws zzmy {
        if (!this.zzI && zzO() && zzI()) {
            zzS();
            this.zzI = true;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzmz
    public final boolean zzj() {
        return !zzO() || (this.zzI && !zzk());
    }

    @Override // com.google.android.gms.internal.ads.zzmz
    public final boolean zzk() {
        return zzO() && this.zzf.zzj(zzQ());
    }

    @Override // com.google.android.gms.internal.ads.zzmz
    public final void zzl(zzku zzkuVar) {
        zzK(new zzku(zzaht.zzA(zzkuVar.zzb, 0.1f, 8.0f), zzaht.zzA(zzkuVar.zzc, 0.1f, 8.0f)), zzL().zzb);
    }

    @Override // com.google.android.gms.internal.ads.zzmz
    public final zzku zzm() {
        return zzL().zza;
    }

    @Override // com.google.android.gms.internal.ads.zzmz
    public final void zzn(boolean z) {
        zzK(zzL().zza, z);
    }

    @Override // com.google.android.gms.internal.ads.zzmz
    public final void zzo(zzmd zzmdVar) {
        if (this.zzo.equals(zzmdVar)) {
            return;
        }
        this.zzo = zzmdVar;
        if (this.zzO) {
            return;
        }
        zzv();
    }

    @Override // com.google.android.gms.internal.ads.zzmz
    public final void zzp(int i) {
        if (this.zzM != i) {
            this.zzM = i;
            this.zzL = i != 0;
            zzv();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzmz
    public final void zzq(zzne zzneVar) {
        if (this.zzN.equals(zzneVar)) {
            return;
        }
        int i = zzneVar.zza;
        float f = zzneVar.zzb;
        if (this.zzn != null) {
            int i2 = this.zzN.zza;
        }
        this.zzN = zzneVar;
    }

    @Override // com.google.android.gms.internal.ads.zzmz
    public final void zzr() {
        zzafs.zzd(zzaht.zza >= 21);
        zzafs.zzd(this.zzL);
        if (this.zzO) {
            return;
        }
        this.zzO = true;
        zzv();
    }

    @Override // com.google.android.gms.internal.ads.zzmz
    public final void zzs() {
        if (this.zzO) {
            this.zzO = false;
            zzv();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzmz
    public final void zzt(float f) {
        if (this.zzA != f) {
            this.zzA = f;
            zzJ();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzmz
    public final void zzu() {
        this.zzK = false;
        if (zzO() && this.zzf.zzk()) {
            this.zzn.pause();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzmz
    public final void zzv() {
        if (zzO()) {
            this.zzu = 0L;
            this.zzv = 0L;
            this.zzw = 0L;
            this.zzR = false;
            this.zzq = new zznk(zzL().zza, zzL().zzb, 0L, 0L, null);
            this.zzz = 0L;
            this.zzp = null;
            this.zzg.clear();
            this.zzD = null;
            this.zzE = null;
            this.zzJ = false;
            this.zzI = false;
            this.zzH = -1;
            this.zzs = null;
            this.zzt = 0;
            this.zzb.zzp();
            zzF();
            if (this.zzf.zzd()) {
                this.zzn.pause();
            }
            if (zzR(this.zzn)) {
                zznp zznpVar = this.zzh;
                Objects.requireNonNull(zznpVar);
                zznpVar.zzb(this.zzn);
            }
            AudioTrack audioTrack = this.zzn;
            this.zzn = null;
            if (zzaht.zza < 21 && !this.zzL) {
                this.zzM = 0;
            }
            zzni zzniVar = this.zzl;
            if (zzniVar != null) {
                this.zzm = zzniVar;
                this.zzl = null;
            }
            this.zzf.zzl();
            this.zze.close();
            new zznh(this, "ExoPlayer:AudioTrackReleaseThread", audioTrack).start();
        }
        this.zzj.zzb();
        this.zzi.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzmz
    public final void zzw() {
        zzv();
        for (zzmh zzmhVar : this.zzc) {
            zzmhVar.zzh();
        }
        zzmh[] zzmhVarArr = this.zzd;
        int length = zzmhVarArr.length;
        for (int i = 0; i <= 0; i++) {
            zzmhVarArr[i].zzh();
        }
        this.zzK = false;
        this.zzQ = false;
    }
}
