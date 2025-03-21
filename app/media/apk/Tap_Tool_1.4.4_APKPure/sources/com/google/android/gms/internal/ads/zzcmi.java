package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
final class zzcmi implements com.google.android.gms.ads.nonagon.signalgeneration.zze {
    final /* synthetic */ zzcmk zza;
    private zzcvt zzb;
    private com.google.android.gms.ads.nonagon.signalgeneration.zzx zzc;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzcmi(zzcmk zzcmkVar, zzckz zzckzVar) {
        this.zza = zzcmkVar;
    }

    @Override // com.google.android.gms.ads.nonagon.signalgeneration.zze
    public final com.google.android.gms.ads.nonagon.signalgeneration.zzf zza() {
        zzgdw.zzc(this.zzb, zzcvt.class);
        zzgdw.zzc(this.zzc, com.google.android.gms.ads.nonagon.signalgeneration.zzx.class);
        return new zzcmj(this.zza, this.zzc, new zzcts(), new zzdqa(), this.zzb, new zzeum(), null, null, null);
    }

    @Override // com.google.android.gms.ads.nonagon.signalgeneration.zze
    public final /* bridge */ /* synthetic */ com.google.android.gms.ads.nonagon.signalgeneration.zze zzb(com.google.android.gms.ads.nonagon.signalgeneration.zzx zzxVar) {
        this.zzc = zzxVar;
        return this;
    }

    @Override // com.google.android.gms.ads.nonagon.signalgeneration.zze
    public final /* bridge */ /* synthetic */ com.google.android.gms.ads.nonagon.signalgeneration.zze zzc(zzcvt zzcvtVar) {
        this.zzb = zzcvtVar;
        return this;
    }
}
