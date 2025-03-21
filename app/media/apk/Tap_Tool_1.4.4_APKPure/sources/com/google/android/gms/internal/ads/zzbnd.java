package com.google.android.gms.internal.ads;

import android.os.ParcelFileDescriptor;
import android.os.RemoteException;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
final class zzbnd extends zzbna {
    final /* synthetic */ zzcde zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbnd(zzbne zzbneVar, zzcde zzcdeVar) {
        this.zza = zzcdeVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbnb
    public final void zzb(ParcelFileDescriptor parcelFileDescriptor) throws RemoteException {
        this.zza.zzc(parcelFileDescriptor);
    }
}
