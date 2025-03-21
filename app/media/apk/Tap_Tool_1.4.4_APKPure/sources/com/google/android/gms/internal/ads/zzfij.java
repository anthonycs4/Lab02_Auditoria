package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.util.Objects;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
final class zzfij extends zzfil<Comparable> implements Serializable {
    static final zzfij zza = new zzfij();

    private zzfij() {
    }

    @Override // com.google.android.gms.internal.ads.zzfil, java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        Comparable comparable = (Comparable) obj;
        Comparable comparable2 = (Comparable) obj2;
        Objects.requireNonNull(comparable);
        Objects.requireNonNull(comparable2);
        return comparable.compareTo(comparable2);
    }

    public final String toString() {
        return "Ordering.natural()";
    }

    @Override // com.google.android.gms.internal.ads.zzfil
    public final <S extends Comparable> zzfil<S> zza() {
        return zzfit.zza;
    }
}
