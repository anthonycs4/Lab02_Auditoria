package com.google.android.gms.internal.ads;

import java.util.LinkedHashMap;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzgdt<K, V> extends zzgdl<K, V, V> {
    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzgdt(int i, zzgds zzgdsVar) {
        super(i);
    }

    public final zzgdt<K, V> zza(K k, zzgeb<V> zzgebVar) {
        LinkedHashMap<K, zzgeb<V>> linkedHashMap = this.zza;
        zzgdw.zza(k, "key");
        zzgdw.zza(zzgebVar, "provider");
        linkedHashMap.put(k, zzgebVar);
        return this;
    }

    public final zzgdu<K, V> zzb() {
        return new zzgdu<>(this.zza, null);
    }
}
