package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
/* compiled from: com.google.android.gms:play-services-ads-lite@@20.2.0 */
/* loaded from: classes.dex */
public final class zzbmo extends zzhq implements zzbmq {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbmo(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.h5.client.IH5AdsManagerCreator");
    }

    @Override // com.google.android.gms.internal.ads.zzbmq
    public final zzbmn zze(IObjectWrapper iObjectWrapper, zzbre zzbreVar, int i, zzbmk zzbmkVar) throws RemoteException {
        zzbmn zzbmlVar;
        Parcel zza = zza();
        zzhs.zzf(zza, iObjectWrapper);
        zzhs.zzf(zza, zzbreVar);
        zza.writeInt(ModuleDescriptor.MODULE_VERSION);
        zzhs.zzf(zza, zzbmkVar);
        Parcel zzbo = zzbo(1, zza);
        IBinder readStrongBinder = zzbo.readStrongBinder();
        if (readStrongBinder == null) {
            zzbmlVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.h5.client.IH5AdsManager");
            if (queryLocalInterface instanceof zzbmn) {
                zzbmlVar = (zzbmn) queryLocalInterface;
            } else {
                zzbmlVar = new zzbml(readStrongBinder);
            }
        }
        zzbo.recycle();
        return zzbmlVar;
    }
}
