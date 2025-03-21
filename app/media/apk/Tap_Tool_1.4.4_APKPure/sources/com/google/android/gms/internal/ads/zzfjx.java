package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzfjl;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.logging.Level;
import java.util.logging.Logger;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public abstract class zzfjx<OutputT> extends zzfjl.zzi<OutputT> {
    private static final zzfju zzaJ;
    private static final Logger zzaK = Logger.getLogger(zzfjx.class.getName());
    private volatile int remaining;
    private volatile Set<Throwable> seenExceptions = null;

    static {
        zzfju zzfjwVar;
        Throwable th;
        try {
            zzfjwVar = new zzfjv(AtomicReferenceFieldUpdater.newUpdater(zzfjx.class, Set.class, "seenExceptions"), AtomicIntegerFieldUpdater.newUpdater(zzfjx.class, "remaining"));
            th = null;
        } catch (Throwable th2) {
            zzfjwVar = new zzfjw(null);
            th = th2;
        }
        zzaJ = zzfjwVar;
        if (th != null) {
            zzaK.logp(Level.SEVERE, "com.google.common.util.concurrent.AggregateFutureState", "<clinit>", "SafeAtomicHelper is broken!", th);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzfjx(int i) {
        this.remaining = i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ int zzH(zzfjx zzfjxVar) {
        int i = zzfjxVar.remaining - 1;
        zzfjxVar.remaining = i;
        return i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Set<Throwable> zzC() {
        Set<Throwable> set = this.seenExceptions;
        if (set == null) {
            Set<Throwable> newSetFromMap = Collections.newSetFromMap(new ConcurrentHashMap());
            zzb(newSetFromMap);
            zzaJ.zza(this, null, newSetFromMap);
            return this.seenExceptions;
        }
        return set;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int zzD() {
        return zzaJ.zzb(this);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzE() {
        this.seenExceptions = null;
    }

    abstract void zzb(Set<Throwable> set);
}
