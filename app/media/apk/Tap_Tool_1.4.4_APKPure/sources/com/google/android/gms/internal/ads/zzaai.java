package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public class zzaai {
    public final Object zza;
    public final int zzb;
    public final int zzc;
    public final long zzd;
    public final int zze;

    /* JADX INFO: Access modifiers changed from: protected */
    public zzaai(zzaai zzaaiVar) {
        this.zza = zzaaiVar.zza;
        this.zzb = zzaaiVar.zzb;
        this.zzc = zzaaiVar.zzc;
        this.zzd = zzaaiVar.zzd;
        this.zze = zzaaiVar.zze;
    }

    public zzaai(Object obj, int i, int i2, long j) {
        this(obj, i, i2, j, -1);
    }

    private zzaai(Object obj, int i, int i2, long j, int i3) {
        this.zza = obj;
        this.zzb = i;
        this.zzc = i2;
        this.zzd = j;
        this.zze = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzaai) {
            zzaai zzaaiVar = (zzaai) obj;
            return this.zza.equals(zzaaiVar.zza) && this.zzb == zzaaiVar.zzb && this.zzc == zzaaiVar.zzc && this.zzd == zzaaiVar.zzd && this.zze == zzaaiVar.zze;
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((this.zza.hashCode() + 527) * 31) + this.zzb) * 31) + this.zzc) * 31) + ((int) this.zzd)) * 31) + this.zze;
    }

    public final zzaai zza(Object obj) {
        return this.zza.equals(obj) ? this : new zzaai(obj, this.zzb, this.zzc, this.zzd, this.zze);
    }

    public final boolean zzb() {
        return this.zzb != -1;
    }

    public zzaai(Object obj, long j) {
        this(obj, -1, -1, -1L, -1);
    }

    public zzaai(Object obj, long j, int i) {
        this(obj, -1, -1, j, i);
    }
}
