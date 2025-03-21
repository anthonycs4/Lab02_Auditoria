package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
/* compiled from: com.google.android.gms:play-services-ads-lite@@20.2.0 */
/* loaded from: classes.dex */
public abstract class zzbnx extends zzhr implements zzbny {
    public zzbnx() {
        super("com.google.android.gms.ads.internal.instream.client.IInstreamAd");
    }

    @Override // com.google.android.gms.internal.ads.zzhr
    protected final boolean zzbK(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        zzbob zzbnzVar;
        if (i == 3) {
            zzbdj zzb = zzb();
            parcel2.writeNoException();
            zzhs.zzf(parcel2, zzb);
            return true;
        } else if (i == 4) {
            zzc();
            parcel2.writeNoException();
            return true;
        } else if (i != 5) {
            if (i == 6) {
                zze(IObjectWrapper.Stub.asInterface(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            } else if (i != 7) {
                return false;
            } else {
                zzbih zzf = zzf();
                parcel2.writeNoException();
                zzhs.zzf(parcel2, zzf);
                return true;
            }
        } else {
            IObjectWrapper asInterface = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
            IBinder readStrongBinder = parcel.readStrongBinder();
            if (readStrongBinder == null) {
                zzbnzVar = null;
            } else {
                IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.instream.client.IInstreamAdCallback");
                if (queryLocalInterface instanceof zzbob) {
                    zzbnzVar = (zzbob) queryLocalInterface;
                } else {
                    zzbnzVar = new zzbnz(readStrongBinder);
                }
            }
            zzd(asInterface, zzbnzVar);
            parcel2.writeNoException();
            return true;
        }
    }
}
