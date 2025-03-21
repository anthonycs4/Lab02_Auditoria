package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzebw implements zzgdq<zzebv> {
    private final zzgeb<Context> zza;
    private final zzgeb<Executor> zzb;
    private final zzgeb<zzdmg> zzc;

    public zzebw(zzgeb<Context> zzgebVar, zzgeb<Executor> zzgebVar2, zzgeb<zzdmg> zzgebVar3) {
        this.zza = zzgebVar;
        this.zzb = zzgebVar2;
        this.zzc = zzgebVar3;
    }

    @Override // com.google.android.gms.internal.ads.zzgeb
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzebv(this.zza.zzb(), this.zzb.zzb(), this.zzc.zzb());
    }
}
