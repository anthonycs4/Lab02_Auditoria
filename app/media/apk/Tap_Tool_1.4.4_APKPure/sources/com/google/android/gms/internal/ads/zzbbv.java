package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
/* compiled from: com.google.android.gms:play-services-ads-lite@@20.2.0 */
/* loaded from: classes.dex */
public final class zzbbv extends zzhq implements IInterface {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbbv(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdManagerCreator");
    }

    public final IBinder zze(IObjectWrapper iObjectWrapper, zzazx zzazxVar, String str, zzbre zzbreVar, int i, int i2) throws RemoteException {
        Parcel zza = zza();
        zzhs.zzf(zza, iObjectWrapper);
        zzhs.zzd(zza, zzazxVar);
        zza.writeString(str);
        zzhs.zzf(zza, zzbreVar);
        zza.writeInt(ModuleDescriptor.MODULE_VERSION);
        zza.writeInt(i2);
        Parcel zzbo = zzbo(2, zza);
        IBinder readStrongBinder = zzbo.readStrongBinder();
        zzbo.recycle();
        return readStrongBinder;
    }
}
