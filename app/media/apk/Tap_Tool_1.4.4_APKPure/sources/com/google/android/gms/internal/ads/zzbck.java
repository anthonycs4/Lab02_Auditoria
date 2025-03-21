package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.List;
/* compiled from: com.google.android.gms:play-services-ads-lite@@20.2.0 */
/* loaded from: classes.dex */
public abstract class zzbck extends zzhr implements zzbcl {
    public zzbck() {
        super("com.google.android.gms.ads.internal.client.IMobileAdsSettingManager");
    }

    @Override // com.google.android.gms.internal.ads.zzhr
    protected final boolean zzbK(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        zzbcx zzbcvVar;
        switch (i) {
            case 1:
                zze();
                parcel2.writeNoException();
                return true;
            case 2:
                zzf(parcel.readFloat());
                parcel2.writeNoException();
                return true;
            case 3:
                zzg(parcel.readString());
                parcel2.writeNoException();
                return true;
            case 4:
                zzh(zzhs.zza(parcel));
                parcel2.writeNoException();
                return true;
            case 5:
                zzi(IObjectWrapper.Stub.asInterface(parcel.readStrongBinder()), parcel.readString());
                parcel2.writeNoException();
                return true;
            case 6:
                zzj(parcel.readString(), IObjectWrapper.Stub.asInterface(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 7:
                float zzk = zzk();
                parcel2.writeNoException();
                parcel2.writeFloat(zzk);
                return true;
            case 8:
                boolean zzl = zzl();
                parcel2.writeNoException();
                zzhs.zzb(parcel2, zzl);
                return true;
            case 9:
                String zzm = zzm();
                parcel2.writeNoException();
                parcel2.writeString(zzm);
                return true;
            case 10:
                zzn(parcel.readString());
                parcel2.writeNoException();
                return true;
            case 11:
                zzo(zzbrd.zzg(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 12:
                zzp(zzbnp.zzc(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 13:
                List<zzbnj> zzq = zzq();
                parcel2.writeNoException();
                parcel2.writeTypedList(zzq);
                return true;
            case 14:
                zzr((zzbes) zzhs.zzc(parcel, zzbes.CREATOR));
                parcel2.writeNoException();
                return true;
            case 15:
                zzs();
                parcel2.writeNoException();
                return true;
            case 16:
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder == null) {
                    zzbcvVar = null;
                } else {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IOnAdInspectorClosedListener");
                    if (queryLocalInterface instanceof zzbcx) {
                        zzbcvVar = (zzbcx) queryLocalInterface;
                    } else {
                        zzbcvVar = new zzbcv(readStrongBinder);
                    }
                }
                zzt(zzbcvVar);
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
