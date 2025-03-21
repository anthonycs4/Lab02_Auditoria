package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzfhc<K, V> {
    Object[] zza;
    int zzb;

    public zzfhc() {
        this(4);
    }

    private final void zzd(int i) {
        int i2 = i + i;
        Object[] objArr = this.zza;
        int length = objArr.length;
        if (i2 > length) {
            this.zza = Arrays.copyOf(objArr, zzfgt.zzd(length, i2));
        }
    }

    public final zzfhc<K, V> zza(K k, V v) {
        zzd(this.zzb + 1);
        zzfga.zza(k, v);
        Object[] objArr = this.zza;
        int i = this.zzb;
        int i2 = i + i;
        objArr[i2] = k;
        objArr[i2 + 1] = v;
        this.zzb = i + 1;
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final zzfhc<K, V> zzb(Iterable<? extends Map.Entry<? extends K, ? extends V>> iterable) {
        if (iterable instanceof Collection) {
            zzd(this.zzb + iterable.size());
        }
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            zza(entry.getKey(), entry.getValue());
        }
        return this;
    }

    public final zzfhd<K, V> zzc() {
        return zzfir.zzj(this.zzb, this.zza);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzfhc(int i) {
        this.zza = new Object[i + i];
        this.zzb = 0;
    }
}
