package com.google.android.gms.internal.ads;

import androidx.constraintlayout.core.widgets.analyzer.BasicMeasure;
import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzfgj<K, V> extends AbstractMap<K, V> implements Serializable {
    private static final Object zzd = new Object();
    @NullableDecl
    transient int[] zza;
    @NullableDecl
    transient Object[] zzb;
    @NullableDecl
    transient Object[] zzc;
    @NullableDecl
    private transient Object zze;
    private transient int zzf;
    private transient int zzg;
    @NullableDecl
    private transient Set<K> zzh;
    @NullableDecl
    private transient Set<Map.Entry<K, V>> zzi;
    @NullableDecl
    private transient Collection<V> zzj;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzfgj() {
        zza(3);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ int zzn(zzfgj zzfgjVar) {
        int i = zzfgjVar.zzg;
        zzfgjVar.zzg = i - 1;
        return i;
    }

    private final void zzo(int i) {
        this.zzf = ((32 - Integer.numberOfLeadingZeros(i)) & 31) | (this.zzf & (-32));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int zzp() {
        return (1 << (this.zzf & 31)) - 1;
    }

    private final int zzq(int i, int i2, int i3, int i4) {
        Object zza = zzfgk.zza(i2);
        int i5 = i2 - 1;
        if (i4 != 0) {
            zzfgk.zzc(zza, i3 & i5, i4 + 1);
        }
        Object obj = this.zze;
        int[] iArr = this.zza;
        for (int i6 = 0; i6 <= i; i6++) {
            int zzb = zzfgk.zzb(obj, i6);
            while (zzb != 0) {
                int i7 = zzb - 1;
                int i8 = iArr[i7];
                int i9 = ((~i) & i8) | i6;
                int i10 = i9 & i5;
                int zzb2 = zzfgk.zzb(zza, i10);
                zzfgk.zzc(zza, i10, zzb);
                iArr[i7] = ((~i5) & i9) | (zzb2 & i5);
                zzb = i8 & i;
            }
        }
        this.zze = zza;
        zzo(i5);
        return i5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int zzr(@NullableDecl Object obj) {
        if (zzb()) {
            return -1;
        }
        int zzb = zzfgr.zzb(obj);
        int zzp = zzp();
        int zzb2 = zzfgk.zzb(this.zze, zzb & zzp);
        if (zzb2 != 0) {
            int i = ~zzp;
            int i2 = zzb & i;
            do {
                int i3 = zzb2 - 1;
                int i4 = this.zza[i3];
                if ((i4 & i) == i2 && zzfeo.zza(obj, this.zzb[i3])) {
                    return i3;
                }
                zzb2 = i4 & zzp;
            } while (zzb2 != 0);
            return -1;
        }
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @NullableDecl
    public final Object zzs(@NullableDecl Object obj) {
        if (zzb()) {
            return zzd;
        }
        int zzp = zzp();
        int zze = zzfgk.zze(obj, null, zzp, this.zze, this.zza, this.zzb, null);
        if (zze == -1) {
            return zzd;
        }
        Object obj2 = this.zzc[zze];
        zze(zze, zzp);
        this.zzg--;
        zzd();
        return obj2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        if (zzb()) {
            return;
        }
        zzd();
        Map<K, V> zzc = zzc();
        if (zzc != null) {
            this.zzf = zzfjg.zza(size(), 3, 1073741823);
            zzc.clear();
            this.zze = null;
            this.zzg = 0;
            return;
        }
        Arrays.fill(this.zzb, 0, this.zzg, (Object) null);
        Arrays.fill(this.zzc, 0, this.zzg, (Object) null);
        Object obj = this.zze;
        if (obj instanceof byte[]) {
            Arrays.fill((byte[]) obj, (byte) 0);
        } else if (obj instanceof short[]) {
            Arrays.fill((short[]) obj, (short) 0);
        } else {
            Arrays.fill((int[]) obj, 0);
        }
        Arrays.fill(this.zza, 0, this.zzg, 0);
        this.zzg = 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(@NullableDecl Object obj) {
        Map<K, V> zzc = zzc();
        if (zzc != null) {
            return zzc.containsKey(obj);
        }
        return zzr(obj) != -1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsValue(@NullableDecl Object obj) {
        Map<K, V> zzc = zzc();
        if (zzc == null) {
            for (int i = 0; i < this.zzg; i++) {
                if (zzfeo.zza(obj, this.zzc[i])) {
                    return true;
                }
            }
            return false;
        }
        return zzc.containsValue(obj);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set<Map.Entry<K, V>> entrySet() {
        Set<Map.Entry<K, V>> set = this.zzi;
        if (set == null) {
            zzfge zzfgeVar = new zzfge(this);
            this.zzi = zzfgeVar;
            return zzfgeVar;
        }
        return set;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final V get(@NullableDecl Object obj) {
        Map<K, V> zzc = zzc();
        if (zzc != null) {
            return zzc.get(obj);
        }
        int zzr = zzr(obj);
        if (zzr == -1) {
            return null;
        }
        return (V) this.zzc[zzr];
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set<K> keySet() {
        Set<K> set = this.zzh;
        if (set == null) {
            zzfgg zzfggVar = new zzfgg(this);
            this.zzh = zzfggVar;
            return zzfggVar;
        }
        return set;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    @NullableDecl
    public final V put(@NullableDecl K k, @NullableDecl V v) {
        int min;
        if (zzb()) {
            zzfes.zzb(zzb(), "Arrays already allocated");
            int i = this.zzf;
            int max = Math.max(i + 1, 2);
            int highestOneBit = Integer.highestOneBit(max);
            if (max > highestOneBit && (highestOneBit = highestOneBit + highestOneBit) <= 0) {
                highestOneBit = BasicMeasure.EXACTLY;
            }
            int max2 = Math.max(4, highestOneBit);
            this.zze = zzfgk.zza(max2);
            zzo(max2 - 1);
            this.zza = new int[i];
            this.zzb = new Object[i];
            this.zzc = new Object[i];
        }
        Map<K, V> zzc = zzc();
        if (zzc != null) {
            return zzc.put(k, v);
        }
        int[] iArr = this.zza;
        Object[] objArr = this.zzb;
        Object[] objArr2 = this.zzc;
        int i2 = this.zzg;
        int i3 = i2 + 1;
        int zzb = zzfgr.zzb(k);
        int zzp = zzp();
        int i4 = zzb & zzp;
        int zzb2 = zzfgk.zzb(this.zze, i4);
        if (zzb2 != 0) {
            int i5 = ~zzp;
            int i6 = zzb & i5;
            int i7 = 0;
            while (true) {
                int i8 = zzb2 - 1;
                int i9 = iArr[i8];
                int i10 = i9 & i5;
                if (i10 == i6 && zzfeo.zza(k, objArr[i8])) {
                    V v2 = (V) objArr2[i8];
                    objArr2[i8] = v;
                    return v2;
                }
                int i11 = i9 & zzp;
                i7++;
                if (i11 != 0) {
                    zzb2 = i11;
                } else if (i7 >= 9) {
                    LinkedHashMap linkedHashMap = new LinkedHashMap(zzp() + 1, 1.0f);
                    int zzf = zzf();
                    while (zzf >= 0) {
                        linkedHashMap.put(this.zzb[zzf], this.zzc[zzf]);
                        zzf = zzg(zzf);
                    }
                    this.zze = linkedHashMap;
                    this.zza = null;
                    this.zzb = null;
                    this.zzc = null;
                    zzd();
                    return (V) linkedHashMap.put(k, v);
                } else if (i3 > zzp) {
                    zzp = zzq(zzp, zzfgk.zzd(zzp), zzb, i2);
                } else {
                    iArr[i8] = (i3 & zzp) | i10;
                }
            }
        } else if (i3 > zzp) {
            zzp = zzq(zzp, zzfgk.zzd(zzp), zzb, i2);
        } else {
            zzfgk.zzc(this.zze, i4, i3);
        }
        int length = this.zza.length;
        if (i3 > length && (min = Math.min(1073741823, (Math.max(1, length >>> 1) + length) | 1)) != length) {
            this.zza = Arrays.copyOf(this.zza, min);
            this.zzb = Arrays.copyOf(this.zzb, min);
            this.zzc = Arrays.copyOf(this.zzc, min);
        }
        this.zza[i2] = (~zzp) & zzb;
        this.zzb[i2] = k;
        this.zzc[i2] = v;
        this.zzg = i3;
        zzd();
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    @NullableDecl
    public final V remove(@NullableDecl Object obj) {
        Map<K, V> zzc = zzc();
        if (zzc != null) {
            return zzc.remove(obj);
        }
        V v = (V) zzs(obj);
        if (v == zzd) {
            return null;
        }
        return v;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        Map<K, V> zzc = zzc();
        return zzc != null ? zzc.size() : this.zzg;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Collection<V> values() {
        Collection<V> collection = this.zzj;
        if (collection == null) {
            zzfgi zzfgiVar = new zzfgi(this);
            this.zzj = zzfgiVar;
            return zzfgiVar;
        }
        return collection;
    }

    final void zza(int i) {
        this.zzf = zzfjg.zza(i, 1, 1073741823);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean zzb() {
        return this.zze == null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @NullableDecl
    public final Map<K, V> zzc() {
        Object obj = this.zze;
        if (obj instanceof Map) {
            return (Map) obj;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzd() {
        this.zzf += 32;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zze(int i, int i2) {
        int size = size() - 1;
        if (i < size) {
            Object[] objArr = this.zzb;
            Object obj = objArr[size];
            objArr[i] = obj;
            Object[] objArr2 = this.zzc;
            objArr2[i] = objArr2[size];
            objArr[size] = null;
            objArr2[size] = null;
            int[] iArr = this.zza;
            iArr[i] = iArr[size];
            iArr[size] = 0;
            int zzb = zzfgr.zzb(obj) & i2;
            int zzb2 = zzfgk.zzb(this.zze, zzb);
            int i3 = size + 1;
            if (zzb2 == i3) {
                zzfgk.zzc(this.zze, zzb, i + 1);
                return;
            }
            while (true) {
                int i4 = zzb2 - 1;
                int[] iArr2 = this.zza;
                int i5 = iArr2[i4];
                int i6 = i5 & i2;
                if (i6 == i3) {
                    iArr2[i4] = ((i + 1) & i2) | ((~i2) & i5);
                    return;
                }
                zzb2 = i6;
            }
        } else {
            this.zzb[i] = null;
            this.zzc[i] = null;
            this.zza[i] = 0;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int zzf() {
        return isEmpty() ? -1 : 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int zzg(int i) {
        int i2 = i + 1;
        if (i2 < this.zzg) {
            return i2;
        }
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzfgj(int i) {
        zza(8);
    }
}
