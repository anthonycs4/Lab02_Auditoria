package com.google.android.gms.internal.ads;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzdzt implements zzfko<zzcqo> {
    final /* synthetic */ zzdzu zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzdzt(zzdzu zzdzuVar) {
        this.zza = zzdzuVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfko
    public final void zza(Throwable th) {
        zzcrl zzcrlVar;
        zzcwj zzcwjVar;
        zzcrlVar = this.zza.zza;
        zzazm zzg = zzcrlVar.zzb().zzg(th);
        zzcwjVar = this.zza.zzd;
        zzcwjVar.zzbM(zzg);
        zzeua.zza(zzg.zza, th, "DelayedBannerAd.onFailure");
    }

    @Override // com.google.android.gms.internal.ads.zzfko
    public final /* bridge */ /* synthetic */ void zzb(zzcqo zzcqoVar) {
        zzcqoVar.zzQ();
    }
}
