package com.google.android.gms.internal.ads;

import java.util.Set;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
final class zzfjv extends zzfju {
    final AtomicReferenceFieldUpdater<zzfjx, Set<Throwable>> zza;
    final AtomicIntegerFieldUpdater<zzfjx> zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzfjv(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicIntegerFieldUpdater atomicIntegerFieldUpdater) {
        super(null);
        this.zza = atomicReferenceFieldUpdater;
        this.zzb = atomicIntegerFieldUpdater;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.zzfju
    public final void zza(zzfjx zzfjxVar, Set<Throwable> set, Set<Throwable> set2) {
        this.zza.compareAndSet(zzfjxVar, null, set2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.zzfju
    public final int zzb(zzfjx zzfjxVar) {
        return this.zzb.decrementAndGet(zzfjxVar);
    }
}
