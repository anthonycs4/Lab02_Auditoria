package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
/* compiled from: com.google.android.gms:play-services-ads-lite@@20.2.0 */
/* loaded from: classes.dex */
public final class zzauc extends zzhq implements zzaue {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzauc(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.appopen.client.IAppOpenAdLoadCallback");
    }

    @Override // com.google.android.gms.internal.ads.zzaue
    public final void zzb(zzaub zzaubVar) throws RemoteException {
        Parcel zza = zza();
        zzhs.zzf(zza, zzaubVar);
        zzbp(1, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzaue
    public final void zzc(int i) throws RemoteException {
        Parcel zza = zza();
        zza.writeInt(i);
        zzbp(2, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzaue
    public final void zzd(zzazm zzazmVar) throws RemoteException {
        Parcel zza = zza();
        zzhs.zzd(zza, zzazmVar);
        zzbp(3, zza);
    }
}
