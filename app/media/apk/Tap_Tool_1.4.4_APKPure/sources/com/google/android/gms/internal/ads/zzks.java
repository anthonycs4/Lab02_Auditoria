package com.google.android.gms.internal.ads;

import java.util.List;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzks {
    private static final zzaaj zzt = new zzaaj(new Object());
    public final zzlq zza;
    public final zzaaj zzb;
    public final long zzc;
    public final long zzd;
    public final int zze;
    public final zzid zzf;
    public final boolean zzg;
    public final zzach zzh;
    public final zzadq zzi;
    public final List<zzxu> zzj;
    public final zzaaj zzk;
    public final boolean zzl;
    public final int zzm;
    public final zzku zzn;
    public final boolean zzo;
    public final boolean zzp;
    public volatile long zzq;
    public volatile long zzr;
    public volatile long zzs;

    public zzks(zzlq zzlqVar, zzaaj zzaajVar, long j, long j2, int i, zzid zzidVar, boolean z, zzach zzachVar, zzadq zzadqVar, List<zzxu> list, zzaaj zzaajVar2, boolean z2, int i2, zzku zzkuVar, long j3, long j4, long j5, boolean z3, boolean z4) {
        this.zza = zzlqVar;
        this.zzb = zzaajVar;
        this.zzc = j;
        this.zzd = j2;
        this.zze = i;
        this.zzf = zzidVar;
        this.zzg = z;
        this.zzh = zzachVar;
        this.zzi = zzadqVar;
        this.zzj = list;
        this.zzk = zzaajVar2;
        this.zzl = z2;
        this.zzm = i2;
        this.zzn = zzkuVar;
        this.zzq = j3;
        this.zzr = j4;
        this.zzs = j5;
        this.zzo = z3;
        this.zzp = z4;
    }

    public static zzks zza(zzadq zzadqVar) {
        zzlq zzlqVar = zzlq.zza;
        zzaaj zzaajVar = zzt;
        return new zzks(zzlqVar, zzaajVar, -9223372036854775807L, 0L, 1, null, false, zzach.zza, zzadqVar, zzfgz.zzi(), zzaajVar, false, 0, zzku.zza, 0L, 0L, 0L, false, false);
    }

    public static zzaaj zzb() {
        return zzt;
    }

    public final zzks zzc(zzaaj zzaajVar, long j, long j2, long j3, long j4, zzach zzachVar, zzadq zzadqVar, List<zzxu> list) {
        return new zzks(this.zza, zzaajVar, j2, j3, this.zze, this.zzf, this.zzg, zzachVar, zzadqVar, list, this.zzk, this.zzl, this.zzm, this.zzn, this.zzq, j4, j, this.zzo, this.zzp);
    }

    public final zzks zzd(zzlq zzlqVar) {
        return new zzks(zzlqVar, this.zzb, this.zzc, this.zzd, this.zze, this.zzf, this.zzg, this.zzh, this.zzi, this.zzj, this.zzk, this.zzl, this.zzm, this.zzn, this.zzq, this.zzr, this.zzs, this.zzo, this.zzp);
    }

    public final zzks zze(int i) {
        return new zzks(this.zza, this.zzb, this.zzc, this.zzd, i, this.zzf, this.zzg, this.zzh, this.zzi, this.zzj, this.zzk, this.zzl, this.zzm, this.zzn, this.zzq, this.zzr, this.zzs, this.zzo, this.zzp);
    }

    public final zzks zzf(zzid zzidVar) {
        return new zzks(this.zza, this.zzb, this.zzc, this.zzd, this.zze, zzidVar, this.zzg, this.zzh, this.zzi, this.zzj, this.zzk, this.zzl, this.zzm, this.zzn, this.zzq, this.zzr, this.zzs, this.zzo, this.zzp);
    }

    public final zzks zzg(zzaaj zzaajVar) {
        return new zzks(this.zza, this.zzb, this.zzc, this.zzd, this.zze, this.zzf, this.zzg, this.zzh, this.zzi, this.zzj, zzaajVar, this.zzl, this.zzm, this.zzn, this.zzq, this.zzr, this.zzs, this.zzo, this.zzp);
    }

    public final zzks zzh(boolean z, int i) {
        return new zzks(this.zza, this.zzb, this.zzc, this.zzd, this.zze, this.zzf, this.zzg, this.zzh, this.zzi, this.zzj, this.zzk, z, i, this.zzn, this.zzq, this.zzr, this.zzs, this.zzo, this.zzp);
    }

    public final zzks zzi(boolean z) {
        return new zzks(this.zza, this.zzb, this.zzc, this.zzd, this.zze, this.zzf, this.zzg, this.zzh, this.zzi, this.zzj, this.zzk, this.zzl, this.zzm, this.zzn, this.zzq, this.zzr, this.zzs, z, this.zzp);
    }
}
