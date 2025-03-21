package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzepf implements zzgdq<zzepe> {
    private final zzgeb<Context> zza;
    private final zzgeb<Executor> zzb;
    private final zzgeb<zzazx> zzc;
    private final zzgeb<zzcjz> zzd;
    private final zzgeb<zzefe> zze;
    private final zzgeb<zzefi> zzf;
    private final zzgeb<zzetj> zzg;

    public zzepf(zzgeb<Context> zzgebVar, zzgeb<Executor> zzgebVar2, zzgeb<zzazx> zzgebVar3, zzgeb<zzcjz> zzgebVar4, zzgeb<zzefe> zzgebVar5, zzgeb<zzefi> zzgebVar6, zzgeb<zzetj> zzgebVar7) {
        this.zza = zzgebVar;
        this.zzb = zzgebVar2;
        this.zzc = zzgebVar3;
        this.zzd = zzgebVar4;
        this.zze = zzgebVar5;
        this.zzf = zzgebVar6;
        this.zzg = zzgebVar7;
    }

    @Override // com.google.android.gms.internal.ads.zzgeb
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzepe(this.zza.zzb(), this.zzb.zzb(), this.zzc.zzb(), this.zzd.zzb(), this.zze.zzb(), this.zzf.zzb(), new zzetj());
    }
}
