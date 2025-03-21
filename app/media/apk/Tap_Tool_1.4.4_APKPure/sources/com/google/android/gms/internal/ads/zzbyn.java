package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
/* compiled from: com.google.android.gms:play-services-ads-lite@@20.2.0 */
/* loaded from: classes.dex */
public abstract class zzbyn extends zzhr implements zzbyo {
    public zzbyn() {
        super("com.google.android.gms.ads.internal.rewarded.client.IRewardedAd");
    }

    public static zzbyo zzq(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAd");
        if (queryLocalInterface instanceof zzbyo) {
            return (zzbyo) queryLocalInterface;
        }
        return new zzbym(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzhr
    protected final boolean zzbK(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        zzbyv zzbyvVar = null;
        zzbyv zzbyvVar2 = null;
        zzbyw zzbywVar = null;
        zzbyr zzbyrVar = null;
        switch (i) {
            case 1:
                zzazs zzazsVar = (zzazs) zzhs.zzc(parcel, zzazs.CREATOR);
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAdLoadCallback");
                    if (queryLocalInterface instanceof zzbyv) {
                        zzbyvVar = (zzbyv) queryLocalInterface;
                    } else {
                        zzbyvVar = new zzbyt(readStrongBinder);
                    }
                }
                zzc(zzazsVar, zzbyvVar);
                parcel2.writeNoException();
                return true;
            case 2:
                IBinder readStrongBinder2 = parcel.readStrongBinder();
                if (readStrongBinder2 != null) {
                    IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAdCallback");
                    if (queryLocalInterface2 instanceof zzbyr) {
                        zzbyrVar = (zzbyr) queryLocalInterface2;
                    } else {
                        zzbyrVar = new zzbyp(readStrongBinder2);
                    }
                }
                zze(zzbyrVar);
                parcel2.writeNoException();
                return true;
            case 3:
                boolean zzi = zzi();
                parcel2.writeNoException();
                zzhs.zzb(parcel2, zzi);
                return true;
            case 4:
                String zzj = zzj();
                parcel2.writeNoException();
                parcel2.writeString(zzj);
                return true;
            case 5:
                zzb(IObjectWrapper.Stub.asInterface(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 6:
                IBinder readStrongBinder3 = parcel.readStrongBinder();
                if (readStrongBinder3 != null) {
                    IInterface queryLocalInterface3 = readStrongBinder3.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAdSkuListener");
                    if (queryLocalInterface3 instanceof zzbyw) {
                        zzbywVar = (zzbyw) queryLocalInterface3;
                    } else {
                        zzbywVar = new zzbyw(readStrongBinder3);
                    }
                }
                zzp(zzbywVar);
                parcel2.writeNoException();
                return true;
            case 7:
                zzh((zzbzc) zzhs.zzc(parcel, zzbzc.CREATOR));
                parcel2.writeNoException();
                return true;
            case 8:
                zzf(zzbcz.zzb(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 9:
                Bundle zzg = zzg();
                parcel2.writeNoException();
                zzhs.zze(parcel2, zzg);
                return true;
            case 10:
                zzk(IObjectWrapper.Stub.asInterface(parcel.readStrongBinder()), zzhs.zza(parcel));
                parcel2.writeNoException();
                return true;
            case 11:
                zzbyl zzl = zzl();
                parcel2.writeNoException();
                zzhs.zzf(parcel2, zzl);
                return true;
            case 12:
                zzbdg zzm = zzm();
                parcel2.writeNoException();
                zzhs.zzf(parcel2, zzm);
                return true;
            case 13:
                zzn(zzbdc.zzb(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 14:
                zzazs zzazsVar2 = (zzazs) zzhs.zzc(parcel, zzazs.CREATOR);
                IBinder readStrongBinder4 = parcel.readStrongBinder();
                if (readStrongBinder4 != null) {
                    IInterface queryLocalInterface4 = readStrongBinder4.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAdLoadCallback");
                    if (queryLocalInterface4 instanceof zzbyv) {
                        zzbyvVar2 = (zzbyv) queryLocalInterface4;
                    } else {
                        zzbyvVar2 = new zzbyt(readStrongBinder4);
                    }
                }
                zzd(zzazsVar2, zzbyvVar2);
                parcel2.writeNoException();
                return true;
            case 15:
                zzo(zzhs.zza(parcel));
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
