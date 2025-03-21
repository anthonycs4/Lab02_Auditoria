package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzedn<AdT> implements zzdya<AdT> {
    private final zzbgl zza;
    private final zzflb zzb;
    private final zzexl zzc;
    private final zzedw zzd;

    /* JADX WARN: Multi-variable type inference failed */
    public zzedn(zzexl zzexlVar, zzexl zzexlVar2, zzflb zzflbVar, zzbgl zzbglVar, zzedw zzedwVar) {
        this.zzc = zzexlVar;
        this.zzb = zzexlVar2;
        this.zza = zzflbVar;
        this.zzd = zzbglVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdya
    public final boolean zza(zzete zzeteVar, zzess zzessVar) {
        zzesx zzesxVar;
        return (this.zza == null || (zzesxVar = zzessVar.zzr) == null || zzesxVar.zza == null) ? false : true;
    }

    @Override // com.google.android.gms.internal.ads.zzdya
    public final zzfla<AdT> zzb(zzete zzeteVar, zzess zzessVar) {
        zzcde zzcdeVar = new zzcde();
        zzeds zzedsVar = new zzeds();
        zzedsVar.zzd(new zzedm(this, zzcdeVar, zzeteVar, zzessVar, zzedsVar));
        zzesx zzesxVar = zzessVar.zzr;
        final zzbgg zzbggVar = new zzbgg(zzedsVar, zzesxVar.zzb, zzesxVar.zza);
        zzexl zzexlVar = this.zzc;
        return zzeww.zzd(new zzewq(this, zzbggVar) { // from class: com.google.android.gms.internal.ads.zzedl
            private final zzedn zza;
            private final zzbgg zzb;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zza = this;
                this.zzb = zzbggVar;
            }

            @Override // com.google.android.gms.internal.ads.zzewq
            public final void zza() {
                this.zza.zzc(this.zzb);
            }
        }, this.zzb, zzexf.CUSTOM_RENDER_SYN, zzexlVar).zzj(zzexf.CUSTOM_RENDER_ACK).zze(zzcdeVar).zzi();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzc(zzbgg zzbggVar) throws Exception {
        this.zza.zze(zzbggVar);
    }
}
