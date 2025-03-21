package com.google.android.gms.internal.ads;

import kotlin.jvm.internal.LongCompanionObject;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzlj {
    public static final zzlj zza;
    public static final zzlj zzb;
    public static final zzlj zzc;
    public static final zzlj zzd;
    public static final zzlj zze;
    public final long zzf;
    public final long zzg;

    static {
        zzlj zzljVar = new zzlj(0L, 0L);
        zza = zzljVar;
        zzb = new zzlj(LongCompanionObject.MAX_VALUE, LongCompanionObject.MAX_VALUE);
        zzc = new zzlj(LongCompanionObject.MAX_VALUE, 0L);
        zzd = new zzlj(0L, LongCompanionObject.MAX_VALUE);
        zze = zzljVar;
    }

    public zzlj(long j, long j2) {
        zzafs.zza(j >= 0);
        zzafs.zza(j2 >= 0);
        this.zzf = j;
        this.zzg = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            zzlj zzljVar = (zzlj) obj;
            if (this.zzf == zzljVar.zzf && this.zzg == zzljVar.zzg) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((int) this.zzf) * 31) + ((int) this.zzg);
    }
}
