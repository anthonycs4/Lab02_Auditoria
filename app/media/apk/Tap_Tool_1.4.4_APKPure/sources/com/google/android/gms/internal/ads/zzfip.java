package com.google.android.gms.internal.ads;

import java.util.Iterator;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
final class zzfip<K> extends zzfhj<K> {
    private final transient zzfhd<K, ?> zza;
    private final transient zzfgz<K> zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzfip(zzfhd<K, ?> zzfhdVar, zzfgz<K> zzfgzVar) {
        this.zza = zzfhdVar;
        this.zzb = zzfgzVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfgu, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(@NullableDecl Object obj) {
        return this.zza.get(obj) != null;
    }

    @Override // com.google.android.gms.internal.ads.zzfhj, com.google.android.gms.internal.ads.zzfgu, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final /* bridge */ /* synthetic */ Iterator iterator() {
        return this.zzb.listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.zza.size();
    }

    @Override // com.google.android.gms.internal.ads.zzfhj, com.google.android.gms.internal.ads.zzfgu
    public final zzfja<K> zza() {
        return this.zzb.listIterator(0);
    }

    @Override // com.google.android.gms.internal.ads.zzfhj, com.google.android.gms.internal.ads.zzfgu
    public final zzfgz<K> zze() {
        return this.zzb;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.zzfgu
    public final boolean zzf() {
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.zzfgu
    public final int zzg(Object[] objArr, int i) {
        return this.zzb.zzg(objArr, i);
    }
}
