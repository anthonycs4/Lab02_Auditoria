package com.google.android.gms.ads.internal.util;

import android.content.Context;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzm implements Runnable {
    final /* synthetic */ Context zza;
    final /* synthetic */ zzr zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzm(zzr zzrVar, Context context) {
        this.zzb = zzrVar;
        this.zza = context;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        Object obj2;
        obj = this.zzb.zzf;
        synchronized (obj) {
            this.zzb.zzg = zzr.zzT(this.zza);
            obj2 = this.zzb.zzf;
            obj2.notifyAll();
        }
    }
}
