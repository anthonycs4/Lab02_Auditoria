package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;
import java.util.concurrent.Executor;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzcoy implements zzgdq<zzcox> {
    private final zzgeb<zzbqn> zza;
    private final zzgeb<zzcot> zzb;
    private final zzgeb<Executor> zzc;
    private final zzgeb<zzcos> zzd;
    private final zzgeb<Clock> zze;

    public zzcoy(zzgeb<zzbqn> zzgebVar, zzgeb<zzcot> zzgebVar2, zzgeb<Executor> zzgebVar3, zzgeb<zzcos> zzgebVar4, zzgeb<Clock> zzgebVar5) {
        this.zza = zzgebVar;
        this.zzb = zzgebVar2;
        this.zzc = zzgebVar3;
        this.zzd = zzgebVar4;
        this.zze = zzgebVar5;
    }

    @Override // com.google.android.gms.internal.ads.zzgeb
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzcox(this.zza.zzb(), this.zzb.zzb(), this.zzc.zzb(), this.zzd.zzb(), this.zze.zzb());
    }
}
