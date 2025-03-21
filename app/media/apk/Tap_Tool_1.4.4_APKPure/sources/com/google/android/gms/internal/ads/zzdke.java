package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzdke implements zzgdq<zzdkd> {
    private final zzgeb<Executor> zza;
    private final zzgeb<zzdjy> zzb;

    public zzdke(zzgeb<Executor> zzgebVar, zzgeb<zzdjy> zzgebVar2) {
        this.zza = zzgebVar;
        this.zzb = zzgebVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzgeb
    /* renamed from: zza */
    public final zzdkd zzb() {
        zzflb zzflbVar = zzccz.zza;
        zzgdw.zzb(zzflbVar);
        return new zzdkd(zzflbVar, ((zzdjz) this.zzb).zzb());
    }
}
