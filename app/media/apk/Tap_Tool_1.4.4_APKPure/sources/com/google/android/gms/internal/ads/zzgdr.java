package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzgdr<T> implements zzgdq, zzgdk {
    private static final zzgdr<Object> zza = new zzgdr<>(null);
    private final T zzb;

    private zzgdr(T t) {
        this.zzb = t;
    }

    public static <T> zzgdq<T> zza(T t) {
        zzgdw.zza(t, "instance cannot be null");
        return new zzgdr(t);
    }

    public static <T> zzgdq<T> zzc(T t) {
        return t == null ? zza : new zzgdr(t);
    }

    @Override // com.google.android.gms.internal.ads.zzgeb
    public final T zzb() {
        return this.zzb;
    }
}
