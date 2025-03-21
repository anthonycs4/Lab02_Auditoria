package com.google.android.gms.internal.ads;

import android.util.Log;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
final class zzsn implements zzsl {
    private final long zza;
    private final int zzb;
    private final long zzc;
    private final long zzd;
    private final long zze;
    private final long[] zzf;

    private zzsn(long j, int i, long j2, long j3, long[] jArr) {
        this.zza = j;
        this.zzb = i;
        this.zzc = j2;
        this.zzf = jArr;
        this.zzd = j3;
        this.zze = j3 != -1 ? j + j3 : -1L;
    }

    public static zzsn zzd(long j, long j2, zznw zznwVar, zzahd zzahdVar) {
        int zzB;
        int i = zznwVar.zzg;
        int i2 = zznwVar.zzd;
        int zzv = zzahdVar.zzv();
        if ((zzv & 1) != 1 || (zzB = zzahdVar.zzB()) == 0) {
            return null;
        }
        long zzG = zzaht.zzG(zzB, i * 1000000, i2);
        if ((zzv & 6) != 6) {
            return new zzsn(j2, zznwVar.zzc, zzG, -1L, null);
        }
        long zzt = zzahdVar.zzt();
        long[] jArr = new long[100];
        for (int i3 = 0; i3 < 100; i3++) {
            jArr[i3] = zzahdVar.zzn();
        }
        if (j != -1) {
            long j3 = j2 + zzt;
            if (j != j3) {
                StringBuilder sb = new StringBuilder(67);
                sb.append("XING data size mismatch: ");
                sb.append(j);
                sb.append(", ");
                sb.append(j3);
                Log.w("XingSeeker", sb.toString());
            }
        }
        return new zzsn(j2, zznwVar.zzc, zzG, zzt, jArr);
    }

    private final long zzg(int i) {
        return (this.zzc * i) / 100;
    }

    @Override // com.google.android.gms.internal.ads.zzqm
    public final boolean zza() {
        return this.zzf != null;
    }

    @Override // com.google.android.gms.internal.ads.zzqm
    public final zzqk zzb(long j) {
        long[] jArr;
        if (!zza()) {
            zzqn zzqnVar = new zzqn(0L, this.zza + this.zzb);
            return new zzqk(zzqnVar, zzqnVar);
        }
        long zzz = zzaht.zzz(j, 0L, this.zzc);
        double d = (zzz * 100.0d) / this.zzc;
        double d2 = 0.0d;
        if (d > 0.0d) {
            if (d >= 100.0d) {
                d2 = 256.0d;
            } else {
                int i = (int) d;
                double d3 = ((long[]) zzafs.zzf(this.zzf))[i];
                d2 = d3 + ((d - i) * ((i == 99 ? 256.0d : jArr[i + 1]) - d3));
            }
        }
        zzqn zzqnVar2 = new zzqn(zzz, this.zza + zzaht.zzz(Math.round((d2 / 256.0d) * this.zzd), this.zzb, this.zzd - 1));
        return new zzqk(zzqnVar2, zzqnVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzqm
    public final long zzc() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzsl
    public final long zze(long j) {
        long j2 = j - this.zza;
        if (!zza() || j2 <= this.zzb) {
            return 0L;
        }
        long[] jArr = (long[]) zzafs.zzf(this.zzf);
        double d = (j2 * 256.0d) / this.zzd;
        int zzE = zzaht.zzE(jArr, (long) d, true, true);
        long zzg = zzg(zzE);
        long j3 = jArr[zzE];
        int i = zzE + 1;
        long zzg2 = zzg(i);
        long j4 = zzE == 99 ? 256L : jArr[i];
        return zzg + Math.round((j3 == j4 ? 0.0d : (d - j3) / (j4 - j3)) * (zzg2 - zzg));
    }

    @Override // com.google.android.gms.internal.ads.zzsl
    public final long zzf() {
        return this.zze;
    }
}
