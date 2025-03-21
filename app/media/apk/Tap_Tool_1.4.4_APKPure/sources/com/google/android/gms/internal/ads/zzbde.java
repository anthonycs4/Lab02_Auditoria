package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.ArrayList;
import java.util.List;
/* compiled from: com.google.android.gms:play-services-ads-lite@@20.2.0 */
/* loaded from: classes.dex */
public final class zzbde extends zzhq implements zzbdg {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbde(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IResponseInfo");
    }

    @Override // com.google.android.gms.internal.ads.zzbdg
    public final String zze() throws RemoteException {
        Parcel zzbo = zzbo(1, zza());
        String readString = zzbo.readString();
        zzbo.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.zzbdg
    public final String zzf() throws RemoteException {
        Parcel zzbo = zzbo(2, zza());
        String readString = zzbo.readString();
        zzbo.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.zzbdg
    public final List<zzbab> zzg() throws RemoteException {
        Parcel zzbo = zzbo(3, zza());
        ArrayList createTypedArrayList = zzbo.createTypedArrayList(zzbab.CREATOR);
        zzbo.recycle();
        return createTypedArrayList;
    }
}
