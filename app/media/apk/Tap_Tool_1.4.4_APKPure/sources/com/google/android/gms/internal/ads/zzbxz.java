package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
/* compiled from: com.google.android.gms:play-services-ads-lite@@20.2.0 */
/* loaded from: classes.dex */
public final class zzbxz extends zzhq implements zzbyb {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbxz(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.reward.client.IRewardedVideoAdListener");
    }

    @Override // com.google.android.gms.internal.ads.zzbyb
    public final void zze() throws RemoteException {
        zzbp(1, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbyb
    public final void zzf() throws RemoteException {
        zzbp(2, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbyb
    public final void zzg() throws RemoteException {
        zzbp(3, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbyb
    public final void zzh() throws RemoteException {
        zzbp(4, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbyb
    public final void zzi(zzbxv zzbxvVar) throws RemoteException {
        Parcel zza = zza();
        zzhs.zzf(zza, zzbxvVar);
        zzbp(5, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbyb
    public final void zzj() throws RemoteException {
        zzbp(6, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbyb
    public final void zzk(int i) throws RemoteException {
        Parcel zza = zza();
        zza.writeInt(i);
        zzbp(7, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbyb
    public final void zzl() throws RemoteException {
        zzbp(8, zza());
    }
}
