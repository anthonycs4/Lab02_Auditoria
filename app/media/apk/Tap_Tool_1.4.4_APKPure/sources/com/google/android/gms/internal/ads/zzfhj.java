package com.google.android.gms.internal.ads;

import androidx.constraintlayout.core.widgets.analyzer.BasicMeasure;
import java.util.Arrays;
import java.util.Set;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public abstract class zzfhj<E> extends zzfgu<E> implements Set<E> {
    @NullableDecl
    private transient zzfgz<E> zza;

    public static <E> zzfhj<E> zzh(E e) {
        return new zzfix(e);
    }

    @SafeVarargs
    public static <E> zzfhj<E> zzi(E e, E e2, E e3, E e4, E e5, E e6, E... eArr) {
        int length = eArr.length;
        int i = length + 6;
        Object[] objArr = new Object[i];
        objArr[0] = e;
        objArr[1] = e2;
        objArr[2] = e3;
        objArr[3] = e4;
        objArr[4] = e5;
        objArr[5] = e6;
        System.arraycopy(eArr, 0, objArr, 6, length);
        return zzp(i, objArr);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzj(int i) {
        int max = Math.max(i, 2);
        if (max < 751619276) {
            int highestOneBit = Integer.highestOneBit(max - 1);
            do {
                highestOneBit += highestOneBit;
            } while (highestOneBit * 0.7d < max);
            return highestOneBit;
        }
        zzfes.zza(max < 1073741824, "collection too large");
        return BasicMeasure.EXACTLY;
    }

    public static <E> zzfhi<E> zzm(int i) {
        return new zzfhi<>(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean zzq(int i, int i2) {
        return i < (i2 >> 1) + (i2 >> 2);
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(@NullableDecl Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof zzfhj) && zzk() && ((zzfhj) obj).zzk() && hashCode() != obj.hashCode()) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (obj instanceof Set) {
            Set set = (Set) obj;
            try {
                if (size() == set.size()) {
                    if (containsAll(set)) {
                        return true;
                    }
                }
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        return zzfiw.zza(this);
    }

    @Override // com.google.android.gms.internal.ads.zzfgu, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    /* renamed from: zza */
    public abstract zzfja<E> iterator();

    @Override // com.google.android.gms.internal.ads.zzfgu
    public zzfgz<E> zze() {
        zzfgz<E> zzfgzVar = this.zza;
        if (zzfgzVar == null) {
            zzfgz<E> zzl = zzl();
            this.zza = zzl;
            return zzl;
        }
        return zzfgzVar;
    }

    boolean zzk() {
        return false;
    }

    zzfgz<E> zzl() {
        return zzfgz.zzr(toArray());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <E> zzfhj<E> zzp(int i, Object... objArr) {
        if (i != 0) {
            if (i == 1) {
                return new zzfix(objArr[0]);
            }
            int zzj = zzj(i);
            Object[] objArr2 = new Object[zzj];
            int i2 = zzj - 1;
            int i3 = 0;
            int i4 = 0;
            for (int i5 = 0; i5 < i; i5++) {
                Object obj = objArr[i5];
                zzfik.zzb(obj, i5);
                int hashCode = obj.hashCode();
                int zza = zzfgr.zza(hashCode);
                while (true) {
                    int i6 = zza & i2;
                    Object obj2 = objArr2[i6];
                    if (obj2 != null) {
                        if (obj2.equals(obj)) {
                            break;
                        }
                        zza++;
                    } else {
                        objArr[i4] = obj;
                        objArr2[i6] = obj;
                        i3 += hashCode;
                        i4++;
                        break;
                    }
                }
            }
            Arrays.fill(objArr, i4, i, (Object) null);
            if (i4 == 1) {
                return new zzfix(objArr[0], i3);
            }
            if (zzj(i4) < zzj / 2) {
                return zzp(i4, objArr);
            }
            if (zzq(i4, objArr.length)) {
                objArr = Arrays.copyOf(objArr, i4);
            }
            return new zzfis(objArr, i3, objArr2, i2, i4);
        }
        return zzfis.zza;
    }
}
