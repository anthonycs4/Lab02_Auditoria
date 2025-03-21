package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.ArrayList;
import java.util.List;
/* compiled from: com.google.android.gms:play-services-ads-lite@@20.2.0 */
/* loaded from: classes.dex */
public final class zzbrp extends zzhq implements IInterface {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbrp(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.INativeAppInstallAdMapper");
    }

    public final String zze() throws RemoteException {
        Parcel zzbo = zzbo(2, zza());
        String readString = zzbo.readString();
        zzbo.recycle();
        return readString;
    }

    public final List zzf() throws RemoteException {
        Parcel zzbo = zzbo(3, zza());
        ArrayList zzg = zzhs.zzg(zzbo);
        zzbo.recycle();
        return zzg;
    }

    public final String zzg() throws RemoteException {
        Parcel zzbo = zzbo(4, zza());
        String readString = zzbo.readString();
        zzbo.recycle();
        return readString;
    }

    public final zzbik zzh() throws RemoteException {
        Parcel zzbo = zzbo(5, zza());
        zzbik zzg = zzbij.zzg(zzbo.readStrongBinder());
        zzbo.recycle();
        return zzg;
    }

    public final String zzi() throws RemoteException {
        Parcel zzbo = zzbo(6, zza());
        String readString = zzbo.readString();
        zzbo.recycle();
        return readString;
    }

    public final double zzj() throws RemoteException {
        Parcel zzbo = zzbo(7, zza());
        double readDouble = zzbo.readDouble();
        zzbo.recycle();
        return readDouble;
    }

    public final String zzk() throws RemoteException {
        Parcel zzbo = zzbo(8, zza());
        String readString = zzbo.readString();
        zzbo.recycle();
        return readString;
    }

    public final String zzl() throws RemoteException {
        Parcel zzbo = zzbo(9, zza());
        String readString = zzbo.readString();
        zzbo.recycle();
        return readString;
    }

    public final void zzm() throws RemoteException {
        zzbp(10, zza());
    }

    public final void zzn(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel zza = zza();
        zzhs.zzf(zza, iObjectWrapper);
        zzbp(11, zza);
    }

    public final void zzo(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel zza = zza();
        zzhs.zzf(zza, iObjectWrapper);
        zzbp(12, zza);
    }

    public final boolean zzp() throws RemoteException {
        Parcel zzbo = zzbo(13, zza());
        boolean zza = zzhs.zza(zzbo);
        zzbo.recycle();
        return zza;
    }

    public final boolean zzq() throws RemoteException {
        Parcel zzbo = zzbo(14, zza());
        boolean zza = zzhs.zza(zzbo);
        zzbo.recycle();
        return zza;
    }

    public final Bundle zzr() throws RemoteException {
        Parcel zzbo = zzbo(15, zza());
        Bundle bundle = (Bundle) zzhs.zzc(zzbo, Bundle.CREATOR);
        zzbo.recycle();
        return bundle;
    }

    public final void zzs(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel zza = zza();
        zzhs.zzf(zza, iObjectWrapper);
        zzbp(16, zza);
    }

    public final zzbdj zzt() throws RemoteException {
        Parcel zzbo = zzbo(17, zza());
        zzbdj zzb = zzbdi.zzb(zzbo.readStrongBinder());
        zzbo.recycle();
        return zzb;
    }

    public final IObjectWrapper zzu() throws RemoteException {
        Parcel zzbo = zzbo(18, zza());
        IObjectWrapper asInterface = IObjectWrapper.Stub.asInterface(zzbo.readStrongBinder());
        zzbo.recycle();
        return asInterface;
    }

    public final zzbic zzv() throws RemoteException {
        Parcel zzbo = zzbo(19, zza());
        zzbic zzj = zzbib.zzj(zzbo.readStrongBinder());
        zzbo.recycle();
        return zzj;
    }

    public final IObjectWrapper zzw() throws RemoteException {
        Parcel zzbo = zzbo(20, zza());
        IObjectWrapper asInterface = IObjectWrapper.Stub.asInterface(zzbo.readStrongBinder());
        zzbo.recycle();
        return asInterface;
    }

    public final IObjectWrapper zzx() throws RemoteException {
        Parcel zzbo = zzbo(21, zza());
        IObjectWrapper asInterface = IObjectWrapper.Stub.asInterface(zzbo.readStrongBinder());
        zzbo.recycle();
        return asInterface;
    }

    public final void zzy(IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2, IObjectWrapper iObjectWrapper3) throws RemoteException {
        Parcel zza = zza();
        zzhs.zzf(zza, iObjectWrapper);
        zzhs.zzf(zza, iObjectWrapper2);
        zzhs.zzf(zza, iObjectWrapper3);
        zzbp(22, zza);
    }
}
