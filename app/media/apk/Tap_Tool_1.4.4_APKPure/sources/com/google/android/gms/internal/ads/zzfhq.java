package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.util.AbstractSequentialList;
import java.util.List;
import java.util.ListIterator;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
final class zzfhq<F, T> extends AbstractSequentialList<T> implements Serializable {
    final List<F> zza;
    final zzfei<? super F, ? extends T> zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzfhq(List<F> list, zzfei<? super F, ? extends T> zzfeiVar) {
        this.zza = list;
        this.zzb = zzfeiVar;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        this.zza.clear();
    }

    @Override // java.util.AbstractSequentialList, java.util.AbstractList, java.util.List
    public final ListIterator<T> listIterator(int i) {
        return new zzfhp(this, this.zza.listIterator(i));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zza.size();
    }
}
