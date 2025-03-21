package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzqc implements zzqm {
    private final zzqe zza;
    private final long zzb;

    public zzqc(zzqe zzqeVar, long j) {
        this.zza = zzqeVar;
        this.zzb = j;
    }

    private final zzqn zzd(long j, long j2) {
        return new zzqn((j * 1000000) / this.zza.zze, this.zzb + j2);
    }

    @Override // com.google.android.gms.internal.ads.zzqm
    public final boolean zza() {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzqm
    public final zzqk zzb(long j) {
        zzafs.zzf(this.zza.zzk);
        zzqe zzqeVar = this.zza;
        zzqd zzqdVar = zzqeVar.zzk;
        long[] jArr = zzqdVar.zza;
        long[] jArr2 = zzqdVar.zzb;
        int zzE = zzaht.zzE(jArr, zzqeVar.zzb(j), true, false);
        zzqn zzd = zzd(zzE == -1 ? 0L : jArr[zzE], zzE != -1 ? jArr2[zzE] : 0L);
        if (zzd.zzb == j || zzE == jArr.length - 1) {
            return new zzqk(zzd, zzd);
        }
        int i = zzE + 1;
        return new zzqk(zzd, zzd(jArr[i], jArr2[i]));
    }

    @Override // com.google.android.gms.internal.ads.zzqm
    public final long zzc() {
        return this.zza.zza();
    }
}
