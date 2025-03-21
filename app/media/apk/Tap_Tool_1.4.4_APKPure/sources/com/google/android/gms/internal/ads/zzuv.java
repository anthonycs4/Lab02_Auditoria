package com.google.android.gms.internal.ads;

import android.util.Pair;
import java.util.Arrays;
import java.util.Collections;
import java.util.Objects;
import kotlin.UByte;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzuv implements zzut {
    private static final double[] zzc = {23.976023976023978d, 24.0d, 25.0d, 29.97002997002997d, 30.0d, 50.0d, 59.94005994005994d, 60.0d};
    private String zza;
    private zzqq zzb;
    private final zzwi zzd;
    private final zzahd zze;
    private final zzvi zzf;
    private final boolean[] zzg;
    private final zzuu zzh;
    private long zzi;
    private boolean zzj;
    private boolean zzk;
    private long zzl;
    private long zzm;
    private long zzn;
    private long zzo;
    private boolean zzp;
    private boolean zzq;

    public zzuv() {
        this(null);
    }

    @Override // com.google.android.gms.internal.ads.zzut
    public final void zza() {
        zzagv.zze(this.zzg);
        this.zzh.zza();
        zzvi zzviVar = this.zzf;
        if (zzviVar != null) {
            zzviVar.zza();
        }
        this.zzi = 0L;
        this.zzj = false;
    }

    @Override // com.google.android.gms.internal.ads.zzut
    public final void zzb(zzpu zzpuVar, zzwf zzwfVar) {
        zzwfVar.zza();
        this.zza = zzwfVar.zzc();
        this.zzb = zzpuVar.zzbi(zzwfVar.zzb(), 2);
        zzwi zzwiVar = this.zzd;
        if (zzwiVar != null) {
            zzwiVar.zza(zzpuVar, zzwfVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzut
    public final void zzc(long j, int i) {
        this.zzm = j;
    }

    @Override // com.google.android.gms.internal.ads.zzut
    public final void zzd(zzahd zzahdVar) {
        int i;
        float f;
        int i2;
        float f2;
        int i3;
        long j;
        int i4;
        zzafs.zzf(this.zzb);
        int zzg = zzahdVar.zzg();
        int zze = zzahdVar.zze();
        byte[] zzi = zzahdVar.zzi();
        this.zzi += zzahdVar.zzd();
        zzqo.zzb(this.zzb, zzahdVar, zzahdVar.zzd());
        while (true) {
            int zzd = zzagv.zzd(zzi, zzg, zze, this.zzg);
            if (zzd == zze) {
                break;
            }
            int i5 = zzd + 3;
            int i6 = zzahdVar.zzi()[i5] & UByte.MAX_VALUE;
            int i7 = zzd - zzg;
            if (!this.zzk) {
                if (i7 > 0) {
                    this.zzh.zzc(zzi, zzg, zzd);
                }
                if (this.zzh.zzb(i6, i7 < 0 ? -i7 : 0)) {
                    zzuu zzuuVar = this.zzh;
                    String str = this.zza;
                    Objects.requireNonNull(str);
                    byte[] copyOf = Arrays.copyOf(zzuuVar.zzc, zzuuVar.zza);
                    byte b = copyOf[4];
                    int i8 = copyOf[5] & UByte.MAX_VALUE;
                    int i9 = ((b & UByte.MAX_VALUE) << 4) | (i8 >> 4);
                    int i10 = ((i8 & 15) << 8) | (copyOf[6] & UByte.MAX_VALUE);
                    int i11 = (copyOf[7] & 240) >> 4;
                    if (i11 == 2) {
                        f = i10 * 4;
                        i2 = i9 * 3;
                    } else if (i11 == 3) {
                        f = i10 * 16;
                        i2 = i9 * 9;
                    } else if (i11 != 4) {
                        f2 = 1.0f;
                        zzjp zzjpVar = new zzjp();
                        zzjpVar.zza(str);
                        zzjpVar.zzj("video/mpeg2");
                        zzjpVar.zzo(i9);
                        zzjpVar.zzp(i10);
                        zzjpVar.zzs(f2);
                        zzjpVar.zzl(Collections.singletonList(copyOf));
                        zzjq zzD = zzjpVar.zzD();
                        i3 = (copyOf[7] & 15) - 1;
                        if (i3 >= 0 || i3 >= 8) {
                            j = 0;
                        } else {
                            double d = zzc[i3];
                            byte b2 = copyOf[zzuuVar.zzb + 9];
                            int i12 = (b2 & 96) >> 5;
                            if (i12 != (b2 & 31)) {
                                d *= (i12 + 1.0d) / (i4 + 1);
                            }
                            j = (long) (1000000.0d / d);
                        }
                        Pair create = Pair.create(zzD, Long.valueOf(j));
                        this.zzb.zza((zzjq) create.first);
                        this.zzl = ((Long) create.second).longValue();
                        this.zzk = true;
                    } else {
                        f = i10 * 121;
                        i2 = i9 * 100;
                    }
                    f2 = f / i2;
                    zzjp zzjpVar2 = new zzjp();
                    zzjpVar2.zza(str);
                    zzjpVar2.zzj("video/mpeg2");
                    zzjpVar2.zzo(i9);
                    zzjpVar2.zzp(i10);
                    zzjpVar2.zzs(f2);
                    zzjpVar2.zzl(Collections.singletonList(copyOf));
                    zzjq zzD2 = zzjpVar2.zzD();
                    i3 = (copyOf[7] & 15) - 1;
                    if (i3 >= 0) {
                    }
                    j = 0;
                    Pair create2 = Pair.create(zzD2, Long.valueOf(j));
                    this.zzb.zza((zzjq) create2.first);
                    this.zzl = ((Long) create2.second).longValue();
                    this.zzk = true;
                }
            }
            zzvi zzviVar = this.zzf;
            if (zzviVar != null) {
                if (i7 > 0) {
                    zzviVar.zzd(zzi, zzg, zzd);
                    i = 0;
                } else {
                    i = -i7;
                }
                if (this.zzf.zze(i)) {
                    zzvi zzviVar2 = this.zzf;
                    int zza = zzagv.zza(zzviVar2.zza, zzviVar2.zzb);
                    zzahd zzahdVar2 = this.zze;
                    int i13 = zzaht.zza;
                    zzahdVar2.zzb(this.zzf.zza, zza);
                    this.zzd.zzb(this.zzo, this.zze);
                }
                if (i6 == 178) {
                    if (zzahdVar.zzi()[zzd + 2] == 1) {
                        this.zzf.zzc(178);
                    }
                    i6 = 178;
                }
            }
            if (i6 == 0 || i6 == 179) {
                int i14 = zze - zzd;
                if (this.zzj && this.zzq && this.zzk) {
                    this.zzb.zzd(this.zzo, this.zzp ? 1 : 0, ((int) (this.zzi - this.zzn)) - i14, i14, null);
                }
                boolean z = this.zzj;
                if (!z || this.zzq) {
                    this.zzn = this.zzi - i14;
                    long j2 = this.zzm;
                    if (j2 == -9223372036854775807L) {
                        j2 = z ? this.zzo + this.zzl : 0L;
                    }
                    this.zzo = j2;
                    this.zzp = false;
                    this.zzm = -9223372036854775807L;
                    this.zzj = true;
                }
                this.zzq = i6 == 0;
            } else if (i6 == 184) {
                this.zzp = true;
            }
            zzg = i5;
        }
        if (!this.zzk) {
            this.zzh.zzc(zzi, zzg, zze);
        }
        zzvi zzviVar3 = this.zzf;
        if (zzviVar3 != null) {
            zzviVar3.zzd(zzi, zzg, zze);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzut
    public final void zze() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzuv(zzwi zzwiVar) {
        zzahd zzahdVar;
        this.zzd = zzwiVar;
        this.zzg = new boolean[4];
        this.zzh = new zzuu(128);
        if (zzwiVar != null) {
            this.zzf = new zzvi(178, 128);
            zzahdVar = new zzahd();
        } else {
            zzahdVar = null;
            this.zzf = null;
        }
        this.zze = zzahdVar;
    }
}
