package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzdff implements zzgdq<zzdfe> {
    private final zzgeb<zzcae> zza;
    private final zzgeb<Context> zzb;
    private final zzgeb<zzcaw> zzc;
    private final zzgeb<View> zzd;
    private final zzgeb<zzavq> zze;

    public zzdff(zzgeb<zzcae> zzgebVar, zzgeb<Context> zzgebVar2, zzgeb<zzcaw> zzgebVar3, zzgeb<View> zzgebVar4, zzgeb<zzavq> zzgebVar5) {
        this.zza = zzgebVar;
        this.zzb = zzgebVar2;
        this.zzc = zzgebVar3;
        this.zzd = zzgebVar4;
        this.zze = zzgebVar5;
    }

    @Override // com.google.android.gms.internal.ads.zzgeb
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzdfe(((zzdeh) this.zza).zzb(), ((zzeuo) this.zzb).zza(), this.zzc.zzb(), ((zzdea) this.zzd).zza(), this.zze.zzb());
    }
}
