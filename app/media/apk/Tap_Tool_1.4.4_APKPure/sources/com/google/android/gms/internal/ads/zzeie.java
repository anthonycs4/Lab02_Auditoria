package com.google.android.gms.internal.ads;

import androidx.work.WorkRequest;
import com.google.android.gms.common.util.Clock;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzeie implements zzgdq<zzehz<zzeht>> {
    private final zzgeb<zzehs> zza;
    private final zzgeb<Clock> zzb;

    public zzeie(zzgeb<zzehs> zzgebVar, zzgeb<Clock> zzgebVar2) {
        this.zza = zzgebVar;
        this.zzb = zzgebVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzgeb
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzehz(((zzehu) this.zza).zzb(), WorkRequest.MIN_BACKOFF_MILLIS, this.zzb.zzb());
    }
}
