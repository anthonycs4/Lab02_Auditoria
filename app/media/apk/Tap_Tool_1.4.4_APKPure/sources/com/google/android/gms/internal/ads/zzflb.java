package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public interface zzflb extends ExecutorService {
    zzfla<?> zza(Runnable runnable);

    <T> zzfla<T> zzb(Callable<T> callable);
}
