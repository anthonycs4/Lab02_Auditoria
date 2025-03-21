package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzcvq;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzepz<RequestComponentT extends zzcvq<AdT>, AdT> implements zzeqj<RequestComponentT, AdT> {
    private RequestComponentT zza;

    @Override // com.google.android.gms.internal.ads.zzeqj
    /* renamed from: zza */
    public final synchronized RequestComponentT zzc() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzeqj
    public final synchronized zzfla<AdT> zzb(zzeqk zzeqkVar, zzeqi<RequestComponentT> zzeqiVar) {
        zzctq<AdT> zzc;
        RequestComponentT zzf = zzeqiVar.zza(zzeqkVar.zzb).zzf();
        this.zza = zzf;
        zzc = zzf.zzc();
        return zzc.zzc(zzc.zzb());
    }
}
