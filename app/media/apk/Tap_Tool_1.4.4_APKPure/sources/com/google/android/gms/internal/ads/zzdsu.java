package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzdsu implements zzgdq<zzdst> {
    private final zzgeb<zzflb> zza;
    private final zzgeb<zzflb> zzb;
    private final zzgeb<zzdtz> zzc;
    private final zzgeb<zzdvo> zzd;

    public zzdsu(zzgeb<zzflb> zzgebVar, zzgeb<zzflb> zzgebVar2, zzgeb<zzdtz> zzgebVar3, zzgeb<zzdvo> zzgebVar4) {
        this.zza = zzgebVar;
        this.zzb = zzgebVar2;
        this.zzc = zzgebVar3;
        this.zzd = zzgebVar4;
    }

    @Override // com.google.android.gms.internal.ads.zzgeb
    /* renamed from: zza */
    public final zzdst zzb() {
        zzflb zzflbVar = zzccz.zzb;
        zzgdw.zzb(zzflbVar);
        zzflb zzflbVar2 = zzccz.zza;
        zzgdw.zzb(zzflbVar2);
        return new zzdst(zzflbVar, zzflbVar2, ((zzdti) this.zzc).zzb(), zzgdp.zzc(this.zzd));
    }
}
