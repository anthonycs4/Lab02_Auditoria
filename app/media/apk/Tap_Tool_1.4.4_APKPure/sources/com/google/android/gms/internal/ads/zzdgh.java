package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.HashSet;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzdgh implements zzgdq<zzdcz> {
    private final zzgeb<Context> zza;
    private final zzgeb<zzess> zzb;

    public zzdgh(zzgeb<Context> zzgebVar, zzgeb<zzess> zzgebVar2) {
        this.zza = zzgebVar;
        this.zzb = zzgebVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzgeb
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzdcz(this.zza.zzb(), new HashSet(), ((zzctd) this.zzb).zza());
    }
}
