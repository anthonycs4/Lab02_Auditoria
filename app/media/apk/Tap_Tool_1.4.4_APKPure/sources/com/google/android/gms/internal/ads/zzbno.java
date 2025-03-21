package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.List;
/* compiled from: com.google.android.gms:play-services-ads-lite@@20.2.0 */
/* loaded from: classes.dex */
public final class zzbno extends zzhq implements zzbnq {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbno(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.initialization.IInitializationCallback");
    }

    @Override // com.google.android.gms.internal.ads.zzbnq
    public final void zzb(List<zzbnj> list) throws RemoteException {
        Parcel zza = zza();
        zza.writeTypedList(list);
        zzbp(1, zza);
    }
}
