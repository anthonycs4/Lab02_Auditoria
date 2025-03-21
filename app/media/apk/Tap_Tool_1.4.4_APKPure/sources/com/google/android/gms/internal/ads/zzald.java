package com.google.android.gms.internal.ads;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Handler;
import android.view.Surface;
import java.nio.ByteBuffer;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzald extends zzann implements zzaqy {
    private final zzakp zzb;
    private final zzakz zzc;
    private boolean zzd;
    private int zze;
    private int zzf;
    private long zzg;
    private boolean zzh;

    public zzald(zzanp zzanpVar, zzalr zzalrVar, boolean z, Handler handler, zzakq zzakqVar) {
        super(1, zzanpVar, null, true);
        this.zzc = new zzakz(null, new zzaki[0], new zzalc(this, null));
        this.zzb = new zzakp(handler, zzakqVar);
    }

    public static /* synthetic */ zzakp zzS(zzald zzaldVar) {
        return zzaldVar.zzb;
    }

    public static /* synthetic */ boolean zzT(zzald zzaldVar, boolean z) {
        zzaldVar.zzh = true;
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzann, com.google.android.gms.internal.ads.zzajy
    public final boolean zzE() {
        return this.zzc.zzh() || super.zzE();
    }

    @Override // com.google.android.gms.internal.ads.zzann, com.google.android.gms.internal.ads.zzajy
    public final boolean zzF() {
        return super.zzF() && this.zzc.zzg();
    }

    @Override // com.google.android.gms.internal.ads.zzann
    protected final int zzH(zzanp zzanpVar, zzajt zzajtVar) throws zzans {
        int i;
        int i2;
        String str = zzajtVar.zzf;
        if (zzaqz.zza(str)) {
            int i3 = zzarj.zza >= 21 ? 16 : 0;
            zzanl zza = zzanw.zza(str, false);
            if (zza == null) {
                return 1;
            }
            int i4 = 2;
            if (zzarj.zza < 21 || (((i = zzajtVar.zzs) == -1 || zza.zzg(i)) && ((i2 = zzajtVar.zzr) == -1 || zza.zzh(i2)))) {
                i4 = 3;
            }
            return i3 | 4 | i4;
        }
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzann
    public final zzanl zzI(zzanp zzanpVar, zzajt zzajtVar, boolean z) throws zzans {
        return super.zzI(zzanpVar, zzajtVar, false);
    }

    @Override // com.google.android.gms.internal.ads.zzann
    protected final void zzJ(zzanl zzanlVar, MediaCodec mediaCodec, zzajt zzajtVar, MediaCrypto mediaCrypto) {
        String str = zzanlVar.zza;
        boolean z = true;
        if (zzarj.zza >= 24 || !"OMX.SEC.aac.dec".equals(str) || !"samsung".equals(zzarj.zzc) || (!zzarj.zzb.startsWith("zeroflte") && !zzarj.zzb.startsWith("herolte") && !zzarj.zzb.startsWith("heroqlte"))) {
            z = false;
        }
        this.zzd = z;
        mediaCodec.configure(zzajtVar.zzl(), (Surface) null, (MediaCrypto) null, 0);
    }

    @Override // com.google.android.gms.internal.ads.zzann
    protected final void zzK(String str, long j, long j2) {
        this.zzb.zzb(str, j, j2);
    }

    @Override // com.google.android.gms.internal.ads.zzann
    public final void zzL(zzajt zzajtVar) throws zzajf {
        super.zzL(zzajtVar);
        this.zzb.zzc(zzajtVar);
        this.zze = "audio/raw".equals(zzajtVar.zzf) ? zzajtVar.zzt : 2;
        this.zzf = zzajtVar.zzr;
    }

    @Override // com.google.android.gms.internal.ads.zzann
    protected final void zzM(MediaCodec mediaCodec, MediaFormat mediaFormat) throws zzajf {
        int i;
        int[] iArr;
        int integer = mediaFormat.getInteger("channel-count");
        int integer2 = mediaFormat.getInteger("sample-rate");
        if (this.zzd && integer == 6) {
            int i2 = this.zzf;
            if (i2 < 6) {
                int[] iArr2 = new int[i2];
                for (int i3 = 0; i3 < this.zzf; i3++) {
                    iArr2[i3] = i3;
                }
                iArr = iArr2;
            } else {
                iArr = null;
            }
            i = 6;
        } else {
            i = integer;
            iArr = null;
        }
        try {
            this.zzc.zzb("audio/raw", i, integer2, this.zze, 0, iArr);
        } catch (zzaku e) {
            throw zzajf.zza(e, zzz());
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaqy
    public final long zzN() {
        long zza = this.zzc.zza(zzF());
        if (zza != Long.MIN_VALUE) {
            if (!this.zzh) {
                zza = Math.max(this.zzg, zza);
            }
            this.zzg = zza;
            this.zzh = false;
        }
        return this.zzg;
    }

    @Override // com.google.android.gms.internal.ads.zzaqy
    public final zzajx zzO(zzajx zzajxVar) {
        return this.zzc.zzi(zzajxVar);
    }

    @Override // com.google.android.gms.internal.ads.zzaqy
    public final zzajx zzP() {
        return this.zzc.zzj();
    }

    @Override // com.google.android.gms.internal.ads.zzann
    protected final boolean zzQ(long j, long j2, MediaCodec mediaCodec, ByteBuffer byteBuffer, int i, int i2, long j3, boolean z) throws zzajf {
        if (z) {
            mediaCodec.releaseOutputBuffer(i, false);
            this.zza.zze++;
            this.zzc.zzd();
            return true;
        }
        try {
            if (this.zzc.zze(byteBuffer, j3)) {
                mediaCodec.releaseOutputBuffer(i, false);
                this.zza.zzd++;
                return true;
            }
            return false;
        } catch (zzakv | zzaky e) {
            throw zzajf.zza(e, zzz());
        }
    }

    @Override // com.google.android.gms.internal.ads.zzajd, com.google.android.gms.internal.ads.zzajy
    public final zzaqy zzd() {
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzajd, com.google.android.gms.internal.ads.zzajh
    public final void zzr(int i, Object obj) throws zzajf {
        if (i != 2) {
            return;
        }
        this.zzc.zzk(((Float) obj).floatValue());
    }

    @Override // com.google.android.gms.internal.ads.zzann, com.google.android.gms.internal.ads.zzajd
    public final void zzs(boolean z) throws zzajf {
        super.zzs(z);
        this.zzb.zza(this.zza);
        int i = zzy().zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzann, com.google.android.gms.internal.ads.zzajd
    public final void zzu(long j, boolean z) throws zzajf {
        super.zzu(j, z);
        this.zzc.zzm();
        this.zzg = j;
        this.zzh = true;
    }

    @Override // com.google.android.gms.internal.ads.zzajd
    protected final void zzv() {
        this.zzc.zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzajd
    protected final void zzw() {
        this.zzc.zzl();
    }

    @Override // com.google.android.gms.internal.ads.zzann, com.google.android.gms.internal.ads.zzajd
    public final void zzx() {
        try {
            this.zzc.zzn();
            try {
                super.zzx();
            } finally {
            }
        } catch (Throwable th) {
            try {
                super.zzx();
                throw th;
            } finally {
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzann
    protected final void zzR() throws zzajf {
        try {
            this.zzc.zzf();
        } catch (zzaky e) {
            throw zzajf.zza(e, zzz());
        }
    }
}
