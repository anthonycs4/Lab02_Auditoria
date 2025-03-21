package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.Objects;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
abstract class zzfiy<F, T> implements Iterator<T> {
    final Iterator<? extends F> zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzfiy(Iterator<? extends F> it) {
        Objects.requireNonNull(it);
        this.zzb = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.zzb.hasNext();
    }

    @Override // java.util.Iterator
    public final T next() {
        return zza(this.zzb.next());
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.zzb.remove();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract T zza(F f);
}
