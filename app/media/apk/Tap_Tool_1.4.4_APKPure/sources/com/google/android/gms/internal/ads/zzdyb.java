package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzdyb<DelegateT, AdapterT> implements zzdya<AdapterT> {
    public final zzdya<DelegateT> zza;
    private final zzfei<DelegateT, AdapterT> zzb;

    public zzdyb(zzdya<DelegateT> zzdyaVar, zzfei<DelegateT, AdapterT> zzfeiVar) {
        this.zza = zzdyaVar;
        this.zzb = zzfeiVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdya
    public final boolean zza(zzete zzeteVar, zzess zzessVar) {
        return this.zza.zza(zzeteVar, zzessVar);
    }

    @Override // com.google.android.gms.internal.ads.zzdya
    public final zzfla<AdapterT> zzb(zzete zzeteVar, zzess zzessVar) {
        return zzfks.zzj(this.zza.zzb(zzeteVar, zzessVar), this.zzb, zzccz.zza);
    }
}
