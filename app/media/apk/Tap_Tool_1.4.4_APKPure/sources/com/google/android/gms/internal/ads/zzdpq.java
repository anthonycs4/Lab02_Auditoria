package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzdpq implements zzexm {
    private final zzdpj zzb;
    private final Clock zzc;
    private final Map<zzexf, Long> zza = new HashMap();
    private final Map<zzexf, zzdpp> zzd = new HashMap();

    public zzdpq(zzdpj zzdpjVar, Set<zzdpp> set, Clock clock) {
        zzexf zzexfVar;
        this.zzb = zzdpjVar;
        for (zzdpp zzdppVar : set) {
            Map<zzexf, zzdpp> map = this.zzd;
            zzexfVar = zzdppVar.zzc;
            map.put(zzexfVar, zzdppVar);
        }
        this.zzc = clock;
    }

    private final void zze(zzexf zzexfVar, boolean z) {
        zzexf zzexfVar2;
        String str;
        zzexfVar2 = this.zzd.get(zzexfVar).zzb;
        String str2 = true != z ? "f." : "s.";
        if (this.zza.containsKey(zzexfVar2)) {
            long elapsedRealtime = this.zzc.elapsedRealtime() - this.zza.get(zzexfVar2).longValue();
            Map<String, String> zzc = this.zzb.zzc();
            str = this.zzd.get(zzexfVar).zza;
            String concat = str.length() != 0 ? "label.".concat(str) : new String("label.");
            String valueOf = String.valueOf(Long.toString(elapsedRealtime));
            zzc.put(concat, valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzexm
    public final void zzbO(zzexf zzexfVar, String str) {
    }

    @Override // com.google.android.gms.internal.ads.zzexm
    public final void zzbP(zzexf zzexfVar, String str) {
        this.zza.put(zzexfVar, Long.valueOf(this.zzc.elapsedRealtime()));
    }

    @Override // com.google.android.gms.internal.ads.zzexm
    public final void zzbQ(zzexf zzexfVar, String str, Throwable th) {
        if (this.zza.containsKey(zzexfVar)) {
            long elapsedRealtime = this.zzc.elapsedRealtime() - this.zza.get(zzexfVar).longValue();
            Map<String, String> zzc = this.zzb.zzc();
            String valueOf = String.valueOf(str);
            String concat = valueOf.length() != 0 ? "task.".concat(valueOf) : new String("task.");
            String valueOf2 = String.valueOf(Long.toString(elapsedRealtime));
            zzc.put(concat, valueOf2.length() != 0 ? "f.".concat(valueOf2) : new String("f."));
        }
        if (this.zzd.containsKey(zzexfVar)) {
            zze(zzexfVar, false);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzexm
    public final void zzbR(zzexf zzexfVar, String str) {
        if (this.zza.containsKey(zzexfVar)) {
            long elapsedRealtime = this.zzc.elapsedRealtime() - this.zza.get(zzexfVar).longValue();
            Map<String, String> zzc = this.zzb.zzc();
            String valueOf = String.valueOf(str);
            String concat = valueOf.length() != 0 ? "task.".concat(valueOf) : new String("task.");
            String valueOf2 = String.valueOf(Long.toString(elapsedRealtime));
            zzc.put(concat, valueOf2.length() != 0 ? "s.".concat(valueOf2) : new String("s."));
        }
        if (this.zzd.containsKey(zzexfVar)) {
            zze(zzexfVar, true);
        }
    }
}
