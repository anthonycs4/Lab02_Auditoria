package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
/* compiled from: com.google.android.gms:play-services-ads-lite@@20.2.0 */
/* loaded from: classes.dex */
public abstract class zzbbt extends zzhr implements zzbbu {
    public zzbbt() {
        super("com.google.android.gms.ads.internal.client.IAdManager");
    }

    public static zzbbu zzac(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
        if (queryLocalInterface instanceof zzbbu) {
            return (zzbbu) queryLocalInterface;
        }
        return new zzbbs(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzhr
    protected final boolean zzbK(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        zzbbh zzbbhVar = null;
        zzbci zzbciVar = null;
        zzbbk zzbbkVar = null;
        zzbdd zzbddVar = null;
        zzbby zzbbyVar = null;
        zzbcf zzbcfVar = null;
        zzbbe zzbbeVar = null;
        zzbcb zzbcbVar = null;
        switch (i) {
            case 1:
                IObjectWrapper zzb = zzb();
                parcel2.writeNoException();
                zzhs.zzf(parcel2, zzb);
                return true;
            case 2:
                zzc();
                parcel2.writeNoException();
                return true;
            case 3:
                boolean zzbS = zzbS();
                parcel2.writeNoException();
                zzhs.zzb(parcel2, zzbS);
                return true;
            case 4:
                boolean zze = zze((zzazs) zzhs.zzc(parcel, zzazs.CREATOR));
                parcel2.writeNoException();
                zzhs.zzb(parcel2, zze);
                return true;
            case 5:
                zzf();
                parcel2.writeNoException();
                return true;
            case 6:
                zzg();
                parcel2.writeNoException();
                return true;
            case 7:
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdListener");
                    if (queryLocalInterface instanceof zzbbh) {
                        zzbbhVar = (zzbbh) queryLocalInterface;
                    } else {
                        zzbbhVar = new zzbbf(readStrongBinder);
                    }
                }
                zzh(zzbbhVar);
                parcel2.writeNoException();
                return true;
            case 8:
                IBinder readStrongBinder2 = parcel.readStrongBinder();
                if (readStrongBinder2 != null) {
                    IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.client.IAppEventListener");
                    if (queryLocalInterface2 instanceof zzbcb) {
                        zzbcbVar = (zzbcb) queryLocalInterface2;
                    } else {
                        zzbcbVar = new zzbbz(readStrongBinder2);
                    }
                }
                zzi(zzbcbVar);
                parcel2.writeNoException();
                return true;
            case 9:
                zzl();
                parcel2.writeNoException();
                return true;
            case 10:
                parcel2.writeNoException();
                return true;
            case 11:
                zzm();
                parcel2.writeNoException();
                return true;
            case 12:
                zzazx zzn = zzn();
                parcel2.writeNoException();
                zzhs.zze(parcel2, zzn);
                return true;
            case 13:
                zzo((zzazx) zzhs.zzc(parcel, zzazx.CREATOR));
                parcel2.writeNoException();
                return true;
            case 14:
                zzp(zzbvu.zzb(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 15:
                zzq(zzbvx.zzb(parcel.readStrongBinder()), parcel.readString());
                parcel2.writeNoException();
                return true;
            case 16:
            case 17:
            case 27:
            case 28:
            default:
                return false;
            case 18:
                String zzr = zzr();
                parcel2.writeNoException();
                parcel2.writeString(zzr);
                return true;
            case 19:
                zzx(zzbgk.zzb(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 20:
                IBinder readStrongBinder3 = parcel.readStrongBinder();
                if (readStrongBinder3 != null) {
                    IInterface queryLocalInterface3 = readStrongBinder3.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdClickListener");
                    if (queryLocalInterface3 instanceof zzbbe) {
                        zzbbeVar = (zzbbe) queryLocalInterface3;
                    } else {
                        zzbbeVar = new zzbbc(readStrongBinder3);
                    }
                }
                zzy(zzbbeVar);
                parcel2.writeNoException();
                return true;
            case 21:
                IBinder readStrongBinder4 = parcel.readStrongBinder();
                if (readStrongBinder4 != null) {
                    IInterface queryLocalInterface4 = readStrongBinder4.queryLocalInterface("com.google.android.gms.ads.internal.client.ICorrelationIdProvider");
                    if (queryLocalInterface4 instanceof zzbcf) {
                        zzbcfVar = (zzbcf) queryLocalInterface4;
                    } else {
                        zzbcfVar = new zzbcf(readStrongBinder4);
                    }
                }
                zzab(zzbcfVar);
                parcel2.writeNoException();
                return true;
            case 22:
                zzz(zzhs.zza(parcel));
                parcel2.writeNoException();
                return true;
            case 23:
                boolean zzA = zzA();
                parcel2.writeNoException();
                zzhs.zzb(parcel2, zzA);
                return true;
            case 24:
                zzB(zzbya.zzb(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 25:
                zzC(parcel.readString());
                parcel2.writeNoException();
                return true;
            case 26:
                zzbdj zzE = zzE();
                parcel2.writeNoException();
                zzhs.zzf(parcel2, zzE);
                return true;
            case 29:
                zzF((zzbey) zzhs.zzc(parcel, zzbey.CREATOR));
                parcel2.writeNoException();
                return true;
            case 30:
                zzG((zzbdn) zzhs.zzc(parcel, zzbdn.CREATOR));
                parcel2.writeNoException();
                return true;
            case 31:
                String zzu = zzu();
                parcel2.writeNoException();
                parcel2.writeString(zzu);
                return true;
            case 32:
                zzbcb zzv = zzv();
                parcel2.writeNoException();
                zzhs.zzf(parcel2, zzv);
                return true;
            case 33:
                zzbbh zzw = zzw();
                parcel2.writeNoException();
                zzhs.zzf(parcel2, zzw);
                return true;
            case 34:
                zzJ(zzhs.zza(parcel));
                parcel2.writeNoException();
                return true;
            case 35:
                String zzs = zzs();
                parcel2.writeNoException();
                parcel2.writeString(zzs);
                return true;
            case 36:
                IBinder readStrongBinder5 = parcel.readStrongBinder();
                if (readStrongBinder5 != null) {
                    IInterface queryLocalInterface5 = readStrongBinder5.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdMetadataListener");
                    if (queryLocalInterface5 instanceof zzbby) {
                        zzbbyVar = (zzbby) queryLocalInterface5;
                    } else {
                        zzbbyVar = new zzbbw(readStrongBinder5);
                    }
                }
                zzj(zzbbyVar);
                parcel2.writeNoException();
                return true;
            case 37:
                Bundle zzk = zzk();
                parcel2.writeNoException();
                zzhs.zze(parcel2, zzk);
                return true;
            case 38:
                zzD(parcel.readString());
                parcel2.writeNoException();
                return true;
            case 39:
                zzH((zzbad) zzhs.zzc(parcel, zzbad.CREATOR));
                parcel2.writeNoException();
                return true;
            case 40:
                zzI(zzaud.zze(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 41:
                zzbdg zzt = zzt();
                parcel2.writeNoException();
                zzhs.zzf(parcel2, zzt);
                return true;
            case 42:
                IBinder readStrongBinder6 = parcel.readStrongBinder();
                if (readStrongBinder6 != null) {
                    IInterface queryLocalInterface6 = readStrongBinder6.queryLocalInterface("com.google.android.gms.ads.internal.client.IOnPaidEventListener");
                    if (queryLocalInterface6 instanceof zzbdd) {
                        zzbddVar = (zzbdd) queryLocalInterface6;
                    } else {
                        zzbddVar = new zzbdb(readStrongBinder6);
                    }
                }
                zzO(zzbddVar);
                parcel2.writeNoException();
                return true;
            case 43:
                zzazs zzazsVar = (zzazs) zzhs.zzc(parcel, zzazs.CREATOR);
                IBinder readStrongBinder7 = parcel.readStrongBinder();
                if (readStrongBinder7 != null) {
                    IInterface queryLocalInterface7 = readStrongBinder7.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoadCallback");
                    if (queryLocalInterface7 instanceof zzbbk) {
                        zzbbkVar = (zzbbk) queryLocalInterface7;
                    } else {
                        zzbbkVar = new zzbbi(readStrongBinder7);
                    }
                }
                zzP(zzazsVar, zzbbkVar);
                parcel2.writeNoException();
                return true;
            case 44:
                zzQ(IObjectWrapper.Stub.asInterface(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 45:
                IBinder readStrongBinder8 = parcel.readStrongBinder();
                if (readStrongBinder8 != null) {
                    IInterface queryLocalInterface8 = readStrongBinder8.queryLocalInterface("com.google.android.gms.ads.internal.client.IFullScreenContentCallback");
                    if (queryLocalInterface8 instanceof zzbci) {
                        zzbciVar = (zzbci) queryLocalInterface8;
                    } else {
                        zzbciVar = new zzbcg(readStrongBinder8);
                    }
                }
                zzR(zzbciVar);
                parcel2.writeNoException();
                return true;
        }
    }
}
