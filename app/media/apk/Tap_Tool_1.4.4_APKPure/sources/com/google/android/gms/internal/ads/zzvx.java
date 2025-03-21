package com.google.android.gms.internal.ads;

import java.io.IOException;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
final class zzvx {
    private boolean zzc;
    private boolean zzd;
    private boolean zze;
    private final zzahq zza = new zzahq(0);
    private long zzf = -9223372036854775807L;
    private long zzg = -9223372036854775807L;
    private long zzh = -9223372036854775807L;
    private final zzahd zzb = new zzahd();

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzvx(int i) {
    }

    private final int zze(zzps zzpsVar) {
        zzahd zzahdVar = this.zzb;
        byte[] bArr = zzaht.zzf;
        int length = bArr.length;
        zzahdVar.zzb(bArr, 0);
        this.zzc = true;
        zzpsVar.zzl();
        return 0;
    }

    public final boolean zza() {
        return this.zzc;
    }

    public final int zzb(zzps zzpsVar, zzqj zzqjVar, int i) throws IOException {
        if (i <= 0) {
            zze(zzpsVar);
            return 0;
        }
        long j = -9223372036854775807L;
        if (!this.zze) {
            long zzo = zzpsVar.zzo();
            int min = (int) Math.min(112800L, zzo);
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
            int zze = zzahdVar.zze();
            while (true) {
                zze--;
                if (zze < zzg) {
                    break;
                } else if (zzahdVar.zzi()[zze] == 71) {
                    long zzb = zzwh.zzb(zzahdVar, zze, i);
                    if (zzb != -9223372036854775807L) {
                        j = zzb;
                        break;
                    }
                }
            }
            this.zzg = j;
            this.zze = true;
            return 0;
        } else if (this.zzg == -9223372036854775807L) {
            zze(zzpsVar);
            return 0;
        } else if (this.zzd) {
            long j3 = this.zzf;
            if (j3 == -9223372036854775807L) {
                zze(zzpsVar);
                return 0;
            }
            this.zzh = this.zza.zze(this.zzg) - this.zza.zze(j3);
            zze(zzpsVar);
            return 0;
        } else {
            int min2 = (int) Math.min(112800L, zzpsVar.zzo());
            if (zzpsVar.zzn() != 0) {
                zzqjVar.zza = 0L;
                return 1;
            }
            this.zzb.zza(min2);
            zzpsVar.zzl();
            ((zzpo) zzpsVar).zzh(this.zzb.zzi(), 0, min2, false);
            zzahd zzahdVar2 = this.zzb;
            int zzg2 = zzahdVar2.zzg();
            int zze2 = zzahdVar2.zze();
            while (true) {
                if (zzg2 >= zze2) {
                    break;
                }
                if (zzahdVar2.zzi()[zzg2] == 71) {
                    long zzb2 = zzwh.zzb(zzahdVar2, zzg2, i);
                    if (zzb2 != -9223372036854775807L) {
                        j = zzb2;
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

    public final long zzc() {
        return this.zzh;
    }

    public final zzahq zzd() {
        return this.zza;
    }
}
