package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzeqy implements zzgdq<zzeqx> {
    private final zzgeb<Context> zza;
    private final zzgeb<Executor> zzb;
    private final zzgeb<zzcjz> zzc;
    private final zzgeb<zzefe> zzd;
    private final zzgeb<zzerw> zze;
    private final zzgeb<zzetj> zzf;

    public zzeqy(zzgeb<Context> zzgebVar, zzgeb<Executor> zzgebVar2, zzgeb<zzcjz> zzgebVar3, zzgeb<zzefe> zzgebVar4, zzgeb<zzerw> zzgebVar5, zzgeb<zzetj> zzgebVar6) {
        this.zza = zzgebVar;
        this.zzb = zzgebVar2;
        this.zzc = zzgebVar3;
        this.zzd = zzgebVar4;
        this.zze = zzgebVar5;
        this.zzf = zzgebVar6;
    }

    @Override // com.google.android.gms.internal.ads.zzgeb
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzeqx(this.zza.zzb(), this.zzb.zzb(), this.zzc.zzb(), this.zzd.zzb(), this.zze.zzb(), new zzetj());
    }
}
