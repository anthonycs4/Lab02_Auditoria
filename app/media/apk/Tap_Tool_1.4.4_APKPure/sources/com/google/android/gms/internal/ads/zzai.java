package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzai<T> {
    public final T zza;
    public final zzl zzb;
    public final zzal zzc;
    public boolean zzd;

    private zzai(zzal zzalVar) {
        this.zzd = false;
        this.zza = null;
        this.zzb = null;
        this.zzc = zzalVar;
    }

    private zzai(T t, zzl zzlVar) {
        this.zzd = false;
        this.zza = t;
        this.zzb = zzlVar;
        this.zzc = null;
    }

    public static <T> zzai<T> zza(T t, zzl zzlVar) {
        return new zzai<>(t, zzlVar);
    }

    public static <T> zzai<T> zzb(zzal zzalVar) {
        return new zzai<>(zzalVar);
    }

    public final boolean zzc() {
        return this.zzc == null;
    }
}
