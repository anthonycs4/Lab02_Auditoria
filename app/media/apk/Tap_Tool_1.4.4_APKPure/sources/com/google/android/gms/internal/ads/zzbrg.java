package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
/* compiled from: com.google.android.gms:play-services-ads-lite@@20.2.0 */
/* loaded from: classes.dex */
public abstract class zzbrg extends zzhr implements zzbrh {
    public zzbrg() {
        super("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
    }

    @Override // com.google.android.gms.internal.ads.zzhr
    protected final boolean zzbK(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        zzbrk zzbrkVar = null;
        switch (i) {
            case 1:
                IObjectWrapper asInterface = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzazx zzazxVar = (zzazx) zzhs.zzc(parcel, zzazx.CREATOR);
                zzazs zzazsVar = (zzazs) zzhs.zzc(parcel, zzazs.CREATOR);
                String readString = parcel.readString();
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    if (queryLocalInterface instanceof zzbrk) {
                        zzbrkVar = (zzbrk) queryLocalInterface;
                    } else {
                        zzbrkVar = new zzbri(readStrongBinder);
                    }
                }
                zze(asInterface, zzazxVar, zzazsVar, readString, zzbrkVar);
                parcel2.writeNoException();
                return true;
            case 2:
                IObjectWrapper zzf = zzf();
                parcel2.writeNoException();
                zzhs.zzf(parcel2, zzf);
                return true;
            case 3:
                IObjectWrapper asInterface2 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzazs zzazsVar2 = (zzazs) zzhs.zzc(parcel, zzazs.CREATOR);
                String readString2 = parcel.readString();
                IBinder readStrongBinder2 = parcel.readStrongBinder();
                if (readStrongBinder2 != null) {
                    IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    if (queryLocalInterface2 instanceof zzbrk) {
                        zzbrkVar = (zzbrk) queryLocalInterface2;
                    } else {
                        zzbrkVar = new zzbri(readStrongBinder2);
                    }
                }
                zzg(asInterface2, zzazsVar2, readString2, zzbrkVar);
                parcel2.writeNoException();
                return true;
            case 4:
                zzh();
                parcel2.writeNoException();
                return true;
            case 5:
                zzi();
                parcel2.writeNoException();
                return true;
            case 6:
                IObjectWrapper asInterface3 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzazx zzazxVar2 = (zzazx) zzhs.zzc(parcel, zzazx.CREATOR);
                zzazs zzazsVar3 = (zzazs) zzhs.zzc(parcel, zzazs.CREATOR);
                String readString3 = parcel.readString();
                String readString4 = parcel.readString();
                IBinder readStrongBinder3 = parcel.readStrongBinder();
                if (readStrongBinder3 != null) {
                    IInterface queryLocalInterface3 = readStrongBinder3.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    if (queryLocalInterface3 instanceof zzbrk) {
                        zzbrkVar = (zzbrk) queryLocalInterface3;
                    } else {
                        zzbrkVar = new zzbri(readStrongBinder3);
                    }
                }
                zzj(asInterface3, zzazxVar2, zzazsVar3, readString3, readString4, zzbrkVar);
                parcel2.writeNoException();
                return true;
            case 7:
                IObjectWrapper asInterface4 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzazs zzazsVar4 = (zzazs) zzhs.zzc(parcel, zzazs.CREATOR);
                String readString5 = parcel.readString();
                String readString6 = parcel.readString();
                IBinder readStrongBinder4 = parcel.readStrongBinder();
                if (readStrongBinder4 != null) {
                    IInterface queryLocalInterface4 = readStrongBinder4.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    if (queryLocalInterface4 instanceof zzbrk) {
                        zzbrkVar = (zzbrk) queryLocalInterface4;
                    } else {
                        zzbrkVar = new zzbri(readStrongBinder4);
                    }
                }
                zzk(asInterface4, zzazsVar4, readString5, readString6, zzbrkVar);
                parcel2.writeNoException();
                return true;
            case 8:
                zzl();
                parcel2.writeNoException();
                return true;
            case 9:
                zzm();
                parcel2.writeNoException();
                return true;
            case 10:
                zzn(IObjectWrapper.Stub.asInterface(parcel.readStrongBinder()), (zzazs) zzhs.zzc(parcel, zzazs.CREATOR), parcel.readString(), zzbyf.zzb(parcel.readStrongBinder()), parcel.readString());
                parcel2.writeNoException();
                return true;
            case 11:
                zzo((zzazs) zzhs.zzc(parcel, zzazs.CREATOR), parcel.readString());
                parcel2.writeNoException();
                return true;
            case 12:
                zzp();
                parcel2.writeNoException();
                return true;
            case 13:
                boolean zzq = zzq();
                parcel2.writeNoException();
                zzhs.zzb(parcel2, zzq);
                return true;
            case 14:
                IObjectWrapper asInterface5 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzazs zzazsVar5 = (zzazs) zzhs.zzc(parcel, zzazs.CREATOR);
                String readString7 = parcel.readString();
                String readString8 = parcel.readString();
                IBinder readStrongBinder5 = parcel.readStrongBinder();
                if (readStrongBinder5 != null) {
                    IInterface queryLocalInterface5 = readStrongBinder5.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    if (queryLocalInterface5 instanceof zzbrk) {
                        zzbrkVar = (zzbrk) queryLocalInterface5;
                    } else {
                        zzbrkVar = new zzbri(readStrongBinder5);
                    }
                }
                zzr(asInterface5, zzazsVar5, readString7, readString8, zzbrkVar, (zzbhy) zzhs.zzc(parcel, zzbhy.CREATOR), parcel.createStringArrayList());
                parcel2.writeNoException();
                return true;
            case 15:
                parcel2.writeNoException();
                zzhs.zzf(parcel2, null);
                return true;
            case 16:
                parcel2.writeNoException();
                zzhs.zzf(parcel2, null);
                return true;
            case 17:
                Bundle zzs = zzs();
                parcel2.writeNoException();
                zzhs.zze(parcel2, zzs);
                return true;
            case 18:
                Bundle zzt = zzt();
                parcel2.writeNoException();
                zzhs.zze(parcel2, zzt);
                return true;
            case 19:
                Bundle zzu = zzu();
                parcel2.writeNoException();
                zzhs.zze(parcel2, zzu);
                return true;
            case 20:
                zzv((zzazs) zzhs.zzc(parcel, zzazs.CREATOR), parcel.readString(), parcel.readString());
                parcel2.writeNoException();
                return true;
            case 21:
                zzw(IObjectWrapper.Stub.asInterface(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 22:
                parcel2.writeNoException();
                zzhs.zzb(parcel2, false);
                return true;
            case 23:
                zzy(IObjectWrapper.Stub.asInterface(parcel.readStrongBinder()), zzbyf.zzb(parcel.readStrongBinder()), parcel.createStringArrayList());
                parcel2.writeNoException();
                return true;
            case 24:
                zzbja zzz = zzz();
                parcel2.writeNoException();
                zzhs.zzf(parcel2, zzz);
                return true;
            case 25:
                zzA(zzhs.zza(parcel));
                parcel2.writeNoException();
                return true;
            case 26:
                zzbdj zzB = zzB();
                parcel2.writeNoException();
                zzhs.zzf(parcel2, zzB);
                return true;
            case 27:
                zzbrt zzC = zzC();
                parcel2.writeNoException();
                zzhs.zzf(parcel2, zzC);
                return true;
            case 28:
                IObjectWrapper asInterface6 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzazs zzazsVar6 = (zzazs) zzhs.zzc(parcel, zzazs.CREATOR);
                String readString9 = parcel.readString();
                IBinder readStrongBinder6 = parcel.readStrongBinder();
                if (readStrongBinder6 != null) {
                    IInterface queryLocalInterface6 = readStrongBinder6.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    if (queryLocalInterface6 instanceof zzbrk) {
                        zzbrkVar = (zzbrk) queryLocalInterface6;
                    } else {
                        zzbrkVar = new zzbri(readStrongBinder6);
                    }
                }
                zzD(asInterface6, zzazsVar6, readString9, zzbrkVar);
                parcel2.writeNoException();
                return true;
            case 29:
            default:
                return false;
            case 30:
                zzE(IObjectWrapper.Stub.asInterface(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 31:
                zzF(IObjectWrapper.Stub.asInterface(parcel.readStrongBinder()), zzbnm.zzb(parcel.readStrongBinder()), parcel.createTypedArrayList(zzbnt.CREATOR));
                parcel2.writeNoException();
                return true;
            case 32:
                IObjectWrapper asInterface7 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzazs zzazsVar7 = (zzazs) zzhs.zzc(parcel, zzazs.CREATOR);
                String readString10 = parcel.readString();
                IBinder readStrongBinder7 = parcel.readStrongBinder();
                if (readStrongBinder7 != null) {
                    IInterface queryLocalInterface7 = readStrongBinder7.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    if (queryLocalInterface7 instanceof zzbrk) {
                        zzbrkVar = (zzbrk) queryLocalInterface7;
                    } else {
                        zzbrkVar = new zzbri(readStrongBinder7);
                    }
                }
                zzG(asInterface7, zzazsVar7, readString10, zzbrkVar);
                parcel2.writeNoException();
                return true;
            case 33:
                zzbty zzH = zzH();
                parcel2.writeNoException();
                zzhs.zze(parcel2, zzH);
                return true;
            case 34:
                zzbty zzI = zzI();
                parcel2.writeNoException();
                zzhs.zze(parcel2, zzI);
                return true;
            case 35:
                IObjectWrapper asInterface8 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzazx zzazxVar3 = (zzazx) zzhs.zzc(parcel, zzazx.CREATOR);
                zzazs zzazsVar8 = (zzazs) zzhs.zzc(parcel, zzazs.CREATOR);
                String readString11 = parcel.readString();
                String readString12 = parcel.readString();
                IBinder readStrongBinder8 = parcel.readStrongBinder();
                if (readStrongBinder8 != null) {
                    IInterface queryLocalInterface8 = readStrongBinder8.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    if (queryLocalInterface8 instanceof zzbrk) {
                        zzbrkVar = (zzbrk) queryLocalInterface8;
                    } else {
                        zzbrkVar = new zzbri(readStrongBinder8);
                    }
                }
                zzJ(asInterface8, zzazxVar3, zzazsVar8, readString11, readString12, zzbrkVar);
                parcel2.writeNoException();
                return true;
            case 36:
                zzbrn zzK = zzK();
                parcel2.writeNoException();
                zzhs.zzf(parcel2, zzK);
                return true;
            case 37:
                zzL(IObjectWrapper.Stub.asInterface(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
        }
    }
}
