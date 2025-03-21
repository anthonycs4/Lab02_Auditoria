package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
/* compiled from: com.google.android.gms:play-services-ads-lite@@20.2.0 */
/* loaded from: classes.dex */
public final class zzatz extends zzhq implements zzaub {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzatz(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.appopen.client.IAppOpenAd");
    }

    @Override // com.google.android.gms.internal.ads.zzaub
    public final zzbbu zze() throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzaub
    public final void zzf(IObjectWrapper iObjectWrapper, zzaui zzauiVar) throws RemoteException {
        Parcel zza = zza();
        zzhs.zzf(zza, iObjectWrapper);
        zzhs.zzf(zza, zzauiVar);
        zzbp(4, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzaub
    public final zzbdg zzg() throws RemoteException {
        Parcel zzbo = zzbo(5, zza());
        zzbdg zzb = zzbdf.zzb(zzbo.readStrongBinder());
        zzbo.recycle();
        return zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzaub
    public final void zzh(boolean z) throws RemoteException {
        Parcel zza = zza();
        zzhs.zzb(zza, z);
        zzbp(6, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzaub
    public final void zzi(zzbdd zzbddVar) throws RemoteException {
        Parcel zza = zza();
        zzhs.zzf(zza, zzbddVar);
        zzbp(7, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzaub
    public final void zzj(zzauf zzaufVar) throws RemoteException {
        throw null;
    }
}
