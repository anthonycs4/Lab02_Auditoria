package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzdwp implements zzgdq<zzdwo> {
    private final zzgeb<zzdwk> zza;
    private final zzgeb<zzflb> zzb;

    public zzdwp(zzgeb<zzdwk> zzgebVar, zzgeb<zzflb> zzgebVar2) {
        this.zza = zzgebVar;
        this.zzb = zzgebVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzgeb
    /* renamed from: zza */
    public final zzdwo zzb() {
        return new zzdwo(((zzdwl) this.zza).zzb(), this.zzb.zzb());
    }
}
