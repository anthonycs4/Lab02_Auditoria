package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Objects;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
class zzfgs<E> extends zzfgt<E> {
    Object[] zza;
    int zzb = 0;
    boolean zzc;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzfgs(int i) {
        this.zza = new Object[i];
    }

    private final void zze(int i) {
        Object[] objArr = this.zza;
        int length = objArr.length;
        if (length < i) {
            this.zza = Arrays.copyOf(objArr, zzd(length, i));
            this.zzc = false;
        } else if (this.zzc) {
            this.zza = (Object[]) objArr.clone();
            this.zzc = false;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final zzfgt<E> zzb(Iterable<? extends E> iterable) {
        zze(this.zzb + iterable.size());
        if (!(iterable instanceof zzfgu)) {
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                zzc(it.next());
            }
            return this;
        }
        this.zzb = ((zzfgu) iterable).zzg(this.zza, this.zzb);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfgt
    public /* bridge */ /* synthetic */ zzfgt zzc(Object obj) {
        throw null;
    }

    public final zzfgs<E> zza(E e) {
        Objects.requireNonNull(e);
        zze(this.zzb + 1);
        Object[] objArr = this.zza;
        int i = this.zzb;
        this.zzb = i + 1;
        objArr[i] = e;
        return this;
    }
}
