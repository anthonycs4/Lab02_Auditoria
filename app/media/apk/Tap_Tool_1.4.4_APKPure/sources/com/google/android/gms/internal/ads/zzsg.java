package com.google.android.gms.internal.ads;

import android.util.Pair;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
final class zzsg implements zzsl {
    private final long[] zza;
    private final long[] zzb;
    private final long zzc;

    private zzsg(long[] jArr, long[] jArr2, long j) {
        this.zza = jArr;
        this.zzb = jArr2;
        this.zzc = j == -9223372036854775807L ? zzhx.zzb(jArr2[jArr2.length - 1]) : j;
    }

    public static zzsg zzd(long j, zzyz zzyzVar, long j2) {
        int length = zzyzVar.zzd.length;
        int i = length + 1;
        long[] jArr = new long[i];
        long[] jArr2 = new long[i];
        jArr[0] = j;
        long j3 = 0;
        jArr2[0] = 0;
        for (int i2 = 1; i2 <= length; i2++) {
            int i3 = i2 - 1;
            j += zzyzVar.zzb + zzyzVar.zzd[i3];
            j3 += zzyzVar.zzc + zzyzVar.zze[i3];
            jArr[i2] = j;
            jArr2[i2] = j3;
        }
        return new zzsg(jArr, jArr2, j2);
    }

    private static Pair<Long, Long> zzg(long j, long[] jArr, long[] jArr2) {
        int zzE = zzaht.zzE(jArr, j, true, true);
        long j2 = jArr[zzE];
        long j3 = jArr2[zzE];
        int i = zzE + 1;
        if (i == jArr.length) {
            return Pair.create(Long.valueOf(j2), Long.valueOf(j3));
        }
        long j4 = jArr[i];
        return Pair.create(Long.valueOf(j), Long.valueOf(((long) ((j4 == j2 ? 0.0d : (j - j2) / (j4 - j2)) * (jArr2[i] - j3))) + j3));
    }

    @Override // com.google.android.gms.internal.ads.zzqm
    public final boolean zza() {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzqm
    public final zzqk zzb(long j) {
        Pair<Long, Long> zzg = zzg(zzhx.zza(zzaht.zzz(j, 0L, this.zzc)), this.zzb, this.zza);
        long longValue = ((Long) zzg.first).longValue();
        zzqn zzqnVar = new zzqn(zzhx.zzb(longValue), ((Long) zzg.second).longValue());
        return new zzqk(zzqnVar, zzqnVar);
    }

    @Override // com.google.android.gms.internal.ads.zzqm
    public final long zzc() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzsl
    public final long zze(long j) {
        return zzhx.zzb(((Long) zzg(j, this.zza, this.zzb).second).longValue());
    }

    @Override // com.google.android.gms.internal.ads.zzsl
    public final long zzf() {
        return -1L;
    }
}
