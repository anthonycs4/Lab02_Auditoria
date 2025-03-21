package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzdpd implements zzgdq<zzdcx<zzcyy>> {
    private final zzgeb<zzdpb> zza;
    private final zzgeb<Executor> zzb;
    private final zzgeb<zzdvy> zzc;

    public zzdpd(zzgeb<zzdpb> zzgebVar, zzgeb<Executor> zzgebVar2, zzgeb<zzdvy> zzgebVar3) {
        this.zza = zzgebVar;
        this.zzb = zzgebVar2;
        this.zzc = zzgebVar3;
    }

    @Override // com.google.android.gms.internal.ads.zzgeb
    public final /* bridge */ /* synthetic */ Object zzb() {
        zzdpb zzb = this.zza.zzb();
        zzflb zzflbVar = zzccz.zza;
        zzgdw.zzb(zzflbVar);
        zzdvy zzb2 = this.zzc.zzb();
        if (((Boolean) zzbba.zzc().zzb(zzbfq.zzfN)).booleanValue()) {
            return new zzdcx(zzb2, zzflbVar);
        }
        return new zzdcx(zzb, zzflbVar);
    }
}
