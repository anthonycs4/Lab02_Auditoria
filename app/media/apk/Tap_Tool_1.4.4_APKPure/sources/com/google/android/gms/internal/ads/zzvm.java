package com.google.android.gms.internal.ads;

import java.io.IOException;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzvm implements zzpj {
    private final zzahq zza;
    private final zzahd zzb = new zzahd();

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzvm(zzahq zzahqVar, zzvl zzvlVar) {
        this.zza = zzahqVar;
    }

    @Override // com.google.android.gms.internal.ads.zzpj
    public final zzpi zza(zzps zzpsVar, long j) throws IOException {
        int zzh;
        long j2;
        long zzn = zzpsVar.zzn();
        int min = (int) Math.min(20000L, zzpsVar.zzo() - zzn);
        this.zzb.zza(min);
        ((zzpo) zzpsVar).zzh(this.zzb.zzi(), 0, min, false);
        zzahd zzahdVar = this.zzb;
        int i = -1;
        long j3 = -9223372036854775807L;
        int i2 = -1;
        while (zzahdVar.zzd() >= 4) {
            if (zzvn.zzh(zzahdVar.zzi(), zzahdVar.zzg()) != 442) {
                zzahdVar.zzk(1);
            } else {
                zzahdVar.zzk(4);
                long zze = zzvo.zze(zzahdVar);
                if (zze != -9223372036854775807L) {
                    long zze2 = this.zza.zze(zze);
                    if (zze2 > j) {
                        if (j3 == -9223372036854775807L) {
                            return zzpi.zza(zze2, zzn);
                        }
                        j2 = i2;
                    } else if (100000 + zze2 > j) {
                        j2 = zzahdVar.zzg();
                    } else {
                        i2 = zzahdVar.zzg();
                        j3 = zze2;
                    }
                    return zzpi.zzc(zzn + j2);
                }
                int zze3 = zzahdVar.zze();
                if (zzahdVar.zzd() < 10) {
                    zzahdVar.zzh(zze3);
                } else {
                    zzahdVar.zzk(9);
                    int zzn2 = zzahdVar.zzn() & 7;
                    if (zzahdVar.zzd() < zzn2) {
                        zzahdVar.zzh(zze3);
                    } else {
                        zzahdVar.zzk(zzn2);
                        if (zzahdVar.zzd() < 4) {
                            zzahdVar.zzh(zze3);
                        } else {
                            if (zzvn.zzh(zzahdVar.zzi(), zzahdVar.zzg()) == 443) {
                                zzahdVar.zzk(4);
                                int zzo = zzahdVar.zzo();
                                if (zzahdVar.zzd() < zzo) {
                                    zzahdVar.zzh(zze3);
                                } else {
                                    zzahdVar.zzk(zzo);
                                }
                            }
                            while (true) {
                                if (zzahdVar.zzd() < 4 || (zzh = zzvn.zzh(zzahdVar.zzi(), zzahdVar.zzg())) == 442 || zzh == 441 || (zzh >>> 8) != 1) {
                                    break;
                                }
                                zzahdVar.zzk(4);
                                if (zzahdVar.zzd() >= 2) {
                                    zzahdVar.zzh(Math.min(zzahdVar.zze(), zzahdVar.zzg() + zzahdVar.zzo()));
                                } else {
                                    zzahdVar.zzh(zze3);
                                    break;
                                }
                            }
                        }
                    }
                }
                i = zzahdVar.zzg();
            }
        }
        return j3 != -9223372036854775807L ? zzpi.zzb(j3, zzn + i) : zzpi.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzpj
    public final void zzb() {
        zzahd zzahdVar = this.zzb;
        byte[] bArr = zzaht.zzf;
        int length = bArr.length;
        zzahdVar.zzb(bArr, 0);
    }
}
