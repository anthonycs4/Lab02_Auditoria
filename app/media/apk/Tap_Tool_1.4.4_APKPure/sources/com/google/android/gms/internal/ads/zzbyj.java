package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
/* compiled from: com.google.android.gms:play-services-ads-lite@@20.2.0 */
/* loaded from: classes.dex */
public final class zzbyj extends zzhq implements zzbyl {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbyj(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.rewarded.client.IRewardItem");
    }

    @Override // com.google.android.gms.internal.ads.zzbyl
    public final String zze() throws RemoteException {
        Parcel zzbo = zzbo(1, zza());
        String readString = zzbo.readString();
        zzbo.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.zzbyl
    public final int zzf() throws RemoteException {
        Parcel zzbo = zzbo(2, zza());
        int readInt = zzbo.readInt();
        zzbo.recycle();
        return readInt;
    }
}
