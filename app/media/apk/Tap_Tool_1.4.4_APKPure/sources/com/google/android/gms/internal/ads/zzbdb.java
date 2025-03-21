package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
/* compiled from: com.google.android.gms:play-services-ads-lite@@20.2.0 */
/* loaded from: classes.dex */
public final class zzbdb extends zzhq implements zzbdd {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbdb(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IOnPaidEventListener");
    }

    @Override // com.google.android.gms.internal.ads.zzbdd
    public final void zze(zzazz zzazzVar) throws RemoteException {
        Parcel zza = zza();
        zzhs.zzd(zza, zzazzVar);
        zzbp(1, zza);
    }
}
