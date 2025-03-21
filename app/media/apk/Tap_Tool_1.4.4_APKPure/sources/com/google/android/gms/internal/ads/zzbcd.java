package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
/* compiled from: com.google.android.gms:play-services-ads-lite@@20.2.0 */
/* loaded from: classes.dex */
public abstract class zzbcd extends zzhr implements zzbce {
    public zzbcd() {
        super("com.google.android.gms.ads.internal.client.IClientApi");
    }

    @Override // com.google.android.gms.internal.ads.zzhr
    protected final boolean zzbK(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        switch (i) {
            case 1:
                zzbbu zzb = zzb(IObjectWrapper.Stub.asInterface(parcel.readStrongBinder()), (zzazx) zzhs.zzc(parcel, zzazx.CREATOR), parcel.readString(), zzbrd.zzg(parcel.readStrongBinder()), parcel.readInt());
                parcel2.writeNoException();
                zzhs.zzf(parcel2, zzb);
                return true;
            case 2:
                zzbbu zzc = zzc(IObjectWrapper.Stub.asInterface(parcel.readStrongBinder()), (zzazx) zzhs.zzc(parcel, zzazx.CREATOR), parcel.readString(), zzbrd.zzg(parcel.readStrongBinder()), parcel.readInt());
                parcel2.writeNoException();
                zzhs.zzf(parcel2, zzc);
                return true;
            case 3:
                zzbbq zzd = zzd(IObjectWrapper.Stub.asInterface(parcel.readStrongBinder()), parcel.readString(), zzbrd.zzg(parcel.readStrongBinder()), parcel.readInt());
                parcel2.writeNoException();
                zzhs.zzf(parcel2, zzd);
                return true;
            case 4:
                IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                parcel2.writeNoException();
                zzhs.zzf(parcel2, null);
                return true;
            case 5:
                zzbio zze = zze(IObjectWrapper.Stub.asInterface(parcel.readStrongBinder()), IObjectWrapper.Stub.asInterface(parcel.readStrongBinder()));
                parcel2.writeNoException();
                zzhs.zzf(parcel2, zze);
                return true;
            case 6:
                zzbxy zzf = zzf(IObjectWrapper.Stub.asInterface(parcel.readStrongBinder()), zzbrd.zzg(parcel.readStrongBinder()), parcel.readInt());
                parcel2.writeNoException();
                zzhs.zzf(parcel2, zzf);
                return true;
            case 7:
                IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                parcel2.writeNoException();
                zzhs.zzf(parcel2, null);
                return true;
            case 8:
                zzbvo zzg = zzg(IObjectWrapper.Stub.asInterface(parcel.readStrongBinder()));
                parcel2.writeNoException();
                zzhs.zzf(parcel2, zzg);
                return true;
            case 9:
                zzbcl zzh = zzh(IObjectWrapper.Stub.asInterface(parcel.readStrongBinder()), parcel.readInt());
                parcel2.writeNoException();
                zzhs.zzf(parcel2, zzh);
                return true;
            case 10:
                zzbbu zzi = zzi(IObjectWrapper.Stub.asInterface(parcel.readStrongBinder()), (zzazx) zzhs.zzc(parcel, zzazx.CREATOR), parcel.readString(), parcel.readInt());
                parcel2.writeNoException();
                zzhs.zzf(parcel2, zzi);
                return true;
            case 11:
                zzbis zzj = zzj(IObjectWrapper.Stub.asInterface(parcel.readStrongBinder()), IObjectWrapper.Stub.asInterface(parcel.readStrongBinder()), IObjectWrapper.Stub.asInterface(parcel.readStrongBinder()));
                parcel2.writeNoException();
                zzhs.zzf(parcel2, zzj);
                return true;
            case 12:
                zzbyo zzk = zzk(IObjectWrapper.Stub.asInterface(parcel.readStrongBinder()), parcel.readString(), zzbrd.zzg(parcel.readStrongBinder()), parcel.readInt());
                parcel2.writeNoException();
                zzhs.zzf(parcel2, zzk);
                return true;
            case 13:
                zzbbu zzl = zzl(IObjectWrapper.Stub.asInterface(parcel.readStrongBinder()), (zzazx) zzhs.zzc(parcel, zzazx.CREATOR), parcel.readString(), zzbrd.zzg(parcel.readStrongBinder()), parcel.readInt());
                parcel2.writeNoException();
                zzhs.zzf(parcel2, zzl);
                return true;
            case 14:
                zzcbj zzm = zzm(IObjectWrapper.Stub.asInterface(parcel.readStrongBinder()), zzbrd.zzg(parcel.readStrongBinder()), parcel.readInt());
                parcel2.writeNoException();
                zzhs.zzf(parcel2, zzm);
                return true;
            case 15:
                zzbvc zzn = zzn(IObjectWrapper.Stub.asInterface(parcel.readStrongBinder()), zzbrd.zzg(parcel.readStrongBinder()), parcel.readInt());
                parcel2.writeNoException();
                zzhs.zzf(parcel2, zzn);
                return true;
            case 16:
                zzbmn zzo = zzo(IObjectWrapper.Stub.asInterface(parcel.readStrongBinder()), zzbrd.zzg(parcel.readStrongBinder()), parcel.readInt(), zzbmj.zzc(parcel.readStrongBinder()));
                parcel2.writeNoException();
                zzhs.zzf(parcel2, zzo);
                return true;
            default:
                return false;
        }
    }
}
