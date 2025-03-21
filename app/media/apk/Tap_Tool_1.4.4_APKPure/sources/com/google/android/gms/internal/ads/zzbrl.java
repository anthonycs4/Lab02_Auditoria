package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
/* compiled from: com.google.android.gms:play-services-ads-lite@@20.2.0 */
/* loaded from: classes.dex */
public final class zzbrl extends zzhq implements zzbrn {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbrl(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.IMediationInterscrollerAd");
    }

    @Override // com.google.android.gms.internal.ads.zzbrn
    public final IObjectWrapper zze() throws RemoteException {
        Parcel zzbo = zzbo(1, zza());
        IObjectWrapper asInterface = IObjectWrapper.Stub.asInterface(zzbo.readStrongBinder());
        zzbo.recycle();
        return asInterface;
    }

    @Override // com.google.android.gms.internal.ads.zzbrn
    public final boolean zzf() throws RemoteException {
        Parcel zzbo = zzbo(2, zza());
        boolean zza = zzhs.zza(zzbo);
        zzbo.recycle();
        return zza;
    }
}
