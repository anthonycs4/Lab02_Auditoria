package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;
import com.google.android.gms.internal.ads.zzelc;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
final class zzehy<S extends zzelc<?>> {
    public final zzfla<S> zza;
    private final long zzb;
    private final Clock zzc;

    public zzehy(zzfla<S> zzflaVar, long j, Clock clock) {
        this.zza = zzflaVar;
        this.zzc = clock;
        this.zzb = clock.elapsedRealtime() + j;
    }

    public final boolean zza() {
        return this.zzb < this.zzc.elapsedRealtime();
    }
}
