package com.google.android.gms.internal.ads;

import android.os.RemoteException;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
final class zzeal extends zzbtb {
    private final zzdyd<zzbtl, zzdzw> zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzeal(zzeam zzeamVar, zzdyd zzdydVar, zzeak zzeakVar) {
        this.zza = zzdydVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbtc
    public final void zze() throws RemoteException {
        this.zza.zzc.zzj();
    }

    @Override // com.google.android.gms.internal.ads.zzbtc
    public final void zzf(String str) throws RemoteException {
        this.zza.zzc.zzw(0, str);
    }

    @Override // com.google.android.gms.internal.ads.zzbtc
    public final void zzg(zzazm zzazmVar) throws RemoteException {
        this.zza.zzc.zzx(zzazmVar);
    }
}
