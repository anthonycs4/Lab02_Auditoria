package com.google.android.gms.internal.ads;

import android.os.RemoteException;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
final class zzeba extends zzbte {
    final /* synthetic */ zzebb zza;
    private final zzdyd<zzbtl, zzdzw> zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzeba(zzebb zzebbVar, zzdyd zzdydVar, zzeaz zzeazVar) {
        this.zza = zzebbVar;
        this.zzb = zzdydVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbtf
    public final void zze(zzbrt zzbrtVar) throws RemoteException {
        zzebb.zzc(this.zza, zzbrtVar);
        this.zzb.zzc.zzj();
    }

    @Override // com.google.android.gms.internal.ads.zzbtf
    public final void zzf(String str) throws RemoteException {
        this.zzb.zzc.zzw(0, str);
    }

    @Override // com.google.android.gms.internal.ads.zzbtf
    public final void zzg(zzazm zzazmVar) throws RemoteException {
        this.zzb.zzc.zzx(zzazmVar);
    }
}
