package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzelu implements zzgdq<zzels> {
    private final zzgeb<zzcbr> zza;
    private final zzgeb<Context> zzb;
    private final zzgeb<ScheduledExecutorService> zzc;
    private final zzgeb<Executor> zzd;
    private final zzgeb<Integer> zze;

    public zzelu(zzgeb<zzcbr> zzgebVar, zzgeb<Context> zzgebVar2, zzgeb<ScheduledExecutorService> zzgebVar3, zzgeb<Executor> zzgebVar4, zzgeb<Integer> zzgebVar5) {
        this.zza = zzgebVar;
        this.zzb = zzgebVar2;
        this.zzc = zzgebVar3;
        this.zzd = zzgebVar4;
        this.zze = zzgebVar5;
    }

    @Override // com.google.android.gms.internal.ads.zzgeb
    public final /* bridge */ /* synthetic */ Object zzb() {
        zzflb zzflbVar = zzccz.zza;
        zzgdw.zzb(zzflbVar);
        return new zzels(new zzcbr(), ((zzcke) this.zzb).zza(), this.zzc.zzb(), zzflbVar, ((zzene) this.zze).zzb().intValue(), null);
    }
}
