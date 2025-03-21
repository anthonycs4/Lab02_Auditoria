package com.google.android.gms.internal.ads;

import java.util.Comparator;
import java.util.SortedMap;
import java.util.SortedSet;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public class zzffp extends zzffi implements SortedMap {
    @NullableDecl
    SortedSet zzd;
    final /* synthetic */ zzffv zze;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzffp(zzffv zzffvVar, SortedMap sortedMap) {
        super(zzffvVar, sortedMap);
        this.zze = zzffvVar;
    }

    @Override // java.util.SortedMap
    public final Comparator comparator() {
        return zzg().comparator();
    }

    @Override // java.util.SortedMap
    public final Object firstKey() {
        return zzg().firstKey();
    }

    public SortedMap headMap(Object obj) {
        return new zzffp(this.zze, zzg().headMap(obj));
    }

    @Override // java.util.SortedMap
    public final Object lastKey() {
        return zzg().lastKey();
    }

    public SortedMap subMap(Object obj, Object obj2) {
        return new zzffp(this.zze, zzg().subMap(obj, obj2));
    }

    public SortedMap tailMap(Object obj) {
        return new zzffp(this.zze, zzg().tailMap(obj));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.zzfhx
    /* renamed from: zze */
    public SortedSet zzh() {
        return new zzffq(this.zze, zzg());
    }

    @Override // com.google.android.gms.internal.ads.zzffi, com.google.android.gms.internal.ads.zzfhx, java.util.AbstractMap, java.util.Map
    /* renamed from: zzf */
    public SortedSet keySet() {
        SortedSet sortedSet = this.zzd;
        if (sortedSet == null) {
            SortedSet zzh = zzh();
            this.zzd = zzh;
            return zzh;
        }
        return sortedSet;
    }

    SortedMap zzg() {
        return (SortedMap) this.zza;
    }
}
