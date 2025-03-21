package com.google.android.gms.internal.ads;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzbpg implements zzcdg {
    final /* synthetic */ zzbpp zza;
    final /* synthetic */ zzbpq zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbpg(zzbpq zzbpqVar, zzbpp zzbppVar) {
        this.zzb = zzbpqVar;
        this.zza = zzbppVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcdg
    public final void zza() {
        Object obj;
        obj = this.zzb.zza;
        synchronized (obj) {
            this.zzb.zzh = 1;
            com.google.android.gms.ads.internal.util.zze.zza("Failed loading new engine. Marking new engine destroyable.");
            this.zza.zzc();
        }
    }
}
