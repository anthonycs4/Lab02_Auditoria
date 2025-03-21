package com.google.android.gms.internal.ads;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzbpi implements zzcdi<zzbpr> {
    final /* synthetic */ zzbpk zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbpi(zzbpk zzbpkVar) {
        this.zza = zzbpkVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcdi
    public final /* bridge */ /* synthetic */ void zza(zzbpr zzbprVar) {
        zzbpp zzbppVar;
        com.google.android.gms.ads.internal.util.zze.zza("Releasing engine reference.");
        zzbppVar = this.zza.zzb;
        zzbppVar.zzb();
    }
}
