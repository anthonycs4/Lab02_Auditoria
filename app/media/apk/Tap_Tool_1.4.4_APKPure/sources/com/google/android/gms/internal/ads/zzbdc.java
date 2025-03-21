package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
/* compiled from: com.google.android.gms:play-services-ads-lite@@20.2.0 */
/* loaded from: classes.dex */
public abstract class zzbdc extends zzhr implements zzbdd {
    public zzbdc() {
        super("com.google.android.gms.ads.internal.client.IOnPaidEventListener");
    }

    public static zzbdd zzb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IOnPaidEventListener");
        if (queryLocalInterface instanceof zzbdd) {
            return (zzbdd) queryLocalInterface;
        }
        return new zzbdb(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzhr
    protected final boolean zzbK(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            zze((zzazz) zzhs.zzc(parcel, zzazz.CREATOR));
            parcel2.writeNoException();
            return true;
        }
        return false;
    }
}
