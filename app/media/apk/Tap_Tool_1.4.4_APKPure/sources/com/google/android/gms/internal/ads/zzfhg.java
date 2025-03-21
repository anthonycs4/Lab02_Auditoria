package com.google.android.gms.internal.ads;

import java.util.Iterator;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
final class zzfhg<K, V> extends zzfgu<V> {
    private final transient zzfhh<K, V> zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzfhg(zzfhh<K, V> zzfhhVar) {
        this.zza = zzfhhVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfgu, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(@NullableDecl Object obj) {
        return this.zza.zzt(obj);
    }

    @Override // com.google.android.gms.internal.ads.zzfgu, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final /* bridge */ /* synthetic */ Iterator iterator() {
        return new zzfhe(this.zza);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        return this.zza.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzfgu
    public final zzfja<V> zza() {
        return new zzfhe(this.zza);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.zzfgu
    public final boolean zzf() {
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.zzfgu
    public final int zzg(Object[] objArr, int i) {
        zzfjb listIterator = ((zzfgz) this.zza.zzb.values()).listIterator(0);
        while (listIterator.hasNext()) {
            i = ((zzfgu) listIterator.next()).zzg(objArr, i);
        }
        return i;
    }
}
