package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzdlv implements zzgdq<zzdlr> {
    private final zzgeb<Context> zza;
    private final zzgeb<Executor> zzb;
    private final zzgeb<zzfb> zzc;
    private final zzgeb<zzcct> zzd;
    private final zzgeb<com.google.android.gms.ads.internal.zza> zze;
    private final zzgeb<zzcin> zzf;
    private final zzgeb<zzdxo> zzg;
    private final zzgeb<zzeyn> zzh;
    private final zzgeb<zzdpn> zzi;
    private final zzgeb<zzexv> zzj;

    public zzdlv(zzgeb<Context> zzgebVar, zzgeb<Executor> zzgebVar2, zzgeb<zzfb> zzgebVar3, zzgeb<zzcct> zzgebVar4, zzgeb<com.google.android.gms.ads.internal.zza> zzgebVar5, zzgeb<zzcin> zzgebVar6, zzgeb<zzdxo> zzgebVar7, zzgeb<zzeyn> zzgebVar8, zzgeb<zzdpn> zzgebVar9, zzgeb<zzexv> zzgebVar10) {
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
    }

    @Override // com.google.android.gms.internal.ads.zzgeb
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzdlr(((zzcke) this.zza).zza(), this.zzb.zzb(), this.zzc.zzb(), ((zzckn) this.zzd).zza(), zzcmm.zza(), new zzcin(), this.zzg.zzb(), this.zzh.zzb(), this.zzi.zzb(), this.zzj.zzb());
    }
}
