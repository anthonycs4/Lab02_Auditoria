package com.google.android.gms.internal.ads;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzkh {
    public final zzaah zza;
    public final Object zzb;
    public boolean zzd;
    public boolean zze;
    public zzki zzf;
    public boolean zzg;
    private final zzlh[] zzi;
    private final zzadp zzj;
    private final zzkq zzk;
    private zzkh zzl;
    private zzadq zzn;
    private long zzo;
    private zzach zzm = zzach.zza;
    public final zzabx[] zzc = new zzabx[2];
    private final boolean[] zzh = new boolean[2];

    public zzkh(zzlh[] zzlhVarArr, long j, zzadp zzadpVar, zzaek zzaekVar, zzkq zzkqVar, zzki zzkiVar, zzadq zzadqVar, byte[] bArr) {
        this.zzi = zzlhVarArr;
        this.zzo = j;
        this.zzj = zzadpVar;
        this.zzk = zzkqVar;
        this.zzb = zzkiVar.zza.zza;
        this.zzf = zzkiVar;
        this.zzn = zzadqVar;
        zzaaj zzaajVar = zzkiVar.zza;
        long j2 = zzkiVar.zzb;
        long j3 = zzkiVar.zzd;
        zzaah zzo = zzkqVar.zzo(zzaajVar, zzaekVar, j2);
        if (j3 != -9223372036854775807L && j3 != Long.MIN_VALUE) {
            zzo = new zzzp(zzo, true, 0L, j3);
        }
        this.zza = zzo;
    }

    private final void zzr() {
        if (!zzt()) {
            return;
        }
        int i = 0;
        while (true) {
            zzadq zzadqVar = this.zzn;
            if (i >= zzadqVar.zza) {
                return;
            }
            zzadqVar.zza(i);
            zzacs zzacsVar = this.zzn.zzd[i];
            i++;
        }
    }

    private final void zzs() {
        if (!zzt()) {
            return;
        }
        int i = 0;
        while (true) {
            zzadq zzadqVar = this.zzn;
            if (i >= zzadqVar.zza) {
                return;
            }
            zzadqVar.zza(i);
            zzacs zzacsVar = this.zzn.zzd[i];
            i++;
        }
    }

    private final boolean zzt() {
        return this.zzl == null;
    }

    public final long zza() {
        return this.zzo;
    }

    public final void zzb(long j) {
        this.zzo = 0L;
    }

    public final long zzc() {
        return this.zzf.zzb + this.zzo;
    }

    public final boolean zzd() {
        return this.zzd && (!this.zze || this.zza.zzg() == Long.MIN_VALUE);
    }

    public final long zze() {
        if (!this.zzd) {
            return this.zzf.zzb;
        }
        long zzg = this.zze ? this.zza.zzg() : Long.MIN_VALUE;
        return zzg == Long.MIN_VALUE ? this.zzf.zze : zzg;
    }

    public final long zzf() {
        if (this.zzd) {
            return this.zza.zzk();
        }
        return 0L;
    }

    public final void zzg(float f, zzlq zzlqVar) throws zzid {
        this.zzd = true;
        this.zzm = this.zza.zzc();
        zzadq zzj = zzj(f, zzlqVar);
        zzki zzkiVar = this.zzf;
        long j = zzkiVar.zzb;
        long j2 = zzkiVar.zze;
        if (j2 != -9223372036854775807L && j >= j2) {
            j = Math.max(0L, j2 - 1);
        }
        long zzk = zzk(zzj, j, false);
        long j3 = this.zzo;
        zzki zzkiVar2 = this.zzf;
        this.zzo = j3 + (zzkiVar2.zzb - zzk);
        this.zzf = zzkiVar2.zza(zzk);
    }

    public final void zzh(long j) {
        zzafs.zzd(zzt());
        if (this.zzd) {
            this.zza.zze(j - this.zzo);
        }
    }

    public final void zzi(long j) {
        zzafs.zzd(zzt());
        this.zza.zzl(j - this.zzo);
    }

    public final zzadq zzj(float f, zzlq zzlqVar) throws zzid {
        zzacs[] zzacsVarArr;
        zzadq zzj = this.zzj.zzj(this.zzi, this.zzm, this.zzf.zza, zzlqVar);
        for (zzacs zzacsVar : zzj.zzd) {
        }
        return zzj;
    }

    public final long zzk(zzadq zzadqVar, long j, boolean z) {
        return zzl(zzadqVar, j, false, new boolean[2]);
    }

    public final long zzl(zzadq zzadqVar, long j, boolean z, boolean[] zArr) {
        int i = 0;
        while (true) {
            boolean z2 = true;
            if (i >= zzadqVar.zza) {
                break;
            }
            boolean[] zArr2 = this.zzh;
            if (z || !zzadqVar.zzb(this.zzn, i)) {
                z2 = false;
            }
            zArr2[i] = z2;
            i++;
        }
        for (int i2 = 0; i2 < 2; i2++) {
            this.zzi[i2].zza();
        }
        zzs();
        this.zzn = zzadqVar;
        zzr();
        long zzp = this.zza.zzp(zzadqVar.zzd, this.zzh, this.zzc, zArr, j);
        for (int i3 = 0; i3 < 2; i3++) {
            this.zzi[i3].zza();
        }
        this.zze = false;
        int i4 = 0;
        while (true) {
            zzabx[] zzabxVarArr = this.zzc;
            if (i4 >= 2) {
                return zzp;
            }
            if (zzabxVarArr[i4] != null) {
                zzafs.zzd(zzadqVar.zza(i4));
                this.zzi[i4].zza();
                this.zze = true;
            } else {
                zzafs.zzd(zzadqVar.zzd[i4] == null);
            }
            i4++;
        }
    }

    public final void zzm() {
        zzs();
        long j = this.zzf.zzd;
        zzkq zzkqVar = this.zzk;
        zzaah zzaahVar = this.zza;
        try {
            if (j == -9223372036854775807L || j == Long.MIN_VALUE) {
                zzkqVar.zzd(zzaahVar);
            } else {
                zzkqVar.zzd(((zzzp) zzaahVar).zza);
            }
        } catch (RuntimeException e) {
            zzagm.zzb("MediaPeriodHolder", "Period release failed.", e);
        }
    }

    public final void zzn(zzkh zzkhVar) {
        if (zzkhVar == this.zzl) {
            return;
        }
        zzs();
        this.zzl = zzkhVar;
        zzr();
    }

    public final zzkh zzo() {
        return this.zzl;
    }

    public final zzach zzp() {
        return this.zzm;
    }

    public final zzadq zzq() {
        return this.zzn;
    }
}
