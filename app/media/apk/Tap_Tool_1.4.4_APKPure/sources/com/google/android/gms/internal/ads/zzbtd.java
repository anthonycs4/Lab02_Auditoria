package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
/* compiled from: com.google.android.gms:play-services-ads-lite@@20.2.0 */
/* loaded from: classes.dex */
public final class zzbtd extends zzhq implements zzbtf {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbtd(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.rtb.INativeCallback");
    }

    @Override // com.google.android.gms.internal.ads.zzbtf
    public final void zze(zzbrt zzbrtVar) throws RemoteException {
        Parcel zza = zza();
        zzhs.zzf(zza, zzbrtVar);
        zzbp(1, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbtf
    public final void zzf(String str) throws RemoteException {
        Parcel zza = zza();
        zza.writeString("Adapter returned null.");
        zzbp(2, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbtf
    public final void zzg(zzazm zzazmVar) throws RemoteException {
        Parcel zza = zza();
        zzhs.zzd(zza, zzazmVar);
        zzbp(3, zza);
    }
}
