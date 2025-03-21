package com.google.android.gms.internal.ads;

import java.util.Objects;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
abstract class zzfjs<InputT, OutputT> extends zzfjx<OutputT> {
    private static final Logger zza = Logger.getLogger(zzfjs.class.getName());
    @NullableDecl
    private zzfgu<? extends zzfla<? extends InputT>> zzb;
    private final boolean zzc;
    private final boolean zzd;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzfjs(zzfgu<? extends zzfla<? extends InputT>> zzfguVar, boolean z, boolean z2) {
        super(zzfguVar.size());
        Objects.requireNonNull(zzfguVar);
        this.zzb = zzfguVar;
        this.zzc = z;
        this.zzd = z2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzA(zzfjs zzfjsVar, zzfgu zzfguVar) {
        int zzD = zzfjsVar.zzD();
        int i = 0;
        zzfes.zzb(zzD >= 0, "Less than 0 remaining futures");
        if (zzD == 0) {
            if (zzfguVar != null) {
                zzfja it = zzfguVar.iterator();
                while (it.hasNext()) {
                    Future<? extends InputT> future = (Future) it.next();
                    if (!future.isCancelled()) {
                        zzfjsVar.zzK(i, future);
                    }
                    i++;
                }
            }
            zzfjsVar.zzE();
            zzfjsVar.zzx();
            zzfjsVar.zzB(2);
        }
    }

    private static void zzJ(Throwable th) {
        zza.logp(Level.SEVERE, "com.google.common.util.concurrent.AggregateFuture", "log", true != (th instanceof Error) ? "Got more than one input Future failure. Logging failures after the first" : "Input Future failed with Error", th);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final void zzK(int i, Future<? extends InputT> future) {
        try {
            zzw(i, zzfks.zzq(future));
        } catch (ExecutionException e) {
            zzI(e.getCause());
        } catch (Throwable th) {
            zzI(th);
        }
    }

    private static boolean zzL(Set<Throwable> set, Throwable th) {
        while (th != null) {
            if (!set.add(th)) {
                return false;
            }
            th = th.getCause();
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ zzfgu zzy(zzfjs zzfjsVar, zzfgu zzfguVar) {
        zzfjsVar.zzb = null;
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void zzB(int i) {
        this.zzb = null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zza() {
        if (this.zzb.isEmpty()) {
            zzx();
        } else if (this.zzc) {
            zzfja<? extends zzfla<? extends InputT>> it = this.zzb.iterator();
            int i = 0;
            while (it.hasNext()) {
                zzfla<? extends InputT> next = it.next();
                next.zze(new zzfjq(this, next, i), zzfkg.INSTANCE);
                i++;
            }
        } else {
            zzfjr zzfjrVar = new zzfjr(this, this.zzd ? this.zzb : null);
            zzfja<? extends zzfla<? extends InputT>> it2 = this.zzb.iterator();
            while (it2.hasNext()) {
                it2.next().zze(zzfjrVar, zzfkg.INSTANCE);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzfjl
    public final String zzc() {
        zzfgu<? extends zzfla<? extends InputT>> zzfguVar = this.zzb;
        if (zzfguVar != null) {
            String valueOf = String.valueOf(zzfguVar);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 8);
            sb.append("futures=");
            sb.append(valueOf);
            return sb.toString();
        }
        return super.zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzfjl
    protected final void zzd() {
        zzfgu<? extends zzfla<? extends InputT>> zzfguVar = this.zzb;
        zzB(1);
        if ((zzfguVar != null) && isCancelled()) {
            boolean zzg = zzg();
            zzfja<? extends zzfla<? extends InputT>> it = zzfguVar.iterator();
            while (it.hasNext()) {
                it.next().cancel(zzg);
            }
        }
    }

    abstract void zzw(int i, @NullableDecl InputT inputt);

    abstract void zzx();

    @Override // com.google.android.gms.internal.ads.zzfjx
    final void zzb(Set<Throwable> set) {
        Objects.requireNonNull(set);
        if (isCancelled()) {
            return;
        }
        zzL(set, zzk());
    }

    private final void zzI(Throwable th) {
        Objects.requireNonNull(th);
        if (!this.zzc || zzi(th) || !zzL(zzC(), th)) {
            if (th instanceof Error) {
                zzJ(th);
                return;
            }
            return;
        }
        zzJ(th);
    }
}
