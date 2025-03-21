package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ShortBuffer;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzalg implements zzaki {
    private zzalf zzd;
    private ByteBuffer zzg;
    private ShortBuffer zzh;
    private ByteBuffer zzi;
    private long zzj;
    private long zzk;
    private boolean zzl;
    private float zze = 1.0f;
    private float zzf = 1.0f;
    private int zzb = -1;
    private int zzc = -1;

    public zzalg() {
        ByteBuffer byteBuffer = zza;
        this.zzg = byteBuffer;
        this.zzh = byteBuffer.asShortBuffer();
        this.zzi = zza;
    }

    @Override // com.google.android.gms.internal.ads.zzaki
    public final boolean zza(int i, int i2, int i3) throws zzakh {
        if (i3 == 2) {
            if (this.zzc == i && this.zzb == i2) {
                return false;
            }
            this.zzc = i;
            this.zzb = i2;
            return true;
        }
        throw new zzakh(i, i2, i3);
    }

    @Override // com.google.android.gms.internal.ads.zzaki
    public final boolean zzb() {
        return Math.abs(this.zze + (-1.0f)) >= 0.01f || Math.abs(this.zzf + (-1.0f)) >= 0.01f;
    }

    @Override // com.google.android.gms.internal.ads.zzaki
    public final int zzc() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzaki
    public final int zzd() {
        return 2;
    }

    @Override // com.google.android.gms.internal.ads.zzaki
    public final void zze(ByteBuffer byteBuffer) {
        if (byteBuffer.hasRemaining()) {
            ShortBuffer asShortBuffer = byteBuffer.asShortBuffer();
            int remaining = byteBuffer.remaining();
            this.zzj += remaining;
            this.zzd.zzc(asShortBuffer);
            byteBuffer.position(byteBuffer.position() + remaining);
        }
        int zzf = this.zzd.zzf() * this.zzb;
        int i = zzf + zzf;
        if (i > 0) {
            if (this.zzg.capacity() < i) {
                ByteBuffer order = ByteBuffer.allocateDirect(i).order(ByteOrder.nativeOrder());
                this.zzg = order;
                this.zzh = order.asShortBuffer();
            } else {
                this.zzg.clear();
                this.zzh.clear();
            }
            this.zzd.zzd(this.zzh);
            this.zzk += i;
            this.zzg.limit(i);
            this.zzi = this.zzg;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaki
    public final void zzf() {
        this.zzd.zze();
        this.zzl = true;
    }

    @Override // com.google.android.gms.internal.ads.zzaki
    public final ByteBuffer zzg() {
        ByteBuffer byteBuffer = this.zzi;
        this.zzi = zza;
        return byteBuffer;
    }

    @Override // com.google.android.gms.internal.ads.zzaki
    public final boolean zzh() {
        zzalf zzalfVar;
        return this.zzl && ((zzalfVar = this.zzd) == null || zzalfVar.zzf() == 0);
    }

    @Override // com.google.android.gms.internal.ads.zzaki
    public final void zzi() {
        zzalf zzalfVar = new zzalf(this.zzc, this.zzb);
        this.zzd = zzalfVar;
        zzalfVar.zza(this.zze);
        this.zzd.zzb(this.zzf);
        this.zzi = zza;
        this.zzj = 0L;
        this.zzk = 0L;
        this.zzl = false;
    }

    @Override // com.google.android.gms.internal.ads.zzaki
    public final void zzj() {
        this.zzd = null;
        ByteBuffer byteBuffer = zza;
        this.zzg = byteBuffer;
        this.zzh = byteBuffer.asShortBuffer();
        this.zzi = zza;
        this.zzb = -1;
        this.zzc = -1;
        this.zzj = 0L;
        this.zzk = 0L;
        this.zzl = false;
    }

    public final float zzk(float f) {
        float zzg = zzarj.zzg(f, 0.1f, 8.0f);
        this.zze = zzg;
        return zzg;
    }

    public final float zzl(float f) {
        this.zzf = zzarj.zzg(1.0f, 0.1f, 8.0f);
        return 1.0f;
    }

    public final long zzm() {
        return this.zzj;
    }

    public final long zzn() {
        return this.zzk;
    }
}
