package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
/* compiled from: com.google.android.gms:play-services-ads-lite@@20.2.0 */
/* loaded from: classes.dex */
public final class zzbjf extends zzhq implements zzbjh {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbjf(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IOnContentAdLoadedListener");
    }

    @Override // com.google.android.gms.internal.ads.zzbjh
    public final void zze(zzbix zzbixVar) throws RemoteException {
        Parcel zza = zza();
        zzhs.zzf(zza, zzbixVar);
        zzbp(1, zza);
    }
}
