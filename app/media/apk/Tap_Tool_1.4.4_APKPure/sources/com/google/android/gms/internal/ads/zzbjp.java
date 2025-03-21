package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
/* compiled from: com.google.android.gms:play-services-ads-lite@@20.2.0 */
/* loaded from: classes.dex */
public final class zzbjp extends zzhq implements zzbjr {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbjp(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IOnPublisherAdViewLoadedListener");
    }

    @Override // com.google.android.gms.internal.ads.zzbjr
    public final void zze(zzbbu zzbbuVar, IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel zza = zza();
        zzhs.zzf(zza, zzbbuVar);
        zzhs.zzf(zza, iObjectWrapper);
        zzbp(1, zza);
    }
}
