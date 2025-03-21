package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.List;
/* compiled from: com.google.android.gms:play-services-ads-lite@@20.2.0 */
/* loaded from: classes.dex */
public abstract class zzbkc extends zzhr implements zzbkd {
    public zzbkc() {
        super("com.google.android.gms.ads.internal.formats.client.IUnifiedNativeAd");
    }

    @Override // com.google.android.gms.internal.ads.zzhr
    protected final boolean zzbK(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        zzbka zzbjyVar;
        switch (i) {
            case 2:
                String zze = zze();
                parcel2.writeNoException();
                parcel2.writeString(zze);
                return true;
            case 3:
                List zzf = zzf();
                parcel2.writeNoException();
                parcel2.writeList(zzf);
                return true;
            case 4:
                String zzg = zzg();
                parcel2.writeNoException();
                parcel2.writeString(zzg);
                return true;
            case 5:
                zzbik zzh = zzh();
                parcel2.writeNoException();
                zzhs.zzf(parcel2, zzh);
                return true;
            case 6:
                String zzi = zzi();
                parcel2.writeNoException();
                parcel2.writeString(zzi);
                return true;
            case 7:
                String zzj = zzj();
                parcel2.writeNoException();
                parcel2.writeString(zzj);
                return true;
            case 8:
                double zzk = zzk();
                parcel2.writeNoException();
                parcel2.writeDouble(zzk);
                return true;
            case 9:
                String zzl = zzl();
                parcel2.writeNoException();
                parcel2.writeString(zzl);
                return true;
            case 10:
                String zzm = zzm();
                parcel2.writeNoException();
                parcel2.writeString(zzm);
                return true;
            case 11:
                zzbdj zzn = zzn();
                parcel2.writeNoException();
                zzhs.zzf(parcel2, zzn);
                return true;
            case 12:
                String zzo = zzo();
                parcel2.writeNoException();
                parcel2.writeString(zzo);
                return true;
            case 13:
                zzp();
                parcel2.writeNoException();
                return true;
            case 14:
                zzbic zzq = zzq();
                parcel2.writeNoException();
                zzhs.zzf(parcel2, zzq);
                return true;
            case 15:
                zzr((Bundle) zzhs.zzc(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                return true;
            case 16:
                boolean zzs = zzs((Bundle) zzhs.zzc(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                zzhs.zzb(parcel2, zzs);
                return true;
            case 17:
                zzt((Bundle) zzhs.zzc(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                return true;
            case 18:
                IObjectWrapper zzu = zzu();
                parcel2.writeNoException();
                zzhs.zzf(parcel2, zzu);
                return true;
            case 19:
                IObjectWrapper zzv = zzv();
                parcel2.writeNoException();
                zzhs.zzf(parcel2, zzv);
                return true;
            case 20:
                Bundle zzw = zzw();
                parcel2.writeNoException();
                zzhs.zze(parcel2, zzw);
                return true;
            case 21:
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder == null) {
                    zzbjyVar = null;
                } else {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IUnconfirmedClickListener");
                    if (queryLocalInterface instanceof zzbka) {
                        zzbjyVar = (zzbka) queryLocalInterface;
                    } else {
                        zzbjyVar = new zzbjy(readStrongBinder);
                    }
                }
                zzx(zzbjyVar);
                parcel2.writeNoException();
                return true;
            case 22:
                zzy();
                parcel2.writeNoException();
                return true;
            case 23:
                List zzz = zzz();
                parcel2.writeNoException();
                parcel2.writeList(zzz);
                return true;
            case 24:
                boolean zzA = zzA();
                parcel2.writeNoException();
                zzhs.zzb(parcel2, zzA);
                return true;
            case 25:
                zzB(zzbcs.zzb(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 26:
                zzC(zzbco.zzb(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 27:
                zzD();
                parcel2.writeNoException();
                return true;
            case 28:
                zzE();
                parcel2.writeNoException();
                return true;
            case 29:
                zzbih zzF = zzF();
                parcel2.writeNoException();
                zzhs.zzf(parcel2, zzF);
                return true;
            case 30:
                boolean zzG = zzG();
                parcel2.writeNoException();
                zzhs.zzb(parcel2, zzG);
                return true;
            case 31:
                zzbdg zzH = zzH();
                parcel2.writeNoException();
                zzhs.zzf(parcel2, zzH);
                return true;
            case 32:
                zzI(zzbdc.zzb(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
