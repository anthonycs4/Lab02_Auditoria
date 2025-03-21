package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.ads.formats.AdManagerAdViewOptions;
import com.google.android.gms.ads.formats.PublisherAdViewOptions;
/* compiled from: com.google.android.gms:play-services-ads-lite@@20.2.0 */
/* loaded from: classes.dex */
public abstract class zzbbp extends zzhr implements zzbbq {
    public zzbbp() {
        super("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
    }

    @Override // com.google.android.gms.internal.ads.zzhr
    protected final boolean zzbK(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        zzbbh zzbbhVar = null;
        zzbcf zzbcfVar = null;
        switch (i) {
            case 1:
                zzbbn zze = zze();
                parcel2.writeNoException();
                zzhs.zzf(parcel2, zze);
                return true;
            case 2:
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdListener");
                    if (queryLocalInterface instanceof zzbbh) {
                        zzbbhVar = (zzbbh) queryLocalInterface;
                    } else {
                        zzbbhVar = new zzbbf(readStrongBinder);
                    }
                }
                zzf(zzbbhVar);
                parcel2.writeNoException();
                return true;
            case 3:
                zzg(zzbjd.zzb(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 4:
                zzh(zzbjg.zzb(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 5:
                zzi(parcel.readString(), zzbjm.zzb(parcel.readStrongBinder()), zzbjj.zzb(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 6:
                zzj((zzbhy) zzhs.zzc(parcel, zzbhy.CREATOR));
                parcel2.writeNoException();
                return true;
            case 7:
                IBinder readStrongBinder2 = parcel.readStrongBinder();
                if (readStrongBinder2 != null) {
                    IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.client.ICorrelationIdProvider");
                    if (queryLocalInterface2 instanceof zzbcf) {
                        zzbcfVar = (zzbcf) queryLocalInterface2;
                    } else {
                        zzbcfVar = new zzbcf(readStrongBinder2);
                    }
                }
                zzq(zzbcfVar);
                parcel2.writeNoException();
                return true;
            case 8:
                zzk(zzbjq.zzb(parcel.readStrongBinder()), (zzazx) zzhs.zzc(parcel, zzazx.CREATOR));
                parcel2.writeNoException();
                return true;
            case 9:
                zzl((PublisherAdViewOptions) zzhs.zzc(parcel, PublisherAdViewOptions.CREATOR));
                parcel2.writeNoException();
                return true;
            case 10:
                zzm(zzbjt.zzb(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 11:
            case 12:
            default:
                return false;
            case 13:
                zzn((zzbnv) zzhs.zzc(parcel, zzbnv.CREATOR));
                parcel2.writeNoException();
                return true;
            case 14:
                zzo(zzbod.zzb(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 15:
                zzp((AdManagerAdViewOptions) zzhs.zzc(parcel, AdManagerAdViewOptions.CREATOR));
                parcel2.writeNoException();
                return true;
        }
    }
}
