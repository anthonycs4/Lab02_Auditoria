package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.view.ViewGroup;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzebh extends zzebg<zzcqo> {
    private final zzcjz zza;
    private final zzcvs zzb;
    private final zzedp zzc;
    private final zzdbh zzd;
    private final zzdfi zze;
    private final zzcyt zzf;
    private final ViewGroup zzg;

    public zzebh(zzcjz zzcjzVar, zzcvs zzcvsVar, zzedp zzedpVar, zzdbh zzdbhVar, zzdfi zzdfiVar, zzcyt zzcytVar, ViewGroup viewGroup) {
        this.zza = zzcjzVar;
        this.zzb = zzcvsVar;
        this.zzc = zzedpVar;
        this.zzd = zzdbhVar;
        this.zze = zzdfiVar;
        this.zzf = zzcytVar;
        this.zzg = viewGroup;
    }

    @Override // com.google.android.gms.internal.ads.zzebg
    protected final zzfla<zzcqo> zzc(zzetk zzetkVar, Bundle bundle) {
        zzcrk zzk = this.zza.zzk();
        zzcvs zzcvsVar = this.zzb;
        zzcvsVar.zzb(zzetkVar);
        zzcvsVar.zzc(bundle);
        zzk.zzj(zzcvsVar.zzd());
        zzk.zzk(this.zzd);
        zzk.zze(this.zzc);
        zzk.zzb(this.zze);
        zzk.zzd(new zzcsh(this.zzf));
        zzk.zzc(new zzcql(this.zzg));
        zzctq<zzcqo> zzb = zzk.zza().zzb();
        return zzb.zzc(zzb.zzb());
    }
}
