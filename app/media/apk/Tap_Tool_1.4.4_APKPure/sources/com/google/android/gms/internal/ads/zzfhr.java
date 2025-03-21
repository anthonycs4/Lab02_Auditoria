package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.List;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzfhr {
    public static <E> ArrayList<E> zza(int i) {
        zzfga.zzb(i, "initialArraySize");
        return new ArrayList<>(i);
    }

    public static <F, T> List<T> zzb(List<F> list, zzfei<? super F, ? extends T> zzfeiVar) {
        return new zzfhq(list, zzfeiVar);
    }
}
