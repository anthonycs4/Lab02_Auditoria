package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
/* compiled from: com.google.android.gms:play-services-ads-lite@@20.2.0 */
/* loaded from: classes.dex */
public abstract class zzaud extends zzhr implements zzaue {
    public zzaud() {
        super("com.google.android.gms.ads.internal.appopen.client.IAppOpenAdLoadCallback");
    }

    public static zzaue zze(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.appopen.client.IAppOpenAdLoadCallback");
        if (queryLocalInterface instanceof zzaue) {
            return (zzaue) queryLocalInterface;
        }
        return new zzauc(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzhr
    protected final boolean zzbK(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        zzaub zzatzVar;
        if (i == 1) {
            IBinder readStrongBinder = parcel.readStrongBinder();
            if (readStrongBinder == null) {
                zzatzVar = null;
            } else {
                IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.appopen.client.IAppOpenAd");
                if (queryLocalInterface instanceof zzaub) {
                    zzatzVar = (zzaub) queryLocalInterface;
                } else {
                    zzatzVar = new zzatz(readStrongBinder);
                }
            }
            zzb(zzatzVar);
        } else if (i == 2) {
            parcel.readInt();
        } else if (i != 3) {
            return false;
        } else {
            zzd((zzazm) zzhs.zzc(parcel, zzazm.CREATOR));
        }
        parcel2.writeNoException();
        return true;
    }
}
