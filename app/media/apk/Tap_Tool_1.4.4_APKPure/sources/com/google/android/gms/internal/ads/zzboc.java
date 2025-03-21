package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
/* compiled from: com.google.android.gms:play-services-ads-lite@@20.2.0 */
/* loaded from: classes.dex */
public final class zzboc extends zzhq implements zzboe {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzboc(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.instream.client.IInstreamAdLoadCallback");
    }

    @Override // com.google.android.gms.internal.ads.zzboe
    public final void zze(zzbny zzbnyVar) throws RemoteException {
        Parcel zza = zza();
        zzhs.zzf(zza, zzbnyVar);
        zzbp(1, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzboe
    public final void zzf(int i) throws RemoteException {
        Parcel zza = zza();
        zza.writeInt(i);
        zzbp(2, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzboe
    public final void zzg(zzazm zzazmVar) throws RemoteException {
        Parcel zza = zza();
        zzhs.zzd(zza, zzazmVar);
        zzbp(3, zza);
    }
}
