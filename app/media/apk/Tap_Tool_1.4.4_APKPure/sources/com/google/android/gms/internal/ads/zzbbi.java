package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
/* compiled from: com.google.android.gms:play-services-ads-lite@@20.2.0 */
/* loaded from: classes.dex */
public final class zzbbi extends zzhq implements zzbbk {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbbi(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdLoadCallback");
    }

    @Override // com.google.android.gms.internal.ads.zzbbk
    public final void zzb() throws RemoteException {
        zzbp(1, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbbk
    public final void zzc(zzazm zzazmVar) throws RemoteException {
        Parcel zza = zza();
        zzhs.zzd(zza, zzazmVar);
        zzbp(2, zza);
    }
}
