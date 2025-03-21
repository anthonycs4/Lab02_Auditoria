package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.Set;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzdda implements zzgdq<zzdcz> {
    private final zzgeb<Context> zza;
    private final zzgeb<Set<zzdcx<zzasi>>> zzb;
    private final zzgeb<zzess> zzc;

    public zzdda(zzgeb<Context> zzgebVar, zzgeb<Set<zzdcx<zzasi>>> zzgebVar2, zzgeb<zzess> zzgebVar3) {
        this.zza = zzgebVar;
        this.zzb = zzgebVar2;
        this.zzc = zzgebVar3;
    }

    @Override // com.google.android.gms.internal.ads.zzgeb
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzdcz(this.zza.zzb(), ((zzgdz) this.zzb).zzb(), ((zzctd) this.zzc).zza());
    }
}
