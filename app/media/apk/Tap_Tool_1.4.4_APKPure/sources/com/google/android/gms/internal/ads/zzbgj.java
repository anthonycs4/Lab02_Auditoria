package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
/* compiled from: com.google.android.gms:play-services-ads-lite@@20.2.0 */
/* loaded from: classes.dex */
public final class zzbgj extends zzhq implements zzbgl {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbgj(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.customrenderedad.client.IOnCustomRenderedAdLoadedListener");
    }

    @Override // com.google.android.gms.internal.ads.zzbgl
    public final void zze(zzbgi zzbgiVar) throws RemoteException {
        Parcel zza = zza();
        zzhs.zzf(zza, zzbgiVar);
        zzbp(1, zza);
    }
}
