package com.google.android.gms.internal.ads;

import java.util.concurrent.BlockingQueue;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzn implements Runnable {
    final /* synthetic */ zzac zza;
    final /* synthetic */ zzo zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzn(zzo zzoVar, zzac zzacVar) {
        this.zzb = zzoVar;
        this.zza = zzacVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        BlockingQueue blockingQueue;
        try {
            blockingQueue = this.zzb.zzc;
            blockingQueue.put(this.zza);
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        }
    }
}
