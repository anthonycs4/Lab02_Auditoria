package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.Map;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public interface zzfhz<K, V> {
    int zzd();

    boolean zze(@NullableDecl K k, @NullableDecl V v);

    void zzf();

    Collection<V> zzv();

    Map<K, Collection<V>> zzw();
}
