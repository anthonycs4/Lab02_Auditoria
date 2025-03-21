package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
/* compiled from: com.google.android.gms:play-services-ads-lite@@20.2.0 */
/* loaded from: classes.dex */
public final class zzbbf extends zzhq implements zzbbh {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbbf(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdListener");
    }

    @Override // com.google.android.gms.internal.ads.zzbbh
    public final void zzb() throws RemoteException {
        zzbp(1, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbbh
    public final void zzc(int i) throws RemoteException {
        Parcel zza = zza();
        zza.writeInt(i);
        zzbp(2, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbbh
    public final void zzd(zzazm zzazmVar) throws RemoteException {
        Parcel zza = zza();
        zzhs.zzd(zza, zzazmVar);
        zzbp(8, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbbh
    public final void zze() throws RemoteException {
        zzbp(3, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbbh
    public final void zzf() throws RemoteException {
        zzbp(4, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbbh
    public final void zzg() throws RemoteException {
        zzbp(5, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbbh
    public final void zzh() throws RemoteException {
        zzbp(6, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbbh
    public final void zzi() throws RemoteException {
        zzbp(7, zza());
    }
}
