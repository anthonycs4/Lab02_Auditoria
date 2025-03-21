package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzcog implements zzcwk {
    private final zzesv zza;
    private final zzete zzb;
    private final zzeyk zzc;
    private final zzeyn zzd;

    public zzcog(zzete zzeteVar, zzeyn zzeynVar, zzeyk zzeykVar) {
        this.zzb = zzeteVar;
        this.zzd = zzeynVar;
        this.zzc = zzeykVar;
        this.zza = zzeteVar.zzb.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzcwk
    public final void zzbM(zzazm zzazmVar) {
        this.zzd.zza(this.zzc.zza(this.zzb, null, this.zza.zza));
    }
}
