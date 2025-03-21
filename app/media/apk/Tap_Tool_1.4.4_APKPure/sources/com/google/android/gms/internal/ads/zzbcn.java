package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.RemoteException;
/* compiled from: com.google.android.gms:play-services-ads-lite@@20.2.0 */
/* loaded from: classes.dex */
public final class zzbcn extends zzhq implements zzbcp {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbcn(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IMuteThisAdListener");
    }

    @Override // com.google.android.gms.internal.ads.zzbcp
    public final void zze() throws RemoteException {
        zzbp(1, zza());
    }
}
