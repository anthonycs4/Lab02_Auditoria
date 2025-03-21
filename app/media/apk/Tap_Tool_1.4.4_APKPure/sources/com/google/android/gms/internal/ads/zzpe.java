package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzpe implements zzqm {
    private final zzph zza;
    private final long zzb;
    private final long zzc;
    private final long zzd;
    private final long zze;
    private final long zzf;

    public zzpe(zzph zzphVar, long j, long j2, long j3, long j4, long j5, long j6) {
        this.zza = zzphVar;
        this.zzb = j;
        this.zzc = j3;
        this.zzd = j4;
        this.zze = j5;
        this.zzf = j6;
    }

    @Override // com.google.android.gms.internal.ads.zzqm
    public final boolean zza() {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzqm
    public final zzqk zzb(long j) {
        zzqn zzqnVar = new zzqn(j, zzpg.zza(this.zza.zza(j), 0L, this.zzc, this.zzd, this.zze, this.zzf));
        return new zzqk(zzqnVar, zzqnVar);
    }

    @Override // com.google.android.gms.internal.ads.zzqm
    public final long zzc() {
        return this.zzb;
    }

    public final long zzd(long j) {
        return this.zza.zza(j);
    }
}
