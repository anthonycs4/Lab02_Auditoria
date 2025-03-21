package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzod extends zznf {
    private int zzd;
    private int zze;
    private boolean zzf;
    private int zzg;
    private byte[] zzh = zzaht.zzf;
    private int zzi;
    private long zzj;

    @Override // com.google.android.gms.internal.ads.zzmh
    public final void zzc(ByteBuffer byteBuffer) {
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        int i = limit - position;
        if (i == 0) {
            return;
        }
        int min = Math.min(i, this.zzg);
        this.zzj += min / this.zzb.zze;
        this.zzg -= min;
        byteBuffer.position(position + min);
        if (this.zzg > 0) {
            return;
        }
        int i2 = i - min;
        int length = (this.zzi + i2) - this.zzh.length;
        ByteBuffer zzi = zzi(length);
        int zzy = zzaht.zzy(length, 0, this.zzi);
        zzi.put(this.zzh, 0, zzy);
        int zzy2 = zzaht.zzy(length - zzy, 0, i2);
        byteBuffer.limit(byteBuffer.position() + zzy2);
        zzi.put(byteBuffer);
        byteBuffer.limit(limit);
        int i3 = i2 - zzy2;
        int i4 = this.zzi - zzy;
        this.zzi = i4;
        byte[] bArr = this.zzh;
        System.arraycopy(bArr, zzy, bArr, 0, i4);
        byteBuffer.get(this.zzh, this.zzi, i3);
        this.zzi += i3;
        zzi.flip();
    }

    @Override // com.google.android.gms.internal.ads.zznf, com.google.android.gms.internal.ads.zzmh
    public final ByteBuffer zze() {
        int i;
        if (super.zzf() && (i = this.zzi) > 0) {
            zzi(i).put(this.zzh, 0, this.zzi).flip();
            this.zzi = 0;
        }
        return super.zze();
    }

    @Override // com.google.android.gms.internal.ads.zznf, com.google.android.gms.internal.ads.zzmh
    public final boolean zzf() {
        return super.zzf() && this.zzi == 0;
    }

    @Override // com.google.android.gms.internal.ads.zznf
    public final zzmf zzk(zzmf zzmfVar) throws zzmg {
        if (zzmfVar.zzd == 2) {
            this.zzf = true;
            return (this.zzd == 0 && this.zze == 0) ? zzmf.zza : zzmfVar;
        }
        throw new zzmg(zzmfVar);
    }

    @Override // com.google.android.gms.internal.ads.zznf
    protected final void zzl() {
        int i;
        if (this.zzf) {
            if (this.zzi > 0) {
                this.zzj += i / this.zzb.zze;
            }
            this.zzi = 0;
        }
    }

    @Override // com.google.android.gms.internal.ads.zznf
    protected final void zzm() {
        if (this.zzf) {
            this.zzf = false;
            int i = this.zze;
            int i2 = this.zzb.zze;
            this.zzh = new byte[i * i2];
            this.zzg = this.zzd * i2;
        }
        this.zzi = 0;
    }

    @Override // com.google.android.gms.internal.ads.zznf
    protected final void zzn() {
        this.zzh = zzaht.zzf;
    }

    public final void zzo(int i, int i2) {
        this.zzd = i;
        this.zze = i2;
    }

    public final void zzp() {
        this.zzj = 0L;
    }

    public final long zzq() {
        return this.zzj;
    }
}
