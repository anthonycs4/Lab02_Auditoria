package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzfha<K, V> extends zzfhf<K, V> {
    public final zzfha<K, V> zza(K k, V... vArr) {
        List<V> asList = Arrays.asList(vArr);
        Collection<V> collection = this.zza.get(k);
        if (collection != null) {
            for (V v : asList) {
                zzfga.zza(k, v);
                collection.add(v);
            }
        } else {
            Iterator it = asList.iterator();
            if (it.hasNext()) {
                ArrayList arrayList = new ArrayList();
                while (it.hasNext()) {
                    Object next = it.next();
                    zzfga.zza(k, next);
                    arrayList.add(next);
                }
                this.zza.put(k, arrayList);
            }
        }
        return this;
    }

    public final zzfhb<K, V> zzb() {
        Set<Map.Entry<K, Collection<V>>> entrySet = this.zza.entrySet();
        if (entrySet.isEmpty()) {
            return zzfgp.zza;
        }
        zzfhc zzfhcVar = new zzfhc(entrySet.size());
        int i = 0;
        for (Map.Entry<K, Collection<V>> entry : entrySet) {
            K key = entry.getKey();
            zzfgz zzp = zzfgz.zzp(entry.getValue());
            if (!zzp.isEmpty()) {
                zzfhcVar.zza(key, zzp);
                i += zzp.size();
            }
        }
        return new zzfhb<>(zzfhcVar.zzc(), i);
    }
}
