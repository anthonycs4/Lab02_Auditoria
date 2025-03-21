package com.google.android.gms.internal.ads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
/* compiled from: com.google.android.gms:play-services-ads-lite@@20.2.0 */
/* loaded from: classes.dex */
final class zzfdv implements zzfdt {
    private zzfdv() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzfdv(zzfdu zzfduVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzfdt
    public final ExecutorService zza(int i, ThreadFactory threadFactory, int i2) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(i, i, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), threadFactory);
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        return Executors.unconfigurableExecutorService(threadPoolExecutor);
    }

    @Override // com.google.android.gms.internal.ads.zzfdt
    public final ExecutorService zzb(int i) {
        return zza(1, Executors.defaultThreadFactory(), 2);
    }

    @Override // com.google.android.gms.internal.ads.zzfdt
    public final ExecutorService zzc(ThreadFactory threadFactory, int i) {
        return zza(1, threadFactory, 1);
    }
}
