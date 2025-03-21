package com.google.android.gms.internal.ads;

import java.io.IOException;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zztw implements zzpr {
    public static final zzpx zza = zztv.zza;
    private zzpu zzb;
    private zzue zzc;
    private boolean zzd;

    @EnsuresNonNullIf(expression = {"streamReader"}, result = true)
    private final boolean zza(zzps zzpsVar) throws IOException {
        zzty zztyVar = new zzty();
        if (zztyVar.zzc(zzpsVar, true) && (zztyVar.zza & 2) == 2) {
            int min = Math.min(zztyVar.zze, 8);
            zzahd zzahdVar = new zzahd(min);
            ((zzpo) zzpsVar).zzh(zzahdVar.zzi(), 0, min, false);
            zzahdVar.zzh(0);
            if (zzahdVar.zzd() < 5 || zzahdVar.zzn() != 127 || zzahdVar.zzt() != 1179402563) {
                zzahdVar.zzh(0);
                try {
                    if (zzqv.zzc(1, zzahdVar, true)) {
                        this.zzc = new zzug();
                    }
                } catch (zzkr unused) {
                }
                zzahdVar.zzh(0);
                if (zzua.zzd(zzahdVar)) {
                    this.zzc = new zzua();
                }
            } else {
                this.zzc = new zztu();
            }
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzpr
    public final boolean zzd(zzps zzpsVar) throws IOException {
        try {
            return zza(zzpsVar);
        } catch (zzkr unused) {
            return false;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzpr
    public final void zze(zzpu zzpuVar) {
        this.zzb = zzpuVar;
    }

    @Override // com.google.android.gms.internal.ads.zzpr
    public final int zzf(zzps zzpsVar, zzqj zzqjVar) throws IOException {
        zzafs.zzf(this.zzb);
        if (this.zzc == null) {
            if (!zza(zzpsVar)) {
                throw new zzkr("Failed to determine bitstream type");
            }
            zzpsVar.zzl();
        }
        if (!this.zzd) {
            zzqq zzbi = this.zzb.zzbi(0, 1);
            this.zzb.zzbj();
            this.zzc.zze(this.zzb, zzbi);
            this.zzd = true;
        }
        return this.zzc.zzg(zzpsVar, zzqjVar);
    }

    @Override // com.google.android.gms.internal.ads.zzpr
    public final void zzg(long j, long j2) {
        zzue zzueVar = this.zzc;
        if (zzueVar != null) {
            zzueVar.zzf(j, j2);
        }
    }
}
