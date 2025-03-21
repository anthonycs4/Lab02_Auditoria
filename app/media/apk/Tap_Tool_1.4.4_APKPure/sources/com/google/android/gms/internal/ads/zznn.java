package com.google.android.gms.internal.ads;

import android.os.Handler;
import java.util.concurrent.Executor;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
final /* synthetic */ class zznn implements Executor {
    private final Handler zza;

    private zznn(Handler handler) {
        this.zza = handler;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Executor zza(Handler handler) {
        return new zznn(handler);
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.zza.post(runnable);
    }
}
