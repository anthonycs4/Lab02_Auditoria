package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzdjz implements zzgdq<zzdjy> {
    private final zzgeb<Context> zza;
    private final zzgeb<zzdjh> zzb;
    private final zzgeb<zzfb> zzc;
    private final zzgeb<zzcct> zzd;
    private final zzgeb<com.google.android.gms.ads.internal.zza> zze;
    private final zzgeb<zzavg> zzf;
    private final zzgeb<Executor> zzg;
    private final zzgeb<zzetk> zzh;
    private final zzgeb<zzdkq> zzi;
    private final zzgeb<zzdmy> zzj;
    private final zzgeb<ScheduledExecutorService> zzk;

    public zzdjz(zzgeb<Context> zzgebVar, zzgeb<zzdjh> zzgebVar2, zzgeb<zzfb> zzgebVar3, zzgeb<zzcct> zzgebVar4, zzgeb<com.google.android.gms.ads.internal.zza> zzgebVar5, zzgeb<zzavg> zzgebVar6, zzgeb<Executor> zzgebVar7, zzgeb<zzetk> zzgebVar8, zzgeb<zzdkq> zzgebVar9, zzgeb<zzdmy> zzgebVar10, zzgeb<ScheduledExecutorService> zzgebVar11) {
        this.zza = zzgebVar;
        this.zzb = zzgebVar2;
        this.zzc = zzgebVar3;
        this.zzd = zzgebVar4;
        this.zze = zzgebVar5;
        this.zzf = zzgebVar6;
        this.zzg = zzgebVar7;
        this.zzh = zzgebVar8;
        this.zzi = zzgebVar9;
        this.zzj = zzgebVar10;
        this.zzk = zzgebVar11;
    }

    @Override // com.google.android.gms.internal.ads.zzgeb
    /* renamed from: zza */
    public final zzdjy zzb() {
        zzflb zzflbVar = zzccz.zza;
        zzgdw.zzb(zzflbVar);
        return new zzdjy(this.zza.zzb(), this.zzb.zzb(), this.zzc.zzb(), ((zzckn) this.zzd).zza(), zzcmm.zza(), this.zzf.zzb(), zzflbVar, ((zzcvy) this.zzh).zza(), this.zzi.zzb(), this.zzj.zzb(), this.zzk.zzb());
    }
}
