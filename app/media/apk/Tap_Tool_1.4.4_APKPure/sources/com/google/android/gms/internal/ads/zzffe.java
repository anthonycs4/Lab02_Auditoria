package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
class zzffe<K, V> extends zzffv<K, V> implements zzfho<K, V> {
    /* JADX INFO: Access modifiers changed from: protected */
    public zzffe(Map<K, Collection<V>> map) {
        super(map);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.zzffv
    public final <E> Collection<E> zza(Collection<E> collection) {
        return Collections.unmodifiableList(collection);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.zzffv
    public final Collection<V> zzb(K k, Collection<V> collection) {
        return zzg(k, (List) collection, null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.zzffv
    public /* bridge */ /* synthetic */ Collection zzc() {
        throw null;
    }
}
