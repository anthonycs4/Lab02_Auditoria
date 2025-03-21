package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
final class zzaid {
    private boolean zzc;
    private int zze;
    private zzaic zza = new zzaic();
    private zzaic zzb = new zzaic();
    private long zzd = -9223372036854775807L;

    public final void zza() {
        this.zza.zza();
        this.zzb.zza();
        this.zzc = false;
        this.zzd = -9223372036854775807L;
        this.zze = 0;
    }

    public final void zzb(long j) {
        this.zza.zzf(j);
        if (this.zza.zzb()) {
            this.zzc = false;
        } else if (this.zzd != -9223372036854775807L) {
            if (!this.zzc || this.zzb.zzc()) {
                this.zzb.zza();
                this.zzb.zzf(this.zzd);
            }
            this.zzc = true;
            this.zzb.zzf(j);
        }
        if (this.zzc && this.zzb.zzb()) {
            zzaic zzaicVar = this.zza;
            this.zza = this.zzb;
            this.zzb = zzaicVar;
            this.zzc = false;
        }
        this.zzd = j;
        this.zze = this.zza.zzb() ? 0 : this.zze + 1;
    }

    public final boolean zzc() {
        return this.zza.zzb();
    }

    public final int zzd() {
        return this.zze;
    }

    public final long zze() {
        if (this.zza.zzb()) {
            return this.zza.zzd();
        }
        return -9223372036854775807L;
    }

    public final long zzf() {
        if (this.zza.zzb()) {
            return this.zza.zze();
        }
        return -9223372036854775807L;
    }

    public final float zzg() {
        if (this.zza.zzb()) {
            return (float) (1.0E9d / this.zza.zze());
        }
        return -1.0f;
    }
}
