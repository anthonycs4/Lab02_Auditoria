package com.google.android.gms.internal.ads;

import java.io.IOException;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
final class zzvv implements zzpj {
    private final zzahq zza;
    private final zzahd zzb = new zzahd();
    private final int zzc;

    public zzvv(int i, zzahq zzahqVar, int i2) {
        this.zzc = i;
        this.zza = zzahqVar;
    }

    @Override // com.google.android.gms.internal.ads.zzpj
    public final zzpi zza(zzps zzpsVar, long j) throws IOException {
        int zza;
        int zza2;
        long j2;
        long zzn = zzpsVar.zzn();
        int min = (int) Math.min(112800L, zzpsVar.zzo() - zzn);
        this.zzb.zza(min);
        ((zzpo) zzpsVar).zzh(this.zzb.zzi(), 0, min, false);
        zzahd zzahdVar = this.zzb;
        int zze = zzahdVar.zze();
        long j3 = -1;
        long j4 = -1;
        long j5 = -9223372036854775807L;
        while (zzahdVar.zzd() >= 188 && (zza2 = (zza = zzwh.zza(zzahdVar.zzi(), zzahdVar.zzg(), zze)) + 188) <= zze) {
            long zzb = zzwh.zzb(zzahdVar, zza, this.zzc);
            if (zzb != -9223372036854775807L) {
                long zze2 = this.zza.zze(zzb);
                if (zze2 > j) {
                    if (j5 == -9223372036854775807L) {
                        return zzpi.zza(zze2, zzn);
                    }
                    j2 = zzn + j4;
                } else if (100000 + zze2 > j) {
                    j2 = zzn + zza;
                } else {
                    j4 = zza;
                    j5 = zze2;
                }
                return zzpi.zzc(j2);
            }
            zzahdVar.zzh(zza2);
            j3 = zza2;
        }
        return j5 != -9223372036854775807L ? zzpi.zzb(j5, zzn + j3) : zzpi.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzpj
    public final void zzb() {
        zzahd zzahdVar = this.zzb;
        byte[] bArr = zzaht.zzf;
        int length = bArr.length;
        zzahdVar.zzb(bArr, 0);
    }
}
