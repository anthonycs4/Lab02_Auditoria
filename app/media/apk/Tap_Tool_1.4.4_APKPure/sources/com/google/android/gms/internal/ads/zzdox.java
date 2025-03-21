package com.google.android.gms.internal.ads;

import java.util.Map;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzdox implements zzexm {
    private final Map<zzexf, zzdow> zza;
    private final zzavg zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzdox(zzavg zzavgVar, Map<zzexf, zzdow> map) {
        this.zza = map;
        this.zzb = zzavgVar;
    }

    @Override // com.google.android.gms.internal.ads.zzexm
    public final void zzbO(zzexf zzexfVar, String str) {
    }

    @Override // com.google.android.gms.internal.ads.zzexm
    public final void zzbP(zzexf zzexfVar, String str) {
        if (this.zza.containsKey(zzexfVar)) {
            this.zzb.zzb(this.zza.get(zzexfVar).zza);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzexm
    public final void zzbQ(zzexf zzexfVar, String str, Throwable th) {
        if (this.zza.containsKey(zzexfVar)) {
            this.zzb.zzb(this.zza.get(zzexfVar).zzc);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzexm
    public final void zzbR(zzexf zzexfVar, String str) {
        if (this.zza.containsKey(zzexfVar)) {
            this.zzb.zzb(this.zza.get(zzexfVar).zzb);
        }
    }
}
