package com.google.android.gms.internal.ads;

import java.util.Set;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzcyo implements zzgdq<zzcyn> {
    private final zzgeb<Set<zzdcx<zzcyp>>> zza;
    private final zzgeb<zzess> zzb;

    public zzcyo(zzgeb<Set<zzdcx<zzcyp>>> zzgebVar, zzgeb<zzess> zzgebVar2) {
        this.zza = zzgebVar;
        this.zzb = zzgebVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzgeb
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzcyn(((zzgdz) this.zza).zzb(), ((zzctd) this.zzb).zza());
    }
}
