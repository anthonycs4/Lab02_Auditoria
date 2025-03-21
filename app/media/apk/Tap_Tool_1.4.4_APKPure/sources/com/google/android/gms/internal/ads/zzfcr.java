package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzfcr extends zzhq implements IInterface {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzfcr(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.gass.internal.IGassService");
    }

    public final zzfcp zze(zzfcn zzfcnVar) throws RemoteException {
        Parcel zza = zza();
        zzhs.zzd(zza, zzfcnVar);
        Parcel zzbo = zzbo(1, zza);
        zzfcp zzfcpVar = (zzfcp) zzhs.zzc(zzbo, zzfcp.CREATOR);
        zzbo.recycle();
        return zzfcpVar;
    }

    public final void zzf(zzfck zzfckVar) throws RemoteException {
        Parcel zza = zza();
        zzhs.zzd(zza, zzfckVar);
        zzbp(2, zza);
    }

    public final zzfcy zzg(zzfcw zzfcwVar) throws RemoteException {
        Parcel zza = zza();
        zzhs.zzd(zza, zzfcwVar);
        Parcel zzbo = zzbo(3, zza);
        zzfcy zzfcyVar = (zzfcy) zzhs.zzc(zzbo, zzfcy.CREATOR);
        zzbo.recycle();
        return zzfcyVar;
    }
}
