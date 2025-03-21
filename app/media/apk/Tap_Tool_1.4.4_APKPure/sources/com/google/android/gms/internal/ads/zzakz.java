package com.google.android.gms.internal.ads;

import android.media.AudioTrack;
import android.os.ConditionVariable;
import android.os.SystemClock;
import android.util.Log;
import androidx.work.WorkRequest;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.LinkedList;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzakz {
    private Method zzA;
    private int zzB;
    private long zzC;
    private long zzD;
    private int zzE;
    private long zzF;
    private long zzG;
    private int zzH;
    private int zzI;
    private long zzJ;
    private long zzK;
    private long zzL;
    private float zzM;
    private zzaki[] zzN;
    private ByteBuffer[] zzO;
    private ByteBuffer zzP;
    private ByteBuffer zzQ;
    private byte[] zzR;
    private int zzS;
    private int zzT;
    private boolean zzU;
    private boolean zzV;
    private int zzW;
    private boolean zzX;
    private long zzY;
    private final zzala zza;
    private final zzalg zzb;
    private final zzaki[] zzc;
    private final zzakw zzd;
    private final ConditionVariable zze = new ConditionVariable(true);
    private final long[] zzf;
    private final zzaks zzg;
    private final LinkedList<zzakx> zzh;
    private AudioTrack zzi;
    private int zzj;
    private int zzk;
    private int zzl;
    private int zzm;
    private boolean zzn;
    private int zzo;
    private long zzp;
    private zzajx zzq;
    private zzajx zzr;
    private long zzs;
    private long zzt;
    private int zzu;
    private int zzv;
    private long zzw;
    private long zzx;
    private boolean zzy;
    private long zzz;

    public zzakz(zzakg zzakgVar, zzaki[] zzakiVarArr, zzakw zzakwVar) {
        this.zzd = zzakwVar;
        if (zzarj.zza >= 18) {
            try {
                Class[] clsArr = null;
                this.zzA = AudioTrack.class.getMethod("getLatency", null);
            } catch (NoSuchMethodException unused) {
            }
        }
        if (zzarj.zza >= 19) {
            this.zzg = new zzakt();
        } else {
            this.zzg = new zzaks(null);
        }
        zzala zzalaVar = new zzala();
        this.zza = zzalaVar;
        zzalg zzalgVar = new zzalg();
        this.zzb = zzalgVar;
        this.zzc = r1;
        System.arraycopy(zzakiVarArr, 0, r1, 2, 0);
        zzaki[] zzakiVarArr2 = {new zzale(), zzalaVar, zzalgVar};
        this.zzf = new long[10];
        this.zzM = 1.0f;
        this.zzI = 0;
        this.zzW = 0;
        this.zzr = zzajx.zza;
        this.zzT = -1;
        this.zzN = new zzaki[0];
        this.zzO = new ByteBuffer[0];
        this.zzh = new LinkedList<>();
    }

    private final void zzp() {
        ArrayList arrayList = new ArrayList();
        zzaki[] zzakiVarArr = this.zzc;
        for (int i = 0; i < 3; i++) {
            zzaki zzakiVar = zzakiVarArr[i];
            if (zzakiVar.zzb()) {
                arrayList.add(zzakiVar);
            } else {
                zzakiVar.zzi();
            }
        }
        int size = arrayList.size();
        this.zzN = (zzaki[]) arrayList.toArray(new zzaki[size]);
        this.zzO = new ByteBuffer[size];
        for (int i2 = 0; i2 < size; i2++) {
            zzaki zzakiVar2 = this.zzN[i2];
            zzakiVar2.zzi();
            this.zzO[i2] = zzakiVar2.zzg();
        }
    }

    private final void zzq(long j) throws zzaky {
        ByteBuffer byteBuffer;
        int length = this.zzN.length;
        int i = length;
        while (i >= 0) {
            if (i > 0) {
                byteBuffer = this.zzO[i - 1];
            } else {
                byteBuffer = this.zzP;
                if (byteBuffer == null) {
                    byteBuffer = zzaki.zza;
                }
            }
            if (i == length) {
                zzr(byteBuffer, j);
            } else {
                zzaki zzakiVar = this.zzN[i];
                zzakiVar.zze(byteBuffer);
                ByteBuffer zzg = zzakiVar.zzg();
                this.zzO[i] = zzg;
                if (zzg.hasRemaining()) {
                    i++;
                }
            }
            if (byteBuffer.hasRemaining()) {
                return;
            }
            i--;
        }
    }

    private final boolean zzr(ByteBuffer byteBuffer, long j) throws zzaky {
        int write;
        if (byteBuffer.hasRemaining()) {
            ByteBuffer byteBuffer2 = this.zzQ;
            if (byteBuffer2 != null) {
                zzaqu.zza(byteBuffer2 == byteBuffer);
            } else {
                this.zzQ = byteBuffer;
                if (zzarj.zza < 21) {
                    int remaining = byteBuffer.remaining();
                    byte[] bArr = this.zzR;
                    if (bArr == null || bArr.length < remaining) {
                        this.zzR = new byte[remaining];
                    }
                    int position = byteBuffer.position();
                    byteBuffer.get(this.zzR, 0, remaining);
                    byteBuffer.position(position);
                    this.zzS = 0;
                }
            }
            int remaining2 = byteBuffer.remaining();
            if (zzarj.zza < 21) {
                int zzd = this.zzo - ((int) (this.zzF - (this.zzg.zzd() * this.zzE)));
                if (zzd > 0) {
                    write = this.zzi.write(this.zzR, this.zzS, Math.min(remaining2, zzd));
                    if (write > 0) {
                        this.zzS += write;
                        byteBuffer.position(byteBuffer.position() + write);
                    }
                } else {
                    write = 0;
                }
            } else {
                write = this.zzi.write(byteBuffer, remaining2, 1);
            }
            this.zzY = SystemClock.elapsedRealtime();
            if (write >= 0) {
                boolean z = this.zzn;
                if (!z) {
                    this.zzF += write;
                }
                if (write == remaining2) {
                    if (z) {
                        this.zzG += this.zzH;
                    }
                    this.zzQ = null;
                    return true;
                }
                return false;
            }
            throw new zzaky(write);
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0038  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x0032 -> B:9:0x0012). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final boolean zzs() throws com.google.android.gms.internal.ads.zzaky {
        /*
            r9 = this;
            int r0 = r9.zzT
            r1 = -1
            r2 = 1
            r3 = 0
            if (r0 != r1) goto L14
            boolean r0 = r9.zzn
            if (r0 == 0) goto Lf
            com.google.android.gms.internal.ads.zzaki[] r0 = r9.zzN
            int r0 = r0.length
            goto L10
        Lf:
            r0 = 0
        L10:
            r9.zzT = r0
        L12:
            r0 = 1
            goto L15
        L14:
            r0 = 0
        L15:
            int r4 = r9.zzT
            com.google.android.gms.internal.ads.zzaki[] r5 = r9.zzN
            int r6 = r5.length
            r7 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r4 >= r6) goto L38
            r4 = r5[r4]
            if (r0 == 0) goto L28
            r4.zzf()
        L28:
            r9.zzq(r7)
            boolean r0 = r4.zzh()
            if (r0 != 0) goto L32
            return r3
        L32:
            int r0 = r9.zzT
            int r0 = r0 + r2
            r9.zzT = r0
            goto L12
        L38:
            java.nio.ByteBuffer r0 = r9.zzQ
            if (r0 == 0) goto L44
            r9.zzr(r0, r7)
            java.nio.ByteBuffer r0 = r9.zzQ
            if (r0 == 0) goto L44
            return r3
        L44:
            r9.zzT = r1
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzakz.zzs():boolean");
    }

    private final void zzt() {
        if (zzu()) {
            if (zzarj.zza >= 21) {
                this.zzi.setVolume(this.zzM);
                return;
            }
            AudioTrack audioTrack = this.zzi;
            float f = this.zzM;
            audioTrack.setStereoVolume(f, f);
        }
    }

    private final boolean zzu() {
        return this.zzi != null;
    }

    private final long zzv(long j) {
        return (j * 1000000) / this.zzj;
    }

    private final long zzw(long j) {
        return (j * this.zzj) / 1000000;
    }

    private final long zzx() {
        return this.zzn ? this.zzG : this.zzF / this.zzE;
    }

    private final void zzy() {
        this.zzw = 0L;
        this.zzv = 0;
        this.zzu = 0;
        this.zzx = 0L;
        this.zzy = false;
        this.zzz = 0L;
    }

    private final boolean zzz() {
        int i;
        return zzarj.zza < 23 && ((i = this.zzm) == 5 || i == 6);
    }

    public final long zza(boolean z) {
        long zze;
        long j;
        long j2;
        long j3;
        Method method;
        if (!zzu() || this.zzI == 0) {
            return Long.MIN_VALUE;
        }
        if (this.zzi.getPlayState() == 3) {
            long zze2 = this.zzg.zze();
            if (zze2 != 0) {
                long nanoTime = System.nanoTime() / 1000;
                if (nanoTime - this.zzx >= WorkRequest.DEFAULT_BACKOFF_DELAY_MILLIS) {
                    long[] jArr = this.zzf;
                    int i = this.zzu;
                    jArr[i] = zze2 - nanoTime;
                    this.zzu = (i + 1) % 10;
                    int i2 = this.zzv;
                    if (i2 < 10) {
                        this.zzv = i2 + 1;
                    }
                    this.zzx = nanoTime;
                    this.zzw = 0L;
                    int i3 = 0;
                    while (true) {
                        int i4 = this.zzv;
                        if (i3 >= i4) {
                            break;
                        }
                        this.zzw += this.zzf[i3] / i4;
                        i3++;
                    }
                }
                if (!zzz() && nanoTime - this.zzz >= 500000) {
                    boolean zzf = this.zzg.zzf();
                    this.zzy = zzf;
                    if (zzf) {
                        long zzg = this.zzg.zzg() / 1000;
                        long zzh = this.zzg.zzh();
                        if (zzg < this.zzK) {
                            this.zzy = false;
                        } else if (Math.abs(zzg - nanoTime) > 5000000) {
                            StringBuilder sb = new StringBuilder(136);
                            sb.append("Spurious audio timestamp (system clock mismatch): ");
                            sb.append(zzh);
                            sb.append(", ");
                            sb.append(zzg);
                            sb.append(", ");
                            sb.append(nanoTime);
                            sb.append(", ");
                            sb.append(zze2);
                            Log.w("AudioTrack", sb.toString());
                            this.zzy = false;
                        } else if (Math.abs(zzv(zzh) - zze2) > 5000000) {
                            StringBuilder sb2 = new StringBuilder(138);
                            sb2.append("Spurious audio timestamp (frame position mismatch): ");
                            sb2.append(zzh);
                            sb2.append(", ");
                            sb2.append(zzg);
                            sb2.append(", ");
                            sb2.append(nanoTime);
                            sb2.append(", ");
                            sb2.append(zze2);
                            Log.w("AudioTrack", sb2.toString());
                            this.zzy = false;
                        }
                    }
                    if (this.zzA != null && !this.zzn) {
                        try {
                            Object[] objArr = null;
                            long intValue = (((Integer) method.invoke(this.zzi, null)).intValue() * 1000) - this.zzp;
                            this.zzL = intValue;
                            long max = Math.max(intValue, 0L);
                            this.zzL = max;
                            if (max > 5000000) {
                                StringBuilder sb3 = new StringBuilder(61);
                                sb3.append("Ignoring impossibly large audio latency: ");
                                sb3.append(max);
                                Log.w("AudioTrack", sb3.toString());
                                this.zzL = 0L;
                            }
                        } catch (Exception unused) {
                            this.zzA = null;
                        }
                    }
                    this.zzz = nanoTime;
                }
            }
        }
        long nanoTime2 = System.nanoTime() / 1000;
        if (this.zzy) {
            zze = zzv(this.zzg.zzh() + zzw(nanoTime2 - (this.zzg.zzg() / 1000)));
        } else {
            zze = this.zzv == 0 ? this.zzg.zze() : nanoTime2 + this.zzw;
            if (!z) {
                zze -= this.zzL;
            }
        }
        long j4 = this.zzJ;
        while (!this.zzh.isEmpty() && zze >= zzakx.zzb(this.zzh.getFirst())) {
            zzakx remove = this.zzh.remove();
            this.zzr = zzakx.zza(remove);
            this.zzt = zzakx.zzb(remove);
            this.zzs = zzakx.zzc(remove) - this.zzJ;
        }
        if (this.zzr.zzb == 1.0f) {
            j3 = (zze + this.zzs) - this.zzt;
        } else {
            if (!this.zzh.isEmpty() || this.zzb.zzn() < 1024) {
                j = this.zzs;
                j2 = (long) (this.zzr.zzb * (zze - this.zzt));
            } else {
                j = this.zzs;
                j2 = zzarj.zzj(zze - this.zzt, this.zzb.zzm(), this.zzb.zzn());
            }
            j3 = j2 + j;
        }
        return j4 + j3;
    }

    public final void zzc() {
        this.zzV = true;
        if (zzu()) {
            this.zzK = System.nanoTime() / 1000;
            this.zzi.play();
        }
    }

    public final void zzd() {
        if (this.zzI == 1) {
            this.zzI = 2;
        }
    }

    public final boolean zze(ByteBuffer byteBuffer, long j) throws zzakv, zzaky {
        int i;
        ByteBuffer byteBuffer2 = this.zzP;
        zzaqu.zza(byteBuffer2 == null || byteBuffer == byteBuffer2);
        if (!zzu()) {
            this.zze.block();
            int i2 = this.zzW;
            if (i2 == 0) {
                this.zzi = new AudioTrack(3, this.zzj, this.zzk, this.zzm, this.zzo, 1);
            } else {
                this.zzi = new AudioTrack(3, this.zzj, this.zzk, this.zzm, this.zzo, 1, i2);
            }
            int state = this.zzi.getState();
            if (state == 1) {
                int audioSessionId = this.zzi.getAudioSessionId();
                if (this.zzW != audioSessionId) {
                    this.zzW = audioSessionId;
                    zzald.zzS(((zzalc) this.zzd).zza).zzf(audioSessionId);
                }
                this.zzg.zza(this.zzi, zzz());
                zzt();
                this.zzX = false;
                if (this.zzV) {
                    zzc();
                }
            } else {
                try {
                    this.zzi.release();
                } catch (Exception unused) {
                } finally {
                    this.zzi = null;
                }
                throw new zzakv(state, this.zzj, this.zzk, this.zzo);
            }
        }
        if (zzz()) {
            if (this.zzi.getPlayState() == 2) {
                this.zzX = false;
                return false;
            } else if (this.zzi.getPlayState() == 1 && this.zzg.zzd() != 0) {
                return false;
            }
        }
        boolean z = this.zzX;
        boolean zzh = zzh();
        this.zzX = zzh;
        if (z && !zzh && this.zzi.getPlayState() != 1) {
            zzald.zzS(((zzalc) this.zzd).zza).zzd(this.zzo, zzaje.zza(this.zzp), SystemClock.elapsedRealtime() - this.zzY);
        }
        if (this.zzP == null) {
            if (!byteBuffer.hasRemaining()) {
                return true;
            }
            if (this.zzn && this.zzH == 0) {
                int i3 = this.zzm;
                if (i3 == 7 || i3 == 8) {
                    int position = byteBuffer.position();
                    i = ((((byteBuffer.get(position + 5) & 252) >> 2) | ((byteBuffer.get(position + 4) & 1) << 6)) + 1) * 32;
                } else if (i3 == 5) {
                    int i4 = zzakf.zza;
                    i = 1536;
                } else if (i3 == 6) {
                    i = zzakf.zzc(byteBuffer);
                } else {
                    StringBuilder sb = new StringBuilder(38);
                    sb.append("Unexpected audio encoding: ");
                    sb.append(i3);
                    throw new IllegalStateException(sb.toString());
                }
                this.zzH = i;
            }
            if (this.zzq != null) {
                if (!zzs()) {
                    return false;
                }
                this.zzh.add(new zzakx(this.zzq, Math.max(0L, j), zzv(zzx()), null));
                this.zzq = null;
                zzp();
            }
            if (this.zzI == 0) {
                this.zzJ = Math.max(0L, j);
                this.zzI = 1;
            } else {
                long zzv = this.zzJ + zzv(this.zzn ? this.zzD : this.zzC / this.zzB);
                if (this.zzI == 1 && Math.abs(zzv - j) > 200000) {
                    StringBuilder sb2 = new StringBuilder(80);
                    sb2.append("Discontinuity detected [expected ");
                    sb2.append(zzv);
                    sb2.append(", got ");
                    sb2.append(j);
                    sb2.append("]");
                    Log.e("AudioTrack", sb2.toString());
                    this.zzI = 2;
                }
                if (this.zzI == 2) {
                    this.zzJ += j - zzv;
                    this.zzI = 1;
                    zzald.zzT(((zzalc) this.zzd).zza, true);
                }
            }
            if (this.zzn) {
                this.zzD += this.zzH;
            } else {
                this.zzC += byteBuffer.remaining();
            }
            this.zzP = byteBuffer;
        }
        if (this.zzn) {
            zzr(this.zzP, j);
        } else {
            zzq(j);
        }
        if (this.zzP.hasRemaining()) {
            return false;
        }
        this.zzP = null;
        return true;
    }

    public final void zzf() throws zzaky {
        if (!this.zzU && zzu() && zzs()) {
            this.zzg.zzb(zzx());
            this.zzU = true;
        }
    }

    public final boolean zzg() {
        return !zzu() || (this.zzU && !zzh());
    }

    public final boolean zzh() {
        if (zzu()) {
            if (zzx() > this.zzg.zzd()) {
                return true;
            }
            if (zzz() && this.zzi.getPlayState() == 2 && this.zzi.getPlaybackHeadPosition() == 0) {
                return true;
            }
        }
        return false;
    }

    public final zzajx zzi(zzajx zzajxVar) {
        if (this.zzn) {
            zzajx zzajxVar2 = zzajx.zza;
            this.zzr = zzajxVar2;
            return zzajxVar2;
        }
        float zzk = this.zzb.zzk(zzajxVar.zzb);
        zzalg zzalgVar = this.zzb;
        float f = zzajxVar.zzc;
        zzalgVar.zzl(1.0f);
        zzajx zzajxVar3 = new zzajx(zzk, 1.0f);
        zzajx zzajxVar4 = this.zzq;
        if (zzajxVar4 == null) {
            if (!this.zzh.isEmpty()) {
                zzajxVar4 = zzakx.zza(this.zzh.getLast());
            } else {
                zzajxVar4 = this.zzr;
            }
        }
        if (!zzajxVar3.equals(zzajxVar4)) {
            if (zzu()) {
                this.zzq = zzajxVar3;
            } else {
                this.zzr = zzajxVar3;
            }
        }
        return this.zzr;
    }

    public final zzajx zzj() {
        return this.zzr;
    }

    public final void zzk(float f) {
        if (this.zzM != f) {
            this.zzM = f;
            zzt();
        }
    }

    public final void zzl() {
        this.zzV = false;
        if (zzu()) {
            zzy();
            this.zzg.zzc();
        }
    }

    public final void zzn() {
        zzm();
        zzaki[] zzakiVarArr = this.zzc;
        for (int i = 0; i < 3; i++) {
            zzakiVarArr[i].zzj();
        }
        this.zzW = 0;
        this.zzV = false;
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00fb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zzb(java.lang.String r6, int r7, int r8, int r9, int r10, int[] r11) throws com.google.android.gms.internal.ads.zzaku {
        /*
            Method dump skipped, instructions count: 292
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzakz.zzb(java.lang.String, int, int, int, int, int[]):void");
    }

    public final void zzm() {
        if (zzu()) {
            this.zzC = 0L;
            this.zzD = 0L;
            this.zzF = 0L;
            this.zzG = 0L;
            this.zzH = 0;
            zzajx zzajxVar = this.zzq;
            if (zzajxVar != null) {
                this.zzr = zzajxVar;
                this.zzq = null;
            } else if (!this.zzh.isEmpty()) {
                this.zzr = zzakx.zza(this.zzh.getLast());
            }
            this.zzh.clear();
            this.zzs = 0L;
            this.zzt = 0L;
            this.zzP = null;
            this.zzQ = null;
            int i = 0;
            while (true) {
                zzaki[] zzakiVarArr = this.zzN;
                if (i >= zzakiVarArr.length) {
                    break;
                }
                zzaki zzakiVar = zzakiVarArr[i];
                zzakiVar.zzi();
                this.zzO[i] = zzakiVar.zzg();
                i++;
            }
            this.zzU = false;
            this.zzT = -1;
            this.zzI = 0;
            this.zzL = 0L;
            zzy();
            if (this.zzi.getPlayState() == 3) {
                this.zzi.pause();
            }
            AudioTrack audioTrack = this.zzi;
            this.zzi = null;
            this.zzg.zza(null, false);
            this.zze.close();
            new zzakr(this, audioTrack).start();
        }
    }
}
