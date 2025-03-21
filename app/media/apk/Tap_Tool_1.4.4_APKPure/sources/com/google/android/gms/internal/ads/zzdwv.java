package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzdwv implements zzexm {
    private final zzdws zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzdwv(zzdws zzdwsVar) {
        this.zza = zzdwsVar;
    }

    @Override // com.google.android.gms.internal.ads.zzexm
    public final void zzbO(zzexf zzexfVar, String str) {
    }

    @Override // com.google.android.gms.internal.ads.zzexm
    public final void zzbP(zzexf zzexfVar, String str) {
        if (((Boolean) zzbba.zzc().zzb(zzbfq.zzer)).booleanValue() && zzexf.RENDERER == zzexfVar) {
            this.zza.zze(com.google.android.gms.ads.internal.zzs.zzj().elapsedRealtime());
        }
    }

    @Override // com.google.android.gms.internal.ads.zzexm
    public final void zzbQ(zzexf zzexfVar, String str, Throwable th) {
        if (((Boolean) zzbba.zzc().zzb(zzbfq.zzer)).booleanValue() && zzexf.RENDERER == zzexfVar && this.zza.zzf() != 0) {
            this.zza.zzg(com.google.android.gms.ads.internal.zzs.zzj().elapsedRealtime() - this.zza.zzf());
        }
    }

    @Override // com.google.android.gms.internal.ads.zzexm
    public final void zzbR(zzexf zzexfVar, String str) {
        if (((Boolean) zzbba.zzc().zzb(zzbfq.zzer)).booleanValue() && zzexf.RENDERER == zzexfVar && this.zza.zzf() != 0) {
            this.zza.zzg(com.google.android.gms.ads.internal.zzs.zzj().elapsedRealtime() - this.zza.zzf());
        }
    }
}
