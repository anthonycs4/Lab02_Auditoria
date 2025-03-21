package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Map;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public abstract class zzgdm<K, V, V2> implements zzgdq<Map<K, V2>> {
    private final Map<K, zzgeb<V>> zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzgdm(Map<K, zzgeb<V>> map) {
        this.zza = Collections.unmodifiableMap(map);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Map<K, zzgeb<V>> zza() {
        return this.zza;
    }
}
