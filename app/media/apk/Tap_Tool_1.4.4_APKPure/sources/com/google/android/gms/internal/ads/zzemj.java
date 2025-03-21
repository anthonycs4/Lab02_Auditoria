package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzemj implements zzgdq<zzemh> {
    private final zzgeb<zzcbr> zza;
    private final zzgeb<Integer> zzb;
    private final zzgeb<Context> zzc;
    private final zzgeb<zzcby> zzd;
    private final zzgeb<ScheduledExecutorService> zze;
    private final zzgeb<Executor> zzf;

    public zzemj(zzgeb<zzcbr> zzgebVar, zzgeb<Integer> zzgebVar2, zzgeb<Context> zzgebVar3, zzgeb<zzcby> zzgebVar4, zzgeb<ScheduledExecutorService> zzgebVar5, zzgeb<Executor> zzgebVar6) {
        this.zza = zzgebVar;
        this.zzb = zzgebVar2;
        this.zzc = zzgebVar3;
        this.zzd = zzgebVar4;
        this.zze = zzgebVar5;
        this.zzf = zzgebVar6;
    }

    @Override // com.google.android.gms.internal.ads.zzgeb
    public final /* bridge */ /* synthetic */ Object zzb() {
        zzflb zzflbVar = zzccz.zza;
        zzgdw.zzb(zzflbVar);
        return new zzemh(new zzcbr(), ((zzene) this.zzb).zzb().intValue(), ((zzcke) this.zzc).zza(), this.zzd.zzb(), this.zze.zzb(), zzflbVar, null);
    }
}
