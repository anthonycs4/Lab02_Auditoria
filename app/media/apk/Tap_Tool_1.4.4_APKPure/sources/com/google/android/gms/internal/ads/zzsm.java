package com.google.android.gms.internal.ads;

import android.util.Log;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
final class zzsm implements zzsl {
    private final long[] zza;
    private final long[] zzb;
    private final long zzc;
    private final long zzd;

    private zzsm(long[] jArr, long[] jArr2, long j, long j2) {
        this.zza = jArr;
        this.zzb = jArr2;
        this.zzc = j;
        this.zzd = j2;
    }

    public static zzsm zzd(long j, long j2, zznw zznwVar, zzahd zzahdVar) {
        int zzn;
        zzahdVar.zzk(10);
        int zzv = zzahdVar.zzv();
        if (zzv <= 0) {
            return null;
        }
        int i = zznwVar.zzd;
        long zzG = zzaht.zzG(zzv, (i >= 32000 ? 1152 : 576) * 1000000, i);
        int zzo = zzahdVar.zzo();
        int zzo2 = zzahdVar.zzo();
        int zzo3 = zzahdVar.zzo();
        zzahdVar.zzk(2);
        long j3 = j2 + zznwVar.zzc;
        long[] jArr = new long[zzo];
        long[] jArr2 = new long[zzo];
        int i2 = 0;
        long j4 = j2;
        while (i2 < zzo) {
            int i3 = zzo2;
            long j5 = j3;
            jArr[i2] = (i2 * zzG) / zzo;
            jArr2[i2] = Math.max(j4, j5);
            if (zzo3 == 1) {
                zzn = zzahdVar.zzn();
            } else if (zzo3 == 2) {
                zzn = zzahdVar.zzo();
            } else if (zzo3 == 3) {
                zzn = zzahdVar.zzr();
            } else if (zzo3 != 4) {
                return null;
            } else {
                zzn = zzahdVar.zzB();
            }
            j4 += zzn * i3;
            i2++;
            j3 = j5;
            zzo2 = i3;
        }
        if (j != -1 && j != j4) {
            StringBuilder sb = new StringBuilder(67);
            sb.append("VBRI data size mismatch: ");
            sb.append(j);
            sb.append(", ");
            sb.append(j4);
            Log.w("VbriSeeker", sb.toString());
        }
        return new zzsm(jArr, jArr2, zzG, j4);
    }

    @Override // com.google.android.gms.internal.ads.zzqm
    public final boolean zza() {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzqm
    public final zzqk zzb(long j) {
        int zzE = zzaht.zzE(this.zza, j, true, true);
        zzqn zzqnVar = new zzqn(this.zza[zzE], this.zzb[zzE]);
        if (zzqnVar.zzb < j) {
            long[] jArr = this.zza;
            if (zzE != jArr.length - 1) {
                int i = zzE + 1;
                return new zzqk(zzqnVar, new zzqn(jArr[i], this.zzb[i]));
            }
        }
        return new zzqk(zzqnVar, zzqnVar);
    }

    @Override // com.google.android.gms.internal.ads.zzqm
    public final long zzc() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzsl
    public final long zze(long j) {
        return this.zza[zzaht.zzE(this.zzb, j, true, true)];
    }

    @Override // com.google.android.gms.internal.ads.zzsl
    public final long zzf() {
        return this.zzd;
    }
}
