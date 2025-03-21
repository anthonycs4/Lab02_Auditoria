package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
/* compiled from: com.google.android.gms:play-services-ads-lite@@20.2.0 */
/* loaded from: classes.dex */
public abstract class zzbrd extends zzhr implements zzbre {
    public zzbrd() {
        super("com.google.android.gms.ads.internal.mediation.client.IAdapterCreator");
    }

    public static zzbre zzg(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IAdapterCreator");
        if (queryLocalInterface instanceof zzbre) {
            return (zzbre) queryLocalInterface;
        }
        return new zzbrc(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzhr
    protected final boolean zzbK(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            zzbrh zzb = zzb(parcel.readString());
            parcel2.writeNoException();
            zzhs.zzf(parcel2, zzb);
        } else if (i == 2) {
            boolean zzc = zzc(parcel.readString());
            parcel2.writeNoException();
            zzhs.zzb(parcel2, zzc);
        } else if (i == 3) {
            zzbtl zzf = zzf(parcel.readString());
            parcel2.writeNoException();
            zzhs.zzf(parcel2, zzf);
        } else if (i != 4) {
            return false;
        } else {
            boolean zzd = zzd(parcel.readString());
            parcel2.writeNoException();
            zzhs.zzb(parcel2, zzd);
        }
        return true;
    }
}
