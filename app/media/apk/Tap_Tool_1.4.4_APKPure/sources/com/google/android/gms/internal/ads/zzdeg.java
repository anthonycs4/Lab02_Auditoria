package com.google.android.gms.internal.ads;

import java.util.Set;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzdeg implements zzgdq<Set<zzdcx<zzcwh>>> {
    private final zzddy zza;
    private final zzgeb<zzcvh> zzb;

    public zzdeg(zzddy zzddyVar, zzgeb<zzcvh> zzgebVar) {
        this.zza = zzddyVar;
        this.zzb = zzgebVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgeb
    public final /* bridge */ /* synthetic */ Object zzb() {
        Set<zzdcx<zzcwh>> zze = this.zza.zze(this.zzb.zzb());
        zzgdw.zzb(zze);
        return zze;
    }
}
