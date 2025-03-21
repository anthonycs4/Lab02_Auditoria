package com.google.android.gms.internal.ads;

import android.content.Context;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzegq implements zzgdq<zzego> {
    private final zzgeb<zzehz<zzeli>> zza;
    private final zzgeb<zzetk> zzb;
    private final zzgeb<Context> zzc;
    private final zzgeb<zzcby> zzd;

    public zzegq(zzgeb<zzehz<zzeli>> zzgebVar, zzgeb<zzetk> zzgebVar2, zzgeb<Context> zzgebVar3, zzgeb<zzcby> zzgebVar4) {
        this.zza = zzgebVar;
        this.zzb = zzgebVar2;
        this.zzc = zzgebVar3;
        this.zzd = zzgebVar4;
    }

    @Override // com.google.android.gms.internal.ads.zzgeb
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzego(this.zza.zzb(), ((zzcvy) this.zzb).zza(), ((zzeuo) this.zzc).zza(), this.zzd.zzb());
    }
}
