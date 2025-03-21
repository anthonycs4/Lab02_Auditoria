package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
final class zztr implements zzqm {
    final /* synthetic */ zzts zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zztr(zzts zztsVar, zztq zztqVar) {
        this.zza = zztsVar;
    }

    @Override // com.google.android.gms.internal.ads.zzqm
    public final boolean zza() {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzqm
    public final zzqk zzb(long j) {
        zzue zzueVar;
        long j2;
        long j3;
        long j4;
        long j5;
        long j6;
        long j7;
        zzueVar = this.zza.zzd;
        long zzi = zzueVar.zzi(j);
        j2 = this.zza.zzb;
        j3 = this.zza.zzc;
        j4 = this.zza.zzb;
        j5 = this.zza.zzf;
        j6 = this.zza.zzb;
        j7 = this.zza.zzc;
        zzqn zzqnVar = new zzqn(j, zzaht.zzz((-30000) + j2 + ((zzi * (j3 - j4)) / j5), j6, j7 - 1));
        return new zzqk(zzqnVar, zzqnVar);
    }

    @Override // com.google.android.gms.internal.ads.zzqm
    public final long zzc() {
        zzue zzueVar;
        long j;
        zzueVar = this.zza.zzd;
        j = this.zza.zzf;
        return zzueVar.zzh(j);
    }
}
