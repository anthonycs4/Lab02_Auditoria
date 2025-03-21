package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.RunnableFuture;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
final class zzflp<V> extends zzfki<V> implements RunnableFuture<V> {
    private volatile zzfkz<?> zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzflp(zzfjy<V> zzfjyVar) {
        this.zza = new zzfln(this, zzfjyVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <V> zzflp<V> zza(Runnable runnable, @NullableDecl V v) {
        return new zzflp<>(Executors.callable(runnable, v));
    }

    @Override // java.util.concurrent.RunnableFuture, java.lang.Runnable
    public final void run() {
        zzfkz<?> zzfkzVar = this.zza;
        if (zzfkzVar != null) {
            zzfkzVar.run();
        }
        this.zza = null;
    }

    @Override // com.google.android.gms.internal.ads.zzfjl
    protected final String zzc() {
        zzfkz<?> zzfkzVar = this.zza;
        if (zzfkzVar != null) {
            String valueOf = String.valueOf(zzfkzVar);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 7);
            sb.append("task=[");
            sb.append(valueOf);
            sb.append("]");
            return sb.toString();
        }
        return super.zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzfjl
    protected final void zzd() {
        zzfkz<?> zzfkzVar;
        if (zzg() && (zzfkzVar = this.zza) != null) {
            zzfkzVar.zzg();
        }
        this.zza = null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzflp(Callable<V> callable) {
        this.zza = new zzflo(this, callable);
    }
}
