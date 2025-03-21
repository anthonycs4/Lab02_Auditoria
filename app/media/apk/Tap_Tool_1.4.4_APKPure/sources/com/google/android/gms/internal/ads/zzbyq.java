package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
/* compiled from: com.google.android.gms:play-services-ads-lite@@20.2.0 */
/* loaded from: classes.dex */
public abstract class zzbyq extends zzhr implements zzbyr {
    public zzbyq() {
        super("com.google.android.gms.ads.internal.rewarded.client.IRewardedAdCallback");
    }

    @Override // com.google.android.gms.internal.ads.zzhr
    protected final boolean zzbK(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        zzbyl zzbyjVar;
        switch (i) {
            case 1:
                zze();
                break;
            case 2:
                zzf();
                break;
            case 3:
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder == null) {
                    zzbyjVar = null;
                } else {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardItem");
                    if (queryLocalInterface instanceof zzbyl) {
                        zzbyjVar = (zzbyl) queryLocalInterface;
                    } else {
                        zzbyjVar = new zzbyj(readStrongBinder);
                    }
                }
                zzg(zzbyjVar);
                break;
            case 4:
                zzh(parcel.readInt());
                break;
            case 5:
                zzi((zzazm) zzhs.zzc(parcel, zzazm.CREATOR));
                break;
            case 6:
                zzj();
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
