package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzcvi implements zzgdq<zzcvh> {
    private final zzgeb<zzcwx> zza;
    private final zzgeb<zzess> zzb;
    private final zzgeb<ScheduledExecutorService> zzc;
    private final zzgeb<Executor> zzd;

    public zzcvi(zzgeb<zzcwx> zzgebVar, zzgeb<zzess> zzgebVar2, zzgeb<ScheduledExecutorService> zzgebVar3, zzgeb<Executor> zzgebVar4) {
        this.zza = zzgebVar;
        this.zzb = zzgebVar2;
        this.zzc = zzgebVar3;
        this.zzd = zzgebVar4;
    }

    @Override // com.google.android.gms.internal.ads.zzgeb
    public final /* bridge */ /* synthetic */ Object zzb() {
        zzflb zzflbVar = zzccz.zza;
        zzgdw.zzb(zzflbVar);
        return new zzcvh(this.zza.zzb(), ((zzctd) this.zzb).zza(), this.zzc.zzb(), zzflbVar);
    }
}
