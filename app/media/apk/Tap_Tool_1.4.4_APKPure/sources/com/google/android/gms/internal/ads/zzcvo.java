package com.google.android.gms.internal.ads;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Bundle;
import java.util.List;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzcvo implements zzgdq<zzcvn> {
    private final zzgeb<zzexl> zza;
    private final zzgeb<zzcct> zzb;
    private final zzgeb<ApplicationInfo> zzc;
    private final zzgeb<String> zzd;
    private final zzgeb<List<String>> zze;
    private final zzgeb<PackageInfo> zzf;
    private final zzgeb<zzfla<String>> zzg;
    private final zzgeb<com.google.android.gms.ads.internal.util.zzg> zzh;
    private final zzgeb<String> zzi;
    private final zzgeb<zzelg<Bundle>> zzj;

    public zzcvo(zzgeb<zzexl> zzgebVar, zzgeb<zzcct> zzgebVar2, zzgeb<ApplicationInfo> zzgebVar3, zzgeb<String> zzgebVar4, zzgeb<List<String>> zzgebVar5, zzgeb<PackageInfo> zzgebVar6, zzgeb<zzfla<String>> zzgebVar7, zzgeb<com.google.android.gms.ads.internal.util.zzg> zzgebVar8, zzgeb<String> zzgebVar9, zzgeb<zzelg<Bundle>> zzgebVar10) {
        this.zza = zzgebVar;
        this.zzb = zzgebVar2;
        this.zzc = zzgebVar3;
        this.zzd = zzgebVar4;
        this.zze = zzgebVar5;
        this.zzf = zzgebVar6;
        this.zzg = zzgebVar7;
        this.zzh = zzgebVar8;
        this.zzi = zzgebVar9;
        this.zzj = zzgebVar10;
    }

    @Override // com.google.android.gms.internal.ads.zzgeb
    /* renamed from: zza */
    public final zzcvn zzb() {
        return new zzcvn(this.zza.zzb(), ((zzckn) this.zzb).zza(), ((zzdtb) this.zzc).zzb(), ((zzdth) this.zzd).zzb(), zzbfq.zzc(), this.zzf.zzb(), zzgdp.zzc(this.zzg), ((zzeun) this.zzh).zzb(), this.zzi.zzb(), ((zzelh) this.zzj).zzb());
    }
}
