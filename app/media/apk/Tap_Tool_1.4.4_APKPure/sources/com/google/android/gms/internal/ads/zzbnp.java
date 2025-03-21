package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
/* compiled from: com.google.android.gms:play-services-ads-lite@@20.2.0 */
/* loaded from: classes.dex */
public abstract class zzbnp extends zzhr implements zzbnq {
    public zzbnp() {
        super("com.google.android.gms.ads.internal.initialization.IInitializationCallback");
    }

    public static zzbnq zzc(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.initialization.IInitializationCallback");
        if (queryLocalInterface instanceof zzbnq) {
            return (zzbnq) queryLocalInterface;
        }
        return new zzbno(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzhr
    protected final boolean zzbK(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            zzb(parcel.createTypedArrayList(zzbnj.CREATOR));
            parcel2.writeNoException();
            return true;
        }
        return false;
    }
}
