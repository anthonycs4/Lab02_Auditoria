package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzcxp;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzedc<AdT, AdapterT, ListenerT extends zzcxp> implements zzgdq<zzedb<AdT, AdapterT, ListenerT>> {
    private final zzgeb<zzexl> zza;
    private final zzgeb<zzflb> zzb;
    private final zzgeb<zzdyc<AdapterT, ListenerT>> zzc;
    private final zzgeb<zzdyi<AdT, AdapterT, ListenerT>> zzd;

    public zzedc(zzgeb<zzexl> zzgebVar, zzgeb<zzflb> zzgebVar2, zzgeb<zzdyc<AdapterT, ListenerT>> zzgebVar3, zzgeb<zzdyi<AdT, AdapterT, ListenerT>> zzgebVar4) {
        this.zza = zzgebVar;
        this.zzb = zzgebVar2;
        this.zzc = zzgebVar3;
        this.zzd = zzgebVar4;
    }

    @Override // com.google.android.gms.internal.ads.zzgeb
    /* renamed from: zza */
    public final zzedb<AdT, AdapterT, ListenerT> zzb() {
        return new zzedb<>(this.zza.zzb(), this.zzb.zzb(), this.zzc.zzb(), this.zzd.zzb());
    }
}
