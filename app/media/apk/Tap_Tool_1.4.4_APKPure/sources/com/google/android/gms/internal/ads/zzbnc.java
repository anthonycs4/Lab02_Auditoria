package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzbnc extends zzhq implements IInterface {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbnc(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.httpcache.IHttpAssetsCacheService");
    }

    public final void zze(zzbmw zzbmwVar, zzbnb zzbnbVar) throws RemoteException {
        Parcel zza = zza();
        zzhs.zzd(zza, zzbmwVar);
        zzhs.zzf(zza, zzbnbVar);
        zzbq(2, zza);
    }
}
