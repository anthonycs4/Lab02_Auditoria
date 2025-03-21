package com.google.android.gms.internal.ads;

import java.util.ListIterator;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
abstract class zzfiz<F, T> extends zzfiy<F, T> implements ListIterator<T> {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzfiz(ListIterator<? extends F> listIterator) {
        super(listIterator);
    }

    @Override // java.util.ListIterator
    public final void add(T t) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return ((ListIterator) this.zzb).hasPrevious();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return ((ListIterator) this.zzb).nextIndex();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.ListIterator
    public final T previous() {
        return (T) zza(((ListIterator) this.zzb).previous());
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return ((ListIterator) this.zzb).previousIndex();
    }

    @Override // java.util.ListIterator
    public final void set(T t) {
        throw new UnsupportedOperationException();
    }
}
