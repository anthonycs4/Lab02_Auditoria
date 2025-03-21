package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzdpb implements zzcyy, zzcxt, zzcwk {
    private final zzdpj zza;
    private final zzdps zzb;

    public zzdpb(zzdpj zzdpjVar, zzdps zzdpsVar) {
        this.zza = zzdpjVar;
        this.zzb = zzdpsVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcwk
    public final void zzbM(zzazm zzazmVar) {
        this.zza.zzc().put("action", "ftl");
        this.zza.zzc().put("ftl", String.valueOf(zzazmVar.zza));
        this.zza.zzc().put("ed", zzazmVar.zzc);
        this.zzb.zzb(this.zza.zzc());
    }

    @Override // com.google.android.gms.internal.ads.zzcxt
    public final void zzbN() {
        this.zza.zzc().put("action", "loaded");
        this.zzb.zzb(this.zza.zzc());
    }

    @Override // com.google.android.gms.internal.ads.zzcyy
    public final void zzj(zzbxf zzbxfVar) {
        this.zza.zzb(zzbxfVar.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzcyy
    public final void zzq(zzete zzeteVar) {
        this.zza.zza(zzeteVar);
    }
}
