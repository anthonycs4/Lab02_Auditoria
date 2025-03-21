package com.google.android.gms.internal.ads;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
abstract class zzfgf<T> implements Iterator<T> {
    int zzb;
    int zzc;
    int zzd;
    final /* synthetic */ zzfgj zze;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzfgf(zzfgj zzfgjVar, zzfgb zzfgbVar) {
        int i;
        this.zze = zzfgjVar;
        i = zzfgjVar.zzf;
        this.zzb = i;
        this.zzc = zzfgjVar.zzf();
        this.zzd = -1;
    }

    private final void zzb() {
        int i;
        i = this.zze.zzf;
        if (i != this.zzb) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.zzc >= 0;
    }

    @Override // java.util.Iterator
    public final T next() {
        zzb();
        if (hasNext()) {
            int i = this.zzc;
            this.zzd = i;
            T zza = zza(i);
            this.zzc = this.zze.zzg(this.zzc);
            return zza;
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public final void remove() {
        zzb();
        zzfes.zzb(this.zzd >= 0, "no calls to next() since the last call to remove()");
        this.zzb += 32;
        zzfgj zzfgjVar = this.zze;
        zzfgjVar.remove(zzfgjVar.zzb[this.zzd]);
        this.zzc--;
        this.zzd = -1;
    }

    abstract T zza(int i);
}
