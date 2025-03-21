package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
/* compiled from: com.google.android.gms:play-services-ads-lite@@20.2.0 */
/* loaded from: classes.dex */
public abstract class zzaua extends zzhr implements zzaub {
    public zzaua() {
        super("com.google.android.gms.ads.internal.appopen.client.IAppOpenAd");
    }

    @Override // com.google.android.gms.internal.ads.zzhr
    protected final boolean zzbK(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        zzauf zzaufVar = null;
        zzaui zzauiVar = null;
        switch (i) {
            case 2:
                zzbbu zze = zze();
                parcel2.writeNoException();
                zzhs.zzf(parcel2, zze);
                return true;
            case 3:
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.appopen.client.IAppOpenAdPresentationCallback");
                    if (queryLocalInterface instanceof zzauf) {
                        zzaufVar = (zzauf) queryLocalInterface;
                    } else {
                        zzaufVar = new zzauf(readStrongBinder);
                    }
                }
                zzj(zzaufVar);
                parcel2.writeNoException();
                return true;
            case 4:
                IObjectWrapper asInterface = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                IBinder readStrongBinder2 = parcel.readStrongBinder();
                if (readStrongBinder2 != null) {
                    IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.appopen.client.IAppOpenFullScreenContentCallback");
                    if (queryLocalInterface2 instanceof zzaui) {
                        zzauiVar = (zzaui) queryLocalInterface2;
                    } else {
                        zzauiVar = new zzaug(readStrongBinder2);
                    }
                }
                zzf(asInterface, zzauiVar);
                parcel2.writeNoException();
                return true;
            case 5:
                zzbdg zzg = zzg();
                parcel2.writeNoException();
                zzhs.zzf(parcel2, zzg);
                return true;
            case 6:
                zzh(zzhs.zza(parcel));
                parcel2.writeNoException();
                return true;
            case 7:
                zzi(zzbdc.zzb(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
