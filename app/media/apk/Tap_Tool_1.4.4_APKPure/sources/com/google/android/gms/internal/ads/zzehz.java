package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;
import com.google.android.gms.internal.ads.zzelc;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzehz<S extends zzelc> implements zzeld<S> {
    private final AtomicReference<zzehy<S>> zza = new AtomicReference<>();
    private final Clock zzb;
    private final zzeld<S> zzc;
    private final long zzd;

    public zzehz(zzeld<S> zzeldVar, long j, Clock clock) {
        this.zzb = clock;
        this.zzc = zzeldVar;
        this.zzd = j;
    }

    @Override // com.google.android.gms.internal.ads.zzeld
    public final zzfla<S> zza() {
        zzehy<S> zzehyVar = this.zza.get();
        if (zzehyVar == null || zzehyVar.zza()) {
            zzehyVar = new zzehy<>(this.zzc.zza(), this.zzd, this.zzb);
            this.zza.set(zzehyVar);
        }
        return zzehyVar.zza;
    }
}
