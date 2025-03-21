package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
/* compiled from: com.google.android.gms:play-services-ads-lite@@20.2.0 */
/* loaded from: classes.dex */
public abstract class zzbxx extends zzhr implements zzbxy {
    public zzbxx() {
        super("com.google.android.gms.ads.internal.reward.client.IRewardedVideoAd");
    }

    @Override // com.google.android.gms.internal.ads.zzhr
    protected final boolean zzbK(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            zzb((zzbyc) zzhs.zzc(parcel, zzbyc.CREATOR));
            parcel2.writeNoException();
        } else if (i != 2) {
            zzbyb zzbybVar = null;
            zzbxw zzbxwVar = null;
            if (i == 3) {
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.reward.client.IRewardedVideoAdListener");
                    if (queryLocalInterface instanceof zzbyb) {
                        zzbybVar = (zzbyb) queryLocalInterface;
                    } else {
                        zzbybVar = new zzbxz(readStrongBinder);
                    }
                }
                zzd(zzbybVar);
                parcel2.writeNoException();
            } else if (i == 34) {
                zzr(zzhs.zza(parcel));
                parcel2.writeNoException();
            } else {
                switch (i) {
                    case 5:
                        boolean zze = zze();
                        parcel2.writeNoException();
                        zzhs.zzb(parcel2, zze);
                        break;
                    case 6:
                        zzf();
                        parcel2.writeNoException();
                        break;
                    case 7:
                        zzg();
                        parcel2.writeNoException();
                        break;
                    case 8:
                        zzh();
                        parcel2.writeNoException();
                        break;
                    case 9:
                        zzi(IObjectWrapper.Stub.asInterface(parcel.readStrongBinder()));
                        parcel2.writeNoException();
                        break;
                    case 10:
                        zzj(IObjectWrapper.Stub.asInterface(parcel.readStrongBinder()));
                        parcel2.writeNoException();
                        break;
                    case 11:
                        zzk(IObjectWrapper.Stub.asInterface(parcel.readStrongBinder()));
                        parcel2.writeNoException();
                        break;
                    case 12:
                        String zzl = zzl();
                        parcel2.writeNoException();
                        parcel2.writeString(zzl);
                        break;
                    case 13:
                        zzm(parcel.readString());
                        parcel2.writeNoException();
                        break;
                    case 14:
                        zzn(zzbbx.zzb(parcel.readStrongBinder()));
                        parcel2.writeNoException();
                        break;
                    case 15:
                        Bundle zzo = zzo();
                        parcel2.writeNoException();
                        zzhs.zze(parcel2, zzo);
                        break;
                    case 16:
                        IBinder readStrongBinder2 = parcel.readStrongBinder();
                        if (readStrongBinder2 != null) {
                            IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.reward.client.IRewardedAdSkuListener");
                            if (queryLocalInterface2 instanceof zzbxw) {
                                zzbxwVar = (zzbxw) queryLocalInterface2;
                            } else {
                                zzbxwVar = new zzbxw(readStrongBinder2);
                            }
                        }
                        zzu(zzbxwVar);
                        parcel2.writeNoException();
                        break;
                    case 17:
                        parcel.readString();
                        parcel2.writeNoException();
                        break;
                    case 18:
                        zzp(IObjectWrapper.Stub.asInterface(parcel.readStrongBinder()));
                        parcel2.writeNoException();
                        break;
                    case 19:
                        zzq(parcel.readString());
                        parcel2.writeNoException();
                        break;
                    case 20:
                        boolean zzs = zzs();
                        parcel2.writeNoException();
                        zzhs.zzb(parcel2, zzs);
                        break;
                    case 21:
                        zzbdg zzt = zzt();
                        parcel2.writeNoException();
                        zzhs.zzf(parcel2, zzt);
                        break;
                    default:
                        return false;
                }
            }
        } else {
            zzc();
            parcel2.writeNoException();
        }
        return true;
    }
}
