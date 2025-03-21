package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Point;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.SystemClock;
import android.util.Log;
import android.view.Surface;
import androidx.work.WorkRequest;
import java.nio.ByteBuffer;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzars extends zzann {
    private static final int[] zzb = {1920, 1600, 1440, 1280, 960, 854, 640, 540, 480};
    private long zzA;
    private int zzB;
    private final Context zzc;
    private final zzaru zzd;
    private final zzasc zze;
    private final boolean zzf;
    private final long[] zzg;
    private zzajt[] zzh;
    private zzarr zzi;
    private Surface zzj;
    private Surface zzk;
    private boolean zzl;
    private long zzm;
    private long zzn;
    private int zzo;
    private int zzp;
    private int zzq;
    private float zzr;
    private int zzs;
    private int zzt;
    private int zzu;
    private float zzv;
    private int zzw;
    private int zzx;
    private int zzy;
    private float zzz;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzars(Context context, zzanp zzanpVar, long j, Handler handler, zzasd zzasdVar, int i) {
        super(2, zzanpVar, null, false);
        boolean z = false;
        this.zzc = context.getApplicationContext();
        this.zzd = new zzaru(context);
        this.zze = new zzasc(handler, zzasdVar);
        if (zzarj.zza <= 22 && "foster".equals(zzarj.zzb) && "NVIDIA".equals(zzarj.zzc)) {
            z = true;
        }
        this.zzf = z;
        this.zzg = new long[10];
        this.zzA = -9223372036854775807L;
        this.zzm = -9223372036854775807L;
        this.zzs = -1;
        this.zzt = -1;
        this.zzv = -1.0f;
        this.zzr = -1.0f;
        zzab();
    }

    private final boolean zzT(boolean z) {
        return zzarj.zza >= 23 && (!z || zzarp.zza(this.zzc));
    }

    private final void zzab() {
        this.zzw = -1;
        this.zzx = -1;
        this.zzz = -1.0f;
        this.zzy = -1;
    }

    private final void zzac() {
        int i = this.zzw;
        int i2 = this.zzs;
        if (i == i2 && this.zzx == this.zzt && this.zzy == this.zzu && this.zzz == this.zzv) {
            return;
        }
        this.zze.zze(i2, this.zzt, this.zzu, this.zzv);
        this.zzw = this.zzs;
        this.zzx = this.zzt;
        this.zzy = this.zzu;
        this.zzz = this.zzv;
    }

    private final void zzad() {
        if (this.zzw == -1 && this.zzx == -1) {
            return;
        }
        this.zze.zze(this.zzs, this.zzt, this.zzu, this.zzv);
    }

    private final void zzae() {
        if (this.zzo > 0) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            this.zze.zzd(this.zzo, elapsedRealtime - this.zzn);
            this.zzo = 0;
            this.zzn = elapsedRealtime;
        }
    }

    private static boolean zzaf(long j) {
        return j < -30000;
    }

    private static int zzag(zzajt zzajtVar) {
        int i = zzajtVar.zzg;
        return i != -1 ? i : zzah(zzajtVar.zzf, zzajtVar.zzj, zzajtVar.zzk);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private static int zzah(String str, int i, int i2) {
        char c;
        int i3;
        if (i == -1 || i2 == -1) {
            return -1;
        }
        int i4 = 4;
        switch (str.hashCode()) {
            case -1664118616:
                if (str.equals("video/3gpp")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case -1662541442:
                if (str.equals("video/hevc")) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case 1187890754:
                if (str.equals("video/mp4v-es")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case 1331836730:
                if (str.equals("video/avc")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case 1599127256:
                if (str.equals("video/x-vnd.on2.vp8")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case 1599127257:
                if (str.equals("video/x-vnd.on2.vp9")) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        if (c != 0 && c != 1) {
            if (c == 2) {
                if ("BRAVIA 4K 2015".equals(zzarj.zzd)) {
                    return -1;
                }
                i3 = zzarj.zze(i, 16) * zzarj.zze(i2, 16) * 256;
                i4 = 2;
                return (i3 * 3) / (i4 + i4);
            } else if (c != 3) {
                if (c == 4 || c == 5) {
                    i3 = i * i2;
                    return (i3 * 3) / (i4 + i4);
                }
                return -1;
            }
        }
        i3 = i * i2;
        i4 = 2;
        return (i3 * 3) / (i4 + i4);
    }

    private static boolean zzai(boolean z, zzajt zzajtVar, zzajt zzajtVar2) {
        if (zzajtVar.zzf.equals(zzajtVar2.zzf) && zzaj(zzajtVar) == zzaj(zzajtVar2)) {
            if (z) {
                return true;
            }
            if (zzajtVar.zzj == zzajtVar2.zzj && zzajtVar.zzk == zzajtVar2.zzk) {
                return true;
            }
        }
        return false;
    }

    private static int zzaj(zzajt zzajtVar) {
        int i = zzajtVar.zzm;
        if (i == -1) {
            return 0;
        }
        return i;
    }

    @Override // com.google.android.gms.internal.ads.zzann, com.google.android.gms.internal.ads.zzajy
    public final boolean zzE() {
        Surface surface;
        if (!super.zzE() || (!this.zzl && (((surface = this.zzk) == null || this.zzj != surface) && zzW() != null))) {
            if (this.zzm == -9223372036854775807L) {
                return false;
            }
            if (SystemClock.elapsedRealtime() < this.zzm) {
                return true;
            }
            this.zzm = -9223372036854775807L;
            return false;
        }
        this.zzm = -9223372036854775807L;
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x002b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x002c  */
    @Override // com.google.android.gms.internal.ads.zzann
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected final int zzH(com.google.android.gms.internal.ads.zzanp r8, com.google.android.gms.internal.ads.zzajt r9) throws com.google.android.gms.internal.ads.zzans {
        /*
            r7 = this;
            java.lang.String r8 = r9.zzf
            boolean r0 = com.google.android.gms.internal.ads.zzaqz.zzb(r8)
            r1 = 0
            if (r0 != 0) goto La
            return r1
        La:
            com.google.android.gms.internal.ads.zzalq r0 = r9.zzi
            r2 = 1
            if (r0 == 0) goto L24
            r3 = 0
            r4 = 0
        L11:
            int r5 = r0.zza
            if (r3 >= r5) goto L1f
            com.google.android.gms.internal.ads.zzalp r5 = r0.zza(r3)
            boolean r5 = r5.zzc
            r4 = r4 | r5
            int r3 = r3 + 1
            goto L11
        L1f:
            if (r2 == r4) goto L22
            goto L24
        L22:
            r0 = 1
            goto L25
        L24:
            r0 = 0
        L25:
            com.google.android.gms.internal.ads.zzanl r8 = com.google.android.gms.internal.ads.zzanw.zza(r8, r0)
            if (r8 != 0) goto L2c
            return r2
        L2c:
            java.lang.String r0 = r9.zzc
            boolean r0 = r8.zzd(r0)
            if (r0 == 0) goto L9a
            int r3 = r9.zzj
            if (r3 <= 0) goto L9a
            int r3 = r9.zzk
            if (r3 <= 0) goto L9a
            int r0 = com.google.android.gms.internal.ads.zzarj.zza
            r3 = 21
            if (r0 < r3) goto L4e
            int r0 = r9.zzj
            int r3 = r9.zzk
            float r9 = r9.zzl
            double r4 = (double) r9
            boolean r0 = r8.zze(r0, r3, r4)
            goto L9a
        L4e:
            int r0 = r9.zzj
            int r3 = r9.zzk
            int r0 = r0 * r3
            int r3 = com.google.android.gms.internal.ads.zzanw.zzc()
            if (r0 > r3) goto L5c
            r0 = 1
            goto L5d
        L5c:
            r0 = 0
        L5d:
            if (r0 != 0) goto L9a
            int r3 = r9.zzj
            int r9 = r9.zzk
            java.lang.String r4 = com.google.android.gms.internal.ads.zzarj.zze
            java.lang.String r5 = java.lang.String.valueOf(r4)
            int r5 = r5.length()
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            int r5 = r5 + 56
            r6.<init>(r5)
            java.lang.String r5 = "FalseCheck [legacyFrameSize, "
            r6.append(r5)
            r6.append(r3)
            java.lang.String r3 = "x"
            r6.append(r3)
            r6.append(r9)
            java.lang.String r9 = "] ["
            r6.append(r9)
            r6.append(r4)
            java.lang.String r9 = "]"
            r6.append(r9)
            java.lang.String r9 = r6.toString()
            java.lang.String r3 = "MediaCodecVideoRenderer"
            android.util.Log.d(r3, r9)
        L9a:
            boolean r9 = r8.zzb
            if (r2 == r9) goto La0
            r9 = 4
            goto La2
        La0:
            r9 = 8
        La2:
            boolean r8 = r8.zzc
            if (r2 == r8) goto La7
            goto La9
        La7:
            r1 = 16
        La9:
            if (r2 == r0) goto Lad
            r8 = 2
            goto Lae
        Lad:
            r8 = 3
        Lae:
            r9 = r9 | r1
            r8 = r8 | r9
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzars.zzH(com.google.android.gms.internal.ads.zzanp, com.google.android.gms.internal.ads.zzajt):int");
    }

    @Override // com.google.android.gms.internal.ads.zzann
    protected final void zzJ(zzanl zzanlVar, MediaCodec mediaCodec, zzajt zzajtVar, MediaCrypto mediaCrypto) throws zzans {
        zzarr zzarrVar;
        Point point;
        zzajt[] zzajtVarArr = this.zzh;
        int i = zzajtVar.zzj;
        int i2 = zzajtVar.zzk;
        int zzag = zzag(zzajtVar);
        if (zzajtVarArr.length != 1) {
            boolean z = false;
            for (zzajt zzajtVar2 : zzajtVarArr) {
                if (zzai(zzanlVar.zzb, zzajtVar, zzajtVar2)) {
                    int i3 = zzajtVar2.zzj;
                    z |= i3 == -1 || zzajtVar2.zzk == -1;
                    i = Math.max(i, i3);
                    i2 = Math.max(i2, zzajtVar2.zzk);
                    zzag = Math.max(zzag, zzag(zzajtVar2));
                }
            }
            if (z) {
                StringBuilder sb = new StringBuilder(66);
                sb.append("Resolutions unknown. Codec max resolution: ");
                sb.append(i);
                sb.append("x");
                sb.append(i2);
                Log.w("MediaCodecVideoRenderer", sb.toString());
                int i4 = zzajtVar.zzk;
                int i5 = zzajtVar.zzj;
                int i6 = i4 > i5 ? i4 : i5;
                int i7 = i4 <= i5 ? i4 : i5;
                float f = i7 / i6;
                int[] iArr = zzb;
                int length = iArr.length;
                int i8 = 0;
                while (i8 < 9) {
                    int i9 = iArr[i8];
                    int[] iArr2 = iArr;
                    int i10 = (int) (i9 * f);
                    if (i9 <= i6 || i10 <= i7) {
                        break;
                    }
                    int i11 = i6;
                    int i12 = i7;
                    if (zzarj.zza >= 21) {
                        int i13 = i4 <= i5 ? i9 : i10;
                        if (i4 <= i5) {
                            i9 = i10;
                        }
                        Point zzf = zzanlVar.zzf(i13, i9);
                        if (zzanlVar.zze(zzf.x, zzf.y, zzajtVar.zzl)) {
                            point = zzf;
                            break;
                        }
                        i8++;
                        iArr = iArr2;
                        i6 = i11;
                        i7 = i12;
                    } else {
                        int zze = zzarj.zze(i9, 16) * 16;
                        int zze2 = zzarj.zze(i10, 16) * 16;
                        if (zze * zze2 <= zzanw.zzc()) {
                            int i14 = i4 <= i5 ? zze : zze2;
                            if (i4 <= i5) {
                                zze = zze2;
                            }
                            point = new Point(i14, zze);
                        } else {
                            i8++;
                            iArr = iArr2;
                            i6 = i11;
                            i7 = i12;
                        }
                    }
                }
                point = null;
                if (point != null) {
                    i = Math.max(i, point.x);
                    i2 = Math.max(i2, point.y);
                    zzag = Math.max(zzag, zzah(zzajtVar.zzf, i, i2));
                    StringBuilder sb2 = new StringBuilder(57);
                    sb2.append("Codec max resolution adjusted to: ");
                    sb2.append(i);
                    sb2.append("x");
                    sb2.append(i2);
                    Log.w("MediaCodecVideoRenderer", sb2.toString());
                }
            }
            zzarrVar = new zzarr(i, i2, zzag);
        } else {
            zzarrVar = new zzarr(i, i2, zzag);
        }
        this.zzi = zzarrVar;
        boolean z2 = this.zzf;
        MediaFormat zzl = zzajtVar.zzl();
        zzl.setInteger("max-width", zzarrVar.zza);
        zzl.setInteger("max-height", zzarrVar.zzb);
        int i15 = zzarrVar.zzc;
        if (i15 != -1) {
            zzl.setInteger("max-input-size", i15);
        }
        if (z2) {
            zzl.setInteger("auto-frc", 0);
        }
        if (this.zzj == null) {
            zzaqu.zzd(zzT(zzanlVar.zzd));
            if (this.zzk == null) {
                this.zzk = zzarp.zzb(this.zzc, zzanlVar.zzd);
            }
            this.zzj = this.zzk;
        }
        mediaCodec.configure(zzl, this.zzj, (MediaCrypto) null, 0);
        int i16 = zzarj.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzann
    protected final void zzK(String str, long j, long j2) {
        this.zze.zzb(str, j, j2);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzann
    public final void zzL(zzajt zzajtVar) throws zzajf {
        super.zzL(zzajtVar);
        this.zze.zzc(zzajtVar);
        float f = zzajtVar.zzn;
        if (f == -1.0f) {
            f = 1.0f;
        }
        this.zzr = f;
        this.zzq = zzaj(zzajtVar);
    }

    @Override // com.google.android.gms.internal.ads.zzann
    protected final void zzM(MediaCodec mediaCodec, MediaFormat mediaFormat) {
        int integer;
        int integer2;
        boolean z = false;
        if (mediaFormat.containsKey("crop-right") && mediaFormat.containsKey("crop-left") && mediaFormat.containsKey("crop-bottom") && mediaFormat.containsKey("crop-top")) {
            z = true;
        }
        if (z) {
            integer = (mediaFormat.getInteger("crop-right") - mediaFormat.getInteger("crop-left")) + 1;
        } else {
            integer = mediaFormat.getInteger("width");
        }
        this.zzs = integer;
        if (z) {
            integer2 = (mediaFormat.getInteger("crop-bottom") - mediaFormat.getInteger("crop-top")) + 1;
        } else {
            integer2 = mediaFormat.getInteger("height");
        }
        this.zzt = integer2;
        this.zzv = this.zzr;
        if (zzarj.zza >= 21) {
            int i = this.zzq;
            if (i == 90 || i == 270) {
                int i2 = this.zzs;
                this.zzs = this.zzt;
                this.zzt = i2;
                this.zzv = 1.0f / this.zzv;
            }
        } else {
            this.zzu = this.zzq;
        }
        mediaCodec.setVideoScalingMode(1);
    }

    protected final void zzN(MediaCodec mediaCodec, int i, long j) {
        zzarh.zza("skipVideoBuffer");
        mediaCodec.releaseOutputBuffer(i, false);
        zzarh.zzb();
        this.zza.zze++;
    }

    protected final void zzO(MediaCodec mediaCodec, int i, long j) {
        zzac();
        zzarh.zza("releaseOutputBuffer");
        mediaCodec.releaseOutputBuffer(i, true);
        zzarh.zzb();
        this.zza.zzd++;
        this.zzp = 0;
        zzS();
    }

    protected final void zzP(MediaCodec mediaCodec, int i, long j, long j2) {
        zzac();
        zzarh.zza("releaseOutputBuffer");
        mediaCodec.releaseOutputBuffer(i, j2);
        zzarh.zzb();
        this.zza.zzd++;
        this.zzp = 0;
        zzS();
    }

    @Override // com.google.android.gms.internal.ads.zzann
    protected final boolean zzQ(long j, long j2, MediaCodec mediaCodec, ByteBuffer byteBuffer, int i, int i2, long j3, boolean z) {
        while (true) {
            int i3 = this.zzB;
            if (i3 == 0) {
                break;
            }
            long[] jArr = this.zzg;
            long j4 = jArr[0];
            if (j3 < j4) {
                break;
            }
            this.zzA = j4;
            int i4 = i3 - 1;
            this.zzB = i4;
            System.arraycopy(jArr, 1, jArr, 0, i4);
        }
        long j5 = j3 - this.zzA;
        if (z) {
            zzN(mediaCodec, i, j5);
            return true;
        }
        long j6 = j3 - j;
        if (this.zzj == this.zzk) {
            if (zzaf(j6)) {
                zzN(mediaCodec, i, j5);
                return true;
            }
            return false;
        } else if (!this.zzl) {
            if (zzarj.zza >= 21) {
                zzP(mediaCodec, i, j5, System.nanoTime());
            } else {
                zzO(mediaCodec, i, j5);
            }
            return true;
        } else if (zze() != 2) {
            return false;
        } else {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            long nanoTime = System.nanoTime();
            long zzc = this.zzd.zzc(j3, ((j6 - ((elapsedRealtime * 1000) - j2)) * 1000) + nanoTime);
            long j7 = (zzc - nanoTime) / 1000;
            if (zzaf(j7)) {
                zzarh.zza("dropVideoBuffer");
                mediaCodec.releaseOutputBuffer(i, false);
                zzarh.zzb();
                zzall zzallVar = this.zza;
                zzallVar.zzf++;
                this.zzo++;
                int i5 = this.zzp + 1;
                this.zzp = i5;
                zzallVar.zzg = Math.max(i5, zzallVar.zzg);
                if (this.zzo == -1) {
                    zzae();
                }
                return true;
            }
            if (zzarj.zza >= 21) {
                if (j7 < 50000) {
                    zzP(mediaCodec, i, j5, zzc);
                    return true;
                }
            } else if (j7 < WorkRequest.DEFAULT_BACKOFF_DELAY_MILLIS) {
                if (j7 > 11000) {
                    try {
                        Thread.sleep((j7 - 10000) / 1000);
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                    }
                }
                zzO(mediaCodec, i, j5);
                return true;
            }
            return false;
        }
    }

    final void zzS() {
        if (this.zzl) {
            return;
        }
        this.zzl = true;
        this.zze.zzf(this.zzj);
    }

    @Override // com.google.android.gms.internal.ads.zzann
    protected final boolean zzV(zzanl zzanlVar) {
        return this.zzj != null || zzT(zzanlVar.zzd);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzann
    public final void zzY() {
        try {
            super.zzY();
        } finally {
            Surface surface = this.zzk;
            if (surface != null) {
                if (this.zzj == surface) {
                    this.zzj = null;
                }
                surface.release();
                this.zzk = null;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzann
    protected final void zzZ(zzalm zzalmVar) {
        int i = zzarj.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzann
    protected final boolean zzaa(MediaCodec mediaCodec, boolean z, zzajt zzajtVar, zzajt zzajtVar2) {
        if (zzai(z, zzajtVar, zzajtVar2)) {
            int i = zzajtVar2.zzj;
            zzarr zzarrVar = this.zzi;
            return i <= zzarrVar.zza && zzajtVar2.zzk <= zzarrVar.zzb && zzajtVar2.zzg <= zzarrVar.zzc;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzajd, com.google.android.gms.internal.ads.zzajh
    public final void zzr(int i, Object obj) throws zzajf {
        if (i == 1) {
            Surface surface = (Surface) obj;
            if (surface == null) {
                Surface surface2 = this.zzk;
                if (surface2 != null) {
                    surface = surface2;
                } else {
                    zzanl zzX = zzX();
                    if (zzX != null && zzT(zzX.zzd)) {
                        surface = zzarp.zzb(this.zzc, zzX.zzd);
                        this.zzk = surface;
                    }
                }
            }
            if (this.zzj == surface) {
                if (surface == null || surface == this.zzk) {
                    return;
                }
                zzad();
                if (this.zzl) {
                    this.zze.zzf(this.zzj);
                    return;
                }
                return;
            }
            this.zzj = surface;
            int zze = zze();
            if (zze == 1 || zze == 2) {
                MediaCodec zzW = zzW();
                if (zzarj.zza < 23 || zzW == null || surface == null) {
                    zzY();
                    zzU();
                } else {
                    zzW.setOutputSurface(surface);
                }
            }
            if (surface == null || surface == this.zzk) {
                zzab();
                this.zzl = false;
                int i2 = zzarj.zza;
                return;
            }
            zzad();
            this.zzl = false;
            int i3 = zzarj.zza;
            if (zze == 2) {
                this.zzm = -9223372036854775807L;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzann, com.google.android.gms.internal.ads.zzajd
    public final void zzs(boolean z) throws zzajf {
        super.zzs(z);
        int i = zzy().zzb;
        this.zze.zza(this.zza);
        this.zzd.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzajd
    protected final void zzt(zzajt[] zzajtVarArr, long j) throws zzajf {
        this.zzh = zzajtVarArr;
        if (this.zzA == -9223372036854775807L) {
            this.zzA = j;
            return;
        }
        int i = this.zzB;
        if (i == 10) {
            long j2 = this.zzg[9];
            StringBuilder sb = new StringBuilder(65);
            sb.append("Too many stream changes, so dropping offset: ");
            sb.append(j2);
            Log.w("MediaCodecVideoRenderer", sb.toString());
        } else {
            this.zzB = i + 1;
        }
        this.zzg[this.zzB - 1] = j;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzann, com.google.android.gms.internal.ads.zzajd
    public final void zzu(long j, boolean z) throws zzajf {
        super.zzu(j, z);
        this.zzl = false;
        int i = zzarj.zza;
        this.zzp = 0;
        int i2 = this.zzB;
        if (i2 != 0) {
            this.zzA = this.zzg[i2 - 1];
            this.zzB = 0;
        }
        this.zzm = -9223372036854775807L;
    }

    @Override // com.google.android.gms.internal.ads.zzajd
    protected final void zzv() {
        this.zzo = 0;
        this.zzn = SystemClock.elapsedRealtime();
        this.zzm = -9223372036854775807L;
    }

    @Override // com.google.android.gms.internal.ads.zzajd
    protected final void zzw() {
        zzae();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzann, com.google.android.gms.internal.ads.zzajd
    public final void zzx() {
        this.zzs = -1;
        this.zzt = -1;
        this.zzv = -1.0f;
        this.zzr = -1.0f;
        this.zzA = -9223372036854775807L;
        this.zzB = 0;
        zzab();
        this.zzl = false;
        int i = zzarj.zza;
        this.zzd.zzb();
        try {
            super.zzx();
        } finally {
            this.zza.zza();
            this.zze.zzg(this.zza);
        }
    }
}
