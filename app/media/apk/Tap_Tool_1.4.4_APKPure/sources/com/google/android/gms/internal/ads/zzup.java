package com.google.android.gms.internal.ads;

import android.util.Log;
import androidx.core.view.MotionEventCompat;
import java.util.Arrays;
import java.util.Collections;
import java.util.Objects;
import kotlin.UByte;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzup implements zzut {
    private static final byte[] zza = {73, 68, 51};
    private final boolean zzb;
    private final zzahc zzc = new zzahc(new byte[7], 7);
    private final zzahd zzd = new zzahd(Arrays.copyOf(zza, 10));
    private final String zze;
    private String zzf;
    private zzqq zzg;
    private zzqq zzh;
    private int zzi;
    private int zzj;
    private int zzk;
    private boolean zzl;
    private boolean zzm;
    private int zzn;
    private int zzo;
    private int zzp;
    private boolean zzq;
    private long zzr;
    private int zzs;
    private long zzt;
    private zzqq zzu;
    private long zzv;

    public zzup(boolean z, String str) {
        zzi();
        this.zzn = -1;
        this.zzo = -1;
        this.zzr = -9223372036854775807L;
        this.zzb = z;
        this.zze = str;
    }

    public static boolean zzf(int i) {
        return (i & 65526) == 65520;
    }

    private final void zzg() {
        this.zzm = false;
        zzi();
    }

    private final boolean zzh(zzahd zzahdVar, byte[] bArr, int i) {
        int min = Math.min(zzahdVar.zzd(), i - this.zzj);
        zzahdVar.zzm(bArr, this.zzj, min);
        int i2 = this.zzj + min;
        this.zzj = i2;
        return i2 == i;
    }

    private final void zzi() {
        this.zzi = 0;
        this.zzj = 0;
        this.zzk = 256;
    }

    private final void zzj(zzqq zzqqVar, long j, int i, int i2) {
        this.zzi = 4;
        this.zzj = i;
        this.zzu = zzqqVar;
        this.zzv = j;
        this.zzs = i2;
    }

    private final void zzk() {
        this.zzi = 3;
        this.zzj = 0;
    }

    private static final boolean zzl(byte b, byte b2) {
        return zzf((b2 & UByte.MAX_VALUE) | MotionEventCompat.ACTION_POINTER_INDEX_MASK);
    }

    private static final boolean zzm(zzahd zzahdVar, byte[] bArr, int i) {
        if (zzahdVar.zzd() < i) {
            return false;
        }
        zzahdVar.zzm(bArr, 0, i);
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzut
    public final void zza() {
        zzg();
    }

    @Override // com.google.android.gms.internal.ads.zzut
    public final void zzb(zzpu zzpuVar, zzwf zzwfVar) {
        zzwfVar.zza();
        this.zzf = zzwfVar.zzc();
        zzqq zzbi = zzpuVar.zzbi(zzwfVar.zzb(), 1);
        this.zzg = zzbi;
        this.zzu = zzbi;
        if (this.zzb) {
            zzwfVar.zza();
            zzqq zzbi2 = zzpuVar.zzbi(zzwfVar.zzb(), 5);
            this.zzh = zzbi2;
            zzjp zzjpVar = new zzjp();
            zzjpVar.zza(zzwfVar.zzc());
            zzjpVar.zzj("application/id3");
            zzbi2.zza(zzjpVar.zzD());
            return;
        }
        this.zzh = new zzpq();
    }

    @Override // com.google.android.gms.internal.ads.zzut
    public final void zzc(long j, int i) {
        this.zzt = j;
    }

    @Override // com.google.android.gms.internal.ads.zzut
    public final void zze() {
    }

    @Override // com.google.android.gms.internal.ads.zzut
    public final void zzd(zzahd zzahdVar) throws zzkr {
        int i;
        int i2;
        int i3;
        Objects.requireNonNull(this.zzg);
        int i4 = zzaht.zza;
        while (zzahdVar.zzd() > 0) {
            int i5 = this.zzi;
            int i6 = 13;
            int i7 = 2;
            if (i5 == 0) {
                byte[] zzi = zzahdVar.zzi();
                int zzg = zzahdVar.zzg();
                int zze = zzahdVar.zze();
                while (true) {
                    if (zzg < zze) {
                        i = zzg + 1;
                        i2 = zzi[zzg] & UByte.MAX_VALUE;
                        if (this.zzk == 512 && zzl((byte) -1, (byte) i2)) {
                            if (!this.zzm) {
                                int i8 = i - 2;
                                zzahdVar.zzh(i8 + 1);
                                if (zzm(zzahdVar, this.zzc.zza, 1)) {
                                    this.zzc.zzd(4);
                                    int zzh = this.zzc.zzh(1);
                                    int i9 = this.zzn;
                                    if (i9 == -1 || zzh == i9) {
                                        if (this.zzo != -1) {
                                            if (!zzm(zzahdVar, this.zzc.zza, 1)) {
                                                break;
                                            }
                                            this.zzc.zzd(i7);
                                            if (this.zzc.zzh(4) == this.zzo) {
                                                zzahdVar.zzh(i8 + 2);
                                            }
                                        }
                                        if (!zzm(zzahdVar, this.zzc.zza, 4)) {
                                            break;
                                        }
                                        this.zzc.zzd(14);
                                        int zzh2 = this.zzc.zzh(i6);
                                        if (zzh2 >= 7) {
                                            byte[] zzi2 = zzahdVar.zzi();
                                            int zze2 = zzahdVar.zze();
                                            int i10 = i8 + zzh2;
                                            if (i10 >= zze2) {
                                                break;
                                            } else if ((r8 = zzi2[i10]) == -1) {
                                            }
                                        }
                                    }
                                }
                            } else {
                                break;
                            }
                        }
                        int i11 = this.zzk;
                        int i12 = i11 | i2;
                        if (i12 == 329) {
                            i3 = 768;
                        } else if (i12 == 511) {
                            i3 = 512;
                        } else if (i12 == 836) {
                            i3 = 1024;
                        } else if (i12 == 1075) {
                            this.zzi = 2;
                            this.zzj = 3;
                            this.zzs = 0;
                            this.zzd.zzh(0);
                            zzahdVar.zzh(i);
                            break;
                        } else if (i11 != 256) {
                            this.zzk = 256;
                            zzg = i - 1;
                            i6 = 13;
                            i7 = 2;
                        } else {
                            zzg = i;
                            i6 = 13;
                            i7 = 2;
                        }
                        this.zzk = i3;
                        zzg = i;
                        i6 = 13;
                        i7 = 2;
                    } else {
                        zzahdVar.zzh(zzg);
                        break;
                    }
                }
                this.zzp = (i2 & 8) >> 3;
                this.zzl = 1 == ((i2 & 1) ^ 1);
                if (this.zzm) {
                    zzk();
                } else {
                    this.zzi = 1;
                    this.zzj = 0;
                }
                zzahdVar.zzh(i);
            } else if (i5 != 1) {
                if (i5 != 2) {
                    if (i5 != 3) {
                        int min = Math.min(zzahdVar.zzd(), this.zzs - this.zzj);
                        this.zzu.zzf(zzahdVar, min);
                        int i13 = this.zzj + min;
                        this.zzj = i13;
                        int i14 = this.zzs;
                        if (i13 == i14) {
                            this.zzu.zzd(this.zzt, 1, i14, 0, null);
                            this.zzt += this.zzv;
                            zzi();
                        }
                    } else {
                        if (zzh(zzahdVar, this.zzc.zza, true != this.zzl ? 5 : 7)) {
                            this.zzc.zzd(0);
                            if (!this.zzq) {
                                int zzh3 = this.zzc.zzh(2) + 1;
                                if (zzh3 != 2) {
                                    StringBuilder sb = new StringBuilder(61);
                                    sb.append("Detected audio object type: ");
                                    sb.append(zzh3);
                                    sb.append(", but assuming AAC LC.");
                                    Log.w("AdtsReader", sb.toString());
                                }
                                this.zzc.zzf(5);
                                int zzh4 = this.zzc.zzh(3);
                                int i15 = this.zzo;
                                int i16 = zzlu.zza;
                                byte[] bArr = {(byte) (((i15 >> 1) & 7) | 16), (byte) (((zzh4 << 3) & 120) | ((i15 << 7) & 128))};
                                zzlt zza2 = zzlu.zza(bArr);
                                zzjp zzjpVar = new zzjp();
                                zzjpVar.zza(this.zzf);
                                zzjpVar.zzj("audio/mp4a-latm");
                                zzjpVar.zzh(zza2.zzc);
                                zzjpVar.zzw(zza2.zzb);
                                zzjpVar.zzx(zza2.zza);
                                zzjpVar.zzl(Collections.singletonList(bArr));
                                zzjpVar.zzd(this.zze);
                                zzjq zzD = zzjpVar.zzD();
                                this.zzr = 1024000000 / zzD.zzz;
                                this.zzg.zza(zzD);
                                this.zzq = true;
                            } else {
                                this.zzc.zzf(10);
                            }
                            this.zzc.zzf(4);
                            int zzh5 = this.zzc.zzh(13) - 7;
                            if (this.zzl) {
                                zzh5 -= 2;
                            }
                            zzj(this.zzg, this.zzr, 0, zzh5);
                        }
                    }
                } else if (zzh(zzahdVar, this.zzd.zzi(), 10)) {
                    this.zzh.zzf(this.zzd, 10);
                    this.zzd.zzh(6);
                    zzj(this.zzh, 0L, 10, 10 + this.zzd.zzA());
                }
            } else if (zzahdVar.zzd() != 0) {
                this.zzc.zza[0] = zzahdVar.zzi()[zzahdVar.zzg()];
                this.zzc.zzd(2);
                int zzh6 = this.zzc.zzh(4);
                int i17 = this.zzo;
                if (i17 == -1 || zzh6 == i17) {
                    if (!this.zzm) {
                        this.zzm = true;
                        this.zzn = this.zzp;
                        this.zzo = zzh6;
                    }
                    zzk();
                } else {
                    zzg();
                }
            }
        }
    }
}
