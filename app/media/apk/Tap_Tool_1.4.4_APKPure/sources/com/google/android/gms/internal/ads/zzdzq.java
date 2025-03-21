package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzdzq implements zzgdq<zzdzp> {
    private final zzgeb<Context> zza;
    private final zzgeb<Executor> zzb;
    private final zzgeb<zzder> zzc;
    private final zzgeb<zzesr> zzd;

    public zzdzq(zzgeb<Context> zzgebVar, zzgeb<Executor> zzgebVar2, zzgeb<zzder> zzgebVar3, zzgeb<zzesr> zzgebVar4) {
        this.zza = zzgebVar;
        this.zzb = zzgebVar2;
        this.zzc = zzgebVar3;
        this.zzd = zzgebVar4;
    }

    @Override // com.google.android.gms.internal.ads.zzgeb
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzdzp(this.zza.zzb(), this.zzb.zzb(), this.zzc.zzb(), this.zzd.zzb());
    }
}
