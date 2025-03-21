package com.google.android.gms.internal.ads;

import android.view.View;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public abstract class zzeyv {
    public abstract void zza();

    public abstract void zzb(View view);

    public abstract void zzc();

    public abstract void zzd(View view, zzezb zzezbVar, String str);

    @Deprecated
    public abstract void zze(View view);

    public static zzeyv zzf(zzeyw zzeywVar, zzeyx zzeyxVar) {
        if (zzeyt.zzb()) {
            return new zzeyz(zzeywVar, zzeyxVar);
        }
        throw new IllegalStateException("Method called before OM SDK activation");
    }
}
