package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.LockSupport;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
abstract class zzfkz<T> extends AtomicReference<Runnable> implements Runnable {
    private static final Runnable zza = new zzfky(null);
    private static final Runnable zzb = new zzfky(null);
    private static final Runnable zzc = new zzfky(null);

    @Override // java.lang.Runnable
    public final void run() {
        T zza2;
        Thread currentThread = Thread.currentThread();
        if (compareAndSet(null, currentThread)) {
            boolean z = !zzd();
            if (z) {
                try {
                    zza2 = zza();
                } catch (Throwable th) {
                    if (!compareAndSet(currentThread, zza)) {
                        Runnable runnable = get();
                        boolean z2 = false;
                        int i = 0;
                        while (true) {
                            Runnable runnable2 = zzb;
                            if (runnable != runnable2 && runnable != zzc) {
                                break;
                            }
                            i++;
                            if (i > 1000) {
                                Runnable runnable3 = zzc;
                                if (runnable == runnable3 || compareAndSet(runnable2, runnable3)) {
                                    z2 = Thread.interrupted() || z2;
                                    LockSupport.park(this);
                                }
                            } else {
                                Thread.yield();
                            }
                            runnable = get();
                        }
                        if (z2) {
                            currentThread.interrupt();
                        }
                    }
                    zzf(null, th);
                    return;
                }
            } else {
                zza2 = null;
            }
            if (!compareAndSet(currentThread, zza)) {
                Runnable runnable4 = get();
                boolean z3 = false;
                int i2 = 0;
                while (true) {
                    Runnable runnable5 = zzb;
                    if (runnable4 != runnable5 && runnable4 != zzc) {
                        break;
                    }
                    i2++;
                    if (i2 > 1000) {
                        Runnable runnable6 = zzc;
                        if (runnable4 == runnable6 || compareAndSet(runnable5, runnable6)) {
                            z3 = Thread.interrupted() || z3;
                            LockSupport.park(this);
                        }
                    } else {
                        Thread.yield();
                    }
                    runnable4 = get();
                }
                if (z3) {
                    currentThread.interrupt();
                }
            }
            if (z) {
                zzf(zza2, null);
            }
        }
    }

    @Override // java.util.concurrent.atomic.AtomicReference
    public final String toString() {
        String str;
        Runnable runnable = get();
        if (runnable == zza) {
            str = "running=[DONE]";
        } else if (runnable == zzb) {
            str = "running=[INTERRUPTED]";
        } else if (runnable instanceof Thread) {
            String name = ((Thread) runnable).getName();
            StringBuilder sb = new StringBuilder(String.valueOf(name).length() + 21);
            sb.append("running=[RUNNING ON ");
            sb.append(name);
            sb.append("]");
            str = sb.toString();
        } else {
            str = "running=[NOT STARTED YET]";
        }
        String zzc2 = zzc();
        StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 2 + String.valueOf(zzc2).length());
        sb2.append(str);
        sb2.append(", ");
        sb2.append(zzc2);
        return sb2.toString();
    }

    abstract T zza() throws Exception;

    abstract String zzc();

    abstract boolean zzd();

    abstract void zzf(@NullableDecl T t, @NullableDecl Throwable th);

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzg() {
        Runnable runnable = get();
        if ((runnable instanceof Thread) && compareAndSet(runnable, zzb)) {
            try {
                Thread thread = (Thread) runnable;
                thread.interrupt();
                if (getAndSet(zza) == zzc) {
                    LockSupport.unpark(thread);
                }
            } catch (Throwable th) {
                if (getAndSet(zza) == zzc) {
                    LockSupport.unpark((Thread) runnable);
                }
                throw th;
            }
        }
    }
}
