package com.google.android.gms.internal.ads;

import kotlin.jvm.internal.LongCompanionObject;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzahq {
    private long zzb;
    private long zza = 0;
    private long zzc = -9223372036854775807L;

    public zzahq(long j) {
    }

    public final synchronized long zza() {
        return this.zza;
    }

    public final synchronized long zzb() {
        long j = this.zzc;
        long j2 = -9223372036854775807L;
        if (j != -9223372036854775807L) {
            j2 = this.zzb + j;
        } else {
            long j3 = this.zza;
            if (j3 != LongCompanionObject.MAX_VALUE) {
                return j3;
            }
        }
        return j2;
    }

    public final synchronized long zzc() {
        long j = -9223372036854775807L;
        if (this.zza == LongCompanionObject.MAX_VALUE) {
            j = 0;
        } else if (this.zzc != -9223372036854775807L) {
            return this.zzb;
        }
        return j;
    }

    public final synchronized void zzd(long j) {
        this.zza = j;
        this.zzc = -9223372036854775807L;
    }

    public final synchronized long zze(long j) {
        if (j == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        long j2 = this.zzc;
        if (j2 != -9223372036854775807L) {
            long j3 = (j2 * 90000) / 1000000;
            long j4 = (4294967296L + j3) / 8589934592L;
            long j5 = (((-1) + j4) * 8589934592L) + j;
            j += j4 * 8589934592L;
            if (Math.abs(j5 - j3) < Math.abs(j - j3)) {
                j = j5;
            }
        }
        return zzf((j * 1000000) / 90000);
    }

    public final synchronized long zzf(long j) {
        if (this.zzc != -9223372036854775807L) {
            this.zzc = j;
        } else {
            long j2 = this.zza;
            if (j2 != LongCompanionObject.MAX_VALUE) {
                this.zzb = j2 - j;
            }
            this.zzc = j;
            notifyAll();
        }
        return j + this.zzb;
    }
}
