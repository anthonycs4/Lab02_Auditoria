package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
/* compiled from: com.google.android.gms:play-services-ads-lite@@20.2.0 */
/* loaded from: classes.dex */
public final class zzbjc extends zzhq implements zzbje {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbjc(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IOnAppInstallAdLoadedListener");
    }

    @Override // com.google.android.gms.internal.ads.zzbje
    public final void zze(zzbiv zzbivVar) throws RemoteException {
        Parcel zza = zza();
        zzhs.zzf(zza, zzbivVar);
        zzbp(1, zza);
    }
}
