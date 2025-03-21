package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
/* compiled from: com.google.android.gms:play-services-ads-lite@@20.2.0 */
/* loaded from: classes.dex */
public final class zzbjy extends zzhq implements zzbka {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbjy(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IUnconfirmedClickListener");
    }

    @Override // com.google.android.gms.internal.ads.zzbka
    public final void zze(String str) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        zzbp(1, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbka
    public final void zzf() throws RemoteException {
        zzbp(2, zza());
    }
}
