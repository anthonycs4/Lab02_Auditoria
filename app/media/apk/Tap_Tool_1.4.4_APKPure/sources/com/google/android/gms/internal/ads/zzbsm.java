package com.google.android.gms.internal.ads;

import android.os.RemoteException;
/* compiled from: com.google.android.gms:play-services-ads-lite@@20.2.0 */
/* loaded from: classes.dex */
final class zzbsm implements Runnable {
    final /* synthetic */ zzbsu zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbsm(zzbsu zzbsuVar) {
        this.zza = zzbsuVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzbrk zzbrkVar;
        try {
            zzbrkVar = this.zza.zza;
            zzbrkVar.zzf();
        } catch (RemoteException e) {
            zzccn.zzl("#007 Could not call remote method.", e);
        }
    }
}
