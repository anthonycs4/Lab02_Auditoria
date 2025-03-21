package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
/* compiled from: com.google.android.gms:play-services-ads-lite@@20.2.0 */
/* loaded from: classes.dex */
public final class zzbym extends zzhq implements zzbyo {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbym(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.rewarded.client.IRewardedAd");
    }

    @Override // com.google.android.gms.internal.ads.zzbyo
    public final void zzb(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel zza = zza();
        zzhs.zzf(zza, iObjectWrapper);
        zzbp(5, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbyo
    public final void zzc(zzazs zzazsVar, zzbyv zzbyvVar) throws RemoteException {
        Parcel zza = zza();
        zzhs.zzd(zza, zzazsVar);
        zzhs.zzf(zza, zzbyvVar);
        zzbp(1, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbyo
    public final void zzd(zzazs zzazsVar, zzbyv zzbyvVar) throws RemoteException {
        Parcel zza = zza();
        zzhs.zzd(zza, zzazsVar);
        zzhs.zzf(zza, zzbyvVar);
        zzbp(14, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbyo
    public final void zze(zzbyr zzbyrVar) throws RemoteException {
        Parcel zza = zza();
        zzhs.zzf(zza, zzbyrVar);
        zzbp(2, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbyo
    public final void zzf(zzbda zzbdaVar) throws RemoteException {
        Parcel zza = zza();
        zzhs.zzf(zza, zzbdaVar);
        zzbp(8, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbyo
    public final Bundle zzg() throws RemoteException {
        Parcel zzbo = zzbo(9, zza());
        Bundle bundle = (Bundle) zzhs.zzc(zzbo, Bundle.CREATOR);
        zzbo.recycle();
        return bundle;
    }

    @Override // com.google.android.gms.internal.ads.zzbyo
    public final void zzh(zzbzc zzbzcVar) throws RemoteException {
        Parcel zza = zza();
        zzhs.zzd(zza, zzbzcVar);
        zzbp(7, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbyo
    public final boolean zzi() throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbyo
    public final String zzj() throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbyo
    public final void zzk(IObjectWrapper iObjectWrapper, boolean z) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbyo
    public final zzbyl zzl() throws RemoteException {
        zzbyl zzbyjVar;
        Parcel zzbo = zzbo(11, zza());
        IBinder readStrongBinder = zzbo.readStrongBinder();
        if (readStrongBinder == null) {
            zzbyjVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardItem");
            if (queryLocalInterface instanceof zzbyl) {
                zzbyjVar = (zzbyl) queryLocalInterface;
            } else {
                zzbyjVar = new zzbyj(readStrongBinder);
            }
        }
        zzbo.recycle();
        return zzbyjVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbyo
    public final zzbdg zzm() throws RemoteException {
        Parcel zzbo = zzbo(12, zza());
        zzbdg zzb = zzbdf.zzb(zzbo.readStrongBinder());
        zzbo.recycle();
        return zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzbyo
    public final void zzn(zzbdd zzbddVar) throws RemoteException {
        Parcel zza = zza();
        zzhs.zzf(zza, zzbddVar);
        zzbp(13, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbyo
    public final void zzo(boolean z) throws RemoteException {
        Parcel zza = zza();
        zzhs.zzb(zza, z);
        zzbp(15, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbyo
    public final void zzp(zzbyw zzbywVar) throws RemoteException {
        throw null;
    }
}
