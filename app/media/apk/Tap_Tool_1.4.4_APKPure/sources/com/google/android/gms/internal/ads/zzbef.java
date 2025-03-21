package com.google.android.gms.internal.ads;

import android.os.RemoteException;
/* compiled from: com.google.android.gms:play-services-ads-lite@@20.2.0 */
/* loaded from: classes.dex */
final class zzbef implements Runnable {
    final /* synthetic */ zzbeg zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbef(zzbeg zzbegVar) {
        this.zza = zzbegVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (zzbeh.zzc(this.zza.zza) != null) {
            try {
                zzbeh.zzc(this.zza.zza).zzc(1);
            } catch (RemoteException e) {
                zzccn.zzj("Could not notify onAdFailedToLoad event.", e);
            }
        }
    }
}
