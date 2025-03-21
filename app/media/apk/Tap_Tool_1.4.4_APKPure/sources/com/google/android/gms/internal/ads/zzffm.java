package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
final class zzffm extends zzffp implements NavigableMap {
    final /* synthetic */ zzffv zzc;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzffm(zzffv zzffvVar, NavigableMap navigableMap) {
        super(zzffvVar, navigableMap);
        this.zzc = zzffvVar;
    }

    @Override // java.util.NavigableMap
    public final Map.Entry ceilingEntry(Object obj) {
        Map.Entry ceilingEntry = ((NavigableMap) ((SortedMap) this.zza)).ceilingEntry(obj);
        if (ceilingEntry == null) {
            return null;
        }
        return zzb(ceilingEntry);
    }

    @Override // java.util.NavigableMap
    public final Object ceilingKey(Object obj) {
        return ((NavigableMap) ((SortedMap) this.zza)).ceilingKey(obj);
    }

    @Override // java.util.NavigableMap
    public final NavigableSet descendingKeySet() {
        return (NavigableSet) super.keySet();
    }

    @Override // java.util.NavigableMap
    public final NavigableMap descendingMap() {
        return new zzffm(this.zzc, ((NavigableMap) ((SortedMap) this.zza)).descendingMap());
    }

    @Override // java.util.NavigableMap
    public final Map.Entry firstEntry() {
        Map.Entry firstEntry = ((NavigableMap) ((SortedMap) this.zza)).firstEntry();
        if (firstEntry == null) {
            return null;
        }
        return zzb(firstEntry);
    }

    @Override // java.util.NavigableMap
    public final Map.Entry floorEntry(Object obj) {
        Map.Entry floorEntry = ((NavigableMap) ((SortedMap) this.zza)).floorEntry(obj);
        if (floorEntry == null) {
            return null;
        }
        return zzb(floorEntry);
    }

    @Override // java.util.NavigableMap
    public final Object floorKey(Object obj) {
        return ((NavigableMap) ((SortedMap) this.zza)).floorKey(obj);
    }

    @Override // com.google.android.gms.internal.ads.zzffp, java.util.SortedMap, java.util.NavigableMap
    public final /* bridge */ /* synthetic */ SortedMap headMap(Object obj) {
        return headMap(obj, false);
    }

    @Override // java.util.NavigableMap
    public final Map.Entry higherEntry(Object obj) {
        Map.Entry higherEntry = ((NavigableMap) ((SortedMap) this.zza)).higherEntry(obj);
        if (higherEntry == null) {
            return null;
        }
        return zzb(higherEntry);
    }

    @Override // java.util.NavigableMap
    public final Object higherKey(Object obj) {
        return ((NavigableMap) ((SortedMap) this.zza)).higherKey(obj);
    }

    @Override // com.google.android.gms.internal.ads.zzffp, com.google.android.gms.internal.ads.zzffi, com.google.android.gms.internal.ads.zzfhx, java.util.AbstractMap, java.util.Map
    public final /* bridge */ /* synthetic */ Set keySet() {
        return (NavigableSet) super.keySet();
    }

    @Override // java.util.NavigableMap
    public final Map.Entry lastEntry() {
        Map.Entry lastEntry = ((NavigableMap) ((SortedMap) this.zza)).lastEntry();
        if (lastEntry == null) {
            return null;
        }
        return zzb(lastEntry);
    }

    @Override // java.util.NavigableMap
    public final Map.Entry lowerEntry(Object obj) {
        Map.Entry lowerEntry = ((NavigableMap) ((SortedMap) this.zza)).lowerEntry(obj);
        if (lowerEntry == null) {
            return null;
        }
        return zzb(lowerEntry);
    }

    @Override // java.util.NavigableMap
    public final Object lowerKey(Object obj) {
        return ((NavigableMap) ((SortedMap) this.zza)).lowerKey(obj);
    }

    @Override // java.util.NavigableMap
    public final NavigableSet navigableKeySet() {
        return (NavigableSet) super.keySet();
    }

    @Override // java.util.NavigableMap
    public final Map.Entry pollFirstEntry() {
        return zzc(entrySet().iterator());
    }

    @Override // java.util.NavigableMap
    public final Map.Entry pollLastEntry() {
        return zzc(descendingMap().entrySet().iterator());
    }

    @Override // com.google.android.gms.internal.ads.zzffp, java.util.SortedMap, java.util.NavigableMap
    public final /* bridge */ /* synthetic */ SortedMap subMap(Object obj, Object obj2) {
        return subMap(obj, true, obj2, false);
    }

    @Override // com.google.android.gms.internal.ads.zzffp, java.util.SortedMap, java.util.NavigableMap
    public final /* bridge */ /* synthetic */ SortedMap tailMap(Object obj) {
        return tailMap(obj, true);
    }

    final Map.Entry zzc(Iterator<Map.Entry> it) {
        if (it.hasNext()) {
            Map.Entry next = it.next();
            Collection zzc = this.zzc.zzc();
            zzc.addAll((Collection) next.getValue());
            it.remove();
            return new zzfgv(next.getKey(), this.zzc.zza(zzc));
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.zzffp, com.google.android.gms.internal.ads.zzfhx
    /* renamed from: zzd */
    public final NavigableSet zzh() {
        return new zzffn(this.zzc, (NavigableMap) ((SortedMap) this.zza));
    }

    @Override // com.google.android.gms.internal.ads.zzffp
    public final /* bridge */ /* synthetic */ SortedSet zzf() {
        return (NavigableSet) super.keySet();
    }

    @Override // com.google.android.gms.internal.ads.zzffp
    final /* bridge */ /* synthetic */ SortedMap zzg() {
        return (NavigableMap) ((SortedMap) this.zza);
    }

    @Override // java.util.NavigableMap
    public final NavigableMap headMap(Object obj, boolean z) {
        return new zzffm(this.zzc, ((NavigableMap) ((SortedMap) this.zza)).headMap(obj, z));
    }

    @Override // java.util.NavigableMap
    public final NavigableMap subMap(Object obj, boolean z, Object obj2, boolean z2) {
        return new zzffm(this.zzc, ((NavigableMap) ((SortedMap) this.zza)).subMap(obj, z, obj2, z2));
    }

    @Override // java.util.NavigableMap
    public final NavigableMap tailMap(Object obj, boolean z) {
        return new zzffm(this.zzc, ((NavigableMap) ((SortedMap) this.zza)).tailMap(obj, z));
    }
}
