package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
/* compiled from: com.google.android.gms:play-services-ads-lite@@20.2.0 */
/* loaded from: classes.dex */
public final class zzbbs extends zzhq implements zzbbu {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbbs(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdManager");
    }

    @Override // com.google.android.gms.internal.ads.zzbbu
    public final boolean zzA() throws RemoteException {
        Parcel zzbo = zzbo(23, zza());
        boolean zza = zzhs.zza(zzbo);
        zzbo.recycle();
        return zza;
    }

    @Override // com.google.android.gms.internal.ads.zzbbu
    public final void zzB(zzbyb zzbybVar) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbbu
    public final void zzC(String str) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbbu
    public final void zzD(String str) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbbu
    public final zzbdj zzE() throws RemoteException {
        zzbdj zzbdhVar;
        Parcel zzbo = zzbo(26, zza());
        IBinder readStrongBinder = zzbo.readStrongBinder();
        if (readStrongBinder == null) {
            zzbdhVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IVideoController");
            if (queryLocalInterface instanceof zzbdj) {
                zzbdhVar = (zzbdj) queryLocalInterface;
            } else {
                zzbdhVar = new zzbdh(readStrongBinder);
            }
        }
        zzbo.recycle();
        return zzbdhVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbbu
    public final void zzF(zzbey zzbeyVar) throws RemoteException {
        Parcel zza = zza();
        zzhs.zzd(zza, zzbeyVar);
        zzbp(29, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbbu
    public final void zzG(zzbdn zzbdnVar) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbbu
    public final void zzH(zzbad zzbadVar) throws RemoteException {
        Parcel zza = zza();
        zzhs.zzd(zza, zzbadVar);
        zzbp(39, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbbu
    public final void zzI(zzaue zzaueVar) throws RemoteException {
        Parcel zza = zza();
        zzhs.zzf(zza, zzaueVar);
        zzbp(40, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbbu
    public final void zzJ(boolean z) throws RemoteException {
        Parcel zza = zza();
        zzhs.zzb(zza, z);
        zzbp(34, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbbu
    public final void zzO(zzbdd zzbddVar) throws RemoteException {
        Parcel zza = zza();
        zzhs.zzf(zza, zzbddVar);
        zzbp(42, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbbu
    public final void zzP(zzazs zzazsVar, zzbbk zzbbkVar) throws RemoteException {
        Parcel zza = zza();
        zzhs.zzd(zza, zzazsVar);
        zzhs.zzf(zza, zzbbkVar);
        zzbp(43, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbbu
    public final void zzQ(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel zza = zza();
        zzhs.zzf(zza, iObjectWrapper);
        zzbp(44, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbbu
    public final void zzR(zzbci zzbciVar) throws RemoteException {
        Parcel zza = zza();
        zzhs.zzf(zza, zzbciVar);
        zzbp(45, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbbu
    public final void zzab(zzbcf zzbcfVar) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbbu
    public final IObjectWrapper zzb() throws RemoteException {
        Parcel zzbo = zzbo(1, zza());
        IObjectWrapper asInterface = IObjectWrapper.Stub.asInterface(zzbo.readStrongBinder());
        zzbo.recycle();
        return asInterface;
    }

    @Override // com.google.android.gms.internal.ads.zzbbu
    public final boolean zzbS() throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbbu
    public final void zzc() throws RemoteException {
        zzbp(2, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbbu
    public final boolean zze(zzazs zzazsVar) throws RemoteException {
        Parcel zza = zza();
        zzhs.zzd(zza, zzazsVar);
        Parcel zzbo = zzbo(4, zza);
        boolean zza2 = zzhs.zza(zzbo);
        zzbo.recycle();
        return zza2;
    }

    @Override // com.google.android.gms.internal.ads.zzbbu
    public final void zzf() throws RemoteException {
        zzbp(5, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbbu
    public final void zzg() throws RemoteException {
        zzbp(6, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbbu
    public final void zzh(zzbbh zzbbhVar) throws RemoteException {
        Parcel zza = zza();
        zzhs.zzf(zza, zzbbhVar);
        zzbp(7, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbbu
    public final void zzi(zzbcb zzbcbVar) throws RemoteException {
        Parcel zza = zza();
        zzhs.zzf(zza, zzbcbVar);
        zzbp(8, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbbu
    public final void zzj(zzbby zzbbyVar) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbbu
    public final Bundle zzk() throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbbu
    public final void zzl() throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbbu
    public final void zzm() throws RemoteException {
        zzbp(11, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbbu
    public final zzazx zzn() throws RemoteException {
        Parcel zzbo = zzbo(12, zza());
        zzazx zzazxVar = (zzazx) zzhs.zzc(zzbo, zzazx.CREATOR);
        zzbo.recycle();
        return zzazxVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbbu
    public final void zzo(zzazx zzazxVar) throws RemoteException {
        Parcel zza = zza();
        zzhs.zzd(zza, zzazxVar);
        zzbp(13, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbbu
    public final void zzp(zzbvv zzbvvVar) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbbu
    public final void zzq(zzbvy zzbvyVar, String str) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbbu
    public final String zzr() throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbbu
    public final String zzs() throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbbu
    public final zzbdg zzt() throws RemoteException {
        zzbdg zzbdeVar;
        Parcel zzbo = zzbo(41, zza());
        IBinder readStrongBinder = zzbo.readStrongBinder();
        if (readStrongBinder == null) {
            zzbdeVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IResponseInfo");
            if (queryLocalInterface instanceof zzbdg) {
                zzbdeVar = (zzbdg) queryLocalInterface;
            } else {
                zzbdeVar = new zzbde(readStrongBinder);
            }
        }
        zzbo.recycle();
        return zzbdeVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbbu
    public final String zzu() throws RemoteException {
        Parcel zzbo = zzbo(31, zza());
        String readString = zzbo.readString();
        zzbo.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.zzbbu
    public final zzbcb zzv() throws RemoteException {
        zzbcb zzbbzVar;
        Parcel zzbo = zzbo(32, zza());
        IBinder readStrongBinder = zzbo.readStrongBinder();
        if (readStrongBinder == null) {
            zzbbzVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAppEventListener");
            if (queryLocalInterface instanceof zzbcb) {
                zzbbzVar = (zzbcb) queryLocalInterface;
            } else {
                zzbbzVar = new zzbbz(readStrongBinder);
            }
        }
        zzbo.recycle();
        return zzbbzVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbbu
    public final zzbbh zzw() throws RemoteException {
        zzbbh zzbbfVar;
        Parcel zzbo = zzbo(33, zza());
        IBinder readStrongBinder = zzbo.readStrongBinder();
        if (readStrongBinder == null) {
            zzbbfVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdListener");
            if (queryLocalInterface instanceof zzbbh) {
                zzbbfVar = (zzbbh) queryLocalInterface;
            } else {
                zzbbfVar = new zzbbf(readStrongBinder);
            }
        }
        zzbo.recycle();
        return zzbbfVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbbu
    public final void zzx(zzbgl zzbglVar) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbbu
    public final void zzy(zzbbe zzbbeVar) throws RemoteException {
        Parcel zza = zza();
        zzhs.zzf(zza, zzbbeVar);
        zzbp(20, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbbu
    public final void zzz(boolean z) throws RemoteException {
        Parcel zza = zza();
        zzhs.zzb(zza, z);
        zzbp(22, zza);
    }
}
