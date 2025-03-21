package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.dynamic.IObjectWrapper;
/* compiled from: com.google.android.gms:play-services-ads-lite@@20.2.0 */
/* loaded from: classes.dex */
public final class zzeyp extends zzhq implements zzeyr {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzeyp(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.omid.IOmid");
    }

    @Override // com.google.android.gms.internal.ads.zzeyr
    public final boolean zze(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel zza = zza();
        zzhs.zzf(zza, iObjectWrapper);
        Parcel zzbo = zzbo(2, zza);
        boolean zza2 = zzhs.zza(zzbo);
        zzbo.recycle();
        return zza2;
    }

    @Override // com.google.android.gms.internal.ads.zzeyr
    public final void zzf(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel zza = zza();
        zzhs.zzf(zza, iObjectWrapper);
        zzbp(4, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzeyr
    public final void zzg(IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2) throws RemoteException {
        Parcel zza = zza();
        zzhs.zzf(zza, iObjectWrapper);
        zzhs.zzf(zza, iObjectWrapper2);
        zzbp(5, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzeyr
    public final String zzh() throws RemoteException {
        Parcel zzbo = zzbo(6, zza());
        String readString = zzbo.readString();
        zzbo.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.zzeyr
    public final void zzi(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel zza = zza();
        zzhs.zzf(zza, iObjectWrapper);
        zzbp(7, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzeyr
    public final void zzj(IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2) throws RemoteException {
        Parcel zza = zza();
        zzhs.zzf(zza, iObjectWrapper);
        zzhs.zzf(zza, iObjectWrapper2);
        zzbp(8, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzeyr
    public final IObjectWrapper zzk(String str, IObjectWrapper iObjectWrapper, String str2, String str3, String str4, String str5) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        zzhs.zzf(zza, iObjectWrapper);
        zza.writeString(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED);
        zza.writeString("javascript");
        zza.writeString(str4);
        zza.writeString(str5);
        Parcel zzbo = zzbo(9, zza);
        IObjectWrapper asInterface = IObjectWrapper.Stub.asInterface(zzbo.readStrongBinder());
        zzbo.recycle();
        return asInterface;
    }

    @Override // com.google.android.gms.internal.ads.zzeyr
    public final IObjectWrapper zzl(String str, IObjectWrapper iObjectWrapper, String str2, String str3, String str4, String str5, String str6, String str7, String str8) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        zzhs.zzf(zza, iObjectWrapper);
        zza.writeString(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED);
        zza.writeString("javascript");
        zza.writeString(str4);
        zza.writeString(str5);
        zza.writeString(str6);
        zza.writeString(str7);
        zza.writeString(str8);
        Parcel zzbo = zzbo(10, zza);
        IObjectWrapper asInterface = IObjectWrapper.Stub.asInterface(zzbo.readStrongBinder());
        zzbo.recycle();
        return asInterface;
    }

    @Override // com.google.android.gms.internal.ads.zzeyr
    public final IObjectWrapper zzm(String str, IObjectWrapper iObjectWrapper, String str2, String str3, String str4, String str5, String str6, String str7, String str8) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        zzhs.zzf(zza, iObjectWrapper);
        zza.writeString(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED);
        zza.writeString("javascript");
        zza.writeString(str4);
        zza.writeString("Google");
        zza.writeString(str6);
        zza.writeString(str7);
        zza.writeString(str8);
        Parcel zzbo = zzbo(11, zza);
        IObjectWrapper asInterface = IObjectWrapper.Stub.asInterface(zzbo.readStrongBinder());
        zzbo.recycle();
        return asInterface;
    }
}
