package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
/* compiled from: com.google.android.gms:play-services-ads-lite@@20.2.0 */
/* loaded from: classes.dex */
public final class zzbji extends zzhq implements zzbjk {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbji(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IOnCustomClickListener");
    }

    @Override // com.google.android.gms.internal.ads.zzbjk
    public final void zze(zzbja zzbjaVar, String str) throws RemoteException {
        Parcel zza = zza();
        zzhs.zzf(zza, zzbjaVar);
        zza.writeString(str);
        zzbp(1, zza);
    }
}
