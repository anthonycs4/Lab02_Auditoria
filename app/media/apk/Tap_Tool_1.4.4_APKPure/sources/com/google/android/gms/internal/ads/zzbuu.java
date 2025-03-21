package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads-lite@@20.2.0 */
/* loaded from: classes.dex */
final class zzbuu extends zzbjj {
    final /* synthetic */ zzbuw zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzbuu(zzbuw zzbuwVar, zzbut zzbutVar) {
        this.zza = zzbuwVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbjk
    public final void zze(zzbja zzbjaVar, String str) {
        if (zzbuw.zze(this.zza) == null) {
            return;
        }
        zzbuw.zze(this.zza).onCustomClick(zzbuw.zzc(this.zza, zzbjaVar), str);
    }
}
