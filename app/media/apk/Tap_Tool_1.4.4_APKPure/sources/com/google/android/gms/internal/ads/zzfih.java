package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
final class zzfih<K, V> extends zzffe<K, V> {
    final transient zzffb<? extends List<V>> zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzfih(Map<K, Collection<V>> map, zzffb<? extends List<V>> zzffbVar) {
        super(map);
        this.zza = zzffbVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzffe, com.google.android.gms.internal.ads.zzffv
    public final /* bridge */ /* synthetic */ Collection zzc() {
        return this.zza.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzffv, com.google.android.gms.internal.ads.zzffy
    final Set<K> zzh() {
        return zzi();
    }

    @Override // com.google.android.gms.internal.ads.zzffv, com.google.android.gms.internal.ads.zzffy
    final Map<K, Collection<V>> zzl() {
        return zzm();
    }
}
