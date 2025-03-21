package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
/* compiled from: com.google.android.gms:play-services-ads-lite@@20.2.0 */
/* loaded from: classes.dex */
public abstract class zzbtk extends zzhr implements zzbtl {
    public zzbtk() {
        super("com.google.android.gms.ads.internal.mediation.client.rtb.IRtbAdapter");
    }

    public static zzbtl zzb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IRtbAdapter");
        if (queryLocalInterface instanceof zzbtl) {
            return (zzbtl) queryLocalInterface;
        }
        return new zzbtj(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzhr
    protected final boolean zzbK(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        zzbto zzbtmVar;
        zzbto zzbtoVar;
        zzbsz zzbszVar = null;
        zzbtf zzbtdVar = null;
        zzbsz zzbsxVar = null;
        zzbti zzbtgVar = null;
        zzbtf zzbtdVar2 = null;
        zzbti zzbtgVar2 = null;
        zzbtc zzbtaVar = null;
        if (i == 1) {
            IObjectWrapper asInterface = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
            String readString = parcel.readString();
            Bundle bundle = (Bundle) zzhs.zzc(parcel, Bundle.CREATOR);
            Bundle bundle2 = (Bundle) zzhs.zzc(parcel, Bundle.CREATOR);
            zzazx zzazxVar = (zzazx) zzhs.zzc(parcel, zzazx.CREATOR);
            IBinder readStrongBinder = parcel.readStrongBinder();
            if (readStrongBinder == null) {
                zzbtoVar = null;
            } else {
                IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.ISignalsCallback");
                if (queryLocalInterface instanceof zzbto) {
                    zzbtmVar = (zzbto) queryLocalInterface;
                } else {
                    zzbtmVar = new zzbtm(readStrongBinder);
                }
                zzbtoVar = zzbtmVar;
            }
            zze(asInterface, readString, bundle, bundle2, zzazxVar, zzbtoVar);
            parcel2.writeNoException();
        } else if (i == 2) {
            zzbty zzf = zzf();
            parcel2.writeNoException();
            zzhs.zze(parcel2, zzf);
        } else if (i == 3) {
            zzbty zzg = zzg();
            parcel2.writeNoException();
            zzhs.zze(parcel2, zzg);
        } else if (i == 5) {
            zzbdj zzh = zzh();
            parcel2.writeNoException();
            zzhs.zzf(parcel2, zzh);
        } else if (i == 10) {
            IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
            parcel2.writeNoException();
        } else if (i != 11) {
            switch (i) {
                case 13:
                    String readString2 = parcel.readString();
                    String readString3 = parcel.readString();
                    zzazs zzazsVar = (zzazs) zzhs.zzc(parcel, zzazs.CREATOR);
                    IObjectWrapper asInterface2 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                    IBinder readStrongBinder2 = parcel.readStrongBinder();
                    if (readStrongBinder2 != null) {
                        IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IBannerCallback");
                        if (queryLocalInterface2 instanceof zzbsz) {
                            zzbszVar = (zzbsz) queryLocalInterface2;
                        } else {
                            zzbszVar = new zzbsx(readStrongBinder2);
                        }
                    }
                    zzi(readString2, readString3, zzazsVar, asInterface2, zzbszVar, zzbrj.zzb(parcel.readStrongBinder()), (zzazx) zzhs.zzc(parcel, zzazx.CREATOR));
                    parcel2.writeNoException();
                    break;
                case 14:
                    String readString4 = parcel.readString();
                    String readString5 = parcel.readString();
                    zzazs zzazsVar2 = (zzazs) zzhs.zzc(parcel, zzazs.CREATOR);
                    IObjectWrapper asInterface3 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                    IBinder readStrongBinder3 = parcel.readStrongBinder();
                    if (readStrongBinder3 != null) {
                        IInterface queryLocalInterface3 = readStrongBinder3.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IInterstitialCallback");
                        if (queryLocalInterface3 instanceof zzbtc) {
                            zzbtaVar = (zzbtc) queryLocalInterface3;
                        } else {
                            zzbtaVar = new zzbta(readStrongBinder3);
                        }
                    }
                    zzj(readString4, readString5, zzazsVar2, asInterface3, zzbtaVar, zzbrj.zzb(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    break;
                case 15:
                    boolean zzk = zzk(IObjectWrapper.Stub.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    zzhs.zzb(parcel2, zzk);
                    break;
                case 16:
                    String readString6 = parcel.readString();
                    String readString7 = parcel.readString();
                    zzazs zzazsVar3 = (zzazs) zzhs.zzc(parcel, zzazs.CREATOR);
                    IObjectWrapper asInterface4 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                    IBinder readStrongBinder4 = parcel.readStrongBinder();
                    if (readStrongBinder4 != null) {
                        IInterface queryLocalInterface4 = readStrongBinder4.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IRewardedCallback");
                        if (queryLocalInterface4 instanceof zzbti) {
                            zzbtgVar2 = (zzbti) queryLocalInterface4;
                        } else {
                            zzbtgVar2 = new zzbtg(readStrongBinder4);
                        }
                    }
                    zzl(readString6, readString7, zzazsVar3, asInterface4, zzbtgVar2, zzbrj.zzb(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    break;
                case 17:
                    boolean zzm = zzm(IObjectWrapper.Stub.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    zzhs.zzb(parcel2, zzm);
                    break;
                case 18:
                    String readString8 = parcel.readString();
                    String readString9 = parcel.readString();
                    zzazs zzazsVar4 = (zzazs) zzhs.zzc(parcel, zzazs.CREATOR);
                    IObjectWrapper asInterface5 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                    IBinder readStrongBinder5 = parcel.readStrongBinder();
                    if (readStrongBinder5 != null) {
                        IInterface queryLocalInterface5 = readStrongBinder5.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.INativeCallback");
                        if (queryLocalInterface5 instanceof zzbtf) {
                            zzbtdVar2 = (zzbtf) queryLocalInterface5;
                        } else {
                            zzbtdVar2 = new zzbtd(readStrongBinder5);
                        }
                    }
                    zzn(readString8, readString9, zzazsVar4, asInterface5, zzbtdVar2, zzbrj.zzb(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    break;
                case 19:
                    zzo(parcel.readString());
                    parcel2.writeNoException();
                    break;
                case 20:
                    String readString10 = parcel.readString();
                    String readString11 = parcel.readString();
                    zzazs zzazsVar5 = (zzazs) zzhs.zzc(parcel, zzazs.CREATOR);
                    IObjectWrapper asInterface6 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                    IBinder readStrongBinder6 = parcel.readStrongBinder();
                    if (readStrongBinder6 != null) {
                        IInterface queryLocalInterface6 = readStrongBinder6.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IRewardedCallback");
                        if (queryLocalInterface6 instanceof zzbti) {
                            zzbtgVar = (zzbti) queryLocalInterface6;
                        } else {
                            zzbtgVar = new zzbtg(readStrongBinder6);
                        }
                    }
                    zzp(readString10, readString11, zzazsVar5, asInterface6, zzbtgVar, zzbrj.zzb(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    break;
                case 21:
                    String readString12 = parcel.readString();
                    String readString13 = parcel.readString();
                    zzazs zzazsVar6 = (zzazs) zzhs.zzc(parcel, zzazs.CREATOR);
                    IObjectWrapper asInterface7 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                    IBinder readStrongBinder7 = parcel.readStrongBinder();
                    if (readStrongBinder7 != null) {
                        IInterface queryLocalInterface7 = readStrongBinder7.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IBannerCallback");
                        if (queryLocalInterface7 instanceof zzbsz) {
                            zzbsxVar = (zzbsz) queryLocalInterface7;
                        } else {
                            zzbsxVar = new zzbsx(readStrongBinder7);
                        }
                    }
                    zzq(readString12, readString13, zzazsVar6, asInterface7, zzbsxVar, zzbrj.zzb(parcel.readStrongBinder()), (zzazx) zzhs.zzc(parcel, zzazx.CREATOR));
                    parcel2.writeNoException();
                    break;
                case 22:
                    String readString14 = parcel.readString();
                    String readString15 = parcel.readString();
                    zzazs zzazsVar7 = (zzazs) zzhs.zzc(parcel, zzazs.CREATOR);
                    IObjectWrapper asInterface8 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                    IBinder readStrongBinder8 = parcel.readStrongBinder();
                    if (readStrongBinder8 != null) {
                        IInterface queryLocalInterface8 = readStrongBinder8.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.INativeCallback");
                        if (queryLocalInterface8 instanceof zzbtf) {
                            zzbtdVar = (zzbtf) queryLocalInterface8;
                        } else {
                            zzbtdVar = new zzbtd(readStrongBinder8);
                        }
                    }
                    zzr(readString14, readString15, zzazsVar7, asInterface8, zzbtdVar, zzbrj.zzb(parcel.readStrongBinder()), (zzbhy) zzhs.zzc(parcel, zzbhy.CREATOR));
                    parcel2.writeNoException();
                    break;
                default:
                    return false;
            }
        } else {
            parcel.createStringArray();
            Bundle[] bundleArr = (Bundle[]) parcel.createTypedArray(Bundle.CREATOR);
            parcel2.writeNoException();
        }
        return true;
    }
}
