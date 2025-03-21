package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public class zzffi extends zzfhx {
    final transient Map zza;
    final /* synthetic */ zzffv zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzffi(zzffv zzffvVar, Map map) {
        this.zzb = zzffvVar;
        this.zza = map;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        Map map;
        Map map2 = this.zza;
        map = this.zzb.zza;
        if (map2 == map) {
            this.zzb.zzf();
        } else {
            zzfhn.zzb(new zzffh(this));
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(@NullableDecl Object obj) {
        return this == obj || this.zza.equals(obj);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final /* bridge */ /* synthetic */ Object get(Object obj) {
        Collection collection = (Collection) zzfhy.zza(this.zza, obj);
        if (collection == null) {
            return null;
        }
        return this.zzb.zzb(obj, collection);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        return this.zza.hashCode();
    }

    @Override // com.google.android.gms.internal.ads.zzfhx, java.util.AbstractMap, java.util.Map
    public Set keySet() {
        return this.zzb.zzu();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final /* bridge */ /* synthetic */ Object remove(Object obj) {
        Collection collection = (Collection) this.zza.remove(obj);
        if (collection == null) {
            return null;
        }
        Collection zzc = this.zzb.zzc();
        zzc.addAll(collection);
        zzffv.zzr(this.zzb, collection.size());
        collection.clear();
        return zzc;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.zza.size();
    }

    @Override // java.util.AbstractMap
    public final String toString() {
        return this.zza.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzfhx
    protected final Set<Map.Entry> zza() {
        return new zzffg(this);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Map.Entry zzb(Map.Entry entry) {
        Object key = entry.getKey();
        return new zzfgv(key, this.zzb.zzb(key, (Collection) entry.getValue()));
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Map map = this.zza;
        Objects.requireNonNull(map);
        try {
            return map.containsKey(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }
}
