package com.google.android.gms.internal.ads;

import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzflh {
    public static Executor zza() {
        return zzfkg.INSTANCE;
    }

    public static zzflb zzb(ExecutorService executorService) {
        zzflb zzfldVar;
        if (executorService instanceof zzflb) {
            return (zzflb) executorService;
        }
        if (executorService instanceof ScheduledExecutorService) {
            zzfldVar = new zzflg((ScheduledExecutorService) executorService);
        } else {
            zzfldVar = new zzfld(executorService);
        }
        return zzfldVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Executor zzc(Executor executor, zzfjl<?> zzfjlVar) {
        Objects.requireNonNull(executor);
        return executor == zzfkg.INSTANCE ? executor : new zzflc(executor, zzfjlVar);
    }
}
