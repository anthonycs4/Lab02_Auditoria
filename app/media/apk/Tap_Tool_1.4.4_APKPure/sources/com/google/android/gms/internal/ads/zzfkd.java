package com.google.android.gms.internal.ads;

import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
final class zzfkd extends zzfke {
    final /* synthetic */ zzfkf zza;
    private final Callable zzc;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzfkd(zzfkf zzfkfVar, Callable callable, Executor executor) {
        super(zzfkfVar, executor);
        this.zza = zzfkfVar;
        Objects.requireNonNull(callable);
        this.zzc = callable;
    }

    @Override // com.google.android.gms.internal.ads.zzfkz
    final Object zza() throws Exception {
        return this.zzc.call();
    }

    @Override // com.google.android.gms.internal.ads.zzfke
    final void zzb(Object obj) {
        this.zza.zzh(obj);
    }

    @Override // com.google.android.gms.internal.ads.zzfkz
    final String zzc() {
        return this.zzc.toString();
    }
}
