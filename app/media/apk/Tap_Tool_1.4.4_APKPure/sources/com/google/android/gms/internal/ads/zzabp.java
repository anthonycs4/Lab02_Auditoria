package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
final class zzabp {
    public final long zza;
    public final long zzb;
    public boolean zzc;
    public zzadr zzd;
    public zzabp zze;

    public zzabp(long j, int i) {
        this.zza = j;
        this.zzb = j + 65536;
    }

    public final int zza(long j) {
        long j2 = this.zza;
        int i = this.zzd.zzb;
        return (int) (j - j2);
    }

    public final zzabp zzb() {
        this.zzd = null;
        zzabp zzabpVar = this.zze;
        this.zze = null;
        return zzabpVar;
    }
}
