package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
final class zzki {
    public final zzaaj zza;
    public final long zzb;
    public final long zzc;
    public final long zzd;
    public final long zze;
    public final boolean zzf;
    public final boolean zzg;
    public final boolean zzh;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzki(zzaaj zzaajVar, long j, long j2, long j3, long j4, boolean z, boolean z2, boolean z3) {
        this.zza = zzaajVar;
        this.zzb = j;
        this.zzc = j2;
        this.zzd = j3;
        this.zze = j4;
        this.zzf = z;
        this.zzg = z2;
        this.zzh = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            zzki zzkiVar = (zzki) obj;
            if (this.zzb == zzkiVar.zzb && this.zzc == zzkiVar.zzc && this.zzd == zzkiVar.zzd && this.zze == zzkiVar.zze && this.zzf == zzkiVar.zzf && this.zzg == zzkiVar.zzg && this.zzh == zzkiVar.zzh && zzaht.zzc(this.zza, zzkiVar.zza)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((((((((this.zza.hashCode() + 527) * 31) + ((int) this.zzb)) * 31) + ((int) this.zzc)) * 31) + ((int) this.zzd)) * 31) + ((int) this.zze)) * 31) + (this.zzf ? 1 : 0)) * 31) + (this.zzg ? 1 : 0)) * 31) + (this.zzh ? 1 : 0);
    }

    public final zzki zza(long j) {
        return j == this.zzb ? this : new zzki(this.zza, j, this.zzc, this.zzd, this.zze, this.zzf, this.zzg, this.zzh);
    }

    public final zzki zzb(long j) {
        return j == this.zzc ? this : new zzki(this.zza, this.zzb, j, this.zzd, this.zze, this.zzf, this.zzg, this.zzh);
    }
}
