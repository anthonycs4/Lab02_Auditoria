package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzexn implements zzgdq<zzexl> {
    private final zzgeb<zzflb> zza;
    private final zzgeb<ScheduledExecutorService> zzb;
    private final zzgeb<zzexk> zzc;

    public zzexn(zzgeb<zzflb> zzgebVar, zzgeb<ScheduledExecutorService> zzgebVar2, zzgeb<zzexk> zzgebVar3) {
        this.zza = zzgebVar;
        this.zzb = zzgebVar2;
        this.zzc = zzgebVar3;
    }

    @Override // com.google.android.gms.internal.ads.zzgeb
    public final /* bridge */ /* synthetic */ Object zzb() {
        zzflb zzflbVar = zzccz.zza;
        zzgdw.zzb(zzflbVar);
        return new zzexl(zzflbVar, this.zzb.zzb(), ((zzexo) this.zzc).zzb());
    }
}
