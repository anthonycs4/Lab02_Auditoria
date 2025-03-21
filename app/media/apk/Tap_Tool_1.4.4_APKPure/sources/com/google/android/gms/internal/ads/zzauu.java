package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzauu extends zzhq implements IInterface {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzauu(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.cache.ICacheService");
    }

    public final zzaup zze(zzaus zzausVar) throws RemoteException {
        Parcel zza = zza();
        zzhs.zzd(zza, zzausVar);
        Parcel zzbo = zzbo(1, zza);
        zzaup zzaupVar = (zzaup) zzhs.zzc(zzbo, zzaup.CREATOR);
        zzbo.recycle();
        return zzaupVar;
    }

    public final zzaup zzf(zzaus zzausVar) throws RemoteException {
        Parcel zza = zza();
        zzhs.zzd(zza, zzausVar);
        Parcel zzbo = zzbo(2, zza);
        zzaup zzaupVar = (zzaup) zzhs.zzc(zzbo, zzaup.CREATOR);
        zzbo.recycle();
        return zzaupVar;
    }

    public final long zzg(zzaus zzausVar) throws RemoteException {
        Parcel zza = zza();
        zzhs.zzd(zza, zzausVar);
        Parcel zzbo = zzbo(3, zza);
        long readLong = zzbo.readLong();
        zzbo.recycle();
        return readLong;
    }
}
