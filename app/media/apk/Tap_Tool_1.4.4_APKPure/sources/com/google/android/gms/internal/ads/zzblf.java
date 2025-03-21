package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
final class zzblf implements zzfko<String> {
    final /* synthetic */ zzcib zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzblf(zzcib zzcibVar) {
        this.zza = zzcibVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfko
    public final void zza(Throwable th) {
    }

    @Override // com.google.android.gms.internal.ads.zzfko
    public final /* bridge */ /* synthetic */ void zzb(String str) {
        new com.google.android.gms.ads.internal.util.zzbz(this.zza.getContext(), this.zza.zzt().zza, str).zzb();
    }
}
