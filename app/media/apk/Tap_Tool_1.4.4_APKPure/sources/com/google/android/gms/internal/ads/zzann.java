package com.google.android.gms.internal.ads;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.SystemClock;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import kotlin.UByte;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public abstract class zzann extends zzajd {
    private static final byte[] zzb = zzarj.zzm("0000016742C00BDA259000000168CE0F13200000016588840DCE7118A0002FBF1C31C3275D78");
    private boolean zzA;
    private int zzB;
    private int zzC;
    private boolean zzD;
    private boolean zzE;
    private boolean zzF;
    private boolean zzG;
    private boolean zzH;
    protected zzall zza;
    private final zzanp zzc;
    private final zzalm zzd;
    private final zzalm zze;
    private final zzaju zzf;
    private final List<Long> zzg;
    private final MediaCodec.BufferInfo zzh;
    private zzajt zzi;
    private MediaCodec zzj;
    private zzanl zzk;
    private boolean zzl;
    private boolean zzm;
    private boolean zzn;
    private boolean zzo;
    private boolean zzp;
    private boolean zzq;
    private boolean zzr;
    private boolean zzs;
    private boolean zzt;
    private ByteBuffer[] zzu;
    private ByteBuffer[] zzv;
    private long zzw;
    private int zzx;
    private int zzy;
    private boolean zzz;

    public zzann(int i, zzanp zzanpVar, zzalr zzalrVar, boolean z) {
        super(i);
        zzaqu.zzd(zzarj.zza >= 16);
        this.zzc = zzanpVar;
        this.zzd = new zzalm(0);
        this.zze = new zzalm(0);
        this.zzf = new zzaju();
        this.zzg = new ArrayList();
        this.zzh = new MediaCodec.BufferInfo();
        this.zzB = 0;
        this.zzC = 0;
    }

    private final boolean zzN() throws zzajf {
        MediaCodec mediaCodec = this.zzj;
        if (mediaCodec == null || this.zzC == 2 || this.zzF) {
            return false;
        }
        if (this.zzx < 0) {
            int dequeueInputBuffer = mediaCodec.dequeueInputBuffer(0L);
            this.zzx = dequeueInputBuffer;
            if (dequeueInputBuffer < 0) {
                return false;
            }
            zzalm zzalmVar = this.zzd;
            zzalmVar.zzb = this.zzu[dequeueInputBuffer];
            zzalmVar.zza();
        }
        if (this.zzC == 1) {
            if (!this.zzo) {
                this.zzE = true;
                this.zzj.queueInputBuffer(this.zzx, 0, 0, 0L, 4);
                this.zzx = -1;
            }
            this.zzC = 2;
            return false;
        } else if (this.zzs) {
            this.zzs = false;
            ByteBuffer byteBuffer = this.zzd.zzb;
            byte[] bArr = zzb;
            byteBuffer.put(bArr);
            MediaCodec mediaCodec2 = this.zzj;
            int i = this.zzx;
            int length = bArr.length;
            mediaCodec2.queueInputBuffer(i, 0, 38, 0L, 0);
            this.zzx = -1;
            this.zzD = true;
            return true;
        } else {
            if (this.zzB == 1) {
                for (int i2 = 0; i2 < this.zzi.zzh.size(); i2++) {
                    this.zzd.zzb.put(this.zzi.zzh.get(i2));
                }
                this.zzB = 2;
            }
            int position = this.zzd.zzb.position();
            int zzA = zzA(this.zzf, this.zzd, false);
            if (zzA == -3) {
                return false;
            }
            if (zzA == -5) {
                if (this.zzB == 2) {
                    this.zzd.zza();
                    this.zzB = 1;
                }
                zzL(this.zzf.zza);
                return true;
            } else if (!this.zzd.zzc()) {
                if (!this.zzH || this.zzd.zzd()) {
                    this.zzH = false;
                    boolean zzi = this.zzd.zzi();
                    if (this.zzl && !zzi) {
                        ByteBuffer byteBuffer2 = this.zzd.zzb;
                        byte[] bArr2 = zzara.zza;
                        int position2 = byteBuffer2.position();
                        int i3 = 0;
                        int i4 = 0;
                        while (true) {
                            int i5 = i3 + 1;
                            if (i5 < position2) {
                                int i6 = byteBuffer2.get(i3) & UByte.MAX_VALUE;
                                if (i4 == 3) {
                                    if (i6 == 1) {
                                        if ((byteBuffer2.get(i5) & 31) == 7) {
                                            ByteBuffer duplicate = byteBuffer2.duplicate();
                                            duplicate.position(i3 - 3);
                                            duplicate.limit(position2);
                                            byteBuffer2.position(0);
                                            byteBuffer2.put(duplicate);
                                            break;
                                        }
                                        i6 = 1;
                                    }
                                } else if (i6 == 0) {
                                    i4++;
                                }
                                if (i6 != 0) {
                                    i4 = 0;
                                }
                                i3 = i5;
                            } else {
                                byteBuffer2.clear();
                                break;
                            }
                        }
                        if (this.zzd.zzb.position() == 0) {
                            return true;
                        }
                        this.zzl = false;
                    }
                    try {
                        zzalm zzalmVar2 = this.zzd;
                        long j = zzalmVar2.zzc;
                        if (zzalmVar2.zzb()) {
                            this.zzg.add(Long.valueOf(j));
                        }
                        this.zzd.zzb.flip();
                        zzZ(this.zzd);
                        if (zzi) {
                            MediaCodec.CryptoInfo zzb2 = this.zzd.zza.zzb();
                            if (position != 0) {
                                if (zzb2.numBytesOfClearData == null) {
                                    zzb2.numBytesOfClearData = new int[1];
                                }
                                int[] iArr = zzb2.numBytesOfClearData;
                                iArr[0] = iArr[0] + position;
                            }
                            this.zzj.queueSecureInputBuffer(this.zzx, 0, zzb2, j, 0);
                        } else {
                            this.zzj.queueInputBuffer(this.zzx, 0, this.zzd.zzb.limit(), j, 0);
                        }
                        this.zzx = -1;
                        this.zzD = true;
                        this.zzB = 0;
                        this.zza.zzc++;
                        return true;
                    } catch (MediaCodec.CryptoException e) {
                        throw zzajf.zza(e, zzz());
                    }
                } else {
                    this.zzd.zza();
                    if (this.zzB == 2) {
                        this.zzB = 1;
                    }
                    return true;
                }
            } else {
                if (this.zzB == 2) {
                    this.zzd.zza();
                    this.zzB = 1;
                }
                this.zzF = true;
                if (!this.zzD) {
                    zzO();
                    return false;
                }
                try {
                    if (!this.zzo) {
                        this.zzE = true;
                        this.zzj.queueInputBuffer(this.zzx, 0, 0, 0L, 4);
                        this.zzx = -1;
                    }
                    return false;
                } catch (MediaCodec.CryptoException e2) {
                    throw zzajf.zza(e2, zzz());
                }
            }
        }
    }

    private final void zzO() throws zzajf {
        if (this.zzC == 2) {
            zzY();
            zzU();
            return;
        }
        this.zzG = true;
        zzR();
    }

    @Override // com.google.android.gms.internal.ads.zzajy
    public final void zzD(long j, long j2) throws zzajf {
        boolean zzQ;
        int dequeueOutputBuffer;
        boolean z;
        if (this.zzG) {
            zzR();
            return;
        }
        if (this.zzi == null) {
            this.zze.zza();
            int zzA = zzA(this.zzf, this.zze, true);
            if (zzA != -5) {
                if (zzA == -4) {
                    zzaqu.zzd(this.zze.zzc());
                    this.zzF = true;
                    zzO();
                    return;
                }
                return;
            }
            zzL(this.zzf.zza);
        }
        zzU();
        if (this.zzj != null) {
            zzarh.zza("drainAndFeed");
            while (true) {
                if (this.zzy < 0) {
                    if (!this.zzq || !this.zzE) {
                        dequeueOutputBuffer = this.zzj.dequeueOutputBuffer(this.zzh, 0L);
                        this.zzy = dequeueOutputBuffer;
                    } else {
                        try {
                            dequeueOutputBuffer = this.zzj.dequeueOutputBuffer(this.zzh, 0L);
                            this.zzy = dequeueOutputBuffer;
                        } catch (IllegalStateException unused) {
                            zzO();
                            if (this.zzG) {
                                zzY();
                            }
                        }
                    }
                    if (dequeueOutputBuffer >= 0) {
                        if (this.zzt) {
                            this.zzt = false;
                            this.zzj.releaseOutputBuffer(dequeueOutputBuffer, false);
                            this.zzy = -1;
                        } else if ((this.zzh.flags & 4) == 0) {
                            ByteBuffer byteBuffer = this.zzv[this.zzy];
                            if (byteBuffer != null) {
                                byteBuffer.position(this.zzh.offset);
                                byteBuffer.limit(this.zzh.offset + this.zzh.size);
                            }
                            long j3 = this.zzh.presentationTimeUs;
                            int size = this.zzg.size();
                            int i = 0;
                            while (true) {
                                if (i >= size) {
                                    z = false;
                                    break;
                                } else if (this.zzg.get(i).longValue() == j3) {
                                    this.zzg.remove(i);
                                    z = true;
                                    break;
                                } else {
                                    i++;
                                }
                            }
                            this.zzz = z;
                        } else {
                            zzO();
                            this.zzy = -1;
                            break;
                        }
                    } else if (dequeueOutputBuffer == -2) {
                        MediaFormat outputFormat = this.zzj.getOutputFormat();
                        if (this.zzn && outputFormat.getInteger("width") == 32 && outputFormat.getInteger("height") == 32) {
                            this.zzt = true;
                        } else {
                            if (this.zzr) {
                                outputFormat.setInteger("channel-count", 1);
                            }
                            zzM(this.zzj, outputFormat);
                        }
                    } else if (dequeueOutputBuffer == -3) {
                        this.zzv = this.zzj.getOutputBuffers();
                    } else if (this.zzo && (this.zzF || this.zzC == 2)) {
                        zzO();
                    }
                }
                if (this.zzq && this.zzE) {
                    try {
                        MediaCodec mediaCodec = this.zzj;
                        ByteBuffer[] byteBufferArr = this.zzv;
                        int i2 = this.zzy;
                        zzQ = zzQ(j, j2, mediaCodec, byteBufferArr[i2], i2, this.zzh.flags, this.zzh.presentationTimeUs, this.zzz);
                    } catch (IllegalStateException unused2) {
                        zzO();
                        if (this.zzG) {
                            zzY();
                        }
                    }
                } else {
                    MediaCodec mediaCodec2 = this.zzj;
                    ByteBuffer[] byteBufferArr2 = this.zzv;
                    int i3 = this.zzy;
                    zzQ = zzQ(j, j2, mediaCodec2, byteBufferArr2[i3], i3, this.zzh.flags, this.zzh.presentationTimeUs, this.zzz);
                }
                if (!zzQ) {
                    break;
                }
                long j4 = this.zzh.presentationTimeUs;
                this.zzy = -1;
            }
            do {
            } while (zzN());
            zzarh.zzb();
        } else {
            zzB(j);
            this.zze.zza();
            int zzA2 = zzA(this.zzf, this.zze, false);
            if (zzA2 == -5) {
                zzL(this.zzf.zza);
            } else if (zzA2 == -4) {
                zzaqu.zzd(this.zze.zzc());
                this.zzF = true;
                zzO();
            }
        }
        this.zza.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzajy
    public boolean zzE() {
        if (this.zzi != null) {
            if (zzC() || this.zzy >= 0) {
                return true;
            }
            if (this.zzw != -9223372036854775807L && SystemClock.elapsedRealtime() < this.zzw) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzajy
    public boolean zzF() {
        return this.zzG;
    }

    @Override // com.google.android.gms.internal.ads.zzajz
    public final int zzG(zzajt zzajtVar) throws zzajf {
        try {
            return zzH(this.zzc, zzajtVar);
        } catch (zzans e) {
            throw zzajf.zza(e, zzz());
        }
    }

    protected abstract int zzH(zzanp zzanpVar, zzajt zzajtVar) throws zzans;

    /* JADX INFO: Access modifiers changed from: protected */
    public zzanl zzI(zzanp zzanpVar, zzajt zzajtVar, boolean z) throws zzans {
        return zzanw.zza(zzajtVar.zzf, false);
    }

    protected abstract void zzJ(zzanl zzanlVar, MediaCodec mediaCodec, zzajt zzajtVar, MediaCrypto mediaCrypto) throws zzans;

    protected void zzK(String str, long j, long j2) {
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x004f, code lost:
        if (r6.zzk == r0.zzk) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void zzL(com.google.android.gms.internal.ads.zzajt r6) throws com.google.android.gms.internal.ads.zzajf {
        /*
            r5 = this;
            com.google.android.gms.internal.ads.zzajt r0 = r5.zzi
            r5.zzi = r6
            com.google.android.gms.internal.ads.zzalq r6 = r6.zzi
            if (r0 != 0) goto La
            r1 = 0
            goto Lc
        La:
            com.google.android.gms.internal.ads.zzalq r1 = r0.zzi
        Lc:
            boolean r6 = com.google.android.gms.internal.ads.zzarj.zza(r6, r1)
            if (r6 != 0) goto L29
            com.google.android.gms.internal.ads.zzajt r6 = r5.zzi
            com.google.android.gms.internal.ads.zzalq r6 = r6.zzi
            if (r6 != 0) goto L19
            goto L29
        L19:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "Media requires a DrmSessionManager"
            r6.<init>(r0)
            int r0 = r5.zzz()
            com.google.android.gms.internal.ads.zzajf r6 = com.google.android.gms.internal.ads.zzajf.zza(r6, r0)
            throw r6
        L29:
            android.media.MediaCodec r6 = r5.zzj
            r1 = 1
            if (r6 == 0) goto L56
            com.google.android.gms.internal.ads.zzanl r2 = r5.zzk
            boolean r2 = r2.zzb
            com.google.android.gms.internal.ads.zzajt r3 = r5.zzi
            boolean r6 = r5.zzaa(r6, r2, r0, r3)
            if (r6 == 0) goto L56
            r5.zzA = r1
            r5.zzB = r1
            boolean r6 = r5.zzn
            r2 = 0
            if (r6 == 0) goto L52
            com.google.android.gms.internal.ads.zzajt r6 = r5.zzi
            int r3 = r6.zzj
            int r4 = r0.zzj
            if (r3 != r4) goto L52
            int r6 = r6.zzk
            int r0 = r0.zzk
            if (r6 != r0) goto L52
            goto L53
        L52:
            r1 = 0
        L53:
            r5.zzs = r1
            return
        L56:
            boolean r6 = r5.zzD
            if (r6 == 0) goto L5d
            r5.zzC = r1
            return
        L5d:
            r5.zzY()
            r5.zzU()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzann.zzL(com.google.android.gms.internal.ads.zzajt):void");
    }

    protected void zzM(MediaCodec mediaCodec, MediaFormat mediaFormat) throws zzajf {
        throw null;
    }

    protected abstract boolean zzQ(long j, long j2, MediaCodec mediaCodec, ByteBuffer byteBuffer, int i, int i2, long j3, boolean z) throws zzajf;

    protected void zzR() throws zzajf {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void zzU() throws zzajf {
        zzajt zzajtVar;
        if (this.zzj != null || (zzajtVar = this.zzi) == null) {
            return;
        }
        zzanl zzanlVar = this.zzk;
        if (zzanlVar == null) {
            try {
                zzanlVar = zzI(this.zzc, zzajtVar, false);
                this.zzk = zzanlVar;
                if (zzanlVar == null) {
                    throw zzajf.zza(new zzanm(this.zzi, (Throwable) null, false, -49999), zzz());
                }
            } catch (zzans e) {
                throw zzajf.zza(new zzanm(this.zzi, (Throwable) e, false, -49998), zzz());
            }
        }
        if (zzV(zzanlVar)) {
            String str = this.zzk.zza;
            this.zzl = zzarj.zza < 21 && this.zzi.zzh.isEmpty() && "OMX.MTK.VIDEO.DECODER.AVC".equals(str);
            this.zzm = zzarj.zza < 18 || (zzarj.zza == 18 && ("OMX.SEC.avc.dec".equals(str) || "OMX.SEC.avc.dec.secure".equals(str))) || (zzarj.zza == 19 && zzarj.zzd.startsWith("SM-G800") && ("OMX.Exynos.avc.dec".equals(str) || "OMX.Exynos.avc.dec.secure".equals(str)));
            this.zzn = zzarj.zza < 24 && ("OMX.Nvidia.h264.decode".equals(str) || "OMX.Nvidia.h264.decode.secure".equals(str)) && ("flounder".equals(zzarj.zzb) || "flounder_lte".equals(zzarj.zzb) || "grouper".equals(zzarj.zzb) || "tilapia".equals(zzarj.zzb));
            this.zzo = zzarj.zza <= 17 && ("OMX.rk.video_decoder.avc".equals(str) || "OMX.allwinner.video.decoder.avc".equals(str));
            this.zzp = (zzarj.zza <= 23 && "OMX.google.vorbis.decoder".equals(str)) || (zzarj.zza <= 19 && "hb2000".equals(zzarj.zzb) && ("OMX.amlogic.avc.decoder.awesome".equals(str) || "OMX.amlogic.avc.decoder.awesome.secure".equals(str)));
            this.zzq = zzarj.zza == 21 && "OMX.google.aac.decoder".equals(str);
            this.zzr = zzarj.zza <= 18 && this.zzi.zzr == 1 && "OMX.MTK.AUDIO.DECODER.MP3".equals(str);
            try {
                long elapsedRealtime = SystemClock.elapsedRealtime();
                String valueOf = String.valueOf(str);
                zzarh.zza(valueOf.length() != 0 ? "createCodec:".concat(valueOf) : new String("createCodec:"));
                this.zzj = MediaCodec.createByCodecName(str);
                zzarh.zzb();
                zzarh.zza("configureCodec");
                zzJ(this.zzk, this.zzj, this.zzi, null);
                zzarh.zzb();
                zzarh.zza("startCodec");
                this.zzj.start();
                zzarh.zzb();
                long elapsedRealtime2 = SystemClock.elapsedRealtime();
                zzK(str, elapsedRealtime2, elapsedRealtime2 - elapsedRealtime);
                this.zzu = this.zzj.getInputBuffers();
                this.zzv = this.zzj.getOutputBuffers();
                this.zzw = zze() == 2 ? SystemClock.elapsedRealtime() + 1000 : -9223372036854775807L;
                this.zzx = -1;
                this.zzy = -1;
                this.zzH = true;
                this.zza.zza++;
            } catch (Exception e2) {
                throw zzajf.zza(new zzanm(this.zzi, (Throwable) e2, false, str), zzz());
            }
        }
    }

    protected boolean zzV(zzanl zzanlVar) {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final MediaCodec zzW() {
        return this.zzj;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final zzanl zzX() {
        return this.zzk;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void zzY() {
        this.zzw = -9223372036854775807L;
        this.zzx = -1;
        this.zzy = -1;
        this.zzz = false;
        this.zzg.clear();
        this.zzu = null;
        this.zzv = null;
        this.zzk = null;
        this.zzA = false;
        this.zzD = false;
        this.zzl = false;
        this.zzm = false;
        this.zzn = false;
        this.zzo = false;
        this.zzp = false;
        this.zzr = false;
        this.zzs = false;
        this.zzt = false;
        this.zzE = false;
        this.zzB = 0;
        this.zzC = 0;
        this.zzd.zzb = null;
        MediaCodec mediaCodec = this.zzj;
        if (mediaCodec != null) {
            this.zza.zzb++;
            try {
                mediaCodec.stop();
                try {
                    this.zzj.release();
                } finally {
                }
            } catch (Throwable th) {
                try {
                    this.zzj.release();
                    throw th;
                } finally {
                }
            }
        }
    }

    protected void zzZ(zzalm zzalmVar) {
    }

    protected boolean zzaa(MediaCodec mediaCodec, boolean z, zzajt zzajtVar, zzajt zzajtVar2) {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzajd, com.google.android.gms.internal.ads.zzajz
    public final int zzq() {
        return 4;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzajd
    public void zzs(boolean z) throws zzajf {
        this.zza = new zzall();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzajd
    public void zzu(long j, boolean z) throws zzajf {
        this.zzF = false;
        this.zzG = false;
        if (this.zzj != null) {
            this.zzw = -9223372036854775807L;
            this.zzx = -1;
            this.zzy = -1;
            this.zzH = true;
            this.zzz = false;
            this.zzg.clear();
            this.zzs = false;
            this.zzt = false;
            if (this.zzm || (this.zzp && this.zzE)) {
                zzY();
                zzU();
            } else if (this.zzC != 0) {
                zzY();
                zzU();
            } else {
                this.zzj.flush();
                this.zzD = false;
            }
            if (!this.zzA || this.zzi == null) {
                return;
            }
            this.zzB = 1;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzajd
    public void zzx() {
        this.zzi = null;
        zzY();
    }
}
