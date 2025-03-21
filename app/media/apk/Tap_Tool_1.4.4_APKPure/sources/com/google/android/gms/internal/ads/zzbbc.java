package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.RemoteException;
/* compiled from: com.google.android.gms:play-services-ads-lite@@20.2.0 */
/* loaded from: classes.dex */
public final class zzbbc extends zzhq implements zzbbe {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbbc(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdClickListener");
    }

    @Override // com.google.android.gms.internal.ads.zzbbe
    public final void zzb() throws RemoteException {
        zzbp(1, zza());
    }
}
