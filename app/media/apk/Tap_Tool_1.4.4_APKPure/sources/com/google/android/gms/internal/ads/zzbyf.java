package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
/* compiled from: com.google.android.gms:play-services-ads-lite@@20.2.0 */
/* loaded from: classes.dex */
public abstract class zzbyf extends zzhr implements zzbyg {
    public zzbyf() {
        super("com.google.android.gms.ads.internal.reward.mediation.client.IMediationRewardedVideoAdListener");
    }

    public static zzbyg zzb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.reward.mediation.client.IMediationRewardedVideoAdListener");
        if (queryLocalInterface instanceof zzbyg) {
            return (zzbyg) queryLocalInterface;
        }
        return new zzbye(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzhr
    protected final boolean zzbK(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        switch (i) {
            case 1:
                zze(IObjectWrapper.Stub.asInterface(parcel.readStrongBinder()));
                break;
            case 2:
                zzf(IObjectWrapper.Stub.asInterface(parcel.readStrongBinder()), parcel.readInt());
                break;
            case 3:
                zzg(IObjectWrapper.Stub.asInterface(parcel.readStrongBinder()));
                break;
            case 4:
                zzh(IObjectWrapper.Stub.asInterface(parcel.readStrongBinder()));
                break;
            case 5:
                zzi(IObjectWrapper.Stub.asInterface(parcel.readStrongBinder()));
                break;
            case 6:
                zzj(IObjectWrapper.Stub.asInterface(parcel.readStrongBinder()));
                break;
            case 7:
                zzk(IObjectWrapper.Stub.asInterface(parcel.readStrongBinder()), (zzbyh) zzhs.zzc(parcel, zzbyh.CREATOR));
                break;
            case 8:
                zzl(IObjectWrapper.Stub.asInterface(parcel.readStrongBinder()));
                break;
            case 9:
                zzm(IObjectWrapper.Stub.asInterface(parcel.readStrongBinder()), parcel.readInt());
                break;
            case 10:
                zzn(IObjectWrapper.Stub.asInterface(parcel.readStrongBinder()));
                break;
            case 11:
                zzo(IObjectWrapper.Stub.asInterface(parcel.readStrongBinder()));
                break;
            case 12:
                Bundle bundle = (Bundle) zzhs.zzc(parcel, Bundle.CREATOR);
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
