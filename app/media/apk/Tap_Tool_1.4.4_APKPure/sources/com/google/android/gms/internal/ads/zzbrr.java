package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.ArrayList;
import java.util.List;
/* compiled from: com.google.android.gms:play-services-ads-lite@@20.2.0 */
/* loaded from: classes.dex */
public final class zzbrr extends zzhq implements zzbrt {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbrr(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.IUnifiedNativeAdMapper");
    }

    @Override // com.google.android.gms.internal.ads.zzbrt
    public final float zzA() throws RemoteException {
        Parcel zzbo = zzbo(24, zza());
        float readFloat = zzbo.readFloat();
        zzbo.recycle();
        return readFloat;
    }

    @Override // com.google.android.gms.internal.ads.zzbrt
    public final float zzB() throws RemoteException {
        Parcel zzbo = zzbo(25, zza());
        float readFloat = zzbo.readFloat();
        zzbo.recycle();
        return readFloat;
    }

    @Override // com.google.android.gms.internal.ads.zzbrt
    public final String zze() throws RemoteException {
        Parcel zzbo = zzbo(2, zza());
        String readString = zzbo.readString();
        zzbo.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.zzbrt
    public final List zzf() throws RemoteException {
        Parcel zzbo = zzbo(3, zza());
        ArrayList zzg = zzhs.zzg(zzbo);
        zzbo.recycle();
        return zzg;
    }

    @Override // com.google.android.gms.internal.ads.zzbrt
    public final String zzg() throws RemoteException {
        Parcel zzbo = zzbo(4, zza());
        String readString = zzbo.readString();
        zzbo.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.zzbrt
    public final zzbik zzh() throws RemoteException {
        Parcel zzbo = zzbo(5, zza());
        zzbik zzg = zzbij.zzg(zzbo.readStrongBinder());
        zzbo.recycle();
        return zzg;
    }

    @Override // com.google.android.gms.internal.ads.zzbrt
    public final String zzi() throws RemoteException {
        Parcel zzbo = zzbo(6, zza());
        String readString = zzbo.readString();
        zzbo.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.zzbrt
    public final String zzj() throws RemoteException {
        Parcel zzbo = zzbo(7, zza());
        String readString = zzbo.readString();
        zzbo.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.zzbrt
    public final double zzk() throws RemoteException {
        Parcel zzbo = zzbo(8, zza());
        double readDouble = zzbo.readDouble();
        zzbo.recycle();
        return readDouble;
    }

    @Override // com.google.android.gms.internal.ads.zzbrt
    public final String zzl() throws RemoteException {
        Parcel zzbo = zzbo(9, zza());
        String readString = zzbo.readString();
        zzbo.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.zzbrt
    public final String zzm() throws RemoteException {
        Parcel zzbo = zzbo(10, zza());
        String readString = zzbo.readString();
        zzbo.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.zzbrt
    public final zzbdj zzn() throws RemoteException {
        Parcel zzbo = zzbo(11, zza());
        zzbdj zzb = zzbdi.zzb(zzbo.readStrongBinder());
        zzbo.recycle();
        return zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzbrt
    public final zzbic zzo() throws RemoteException {
        Parcel zzbo = zzbo(12, zza());
        zzbic zzj = zzbib.zzj(zzbo.readStrongBinder());
        zzbo.recycle();
        return zzj;
    }

    @Override // com.google.android.gms.internal.ads.zzbrt
    public final IObjectWrapper zzp() throws RemoteException {
        Parcel zzbo = zzbo(13, zza());
        IObjectWrapper asInterface = IObjectWrapper.Stub.asInterface(zzbo.readStrongBinder());
        zzbo.recycle();
        return asInterface;
    }

    @Override // com.google.android.gms.internal.ads.zzbrt
    public final IObjectWrapper zzq() throws RemoteException {
        Parcel zzbo = zzbo(14, zza());
        IObjectWrapper asInterface = IObjectWrapper.Stub.asInterface(zzbo.readStrongBinder());
        zzbo.recycle();
        return asInterface;
    }

    @Override // com.google.android.gms.internal.ads.zzbrt
    public final IObjectWrapper zzr() throws RemoteException {
        Parcel zzbo = zzbo(15, zza());
        IObjectWrapper asInterface = IObjectWrapper.Stub.asInterface(zzbo.readStrongBinder());
        zzbo.recycle();
        return asInterface;
    }

    @Override // com.google.android.gms.internal.ads.zzbrt
    public final Bundle zzs() throws RemoteException {
        Parcel zzbo = zzbo(16, zza());
        Bundle bundle = (Bundle) zzhs.zzc(zzbo, Bundle.CREATOR);
        zzbo.recycle();
        return bundle;
    }

    @Override // com.google.android.gms.internal.ads.zzbrt
    public final boolean zzt() throws RemoteException {
        Parcel zzbo = zzbo(17, zza());
        boolean zza = zzhs.zza(zzbo);
        zzbo.recycle();
        return zza;
    }

    @Override // com.google.android.gms.internal.ads.zzbrt
    public final boolean zzu() throws RemoteException {
        Parcel zzbo = zzbo(18, zza());
        boolean zza = zzhs.zza(zzbo);
        zzbo.recycle();
        return zza;
    }

    @Override // com.google.android.gms.internal.ads.zzbrt
    public final void zzv() throws RemoteException {
        zzbp(19, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbrt
    public final void zzw(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel zza = zza();
        zzhs.zzf(zza, iObjectWrapper);
        zzbp(20, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbrt
    public final void zzx(IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2, IObjectWrapper iObjectWrapper3) throws RemoteException {
        Parcel zza = zza();
        zzhs.zzf(zza, iObjectWrapper);
        zzhs.zzf(zza, iObjectWrapper2);
        zzhs.zzf(zza, iObjectWrapper3);
        zzbp(21, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbrt
    public final void zzy(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel zza = zza();
        zzhs.zzf(zza, iObjectWrapper);
        zzbp(22, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbrt
    public final float zzz() throws RemoteException {
        Parcel zzbo = zzbo(23, zza());
        float readFloat = zzbo.readFloat();
        zzbo.recycle();
        return readFloat;
    }
}
