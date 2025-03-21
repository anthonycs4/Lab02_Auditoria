package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzdta implements zzgdq<zzdcx<zzcyy>> {
    private final zzgeb<zzdui> zza;
    private final zzgeb<Executor> zzb;

    public zzdta(zzgeb<zzdui> zzgebVar, zzgeb<Executor> zzgebVar2) {
        this.zza = zzgebVar;
        this.zzb = zzgebVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzgeb
    public final /* bridge */ /* synthetic */ Object zzb() {
        zzdui zzb = ((zzduj) this.zza).zzb();
        zzflb zzflbVar = zzccz.zza;
        zzgdw.zzb(zzflbVar);
        return new zzdcx(zzb, zzflbVar);
    }
}
