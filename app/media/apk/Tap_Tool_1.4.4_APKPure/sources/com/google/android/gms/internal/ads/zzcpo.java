package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Set;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzcpo implements zzgdq<Set<zzdcx<zzasi>>> {
    private final zzcpl zza;
    private final zzgeb<zzcsf> zzb;

    public zzcpo(zzcpl zzcplVar, zzgeb<zzcsf> zzgebVar) {
        this.zza = zzcplVar;
        this.zzb = zzgebVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgeb
    public final /* bridge */ /* synthetic */ Object zzb() {
        Set singleton = Collections.singleton(new zzdcx(this.zzb.zzb(), zzccz.zzf));
        zzgdw.zzb(singleton);
        return singleton;
    }
}
