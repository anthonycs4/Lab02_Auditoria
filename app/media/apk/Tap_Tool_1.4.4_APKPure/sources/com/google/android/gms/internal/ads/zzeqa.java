package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzcvq;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzeqa<RequestComponentT extends zzcvq<AdT>, AdT> implements zzeqj<RequestComponentT, AdT> {
    private final zzeqj<RequestComponentT, AdT> zza;
    private RequestComponentT zzb;

    public zzeqa(zzeqj<RequestComponentT, AdT> zzeqjVar) {
        this.zza = zzeqjVar;
    }

    @Override // com.google.android.gms.internal.ads.zzeqj
    /* renamed from: zza */
    public final synchronized RequestComponentT zzc() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzeqj
    public final synchronized zzfla<AdT> zzb(zzeqk zzeqkVar, zzeqi<RequestComponentT> zzeqiVar) {
        if (zzeqkVar.zza != null) {
            RequestComponentT zzf = zzeqiVar.zza(zzeqkVar.zzb).zzf();
            this.zzb = zzf;
            zzctq<AdT> zzc = zzf.zzc();
            return zzc.zzc(zzc.zza(zzfks.zza(zzeqkVar.zza)));
        }
        zzfla<AdT> zzb = this.zza.zzb(zzeqkVar, zzeqiVar);
        this.zzb = (RequestComponentT) ((zzepz) this.zza).zzc();
        return zzb;
    }
}
