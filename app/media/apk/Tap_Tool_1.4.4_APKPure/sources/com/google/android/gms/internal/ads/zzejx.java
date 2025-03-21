package com.google.android.gms.internal.ads;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Bundle;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzejx implements zzeld, zzelc {
    private final ApplicationInfo zza;
    private final PackageInfo zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzejx(ApplicationInfo applicationInfo, PackageInfo packageInfo) {
        this.zza = applicationInfo;
        this.zzb = packageInfo;
    }

    @Override // com.google.android.gms.internal.ads.zzeld
    public final zzfla<zzelc<Bundle>> zza() {
        return zzfks.zza(this);
    }

    @Override // com.google.android.gms.internal.ads.zzelc
    public final /* bridge */ /* synthetic */ void zzd(Object obj) {
        Bundle bundle = (Bundle) obj;
        String str = this.zza.packageName;
        PackageInfo packageInfo = this.zzb;
        Integer valueOf = packageInfo == null ? null : Integer.valueOf(packageInfo.versionCode);
        bundle.putString("pn", str);
        if (valueOf != null) {
            bundle.putInt("vc", valueOf.intValue());
        }
        PackageInfo packageInfo2 = this.zzb;
        String str2 = packageInfo2 != null ? packageInfo2.versionName : null;
        if (str2 != null) {
            bundle.putString("vnm", str2);
        }
    }
}
