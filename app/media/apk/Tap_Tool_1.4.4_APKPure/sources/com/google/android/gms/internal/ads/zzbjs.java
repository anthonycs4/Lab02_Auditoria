package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
/* compiled from: com.google.android.gms:play-services-ads-lite@@20.2.0 */
/* loaded from: classes.dex */
public final class zzbjs extends zzhq implements zzbju {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbjs(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IOnUnifiedNativeAdLoadedListener");
    }

    @Override // com.google.android.gms.internal.ads.zzbju
    public final void zze(zzbkd zzbkdVar) throws RemoteException {
        Parcel zza = zza();
        zzhs.zzf(zza, zzbkdVar);
        zzbp(1, zza);
    }
}
