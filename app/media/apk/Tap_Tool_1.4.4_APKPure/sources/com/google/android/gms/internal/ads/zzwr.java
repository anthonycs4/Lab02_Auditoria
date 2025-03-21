package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
final class zzwr implements zzqm {
    private final zzwo zza;
    private final int zzb;
    private final long zzc;
    private final long zzd;
    private final long zze;

    public zzwr(zzwo zzwoVar, int i, long j, long j2) {
        this.zza = zzwoVar;
        this.zzb = i;
        this.zzc = j;
        long j3 = (j2 - j) / zzwoVar.zzd;
        this.zzd = j3;
        this.zze = zzd(j3);
    }

    private final long zzd(long j) {
        return zzaht.zzG(j * this.zzb, 1000000L, this.zza.zzc);
    }

    @Override // com.google.android.gms.internal.ads.zzqm
    public final boolean zza() {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzqm
    public final zzqk zzb(long j) {
        long zzz = zzaht.zzz((this.zza.zzc * j) / (this.zzb * 1000000), 0L, this.zzd - 1);
        long j2 = this.zzc;
        int i = this.zza.zzd;
        long zzd = zzd(zzz);
        zzqn zzqnVar = new zzqn(zzd, j2 + (i * zzz));
        if (zzd >= j || zzz == this.zzd - 1) {
            return new zzqk(zzqnVar, zzqnVar);
        }
        long j3 = zzz + 1;
        return new zzqk(zzqnVar, new zzqn(zzd(j3), this.zzc + (j3 * this.zza.zzd)));
    }

    @Override // com.google.android.gms.internal.ads.zzqm
    public final long zzc() {
        return this.zze;
    }
}
