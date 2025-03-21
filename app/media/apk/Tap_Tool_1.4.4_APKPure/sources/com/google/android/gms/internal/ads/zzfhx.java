package com.google.android.gms.internal.ads;

import java.util.AbstractMap;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
abstract class zzfhx<K, V> extends AbstractMap<K, V> {
    @NullableDecl
    private transient Set<Map.Entry<K, V>> zza;
    @NullableDecl
    private transient Set<K> zzb;
    @NullableDecl
    private transient Collection<V> zzc;

    @Override // java.util.AbstractMap, java.util.Map
    public final Set<Map.Entry<K, V>> entrySet() {
        Set<Map.Entry<K, V>> set = this.zza;
        if (set == null) {
            Set<Map.Entry<K, V>> zza = zza();
            this.zza = zza;
            return zza;
        }
        return set;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<K> keySet() {
        Set<K> set = this.zzb;
        if (set == null) {
            Set<K> zzh = zzh();
            this.zzb = zzh;
            return zzh;
        }
        return set;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Collection<V> values() {
        Collection<V> collection = this.zzc;
        if (collection == null) {
            zzfhw zzfhwVar = new zzfhw(this);
            this.zzc = zzfhwVar;
            return zzfhwVar;
        }
        return collection;
    }

    abstract Set<Map.Entry<K, V>> zza();

    Set<K> zzh() {
        return new zzfhv(this);
    }
}
