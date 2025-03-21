package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
abstract class zzffy<K, V> implements zzfhz<K, V> {
    @NullableDecl
    private transient Set<K> zza;
    @NullableDecl
    private transient Collection<V> zzb;
    @NullableDecl
    private transient Map<K, Collection<V>> zzc;

    public final boolean equals(@NullableDecl Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzfhz) {
            return zzw().equals(((zzfhz) obj).zzw());
        }
        return false;
    }

    public final int hashCode() {
        return zzw().hashCode();
    }

    public final String toString() {
        return zzw().toString();
    }

    @Override // com.google.android.gms.internal.ads.zzfhz
    public boolean zze(@NullableDecl K k, @NullableDecl V v) {
        throw null;
    }

    abstract Set<K> zzh();

    abstract Collection<V> zzj();

    /* JADX INFO: Access modifiers changed from: package-private */
    public Iterator<V> zzk() {
        throw null;
    }

    abstract Map<K, Collection<V>> zzl();

    public boolean zzt(@NullableDecl Object obj) {
        for (Collection<V> collection : zzw().values()) {
            if (collection.contains(obj)) {
                return true;
            }
        }
        return false;
    }

    public final Set<K> zzu() {
        Set<K> set = this.zza;
        if (set == null) {
            Set<K> zzh = zzh();
            this.zza = zzh;
            return zzh;
        }
        return set;
    }

    @Override // com.google.android.gms.internal.ads.zzfhz
    public Collection<V> zzv() {
        Collection<V> collection = this.zzb;
        if (collection == null) {
            Collection<V> zzj = zzj();
            this.zzb = zzj;
            return zzj;
        }
        return collection;
    }

    @Override // com.google.android.gms.internal.ads.zzfhz
    public Map<K, Collection<V>> zzw() {
        Map<K, Collection<V>> map = this.zzc;
        if (map == null) {
            Map<K, Collection<V>> zzl = zzl();
            this.zzc = zzl;
            return zzl;
        }
        return map;
    }
}
