package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Set;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzdej implements zzgdq<Set<zzdcx<zzdfc>>> {
    private final zzgeb<zzdfc> zza;

    public zzdej(zzgeb<zzdfc> zzgebVar) {
        this.zza = zzgebVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgeb
    public final /* bridge */ /* synthetic */ Object zzb() {
        Set singleton = Collections.singleton(new zzdcx(this.zza.zzb(), zzccz.zzf));
        zzgdw.zzb(singleton);
        return singleton;
    }
}
