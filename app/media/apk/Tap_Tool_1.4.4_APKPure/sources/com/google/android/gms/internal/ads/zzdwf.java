package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzdwf implements zzexm {
    private final Map<zzexf, String> zza = new HashMap();
    private final Map<zzexf, String> zzb = new HashMap();
    private final zzexu zzc;

    public zzdwf(Set<zzdwe> set, zzexu zzexuVar) {
        zzexf zzexfVar;
        String str;
        zzexf zzexfVar2;
        String str2;
        this.zzc = zzexuVar;
        for (zzdwe zzdweVar : set) {
            Map<zzexf, String> map = this.zza;
            zzexfVar = zzdweVar.zzb;
            str = zzdweVar.zza;
            map.put(zzexfVar, str);
            Map<zzexf, String> map2 = this.zzb;
            zzexfVar2 = zzdweVar.zzc;
            str2 = zzdweVar.zza;
            map2.put(zzexfVar2, str2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzexm
    public final void zzbO(zzexf zzexfVar, String str) {
    }

    @Override // com.google.android.gms.internal.ads.zzexm
    public final void zzbP(zzexf zzexfVar, String str) {
        zzexu zzexuVar = this.zzc;
        String valueOf = String.valueOf(str);
        zzexuVar.zzd(valueOf.length() != 0 ? "task.".concat(valueOf) : new String("task."));
        if (this.zza.containsKey(zzexfVar)) {
            zzexu zzexuVar2 = this.zzc;
            String valueOf2 = String.valueOf(this.zza.get(zzexfVar));
            zzexuVar2.zzd(valueOf2.length() != 0 ? "label.".concat(valueOf2) : new String("label."));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzexm
    public final void zzbQ(zzexf zzexfVar, String str, Throwable th) {
        zzexu zzexuVar = this.zzc;
        String valueOf = String.valueOf(str);
        zzexuVar.zze(valueOf.length() != 0 ? "task.".concat(valueOf) : new String("task."), "f.");
        if (this.zzb.containsKey(zzexfVar)) {
            zzexu zzexuVar2 = this.zzc;
            String valueOf2 = String.valueOf(this.zzb.get(zzexfVar));
            zzexuVar2.zze(valueOf2.length() != 0 ? "label.".concat(valueOf2) : new String("label."), "f.");
        }
    }

    @Override // com.google.android.gms.internal.ads.zzexm
    public final void zzbR(zzexf zzexfVar, String str) {
        zzexu zzexuVar = this.zzc;
        String valueOf = String.valueOf(str);
        zzexuVar.zze(valueOf.length() != 0 ? "task.".concat(valueOf) : new String("task."), "s.");
        if (this.zzb.containsKey(zzexfVar)) {
            zzexu zzexuVar2 = this.zzc;
            String valueOf2 = String.valueOf(this.zzb.get(zzexfVar));
            zzexuVar2.zze(valueOf2.length() != 0 ? "label.".concat(valueOf2) : new String("label."), "s.");
        }
    }
}
