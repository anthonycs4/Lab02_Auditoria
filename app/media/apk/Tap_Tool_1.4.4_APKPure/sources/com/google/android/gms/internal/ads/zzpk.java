package com.google.android.gms.internal.ads;

import java.io.IOException;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public class zzpk {
    protected final zzpe zza;
    protected final zzpj zzb;
    protected zzpg zzc;
    private final int zzd;

    /* JADX INFO: Access modifiers changed from: protected */
    public zzpk(zzph zzphVar, zzpj zzpjVar, long j, long j2, long j3, long j4, long j5, long j6, int i) {
        this.zzb = zzpjVar;
        this.zzd = i;
        this.zza = new zzpe(zzphVar, j, 0L, j3, j4, j5, j6);
    }

    protected static final int zzf(zzps zzpsVar, long j, zzqj zzqjVar) {
        if (j == zzpsVar.zzn()) {
            return 0;
        }
        zzqjVar.zza = j;
        return 1;
    }

    protected static final boolean zzg(zzps zzpsVar, long j) throws IOException {
        long zzn = j - zzpsVar.zzn();
        if (zzn < 0 || zzn > 262144) {
            return false;
        }
        ((zzpo) zzpsVar).zze((int) zzn, false);
        return true;
    }

    public final zzqm zza() {
        return this.zza;
    }

    public final void zzb(long j) {
        long j2;
        long j3;
        long j4;
        long j5;
        long j6;
        zzpg zzpgVar = this.zzc;
        if (zzpgVar != null) {
            j6 = zzpgVar.zza;
            if (j6 == j) {
                return;
            }
        }
        long zzd = this.zza.zzd(j);
        j2 = this.zza.zzc;
        j3 = this.zza.zzd;
        j4 = this.zza.zze;
        j5 = this.zza.zzf;
        this.zzc = new zzpg(j, zzd, 0L, j2, j3, j4, j5);
    }

    public final boolean zzc() {
        return this.zzc != null;
    }

    public final int zzd(zzps zzpsVar, zzqj zzqjVar) throws IOException {
        long j;
        long j2;
        long j3;
        long j4;
        int i;
        long j5;
        long j6;
        long j7;
        long j8;
        long j9;
        long j10;
        long j11;
        while (true) {
            zzpg zzpgVar = this.zzc;
            zzafs.zzf(zzpgVar);
            j = zzpgVar.zzf;
            j2 = zzpgVar.zzg;
            j3 = zzpgVar.zzh;
            if (j2 - j > this.zzd) {
                if (zzg(zzpsVar, j3)) {
                    zzpsVar.zzl();
                    zzpj zzpjVar = this.zzb;
                    j4 = zzpgVar.zzb;
                    zzpi zza = zzpjVar.zza(zzpsVar, j4);
                    i = zza.zzb;
                    if (i == -3) {
                        zze(false, j3);
                        return zzf(zzpsVar, j3, zzqjVar);
                    } else if (i == -2) {
                        j10 = zza.zzc;
                        j11 = zza.zzd;
                        zzpg.zzh(zzpgVar, j10, j11);
                    } else if (i == -1) {
                        j8 = zza.zzc;
                        j9 = zza.zzd;
                        zzpg.zzg(zzpgVar, j8, j9);
                    } else {
                        j5 = zza.zzd;
                        zzg(zzpsVar, j5);
                        j6 = zza.zzd;
                        zze(true, j6);
                        j7 = zza.zzd;
                        return zzf(zzpsVar, j7, zzqjVar);
                    }
                } else {
                    return zzf(zzpsVar, j3, zzqjVar);
                }
            } else {
                zze(false, j);
                return zzf(zzpsVar, j, zzqjVar);
            }
        }
    }

    protected final void zze(boolean z, long j) {
        this.zzc = null;
        this.zzb.zzb();
    }
}
