package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import java.util.concurrent.Executor;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzcqs implements zzgdq<zzcqr> {
    private final zzgeb<zzcsm> zza;
    private final zzgeb<Context> zzb;
    private final zzgeb<zzest> zzc;
    private final zzgeb<View> zzd;
    private final zzgeb<zzcib> zze;
    private final zzgeb<zzcsl> zzf;
    private final zzgeb<zzdhk> zzg;
    private final zzgeb<zzddc> zzh;
    private final zzgeb<zzeeh> zzi;
    private final zzgeb<Executor> zzj;

    public zzcqs(zzgeb<zzcsm> zzgebVar, zzgeb<Context> zzgebVar2, zzgeb<zzest> zzgebVar3, zzgeb<View> zzgebVar4, zzgeb<zzcib> zzgebVar5, zzgeb<zzcsl> zzgebVar6, zzgeb<zzdhk> zzgebVar7, zzgeb<zzddc> zzgebVar8, zzgeb<zzeeh> zzgebVar9, zzgeb<Executor> zzgebVar10) {
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

    public static zzcqr zzc(zzcsm zzcsmVar, Context context, zzest zzestVar, View view, zzcib zzcibVar, zzcsl zzcslVar, zzdhk zzdhkVar, zzddc zzddcVar, zzgdk<zzeeh> zzgdkVar, Executor executor) {
        return new zzcqr(zzcsmVar, context, zzestVar, view, zzcibVar, zzcslVar, zzdhkVar, zzddcVar, zzgdkVar, executor);
    }

    @Override // com.google.android.gms.internal.ads.zzgeb
    /* renamed from: zza */
    public final zzcqr zzb() {
        return new zzcqr(((zzcuh) this.zza).zzb(), this.zzb.zzb(), ((zzcqy) this.zzc).zza(), ((zzcqx) this.zzd).zza(), ((zzcrj) this.zze).zza(), ((zzcqz) this.zzf).zza(), ((zzdfl) this.zzg).zza(), this.zzh.zzb(), zzgdp.zzc(this.zzi), this.zzj.zzb());
    }
}
