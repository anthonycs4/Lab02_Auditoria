package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
/* compiled from: com.google.android.gms:play-services-ads-lite@@20.2.0 */
/* loaded from: classes.dex */
public final class zzbcr extends zzhq implements zzbct {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbcr(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IMuteThisAdReason");
    }

    @Override // com.google.android.gms.internal.ads.zzbct
    public final String zze() throws RemoteException {
        Parcel zzbo = zzbo(1, zza());
        String readString = zzbo.readString();
        zzbo.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.zzbct
    public final String zzf() throws RemoteException {
        Parcel zzbo = zzbo(2, zza());
        String readString = zzbo.readString();
        zzbo.recycle();
        return readString;
    }
}
