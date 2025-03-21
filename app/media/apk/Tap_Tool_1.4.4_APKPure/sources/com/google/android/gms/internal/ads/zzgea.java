package com.google.android.gms.internal.ads;

import java.util.Objects;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzgea<T> implements zzgeb<T> {
    private static final Object zza = new Object();
    private volatile zzgeb<T> zzb;
    private volatile Object zzc = zza;

    private zzgea(zzgeb<T> zzgebVar) {
        this.zzb = zzgebVar;
    }

    public static <P extends zzgeb<T>, T> zzgeb<T> zza(P p) {
        if ((p instanceof zzgea) || (p instanceof zzgdp)) {
            return p;
        }
        Objects.requireNonNull(p);
        return new zzgea(p);
    }

    @Override // com.google.android.gms.internal.ads.zzgeb
    public final T zzb() {
        T t = (T) this.zzc;
        if (t == zza) {
            zzgeb<T> zzgebVar = this.zzb;
            if (zzgebVar == null) {
                return (T) this.zzc;
            }
            T zzb = zzgebVar.zzb();
            this.zzc = zzb;
            this.zzb = null;
            return zzb;
        }
        return t;
    }
}
