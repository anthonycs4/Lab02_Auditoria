package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
/* compiled from: com.google.android.gms:play-services-ads-lite@@20.2.0 */
/* loaded from: classes.dex */
public final class zzbxw extends zzhq implements IInterface {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbxw(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.reward.client.IRewardedAdSkuListener");
    }

    public final void zze(zzbxv zzbxvVar, String str, String str2) throws RemoteException {
        Parcel zza = zza();
        zzhs.zzf(zza, zzbxvVar);
        zza.writeString(str);
        zza.writeString(str2);
        zzbp(2, zza);
    }
}
