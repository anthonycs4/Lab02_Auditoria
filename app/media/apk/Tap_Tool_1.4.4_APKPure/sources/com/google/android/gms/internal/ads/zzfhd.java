package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public abstract class zzfhd<K, V> implements Map<K, V>, Serializable {
    private transient zzfhj<Map.Entry<K, V>> zza;
    private transient zzfhj<K> zzb;
    private transient zzfgu<V> zzc;

    public static <K, V> zzfhd<K, V> zza() {
        return (zzfhd<K, V>) zzfir.zza;
    }

    public static <K, V> zzfhd<K, V> zzb(K k, V v) {
        zzfga.zza(k, v);
        return zzfir.zzj(1, new Object[]{k, v});
    }

    public static <K, V> zzfhc<K, V> zzc(int i) {
        return new zzfhc<>(8);
    }

    public static <K, V> zzfhd<K, V> zzd(Map<? extends K, ? extends V> map) {
        Set<Map.Entry<? extends K, ? extends V>> entrySet = map.entrySet();
        zzfhc zzfhcVar = new zzfhc(entrySet instanceof Collection ? entrySet.size() : 4);
        zzfhcVar.zzb(entrySet);
        return zzfhcVar.zzc();
    }

    @Override // java.util.Map
    @Deprecated
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final boolean containsKey(@NullableDecl Object obj) {
        return get(obj) != null;
    }

    @Override // java.util.Map
    public final boolean containsValue(@NullableDecl Object obj) {
        return values().contains(obj);
    }

    @Override // java.util.Map
    public final boolean equals(@NullableDecl Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Map) {
            return entrySet().equals(((Map) obj).entrySet());
        }
        return false;
    }

    @Override // java.util.Map
    public abstract V get(@NullableDecl Object obj);

    @Override // java.util.Map
    public final V getOrDefault(@NullableDecl Object obj, @NullableDecl V v) {
        V v2 = get(obj);
        return v2 != null ? v2 : v;
    }

    @Override // java.util.Map
    public final int hashCode() {
        return zzfiw.zza(entrySet());
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ Set keySet() {
        zzfhj<K> zzfhjVar = this.zzb;
        if (zzfhjVar == null) {
            zzfhj<K> zzg = zzg();
            this.zzb = zzg;
            return zzg;
        }
        return zzfhjVar;
    }

    @Override // java.util.Map
    @Deprecated
    public final V put(K k, V v) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    @Deprecated
    public final void putAll(Map<? extends K, ? extends V> map) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    @Deprecated
    public final V remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    public final String toString() {
        int size = size();
        zzfga.zzb(size, "size");
        StringBuilder sb = new StringBuilder((int) Math.min(size * 8, 1073741824L));
        sb.append('{');
        boolean z = true;
        for (Map.Entry<K, V> entry : entrySet()) {
            if (!z) {
                sb.append(", ");
            }
            sb.append(entry.getKey());
            sb.append('=');
            sb.append(entry.getValue());
            z = false;
        }
        sb.append('}');
        return sb.toString();
    }

    @Override // java.util.Map
    /* renamed from: zze */
    public final zzfhj<Map.Entry<K, V>> entrySet() {
        zzfhj<Map.Entry<K, V>> zzfhjVar = this.zza;
        if (zzfhjVar == null) {
            zzfhj<Map.Entry<K, V>> zzf = zzf();
            this.zza = zzf;
            return zzf;
        }
        return zzfhjVar;
    }

    abstract zzfhj<Map.Entry<K, V>> zzf();

    abstract zzfhj<K> zzg();

    @Override // java.util.Map
    /* renamed from: zzh */
    public final zzfgu<V> values() {
        zzfgu<V> zzfguVar = this.zzc;
        if (zzfguVar == null) {
            zzfgu<V> zzi = zzi();
            this.zzc = zzi;
            return zzi;
        }
        return zzfguVar;
    }

    abstract zzfgu<V> zzi();
}
