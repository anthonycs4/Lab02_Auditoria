package com.google.android.gms.internal.ads;

import java.util.Objects;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
final class zzfkk<V> extends zzfkj<V> {
    private final zzfla<V> zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzfkk(zzfla<V> zzflaVar) {
        Objects.requireNonNull(zzflaVar);
        this.zza = zzflaVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfjl, java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        return this.zza.cancel(z);
    }

    @Override // com.google.android.gms.internal.ads.zzfjl, java.util.concurrent.Future
    public final V get() throws InterruptedException, ExecutionException {
        return this.zza.get();
    }

    @Override // com.google.android.gms.internal.ads.zzfjl, java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.zza.isCancelled();
    }

    @Override // com.google.android.gms.internal.ads.zzfjl, java.util.concurrent.Future
    public final boolean isDone() {
        return this.zza.isDone();
    }

    @Override // com.google.android.gms.internal.ads.zzfjl
    public final String toString() {
        return this.zza.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzfjl, com.google.android.gms.internal.ads.zzfla
    public final void zze(Runnable runnable, Executor executor) {
        this.zza.zze(runnable, executor);
    }

    @Override // com.google.android.gms.internal.ads.zzfjl, java.util.concurrent.Future
    public final V get(long j, TimeUnit timeUnit) throws InterruptedException, ExecutionException, TimeoutException {
        return this.zza.get(j, timeUnit);
    }
}
