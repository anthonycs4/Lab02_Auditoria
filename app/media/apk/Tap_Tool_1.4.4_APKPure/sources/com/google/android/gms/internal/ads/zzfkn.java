package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;
import java.util.concurrent.Future;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public abstract class zzfkn<V> extends zzfkl<V> implements zzfla<V> {
    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzfkl
    public /* bridge */ /* synthetic */ Future zzb() {
        throw null;
    }

    protected abstract zzfla<? extends V> zzc();

    @Override // com.google.android.gms.internal.ads.zzfla
    public final void zze(Runnable runnable, Executor executor) {
        zzc().zze(runnable, executor);
    }
}
