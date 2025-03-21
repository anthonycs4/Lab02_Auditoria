package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzrq implements zzpu {
    private final long zzb;
    private final zzpu zzc;

    public zzrq(long j, zzpu zzpuVar) {
        this.zzb = j;
        this.zzc = zzpuVar;
    }

    @Override // com.google.android.gms.internal.ads.zzpu
    public final zzqq zzbi(int i, int i2) {
        return this.zzc.zzbi(i, i2);
    }

    @Override // com.google.android.gms.internal.ads.zzpu
    public final void zzbj() {
        this.zzc.zzbj();
    }

    @Override // com.google.android.gms.internal.ads.zzpu
    public final void zzbk(zzqm zzqmVar) {
        this.zzc.zzbk(new zzrp(this, zzqmVar));
    }
}
