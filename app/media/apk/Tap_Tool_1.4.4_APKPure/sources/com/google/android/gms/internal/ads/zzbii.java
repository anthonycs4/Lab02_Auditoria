package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
/* compiled from: com.google.android.gms:play-services-ads-lite@@20.2.0 */
/* loaded from: classes.dex */
public final class zzbii extends zzhq implements zzbik {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbii(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.INativeAdImage");
    }

    @Override // com.google.android.gms.internal.ads.zzbik
    public final IObjectWrapper zzb() throws RemoteException {
        Parcel zzbo = zzbo(1, zza());
        IObjectWrapper asInterface = IObjectWrapper.Stub.asInterface(zzbo.readStrongBinder());
        zzbo.recycle();
        return asInterface;
    }

    @Override // com.google.android.gms.internal.ads.zzbik
    public final Uri zzc() throws RemoteException {
        Parcel zzbo = zzbo(2, zza());
        Uri uri = (Uri) zzhs.zzc(zzbo, Uri.CREATOR);
        zzbo.recycle();
        return uri;
    }

    @Override // com.google.android.gms.internal.ads.zzbik
    public final double zzd() throws RemoteException {
        Parcel zzbo = zzbo(3, zza());
        double readDouble = zzbo.readDouble();
        zzbo.recycle();
        return readDouble;
    }

    @Override // com.google.android.gms.internal.ads.zzbik
    public final int zze() throws RemoteException {
        Parcel zzbo = zzbo(4, zza());
        int readInt = zzbo.readInt();
        zzbo.recycle();
        return readInt;
    }

    @Override // com.google.android.gms.internal.ads.zzbik
    public final int zzf() throws RemoteException {
        Parcel zzbo = zzbo(5, zza());
        int readInt = zzbo.readInt();
        zzbo.recycle();
        return readInt;
    }
}
