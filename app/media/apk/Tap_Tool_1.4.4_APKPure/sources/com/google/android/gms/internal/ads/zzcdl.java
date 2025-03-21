package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicInteger;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
@Deprecated
/* loaded from: classes.dex */
public class zzcdl<T> {
    private final zzcde<T> zza;
    private final AtomicInteger zzb;

    public zzcdl() {
        zzcde<T> zzcdeVar = new zzcde<>();
        this.zza = zzcdeVar;
        this.zzb = new AtomicInteger(0);
        zzfks.zzp(zzcdeVar, new zzcdj(this), zzccz.zzf);
    }

    @Deprecated
    public final void zze(zzcdi<T> zzcdiVar, zzcdg zzcdgVar) {
        zzfks.zzp(this.zza, new zzcdk(this, zzcdiVar, zzcdgVar), zzccz.zzf);
    }

    @Deprecated
    public final void zzf(T t) {
        this.zza.zzc(t);
    }

    @Deprecated
    public final void zzg() {
        this.zza.zzd(new Exception());
    }

    @Deprecated
    public final int zzh() {
        return this.zzb.get();
    }
}
