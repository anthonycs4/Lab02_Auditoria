package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzdei implements zzgdq<zzdcx<zzcwh>> {
    private final zzddy zza;
    private final zzgeb<zzdfe> zzb;
    private final zzgeb<Executor> zzc;

    public zzdei(zzddy zzddyVar, zzgeb<zzdfe> zzgebVar, zzgeb<Executor> zzgebVar2) {
        this.zza = zzddyVar;
        this.zzb = zzgebVar;
        this.zzc = zzgebVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzgeb
    public final /* bridge */ /* synthetic */ Object zzb() {
        zzflb zzflbVar = zzccz.zza;
        zzgdw.zzb(zzflbVar);
        return new zzdcx(this.zzb.zzb(), zzflbVar);
    }
}
