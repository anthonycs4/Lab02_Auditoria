package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
/* compiled from: com.google.android.gms:play-services-ads-lite@@20.2.0 */
/* loaded from: classes.dex */
public final class zzbbl extends zzhq implements zzbbn {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbbl(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdLoader");
    }

    @Override // com.google.android.gms.internal.ads.zzbbn
    public final void zze(zzazs zzazsVar) throws RemoteException {
        Parcel zza = zza();
        zzhs.zzd(zza, zzazsVar);
        zzbp(1, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbbn
    public final String zzf() throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbbn
    public final boolean zzg() throws RemoteException {
        Parcel zzbo = zzbo(3, zza());
        boolean zza = zzhs.zza(zzbo);
        zzbo.recycle();
        return zza;
    }

    @Override // com.google.android.gms.internal.ads.zzbbn
    public final String zzh() throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbbn
    public final void zzi(zzazs zzazsVar, int i) throws RemoteException {
        Parcel zza = zza();
        zzhs.zzd(zza, zzazsVar);
        zza.writeInt(i);
        zzbp(5, zza);
    }
}
