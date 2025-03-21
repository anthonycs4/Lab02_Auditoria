package com.google.android.gms.internal.ads;

import java.util.Objects;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzgdp<T> implements zzgeb, zzgdk {
    private static final Object zza = new Object();
    private volatile zzgeb<T> zzb;
    private volatile Object zzc = zza;

    private zzgdp(zzgeb<T> zzgebVar) {
        this.zzb = zzgebVar;
    }

    public static <P extends zzgeb<T>, T> zzgdk<T> zzc(P p) {
        if (p instanceof zzgdk) {
            return (zzgdk) p;
        }
        Objects.requireNonNull(p);
        return new zzgdp(p);
    }

    @Override // com.google.android.gms.internal.ads.zzgeb
    public final T zzb() {
        T t = (T) this.zzc;
        Object obj = zza;
        if (t == obj) {
            synchronized (this) {
                t = this.zzc;
                if (t == obj) {
                    t = this.zzb.zzb();
                    Object obj2 = this.zzc;
                    if (obj2 != obj && !(obj2 instanceof zzgdv) && obj2 != t) {
                        String valueOf = String.valueOf(obj2);
                        String valueOf2 = String.valueOf(t);
                        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 118 + String.valueOf(valueOf2).length());
                        sb.append("Scoped provider was invoked recursively returning different results: ");
                        sb.append(valueOf);
                        sb.append(" & ");
                        sb.append(valueOf2);
                        sb.append(". This is likely due to a circular dependency.");
                        throw new IllegalStateException(sb.toString());
                    }
                    this.zzc = t;
                    this.zzb = null;
                }
            }
        }
        return t;
    }

    public static <P extends zzgeb<T>, T> zzgeb<T> zza(P p) {
        Objects.requireNonNull(p);
        return p instanceof zzgdp ? p : new zzgdp(p);
    }
}
