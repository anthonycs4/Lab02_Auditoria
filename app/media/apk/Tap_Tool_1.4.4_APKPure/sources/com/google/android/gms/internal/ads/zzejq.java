package com.google.android.gms.internal.ads;

import android.content.pm.PackageInfo;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzejq implements zzgdq<zzejo> {
    private final zzgeb<zzflb> zza;
    private final zzgeb<zzetk> zzb;
    private final zzgeb<PackageInfo> zzc;
    private final zzgeb<com.google.android.gms.ads.internal.util.zzg> zzd;

    public zzejq(zzgeb<zzflb> zzgebVar, zzgeb<zzetk> zzgebVar2, zzgeb<PackageInfo> zzgebVar3, zzgeb<com.google.android.gms.ads.internal.util.zzg> zzgebVar4) {
        this.zza = zzgebVar;
        this.zzb = zzgebVar2;
        this.zzc = zzgebVar3;
        this.zzd = zzgebVar4;
    }

    @Override // com.google.android.gms.internal.ads.zzgeb
    public final /* bridge */ /* synthetic */ Object zzb() {
        zzflb zzflbVar = zzccz.zza;
        zzgdw.zzb(zzflbVar);
        return new zzejo(zzflbVar, ((zzcvy) this.zzb).zza(), this.zzc.zzb(), ((zzeun) this.zzd).zzb());
    }
}
