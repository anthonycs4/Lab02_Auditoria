package com.google.android.gms.internal.ads;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzbpl implements zzcdi<zzbol> {
    final /* synthetic */ zzbpk zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbpl(zzbpp zzbppVar, zzbpk zzbpkVar) {
        this.zza = zzbpkVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcdi
    public final /* bridge */ /* synthetic */ void zza(zzbol zzbolVar) {
        com.google.android.gms.ads.internal.util.zze.zza("Getting a new session for JS Engine.");
        this.zza.zzf(zzbolVar.zzk());
    }
}
