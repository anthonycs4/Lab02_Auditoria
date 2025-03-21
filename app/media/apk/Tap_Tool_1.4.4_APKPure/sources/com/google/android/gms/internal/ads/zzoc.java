package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ShortBuffer;
import java.util.Objects;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzoc implements zzmh {
    private int zzb;
    private float zzc = 1.0f;
    private float zzd = 1.0f;
    private zzmf zze = zzmf.zza;
    private zzmf zzf = zzmf.zza;
    private zzmf zzg = zzmf.zza;
    private zzmf zzh = zzmf.zza;
    private boolean zzi;
    private zzob zzj;
    private ByteBuffer zzk;
    private ShortBuffer zzl;
    private ByteBuffer zzm;
    private long zzn;
    private long zzo;
    private boolean zzp;

    public zzoc() {
        ByteBuffer byteBuffer = zza;
        this.zzk = byteBuffer;
        this.zzl = byteBuffer.asShortBuffer();
        this.zzm = zza;
        this.zzb = -1;
    }

    @Override // com.google.android.gms.internal.ads.zzmh
    public final zzmf zza(zzmf zzmfVar) throws zzmg {
        if (zzmfVar.zzd == 2) {
            int i = this.zzb;
            if (i == -1) {
                i = zzmfVar.zzb;
            }
            this.zze = zzmfVar;
            zzmf zzmfVar2 = new zzmf(i, zzmfVar.zzc, 2);
            this.zzf = zzmfVar2;
            this.zzi = true;
            return zzmfVar2;
        }
        throw new zzmg(zzmfVar);
    }

    @Override // com.google.android.gms.internal.ads.zzmh
    public final boolean zzb() {
        if (this.zzf.zzb != -1) {
            return Math.abs(this.zzc + (-1.0f)) >= 1.0E-4f || Math.abs(this.zzd + (-1.0f)) >= 1.0E-4f || this.zzf.zzb != this.zze.zzb;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzmh
    public final void zzc(ByteBuffer byteBuffer) {
        if (byteBuffer.hasRemaining()) {
            zzob zzobVar = this.zzj;
            Objects.requireNonNull(zzobVar);
            ShortBuffer asShortBuffer = byteBuffer.asShortBuffer();
            int remaining = byteBuffer.remaining();
            this.zzn += remaining;
            zzobVar.zzb(asShortBuffer);
            byteBuffer.position(byteBuffer.position() + remaining);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzmh
    public final void zzd() {
        zzob zzobVar = this.zzj;
        if (zzobVar != null) {
            zzobVar.zzd();
        }
        this.zzp = true;
    }

    @Override // com.google.android.gms.internal.ads.zzmh
    public final ByteBuffer zze() {
        int zzf;
        zzob zzobVar = this.zzj;
        if (zzobVar != null && (zzf = zzobVar.zzf()) > 0) {
            if (this.zzk.capacity() < zzf) {
                ByteBuffer order = ByteBuffer.allocateDirect(zzf).order(ByteOrder.nativeOrder());
                this.zzk = order;
                this.zzl = order.asShortBuffer();
            } else {
                this.zzk.clear();
                this.zzl.clear();
            }
            zzobVar.zzc(this.zzl);
            this.zzo += zzf;
            this.zzk.limit(zzf);
            this.zzm = this.zzk;
        }
        ByteBuffer byteBuffer = this.zzm;
        this.zzm = zza;
        return byteBuffer;
    }

    @Override // com.google.android.gms.internal.ads.zzmh
    public final boolean zzf() {
        zzob zzobVar;
        return this.zzp && ((zzobVar = this.zzj) == null || zzobVar.zzf() == 0);
    }

    @Override // com.google.android.gms.internal.ads.zzmh
    public final void zzg() {
        if (zzb()) {
            zzmf zzmfVar = this.zze;
            this.zzg = zzmfVar;
            this.zzh = this.zzf;
            if (this.zzi) {
                this.zzj = new zzob(zzmfVar.zzb, zzmfVar.zzc, this.zzc, this.zzd, this.zzh.zzb);
            } else {
                zzob zzobVar = this.zzj;
                if (zzobVar != null) {
                    zzobVar.zze();
                }
            }
        }
        this.zzm = zza;
        this.zzn = 0L;
        this.zzo = 0L;
        this.zzp = false;
    }

    @Override // com.google.android.gms.internal.ads.zzmh
    public final void zzh() {
        this.zzc = 1.0f;
        this.zzd = 1.0f;
        this.zze = zzmf.zza;
        this.zzf = zzmf.zza;
        this.zzg = zzmf.zza;
        this.zzh = zzmf.zza;
        ByteBuffer byteBuffer = zza;
        this.zzk = byteBuffer;
        this.zzl = byteBuffer.asShortBuffer();
        this.zzm = zza;
        this.zzb = -1;
        this.zzi = false;
        this.zzj = null;
        this.zzn = 0L;
        this.zzo = 0L;
        this.zzp = false;
    }

    public final void zzi(float f) {
        if (this.zzc != f) {
            this.zzc = f;
            this.zzi = true;
        }
    }

    public final void zzj(float f) {
        if (this.zzd != f) {
            this.zzd = f;
            this.zzi = true;
        }
    }

    public final long zzk(long j) {
        if (this.zzo >= 1024) {
            long j2 = this.zzn;
            zzob zzobVar = this.zzj;
            Objects.requireNonNull(zzobVar);
            long zza = j2 - zzobVar.zza();
            int i = this.zzh.zzb;
            int i2 = this.zzg.zzb;
            if (i == i2) {
                return zzaht.zzG(j, zza, this.zzo);
            }
            return zzaht.zzG(j, zza * i, this.zzo * i2);
        }
        return (long) (this.zzc * j);
    }
}
