package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
@Deprecated
/* loaded from: classes.dex */
public final class zzdps extends zzdpu {
    private final zzeyd zzf;

    public zzdps(Executor executor, zzccs zzccsVar, zzeyd zzeydVar, zzeyf zzeyfVar) {
        super(executor, zzccsVar, zzeyfVar);
        this.zzf = zzeydVar;
        zzeydVar.zza(this.zzb);
    }

    public final Map<String, String> zza() {
        return new HashMap(this.zzb);
    }
}
