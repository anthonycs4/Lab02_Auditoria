package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import com.google.android.gms.common.wrappers.Wrappers;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzdtg implements zzgdq<PackageInfo> {
    private final zzgeb<Context> zza;
    private final zzgeb<ApplicationInfo> zzb;

    public zzdtg(zzgeb<Context> zzgebVar, zzgeb<ApplicationInfo> zzgebVar2) {
        this.zza = zzgebVar;
        this.zzb = zzgebVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzgeb
    public final /* bridge */ /* synthetic */ Object zzb() {
        try {
            return Wrappers.packageManager(this.zza.zzb()).getPackageInfo(((zzdtb) this.zzb).zzb().packageName, 0);
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }
}
