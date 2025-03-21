package com.google.android.gms.internal.ads;

import android.content.Context;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzdth implements zzgdq<String> {
    private final zzgeb<Context> zza;

    public zzdth(zzgeb<Context> zzgebVar) {
        this.zza = zzgebVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgeb
    /* renamed from: zza */
    public final String zzb() {
        String packageName = ((zzeuo) this.zza).zza().getPackageName();
        zzgdw.zzb(packageName);
        return packageName;
    }
}
