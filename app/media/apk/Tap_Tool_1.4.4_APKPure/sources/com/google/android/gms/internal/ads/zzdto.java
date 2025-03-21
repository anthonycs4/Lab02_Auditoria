package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzdto implements zzgdq<zzdtn> {
    private final zzgeb<ScheduledExecutorService> zza;
    private final zzgeb<zzflb> zzb;
    private final zzgeb<zzdud> zzc;
    private final zzgeb<zzdvo> zzd;

    public zzdto(zzgeb<ScheduledExecutorService> zzgebVar, zzgeb<zzflb> zzgebVar2, zzgeb<zzdud> zzgebVar3, zzgeb<zzdvo> zzgebVar4) {
        this.zza = zzgebVar;
        this.zzb = zzgebVar2;
        this.zzc = zzgebVar3;
        this.zzd = zzgebVar4;
    }

    @Override // com.google.android.gms.internal.ads.zzgeb
    /* renamed from: zza */
    public final zzdtn zzb() {
        zzflb zzflbVar = zzccz.zza;
        zzgdw.zzb(zzflbVar);
        return new zzdtn(this.zza.zzb(), zzflbVar, ((zzdue) this.zzc).zzb(), zzgdp.zzc(this.zzd));
    }
}
