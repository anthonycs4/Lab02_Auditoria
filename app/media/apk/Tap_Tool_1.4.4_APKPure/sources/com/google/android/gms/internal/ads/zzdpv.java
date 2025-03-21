package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzdpv implements zzgdq<zzdps> {
    private final zzgeb<Executor> zza;
    private final zzgeb<zzccs> zzb;
    private final zzgeb<zzeyd> zzc;
    private final zzgeb<zzeyf> zzd;

    public zzdpv(zzgeb<Executor> zzgebVar, zzgeb<zzccs> zzgebVar2, zzgeb<zzeyd> zzgebVar3, zzgeb<zzeyf> zzgebVar4) {
        this.zza = zzgebVar;
        this.zzb = zzgebVar2;
        this.zzc = zzgebVar3;
        this.zzd = zzgebVar4;
    }

    @Override // com.google.android.gms.internal.ads.zzgeb
    public final /* bridge */ /* synthetic */ Object zzb() {
        zzflb zzflbVar = zzccz.zza;
        zzgdw.zzb(zzflbVar);
        return new zzdps(zzflbVar, this.zzb.zzb(), ((zzeye) this.zzc).zzb(), new zzeyf());
    }
}
