package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.ArrayList;
import java.util.List;
/* compiled from: com.google.android.gms:play-services-ads-lite@@20.2.0 */
/* loaded from: classes.dex */
public final class zzbcj extends zzhq implements zzbcl {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbcj(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IMobileAdsSettingManager");
    }

    @Override // com.google.android.gms.internal.ads.zzbcl
    public final void zze() throws RemoteException {
        zzbp(1, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbcl
    public final void zzf(float f) throws RemoteException {
        Parcel zza = zza();
        zza.writeFloat(f);
        zzbp(2, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbcl
    public final void zzg(String str) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbcl
    public final void zzh(boolean z) throws RemoteException {
        Parcel zza = zza();
        zzhs.zzb(zza, z);
        zzbp(4, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbcl
    public final void zzi(IObjectWrapper iObjectWrapper, String str) throws RemoteException {
        Parcel zza = zza();
        zzhs.zzf(zza, iObjectWrapper);
        zza.writeString(str);
        zzbp(5, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbcl
    public final void zzj(String str, IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(null);
        zzhs.zzf(zza, iObjectWrapper);
        zzbp(6, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbcl
    public final float zzk() throws RemoteException {
        Parcel zzbo = zzbo(7, zza());
        float readFloat = zzbo.readFloat();
        zzbo.recycle();
        return readFloat;
    }

    @Override // com.google.android.gms.internal.ads.zzbcl
    public final boolean zzl() throws RemoteException {
        Parcel zzbo = zzbo(8, zza());
        boolean zza = zzhs.zza(zzbo);
        zzbo.recycle();
        return zza;
    }

    @Override // com.google.android.gms.internal.ads.zzbcl
    public final String zzm() throws RemoteException {
        Parcel zzbo = zzbo(9, zza());
        String readString = zzbo.readString();
        zzbo.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.zzbcl
    public final void zzn(String str) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        zzbp(10, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbcl
    public final void zzo(zzbre zzbreVar) throws RemoteException {
        Parcel zza = zza();
        zzhs.zzf(zza, zzbreVar);
        zzbp(11, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbcl
    public final void zzp(zzbnq zzbnqVar) throws RemoteException {
        Parcel zza = zza();
        zzhs.zzf(zza, zzbnqVar);
        zzbp(12, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbcl
    public final List<zzbnj> zzq() throws RemoteException {
        Parcel zzbo = zzbo(13, zza());
        ArrayList createTypedArrayList = zzbo.createTypedArrayList(zzbnj.CREATOR);
        zzbo.recycle();
        return createTypedArrayList;
    }

    @Override // com.google.android.gms.internal.ads.zzbcl
    public final void zzr(zzbes zzbesVar) throws RemoteException {
        Parcel zza = zza();
        zzhs.zzd(zza, zzbesVar);
        zzbp(14, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbcl
    public final void zzs() throws RemoteException {
        zzbp(15, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbcl
    public final void zzt(zzbcx zzbcxVar) throws RemoteException {
        Parcel zza = zza();
        zzhs.zzf(zza, zzbcxVar);
        zzbp(16, zza);
    }
}
