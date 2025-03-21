package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.Objects;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzfix<E> extends zzfhj<E> {
    final transient E zza;
    private transient int zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzfix(E e) {
        Objects.requireNonNull(e);
        this.zza = e;
    }

    @Override // com.google.android.gms.internal.ads.zzfgu, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return this.zza.equals(obj);
    }

    @Override // com.google.android.gms.internal.ads.zzfhj, java.util.Collection, java.util.Set
    public final int hashCode() {
        int i = this.zzb;
        if (i == 0) {
            int hashCode = this.zza.hashCode();
            this.zzb = hashCode;
            return hashCode;
        }
        return i;
    }

    @Override // com.google.android.gms.internal.ads.zzfhj, com.google.android.gms.internal.ads.zzfgu, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final /* bridge */ /* synthetic */ Iterator iterator() {
        return new zzfhk(this.zza);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return 1;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        String obj = this.zza.toString();
        StringBuilder sb = new StringBuilder(String.valueOf(obj).length() + 2);
        sb.append('[');
        sb.append(obj);
        sb.append(']');
        return sb.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzfhj, com.google.android.gms.internal.ads.zzfgu
    public final zzfja<E> zza() {
        return new zzfhk(this.zza);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.zzfgu
    public final boolean zzf() {
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.zzfgu
    public final int zzg(Object[] objArr, int i) {
        objArr[i] = this.zza;
        return i + 1;
    }

    @Override // com.google.android.gms.internal.ads.zzfhj
    final boolean zzk() {
        return this.zzb != 0;
    }

    @Override // com.google.android.gms.internal.ads.zzfhj
    final zzfgz<E> zzl() {
        return zzfgz.zzj(this.zza);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzfix(E e, int i) {
        this.zza = e;
        this.zzb = i;
    }
}
