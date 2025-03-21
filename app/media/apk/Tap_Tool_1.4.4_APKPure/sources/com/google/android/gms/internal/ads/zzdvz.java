package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzdvz implements zzgdq<zzdvy> {
    private final zzgeb<zzexu> zza;
    private final zzgeb<zzexv> zzb;
    private final zzgeb<zzccc> zzc;

    public zzdvz(zzgeb<zzexu> zzgebVar, zzgeb<zzexv> zzgebVar2, zzgeb<zzccc> zzgebVar3) {
        this.zza = zzgebVar;
        this.zzb = zzgebVar2;
        this.zzc = zzgebVar3;
    }

    @Override // com.google.android.gms.internal.ads.zzgeb
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzdvy(this.zza.zzb(), this.zzb.zzb(), ((zzeup) this.zzc).zzb());
    }
}
