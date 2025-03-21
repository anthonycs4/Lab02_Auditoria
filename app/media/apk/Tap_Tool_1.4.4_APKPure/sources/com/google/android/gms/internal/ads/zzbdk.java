package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
/* compiled from: com.google.android.gms:play-services-ads-lite@@20.2.0 */
/* loaded from: classes.dex */
public final class zzbdk extends zzhq implements zzbdm {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbdk(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IVideoLifecycleCallbacks");
    }

    @Override // com.google.android.gms.internal.ads.zzbdm
    public final void zze() throws RemoteException {
        zzbp(1, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbdm
    public final void zzf() throws RemoteException {
        zzbp(2, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbdm
    public final void zzg() throws RemoteException {
        zzbp(3, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbdm
    public final void zzh() throws RemoteException {
        zzbp(4, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbdm
    public final void zzi(boolean z) throws RemoteException {
        Parcel zza = zza();
        zzhs.zzb(zza, z);
        zzbp(5, zza);
    }
}
