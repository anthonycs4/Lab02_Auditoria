package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzdhz implements zzgdq<zzdhy> {
    private final zzgeb<com.google.android.gms.ads.internal.util.zzg> zza;
    private final zzgeb<zzetk> zzb;
    private final zzgeb<zzdhe> zzc;
    private final zzgeb<zzdgz> zzd;
    private final zzgeb<zzdij> zze;
    private final zzgeb<zzdir> zzf;
    private final zzgeb<Executor> zzg;
    private final zzgeb<Executor> zzh;
    private final zzgeb<zzdgw> zzi;

    public zzdhz(zzgeb<com.google.android.gms.ads.internal.util.zzg> zzgebVar, zzgeb<zzetk> zzgebVar2, zzgeb<zzdhe> zzgebVar3, zzgeb<zzdgz> zzgebVar4, zzgeb<zzdij> zzgebVar5, zzgeb<zzdir> zzgebVar6, zzgeb<Executor> zzgebVar7, zzgeb<Executor> zzgebVar8, zzgeb<zzdgw> zzgebVar9) {
        this.zza = zzgebVar;
        this.zzb = zzgebVar2;
        this.zzc = zzgebVar3;
        this.zzd = zzgebVar4;
        this.zze = zzgebVar5;
        this.zzf = zzgebVar6;
        this.zzg = zzgebVar7;
        this.zzh = zzgebVar8;
        this.zzi = zzgebVar9;
    }

    @Override // com.google.android.gms.internal.ads.zzgeb
    /* renamed from: zza */
    public final zzdhy zzb() {
        zzflb zzflbVar = zzccz.zza;
        zzgdw.zzb(zzflbVar);
        return new zzdhy(((zzeun) this.zza).zzb(), ((zzcvy) this.zzb).zza(), this.zzc.zzb(), ((zzdhr) this.zzd).zza(), this.zze.zzb(), this.zzf.zzb(), this.zzg.zzb(), zzflbVar, this.zzi.zzb());
    }
}
