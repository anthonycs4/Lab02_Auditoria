package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.RandomAccess;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzgad<E> extends zzfwu<E> implements RandomAccess {
    private static final zzgad<Object> zza;
    private E[] zzb;
    private int zzc;

    static {
        zzgad<Object> zzgadVar = new zzgad<>(new Object[0], 0);
        zza = zzgadVar;
        zzgadVar.zzb();
    }

    zzgad() {
        this(new Object[10], 0);
    }

    public static <E> zzgad<E> zzd() {
        return (zzgad<E>) zza;
    }

    private final void zzf(int i) {
        if (i < 0 || i >= this.zzc) {
            throw new IndexOutOfBoundsException(zzg(i));
        }
    }

    private final String zzg(int i) {
        int i2 = this.zzc;
        StringBuilder sb = new StringBuilder(35);
        sb.append("Index:");
        sb.append(i);
        sb.append(", Size:");
        sb.append(i2);
        return sb.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzfwu, java.util.AbstractList, java.util.List
    public final void add(int i, E e) {
        int i2;
        zzbU();
        if (i < 0 || i > (i2 = this.zzc)) {
            throw new IndexOutOfBoundsException(zzg(i));
        }
        E[] eArr = this.zzb;
        if (i2 < eArr.length) {
            System.arraycopy(eArr, i, eArr, i + 1, i2 - i);
        } else {
            E[] eArr2 = (E[]) new Object[((i2 * 3) / 2) + 1];
            System.arraycopy(eArr, 0, eArr2, 0, i);
            System.arraycopy(this.zzb, i, eArr2, i + 1, this.zzc - i);
            this.zzb = eArr2;
        }
        this.zzb[i] = e;
        this.zzc++;
        this.modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final E get(int i) {
        zzf(i);
        return this.zzb[i];
    }

    @Override // com.google.android.gms.internal.ads.zzfwu, java.util.AbstractList, java.util.List
    public final E remove(int i) {
        int i2;
        zzbU();
        zzf(i);
        E[] eArr = this.zzb;
        E e = eArr[i];
        if (i < this.zzc - 1) {
            System.arraycopy(eArr, i + 1, eArr, i, (i2 - i) - 1);
        }
        this.zzc--;
        this.modCount++;
        return e;
    }

    @Override // com.google.android.gms.internal.ads.zzfwu, java.util.AbstractList, java.util.List
    public final E set(int i, E e) {
        zzbU();
        zzf(i);
        E[] eArr = this.zzb;
        E e2 = eArr[i];
        eArr[i] = e;
        this.modCount++;
        return e2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzfyv
    public final /* bridge */ /* synthetic */ zzfyv zze(int i) {
        if (i < this.zzc) {
            throw new IllegalArgumentException();
        }
        return new zzgad(Arrays.copyOf(this.zzb, i), this.zzc);
    }

    private zzgad(E[] eArr, int i) {
        this.zzb = eArr;
        this.zzc = i;
    }

    @Override // com.google.android.gms.internal.ads.zzfwu, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(E e) {
        zzbU();
        int i = this.zzc;
        E[] eArr = this.zzb;
        if (i == eArr.length) {
            this.zzb = (E[]) Arrays.copyOf(eArr, ((i * 3) / 2) + 1);
        }
        E[] eArr2 = this.zzb;
        int i2 = this.zzc;
        this.zzc = i2 + 1;
        eArr2[i2] = e;
        this.modCount++;
        return true;
    }
}
