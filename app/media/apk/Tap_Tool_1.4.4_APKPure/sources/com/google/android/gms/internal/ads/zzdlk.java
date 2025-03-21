package com.google.android.gms.internal.ads;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzdlk implements zzfko<zzcib> {
    final /* synthetic */ String zza;
    final /* synthetic */ zzblp zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzdlk(zzdlt zzdltVar, String str, zzblp zzblpVar) {
        this.zza = str;
        this.zzb = zzblpVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfko
    public final void zza(Throwable th) {
    }

    @Override // com.google.android.gms.internal.ads.zzfko
    public final /* bridge */ /* synthetic */ void zzb(zzcib zzcibVar) {
        zzcibVar.zzab(this.zza, this.zzb);
    }
}
