package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
/* compiled from: com.google.android.gms:play-services-ads-lite@@20.2.0 */
/* loaded from: classes.dex */
public final class zzaug extends zzhq implements zzaui {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzaug(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.appopen.client.IAppOpenFullScreenContentCallback");
    }

    @Override // com.google.android.gms.internal.ads.zzaui
    public final void zzc() throws RemoteException {
        zzbp(1, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzaui
    public final void zzd() throws RemoteException {
        zzbp(2, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzaui
    public final void zze(zzazm zzazmVar) throws RemoteException {
        Parcel zza = zza();
        zzhs.zzd(zza, zzazmVar);
        zzbp(3, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzaui
    public final void zzf() throws RemoteException {
        zzbp(4, zza());
    }
}
