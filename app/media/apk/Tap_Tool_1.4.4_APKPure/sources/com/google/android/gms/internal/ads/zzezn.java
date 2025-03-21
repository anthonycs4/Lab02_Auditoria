package com.google.android.gms.internal.ads;

import android.view.View;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzezn {
    private final zzfau zza;
    private final String zzb;
    private final zzezb zzc;
    private final String zzd;

    public zzezn(View view, zzezb zzezbVar, String str) {
        this.zza = new zzfau(view);
        this.zzb = view.getClass().getCanonicalName();
        this.zzc = zzezbVar;
        this.zzd = str;
    }

    public final zzfau zza() {
        return this.zza;
    }

    public final String zzb() {
        return this.zzb;
    }

    public final zzezb zzc() {
        return this.zzc;
    }

    public final String zzd() {
        return this.zzd;
    }
}
