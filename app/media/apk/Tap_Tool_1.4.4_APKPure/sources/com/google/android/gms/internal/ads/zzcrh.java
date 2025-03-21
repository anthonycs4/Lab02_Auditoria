package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzcrh implements zzgdq<zzdcx<zzasi>> {
    private final zzcqv zza;
    private final zzgeb<zzcsj> zzb;
    private final zzgeb<Executor> zzc;

    public zzcrh(zzcqv zzcqvVar, zzgeb<zzcsj> zzgebVar, zzgeb<Executor> zzgebVar2) {
        this.zza = zzcqvVar;
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
