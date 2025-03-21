package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
/* compiled from: com.google.android.gms:play-services-ads-lite@@20.2.0 */
/* loaded from: classes.dex */
public final class zzbtj extends zzhq implements zzbtl {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbtj(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.rtb.IRtbAdapter");
    }

    @Override // com.google.android.gms.internal.ads.zzbtl
    public final void zze(IObjectWrapper iObjectWrapper, String str, Bundle bundle, Bundle bundle2, zzazx zzazxVar, zzbto zzbtoVar) throws RemoteException {
        Parcel zza = zza();
        zzhs.zzf(zza, iObjectWrapper);
        zza.writeString(str);
        zzhs.zzd(zza, bundle);
        zzhs.zzd(zza, bundle2);
        zzhs.zzd(zza, zzazxVar);
        zzhs.zzf(zza, zzbtoVar);
        zzbp(1, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbtl
    public final zzbty zzf() throws RemoteException {
        Parcel zzbo = zzbo(2, zza());
        zzbty zzbtyVar = (zzbty) zzhs.zzc(zzbo, zzbty.CREATOR);
        zzbo.recycle();
        return zzbtyVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbtl
    public final zzbty zzg() throws RemoteException {
        Parcel zzbo = zzbo(3, zza());
        zzbty zzbtyVar = (zzbty) zzhs.zzc(zzbo, zzbty.CREATOR);
        zzbo.recycle();
        return zzbtyVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbtl
    public final zzbdj zzh() throws RemoteException {
        Parcel zzbo = zzbo(5, zza());
        zzbdj zzb = zzbdi.zzb(zzbo.readStrongBinder());
        zzbo.recycle();
        return zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzbtl
    public final void zzi(String str, String str2, zzazs zzazsVar, IObjectWrapper iObjectWrapper, zzbsz zzbszVar, zzbrk zzbrkVar, zzazx zzazxVar) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        zza.writeString(str2);
        zzhs.zzd(zza, zzazsVar);
        zzhs.zzf(zza, iObjectWrapper);
        zzhs.zzf(zza, zzbszVar);
        zzhs.zzf(zza, zzbrkVar);
        zzhs.zzd(zza, zzazxVar);
        zzbp(13, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbtl
    public final void zzj(String str, String str2, zzazs zzazsVar, IObjectWrapper iObjectWrapper, zzbtc zzbtcVar, zzbrk zzbrkVar) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        zza.writeString(str2);
        zzhs.zzd(zza, zzazsVar);
        zzhs.zzf(zza, iObjectWrapper);
        zzhs.zzf(zza, zzbtcVar);
        zzhs.zzf(zza, zzbrkVar);
        zzbp(14, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbtl
    public final boolean zzk(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel zza = zza();
        zzhs.zzf(zza, iObjectWrapper);
        Parcel zzbo = zzbo(15, zza);
        boolean zza2 = zzhs.zza(zzbo);
        zzbo.recycle();
        return zza2;
    }

    @Override // com.google.android.gms.internal.ads.zzbtl
    public final void zzl(String str, String str2, zzazs zzazsVar, IObjectWrapper iObjectWrapper, zzbti zzbtiVar, zzbrk zzbrkVar) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        zza.writeString(str2);
        zzhs.zzd(zza, zzazsVar);
        zzhs.zzf(zza, iObjectWrapper);
        zzhs.zzf(zza, zzbtiVar);
        zzhs.zzf(zza, zzbrkVar);
        zzbp(16, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbtl
    public final boolean zzm(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel zza = zza();
        zzhs.zzf(zza, iObjectWrapper);
        Parcel zzbo = zzbo(17, zza);
        boolean zza2 = zzhs.zza(zzbo);
        zzbo.recycle();
        return zza2;
    }

    @Override // com.google.android.gms.internal.ads.zzbtl
    public final void zzn(String str, String str2, zzazs zzazsVar, IObjectWrapper iObjectWrapper, zzbtf zzbtfVar, zzbrk zzbrkVar) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        zza.writeString(str2);
        zzhs.zzd(zza, zzazsVar);
        zzhs.zzf(zza, iObjectWrapper);
        zzhs.zzf(zza, zzbtfVar);
        zzhs.zzf(zza, zzbrkVar);
        zzbp(18, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbtl
    public final void zzo(String str) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        zzbp(19, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbtl
    public final void zzp(String str, String str2, zzazs zzazsVar, IObjectWrapper iObjectWrapper, zzbti zzbtiVar, zzbrk zzbrkVar) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        zza.writeString(str2);
        zzhs.zzd(zza, zzazsVar);
        zzhs.zzf(zza, iObjectWrapper);
        zzhs.zzf(zza, zzbtiVar);
        zzhs.zzf(zza, zzbrkVar);
        zzbp(20, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbtl
    public final void zzq(String str, String str2, zzazs zzazsVar, IObjectWrapper iObjectWrapper, zzbsz zzbszVar, zzbrk zzbrkVar, zzazx zzazxVar) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        zza.writeString(str2);
        zzhs.zzd(zza, zzazsVar);
        zzhs.zzf(zza, iObjectWrapper);
        zzhs.zzf(zza, zzbszVar);
        zzhs.zzf(zza, zzbrkVar);
        zzhs.zzd(zza, zzazxVar);
        zzbp(21, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbtl
    public final void zzr(String str, String str2, zzazs zzazsVar, IObjectWrapper iObjectWrapper, zzbtf zzbtfVar, zzbrk zzbrkVar, zzbhy zzbhyVar) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        zza.writeString(str2);
        zzhs.zzd(zza, zzazsVar);
        zzhs.zzf(zza, iObjectWrapper);
        zzhs.zzf(zza, zzbtfVar);
        zzhs.zzf(zza, zzbrkVar);
        zzhs.zzd(zza, zzbhyVar);
        zzbp(22, zza);
    }
}
