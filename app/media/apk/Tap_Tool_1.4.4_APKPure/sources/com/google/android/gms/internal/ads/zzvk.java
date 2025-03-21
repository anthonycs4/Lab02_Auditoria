package com.google.android.gms.internal.ads;

import android.util.Log;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzvk implements zzwg {
    private final zzut zza;
    private final zzahc zzb = new zzahc(new byte[10], 10);
    private int zzc = 0;
    private int zzd;
    private zzahq zze;
    private boolean zzf;
    private boolean zzg;
    private boolean zzh;
    private int zzi;
    private int zzj;
    private boolean zzk;

    public zzvk(zzut zzutVar) {
        this.zza = zzutVar;
    }

    private final void zzd(int i) {
        this.zzc = i;
        this.zzd = 0;
    }

    private final boolean zze(zzahd zzahdVar, byte[] bArr, int i) {
        int min = Math.min(zzahdVar.zzd(), i - this.zzd);
        if (min <= 0) {
            return true;
        }
        if (bArr == null) {
            zzahdVar.zzk(min);
        } else {
            zzahdVar.zzm(bArr, this.zzd, min);
        }
        int i2 = this.zzd + min;
        this.zzd = i2;
        return i2 == i;
    }

    @Override // com.google.android.gms.internal.ads.zzwg
    public final void zza(zzahq zzahqVar, zzpu zzpuVar, zzwf zzwfVar) {
        this.zze = zzahqVar;
        this.zza.zzb(zzpuVar, zzwfVar);
    }

    @Override // com.google.android.gms.internal.ads.zzwg
    public final void zzb() {
        this.zzc = 0;
        this.zzd = 0;
        this.zzh = false;
        this.zza.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzwg
    public final void zzc(zzahd zzahdVar, int i) throws zzkr {
        long j;
        zzafs.zzf(this.zze);
        int i2 = -1;
        int i3 = 2;
        if ((i & 1) != 0) {
            int i4 = this.zzc;
            if (i4 != 0 && i4 != 1) {
                if (i4 != 2) {
                    int i5 = this.zzj;
                    if (i5 != -1) {
                        StringBuilder sb = new StringBuilder(59);
                        sb.append("Unexpected start indicator: expected ");
                        sb.append(i5);
                        sb.append(" more bytes");
                        Log.w("PesReader", sb.toString());
                    }
                    this.zza.zze();
                } else {
                    Log.w("PesReader", "Unexpected start indicator reading extended header");
                }
            }
            zzd(1);
        }
        int i6 = i;
        while (zzahdVar.zzd() > 0) {
            int i7 = this.zzc;
            if (i7 != 0) {
                if (i7 != 1) {
                    if (i7 != i3) {
                        int zzd = zzahdVar.zzd();
                        int i8 = this.zzj;
                        int i9 = i8 != i2 ? zzd - i8 : 0;
                        if (i9 > 0) {
                            zzd -= i9;
                            zzahdVar.zzf(zzahdVar.zzg() + zzd);
                        }
                        this.zza.zzd(zzahdVar);
                        int i10 = this.zzj;
                        if (i10 != i2) {
                            int i11 = i10 - zzd;
                            this.zzj = i11;
                            if (i11 == 0) {
                                this.zza.zze();
                                zzd(1);
                            }
                        }
                    } else {
                        if (zze(zzahdVar, this.zzb.zza, Math.min(10, this.zzi)) && zze(zzahdVar, null, this.zzi)) {
                            this.zzb.zzd(0);
                            if (this.zzf) {
                                this.zzb.zzf(4);
                                int zzh = this.zzb.zzh(3);
                                this.zzb.zzf(1);
                                int zzh2 = this.zzb.zzh(15);
                                this.zzb.zzf(1);
                                long zzh3 = (zzh2 << 15) | (zzh << 30) | this.zzb.zzh(15);
                                this.zzb.zzf(1);
                                if (!this.zzh && this.zzg) {
                                    this.zzb.zzf(4);
                                    int zzh4 = this.zzb.zzh(3);
                                    this.zzb.zzf(1);
                                    int zzh5 = this.zzb.zzh(15);
                                    this.zzb.zzf(1);
                                    int zzh6 = this.zzb.zzh(15);
                                    this.zzb.zzf(1);
                                    this.zze.zze((zzh4 << 30) | (zzh5 << 15) | zzh6);
                                    this.zzh = true;
                                }
                                j = this.zze.zze(zzh3);
                            } else {
                                j = -9223372036854775807L;
                            }
                            i6 |= true != this.zzk ? 0 : 4;
                            this.zza.zzc(j, i6);
                            zzd(3);
                            i2 = -1;
                        }
                    }
                } else if (zze(zzahdVar, this.zzb.zza, 9)) {
                    int i12 = 0;
                    this.zzb.zzd(0);
                    int zzh7 = this.zzb.zzh(24);
                    if (zzh7 != 1) {
                        StringBuilder sb2 = new StringBuilder(41);
                        sb2.append("Unexpected start code prefix: ");
                        sb2.append(zzh7);
                        Log.w("PesReader", sb2.toString());
                        i2 = -1;
                        this.zzj = -1;
                    } else {
                        this.zzb.zzf(8);
                        int zzh8 = this.zzb.zzh(16);
                        this.zzb.zzf(5);
                        this.zzk = this.zzb.zzg();
                        this.zzb.zzf(2);
                        this.zzf = this.zzb.zzg();
                        this.zzg = this.zzb.zzg();
                        this.zzb.zzf(6);
                        int zzh9 = this.zzb.zzh(8);
                        this.zzi = zzh9;
                        if (zzh8 == 0) {
                            this.zzj = -1;
                        } else {
                            int i13 = (zzh8 - 3) - zzh9;
                            this.zzj = i13;
                            if (i13 < 0) {
                                StringBuilder sb3 = new StringBuilder(47);
                                sb3.append("Found negative packet payload size: ");
                                sb3.append(i13);
                                Log.w("PesReader", sb3.toString());
                                i2 = -1;
                                this.zzj = -1;
                                i12 = 2;
                            }
                        }
                        i2 = -1;
                        i12 = 2;
                    }
                    zzd(i12);
                } else {
                    i2 = -1;
                }
            } else {
                zzahdVar.zzk(zzahdVar.zzd());
            }
            i3 = 2;
        }
    }
}
