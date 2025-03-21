package com.google.android.gms.internal.ads;

import java.util.AbstractList;
import java.util.List;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzfyt<F, T> extends AbstractList<T> {
    private final List<F> zza;
    private final zzfys<F, T> zzb;

    public zzfyt(List<F> list, zzfys<F, T> zzfysVar) {
        this.zza = list;
        this.zzb = zzfysVar;
    }

    @Override // java.util.AbstractList, java.util.List
    public final T get(int i) {
        T t = (T) zzawg.zzb(((Integer) this.zza.get(i)).intValue());
        return t == null ? (T) zzawg.AD_FORMAT_TYPE_UNSPECIFIED : t;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zza.size();
    }
}
