package com.google.android.gms.internal.ads;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzejy implements zzgdq<zzejx> {
    private final zzgeb<ApplicationInfo> zza;
    private final zzgeb<PackageInfo> zzb;

    public zzejy(zzgeb<ApplicationInfo> zzgebVar, zzgeb<PackageInfo> zzgebVar2) {
        this.zza = zzgebVar;
        this.zzb = zzgebVar2;
    }

    public static zzejx zza(ApplicationInfo applicationInfo, PackageInfo packageInfo) {
        return new zzejx(applicationInfo, packageInfo);
    }

    @Override // com.google.android.gms.internal.ads.zzgeb
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzejx(((zzdtb) this.zza).zzb(), this.zzb.zzb());
    }
}
