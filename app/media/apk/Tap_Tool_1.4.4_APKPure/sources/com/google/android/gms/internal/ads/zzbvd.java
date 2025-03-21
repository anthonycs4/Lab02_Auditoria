package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
/* compiled from: com.google.android.gms:play-services-ads-lite@@20.2.0 */
/* loaded from: classes.dex */
public final class zzbvd extends zzhq implements zzbvf {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbvd(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.offline.IOfflineUtilsCreator");
    }

    @Override // com.google.android.gms.internal.ads.zzbvf
    public final zzbvc zze(IObjectWrapper iObjectWrapper, zzbre zzbreVar, int i) throws RemoteException {
        zzbvc zzbvaVar;
        Parcel zza = zza();
        zzhs.zzf(zza, iObjectWrapper);
        zzhs.zzf(zza, zzbreVar);
        zza.writeInt(ModuleDescriptor.MODULE_VERSION);
        Parcel zzbo = zzbo(1, zza);
        IBinder readStrongBinder = zzbo.readStrongBinder();
        if (readStrongBinder == null) {
            zzbvaVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.offline.IOfflineUtils");
            if (queryLocalInterface instanceof zzbvc) {
                zzbvaVar = (zzbvc) queryLocalInterface;
            } else {
                zzbvaVar = new zzbva(readStrongBinder);
            }
        }
        zzbo.recycle();
        return zzbvaVar;
    }
}
