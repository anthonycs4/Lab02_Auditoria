package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzfkr<V> {
    private final boolean zza;
    private final zzfgz<zzfla<? extends V>> zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzfkr(boolean z, zzfgz zzfgzVar, zzfkp zzfkpVar) {
        this.zza = z;
        this.zzb = zzfgzVar;
    }

    public final <C> zzfla<C> zza(Callable<C> callable, Executor executor) {
        return new zzfkf(this.zzb, this.zza, executor, callable);
    }
}
