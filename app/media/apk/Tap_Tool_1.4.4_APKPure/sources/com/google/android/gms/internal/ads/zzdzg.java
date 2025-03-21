package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzdzg implements zzgdq<zzdzf> {
    private final zzgeb<Context> zza;
    private final zzgeb<zzcrl> zzb;
    private final zzgeb<Executor> zzc;

    public zzdzg(zzgeb<Context> zzgebVar, zzgeb<zzcrl> zzgebVar2, zzgeb<Executor> zzgebVar3) {
        this.zza = zzgebVar;
        this.zzb = zzgebVar2;
        this.zzc = zzgebVar3;
    }

    @Override // com.google.android.gms.internal.ads.zzgeb
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzdzf(this.zza.zzb(), this.zzb.zzb(), this.zzc.zzb());
    }
}
