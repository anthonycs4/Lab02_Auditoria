package com.google.android.gms.internal.ads;

import java.util.Objects;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzom {
    public final String zza;
    public final zzjq zzb;
    public final zzjq zzc;
    public final int zzd;
    public final int zze;

    public zzom(String str, zzjq zzjqVar, zzjq zzjqVar2, int i, int i2) {
        boolean z = false;
        if (i != 0) {
            i2 = i2 == 0 ? 0 : i2;
            zzafs.zza(z);
            zzafs.zzh(str);
            this.zza = str;
            Objects.requireNonNull(zzjqVar);
            this.zzb = zzjqVar;
            Objects.requireNonNull(zzjqVar2);
            this.zzc = zzjqVar2;
            this.zzd = i;
            this.zze = i2;
        }
        z = true;
        zzafs.zza(z);
        zzafs.zzh(str);
        this.zza = str;
        Objects.requireNonNull(zzjqVar);
        this.zzb = zzjqVar;
        Objects.requireNonNull(zzjqVar2);
        this.zzc = zzjqVar2;
        this.zzd = i;
        this.zze = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            zzom zzomVar = (zzom) obj;
            if (this.zzd == zzomVar.zzd && this.zze == zzomVar.zze && this.zza.equals(zzomVar.zza) && this.zzb.equals(zzomVar.zzb) && this.zzc.equals(zzomVar.zzc)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((this.zzd + 527) * 31) + this.zze) * 31) + this.zza.hashCode()) * 31) + this.zzb.hashCode()) * 31) + this.zzc.hashCode();
    }
}
