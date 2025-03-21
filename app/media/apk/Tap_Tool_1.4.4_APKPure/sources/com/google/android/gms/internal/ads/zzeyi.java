package com.google.android.gms.internal.ads;

import java.util.Map;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzeyi implements zzexv {
    private final zzeyf zza;
    private final zzeyd zzb;

    public zzeyi(zzeyf zzeyfVar, zzeyd zzeydVar) {
        this.zza = zzeyfVar;
        this.zzb = zzeydVar;
    }

    @Override // com.google.android.gms.internal.ads.zzexv
    public final void zza(zzexu zzexuVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzexv
    public final String zzb(zzexu zzexuVar) {
        zzeyf zzeyfVar = this.zza;
        Map<String, String> zzj = zzexuVar.zzj();
        this.zzb.zza(zzj);
        return zzeyfVar.zza(zzj);
    }
}
