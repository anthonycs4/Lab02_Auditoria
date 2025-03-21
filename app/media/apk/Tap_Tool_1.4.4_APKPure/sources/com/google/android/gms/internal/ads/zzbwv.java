package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzbwv extends zzhq implements zzbwx {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbwv(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.request.IAdRequestService");
    }

    @Override // com.google.android.gms.internal.ads.zzbwx
    public final void zze(zzbxf zzbxfVar, zzbxb zzbxbVar) throws RemoteException {
        Parcel zza = zza();
        zzhs.zzd(zza, zzbxfVar);
        zzhs.zzf(zza, zzbxbVar);
        zzbp(4, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbwx
    public final void zzf(zzbxf zzbxfVar, zzbxb zzbxbVar) throws RemoteException {
        Parcel zza = zza();
        zzhs.zzd(zza, zzbxfVar);
        zzhs.zzf(zza, zzbxbVar);
        zzbp(5, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbwx
    public final void zzg(zzbxf zzbxfVar, zzbxb zzbxbVar) throws RemoteException {
        Parcel zza = zza();
        zzhs.zzd(zza, zzbxfVar);
        zzhs.zzf(zza, zzbxbVar);
        zzbp(6, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbwx
    public final void zzh(String str, zzbxb zzbxbVar) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        zzhs.zzf(zza, zzbxbVar);
        zzbp(7, zza);
    }
}
