package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzeig implements zzgdq<zzesr> {
    private final zzgeb<Clock> zza;

    public zzeig(zzgeb<Clock> zzgebVar) {
        this.zza = zzgebVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgeb
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzesr(this.zza.zzb());
    }
}
