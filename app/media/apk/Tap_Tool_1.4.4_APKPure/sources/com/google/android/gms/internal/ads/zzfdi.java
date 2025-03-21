package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzfdi extends zzhq implements IInterface {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzfdi(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.gass.internal.clearcut.IClearcut");
    }

    public final void zze() throws RemoteException {
        zzbp(3, zza());
    }

    public final void zzf(int[] iArr) throws RemoteException {
        Parcel zza = zza();
        zza.writeIntArray(null);
        zzbp(4, zza);
    }

    public final void zzg(byte[] bArr) throws RemoteException {
        Parcel zza = zza();
        zza.writeByteArray(bArr);
        zzbp(5, zza);
    }

    public final void zzh(int i) throws RemoteException {
        Parcel zza = zza();
        zza.writeInt(i);
        zzbp(6, zza);
    }

    public final void zzi(int i) throws RemoteException {
        Parcel zza = zza();
        zza.writeInt(i);
        zzbp(7, zza);
    }

    public final void zzj(IObjectWrapper iObjectWrapper, String str, String str2) throws RemoteException {
        Parcel zza = zza();
        zzhs.zzf(zza, iObjectWrapper);
        zza.writeString(str);
        zza.writeString(null);
        zzbp(8, zza);
    }
}
