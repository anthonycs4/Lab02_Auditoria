package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzehj implements zzgdq<zzehi> {
    private final zzgeb<Executor> zza;
    private final zzgeb<zzcby> zzb;

    public zzehj(zzgeb<Executor> zzgebVar, zzgeb<zzcby> zzgebVar2) {
        this.zza = zzgebVar;
        this.zzb = zzgebVar2;
    }

    public static zzehi zza(Executor executor, zzcby zzcbyVar) {
        return new zzehi(executor, zzcbyVar);
    }

    @Override // com.google.android.gms.internal.ads.zzgeb
    public final /* bridge */ /* synthetic */ Object zzb() {
        zzflb zzflbVar = zzccz.zza;
        zzgdw.zzb(zzflbVar);
        return new zzehi(zzflbVar, this.zzb.zzb());
    }
}
