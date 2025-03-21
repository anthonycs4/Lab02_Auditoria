package com.google.android.gms.internal.ads;

import android.os.Bundle;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzebe extends zzebg<zzcsu> {
    private final zzcjz zza;
    private final zzdfi zzb;
    private final zzcvs zzc;
    private final zzdbh zzd;

    public zzebe(zzcjz zzcjzVar, zzdfi zzdfiVar, zzcvs zzcvsVar, zzdbh zzdbhVar) {
        this.zza = zzcjzVar;
        this.zzb = zzdfiVar;
        this.zzc = zzcvsVar;
        this.zzd = zzdbhVar;
    }

    @Override // com.google.android.gms.internal.ads.zzebg
    protected final zzfla<zzcsu> zzc(zzetk zzetkVar, Bundle bundle) {
        zzdfm zzr = this.zza.zzr();
        zzcvs zzcvsVar = this.zzc;
        zzcvsVar.zzb(zzetkVar);
        zzcvsVar.zzc(bundle);
        zzr.zzd(zzcvsVar.zzd());
        zzr.zze(this.zzd);
        zzr.zzc(this.zzb);
        zzr.zzb(new zzcql(null));
        zzctq<zzcsu> zza = zzr.zza().zza();
        return zza.zzc(zza.zzb());
    }
}
