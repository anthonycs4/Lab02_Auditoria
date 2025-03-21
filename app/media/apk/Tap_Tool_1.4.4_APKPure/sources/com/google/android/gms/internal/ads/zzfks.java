package com.google.android.gms.internal.ads;

import java.util.List;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzfks extends zzfku {
    public static <V> zzfla<V> zza(@NullableDecl V v) {
        if (v == null) {
            return (zzfla<V>) zzfkw.zza;
        }
        return new zzfkw(v);
    }

    public static zzfla<Void> zzb() {
        return zzfkw.zza;
    }

    public static <O> zzfla<O> zzd(Callable<O> callable, Executor executor) {
        zzflp zzflpVar = new zzflp(callable);
        executor.execute(zzflpVar);
        return zzflpVar;
    }

    public static <O> zzfla<O> zze(zzfjy<O> zzfjyVar, Executor executor) {
        zzflp zzflpVar = new zzflp(zzfjyVar);
        executor.execute(zzflpVar);
        return zzflpVar;
    }

    public static <V, X extends Throwable> zzfla<V> zzf(zzfla<? extends V> zzflaVar, Class<X> cls, zzfei<? super X, ? extends V> zzfeiVar, Executor executor) {
        zzfjj zzfjjVar = new zzfjj(zzflaVar, cls, zzfeiVar);
        zzflaVar.zze(zzfjjVar, zzflh.zzc(executor, zzfjjVar));
        return zzfjjVar;
    }

    public static <V, X extends Throwable> zzfla<V> zzg(zzfla<? extends V> zzflaVar, Class<X> cls, zzfjz<? super X, ? extends V> zzfjzVar, Executor executor) {
        zzfji zzfjiVar = new zzfji(zzflaVar, cls, zzfjzVar);
        zzflaVar.zze(zzfjiVar, zzflh.zzc(executor, zzfjiVar));
        return zzfjiVar;
    }

    public static <V> zzfla<V> zzh(zzfla<V> zzflaVar, long j, TimeUnit timeUnit, ScheduledExecutorService scheduledExecutorService) {
        return zzflaVar.isDone() ? zzflaVar : zzflm.zza(zzflaVar, j, timeUnit, scheduledExecutorService);
    }

    public static <I, O> zzfla<O> zzi(zzfla<I> zzflaVar, zzfjz<? super I, ? extends O> zzfjzVar, Executor executor) {
        int i = zzfjp.zzc;
        Objects.requireNonNull(executor);
        zzfjn zzfjnVar = new zzfjn(zzflaVar, zzfjzVar);
        zzflaVar.zze(zzfjnVar, zzflh.zzc(executor, zzfjnVar));
        return zzfjnVar;
    }

    public static <I, O> zzfla<O> zzj(zzfla<I> zzflaVar, zzfei<? super I, ? extends O> zzfeiVar, Executor executor) {
        int i = zzfjp.zzc;
        Objects.requireNonNull(zzfeiVar);
        zzfjo zzfjoVar = new zzfjo(zzflaVar, zzfeiVar);
        zzflaVar.zze(zzfjoVar, zzflh.zzc(executor, zzfjoVar));
        return zzfjoVar;
    }

    public static <V> zzfla<List<V>> zzk(Iterable<? extends zzfla<? extends V>> iterable) {
        return new zzfka(zzfgz.zzo(iterable), true);
    }

    @SafeVarargs
    public static <V> zzfkr<V> zzl(zzfla<? extends V>... zzflaVarArr) {
        return new zzfkr<>(false, zzfgz.zzq(zzflaVarArr), null);
    }

    public static <V> zzfkr<V> zzm(Iterable<? extends zzfla<? extends V>> iterable) {
        return new zzfkr<>(false, zzfgz.zzo(iterable), null);
    }

    @SafeVarargs
    public static <V> zzfkr<V> zzn(zzfla<? extends V>... zzflaVarArr) {
        return new zzfkr<>(true, zzfgz.zzq(zzflaVarArr), null);
    }

    public static <V> zzfkr<V> zzo(Iterable<? extends zzfla<? extends V>> iterable) {
        return new zzfkr<>(true, zzfgz.zzo(iterable), null);
    }

    public static <V> V zzq(Future<V> future) throws ExecutionException {
        if (!future.isDone()) {
            throw new IllegalStateException(zzffa.zzd("Future was expected to be done: %s", future));
        }
        return (V) zzflr.zza(future);
    }

    public static <V> V zzr(Future<V> future) {
        try {
            return (V) zzflr.zza(future);
        } catch (ExecutionException e) {
            Throwable cause = e.getCause();
            if (cause instanceof Error) {
                throw new zzfkh((Error) cause);
            }
            throw new zzflq(cause);
        }
    }

    public static <V> zzfla<V> zzc(Throwable th) {
        Objects.requireNonNull(th);
        return new zzfkv(th);
    }

    public static <V> void zzp(zzfla<V> zzflaVar, zzfko<? super V> zzfkoVar, Executor executor) {
        Objects.requireNonNull(zzfkoVar);
        zzflaVar.zze(new zzfkq(zzflaVar, zzfkoVar), executor);
    }
}
