package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;
import java.util.concurrent.ScheduledExecutorService;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzcqn implements zzgdq<zzcyt> {
    private final zzgeb<ScheduledExecutorService> zza;
    private final zzgeb<Clock> zzb;

    public zzcqn(zzgeb<ScheduledExecutorService> zzgebVar, zzgeb<Clock> zzgebVar2) {
        this.zza = zzgebVar;
        this.zzb = zzgebVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzgeb
    /* renamed from: zza */
    public final zzcyt zzb() {
        return new zzcyt(this.zza.zzb(), this.zzb.zzb());
    }
}
