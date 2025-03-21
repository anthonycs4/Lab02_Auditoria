package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzegg implements zzeld<zzegh> {
    private final Clock zza;
    private final zzetk zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzegg(Clock clock, zzetk zzetkVar) {
        this.zza = clock;
        this.zzb = zzetkVar;
    }

    @Override // com.google.android.gms.internal.ads.zzeld
    public final zzfla<zzegh> zza() {
        return zzfks.zza(new zzegh(this.zzb, this.zza.currentTimeMillis()));
    }
}
