package com.google.android.gms.internal.ads;

import java.util.Objects;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public abstract class zzfke<T> extends zzfkz<T> {
    private final Executor zza;
    final /* synthetic */ zzfkf zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzfke(zzfkf zzfkfVar, Executor executor) {
        this.zzb = zzfkfVar;
        Objects.requireNonNull(executor);
        this.zza = executor;
    }

    abstract void zzb(T t);

    @Override // com.google.android.gms.internal.ads.zzfkz
    final boolean zzd() {
        return this.zzb.isDone();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zze() {
        try {
            this.zza.execute(this);
        } catch (RejectedExecutionException e) {
            this.zzb.zzi(e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfkz
    final void zzf(T t, Throwable th) {
        zzfkf.zzI(this.zzb, null);
        if (th != null) {
            if (th instanceof ExecutionException) {
                this.zzb.zzi(th.getCause());
                return;
            } else if (th instanceof CancellationException) {
                this.zzb.cancel(false);
                return;
            } else {
                this.zzb.zzi(th);
                return;
            }
        }
        zzb(t);
    }
}
