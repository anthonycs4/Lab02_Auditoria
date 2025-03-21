package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
final class zzwk implements zzwl {
    private static final int[] zza = {-1, -1, -1, -1, 2, 4, 6, 8, -1, -1, -1, -1, 2, 4, 6, 8};
    private static final int[] zzb = {7, 8, 9, 10, 11, 12, 13, 14, 16, 17, 19, 21, 23, 25, 28, 31, 34, 37, 41, 45, 50, 55, 60, 66, 73, 80, 88, 97, 107, 118, 130, 143, 157, 173, 190, 209, 230, 253, 279, 307, 337, 371, 408, 449, 494, 544, 598, 658, 724, 796, 876, 963, 1060, 1166, 1282, 1411, 1552, 1707, 1878, 2066, 2272, 2499, 2749, 3024, 3327, 3660, 4026, 4428, 4871, 5358, 5894, 6484, 7132, 7845, 8630, 9493, 10442, 11487, 12635, 13899, 15289, 16818, 18500, 20350, 22385, 24623, 27086, 29794, 32767};
    private final zzpu zzc;
    private final zzqq zzd;
    private final zzwo zze;
    private final int zzf;
    private final byte[] zzg;
    private final zzahd zzh;
    private final int zzi;
    private final zzjq zzj;
    private int zzk;
    private long zzl;
    private int zzm;
    private long zzn;

    public zzwk(zzpu zzpuVar, zzqq zzqqVar, zzwo zzwoVar) throws zzkr {
        this.zzc = zzpuVar;
        this.zzd = zzqqVar;
        this.zze = zzwoVar;
        int max = Math.max(1, zzwoVar.zzc / 10);
        this.zzi = max;
        zzahd zzahdVar = new zzahd(zzwoVar.zzf);
        zzahdVar.zzp();
        int zzp = zzahdVar.zzp();
        this.zzf = zzp;
        int i = zzwoVar.zzb;
        int i2 = (((zzwoVar.zzd - (i * 4)) * 8) / (zzwoVar.zze * i)) + 1;
        if (zzp != i2) {
            StringBuilder sb = new StringBuilder(56);
            sb.append("Expected frames per block: ");
            sb.append(i2);
            sb.append("; got: ");
            sb.append(zzp);
            throw new zzkr(sb.toString());
        }
        int zzx = zzaht.zzx(max, zzp);
        this.zzg = new byte[zzwoVar.zzd * zzx];
        this.zzh = new zzahd(zzx * (zzp + zzp) * i);
        int i3 = ((zzwoVar.zzc * zzwoVar.zzd) * 8) / zzp;
        zzjp zzjpVar = new zzjp();
        zzjpVar.zzj("audio/raw");
        zzjpVar.zzf(i3);
        zzjpVar.zzg(i3);
        zzjpVar.zzk((max + max) * i);
        zzjpVar.zzw(zzwoVar.zzb);
        zzjpVar.zzx(zzwoVar.zzc);
        zzjpVar.zzy(2);
        this.zzj = zzjpVar.zzD();
    }

    private final void zzd(int i) {
        long j = this.zzl;
        long zzG = zzaht.zzG(this.zzn, 1000000L, this.zze.zzc);
        int zzf = zzf(i);
        this.zzd.zzd(j + zzG, 1, zzf, this.zzm - zzf, null);
        this.zzn += i;
        this.zzm -= zzf;
    }

    private final int zze(int i) {
        int i2 = this.zze.zzb;
        return i / (i2 + i2);
    }

    private final int zzf(int i) {
        return (i + i) * this.zze.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzwl
    public final void zza(long j) {
        this.zzk = 0;
        this.zzl = j;
        this.zzm = 0;
        this.zzn = 0L;
    }

    @Override // com.google.android.gms.internal.ads.zzwl
    public final void zzb(int i, long j) {
        this.zzc.zzbk(new zzwr(this.zze, this.zzf, i, j));
        this.zzd.zza(this.zzj);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0024  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x003b -> B:4:0x001f). Please submit an issue!!! */
    @Override // com.google.android.gms.internal.ads.zzwl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean zzc(com.google.android.gms.internal.ads.zzps r20, long r21) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 348
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzwk.zzc(com.google.android.gms.internal.ads.zzps, long):boolean");
    }
}
