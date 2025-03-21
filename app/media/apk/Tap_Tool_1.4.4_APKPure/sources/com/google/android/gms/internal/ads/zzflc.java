package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
final class zzflc implements Executor {
    final /* synthetic */ Executor zza;
    final /* synthetic */ zzfjl zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzflc(Executor executor, zzfjl zzfjlVar) {
        this.zza = executor;
        this.zzb = zzfjlVar;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        try {
            this.zza.execute(runnable);
        } catch (RejectedExecutionException e) {
            this.zzb.zzi(e);
        }
    }
}
