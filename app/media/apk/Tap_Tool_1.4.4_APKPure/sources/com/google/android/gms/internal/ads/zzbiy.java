package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.ArrayList;
import java.util.List;
/* compiled from: com.google.android.gms:play-services-ads-lite@@20.2.0 */
/* loaded from: classes.dex */
public final class zzbiy extends zzhq implements zzbja {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbiy(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.INativeCustomTemplateAd");
    }

    @Override // com.google.android.gms.internal.ads.zzbja
    public final String zze(String str) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        Parcel zzbo = zzbo(1, zza);
        String readString = zzbo.readString();
        zzbo.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.zzbja
    public final zzbik zzf(String str) throws RemoteException {
        zzbik zzbiiVar;
        Parcel zza = zza();
        zza.writeString(str);
        Parcel zzbo = zzbo(2, zza);
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

    @Override // com.google.android.gms.internal.ads.zzbja
    public final List<String> zzg() throws RemoteException {
        Parcel zzbo = zzbo(3, zza());
        ArrayList<String> createStringArrayList = zzbo.createStringArrayList();
        zzbo.recycle();
        return createStringArrayList;
    }

    @Override // com.google.android.gms.internal.ads.zzbja
    public final String zzh() throws RemoteException {
        Parcel zzbo = zzbo(4, zza());
        String readString = zzbo.readString();
        zzbo.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.zzbja
    public final void zzi(String str) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        zzbp(5, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbja
    public final void zzj() throws RemoteException {
        zzbp(6, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbja
    public final zzbdj zzk() throws RemoteException {
        Parcel zzbo = zzbo(7, zza());
        zzbdj zzb = zzbdi.zzb(zzbo.readStrongBinder());
        zzbo.recycle();
        return zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzbja
    public final void zzl() throws RemoteException {
        zzbp(8, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbja
    public final IObjectWrapper zzm() throws RemoteException {
        Parcel zzbo = zzbo(9, zza());
        IObjectWrapper asInterface = IObjectWrapper.Stub.asInterface(zzbo.readStrongBinder());
        zzbo.recycle();
        return asInterface;
    }

    @Override // com.google.android.gms.internal.ads.zzbja
    public final boolean zzn(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel zza = zza();
        zzhs.zzf(zza, iObjectWrapper);
        Parcel zzbo = zzbo(10, zza);
        boolean zza2 = zzhs.zza(zzbo);
        zzbo.recycle();
        return zza2;
    }

    @Override // com.google.android.gms.internal.ads.zzbja
    public final boolean zzo() throws RemoteException {
        Parcel zzbo = zzbo(12, zza());
        boolean zza = zzhs.zza(zzbo);
        zzbo.recycle();
        return zza;
    }

    @Override // com.google.android.gms.internal.ads.zzbja
    public final boolean zzp() throws RemoteException {
        Parcel zzbo = zzbo(13, zza());
        boolean zza = zzhs.zza(zzbo);
        zzbo.recycle();
        return zza;
    }

    @Override // com.google.android.gms.internal.ads.zzbja
    public final void zzq(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel zza = zza();
        zzhs.zzf(zza, iObjectWrapper);
        zzbp(14, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbja
    public final void zzr() throws RemoteException {
        zzbp(15, zza());
    }
}
