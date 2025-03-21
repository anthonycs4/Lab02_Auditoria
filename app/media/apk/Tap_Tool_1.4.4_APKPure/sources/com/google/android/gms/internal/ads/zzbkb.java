package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.ArrayList;
import java.util.List;
/* compiled from: com.google.android.gms:play-services-ads-lite@@20.2.0 */
/* loaded from: classes.dex */
public final class zzbkb extends zzhq implements zzbkd {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbkb(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IUnifiedNativeAd");
    }

    @Override // com.google.android.gms.internal.ads.zzbkd
    public final boolean zzA() throws RemoteException {
        Parcel zzbo = zzbo(24, zza());
        boolean zza = zzhs.zza(zzbo);
        zzbo.recycle();
        return zza;
    }

    @Override // com.google.android.gms.internal.ads.zzbkd
    public final void zzB(zzbct zzbctVar) throws RemoteException {
        Parcel zza = zza();
        zzhs.zzf(zza, zzbctVar);
        zzbp(25, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbkd
    public final void zzC(zzbcp zzbcpVar) throws RemoteException {
        Parcel zza = zza();
        zzhs.zzf(zza, zzbcpVar);
        zzbp(26, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbkd
    public final void zzD() throws RemoteException {
        zzbp(27, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbkd
    public final void zzE() throws RemoteException {
        zzbp(28, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbkd
    public final zzbih zzF() throws RemoteException {
        zzbih zzbifVar;
        Parcel zzbo = zzbo(29, zza());
        IBinder readStrongBinder = zzbo.readStrongBinder();
        if (readStrongBinder == null) {
            zzbifVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IMediaContent");
            if (queryLocalInterface instanceof zzbih) {
                zzbifVar = (zzbih) queryLocalInterface;
            } else {
                zzbifVar = new zzbif(readStrongBinder);
            }
        }
        zzbo.recycle();
        return zzbifVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbkd
    public final boolean zzG() throws RemoteException {
        Parcel zzbo = zzbo(30, zza());
        boolean zza = zzhs.zza(zzbo);
        zzbo.recycle();
        return zza;
    }

    @Override // com.google.android.gms.internal.ads.zzbkd
    public final zzbdg zzH() throws RemoteException {
        Parcel zzbo = zzbo(31, zza());
        zzbdg zzb = zzbdf.zzb(zzbo.readStrongBinder());
        zzbo.recycle();
        return zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzbkd
    public final void zzI(zzbdd zzbddVar) throws RemoteException {
        Parcel zza = zza();
        zzhs.zzf(zza, zzbddVar);
        zzbp(32, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbkd
    public final String zze() throws RemoteException {
        Parcel zzbo = zzbo(2, zza());
        String readString = zzbo.readString();
        zzbo.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.zzbkd
    public final List zzf() throws RemoteException {
        Parcel zzbo = zzbo(3, zza());
        ArrayList zzg = zzhs.zzg(zzbo);
        zzbo.recycle();
        return zzg;
    }

    @Override // com.google.android.gms.internal.ads.zzbkd
    public final String zzg() throws RemoteException {
        Parcel zzbo = zzbo(4, zza());
        String readString = zzbo.readString();
        zzbo.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.zzbkd
    public final zzbik zzh() throws RemoteException {
        zzbik zzbiiVar;
        Parcel zzbo = zzbo(5, zza());
        IBinder readStrongBinder = zzbo.readStrongBinder();
        if (readStrongBinder == null) {
            zzbiiVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdImage");
            if (queryLocalInterface instanceof zzbik) {
                zzbiiVar = (zzbik) queryLocalInterface;
            } else {
                zzbiiVar = new zzbii(readStrongBinder);
            }
        }
        zzbo.recycle();
        return zzbiiVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbkd
    public final String zzi() throws RemoteException {
        Parcel zzbo = zzbo(6, zza());
        String readString = zzbo.readString();
        zzbo.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.zzbkd
    public final String zzj() throws RemoteException {
        Parcel zzbo = zzbo(7, zza());
        String readString = zzbo.readString();
        zzbo.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.zzbkd
    public final double zzk() throws RemoteException {
        Parcel zzbo = zzbo(8, zza());
        double readDouble = zzbo.readDouble();
        zzbo.recycle();
        return readDouble;
    }

    @Override // com.google.android.gms.internal.ads.zzbkd
    public final String zzl() throws RemoteException {
        Parcel zzbo = zzbo(9, zza());
        String readString = zzbo.readString();
        zzbo.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.zzbkd
    public final String zzm() throws RemoteException {
        Parcel zzbo = zzbo(10, zza());
        String readString = zzbo.readString();
        zzbo.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.zzbkd
    public final zzbdj zzn() throws RemoteException {
        Parcel zzbo = zzbo(11, zza());
        zzbdj zzb = zzbdi.zzb(zzbo.readStrongBinder());
        zzbo.recycle();
        return zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzbkd
    public final String zzo() throws RemoteException {
        Parcel zzbo = zzbo(12, zza());
        String readString = zzbo.readString();
        zzbo.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.zzbkd
    public final void zzp() throws RemoteException {
        zzbp(13, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbkd
    public final zzbic zzq() throws RemoteException {
        zzbic zzbiaVar;
        Parcel zzbo = zzbo(14, zza());
        IBinder readStrongBinder = zzbo.readStrongBinder();
        if (readStrongBinder == null) {
            zzbiaVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IAttributionInfo");
            if (queryLocalInterface instanceof zzbic) {
                zzbiaVar = (zzbic) queryLocalInterface;
            } else {
                zzbiaVar = new zzbia(readStrongBinder);
            }
        }
        zzbo.recycle();
        return zzbiaVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbkd
    public final void zzr(Bundle bundle) throws RemoteException {
        Parcel zza = zza();
        zzhs.zzd(zza, bundle);
        zzbp(15, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbkd
    public final boolean zzs(Bundle bundle) throws RemoteException {
        Parcel zza = zza();
        zzhs.zzd(zza, bundle);
        Parcel zzbo = zzbo(16, zza);
        boolean zza2 = zzhs.zza(zzbo);
        zzbo.recycle();
        return zza2;
    }

    @Override // com.google.android.gms.internal.ads.zzbkd
    public final void zzt(Bundle bundle) throws RemoteException {
        Parcel zza = zza();
        zzhs.zzd(zza, bundle);
        zzbp(17, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbkd
    public final IObjectWrapper zzu() throws RemoteException {
        Parcel zzbo = zzbo(18, zza());
        IObjectWrapper asInterface = IObjectWrapper.Stub.asInterface(zzbo.readStrongBinder());
        zzbo.recycle();
        return asInterface;
    }

    @Override // com.google.android.gms.internal.ads.zzbkd
    public final IObjectWrapper zzv() throws RemoteException {
        Parcel zzbo = zzbo(19, zza());
        IObjectWrapper asInterface = IObjectWrapper.Stub.asInterface(zzbo.readStrongBinder());
        zzbo.recycle();
        return asInterface;
    }

    @Override // com.google.android.gms.internal.ads.zzbkd
    public final Bundle zzw() throws RemoteException {
        Parcel zzbo = zzbo(20, zza());
        Bundle bundle = (Bundle) zzhs.zzc(zzbo, Bundle.CREATOR);
        zzbo.recycle();
        return bundle;
    }

    @Override // com.google.android.gms.internal.ads.zzbkd
    public final void zzx(zzbka zzbkaVar) throws RemoteException {
        Parcel zza = zza();
        zzhs.zzf(zza, zzbkaVar);
        zzbp(21, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbkd
    public final void zzy() throws RemoteException {
        zzbp(22, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbkd
    public final List zzz() throws RemoteException {
        Parcel zzbo = zzbo(23, zza());
        ArrayList zzg = zzhs.zzg(zzbo);
        zzbo.recycle();
        return zzg;
    }
}
