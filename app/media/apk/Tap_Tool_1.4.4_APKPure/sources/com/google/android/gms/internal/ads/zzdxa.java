package com.google.android.gms.internal.ads;

import android.content.Context;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzdxa implements zzgdq<zzdwz> {
    private final zzgeb<Context> zza;
    private final zzgeb<zzcvn> zzb;
    private final zzgeb<zzdws> zzc;
    private final zzgeb<zzdwo> zzd;
    private final zzgeb<com.google.android.gms.ads.internal.util.zzg> zze;

    public zzdxa(zzgeb<Context> zzgebVar, zzgeb<zzcvn> zzgebVar2, zzgeb<zzdws> zzgebVar3, zzgeb<zzdwo> zzgebVar4, zzgeb<com.google.android.gms.ads.internal.util.zzg> zzgebVar5) {
        this.zza = zzgebVar;
        this.zzb = zzgebVar2;
        this.zzc = zzgebVar3;
        this.zzd = zzgebVar4;
        this.zze = zzgebVar5;
    }

    @Override // com.google.android.gms.internal.ads.zzgeb
    /* renamed from: zza */
    public final zzdwz zzb() {
        return new zzdwz(((zzeuo) this.zza).zza(), ((zzcvo) this.zzb).zzb(), this.zzc.zzb(), ((zzdwp) this.zzd).zzb(), ((zzeun) this.zze).zzb());
    }
}
