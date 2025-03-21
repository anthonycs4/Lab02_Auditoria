package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NavigableMap;
import java.util.RandomAccess;
import java.util.Set;
import java.util.SortedMap;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public abstract class zzffv<K, V> extends zzffy<K, V> implements Serializable {
    private final transient Map<K, Collection<V>> zza;
    private transient int zzb;

    /* JADX INFO: Access modifiers changed from: protected */
    public zzffv(Map<K, Collection<V>> map) {
        if (map.isEmpty()) {
            this.zza = map;
            return;
        }
        throw new IllegalArgumentException();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ int zzo(zzffv zzffvVar) {
        int i = zzffvVar.zzb;
        zzffvVar.zzb = i - 1;
        return i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ int zzp(zzffv zzffvVar) {
        int i = zzffvVar.zzb;
        zzffvVar.zzb = i + 1;
        return i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ int zzq(zzffv zzffvVar, int i) {
        int i2 = zzffvVar.zzb + i;
        zzffvVar.zzb = i2;
        return i2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ int zzr(zzffv zzffvVar, int i) {
        int i2 = zzffvVar.zzb - i;
        zzffvVar.zzb = i2;
        return i2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzs(zzffv zzffvVar, Object obj) {
        Collection<V> collection;
        try {
            collection = zzffvVar.zza.remove(obj);
        } catch (ClassCastException | NullPointerException unused) {
            collection = null;
        }
        Collection<V> collection2 = collection;
        if (collection2 != null) {
            int size = collection2.size();
            collection2.clear();
            zzffvVar.zzb -= size;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public <E> Collection<E> zza(Collection<E> collection) {
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Collection<V> zzb(@NullableDecl K k, Collection<V> collection) {
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract Collection<V> zzc();

    @Override // com.google.android.gms.internal.ads.zzfhz
    public final int zzd() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzffy, com.google.android.gms.internal.ads.zzfhz
    public final boolean zze(@NullableDecl K k, @NullableDecl V v) {
        Collection<V> collection = this.zza.get(k);
        if (collection == null) {
            Collection<V> zzc = zzc();
            if (zzc.add(v)) {
                this.zzb++;
                this.zza.put(k, zzc);
                return true;
            }
            throw new AssertionError("New Collection violated the Collection spec");
        } else if (collection.add(v)) {
            this.zzb++;
            return true;
        } else {
            return false;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfhz
    public final void zzf() {
        for (Collection<V> collection : this.zza.values()) {
            collection.clear();
        }
        this.zza.clear();
        this.zzb = 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final List<V> zzg(@NullableDecl K k, List<V> list, @NullableDecl zzffs zzffsVar) {
        if (list instanceof RandomAccess) {
            return new zzffo(this, k, list, zzffsVar);
        }
        return new zzffu(this, k, list, zzffsVar);
    }

    @Override // com.google.android.gms.internal.ads.zzffy
    Set<K> zzh() {
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Set<K> zzi() {
        Map<K, Collection<V>> map = this.zza;
        if (map instanceof NavigableMap) {
            return new zzffn(this, (NavigableMap) map);
        }
        if (map instanceof SortedMap) {
            return new zzffq(this, (SortedMap) map);
        }
        return new zzffl(this, map);
    }

    @Override // com.google.android.gms.internal.ads.zzffy
    final Collection<V> zzj() {
        return new zzffx(this);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.zzffy
    public final Iterator<V> zzk() {
        return new zzfff(this);
    }

    @Override // com.google.android.gms.internal.ads.zzffy
    Map<K, Collection<V>> zzl() {
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Map<K, Collection<V>> zzm() {
        Map<K, Collection<V>> map = this.zza;
        if (map instanceof NavigableMap) {
            return new zzffm(this, (NavigableMap) map);
        }
        if (map instanceof SortedMap) {
            return new zzffp(this, (SortedMap) map);
        }
        return new zzffi(this, map);
    }
}
