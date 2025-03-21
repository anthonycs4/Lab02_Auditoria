package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzpg {
    private final long zza;
    private final long zzb;
    private final long zzc;
    private long zzd = 0;
    private long zze;
    private long zzf;
    private long zzg;
    private long zzh;

    /* JADX INFO: Access modifiers changed from: protected */
    public zzpg(long j, long j2, long j3, long j4, long j5, long j6, long j7) {
        this.zza = j;
        this.zzb = j2;
        this.zze = j4;
        this.zzf = j5;
        this.zzg = j6;
        this.zzc = j7;
        this.zzh = zza(j2, 0L, j4, j5, j6, j7);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static long zza(long j, long j2, long j3, long j4, long j5, long j6) {
        if (j4 + 1 >= j5 || 1 + j2 >= j3) {
            return j4;
        }
        long j7 = ((float) (j - j2)) * (((float) (j5 - j4)) / ((float) (j3 - j2)));
        return zzaht.zzz(((j4 + j7) - j6) - (j7 / 20), j4, (-1) + j5);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzg(zzpg zzpgVar, long j, long j2) {
        zzpgVar.zze = j;
        zzpgVar.zzg = j2;
        zzpgVar.zzi();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzh(zzpg zzpgVar, long j, long j2) {
        zzpgVar.zzd = j;
        zzpgVar.zzf = j2;
        zzpgVar.zzi();
    }

    private final void zzi() {
        this.zzh = zza(this.zzb, this.zzd, this.zze, this.zzf, this.zzg, this.zzc);
    }
}
