package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.Objects;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzrd implements zzpr {
    public static final zzpx zza = zzrc.zza;
    private final byte[] zzb;
    private final zzahd zzc;
    private final zzpy zzd;
    private zzpu zze;
    private zzqq zzf;
    private int zzg;
    private zzxu zzh;
    private zzqe zzi;
    private int zzj;
    private int zzk;
    private zzrb zzl;
    private int zzm;
    private long zzn;

    public zzrd() {
        this(0);
    }

    private final void zzb() {
        long j = this.zzn;
        zzqe zzqeVar = this.zzi;
        int i = zzaht.zza;
        this.zzf.zzd((j * 1000000) / zzqeVar.zze, 1, this.zzm, 0, null);
    }

    @Override // com.google.android.gms.internal.ads.zzpr
    public final boolean zzd(zzps zzpsVar) throws IOException {
        zzqb.zza(zzpsVar, false);
        zzahd zzahdVar = new zzahd(4);
        ((zzpo) zzpsVar).zzh(zzahdVar.zzi(), 0, 4, false);
        return zzahdVar.zzt() == 1716281667;
    }

    @Override // com.google.android.gms.internal.ads.zzpr
    public final void zze(zzpu zzpuVar) {
        this.zze = zzpuVar;
        this.zzf = zzpuVar.zzbi(0, 1);
        zzpuVar.zzbj();
    }

    public zzrd(int i) {
        this.zzb = new byte[42];
        this.zzc = new zzahd(new byte[32768], 0);
        this.zzd = new zzpy();
        this.zzg = 0;
    }

    @Override // com.google.android.gms.internal.ads.zzpr
    public final void zzg(long j, long j2) {
        if (j == 0) {
            this.zzg = 0;
        } else {
            zzrb zzrbVar = this.zzl;
            if (zzrbVar != null) {
                zzrbVar.zzb(j2);
            }
        }
        this.zzn = j2 != 0 ? -1L : 0L;
        this.zzm = 0;
        this.zzc.zza(0);
    }

    private final long zza(zzahd zzahdVar, boolean z) {
        boolean z2;
        Objects.requireNonNull(this.zzi);
        int zzg = zzahdVar.zzg();
        while (zzg <= zzahdVar.zze() - 16) {
            zzahdVar.zzh(zzg);
            if (zzpz.zza(zzahdVar, this.zzi, this.zzk, this.zzd)) {
                zzahdVar.zzh(zzg);
                return this.zzd.zza;
            }
            zzg++;
        }
        if (z) {
            while (zzg <= zzahdVar.zze() - this.zzj) {
                zzahdVar.zzh(zzg);
                try {
                    z2 = zzpz.zza(zzahdVar, this.zzi, this.zzk, this.zzd);
                } catch (IndexOutOfBoundsException unused) {
                    z2 = false;
                }
                if (zzahdVar.zzg() <= zzahdVar.zze() && z2) {
                    zzahdVar.zzh(zzg);
                    return this.zzd.zza;
                }
                zzg++;
            }
            zzahdVar.zzh(zzahdVar.zze());
            return -1L;
        }
        zzahdVar.zzh(zzg);
        return -1L;
    }

    @Override // com.google.android.gms.internal.ads.zzpr
    public final int zzf(zzps zzpsVar, zzqj zzqjVar) throws IOException {
        boolean zzg;
        zzqe zzqeVar;
        zzqm zzqlVar;
        boolean z;
        int i = this.zzg;
        if (i == 0) {
            zzpsVar.zzl();
            long zzm = zzpsVar.zzm();
            zzxu zza2 = zzqb.zza(zzpsVar, true);
            ((zzpo) zzpsVar).zze((int) (zzpsVar.zzm() - zzm), false);
            this.zzh = zza2;
            this.zzg = 1;
            return 0;
        } else if (i == 1) {
            ((zzpo) zzpsVar).zzh(this.zzb, 0, 42, false);
            zzpsVar.zzl();
            this.zzg = 2;
            return 0;
        } else if (i == 2) {
            zzahd zzahdVar = new zzahd(4);
            ((zzpo) zzpsVar).zzb(zzahdVar.zzi(), 0, 4, false);
            if (zzahdVar.zzt() == 1716281667) {
                this.zzg = 3;
                return 0;
            }
            throw new zzkr("Failed to read FLAC stream marker.");
        } else if (i == 3) {
            zzqa zzqaVar = new zzqa(this.zzi);
            do {
                zzpsVar.zzl();
                zzahc zzahcVar = new zzahc(new byte[4], 4);
                zzpo zzpoVar = (zzpo) zzpsVar;
                zzpoVar.zzh(zzahcVar.zza, 0, 4, false);
                zzg = zzahcVar.zzg();
                int zzh = zzahcVar.zzh(7);
                int zzh2 = zzahcVar.zzh(24) + 4;
                if (zzh == 0) {
                    byte[] bArr = new byte[38];
                    zzpoVar.zzb(bArr, 0, 38, false);
                    zzqaVar.zza = new zzqe(bArr, 4);
                } else {
                    zzqe zzqeVar2 = zzqaVar.zza;
                    if (zzqeVar2 == null) {
                        throw new IllegalArgumentException();
                    }
                    if (zzh == 3) {
                        zzahd zzahdVar2 = new zzahd(zzh2);
                        zzpoVar.zzb(zzahdVar2.zzi(), 0, zzh2, false);
                        zzqaVar.zza = zzqeVar2.zze(zzqb.zzb(zzahdVar2));
                    } else if (zzh == 4) {
                        zzahd zzahdVar3 = new zzahd(zzh2);
                        zzpoVar.zzb(zzahdVar3.zzi(), 0, zzh2, false);
                        zzahdVar3.zzk(4);
                        zzqaVar.zza = zzqeVar2.zzf(Arrays.asList(zzqv.zzb(zzahdVar3, false, false).zzb));
                    } else if (zzh != 6) {
                        zzpoVar.zze(zzh2, false);
                    } else {
                        zzahd zzahdVar4 = new zzahd(zzh2);
                        zzpoVar.zzb(zzahdVar4.zzi(), 0, zzh2, false);
                        zzahdVar4.zzk(4);
                        int zzv = zzahdVar4.zzv();
                        String zzE = zzahdVar4.zzE(zzahdVar4.zzv(), zzfeg.zza);
                        String zzE2 = zzahdVar4.zzE(zzahdVar4.zzv(), zzfeg.zzc);
                        int zzv2 = zzahdVar4.zzv();
                        int zzv3 = zzahdVar4.zzv();
                        int zzv4 = zzahdVar4.zzv();
                        int zzv5 = zzahdVar4.zzv();
                        int zzv6 = zzahdVar4.zzv();
                        byte[] bArr2 = new byte[zzv6];
                        zzahdVar4.zzm(bArr2, 0, zzv6);
                        zzqaVar.zza = zzqeVar2.zzg(Collections.singletonList(new zzya(zzv, zzE, zzE2, zzv2, zzv3, zzv4, zzv5, bArr2)));
                    }
                }
                zzqeVar = zzqaVar.zza;
                int i2 = zzaht.zza;
                this.zzi = zzqeVar;
            } while (!zzg);
            Objects.requireNonNull(zzqeVar);
            this.zzj = Math.max(zzqeVar.zzc, 6);
            this.zzf.zza(this.zzi.zzc(this.zzb, this.zzh));
            this.zzg = 4;
            return 0;
        } else if (i == 4) {
            zzpsVar.zzl();
            zzahd zzahdVar5 = new zzahd(2);
            ((zzpo) zzpsVar).zzh(zzahdVar5.zzi(), 0, 2, false);
            int zzo = zzahdVar5.zzo();
            if ((zzo >> 2) != 16382) {
                zzpsVar.zzl();
                throw new zzkr("First frame does not start with sync code.");
            }
            zzpsVar.zzl();
            this.zzk = zzo;
            zzpu zzpuVar = this.zze;
            int i3 = zzaht.zza;
            long zzn = zzpsVar.zzn();
            long zzo2 = zzpsVar.zzo();
            zzqe zzqeVar3 = this.zzi;
            Objects.requireNonNull(zzqeVar3);
            if (zzqeVar3.zzk != null) {
                zzqlVar = new zzqc(zzqeVar3, zzn);
            } else if (zzo2 == -1 || zzqeVar3.zzj <= 0) {
                zzqlVar = new zzql(zzqeVar3.zza(), 0L);
            } else {
                zzrb zzrbVar = new zzrb(zzqeVar3, this.zzk, zzn, zzo2);
                this.zzl = zzrbVar;
                zzqlVar = zzrbVar.zza();
            }
            zzpuVar.zzbk(zzqlVar);
            this.zzg = 5;
            return 0;
        } else {
            Objects.requireNonNull(this.zzf);
            Objects.requireNonNull(this.zzi);
            zzrb zzrbVar2 = this.zzl;
            if (zzrbVar2 == null || !zzrbVar2.zzc()) {
                if (this.zzn == -1) {
                    this.zzn = zzpz.zzc(zzpsVar, this.zzi);
                    return 0;
                }
                int zze = this.zzc.zze();
                if (zze < 32768) {
                    int zza3 = zzpsVar.zza(this.zzc.zzi(), zze, 32768 - zze);
                    z = zza3 == -1;
                    if (!z) {
                        this.zzc.zzf(zze + zza3);
                    } else if (this.zzc.zzd() == 0) {
                        zzb();
                        return -1;
                    }
                } else {
                    z = false;
                }
                int zzg2 = this.zzc.zzg();
                int i4 = this.zzm;
                int i5 = this.zzj;
                if (i4 < i5) {
                    zzahd zzahdVar6 = this.zzc;
                    zzahdVar6.zzk(Math.min(i5 - i4, zzahdVar6.zzd()));
                }
                long zza4 = zza(this.zzc, z);
                int zzg3 = this.zzc.zzg() - zzg2;
                this.zzc.zzh(zzg2);
                zzqo.zzb(this.zzf, this.zzc, zzg3);
                this.zzm += zzg3;
                if (zza4 != -1) {
                    zzb();
                    this.zzm = 0;
                    this.zzn = zza4;
                }
                if (this.zzc.zzd() >= 16) {
                    return 0;
                }
                int zzd = this.zzc.zzd();
                System.arraycopy(this.zzc.zzi(), this.zzc.zzg(), this.zzc.zzi(), 0, zzd);
                this.zzc.zzh(0);
                this.zzc.zzf(zzd);
                return 0;
            }
            return this.zzl.zzd(zzpsVar, zzqjVar);
        }
    }
}
