package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
/* compiled from: com.google.android.gms:play-services-ads-lite@@20.2.0 */
/* loaded from: classes.dex */
public final class zzbjl extends zzhq implements zzbjn {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbjl(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IOnCustomTemplateAdLoadedListener");
    }

    @Override // com.google.android.gms.internal.ads.zzbjn
    public final void zze(zzbja zzbjaVar) throws RemoteException {
        Parcel zza = zza();
        zzhs.zzf(zza, zzbjaVar);
        zzbp(1, zza);
    }
}
