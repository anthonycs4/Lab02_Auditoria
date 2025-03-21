package com.google.android.gms.internal.ads;

import java.util.Map;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzcnt implements zzcnp {
    private final com.google.android.gms.ads.internal.util.zzg zza;

    public zzcnt(com.google.android.gms.ads.internal.util.zzg zzgVar) {
        this.zza = zzgVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcnp
    public final void zza(Map<String, String> map) {
        this.zza.zzg(Boolean.parseBoolean(map.get("content_vertical_opted_out")));
    }
}
