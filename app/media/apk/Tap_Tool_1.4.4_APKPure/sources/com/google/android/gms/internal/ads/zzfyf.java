package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
final class zzfyf extends zzfwu<Float> implements RandomAccess, zzfyv, zzgab {
    private static final zzfyf zza;
    private float[] zzb;
    private int zzc;

    static {
        zzfyf zzfyfVar = new zzfyf(new float[0], 0);
        zza = zzfyfVar;
        zzfyfVar.zzb();
    }

    zzfyf() {
        this(new float[10], 0);
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
    public final /* bridge */ /* synthetic */ void add(int i, Object obj) {
        int i2;
        float floatValue = ((Float) obj).floatValue();
        zzbU();
        if (i < 0 || i > (i2 = this.zzc)) {
            throw new IndexOutOfBoundsException(zzg(i));
        }
        float[] fArr = this.zzb;
        if (i2 < fArr.length) {
            System.arraycopy(fArr, i, fArr, i + 1, i2 - i);
        } else {
            float[] fArr2 = new float[((i2 * 3) / 2) + 1];
            System.arraycopy(fArr, 0, fArr2, 0, i);
            System.arraycopy(this.zzb, i, fArr2, i + 1, this.zzc - i);
            this.zzb = fArr2;
        }
        this.zzb[i] = floatValue;
        this.zzc++;
        this.modCount++;
    }

    @Override // com.google.android.gms.internal.ads.zzfwu, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends Float> collection) {
        zzbU();
        zzfyw.zza(collection);
        if (!(collection instanceof zzfyf)) {
            return super.addAll(collection);
        }
        zzfyf zzfyfVar = (zzfyf) collection;
        int i = zzfyfVar.zzc;
        if (i == 0) {
            return false;
        }
        int i2 = this.zzc;
        if (Integer.MAX_VALUE - i2 >= i) {
            int i3 = i2 + i;
            float[] fArr = this.zzb;
            if (i3 > fArr.length) {
                this.zzb = Arrays.copyOf(fArr, i3);
            }
            System.arraycopy(zzfyfVar.zzb, 0, this.zzb, this.zzc, zzfyfVar.zzc);
            this.zzc = i3;
            this.modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // com.google.android.gms.internal.ads.zzfwu, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzfyf)) {
            return super.equals(obj);
        }
        zzfyf zzfyfVar = (zzfyf) obj;
        if (this.zzc != zzfyfVar.zzc) {
            return false;
        }
        float[] fArr = zzfyfVar.zzb;
        for (int i = 0; i < this.zzc; i++) {
            if (Float.floatToIntBits(this.zzb[i]) != Float.floatToIntBits(fArr[i])) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i) {
        zzf(i);
        return Float.valueOf(this.zzb[i]);
    }

    @Override // com.google.android.gms.internal.ads.zzfwu, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.zzc; i2++) {
            i = (i * 31) + Float.floatToIntBits(this.zzb[i2]);
        }
        return i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (obj instanceof Float) {
            float floatValue = ((Float) obj).floatValue();
            int i = this.zzc;
            for (int i2 = 0; i2 < i; i2++) {
                if (this.zzb[i2] == floatValue) {
                    return i2;
                }
            }
            return -1;
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.zzfwu, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i) {
        int i2;
        zzbU();
        zzf(i);
        float[] fArr = this.zzb;
        float f = fArr[i];
        if (i < this.zzc - 1) {
            System.arraycopy(fArr, i + 1, fArr, i, (i2 - i) - 1);
        }
        this.zzc--;
        this.modCount++;
        return Float.valueOf(f);
    }

    @Override // java.util.AbstractList
    protected final void removeRange(int i, int i2) {
        zzbU();
        if (i2 >= i) {
            float[] fArr = this.zzb;
            System.arraycopy(fArr, i2, fArr, i, this.zzc - i2);
            this.zzc -= i2 - i;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    @Override // com.google.android.gms.internal.ads.zzfwu, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        float floatValue = ((Float) obj).floatValue();
        zzbU();
        zzf(i);
        float[] fArr = this.zzb;
        float f = fArr[i];
        fArr[i] = floatValue;
        return Float.valueOf(f);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzc;
    }

    public final void zzd(float f) {
        zzbU();
        int i = this.zzc;
        float[] fArr = this.zzb;
        if (i == fArr.length) {
            float[] fArr2 = new float[((i * 3) / 2) + 1];
            System.arraycopy(fArr, 0, fArr2, 0, i);
            this.zzb = fArr2;
        }
        float[] fArr3 = this.zzb;
        int i2 = this.zzc;
        this.zzc = i2 + 1;
        fArr3[i2] = f;
    }

    @Override // com.google.android.gms.internal.ads.zzfyv
    public final /* bridge */ /* synthetic */ zzfyv zze(int i) {
        if (i >= this.zzc) {
            return new zzfyf(Arrays.copyOf(this.zzb, i), this.zzc);
        }
        throw new IllegalArgumentException();
    }

    private zzfyf(float[] fArr, int i) {
        this.zzb = fArr;
        this.zzc = i;
    }

    @Override // com.google.android.gms.internal.ads.zzfwu, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        zzd(((Float) obj).floatValue());
        return true;
    }
}
