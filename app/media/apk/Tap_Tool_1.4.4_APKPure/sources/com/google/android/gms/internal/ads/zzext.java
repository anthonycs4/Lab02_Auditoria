package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzext implements zzgdq<zzexs> {
    private final zzgeb<Executor> zza;
    private final zzgeb<zzccs> zzb;

    public zzext(zzgeb<Executor> zzgebVar, zzgeb<zzccs> zzgebVar2) {
        this.zza = zzgebVar;
        this.zzb = zzgebVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzgeb
    public final /* bridge */ /* synthetic */ Object zzb() {
        zzflb zzflbVar = zzccz.zza;
        zzgdw.zzb(zzflbVar);
        return new zzexs(zzflbVar, this.zzb.zzb());
    }
}
