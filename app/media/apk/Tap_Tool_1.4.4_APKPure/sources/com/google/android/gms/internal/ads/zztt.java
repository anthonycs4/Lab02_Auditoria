package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
final class zztt implements zztz {
    private final zzqe zza;
    private final zzqd zzb;
    private long zzc = -1;
    private long zzd = -1;

    public zztt(zzqe zzqeVar, zzqd zzqdVar) {
        this.zza = zzqeVar;
        this.zzb = zzqdVar;
    }

    @Override // com.google.android.gms.internal.ads.zztz
    public final long zza(zzps zzpsVar) {
        long j = this.zzd;
        if (j >= 0) {
            this.zzd = -1L;
            return -(j + 2);
        }
        return -1L;
    }

    @Override // com.google.android.gms.internal.ads.zztz
    public final void zzb(long j) {
        long[] jArr = this.zzb.zza;
        this.zzd = jArr[zzaht.zzE(jArr, j, true, true)];
    }

    @Override // com.google.android.gms.internal.ads.zztz
    public final zzqm zzc() {
        zzafs.zzd(this.zzc != -1);
        return new zzqc(this.zza, this.zzc);
    }

    public final void zzd(long j) {
        this.zzc = j;
    }
}
