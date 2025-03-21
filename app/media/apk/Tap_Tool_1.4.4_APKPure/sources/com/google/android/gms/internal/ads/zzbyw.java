package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
/* compiled from: com.google.android.gms:play-services-ads-lite@@20.2.0 */
/* loaded from: classes.dex */
public final class zzbyw extends zzhq implements IInterface {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbyw(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.rewarded.client.IRewardedAdSkuListener");
    }

    public final void zze(zzbyl zzbylVar, String str, String str2) throws RemoteException {
        Parcel zza = zza();
        zzhs.zzf(zza, zzbylVar);
        zza.writeString(str);
        zza.writeString(str2);
        zzbp(2, zza);
    }
}
