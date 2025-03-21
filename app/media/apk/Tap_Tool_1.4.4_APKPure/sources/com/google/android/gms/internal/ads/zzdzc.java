package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzdzc implements zzgdq<zzdzb> {
    private final zzgeb<zzcrl> zza;
    private final zzgeb<Context> zzb;
    private final zzgeb<Executor> zzc;
    private final zzgeb<zzdmy> zzd;
    private final zzgeb<zzetk> zze;
    private final zzgeb<zzfei<zzess, com.google.android.gms.ads.internal.util.zzau>> zzf;

    public zzdzc(zzgeb<zzcrl> zzgebVar, zzgeb<Context> zzgebVar2, zzgeb<Executor> zzgebVar3, zzgeb<zzdmy> zzgebVar4, zzgeb<zzetk> zzgebVar5, zzgeb<zzfei<zzess, com.google.android.gms.ads.internal.util.zzau>> zzgebVar6) {
        this.zza = zzgebVar;
        this.zzb = zzgebVar2;
        this.zzc = zzgebVar3;
        this.zzd = zzgebVar4;
        this.zze = zzgebVar5;
        this.zzf = zzgebVar6;
    }

    @Override // com.google.android.gms.internal.ads.zzgeb
    /* renamed from: zza */
    public final zzdzb zzb() {
        return new zzdzb(this.zza.zzb(), this.zzb.zzb(), this.zzc.zzb(), this.zzd.zzb(), ((zzcvy) this.zze).zza(), this.zzf.zzb());
    }
}
