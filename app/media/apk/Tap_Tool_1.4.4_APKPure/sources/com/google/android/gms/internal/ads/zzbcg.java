package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
/* compiled from: com.google.android.gms:play-services-ads-lite@@20.2.0 */
/* loaded from: classes.dex */
public final class zzbcg extends zzhq implements zzbci {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbcg(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IFullScreenContentCallback");
    }

    @Override // com.google.android.gms.internal.ads.zzbci
    public final void zzb(zzazm zzazmVar) throws RemoteException {
        Parcel zza = zza();
        zzhs.zzd(zza, zzazmVar);
        zzbp(1, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbci
    public final void zzc() throws RemoteException {
        zzbp(2, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbci
    public final void zzd() throws RemoteException {
        zzbp(3, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbci
    public final void zze() throws RemoteException {
        zzbp(4, zza());
    }
}
