package com.google.android.gms.internal.ads;

import java.util.List;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzvu {
    private final List<zzjq> zza;
    private final zzqq[] zzb;

    public zzvu(List<zzjq> list) {
        this.zza = list;
        this.zzb = new zzqq[list.size()];
    }

    public final void zza(zzpu zzpuVar, zzwf zzwfVar) {
        for (int i = 0; i < this.zzb.length; i++) {
            zzwfVar.zza();
            zzqq zzbi = zzpuVar.zzbi(zzwfVar.zzb(), 3);
            zzjq zzjqVar = this.zza.get(i);
            String str = zzjqVar.zzl;
            boolean z = true;
            if (!"application/cea-608".equals(str) && !"application/cea-708".equals(str)) {
                z = false;
            }
            String valueOf = String.valueOf(str);
            zzafs.zzb(z, valueOf.length() != 0 ? "Invalid closed caption mime type provided: ".concat(valueOf) : new String("Invalid closed caption mime type provided: "));
            String str2 = zzjqVar.zza;
            if (str2 == null) {
                str2 = zzwfVar.zzc();
            }
            zzjp zzjpVar = new zzjp();
            zzjpVar.zza(str2);
            zzjpVar.zzj(str);
            zzjpVar.zze(zzjqVar.zzd);
            zzjpVar.zzd(zzjqVar.zzc);
            zzjpVar.zzB(zzjqVar.zzD);
            zzjpVar.zzl(zzjqVar.zzn);
            zzbi.zza(zzjpVar.zzD());
            this.zzb[i] = zzbi;
        }
    }

    public final void zzb(long j, zzahd zzahdVar) {
        zzpl.zza(j, zzahdVar, this.zzb);
    }
}
