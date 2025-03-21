package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;
import java.util.concurrent.Executor;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzdji implements zzgdq<zzdjh> {
    private final zzgeb<com.google.android.gms.ads.internal.util.zzbp> zza;
    private final zzgeb<Clock> zzb;
    private final zzgeb<Executor> zzc;

    public zzdji(zzgeb<com.google.android.gms.ads.internal.util.zzbp> zzgebVar, zzgeb<Clock> zzgebVar2, zzgeb<Executor> zzgebVar3) {
        this.zza = zzgebVar;
        this.zzb = zzgebVar2;
        this.zzc = zzgebVar3;
    }

    @Override // com.google.android.gms.internal.ads.zzgeb
    public final /* bridge */ /* synthetic */ Object zzb() {
        zzflb zzflbVar = zzccz.zza;
        zzgdw.zzb(zzflbVar);
        return new zzdjh(this.zza.zzb(), this.zzb.zzb(), zzflbVar);
    }
}
