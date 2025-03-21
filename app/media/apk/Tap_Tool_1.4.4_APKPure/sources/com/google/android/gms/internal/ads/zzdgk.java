package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.common.util.Clock;
import java.util.concurrent.Executor;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzdgk implements zzgdq<zzcph> {
    private final zzgeb<zzase> zza;
    private final zzgeb<Executor> zzb;
    private final zzgeb<Context> zzc;
    private final zzgeb<Clock> zzd;

    public zzdgk(zzgeb<zzase> zzgebVar, zzgeb<Executor> zzgebVar2, zzgeb<Context> zzgebVar3, zzgeb<Clock> zzgebVar4) {
        this.zza = zzgebVar;
        this.zzb = zzgebVar2;
        this.zzc = zzgebVar3;
        this.zzd = zzgebVar4;
    }

    @Override // com.google.android.gms.internal.ads.zzgeb
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzcph(this.zzb.zzb(), new zzcot(this.zzc.zzb(), this.zza.zzb()), this.zzd.zzb());
    }
}
