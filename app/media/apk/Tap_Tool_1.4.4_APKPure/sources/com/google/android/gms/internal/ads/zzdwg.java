package com.google.android.gms.internal.ads;

import java.util.Set;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzdwg implements zzgdq<zzdwf> {
    private final zzgeb<Set<zzdwe>> zza;
    private final zzgeb<zzexu> zzb;

    public zzdwg(zzgeb<Set<zzdwe>> zzgebVar, zzgeb<zzexu> zzgebVar2) {
        this.zza = zzgebVar;
        this.zzb = zzgebVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzgeb
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzdwf(((zzgdz) this.zza).zzb(), this.zzb.zzb());
    }
}
