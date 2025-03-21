package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.util.Comparator;
import java.util.Objects;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
final class zzfgl<T> extends zzfil<T> implements Serializable {
    final Comparator<T> zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzfgl(Comparator<T> comparator) {
        Objects.requireNonNull(comparator);
        this.zza = comparator;
    }

    @Override // com.google.android.gms.internal.ads.zzfil, java.util.Comparator
    public final int compare(T t, T t2) {
        return this.zza.compare(t, t2);
    }

    @Override // java.util.Comparator
    public final boolean equals(@NullableDecl Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzfgl) {
            return this.zza.equals(((zzfgl) obj).zza);
        }
        return false;
    }

    public final int hashCode() {
        return this.zza.hashCode();
    }

    public final String toString() {
        return this.zza.toString();
    }
}
