package com.google.android.gms.internal.ads;

import java.util.List;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzwi {
    private final List<zzjq> zza;
    private final zzqq[] zzb;

    public zzwi(List<zzjq> list) {
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
            zzjp zzjpVar = new zzjp();
            zzjpVar.zza(zzwfVar.zzc());
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
        if (zzahdVar.zzd() < 9) {
            return;
        }
        int zzv = zzahdVar.zzv();
        int zzv2 = zzahdVar.zzv();
        int zzn = zzahdVar.zzn();
        if (zzv == 434 && zzv2 == 1195456820 && zzn == 3) {
            zzpl.zzb(j, zzahdVar, this.zzb);
        }
    }
}
