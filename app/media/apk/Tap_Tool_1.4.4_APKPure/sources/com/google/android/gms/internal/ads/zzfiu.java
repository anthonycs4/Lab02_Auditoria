package com.google.android.gms.internal.ads;

import java.io.Serializable;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
final class zzfiu<T> extends zzfil<T> implements Serializable {
    final zzfil<? super T> zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzfiu(zzfil<? super T> zzfilVar) {
        this.zza = zzfilVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfil, java.util.Comparator
    public final int compare(T t, T t2) {
        return this.zza.compare(t2, t);
    }

    @Override // java.util.Comparator
    public final boolean equals(@NullableDecl Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzfiu) {
            return this.zza.equals(((zzfiu) obj).zza);
        }
        return false;
    }

    public final int hashCode() {
        return -this.zza.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.zza);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 10);
        sb.append(valueOf);
        sb.append(".reverse()");
        return sb.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzfil
    public final <S extends T> zzfil<S> zza() {
        return (zzfil<? super T>) this.zza;
    }
}
