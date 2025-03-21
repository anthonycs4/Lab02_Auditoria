package com.google.android.gms.internal.ads;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzts implements zztz {
    private final zzty zza;
    private final long zzb;
    private final long zzc;
    private final zzue zzd;
    private int zze;
    private long zzf;
    private long zzg;
    private long zzh;
    private long zzi;
    private long zzj;
    private long zzk;
    private long zzl;

    public zzts(zzue zzueVar, long j, long j2, long j3, long j4, boolean z) {
        zzafs.zza(j >= 0 && j2 > j);
        this.zzd = zzueVar;
        this.zzb = j;
        this.zzc = j2;
        if (j3 == j2 - j || z) {
            this.zzf = j4;
            this.zze = 4;
        } else {
            this.zze = 0;
        }
        this.zza = new zzty();
    }

    @Override // com.google.android.gms.internal.ads.zztz
    public final void zzb(long j) {
        this.zzh = zzaht.zzz(j, 0L, this.zzf - 1);
        this.zze = 2;
        this.zzi = this.zzb;
        this.zzj = this.zzc;
        this.zzk = 0L;
        this.zzl = this.zzf;
    }

    @Override // com.google.android.gms.internal.ads.zztz
    public final /* bridge */ /* synthetic */ zzqm zzc() {
        if (this.zzf != 0) {
            return new zztr(this, null);
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x00b8 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00b9  */
    @Override // com.google.android.gms.internal.ads.zztz
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long zza(com.google.android.gms.internal.ads.zzps r24) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 347
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzts.zza(com.google.android.gms.internal.ads.zzps):long");
    }
}
