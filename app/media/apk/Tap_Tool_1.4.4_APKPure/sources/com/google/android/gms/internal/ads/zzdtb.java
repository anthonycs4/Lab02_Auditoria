package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.ApplicationInfo;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzdtb implements zzgdq<ApplicationInfo> {
    private final zzgeb<Context> zza;

    public zzdtb(zzgeb<Context> zzgebVar) {
        this.zza = zzgebVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgeb
    /* renamed from: zza */
    public final ApplicationInfo zzb() {
        ApplicationInfo applicationInfo = this.zza.zzb().getApplicationInfo();
        zzgdw.zzb(applicationInfo);
        return applicationInfo;
    }
}
