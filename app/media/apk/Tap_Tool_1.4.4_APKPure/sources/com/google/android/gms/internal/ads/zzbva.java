package com.google.android.gms.internal.ads;

import android.content.Intent;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
/* compiled from: com.google.android.gms:play-services-ads-lite@@20.2.0 */
/* loaded from: classes.dex */
public final class zzbva extends zzhq implements zzbvc {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbva(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.offline.IOfflineUtils");
    }

    @Override // com.google.android.gms.internal.ads.zzbvc
    public final void zze(Intent intent) throws RemoteException {
        Parcel zza = zza();
        zzhs.zzd(zza, intent);
        zzbp(1, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbvc
    public final void zzf(IObjectWrapper iObjectWrapper, String str, String str2) throws RemoteException {
        Parcel zza = zza();
        zzhs.zzf(zza, iObjectWrapper);
        zza.writeString(str);
        zza.writeString(str2);
        zzbp(2, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbvc
    public final void zzg() throws RemoteException {
        zzbp(3, zza());
    }
}
