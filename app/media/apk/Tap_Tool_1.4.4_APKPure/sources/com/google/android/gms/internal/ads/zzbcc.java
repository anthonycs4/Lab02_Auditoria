package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
/* compiled from: com.google.android.gms:play-services-ads-lite@@20.2.0 */
/* loaded from: classes.dex */
public final class zzbcc extends zzhq implements zzbce {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbcc(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IClientApi");
    }

    @Override // com.google.android.gms.internal.ads.zzbce
    public final zzbbu zzb(IObjectWrapper iObjectWrapper, zzazx zzazxVar, String str, zzbre zzbreVar, int i) throws RemoteException {
        zzbbu zzbbsVar;
        Parcel zza = zza();
        zzhs.zzf(zza, iObjectWrapper);
        zzhs.zzd(zza, zzazxVar);
        zza.writeString(str);
        zzhs.zzf(zza, zzbreVar);
        zza.writeInt(ModuleDescriptor.MODULE_VERSION);
        Parcel zzbo = zzbo(1, zza);
        IBinder readStrongBinder = zzbo.readStrongBinder();
        if (readStrongBinder == null) {
            zzbbsVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
            if (queryLocalInterface instanceof zzbbu) {
                zzbbsVar = (zzbbu) queryLocalInterface;
            } else {
                zzbbsVar = new zzbbs(readStrongBinder);
            }
        }
        zzbo.recycle();
        return zzbbsVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbce
    public final zzbbu zzc(IObjectWrapper iObjectWrapper, zzazx zzazxVar, String str, zzbre zzbreVar, int i) throws RemoteException {
        zzbbu zzbbsVar;
        Parcel zza = zza();
        zzhs.zzf(zza, iObjectWrapper);
        zzhs.zzd(zza, zzazxVar);
        zza.writeString(str);
        zzhs.zzf(zza, zzbreVar);
        zza.writeInt(ModuleDescriptor.MODULE_VERSION);
        Parcel zzbo = zzbo(2, zza);
        IBinder readStrongBinder = zzbo.readStrongBinder();
        if (readStrongBinder == null) {
            zzbbsVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
            if (queryLocalInterface instanceof zzbbu) {
                zzbbsVar = (zzbbu) queryLocalInterface;
            } else {
                zzbbsVar = new zzbbs(readStrongBinder);
            }
        }
        zzbo.recycle();
        return zzbbsVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbce
    public final zzbbq zzd(IObjectWrapper iObjectWrapper, String str, zzbre zzbreVar, int i) throws RemoteException {
        zzbbq zzbboVar;
        Parcel zza = zza();
        zzhs.zzf(zza, iObjectWrapper);
        zza.writeString(str);
        zzhs.zzf(zza, zzbreVar);
        zza.writeInt(ModuleDescriptor.MODULE_VERSION);
        Parcel zzbo = zzbo(3, zza);
        IBinder readStrongBinder = zzbo.readStrongBinder();
        if (readStrongBinder == null) {
            zzbboVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
            if (queryLocalInterface instanceof zzbbq) {
                zzbboVar = (zzbbq) queryLocalInterface;
            } else {
                zzbboVar = new zzbbo(readStrongBinder);
            }
        }
        zzbo.recycle();
        return zzbboVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbce
    public final zzbio zze(IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2) throws RemoteException {
        Parcel zza = zza();
        zzhs.zzf(zza, iObjectWrapper);
        zzhs.zzf(zza, iObjectWrapper2);
        Parcel zzbo = zzbo(5, zza);
        zzbio zzbJ = zzbin.zzbJ(zzbo.readStrongBinder());
        zzbo.recycle();
        return zzbJ;
    }

    @Override // com.google.android.gms.internal.ads.zzbce
    public final zzbxy zzf(IObjectWrapper iObjectWrapper, zzbre zzbreVar, int i) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbce
    public final zzbvo zzg(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel zza = zza();
        zzhs.zzf(zza, iObjectWrapper);
        Parcel zzbo = zzbo(8, zza);
        zzbvo zzF = zzbvn.zzF(zzbo.readStrongBinder());
        zzbo.recycle();
        return zzF;
    }

    @Override // com.google.android.gms.internal.ads.zzbce
    public final zzbcl zzh(IObjectWrapper iObjectWrapper, int i) throws RemoteException {
        zzbcl zzbcjVar;
        Parcel zza = zza();
        zzhs.zzf(zza, iObjectWrapper);
        zza.writeInt(ModuleDescriptor.MODULE_VERSION);
        Parcel zzbo = zzbo(9, zza);
        IBinder readStrongBinder = zzbo.readStrongBinder();
        if (readStrongBinder == null) {
            zzbcjVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IMobileAdsSettingManager");
            if (queryLocalInterface instanceof zzbcl) {
                zzbcjVar = (zzbcl) queryLocalInterface;
            } else {
                zzbcjVar = new zzbcj(readStrongBinder);
            }
        }
        zzbo.recycle();
        return zzbcjVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbce
    public final zzbbu zzi(IObjectWrapper iObjectWrapper, zzazx zzazxVar, String str, int i) throws RemoteException {
        zzbbu zzbbsVar;
        Parcel zza = zza();
        zzhs.zzf(zza, iObjectWrapper);
        zzhs.zzd(zza, zzazxVar);
        zza.writeString(str);
        zza.writeInt(ModuleDescriptor.MODULE_VERSION);
        Parcel zzbo = zzbo(10, zza);
        IBinder readStrongBinder = zzbo.readStrongBinder();
        if (readStrongBinder == null) {
            zzbbsVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
            if (queryLocalInterface instanceof zzbbu) {
                zzbbsVar = (zzbbu) queryLocalInterface;
            } else {
                zzbbsVar = new zzbbs(readStrongBinder);
            }
        }
        zzbo.recycle();
        return zzbbsVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbce
    public final zzbis zzj(IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2, IObjectWrapper iObjectWrapper3) throws RemoteException {
        Parcel zza = zza();
        zzhs.zzf(zza, iObjectWrapper);
        zzhs.zzf(zza, iObjectWrapper2);
        zzhs.zzf(zza, iObjectWrapper3);
        Parcel zzbo = zzbo(11, zza);
        zzbis zze = zzbir.zze(zzbo.readStrongBinder());
        zzbo.recycle();
        return zze;
    }

    @Override // com.google.android.gms.internal.ads.zzbce
    public final zzbyo zzk(IObjectWrapper iObjectWrapper, String str, zzbre zzbreVar, int i) throws RemoteException {
        Parcel zza = zza();
        zzhs.zzf(zza, iObjectWrapper);
        zza.writeString(str);
        zzhs.zzf(zza, zzbreVar);
        zza.writeInt(ModuleDescriptor.MODULE_VERSION);
        Parcel zzbo = zzbo(12, zza);
        zzbyo zzq = zzbyn.zzq(zzbo.readStrongBinder());
        zzbo.recycle();
        return zzq;
    }

    @Override // com.google.android.gms.internal.ads.zzbce
    public final zzbbu zzl(IObjectWrapper iObjectWrapper, zzazx zzazxVar, String str, zzbre zzbreVar, int i) throws RemoteException {
        zzbbu zzbbsVar;
        Parcel zza = zza();
        zzhs.zzf(zza, iObjectWrapper);
        zzhs.zzd(zza, zzazxVar);
        zza.writeString(str);
        zzhs.zzf(zza, zzbreVar);
        zza.writeInt(ModuleDescriptor.MODULE_VERSION);
        Parcel zzbo = zzbo(13, zza);
        IBinder readStrongBinder = zzbo.readStrongBinder();
        if (readStrongBinder == null) {
            zzbbsVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
            if (queryLocalInterface instanceof zzbbu) {
                zzbbsVar = (zzbbu) queryLocalInterface;
            } else {
                zzbbsVar = new zzbbs(readStrongBinder);
            }
        }
        zzbo.recycle();
        return zzbbsVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbce
    public final zzcbj zzm(IObjectWrapper iObjectWrapper, zzbre zzbreVar, int i) throws RemoteException {
        Parcel zza = zza();
        zzhs.zzf(zza, iObjectWrapper);
        zzhs.zzf(zza, zzbreVar);
        zza.writeInt(ModuleDescriptor.MODULE_VERSION);
        Parcel zzbo = zzbo(14, zza);
        zzcbj zzb = zzcbi.zzb(zzbo.readStrongBinder());
        zzbo.recycle();
        return zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzbce
    public final zzbvc zzn(IObjectWrapper iObjectWrapper, zzbre zzbreVar, int i) throws RemoteException {
        Parcel zza = zza();
        zzhs.zzf(zza, iObjectWrapper);
        zzhs.zzf(zza, zzbreVar);
        zza.writeInt(ModuleDescriptor.MODULE_VERSION);
        Parcel zzbo = zzbo(15, zza);
        zzbvc zzb = zzbvb.zzb(zzbo.readStrongBinder());
        zzbo.recycle();
        return zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzbce
    public final zzbmn zzo(IObjectWrapper iObjectWrapper, zzbre zzbreVar, int i, zzbmk zzbmkVar) throws RemoteException {
        Parcel zza = zza();
        zzhs.zzf(zza, iObjectWrapper);
        zzhs.zzf(zza, zzbreVar);
        zza.writeInt(ModuleDescriptor.MODULE_VERSION);
        zzhs.zzf(zza, zzbmkVar);
        Parcel zzbo = zzbo(16, zza);
        zzbmn zzb = zzbmm.zzb(zzbo.readStrongBinder());
        zzbo.recycle();
        return zzb;
    }
}
