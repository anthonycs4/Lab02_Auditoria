package com.google.android.gms.internal.ads;

import java.util.Map;
import java.util.concurrent.Executor;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
@Deprecated
/* loaded from: classes.dex */
public final class zzdpn {
    private final zzdps zza;
    private final Executor zzb;
    private final Map<String, String> zzc;

    public zzdpn(zzdps zzdpsVar, Executor executor) {
        this.zza = zzdpsVar;
        this.zzc = zzdpsVar.zza();
        this.zzb = executor;
    }

    public final zzdpm zza() {
        zzdpm zzdpmVar = new zzdpm(this);
        zzdpm.zzg(zzdpmVar);
        return zzdpmVar;
    }
}
