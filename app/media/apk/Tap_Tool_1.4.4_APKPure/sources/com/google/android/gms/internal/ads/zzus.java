package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.List;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzus implements zzut {
    private final List<zzwc> zza;
    private final zzqq[] zzb;
    private boolean zzc;
    private int zzd;
    private int zze;
    private long zzf;

    public zzus(List<zzwc> list) {
        this.zza = list;
        this.zzb = new zzqq[list.size()];
    }

    private final boolean zzf(zzahd zzahdVar, int i) {
        if (zzahdVar.zzd() == 0) {
            return false;
        }
        if (zzahdVar.zzn() != i) {
            this.zzc = false;
        }
        this.zzd--;
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzut
    public final void zza() {
        this.zzc = false;
    }

    @Override // com.google.android.gms.internal.ads.zzut
    public final void zzb(zzpu zzpuVar, zzwf zzwfVar) {
        for (int i = 0; i < this.zzb.length; i++) {
            zzwc zzwcVar = this.zza.get(i);
            zzwfVar.zza();
            zzqq zzbi = zzpuVar.zzbi(zzwfVar.zzb(), 3);
            zzjp zzjpVar = new zzjp();
            zzjpVar.zza(zzwfVar.zzc());
            zzjpVar.zzj("application/dvbsubs");
            zzjpVar.zzl(Collections.singletonList(zzwcVar.zzb));
            zzjpVar.zzd(zzwcVar.zza);
            zzbi.zza(zzjpVar.zzD());
            this.zzb[i] = zzbi;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzut
    public final void zzc(long j, int i) {
        if ((i & 4) == 0) {
            return;
        }
        this.zzc = true;
        this.zzf = j;
        this.zze = 0;
        this.zzd = 2;
    }

    @Override // com.google.android.gms.internal.ads.zzut
    public final void zzd(zzahd zzahdVar) {
        zzqq[] zzqqVarArr;
        if (this.zzc) {
            if (this.zzd != 2 || zzf(zzahdVar, 32)) {
                if (this.zzd != 1 || zzf(zzahdVar, 0)) {
                    int zzg = zzahdVar.zzg();
                    int zzd = zzahdVar.zzd();
                    for (zzqq zzqqVar : this.zzb) {
                        zzahdVar.zzh(zzg);
                        zzqqVar.zzf(zzahdVar, zzd);
                    }
                    this.zze += zzd;
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzut
    public final void zze() {
        if (this.zzc) {
            for (zzqq zzqqVar : this.zzb) {
                zzqqVar.zzd(this.zzf, 1, this.zze, 0, null);
            }
            this.zzc = false;
        }
    }
}
