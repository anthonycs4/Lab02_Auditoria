package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Set;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzddz implements zzgdq<Set<zzdcx<zzcwv>>> {
    private final zzddy zza;
    private final zzgeb<zzcvh> zzb;

    public zzddz(zzddy zzddyVar, zzgeb<zzcvh> zzgebVar) {
        this.zza = zzddyVar;
        this.zzb = zzgebVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgeb
    public final /* bridge */ /* synthetic */ Object zzb() {
        Set singleton = Collections.singleton(new zzdcx(this.zzb.zzb(), zzccz.zzf));
        zzgdw.zzb(singleton);
        return singleton;
    }
}
