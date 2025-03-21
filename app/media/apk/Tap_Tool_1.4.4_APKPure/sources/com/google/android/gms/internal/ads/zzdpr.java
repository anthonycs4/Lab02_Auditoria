package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;
import java.util.Set;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzdpr implements zzgdq<zzdpq> {
    private final zzgeb<zzdpj> zza;
    private final zzgeb<Set<zzdpp>> zzb;
    private final zzgeb<Clock> zzc;

    public zzdpr(zzgeb<zzdpj> zzgebVar, zzgeb<Set<zzdpp>> zzgebVar2, zzgeb<Clock> zzgebVar3) {
        this.zza = zzgebVar;
        this.zzb = zzgebVar2;
        this.zzc = zzgebVar3;
    }

    @Override // com.google.android.gms.internal.ads.zzgeb
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzdpq(this.zza.zzb(), ((zzgdz) this.zzb).zzb(), this.zzc.zzb());
    }
}
