package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public abstract class zznf implements zzmh {
    private boolean zzh;
    private ByteBuffer zzf = zza;
    private ByteBuffer zzg = zza;
    private zzmf zzd = zzmf.zza;
    private zzmf zze = zzmf.zza;
    protected zzmf zzb = zzmf.zza;
    protected zzmf zzc = zzmf.zza;

    @Override // com.google.android.gms.internal.ads.zzmh
    public final zzmf zza(zzmf zzmfVar) throws zzmg {
        this.zzd = zzmfVar;
        this.zze = zzk(zzmfVar);
        return zzb() ? this.zze : zzmf.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzmh
    public boolean zzb() {
        return this.zze != zzmf.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzmh
    public final void zzd() {
        this.zzh = true;
        zzl();
    }

    @Override // com.google.android.gms.internal.ads.zzmh
    public ByteBuffer zze() {
        ByteBuffer byteBuffer = this.zzg;
        this.zzg = zza;
        return byteBuffer;
    }

    @Override // com.google.android.gms.internal.ads.zzmh
    public boolean zzf() {
        return this.zzh && this.zzg == zza;
    }

    @Override // com.google.android.gms.internal.ads.zzmh
    public final void zzg() {
        this.zzg = zza;
        this.zzh = false;
        this.zzb = this.zzd;
        this.zzc = this.zze;
        zzm();
    }

    @Override // com.google.android.gms.internal.ads.zzmh
    public final void zzh() {
        zzg();
        this.zzf = zza;
        this.zzd = zzmf.zza;
        this.zze = zzmf.zza;
        this.zzb = zzmf.zza;
        this.zzc = zzmf.zza;
        zzn();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final ByteBuffer zzi(int i) {
        if (this.zzf.capacity() < i) {
            this.zzf = ByteBuffer.allocateDirect(i).order(ByteOrder.nativeOrder());
        } else {
            this.zzf.clear();
        }
        ByteBuffer byteBuffer = this.zzf;
        this.zzg = byteBuffer;
        return byteBuffer;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final boolean zzj() {
        return this.zzg.hasRemaining();
    }

    protected zzmf zzk(zzmf zzmfVar) throws zzmg {
        throw null;
    }

    protected void zzl() {
    }

    protected void zzm() {
    }

    protected void zzn() {
    }
}
