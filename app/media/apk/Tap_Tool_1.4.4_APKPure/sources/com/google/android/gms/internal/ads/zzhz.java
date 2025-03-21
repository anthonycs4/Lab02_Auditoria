package com.google.android.gms.internal.ads;

import android.os.SystemClock;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzhz {
    private final long zza;
    private final long zzb;
    private long zzc = -9223372036854775807L;
    private long zzd = -9223372036854775807L;
    private long zzf = -9223372036854775807L;
    private long zzg = -9223372036854775807L;
    private float zzj = 0.97f;
    private float zzi = 1.03f;
    private float zzk = 1.0f;
    private long zzl = -9223372036854775807L;
    private long zze = -9223372036854775807L;
    private long zzh = -9223372036854775807L;
    private long zzm = -9223372036854775807L;
    private long zzn = -9223372036854775807L;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzhz(float f, float f2, long j, float f3, long j2, long j3, float f4, zzhy zzhyVar) {
        this.zza = j2;
        this.zzb = j3;
    }

    private final void zzf() {
        long j = this.zzc;
        if (j != -9223372036854775807L) {
            long j2 = this.zzd;
            if (j2 != -9223372036854775807L) {
                j = j2;
            }
            long j3 = this.zzf;
            if (j3 != -9223372036854775807L && j < j3) {
                j = j3;
            }
            long j4 = this.zzg;
            if (j4 != -9223372036854775807L && j > j4) {
                j = j4;
            }
        } else {
            j = -9223372036854775807L;
        }
        if (this.zze == j) {
            return;
        }
        this.zze = j;
        this.zzh = j;
        this.zzm = -9223372036854775807L;
        this.zzn = -9223372036854775807L;
        this.zzl = -9223372036854775807L;
    }

    private static long zzg(long j, long j2, float f) {
        return (((float) j) * 0.999f) + (((float) j2) * 9.999871E-4f);
    }

    public final void zza(zzkb zzkbVar) {
        long j = zzkbVar.zzb;
        this.zzc = zzhx.zzb(-9223372036854775807L);
        long j2 = zzkbVar.zzc;
        this.zzf = zzhx.zzb(-9223372036854775807L);
        long j3 = zzkbVar.zzd;
        this.zzg = zzhx.zzb(-9223372036854775807L);
        float f = zzkbVar.zze;
        this.zzj = 0.97f;
        float f2 = zzkbVar.zzf;
        this.zzi = 1.03f;
        zzf();
    }

    public final void zzb(long j) {
        this.zzd = j;
        zzf();
    }

    public final void zzc() {
        long j = this.zzh;
        if (j == -9223372036854775807L) {
            return;
        }
        long j2 = j + this.zzb;
        this.zzh = j2;
        long j3 = this.zzg;
        if (j3 != -9223372036854775807L && j2 > j3) {
            this.zzh = j3;
        }
        this.zzl = -9223372036854775807L;
    }

    public final long zze() {
        return this.zzh;
    }

    public final float zzd(long j, long j2) {
        long zzz;
        if (this.zzc != -9223372036854775807L) {
            long j3 = j - j2;
            long j4 = this.zzm;
            if (j4 == -9223372036854775807L) {
                this.zzm = j3;
                this.zzn = 0L;
            } else {
                long max = Math.max(j3, zzg(j4, j3, 0.999f));
                this.zzm = max;
                this.zzn = zzg(this.zzn, Math.abs(j3 - max), 0.999f);
            }
            if (this.zzl == -9223372036854775807L || SystemClock.elapsedRealtime() - this.zzl >= 1000) {
                this.zzl = SystemClock.elapsedRealtime();
                long j5 = this.zzm + (this.zzn * 3);
                if (this.zzh > j5) {
                    float zzb = (float) zzhx.zzb(1000L);
                    long[] jArr = {j5, this.zze, this.zzh - (((this.zzk - 1.0f) * zzb) + ((this.zzi - 1.0f) * zzb))};
                    zzz = jArr[0];
                    for (int i = 1; i < 3; i++) {
                        long j6 = jArr[i];
                        if (j6 > zzz) {
                            zzz = j6;
                        }
                    }
                    this.zzh = zzz;
                } else {
                    zzz = zzaht.zzz(j - (Math.max(0.0f, this.zzk - 1.0f) / 1.0E-7f), this.zzh, j5);
                    this.zzh = zzz;
                    long j7 = this.zzg;
                    if (j7 != -9223372036854775807L && zzz > j7) {
                        this.zzh = j7;
                        zzz = j7;
                    }
                }
                long j8 = j - zzz;
                if (Math.abs(j8) < this.zza) {
                    this.zzk = 1.0f;
                    return 1.0f;
                }
                float zzA = zzaht.zzA((((float) j8) * 1.0E-7f) + 1.0f, this.zzj, this.zzi);
                this.zzk = zzA;
                return zzA;
            }
            return this.zzk;
        }
        return 1.0f;
    }
}
