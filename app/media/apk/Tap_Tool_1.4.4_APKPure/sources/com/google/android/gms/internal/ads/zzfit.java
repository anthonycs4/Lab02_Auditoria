package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.util.Objects;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
final class zzfit extends zzfil<Comparable> implements Serializable {
    static final zzfit zza = new zzfit();

    private zzfit() {
    }

    @Override // com.google.android.gms.internal.ads.zzfil, java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        Comparable comparable = (Comparable) obj;
        Comparable comparable2 = (Comparable) obj2;
        Objects.requireNonNull(comparable);
        if (comparable == comparable2) {
            return 0;
        }
        return comparable2.compareTo(comparable);
    }

    public final String toString() {
        return "Ordering.natural().reverse()";
    }

    @Override // com.google.android.gms.internal.ads.zzfil
    public final <S extends Comparable> zzfil<S> zza() {
        return zzfij.zza;
    }
}
