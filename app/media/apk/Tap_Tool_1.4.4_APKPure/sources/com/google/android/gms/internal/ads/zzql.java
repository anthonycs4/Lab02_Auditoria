package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public class zzql implements zzqm {
    private final long zza;
    private final zzqk zzb;

    @Override // com.google.android.gms.internal.ads.zzqm
    public final boolean zza() {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzqm
    public final zzqk zzb(long j) {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzqm
    public final long zzc() {
        return this.zza;
    }

    public zzql(long j, long j2) {
        this.zza = j;
        zzqn zzqnVar = j2 == 0 ? zzqn.zza : new zzqn(0L, j2);
        this.zzb = new zzqk(zzqnVar, zzqnVar);
    }
}
