package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.RemoteException;
/* compiled from: com.google.android.gms:play-services-ads-lite@@20.2.0 */
/* loaded from: classes.dex */
public final class zzbbw extends zzhq implements zzbby {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbbw(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdMetadataListener");
    }

    @Override // com.google.android.gms.internal.ads.zzbby
    public final void zze() throws RemoteException {
        zzbp(1, zza());
    }
}
