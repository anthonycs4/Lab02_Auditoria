package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzegi implements zzgdq<zzegg> {
    private final zzgeb<Clock> zza;
    private final zzgeb<zzetk> zzb;

    public zzegi(zzgeb<Clock> zzgebVar, zzgeb<zzetk> zzgebVar2) {
        this.zza = zzgebVar;
        this.zzb = zzgebVar2;
    }

    public static zzegg zza(Clock clock, zzetk zzetkVar) {
        return new zzegg(clock, zzetkVar);
    }

    @Override // com.google.android.gms.internal.ads.zzgeb
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzegg(this.zza.zzb(), ((zzcvy) this.zzb).zza());
    }
}
