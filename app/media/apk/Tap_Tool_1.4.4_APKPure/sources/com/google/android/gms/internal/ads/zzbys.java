package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
/* compiled from: com.google.android.gms:play-services-ads-lite@@20.2.0 */
/* loaded from: classes.dex */
public final class zzbys extends zzhq implements IInterface {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbys(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.rewarded.client.IRewardedAdCreator");
    }

    public final IBinder zze(IObjectWrapper iObjectWrapper, String str, zzbre zzbreVar, int i) throws RemoteException {
        Parcel zza = zza();
        zzhs.zzf(zza, iObjectWrapper);
        zza.writeString(str);
        zzhs.zzf(zza, zzbreVar);
        zza.writeInt(ModuleDescriptor.MODULE_VERSION);
        Parcel zzbo = zzbo(1, zza);
        IBinder readStrongBinder = zzbo.readStrongBinder();
        zzbo.recycle();
        return readStrongBinder;
    }
}
