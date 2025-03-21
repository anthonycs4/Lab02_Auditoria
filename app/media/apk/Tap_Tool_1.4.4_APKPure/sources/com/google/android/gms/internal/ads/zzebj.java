package com.google.android.gms.internal.ads;

import android.os.Bundle;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzebj extends zzebg<zzddu> {
    private final zzcjz zza;
    private final zzcvs zzb;
    private final zzedp zzc;
    private final zzdbh zzd;

    public zzebj(zzcjz zzcjzVar, zzcvs zzcvsVar, zzedp zzedpVar, zzdbh zzdbhVar) {
        this.zza = zzcjzVar;
        this.zzb = zzcvsVar;
        this.zzc = zzedpVar;
        this.zzd = zzdbhVar;
    }

    @Override // com.google.android.gms.internal.ads.zzebg
    protected final zzfla<zzddu> zzc(zzetk zzetkVar, Bundle bundle) {
        zzdeq zzp = this.zza.zzp();
        zzcvs zzcvsVar = this.zzb;
        zzcvsVar.zzb(zzetkVar);
        zzcvsVar.zzc(bundle);
        zzp.zzc(zzcvsVar.zzd());
        zzp.zzd(this.zzd);
        zzp.zzb(this.zzc);
        zzctq<zzddu> zzb = zzp.zza().zzb();
        return zzb.zzc(zzb.zzb());
    }
}
