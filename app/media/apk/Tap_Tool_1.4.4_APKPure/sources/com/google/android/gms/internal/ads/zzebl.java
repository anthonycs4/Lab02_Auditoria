package com.google.android.gms.internal.ads;

import android.os.Bundle;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzebl extends zzebg<zzdmb> {
    private final zzcjz zza;
    private final zzcvs zzb;
    private final zzdbh zzc;

    public zzebl(zzcjz zzcjzVar, zzcvs zzcvsVar, zzdbh zzdbhVar) {
        this.zza = zzcjzVar;
        this.zzb = zzcvsVar;
        this.zzc = zzdbhVar;
    }

    @Override // com.google.android.gms.internal.ads.zzebg
    protected final zzfla<zzdmb> zzc(zzetk zzetkVar, Bundle bundle) {
        zzdmf zzs = this.zza.zzs();
        zzcvs zzcvsVar = this.zzb;
        zzcvsVar.zzb(zzetkVar);
        zzcvsVar.zzc(bundle);
        zzs.zzb(zzcvsVar.zzd());
        zzs.zzc(this.zzc);
        zzctq<zzdmb> zzc = zzs.zza().zzc();
        return zzc.zzc(zzc.zzb());
    }
}
