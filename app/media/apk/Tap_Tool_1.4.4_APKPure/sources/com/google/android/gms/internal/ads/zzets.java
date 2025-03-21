package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
final class zzets implements zzfko<String> {
    final /* synthetic */ zzcib zza;
    final /* synthetic */ zzeyn zzb;
    final /* synthetic */ zzdxo zzc;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzets(zzcib zzcibVar, zzeyn zzeynVar, zzdxo zzdxoVar) {
        this.zza = zzcibVar;
        this.zzb = zzeynVar;
        this.zzc = zzdxoVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfko
    public final void zza(Throwable th) {
    }

    @Override // com.google.android.gms.internal.ads.zzfko
    public final /* bridge */ /* synthetic */ void zzb(String str) {
        String str2 = str;
        if (!this.zza.zzF().zzad) {
            this.zzb.zzb(str2);
            return;
        }
        long currentTimeMillis = com.google.android.gms.ads.internal.zzs.zzj().currentTimeMillis();
        String str3 = this.zza.zzaB().zzb;
        com.google.android.gms.ads.internal.zzs.zzc();
        this.zzc.zze(new zzdxq(currentTimeMillis, str3, str2, true == com.google.android.gms.ads.internal.util.zzr.zzI(this.zza.getContext()) ? 2 : 1));
    }
}
