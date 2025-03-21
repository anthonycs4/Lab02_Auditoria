package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.List;
/* compiled from: com.google.android.gms:play-services-ads-lite@@20.2.0 */
/* loaded from: classes.dex */
public final class zzcbh extends zzhq implements zzcbj {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzcbh(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.signals.ISignalGenerator");
    }

    @Override // com.google.android.gms.internal.ads.zzcbj
    public final void zze(IObjectWrapper iObjectWrapper, zzcbn zzcbnVar, zzcbg zzcbgVar) throws RemoteException {
        Parcel zza = zza();
        zzhs.zzf(zza, iObjectWrapper);
        zzhs.zzd(zza, zzcbnVar);
        zzhs.zzf(zza, zzcbgVar);
        zzbp(1, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzcbj
    public final void zzf(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel zza = zza();
        zzhs.zzf(zza, iObjectWrapper);
        zzbp(2, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzcbj
    public final void zzg(List<Uri> list, IObjectWrapper iObjectWrapper, zzbwb zzbwbVar) throws RemoteException {
        Parcel zza = zza();
        zza.writeTypedList(list);
        zzhs.zzf(zza, iObjectWrapper);
        zzhs.zzf(zza, zzbwbVar);
        zzbp(5, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzcbj
    public final void zzh(List<Uri> list, IObjectWrapper iObjectWrapper, zzbwb zzbwbVar) throws RemoteException {
        Parcel zza = zza();
        zza.writeTypedList(list);
        zzhs.zzf(zza, iObjectWrapper);
        zzhs.zzf(zza, zzbwbVar);
        zzbp(6, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzcbj
    public final void zzi(zzbwi zzbwiVar) throws RemoteException {
        Parcel zza = zza();
        zzhs.zzd(zza, zzbwiVar);
        zzbp(7, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzcbj
    public final void zzj(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel zza = zza();
        zzhs.zzf(zza, iObjectWrapper);
        zzbp(8, zza);
    }
}
