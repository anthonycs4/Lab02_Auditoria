package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzdtt implements zzgdq<zzdts> {
    private final zzgeb<zzetk> zza;
    private final zzgeb<zzdst> zzb;
    private final zzgeb<zzflb> zzc;
    private final zzgeb<ScheduledExecutorService> zzd;
    private final zzgeb<zzdws> zze;

    public zzdtt(zzgeb<zzetk> zzgebVar, zzgeb<zzdst> zzgebVar2, zzgeb<zzflb> zzgebVar3, zzgeb<ScheduledExecutorService> zzgebVar4, zzgeb<zzdws> zzgebVar5) {
        this.zza = zzgebVar;
        this.zzb = zzgebVar2;
        this.zzc = zzgebVar3;
        this.zzd = zzgebVar4;
        this.zze = zzgebVar5;
    }

    @Override // com.google.android.gms.internal.ads.zzgeb
    public final /* bridge */ /* synthetic */ Object zzb() {
        zzetk zza = ((zzcvy) this.zza).zza();
        zzdst zzb = ((zzdsu) this.zzb).zzb();
        zzflb zzflbVar = zzccz.zza;
        zzgdw.zzb(zzflbVar);
        return new zzdts(zza, zzb, zzflbVar, this.zzd.zzb(), this.zze.zzb());
    }
}
