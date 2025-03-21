package com.google.android.gms.internal.ads;

import java.io.IOException;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public abstract class zzue {
    private zzqq zzb;
    private zzpu zzc;
    private zztz zzd;
    private long zze;
    private long zzf;
    private long zzg;
    private int zzh;
    private int zzi;
    private long zzk;
    private boolean zzl;
    private boolean zzm;
    private final zztx zza = new zztx();
    private zzuc zzj = new zzuc();

    /* JADX INFO: Access modifiers changed from: protected */
    public void zza(boolean z) {
        int i;
        if (z) {
            this.zzj = new zzuc();
            this.zzf = 0L;
            i = 0;
        } else {
            i = 1;
        }
        this.zzh = i;
        this.zze = -1L;
        this.zzg = 0L;
    }

    protected abstract long zzb(zzahd zzahdVar);

    @EnsuresNonNullIf(expression = {"#3.format"}, result = false)
    protected abstract boolean zzc(zzahd zzahdVar, long j, zzuc zzucVar) throws IOException;

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zze(zzpu zzpuVar, zzqq zzqqVar) {
        this.zzc = zzpuVar;
        this.zzb = zzqqVar;
        zza(true);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzf(long j, long j2) {
        this.zza.zza();
        if (j == 0) {
            zza(!this.zzl);
        } else if (this.zzh != 0) {
            long zzi = zzi(j2);
            this.zze = zzi;
            zztz zztzVar = this.zzd;
            int i = zzaht.zza;
            zztzVar.zzb(zzi);
            this.zzh = 2;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int zzg(zzps zzpsVar, zzqj zzqjVar) throws IOException {
        zzafs.zzf(this.zzb);
        int i = zzaht.zza;
        int i2 = this.zzh;
        if (i2 == 0) {
            while (this.zza.zzb(zzpsVar)) {
                this.zzk = zzpsVar.zzn() - this.zzf;
                if (!zzc(this.zza.zzd(), this.zzf, this.zzj)) {
                    zzjq zzjqVar = this.zzj.zza;
                    this.zzi = zzjqVar.zzz;
                    if (!this.zzm) {
                        this.zzb.zza(zzjqVar);
                        this.zzm = true;
                    }
                    zztz zztzVar = this.zzj.zzb;
                    if (zztzVar != null) {
                        this.zzd = zztzVar;
                    } else if (zzpsVar.zzo() == -1) {
                        this.zzd = new zzud(null);
                    } else {
                        zzty zzc = this.zza.zzc();
                        this.zzd = new zzts(this, this.zzf, zzpsVar.zzo(), zzc.zzd + zzc.zze, zzc.zzb, (zzc.zza & 4) != 0);
                    }
                    this.zzh = 2;
                    this.zza.zze();
                    return 0;
                }
                this.zzf = zzpsVar.zzn();
            }
            this.zzh = 3;
            return -1;
        } else if (i2 == 1) {
            ((zzpo) zzpsVar).zze((int) this.zzf, false);
            this.zzh = 2;
            return 0;
        } else if (i2 != 2) {
            return -1;
        } else {
            long zza = this.zzd.zza(zzpsVar);
            if (zza >= 0) {
                zzqjVar.zza = zza;
                return 1;
            }
            if (zza < -1) {
                zzj(-(zza + 2));
            }
            if (!this.zzl) {
                zzqm zzc2 = this.zzd.zzc();
                zzafs.zzf(zzc2);
                this.zzc.zzbk(zzc2);
                this.zzl = true;
            }
            if (this.zzk > 0 || this.zza.zzb(zzpsVar)) {
                this.zzk = 0L;
                zzahd zzd = this.zza.zzd();
                long zzb = zzb(zzd);
                if (zzb >= 0) {
                    long j = this.zzg;
                    if (j + zzb >= this.zze) {
                        long zzh = zzh(j);
                        zzqo.zzb(this.zzb, zzd, zzd.zze());
                        this.zzb.zzd(zzh, 1, zzd.zze(), 0, null);
                        this.zze = -1L;
                    }
                }
                this.zzg += zzb;
                return 0;
            }
            this.zzh = 3;
            return -1;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final long zzh(long j) {
        return (j * 1000000) / this.zzi;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final long zzi(long j) {
        return (this.zzi * j) / 1000000;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void zzj(long j) {
        this.zzg = j;
    }
}
