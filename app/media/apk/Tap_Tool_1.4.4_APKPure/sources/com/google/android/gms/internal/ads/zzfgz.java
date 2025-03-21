package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Objects;
import java.util.RandomAccess;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public abstract class zzfgz<E> extends zzfgu<E> implements List<E>, RandomAccess {
    private static final zzfjb<Object> zza = new zzfgx(zzfim.zza, 0);

    public static <E> zzfgz<E> zzi() {
        return (zzfgz<E>) zzfim.zza;
    }

    public static <E> zzfgz<E> zzj(E e) {
        Object[] objArr = {e};
        zzfik.zza(objArr, 1);
        return zzs(objArr, 1);
    }

    public static <E> zzfgz<E> zzk(E e, E e2) {
        Object[] objArr = {e, e2};
        zzfik.zza(objArr, 2);
        return zzs(objArr, 2);
    }

    public static <E> zzfgz<E> zzl(E e, E e2, E e3) {
        Object[] objArr = {"2011", "1009", "3010"};
        zzfik.zza(objArr, 3);
        return zzs(objArr, 3);
    }

    public static <E> zzfgz<E> zzm(E e, E e2, E e3, E e4, E e5) {
        Object[] objArr = {e, e2, e3, e4, e5};
        zzfik.zza(objArr, 5);
        return zzs(objArr, 5);
    }

    public static <E> zzfgz<E> zzn(E e, E e2, E e3, E e4, E e5, E e6) {
        Object[] objArr = {e, e2, e3, e4, e5, e6};
        zzfik.zza(objArr, 6);
        return zzs(objArr, 6);
    }

    public static <E> zzfgz<E> zzp(Collection<? extends E> collection) {
        if (collection instanceof zzfgu) {
            zzfgz<E> zze = ((zzfgu) collection).zze();
            if (zze.zzf()) {
                Object[] array = zze.toArray();
                return zzs(array, array.length);
            }
            return zze;
        }
        Object[] array2 = collection.toArray();
        int length = array2.length;
        zzfik.zza(array2, length);
        return zzs(array2, length);
    }

    public static <E> zzfgz<E> zzq(E[] eArr) {
        Object[] objArr = (Object[]) eArr.clone();
        int length = objArr.length;
        zzfik.zza(objArr, length);
        return zzs(objArr, length);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <E> zzfgz<E> zzr(Object[] objArr) {
        return zzs(objArr, objArr.length);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <E> zzfgz<E> zzs(Object[] objArr, int i) {
        if (i == 0) {
            return (zzfgz<E>) zzfim.zza;
        }
        return new zzfim(objArr, i);
    }

    public static <E> zzfgw<E> zzu() {
        return new zzfgw<>(4);
    }

    @Override // java.util.List
    @Deprecated
    public final void add(int i, E e) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    @Deprecated
    public final boolean addAll(int i, Collection<? extends E> collection) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.internal.ads.zzfgu, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(@NullableDecl Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override // java.util.Collection, java.util.List
    public final boolean equals(@NullableDecl Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof List) {
            List list = (List) obj;
            int size = size();
            if (size == list.size()) {
                if (list instanceof RandomAccess) {
                    for (int i = 0; i < size; i++) {
                        if (zzfeo.zza(get(i), list.get(i))) {
                        }
                    }
                    return true;
                }
                Iterator<E> it = iterator();
                Iterator<E> it2 = list.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (it2.hasNext()) {
                            if (!zzfeo.zza(it.next(), it2.next())) {
                                break;
                            }
                        } else {
                            break;
                        }
                    } else if (!it2.hasNext()) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // java.util.Collection, java.util.List
    public final int hashCode() {
        int size = size();
        int i = 1;
        for (int i2 = 0; i2 < size; i2++) {
            i = (i * 31) + get(i2).hashCode();
        }
        return i;
    }

    @Override // java.util.List
    public final int indexOf(@NullableDecl Object obj) {
        if (obj == null) {
            return -1;
        }
        int size = size();
        for (int i = 0; i < size; i++) {
            if (obj.equals(get(i))) {
                return i;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.zzfgu, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final /* bridge */ /* synthetic */ Iterator iterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    public final int lastIndexOf(@NullableDecl Object obj) {
        if (obj == null) {
            return -1;
        }
        for (int size = size() - 1; size >= 0; size--) {
            if (obj.equals(get(size))) {
                return size;
            }
        }
        return -1;
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    @Deprecated
    public final E remove(int i) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    @Deprecated
    public final E set(int i, E e) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.internal.ads.zzfgu
    public final zzfja<E> zza() {
        return listIterator(0);
    }

    @Override // com.google.android.gms.internal.ads.zzfgu
    @Deprecated
    public final zzfgz<E> zze() {
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfgu
    int zzg(Object[] objArr, int i) {
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            objArr[i + i2] = get(i2);
        }
        return i + size;
    }

    @Override // java.util.List
    /* renamed from: zzh */
    public zzfgz<E> subList(int i, int i2) {
        zzfes.zzg(i, i2, size());
        int i3 = i2 - i;
        if (i3 == size()) {
            return this;
        }
        if (i3 != 0) {
            return new zzfgy(this, i, i3);
        }
        return (zzfgz<E>) zzfim.zza;
    }

    @Override // java.util.List
    /* renamed from: zzt */
    public final zzfjb<E> listIterator(int i) {
        zzfes.zzf(i, size(), "index");
        return isEmpty() ? (zzfjb<E>) zza : new zzfgx(this, i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <E> zzfgz<E> zzo(Iterable<? extends E> iterable) {
        Objects.requireNonNull(iterable);
        return zzp(iterable);
    }
}
