package com.google.android.gms.internal.ads;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.lang.reflect.Field;
import java.security.AccessController;
import java.security.PrivilegedActionException;
import java.security.PrivilegedExceptionAction;
import java.util.Locale;
import java.util.Objects;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;
import sun.misc.Unsafe;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public abstract class zzfjl<V> extends zzfls implements zzfla<V> {
    private static final boolean zzaI;
    private static final Logger zzaL;
    private static final zza zzaM;
    private static final Object zzaN;
    @NullableDecl
    private volatile zzd listeners;
    @NullableDecl
    private volatile Object value;
    @NullableDecl
    private volatile zzk waiters;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
    /* loaded from: classes.dex */
    public abstract class zza {
        /* synthetic */ zza(AnonymousClass1 anonymousClass1) {
        }

        abstract void zza(zzk zzkVar, Thread thread);

        abstract void zzb(zzk zzkVar, zzk zzkVar2);

        abstract boolean zzc(zzfjl<?> zzfjlVar, zzk zzkVar, zzk zzkVar2);

        abstract boolean zzd(zzfjl<?> zzfjlVar, zzd zzdVar, zzd zzdVar2);

        abstract boolean zze(zzfjl<?> zzfjlVar, Object obj, Object obj2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
    /* loaded from: classes.dex */
    public final class zzb {
        static final zzb zza;
        static final zzb zzb;
        final boolean zzc;
        @NullableDecl
        final Throwable zzd;

        static {
            if (zzfjl.zzaI) {
                zzb = null;
                zza = null;
                return;
            }
            zzb = new zzb(false, null);
            zza = new zzb(true, null);
        }

        zzb(boolean z, @NullableDecl Throwable th) {
            this.zzc = z;
            this.zzd = th;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
    /* loaded from: classes.dex */
    public final class zzc {
        static final zzc zza = new zzc(new Throwable("Failure occurred while trying to finish a future.") { // from class: com.google.android.gms.internal.ads.zzfjl.zzc.1
            {
                super("Failure occurred while trying to finish a future.");
            }

            @Override // java.lang.Throwable
            public final synchronized Throwable fillInStackTrace() {
                return this;
            }
        });
        final Throwable zzb;

        zzc(Throwable th) {
            Objects.requireNonNull(th);
            this.zzb = th;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
    /* loaded from: classes.dex */
    public final class zzd {
        static final zzd zza = new zzd(null, null);
        @NullableDecl
        zzd next;
        final Runnable zzb;
        final Executor zzc;

        zzd(Runnable runnable, Executor executor) {
            this.zzb = runnable;
            this.zzc = executor;
        }
    }

    /* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
    /* loaded from: classes.dex */
    final class zze extends zza {
        final AtomicReferenceFieldUpdater<zzk, Thread> zza;
        final AtomicReferenceFieldUpdater<zzk, zzk> zzb;
        final AtomicReferenceFieldUpdater<zzfjl, zzk> zzc;
        final AtomicReferenceFieldUpdater<zzfjl, zzd> zzd;
        final AtomicReferenceFieldUpdater<zzfjl, Object> zze;

        zze(AtomicReferenceFieldUpdater<zzk, Thread> atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater<zzk, zzk> atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater<zzfjl, zzk> atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater<zzfjl, zzd> atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater<zzfjl, Object> atomicReferenceFieldUpdater5) {
            super(null);
            this.zza = atomicReferenceFieldUpdater;
            this.zzb = atomicReferenceFieldUpdater2;
            this.zzc = atomicReferenceFieldUpdater3;
            this.zzd = atomicReferenceFieldUpdater4;
            this.zze = atomicReferenceFieldUpdater5;
        }

        @Override // com.google.android.gms.internal.ads.zzfjl.zza
        final void zza(zzk zzkVar, Thread thread) {
            this.zza.lazySet(zzkVar, thread);
        }

        @Override // com.google.android.gms.internal.ads.zzfjl.zza
        final void zzb(zzk zzkVar, zzk zzkVar2) {
            this.zzb.lazySet(zzkVar, zzkVar2);
        }

        @Override // com.google.android.gms.internal.ads.zzfjl.zza
        final boolean zzc(zzfjl<?> zzfjlVar, zzk zzkVar, zzk zzkVar2) {
            return this.zzc.compareAndSet(zzfjlVar, zzkVar, zzkVar2);
        }

        @Override // com.google.android.gms.internal.ads.zzfjl.zza
        final boolean zzd(zzfjl<?> zzfjlVar, zzd zzdVar, zzd zzdVar2) {
            return this.zzd.compareAndSet(zzfjlVar, zzdVar, zzdVar2);
        }

        @Override // com.google.android.gms.internal.ads.zzfjl.zza
        final boolean zze(zzfjl<?> zzfjlVar, Object obj, Object obj2) {
            return this.zze.compareAndSet(zzfjlVar, obj, obj2);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
    /* loaded from: classes.dex */
    public final class zzf<V> implements Runnable {
        final zzfjl<V> zza;
        final zzfla<? extends V> zzb;

        zzf(zzfjl<V> zzfjlVar, zzfla<? extends V> zzflaVar) {
            this.zza = zzfjlVar;
            this.zzb = zzflaVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (((zzfjl) this.zza).value != this) {
                return;
            }
            if (zzfjl.zzaM.zze(this.zza, this, zzfjl.zzb(this.zzb))) {
                zzfjl.zzx(this.zza);
            }
        }
    }

    /* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
    /* loaded from: classes.dex */
    final class zzg extends zza {
        private zzg() {
            super(null);
        }

        /* synthetic */ zzg(AnonymousClass1 anonymousClass1) {
            super(null);
        }

        @Override // com.google.android.gms.internal.ads.zzfjl.zza
        final void zza(zzk zzkVar, Thread thread) {
            zzkVar.thread = thread;
        }

        @Override // com.google.android.gms.internal.ads.zzfjl.zza
        final void zzb(zzk zzkVar, zzk zzkVar2) {
            zzkVar.next = zzkVar2;
        }

        @Override // com.google.android.gms.internal.ads.zzfjl.zza
        final boolean zzc(zzfjl<?> zzfjlVar, zzk zzkVar, zzk zzkVar2) {
            synchronized (zzfjlVar) {
                if (((zzfjl) zzfjlVar).waiters == zzkVar) {
                    ((zzfjl) zzfjlVar).waiters = zzkVar2;
                    return true;
                }
                return false;
            }
        }

        @Override // com.google.android.gms.internal.ads.zzfjl.zza
        final boolean zzd(zzfjl<?> zzfjlVar, zzd zzdVar, zzd zzdVar2) {
            synchronized (zzfjlVar) {
                if (((zzfjl) zzfjlVar).listeners == zzdVar) {
                    ((zzfjl) zzfjlVar).listeners = zzdVar2;
                    return true;
                }
                return false;
            }
        }

        @Override // com.google.android.gms.internal.ads.zzfjl.zza
        final boolean zze(zzfjl<?> zzfjlVar, Object obj, Object obj2) {
            synchronized (zzfjlVar) {
                if (((zzfjl) zzfjlVar).value == obj) {
                    ((zzfjl) zzfjlVar).value = obj2;
                    return true;
                }
                return false;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
    /* loaded from: classes.dex */
    public interface zzh<V> extends zzfla<V> {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
    /* loaded from: classes.dex */
    public abstract class zzi<V> extends zzfjl<V> implements zzh<V> {
    }

    /* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
    /* loaded from: classes.dex */
    final class zzj extends zza {
        static final Unsafe zza;
        static final long zzb;
        static final long zzc;
        static final long zzd;
        static final long zze;
        static final long zzf;

        static {
            Unsafe unsafe;
            try {
                try {
                    unsafe = Unsafe.getUnsafe();
                } catch (PrivilegedActionException e) {
                    throw new RuntimeException("Could not initialize intrinsics", e.getCause());
                }
            } catch (SecurityException unused) {
                unsafe = (Unsafe) AccessController.doPrivileged(new PrivilegedExceptionAction<Unsafe>() { // from class: com.google.android.gms.internal.ads.zzfjl.zzj.1
                    public static final Unsafe zza() throws Exception {
                        Field[] declaredFields;
                        for (Field field : Unsafe.class.getDeclaredFields()) {
                            field.setAccessible(true);
                            Object obj = field.get(null);
                            if (Unsafe.class.isInstance(obj)) {
                                return (Unsafe) Unsafe.class.cast(obj);
                            }
                        }
                        throw new NoSuchFieldError("the Unsafe");
                    }

                    @Override // java.security.PrivilegedExceptionAction
                    public final /* bridge */ /* synthetic */ Unsafe run() throws Exception {
                        return zza();
                    }
                });
            }
            try {
                zzc = unsafe.objectFieldOffset(zzfjl.class.getDeclaredField("waiters"));
                zzb = unsafe.objectFieldOffset(zzfjl.class.getDeclaredField("listeners"));
                zzd = unsafe.objectFieldOffset(zzfjl.class.getDeclaredField(AppMeasurementSdk.ConditionalUserProperty.VALUE));
                zze = unsafe.objectFieldOffset(zzk.class.getDeclaredField("thread"));
                zzf = unsafe.objectFieldOffset(zzk.class.getDeclaredField("next"));
                zza = unsafe;
            } catch (Exception e2) {
                zzffc.zza(e2);
                throw new RuntimeException(e2);
            }
        }

        private zzj() {
            super(null);
        }

        /* synthetic */ zzj(AnonymousClass1 anonymousClass1) {
            super(null);
        }

        @Override // com.google.android.gms.internal.ads.zzfjl.zza
        final void zza(zzk zzkVar, Thread thread) {
            zza.putObject(zzkVar, zze, thread);
        }

        @Override // com.google.android.gms.internal.ads.zzfjl.zza
        final void zzb(zzk zzkVar, zzk zzkVar2) {
            zza.putObject(zzkVar, zzf, zzkVar2);
        }

        @Override // com.google.android.gms.internal.ads.zzfjl.zza
        final boolean zzc(zzfjl<?> zzfjlVar, zzk zzkVar, zzk zzkVar2) {
            return zza.compareAndSwapObject(zzfjlVar, zzc, zzkVar, zzkVar2);
        }

        @Override // com.google.android.gms.internal.ads.zzfjl.zza
        final boolean zzd(zzfjl<?> zzfjlVar, zzd zzdVar, zzd zzdVar2) {
            return zza.compareAndSwapObject(zzfjlVar, zzb, zzdVar, zzdVar2);
        }

        @Override // com.google.android.gms.internal.ads.zzfjl.zza
        final boolean zze(zzfjl<?> zzfjlVar, Object obj, Object obj2) {
            return zza.compareAndSwapObject(zzfjlVar, zzd, obj, obj2);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
    /* loaded from: classes.dex */
    public final class zzk {
        static final zzk zza = new zzk(false);
        @NullableDecl
        volatile zzk next;
        @NullableDecl
        volatile Thread thread;

        zzk() {
            zzfjl.zzaM.zza(this, Thread.currentThread());
        }

        zzk(boolean z) {
        }
    }

    static {
        boolean z;
        Throwable th;
        Throwable th2;
        zza zzgVar;
        try {
            z = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
        } catch (SecurityException unused) {
            z = false;
        }
        zzaI = z;
        zzaL = Logger.getLogger(zzfjl.class.getName());
        try {
            zzgVar = new zzj(null);
            th2 = null;
            th = null;
        } catch (Throwable th3) {
            try {
                th2 = th3;
                zzgVar = new zze(AtomicReferenceFieldUpdater.newUpdater(zzk.class, Thread.class, "thread"), AtomicReferenceFieldUpdater.newUpdater(zzk.class, zzk.class, "next"), AtomicReferenceFieldUpdater.newUpdater(zzfjl.class, zzk.class, "waiters"), AtomicReferenceFieldUpdater.newUpdater(zzfjl.class, zzd.class, "listeners"), AtomicReferenceFieldUpdater.newUpdater(zzfjl.class, Object.class, AppMeasurementSdk.ConditionalUserProperty.VALUE));
                th = null;
            } catch (Throwable th4) {
                th = th4;
                th2 = th3;
                zzgVar = new zzg(null);
            }
        }
        zzaM = zzgVar;
        if (th != null) {
            Logger logger = zzaL;
            logger.logp(Level.SEVERE, "com.google.common.util.concurrent.AbstractFuture", "<clinit>", "UnsafeAtomicHelper is broken!", th2);
            logger.logp(Level.SEVERE, "com.google.common.util.concurrent.AbstractFuture", "<clinit>", "SafeAtomicHelper is broken!", th);
        }
        zzaN = new Object();
    }

    private final void zzA(StringBuilder sb, Object obj) {
        try {
            if (obj == this) {
                sb.append("this future");
            } else {
                sb.append(obj);
            }
        } catch (RuntimeException | StackOverflowError e) {
            sb.append("Exception thrown from implementation: ");
            sb.append(e.getClass());
        }
    }

    private static void zzB(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e) {
            Logger logger = zzaL;
            Level level = Level.SEVERE;
            String valueOf = String.valueOf(runnable);
            String valueOf2 = String.valueOf(executor);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 57 + String.valueOf(valueOf2).length());
            sb.append("RuntimeException while executing runnable ");
            sb.append(valueOf);
            sb.append(" with executor ");
            sb.append(valueOf2);
            logger.logp(level, "com.google.common.util.concurrent.AbstractFuture", "executeListener", sb.toString(), (Throwable) e);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final V zzC(Object obj) throws ExecutionException {
        if (obj instanceof zzb) {
            Throwable th = ((zzb) obj).zzd;
            CancellationException cancellationException = new CancellationException("Task was cancelled.");
            cancellationException.initCause(th);
            throw cancellationException;
        } else if (obj instanceof zzc) {
            throw new ExecutionException(((zzc) obj).zzb);
        } else {
            if (obj == zzaN) {
                return null;
            }
            return obj;
        }
    }

    private final void zza(zzk zzkVar) {
        zzkVar.thread = null;
        while (true) {
            zzk zzkVar2 = this.waiters;
            if (zzkVar2 != zzk.zza) {
                zzk zzkVar3 = null;
                while (zzkVar2 != null) {
                    zzk zzkVar4 = zzkVar2.next;
                    if (zzkVar2.thread != null) {
                        zzkVar3 = zzkVar2;
                    } else if (zzkVar3 != null) {
                        zzkVar3.next = zzkVar4;
                        if (zzkVar3.thread == null) {
                            break;
                        }
                    } else if (!zzaM.zzc(this, zzkVar2, zzkVar4)) {
                        break;
                    }
                    zzkVar2 = zzkVar4;
                }
                return;
            }
            return;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Object zzb(zzfla<?> zzflaVar) {
        Throwable zzk2;
        if (zzflaVar instanceof zzh) {
            Object obj = ((zzfjl) zzflaVar).value;
            if (obj instanceof zzb) {
                zzb zzbVar = (zzb) obj;
                if (zzbVar.zzc) {
                    Throwable th = zzbVar.zzd;
                    return th != null ? new zzb(false, th) : zzb.zzb;
                }
                return obj;
            }
            return obj;
        } else if (!(zzflaVar instanceof zzfls) || (zzk2 = ((zzfls) zzflaVar).zzk()) == null) {
            boolean isCancelled = zzflaVar.isCancelled();
            if ((!zzaI) & isCancelled) {
                return zzb.zzb;
            }
            try {
                Object zzw = zzw(zzflaVar);
                if (!isCancelled) {
                    return zzw == null ? zzaN : zzw;
                }
                String valueOf = String.valueOf(zzflaVar);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 84);
                sb.append("get() did not throw CancellationException, despite reporting isCancelled() == true: ");
                sb.append(valueOf);
                return new zzb(false, new IllegalArgumentException(sb.toString()));
            } catch (CancellationException e) {
                if (!isCancelled) {
                    String valueOf2 = String.valueOf(zzflaVar);
                    StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 77);
                    sb2.append("get() threw CancellationException, despite reporting isCancelled() == false: ");
                    sb2.append(valueOf2);
                    return new zzc(new IllegalArgumentException(sb2.toString(), e));
                }
                return new zzb(false, e);
            } catch (ExecutionException e2) {
                if (isCancelled) {
                    String valueOf3 = String.valueOf(zzflaVar);
                    StringBuilder sb3 = new StringBuilder(String.valueOf(valueOf3).length() + 84);
                    sb3.append("get() did not throw CancellationException, despite reporting isCancelled() == true: ");
                    sb3.append(valueOf3);
                    return new zzb(false, new IllegalArgumentException(sb3.toString(), e2));
                }
                return new zzc(e2.getCause());
            } catch (Throwable th2) {
                return new zzc(th2);
            }
        } else {
            return new zzc(zzk2);
        }
    }

    private static <V> V zzw(Future<V> future) throws ExecutionException {
        V v;
        boolean z = false;
        while (true) {
            try {
                v = future.get();
                break;
            } catch (InterruptedException unused) {
                z = true;
            } catch (Throwable th) {
                if (z) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
        return v;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v2, types: [com.google.android.gms.internal.ads.zzfjl$zza] */
    /* JADX WARN: Type inference failed for: r5v0, types: [com.google.android.gms.internal.ads.zzfjl<?>] */
    /* JADX WARN: Type inference failed for: r5v1, types: [com.google.android.gms.internal.ads.zzfjl] */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v7, types: [com.google.android.gms.internal.ads.zzfjl<V>, com.google.android.gms.internal.ads.zzfjl] */
    public static void zzx(zzfjl<?> zzfjlVar) {
        zzd zzdVar;
        zzd zzdVar2;
        zzd zzdVar3 = null;
        while (true) {
            zzk zzkVar = ((zzfjl) zzfjlVar).waiters;
            if (zzaM.zzc((zzfjl) zzfjlVar, zzkVar, zzk.zza)) {
                while (zzkVar != null) {
                    Thread thread = zzkVar.thread;
                    if (thread != null) {
                        zzkVar.thread = null;
                        LockSupport.unpark(thread);
                    }
                    zzkVar = zzkVar.next;
                }
                ((zzfjl) zzfjlVar).zzd();
                do {
                    zzdVar = ((zzfjl) zzfjlVar).listeners;
                } while (!zzaM.zzd((zzfjl) zzfjlVar, zzdVar, zzd.zza));
                while (true) {
                    zzdVar2 = zzdVar3;
                    zzdVar3 = zzdVar;
                    if (zzdVar3 == null) {
                        break;
                    }
                    zzdVar = zzdVar3.next;
                    zzdVar3.next = zzdVar2;
                }
                while (zzdVar2 != null) {
                    zzdVar3 = zzdVar2.next;
                    Runnable runnable = zzdVar2.zzb;
                    if (runnable instanceof zzf) {
                        zzf zzfVar = (zzf) runnable;
                        zzfjlVar = zzfVar.zza;
                        if (((zzfjl) zzfjlVar).value == zzfVar) {
                            if (zzaM.zze(zzfjlVar, zzfVar, zzb(zzfVar.zzb))) {
                                break;
                            }
                        } else {
                            continue;
                        }
                    } else {
                        zzB(runnable, zzdVar2.zzc);
                    }
                    zzdVar2 = zzdVar3;
                }
                return;
            }
        }
    }

    private final void zzy(StringBuilder sb) {
        String sb2;
        int length = sb.length();
        sb.append("PENDING");
        Object obj = this.value;
        if (obj instanceof zzf) {
            sb.append(", setFuture=[");
            zzA(sb, ((zzf) obj).zzb);
            sb.append("]");
        } else {
            try {
                sb2 = zzffa.zzb(zzc());
            } catch (RuntimeException | StackOverflowError e) {
                String valueOf = String.valueOf(e.getClass());
                StringBuilder sb3 = new StringBuilder(String.valueOf(valueOf).length() + 38);
                sb3.append("Exception thrown from implementation: ");
                sb3.append(valueOf);
                sb2 = sb3.toString();
            }
            if (sb2 != null) {
                sb.append(", info=[");
                sb.append(sb2);
                sb.append("]");
            }
        }
        if (isDone()) {
            sb.delete(length, sb.length());
            zzz(sb);
        }
    }

    private final void zzz(StringBuilder sb) {
        try {
            Object zzw = zzw(this);
            sb.append("SUCCESS, result=[");
            if (zzw == null) {
                sb.append("null");
            } else if (zzw == this) {
                sb.append("this future");
            } else {
                sb.append(zzw.getClass().getName());
                sb.append("@");
                sb.append(Integer.toHexString(System.identityHashCode(zzw)));
            }
            sb.append("]");
        } catch (CancellationException unused) {
            sb.append("CANCELLED");
        } catch (RuntimeException e) {
            sb.append("UNKNOWN, cause=[");
            sb.append(e.getClass());
            sb.append(" thrown from get()]");
        } catch (ExecutionException e2) {
            sb.append("FAILURE, cause=[");
            sb.append(e2.getCause());
            sb.append("]");
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0058, code lost:
        return true;
     */
    @Override // java.util.concurrent.Future
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean cancel(boolean r8) {
        /*
            r7 = this;
            java.lang.Object r0 = r7.value
            r1 = 0
            r2 = 1
            if (r0 != 0) goto L8
            r3 = 1
            goto L9
        L8:
            r3 = 0
        L9:
            boolean r4 = r0 instanceof com.google.android.gms.internal.ads.zzfjl.zzf
            r3 = r3 | r4
            if (r3 == 0) goto L61
            boolean r3 = com.google.android.gms.internal.ads.zzfjl.zzaI
            if (r3 == 0) goto L1f
            com.google.android.gms.internal.ads.zzfjl$zzb r3 = new com.google.android.gms.internal.ads.zzfjl$zzb
            java.util.concurrent.CancellationException r4 = new java.util.concurrent.CancellationException
            java.lang.String r5 = "Future.cancel() was called."
            r4.<init>(r5)
            r3.<init>(r8, r4)
            goto L26
        L1f:
            if (r8 == 0) goto L24
            com.google.android.gms.internal.ads.zzfjl$zzb r3 = com.google.android.gms.internal.ads.zzfjl.zzb.zza
            goto L26
        L24:
            com.google.android.gms.internal.ads.zzfjl$zzb r3 = com.google.android.gms.internal.ads.zzfjl.zzb.zzb
        L26:
            r5 = 0
            r4 = r7
        L28:
            com.google.android.gms.internal.ads.zzfjl$zza r6 = com.google.android.gms.internal.ads.zzfjl.zzaM
            boolean r6 = r6.zze(r4, r0, r3)
            if (r6 == 0) goto L5a
            if (r8 == 0) goto L35
            r4.zzf()
        L35:
            zzx(r4)
            boolean r4 = r0 instanceof com.google.android.gms.internal.ads.zzfjl.zzf
            if (r4 == 0) goto L58
            com.google.android.gms.internal.ads.zzfjl$zzf r0 = (com.google.android.gms.internal.ads.zzfjl.zzf) r0
            com.google.android.gms.internal.ads.zzfla<? extends V> r0 = r0.zzb
            boolean r4 = r0 instanceof com.google.android.gms.internal.ads.zzfjl.zzh
            if (r4 == 0) goto L55
            r4 = r0
            com.google.android.gms.internal.ads.zzfjl r4 = (com.google.android.gms.internal.ads.zzfjl) r4
            java.lang.Object r0 = r4.value
            if (r0 != 0) goto L4d
            r5 = 1
            goto L4e
        L4d:
            r5 = 0
        L4e:
            boolean r6 = r0 instanceof com.google.android.gms.internal.ads.zzfjl.zzf
            r5 = r5 | r6
            if (r5 == 0) goto L58
            r5 = 1
            goto L28
        L55:
            r0.cancel(r8)
        L58:
            r1 = 1
            goto L61
        L5a:
            java.lang.Object r0 = r4.value
            boolean r6 = r0 instanceof com.google.android.gms.internal.ads.zzfjl.zzf
            if (r6 != 0) goto L28
            r1 = r5
        L61:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzfjl.cancel(boolean):boolean");
    }

    @Override // java.util.concurrent.Future
    public V get() throws InterruptedException, ExecutionException {
        Object obj;
        if (!Thread.interrupted()) {
            Object obj2 = this.value;
            if ((obj2 != null) && (!(obj2 instanceof zzf))) {
                return (V) zzC(obj2);
            }
            zzk zzkVar = this.waiters;
            if (zzkVar != zzk.zza) {
                zzk zzkVar2 = new zzk();
                do {
                    zza zzaVar = zzaM;
                    zzaVar.zzb(zzkVar2, zzkVar);
                    if (zzaVar.zzc(this, zzkVar, zzkVar2)) {
                        do {
                            LockSupport.park(this);
                            if (Thread.interrupted()) {
                                zza(zzkVar2);
                                throw new InterruptedException();
                            }
                            obj = this.value;
                        } while (!((obj != null) & (!(obj instanceof zzf))));
                        return (V) zzC(obj);
                    }
                    zzkVar = this.waiters;
                } while (zzkVar != zzk.zza);
                return (V) zzC(this.value);
            }
            return (V) zzC(this.value);
        }
        throw new InterruptedException();
    }

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
        return this.value instanceof zzb;
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        Object obj = this.value;
        return (!(obj instanceof zzf)) & (obj != null);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (getClass().getName().startsWith("com.google.common.util.concurrent.")) {
            sb.append(getClass().getSimpleName());
        } else {
            sb.append(getClass().getName());
        }
        sb.append('@');
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("[status=");
        if (isCancelled()) {
            sb.append("CANCELLED");
        } else if (isDone()) {
            zzz(sb);
        } else {
            zzy(sb);
        }
        sb.append("]");
        return sb.toString();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @NullableDecl
    public String zzc() {
        if (this instanceof ScheduledFuture) {
            long delay = ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS);
            StringBuilder sb = new StringBuilder(41);
            sb.append("remaining delay=[");
            sb.append(delay);
            sb.append(" ms]");
            return sb.toString();
        }
        return null;
    }

    protected void zzd() {
    }

    @Override // com.google.android.gms.internal.ads.zzfla
    public void zze(Runnable runnable, Executor executor) {
        zzd zzdVar;
        zzfes.zzc(runnable, "Runnable was null.");
        zzfes.zzc(executor, "Executor was null.");
        if (!isDone() && (zzdVar = this.listeners) != zzd.zza) {
            zzd zzdVar2 = new zzd(runnable, executor);
            do {
                zzdVar2.next = zzdVar;
                if (zzaM.zzd(this, zzdVar, zzdVar2)) {
                    return;
                }
                zzdVar = this.listeners;
            } while (zzdVar != zzd.zza);
            zzB(runnable, executor);
        }
        zzB(runnable, executor);
    }

    protected void zzf() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final boolean zzg() {
        Object obj = this.value;
        return (obj instanceof zzb) && ((zzb) obj).zzc;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public boolean zzh(@NullableDecl V v) {
        if (v == null) {
            v = (V) zzaN;
        }
        if (zzaM.zze(this, null, v)) {
            zzx(this);
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public boolean zzi(Throwable th) {
        Objects.requireNonNull(th);
        if (zzaM.zze(this, null, new zzc(th))) {
            zzx(this);
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzfls
    @NullableDecl
    public final Throwable zzk() {
        if (this instanceof zzh) {
            Object obj = this.value;
            if (obj instanceof zzc) {
                return ((zzc) obj).zzb;
            }
            return null;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzl(@NullableDecl Future<?> future) {
        if ((future != null) && isCancelled()) {
            future.cancel(zzg());
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final boolean zzj(zzfla<? extends V> zzflaVar) {
        zzc zzcVar;
        Objects.requireNonNull(zzflaVar);
        Object obj = this.value;
        if (obj == null) {
            if (zzflaVar.isDone()) {
                if (zzaM.zze(this, null, zzb(zzflaVar))) {
                    zzx(this);
                    return true;
                }
                return false;
            }
            zzf zzfVar = new zzf(this, zzflaVar);
            if (zzaM.zze(this, null, zzfVar)) {
                try {
                    zzflaVar.zze(zzfVar, zzfkg.INSTANCE);
                } catch (Throwable th) {
                    try {
                        zzcVar = new zzc(th);
                    } catch (Throwable unused) {
                        zzcVar = zzc.zza;
                    }
                    zzaM.zze(this, zzfVar, zzcVar);
                }
                return true;
            }
            obj = this.value;
        }
        if (obj instanceof zzb) {
            zzflaVar.cancel(((zzb) obj).zzc);
        }
        return false;
    }

    @Override // java.util.concurrent.Future
    public V get(long j, TimeUnit timeUnit) throws InterruptedException, TimeoutException, ExecutionException {
        long nanos = timeUnit.toNanos(j);
        if (!Thread.interrupted()) {
            Object obj = this.value;
            boolean z = true;
            if ((obj != null) & (!(obj instanceof zzf))) {
                return (V) zzC(obj);
            }
            long nanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
            if (nanos >= 1000) {
                zzk zzkVar = this.waiters;
                if (zzkVar != zzk.zza) {
                    zzk zzkVar2 = new zzk();
                    do {
                        zza zzaVar = zzaM;
                        zzaVar.zzb(zzkVar2, zzkVar);
                        if (zzaVar.zzc(this, zzkVar, zzkVar2)) {
                            do {
                                LockSupport.parkNanos(this, Math.min(nanos, 2147483647999999999L));
                                if (Thread.interrupted()) {
                                    zza(zzkVar2);
                                    throw new InterruptedException();
                                }
                                Object obj2 = this.value;
                                if (!((obj2 != null) & (!(obj2 instanceof zzf)))) {
                                    nanos = nanoTime - System.nanoTime();
                                } else {
                                    return (V) zzC(obj2);
                                }
                            } while (nanos >= 1000);
                            zza(zzkVar2);
                        } else {
                            zzkVar = this.waiters;
                        }
                    } while (zzkVar != zzk.zza);
                    return (V) zzC(this.value);
                }
                return (V) zzC(this.value);
            }
            while (nanos > 0) {
                Object obj3 = this.value;
                if (!((obj3 != null) & (!(obj3 instanceof zzf)))) {
                    if (!Thread.interrupted()) {
                        nanos = nanoTime - System.nanoTime();
                    } else {
                        throw new InterruptedException();
                    }
                } else {
                    return (V) zzC(obj3);
                }
            }
            String zzfjlVar = toString();
            String lowerCase = timeUnit.toString().toLowerCase(Locale.ROOT);
            String lowerCase2 = timeUnit.toString().toLowerCase(Locale.ROOT);
            StringBuilder sb = new StringBuilder(String.valueOf(lowerCase2).length() + 28);
            sb.append("Waited ");
            sb.append(j);
            sb.append(" ");
            sb.append(lowerCase2);
            String sb2 = sb.toString();
            if (nanos + 1000 < 0) {
                String concat = String.valueOf(sb2).concat(" (plus ");
                long j2 = -nanos;
                long convert = timeUnit.convert(j2, TimeUnit.NANOSECONDS);
                long nanos2 = j2 - timeUnit.toNanos(convert);
                int i = (convert > 0L ? 1 : (convert == 0L ? 0 : -1));
                if (i != 0 && nanos2 <= 1000) {
                    z = false;
                }
                if (i > 0) {
                    String valueOf = String.valueOf(concat);
                    StringBuilder sb3 = new StringBuilder(String.valueOf(valueOf).length() + 21 + String.valueOf(lowerCase).length());
                    sb3.append(valueOf);
                    sb3.append(convert);
                    sb3.append(" ");
                    sb3.append(lowerCase);
                    String sb4 = sb3.toString();
                    if (z) {
                        sb4 = String.valueOf(sb4).concat(",");
                    }
                    concat = String.valueOf(sb4).concat(" ");
                }
                if (z) {
                    String valueOf2 = String.valueOf(concat);
                    StringBuilder sb5 = new StringBuilder(String.valueOf(valueOf2).length() + 33);
                    sb5.append(valueOf2);
                    sb5.append(nanos2);
                    sb5.append(" nanoseconds ");
                    concat = sb5.toString();
                }
                sb2 = String.valueOf(concat).concat("delay)");
            }
            if (isDone()) {
                throw new TimeoutException(String.valueOf(sb2).concat(" but future completed as timeout expired"));
            }
            StringBuilder sb6 = new StringBuilder(String.valueOf(sb2).length() + 5 + String.valueOf(zzfjlVar).length());
            sb6.append(sb2);
            sb6.append(" for ");
            sb6.append(zzfjlVar);
            throw new TimeoutException(sb6.toString());
        }
        throw new InterruptedException();
    }
}
