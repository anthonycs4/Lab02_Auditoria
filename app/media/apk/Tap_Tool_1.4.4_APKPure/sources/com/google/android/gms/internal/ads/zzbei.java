package com.google.android.gms.internal.ads;

import android.os.RemoteException;
/* compiled from: com.google.android.gms:play-services-ads-lite@@20.2.0 */
/* loaded from: classes.dex */
final class zzbei implements Runnable {
    final /* synthetic */ zzbej zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbei(zzbej zzbejVar) {
        this.zza = zzbejVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzbbh zzbbhVar;
        zzbbh zzbbhVar2;
        zzbbhVar = this.zza.zza;
        if (zzbbhVar != null) {
            try {
                zzbbhVar2 = this.zza.zza;
                zzbbhVar2.zzc(1);
            } catch (RemoteException e) {
                zzccn.zzj("Could not notify onAdFailedToLoad event.", e);
            }
        }
    }
}
