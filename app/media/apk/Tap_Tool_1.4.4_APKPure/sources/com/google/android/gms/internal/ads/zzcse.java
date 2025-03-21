package com.google.android.gms.internal.ads;

import android.content.Context;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzcse implements zzgdq<zzcsd> {
    private final zzgeb<Context> zza;
    private final zzgeb<zzcib> zzb;
    private final zzgeb<zzess> zzc;
    private final zzgeb<zzcct> zzd;

    public zzcse(zzgeb<Context> zzgebVar, zzgeb<zzcib> zzgebVar2, zzgeb<zzess> zzgebVar3, zzgeb<zzcct> zzgebVar4) {
        this.zza = zzgebVar;
        this.zzb = zzgebVar2;
        this.zzc = zzgebVar3;
        this.zzd = zzgebVar4;
    }

    @Override // com.google.android.gms.internal.ads.zzgeb
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzcsd(((zzeuo) this.zza).zza(), ((zzcrj) this.zzb).zza(), ((zzctd) this.zzc).zza(), ((zzckn) this.zzd).zza());
    }
}
