package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
/* compiled from: com.google.android.gms:play-services-ads-lite@@20.2.0 */
/* loaded from: classes.dex */
public final class zzbif extends zzhq implements zzbih {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbif(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IMediaContent");
    }

    @Override // com.google.android.gms.internal.ads.zzbih
    public final float zze() throws RemoteException {
        Parcel zzbo = zzbo(2, zza());
        float readFloat = zzbo.readFloat();
        zzbo.recycle();
        return readFloat;
    }

    @Override // com.google.android.gms.internal.ads.zzbih
    public final void zzf(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel zza = zza();
        zzhs.zzf(zza, iObjectWrapper);
        zzbp(3, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbih
    public final IObjectWrapper zzg() throws RemoteException {
        Parcel zzbo = zzbo(4, zza());
        IObjectWrapper asInterface = IObjectWrapper.Stub.asInterface(zzbo.readStrongBinder());
        zzbo.recycle();
        return asInterface;
    }

    @Override // com.google.android.gms.internal.ads.zzbih
    public final float zzh() throws RemoteException {
        Parcel zzbo = zzbo(5, zza());
        float readFloat = zzbo.readFloat();
        zzbo.recycle();
        return readFloat;
    }

    @Override // com.google.android.gms.internal.ads.zzbih
    public final float zzi() throws RemoteException {
        Parcel zzbo = zzbo(6, zza());
        float readFloat = zzbo.readFloat();
        zzbo.recycle();
        return readFloat;
    }

    @Override // com.google.android.gms.internal.ads.zzbih
    public final zzbdj zzj() throws RemoteException {
        Parcel zzbo = zzbo(7, zza());
        zzbdj zzb = zzbdi.zzb(zzbo.readStrongBinder());
        zzbo.recycle();
        return zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzbih
    public final boolean zzk() throws RemoteException {
        Parcel zzbo = zzbo(8, zza());
        boolean zza = zzhs.zza(zzbo);
        zzbo.recycle();
        return zza;
    }

    @Override // com.google.android.gms.internal.ads.zzbih
    public final void zzl(zzbjo zzbjoVar) throws RemoteException {
        throw null;
    }
}
