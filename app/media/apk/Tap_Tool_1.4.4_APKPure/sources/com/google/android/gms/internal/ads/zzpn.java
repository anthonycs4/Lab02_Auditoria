package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public class zzpn implements zzqm {
    private final long zza;
    private final long zzb;
    private final int zzc;
    private final long zzd;
    private final int zze;
    private final long zzf;

    public zzpn(long j, long j2, int i, int i2) {
        this.zza = j;
        this.zzb = j2;
        this.zzc = i2 == -1 ? 1 : i2;
        this.zze = i;
        if (j == -1) {
            this.zzd = -1L;
            this.zzf = -9223372036854775807L;
            return;
        }
        this.zzd = j - j2;
        this.zzf = zze(j, j2, i);
    }

    private static long zze(long j, long j2, int i) {
        return (Math.max(0L, j - j2) * 8000000) / i;
    }

    @Override // com.google.android.gms.internal.ads.zzqm
    public final boolean zza() {
        return this.zzd != -1;
    }

    @Override // com.google.android.gms.internal.ads.zzqm
    public final zzqk zzb(long j) {
        long j2 = this.zzd;
        if (j2 != -1) {
            int i = this.zze;
            long j3 = this.zzc;
            long zzz = this.zzb + zzaht.zzz((((i * j) / 8000000) / j3) * j3, 0L, j2 - j3);
            long zzd = zzd(zzz);
            zzqn zzqnVar = new zzqn(zzd, zzz);
            if (zzd < j) {
                long j4 = zzz + this.zzc;
                if (j4 < this.zza) {
                    return new zzqk(zzqnVar, new zzqn(zzd(j4), j4));
                }
            }
            return new zzqk(zzqnVar, zzqnVar);
        }
        zzqn zzqnVar2 = new zzqn(0L, this.zzb);
        return new zzqk(zzqnVar2, zzqnVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzqm
    public final long zzc() {
        return this.zzf;
    }

    public final long zzd(long j) {
        return zze(j, this.zzb, this.zze);
    }
}
