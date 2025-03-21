package com.google.android.gms.internal.ads;

import java.io.IOException;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
final class zzwm implements zzwl {
    private final zzpu zza;
    private final zzqq zzb;
    private final zzwo zzc;
    private final zzjq zzd;
    private final int zze;
    private long zzf;
    private int zzg;
    private long zzh;

    public zzwm(zzpu zzpuVar, zzqq zzqqVar, zzwo zzwoVar, String str, int i) throws zzkr {
        this.zza = zzpuVar;
        this.zzb = zzqqVar;
        this.zzc = zzwoVar;
        int i2 = (zzwoVar.zzb * zzwoVar.zze) / 8;
        int i3 = zzwoVar.zzd;
        if (i3 == i2) {
            int i4 = zzwoVar.zzc * i2;
            int i5 = i4 * 8;
            int max = Math.max(i2, i4 / 10);
            this.zze = max;
            zzjp zzjpVar = new zzjp();
            zzjpVar.zzj(str);
            zzjpVar.zzf(i5);
            zzjpVar.zzg(i5);
            zzjpVar.zzk(max);
            zzjpVar.zzw(zzwoVar.zzb);
            zzjpVar.zzx(zzwoVar.zzc);
            zzjpVar.zzy(i);
            this.zzd = zzjpVar.zzD();
            return;
        }
        StringBuilder sb = new StringBuilder(50);
        sb.append("Expected block size: ");
        sb.append(i2);
        sb.append("; got: ");
        sb.append(i3);
        throw new zzkr(sb.toString());
    }

    @Override // com.google.android.gms.internal.ads.zzwl
    public final void zza(long j) {
        this.zzf = j;
        this.zzg = 0;
        this.zzh = 0L;
    }

    @Override // com.google.android.gms.internal.ads.zzwl
    public final void zzb(int i, long j) {
        this.zza.zzbk(new zzwr(this.zzc, 1, i, j));
        this.zzb.zza(this.zzd);
    }

    @Override // com.google.android.gms.internal.ads.zzwl
    public final boolean zzc(zzps zzpsVar, long j) throws IOException {
        int i;
        zzwo zzwoVar;
        int i2;
        int i3;
        long j2 = j;
        while (true) {
            i = (j2 > 0L ? 1 : (j2 == 0L ? 0 : -1));
            if (i <= 0 || (i2 = this.zzg) >= (i3 = this.zze)) {
                break;
            }
            int zza = zzqo.zza(this.zzb, zzpsVar, (int) Math.min(i3 - i2, j2), true);
            if (zza == -1) {
                j2 = 0;
            } else {
                this.zzg += zza;
                j2 -= zza;
            }
        }
        int i4 = this.zzc.zzd;
        int i5 = this.zzg / i4;
        if (i5 > 0) {
            long j3 = this.zzf;
            long zzG = zzaht.zzG(this.zzh, 1000000L, zzwoVar.zzc);
            int i6 = i5 * i4;
            int i7 = this.zzg - i6;
            this.zzb.zzd(j3 + zzG, 1, i6, i7, null);
            this.zzh += i5;
            this.zzg = i7;
        }
        return i <= 0;
    }
}
