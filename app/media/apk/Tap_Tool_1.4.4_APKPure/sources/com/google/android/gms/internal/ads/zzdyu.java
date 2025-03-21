package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzdyu implements zzgdq<zzdyt> {
    private final zzgeb<zzcpr> zza;
    private final zzgeb<Context> zzb;
    private final zzgeb<Executor> zzc;
    private final zzgeb<zzdmy> zzd;

    public zzdyu(zzgeb<zzcpr> zzgebVar, zzgeb<Context> zzgebVar2, zzgeb<Executor> zzgebVar3, zzgeb<zzdmy> zzgebVar4) {
        this.zza = zzgebVar;
        this.zzb = zzgebVar2;
        this.zzc = zzgebVar3;
        this.zzd = zzgebVar4;
    }

    @Override // com.google.android.gms.internal.ads.zzgeb
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzdyt(this.zza.zzb(), this.zzb.zzb(), this.zzc.zzb(), this.zzd.zzb());
    }
}
