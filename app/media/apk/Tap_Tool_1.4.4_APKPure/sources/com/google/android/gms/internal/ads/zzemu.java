package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzemu implements zzgdq<zzems> {
    private final zzgeb<zzcbp> zza;
    private final zzgeb<zzflb> zzb;
    private final zzgeb<String> zzc;

    public zzemu(zzgeb<zzcbp> zzgebVar, zzgeb<zzflb> zzgebVar2, zzgeb<String> zzgebVar3) {
        this.zza = zzgebVar;
        this.zzb = zzgebVar2;
        this.zzc = zzgebVar3;
    }

    @Override // com.google.android.gms.internal.ads.zzgeb
    public final /* bridge */ /* synthetic */ Object zzb() {
        zzcbp zzcbpVar = new zzcbp();
        zzflb zzflbVar = zzccz.zza;
        zzgdw.zzb(zzflbVar);
        return new zzems(zzcbpVar, zzflbVar, ((zzend) this.zzc).zza(), null);
    }
}
