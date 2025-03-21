package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public abstract class zzbww extends zzhr implements zzbwx {
    public zzbww() {
        super("com.google.android.gms.ads.internal.request.IAdRequestService");
    }

    @Override // com.google.android.gms.internal.ads.zzhr
    protected final boolean zzbK(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        zzbxb zzbxbVar = null;
        if (i == 1) {
            zzbwr zzbwrVar = (zzbwr) zzhs.zzc(parcel, zzbwr.CREATOR);
            parcel2.writeNoException();
            zzhs.zze(parcel2, null);
        } else if (i == 2) {
            zzbwr zzbwrVar2 = (zzbwr) zzhs.zzc(parcel, zzbwr.CREATOR);
            IBinder readStrongBinder = parcel.readStrongBinder();
            if (readStrongBinder != null) {
                IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.request.IAdResponseListener");
                if (queryLocalInterface instanceof zzbwy) {
                    zzbwy zzbwyVar = (zzbwy) queryLocalInterface;
                } else {
                    new zzbwy(readStrongBinder);
                }
            }
            parcel2.writeNoException();
        } else if (i == 4) {
            zzbxf zzbxfVar = (zzbxf) zzhs.zzc(parcel, zzbxf.CREATOR);
            IBinder readStrongBinder2 = parcel.readStrongBinder();
            if (readStrongBinder2 != null) {
                IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
                if (queryLocalInterface2 instanceof zzbxb) {
                    zzbxbVar = (zzbxb) queryLocalInterface2;
                } else {
                    zzbxbVar = new zzbwz(readStrongBinder2);
                }
            }
            zze(zzbxfVar, zzbxbVar);
            parcel2.writeNoException();
        } else if (i == 5) {
            zzbxf zzbxfVar2 = (zzbxf) zzhs.zzc(parcel, zzbxf.CREATOR);
            IBinder readStrongBinder3 = parcel.readStrongBinder();
            if (readStrongBinder3 != null) {
                IInterface queryLocalInterface3 = readStrongBinder3.queryLocalInterface("com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
                if (queryLocalInterface3 instanceof zzbxb) {
                    zzbxbVar = (zzbxb) queryLocalInterface3;
                } else {
                    zzbxbVar = new zzbwz(readStrongBinder3);
                }
            }
            zzf(zzbxfVar2, zzbxbVar);
            parcel2.writeNoException();
        } else if (i == 6) {
            zzbxf zzbxfVar3 = (zzbxf) zzhs.zzc(parcel, zzbxf.CREATOR);
            IBinder readStrongBinder4 = parcel.readStrongBinder();
            if (readStrongBinder4 != null) {
                IInterface queryLocalInterface4 = readStrongBinder4.queryLocalInterface("com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
                if (queryLocalInterface4 instanceof zzbxb) {
                    zzbxbVar = (zzbxb) queryLocalInterface4;
                } else {
                    zzbxbVar = new zzbwz(readStrongBinder4);
                }
            }
            zzg(zzbxfVar3, zzbxbVar);
            parcel2.writeNoException();
        } else if (i != 7) {
            return false;
        } else {
            String readString = parcel.readString();
            IBinder readStrongBinder5 = parcel.readStrongBinder();
            if (readStrongBinder5 != null) {
                IInterface queryLocalInterface5 = readStrongBinder5.queryLocalInterface("com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
                if (queryLocalInterface5 instanceof zzbxb) {
                    zzbxbVar = (zzbxb) queryLocalInterface5;
                } else {
                    zzbxbVar = new zzbwz(readStrongBinder5);
                }
            }
            zzh(readString, zzbxbVar);
            parcel2.writeNoException();
        }
        return true;
    }
}
