package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
/* compiled from: com.google.android.gms:play-services-ads-lite@@20.2.0 */
/* loaded from: classes.dex */
public final class zzbyt extends zzhq implements zzbyv {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbyt(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.rewarded.client.IRewardedAdLoadCallback");
    }

    @Override // com.google.android.gms.internal.ads.zzbyv
    public final void zze() throws RemoteException {
        zzbp(1, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbyv
    public final void zzf(int i) throws RemoteException {
        Parcel zza = zza();
        zza.writeInt(i);
        zzbp(2, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbyv
    public final void zzg(zzazm zzazmVar) throws RemoteException {
        Parcel zza = zza();
        zzhs.zzd(zza, zzazmVar);
        zzbp(3, zza);
    }
}
