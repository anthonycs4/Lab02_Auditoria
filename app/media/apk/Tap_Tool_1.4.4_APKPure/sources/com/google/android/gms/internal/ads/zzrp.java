package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
final class zzrp implements zzqm {
    final /* synthetic */ zzqm zza;
    final /* synthetic */ zzrq zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzrp(zzrq zzrqVar, zzqm zzqmVar) {
        this.zzb = zzrqVar;
        this.zza = zzqmVar;
    }

    @Override // com.google.android.gms.internal.ads.zzqm
    public final boolean zza() {
        return this.zza.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzqm
    public final zzqk zzb(long j) {
        long j2;
        long j3;
        zzqk zzb = this.zza.zzb(j);
        zzqn zzqnVar = zzb.zza;
        long j4 = zzqnVar.zzb;
        long j5 = zzqnVar.zzc;
        j2 = this.zzb.zzb;
        zzqn zzqnVar2 = new zzqn(j4, j5 + j2);
        zzqn zzqnVar3 = zzb.zzb;
        long j6 = zzqnVar3.zzb;
        long j7 = zzqnVar3.zzc;
        j3 = this.zzb.zzb;
        return new zzqk(zzqnVar2, new zzqn(j6, j7 + j3));
    }

    @Override // com.google.android.gms.internal.ads.zzqm
    public final long zzc() {
        return this.zza.zzc();
    }
}
