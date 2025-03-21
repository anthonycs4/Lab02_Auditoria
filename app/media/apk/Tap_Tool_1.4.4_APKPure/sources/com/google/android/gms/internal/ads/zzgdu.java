package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzgdu<K, V> extends zzgdm<K, V, V> {
    private static final zzgeb<Map<Object, Object>> zza = zzgdr.zza(Collections.emptyMap());

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzgdu(Map map, zzgds zzgdsVar) {
        super(map);
    }

    public static <K, V> zzgdt<K, V> zzc(int i) {
        return new zzgdt<>(i, null);
    }

    @Override // com.google.android.gms.internal.ads.zzgeb
    /* renamed from: zzd */
    public final Map<K, V> zzb() {
        LinkedHashMap zzc = zzgdn.zzc(zza().size());
        for (Map.Entry<K, zzgeb<V>> entry : zza().entrySet()) {
            zzc.put(entry.getKey(), entry.getValue().zzb());
        }
        return Collections.unmodifiableMap(zzc);
    }
}
