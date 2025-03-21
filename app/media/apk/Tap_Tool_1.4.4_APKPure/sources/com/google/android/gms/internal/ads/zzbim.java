package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
/* compiled from: com.google.android.gms:play-services-ads-lite@@20.2.0 */
/* loaded from: classes.dex */
public final class zzbim extends zzhq implements zzbio {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbim(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegate");
    }

    @Override // com.google.android.gms.internal.ads.zzbio
    public final void zzb(String str, IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        zzhs.zzf(zza, iObjectWrapper);
        zzbp(1, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbio
    public final void zzbF(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel zza = zza();
        zzhs.zzf(zza, iObjectWrapper);
        zzbp(9, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbio
    public final void zzbG(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel zza = zza();
        zzhs.zzf(zza, iObjectWrapper);
        zzbp(7, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbio
    public final void zzbH(zzbih zzbihVar) throws RemoteException {
        Parcel zza = zza();
        zzhs.zzf(zza, zzbihVar);
        zzbp(8, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbio
    public final IObjectWrapper zzc(String str) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        Parcel zzbo = zzbo(2, zza);
        IObjectWrapper asInterface = IObjectWrapper.Stub.asInterface(zzbo.readStrongBinder());
        zzbo.recycle();
        return asInterface;
    }

    @Override // com.google.android.gms.internal.ads.zzbio
    public final void zzd(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel zza = zza();
        zzhs.zzf(zza, iObjectWrapper);
        zzbp(3, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbio
    public final void zze() throws RemoteException {
        zzbp(4, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbio
    public final void zzf(IObjectWrapper iObjectWrapper, int i) throws RemoteException {
        Parcel zza = zza();
        zzhs.zzf(zza, iObjectWrapper);
        zza.writeInt(i);
        zzbp(5, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbio
    public final void zzg(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel zza = zza();
        zzhs.zzf(zza, iObjectWrapper);
        zzbp(6, zza);
    }
}
