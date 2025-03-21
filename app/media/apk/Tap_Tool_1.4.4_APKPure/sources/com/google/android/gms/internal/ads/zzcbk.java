package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
/* compiled from: com.google.android.gms:play-services-ads-lite@@20.2.0 */
/* loaded from: classes.dex */
public final class zzcbk extends zzhq implements zzcbm {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzcbk(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.signals.ISignalGeneratorCreator");
    }

    @Override // com.google.android.gms.internal.ads.zzcbm
    public final zzcbj zze(IObjectWrapper iObjectWrapper, zzbre zzbreVar, int i) throws RemoteException {
        zzcbj zzcbhVar;
        Parcel zza = zza();
        zzhs.zzf(zza, iObjectWrapper);
        zzhs.zzf(zza, zzbreVar);
        zza.writeInt(ModuleDescriptor.MODULE_VERSION);
        Parcel zzbo = zzbo(2, zza);
        IBinder readStrongBinder = zzbo.readStrongBinder();
        if (readStrongBinder == null) {
            zzcbhVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.signals.ISignalGenerator");
            if (queryLocalInterface instanceof zzcbj) {
                zzcbhVar = (zzcbj) queryLocalInterface;
            } else {
                zzcbhVar = new zzcbh(readStrongBinder);
            }
        }
        zzbo.recycle();
        return zzcbhVar;
    }
}
