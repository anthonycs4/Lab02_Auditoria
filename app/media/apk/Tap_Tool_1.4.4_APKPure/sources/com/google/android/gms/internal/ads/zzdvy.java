package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzdvy implements zzcyy, zzcxt, zzcwk {
    private final zzexu zza;
    private final zzexv zzb;
    private final zzccc zzc;

    public zzdvy(zzexu zzexuVar, zzexv zzexvVar, zzccc zzcccVar) {
        this.zza = zzexuVar;
        this.zzb = zzexvVar;
        this.zzc = zzcccVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcwk
    public final void zzbM(zzazm zzazmVar) {
        zzexu zzexuVar = this.zza;
        zzexuVar.zzc("action", "ftl");
        zzexuVar.zzc("ftl", String.valueOf(zzazmVar.zza));
        zzexuVar.zzc("ed", zzazmVar.zzc);
        this.zzb.zza(this.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzcxt
    public final void zzbN() {
        zzexv zzexvVar = this.zzb;
        zzexu zzexuVar = this.zza;
        zzexuVar.zzc("action", "loaded");
        zzexvVar.zza(zzexuVar);
    }

    @Override // com.google.android.gms.internal.ads.zzcyy
    public final void zzj(zzbxf zzbxfVar) {
        this.zza.zzf(zzbxfVar.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzcyy
    public final void zzq(zzete zzeteVar) {
        this.zza.zzg(zzeteVar, this.zzc);
    }
}
