package com.google.android.gms.internal.ads;

import java.util.Comparator;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public abstract class zzfil<T> implements Comparator<T> {
    public static <C extends Comparable> zzfil<C> zzb() {
        return zzfij.zza;
    }

    public static <T> zzfil<T> zzc(Comparator<T> comparator) {
        if (comparator instanceof zzfil) {
            return (zzfil) comparator;
        }
        return new zzfgl(comparator);
    }

    @Override // java.util.Comparator
    public abstract int compare(@NullableDecl T t, @NullableDecl T t2);

    public <S extends T> zzfil<S> zza() {
        return new zzfiu(this);
    }
}
