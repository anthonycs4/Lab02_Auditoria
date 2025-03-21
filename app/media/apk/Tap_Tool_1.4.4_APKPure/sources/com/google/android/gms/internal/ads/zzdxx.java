package com.google.android.gms.internal.ads;

import android.content.Context;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzdxx implements zzgdq<zzdxw> {
    private final zzgeb<Context> zza;
    private final zzgeb<zzdxo> zzb;
    private final zzgeb<zzccs> zzc;
    private final zzgeb<zzdpn> zzd;
    private final zzgeb<zzexv> zze;

    public zzdxx(zzgeb<Context> zzgebVar, zzgeb<zzdxo> zzgebVar2, zzgeb<zzccs> zzgebVar3, zzgeb<zzdpn> zzgebVar4, zzgeb<zzexv> zzgebVar5) {
        this.zza = zzgebVar;
        this.zzb = zzgebVar2;
        this.zzc = zzgebVar3;
        this.zzd = zzgebVar4;
        this.zze = zzgebVar5;
    }

    @Override // com.google.android.gms.internal.ads.zzgeb
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzdxw(((zzcke) this.zza).zza(), this.zzb.zzb(), this.zzc.zzb(), this.zzd.zzb(), this.zze.zzb());
    }
}
