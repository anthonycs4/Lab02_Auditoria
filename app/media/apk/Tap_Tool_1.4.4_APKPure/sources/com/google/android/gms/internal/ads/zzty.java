package com.google.android.gms.internal.ads;

import java.io.EOFException;
import java.io.IOException;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
final class zzty {
    public int zza;
    public long zzb;
    public int zzc;
    public int zzd;
    public int zze;
    public final int[] zzf = new int[255];
    private final zzahd zzg = new zzahd(255);

    private static boolean zzd(zzps zzpsVar, byte[] bArr, int i, int i2, boolean z) throws IOException {
        try {
            return zzpsVar.zzh(bArr, 0, i2, z);
        } catch (EOFException e) {
            if (z) {
                return false;
            }
            throw e;
        }
    }

    public final void zza() {
        this.zza = 0;
        this.zzb = 0L;
        this.zzc = 0;
        this.zzd = 0;
        this.zze = 0;
    }

    public final boolean zzb(zzps zzpsVar, long j) throws IOException {
        int i;
        zzafs.zza(zzpsVar.zzn() == zzpsVar.zzm());
        this.zzg.zza(4);
        while (true) {
            i = (j > (-1L) ? 1 : (j == (-1L) ? 0 : -1));
            if ((i == 0 || zzpsVar.zzn() + 4 < j) && zzd(zzpsVar, this.zzg.zzi(), 0, 4, true)) {
                this.zzg.zzh(0);
                if (this.zzg.zzt() != 1332176723) {
                    ((zzpo) zzpsVar).zze(1, false);
                } else {
                    zzpsVar.zzl();
                    return true;
                }
            }
        }
        do {
            if (i != 0 && zzpsVar.zzn() >= j) {
                break;
            }
        } while (zzpsVar.zzd(1) != -1);
        return false;
    }

    public final boolean zzc(zzps zzpsVar, boolean z) throws IOException {
        zza();
        this.zzg.zza(27);
        if (zzd(zzpsVar, this.zzg.zzi(), 0, 27, z) && this.zzg.zzt() == 1332176723) {
            if (this.zzg.zzn() != 0) {
                if (z) {
                    return false;
                }
                throw new zzkr("unsupported bit stream revision");
            }
            this.zza = this.zzg.zzn();
            this.zzb = this.zzg.zzy();
            this.zzg.zzu();
            this.zzg.zzu();
            this.zzg.zzu();
            int zzn = this.zzg.zzn();
            this.zzc = zzn;
            this.zzd = zzn + 27;
            this.zzg.zza(zzn);
            ((zzpo) zzpsVar).zzh(this.zzg.zzi(), 0, this.zzc, false);
            for (int i = 0; i < this.zzc; i++) {
                this.zzf[i] = this.zzg.zzn();
                this.zze += this.zzf[i];
            }
            return true;
        }
        return false;
    }
}
