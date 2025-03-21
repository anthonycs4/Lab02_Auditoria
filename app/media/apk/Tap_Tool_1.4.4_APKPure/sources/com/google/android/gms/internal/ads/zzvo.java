package com.google.android.gms.internal.ads;

import java.io.IOException;
import kotlin.UByte;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
final class zzvo {
    private boolean zzc;
    private boolean zzd;
    private boolean zze;
    private final zzahq zza = new zzahq(0);
    private long zzf = -9223372036854775807L;
    private long zzg = -9223372036854775807L;
    private long zzh = -9223372036854775807L;
    private final zzahd zzb = new zzahd();

    public static long zze(zzahd zzahdVar) {
        int zzg = zzahdVar.zzg();
        if (zzahdVar.zzd() < 9) {
            return -9223372036854775807L;
        }
        byte[] bArr = new byte[9];
        zzahdVar.zzm(bArr, 0, 9);
        zzahdVar.zzh(zzg);
        if ((bArr[0] & 196) == 68 && (bArr[2] & 4) == 4 && (bArr[4] & 4) == 4 && (bArr[5] & 1) == 1 && (bArr[8] & 3) == 3) {
            long j = bArr[0];
            byte b = bArr[1];
            long j2 = bArr[2];
            return ((bArr[3] & 255) << 5) | ((j & 3) << 28) | (((56 & j) >> 3) << 30) | ((b & 255) << 20) | (((j2 & 248) >> 3) << 15) | ((j2 & 3) << 13) | ((bArr[4] & 248) >> 3);
        }
        return -9223372036854775807L;
    }

    private final int zzf(zzps zzpsVar) {
        zzahd zzahdVar = this.zzb;
        byte[] bArr = zzaht.zzf;
        int length = bArr.length;
        zzahdVar.zzb(bArr, 0);
        this.zzc = true;
        zzpsVar.zzl();
        return 0;
    }

    private static final int zzg(byte[] bArr, int i) {
        return (bArr[i + 3] & UByte.MAX_VALUE) | ((bArr[i] & UByte.MAX_VALUE) << 24) | ((bArr[i + 1] & UByte.MAX_VALUE) << 16) | ((bArr[i + 2] & UByte.MAX_VALUE) << 8);
    }

    public final boolean zza() {
        return this.zzc;
    }

    public final zzahq zzb() {
        return this.zza;
    }

    public final int zzc(zzps zzpsVar, zzqj zzqjVar) throws IOException {
        long j = -9223372036854775807L;
        if (!this.zze) {
            long zzo = zzpsVar.zzo();
            int min = (int) Math.min(20000L, zzo);
            long j2 = zzo - min;
            if (zzpsVar.zzn() != j2) {
                zzqjVar.zza = j2;
                return 1;
            }
            this.zzb.zza(min);
            zzpsVar.zzl();
            ((zzpo) zzpsVar).zzh(this.zzb.zzi(), 0, min, false);
            zzahd zzahdVar = this.zzb;
            int zzg = zzahdVar.zzg();
            int zze = zzahdVar.zze() - 4;
            while (true) {
                if (zze < zzg) {
                    break;
                }
                if (zzg(zzahdVar.zzi(), zze) == 442) {
                    zzahdVar.zzh(zze + 4);
                    long zze2 = zze(zzahdVar);
                    if (zze2 != -9223372036854775807L) {
                        j = zze2;
                        break;
                    }
                }
                zze--;
            }
            this.zzg = j;
            this.zze = true;
            return 0;
        } else if (this.zzg == -9223372036854775807L) {
            zzf(zzpsVar);
            return 0;
        } else if (this.zzd) {
            long j3 = this.zzf;
            if (j3 == -9223372036854775807L) {
                zzf(zzpsVar);
                return 0;
            }
            this.zzh = this.zza.zze(this.zzg) - this.zza.zze(j3);
            zzf(zzpsVar);
            return 0;
        } else {
            int min2 = (int) Math.min(20000L, zzpsVar.zzo());
            if (zzpsVar.zzn() != 0) {
                zzqjVar.zza = 0L;
                return 1;
            }
            this.zzb.zza(min2);
            zzpsVar.zzl();
            ((zzpo) zzpsVar).zzh(this.zzb.zzi(), 0, min2, false);
            zzahd zzahdVar2 = this.zzb;
            int zzg2 = zzahdVar2.zzg();
            int zze3 = zzahdVar2.zze();
            while (true) {
                if (zzg2 >= zze3 - 3) {
                    break;
                }
                if (zzg(zzahdVar2.zzi(), zzg2) == 442) {
                    zzahdVar2.zzh(zzg2 + 4);
                    long zze4 = zze(zzahdVar2);
                    if (zze4 != -9223372036854775807L) {
                        j = zze4;
                        break;
                    }
                }
                zzg2++;
            }
            this.zzf = j;
            this.zzd = true;
            return 0;
        }
    }

    public final long zzd() {
        return this.zzh;
    }
}
