package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzelc;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzejw<S extends zzelc> implements zzeld<S> {
    private final zzeld<S> zza;
    private final long zzb;
    private final ScheduledExecutorService zzc;

    public zzejw(zzeld<S> zzeldVar, long j, ScheduledExecutorService scheduledExecutorService) {
        this.zza = zzeldVar;
        this.zzb = j;
        this.zzc = scheduledExecutorService;
    }

    @Override // com.google.android.gms.internal.ads.zzeld
    public final zzfla<S> zza() {
        zzfla<S> zza = this.zza.zza();
        long j = this.zzb;
        if (j > 0) {
            zza = zzfks.zzh(zza, j, TimeUnit.MILLISECONDS, this.zzc);
        }
        return zzfks.zzg(zza, Throwable.class, zzejv.zza, zzccz.zzf);
    }
}
