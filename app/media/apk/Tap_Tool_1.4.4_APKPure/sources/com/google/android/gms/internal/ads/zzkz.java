package com.google.android.gms.internal.ads;

import java.util.Arrays;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzkz {
    public final Object zza;
    public final int zzb;
    public final Object zzc;
    public final int zzd;
    public final long zze;
    public final long zzf;
    public final int zzg;
    public final int zzh;

    public zzkz(Object obj, int i, Object obj2, int i2, long j, long j2, int i3, int i4) {
        this.zza = obj;
        this.zzb = i;
        this.zzc = obj2;
        this.zzd = i2;
        this.zze = j;
        this.zzf = j2;
        this.zzg = i3;
        this.zzh = i4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            zzkz zzkzVar = (zzkz) obj;
            if (this.zzb == zzkzVar.zzb && this.zzd == zzkzVar.zzd && this.zze == zzkzVar.zze && this.zzf == zzkzVar.zzf && this.zzg == zzkzVar.zzg && this.zzh == zzkzVar.zzh && zzfeo.zza(this.zza, zzkzVar.zza) && zzfeo.zza(this.zzc, zzkzVar.zzc)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.zza, Integer.valueOf(this.zzb), this.zzc, Integer.valueOf(this.zzd), Integer.valueOf(this.zzb), Long.valueOf(this.zze), Long.valueOf(this.zzf), Integer.valueOf(this.zzg), Integer.valueOf(this.zzh)});
    }
}
