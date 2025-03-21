package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzdzv implements zzgdq<zzdzu> {
    private final zzgeb<zzcrl> zza;
    private final zzgeb<zzdzb> zzb;
    private final zzgeb<zzcwj> zzc;
    private final zzgeb<ScheduledExecutorService> zzd;
    private final zzgeb<zzflb> zze;

    public zzdzv(zzgeb<zzcrl> zzgebVar, zzgeb<zzdzb> zzgebVar2, zzgeb<zzcwj> zzgebVar3, zzgeb<ScheduledExecutorService> zzgebVar4, zzgeb<zzflb> zzgebVar5) {
        this.zza = zzgebVar;
        this.zzb = zzgebVar2;
        this.zzc = zzgebVar3;
        this.zzd = zzgebVar4;
        this.zze = zzgebVar5;
    }

    @Override // com.google.android.gms.internal.ads.zzgeb
    /* renamed from: zza */
    public final zzdzu zzb() {
        zzflb zzflbVar = zzccz.zza;
        zzgdw.zzb(zzflbVar);
        return new zzdzu(this.zza.zzb(), ((zzdzc) this.zzb).zzb(), this.zzc.zzb(), this.zzd.zzb(), zzflbVar);
    }
}
