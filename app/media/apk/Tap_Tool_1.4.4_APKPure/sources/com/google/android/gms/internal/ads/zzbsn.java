package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.ads.AdRequest;
/* compiled from: com.google.android.gms:play-services-ads-lite@@20.2.0 */
/* loaded from: classes.dex */
final class zzbsn implements Runnable {
    final /* synthetic */ AdRequest.ErrorCode zza;
    final /* synthetic */ zzbsu zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbsn(zzbsu zzbsuVar, AdRequest.ErrorCode errorCode) {
        this.zzb = zzbsuVar;
        this.zza = errorCode;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzbrk zzbrkVar;
        try {
            zzbrkVar = this.zzb.zza;
            zzbrkVar.zzg(zzbsv.zza(this.zza));
        } catch (RemoteException e) {
            zzccn.zzl("#007 Could not call remote method.", e);
        }
    }
}
