package com.google.android.gms.internal.ads;

import android.util.Log;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
final class zzug extends zzue {
    private zzuf zza;
    private int zzb;
    private boolean zzc;
    private zzqu zzd;
    private zzqs zze;

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzue
    public final void zza(boolean z) {
        super.zza(z);
        if (z) {
            this.zza = null;
            this.zzd = null;
            this.zze = null;
        }
        this.zzb = 0;
        this.zzc = false;
    }

    @Override // com.google.android.gms.internal.ads.zzue
    protected final long zzb(zzahd zzahdVar) {
        if ((zzahdVar.zzi()[0] & 1) == 1) {
            return -1L;
        }
        byte b = zzahdVar.zzi()[0];
        zzuf zzufVar = this.zza;
        zzafs.zzf(zzufVar);
        int i = !zzufVar.zzd[(b >> 1) & (255 >>> (8 - zzufVar.zze))].zza ? zzufVar.zza.zze : zzufVar.zza.zzf;
        long j = this.zzc ? (this.zzb + i) / 4 : 0;
        if (zzahdVar.zzj() < zzahdVar.zze() + 4) {
            byte[] copyOf = Arrays.copyOf(zzahdVar.zzi(), zzahdVar.zze() + 4);
            zzahdVar.zzb(copyOf, copyOf.length);
        } else {
            zzahdVar.zzf(zzahdVar.zze() + 4);
        }
        byte[] zzi = zzahdVar.zzi();
        zzi[zzahdVar.zze() - 4] = (byte) (j & 255);
        zzi[zzahdVar.zze() - 3] = (byte) ((j >>> 8) & 255);
        zzi[zzahdVar.zze() - 2] = (byte) ((j >>> 16) & 255);
        zzi[zzahdVar.zze() - 1] = (byte) ((j >>> 24) & 255);
        this.zzc = true;
        this.zzb = i;
        return j;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzue
    public final void zzj(long j) {
        super.zzj(j);
        this.zzc = j != 0;
        zzqu zzquVar = this.zzd;
        this.zzb = zzquVar != null ? zzquVar.zze : 0;
    }

    @Override // com.google.android.gms.internal.ads.zzue
    @EnsuresNonNullIf(expression = {"#3.format"}, result = false)
    protected final boolean zzc(zzahd zzahdVar, long j, zzuc zzucVar) throws IOException {
        zzuf zzufVar;
        int i;
        int i2;
        int i3;
        zzqs zzqsVar;
        int i4;
        int i5;
        if (this.zza == null) {
            zzqu zzquVar = this.zzd;
            if (zzquVar == null) {
                zzqv.zzc(1, zzahdVar, false);
                int zzC = zzahdVar.zzC();
                int zzn = zzahdVar.zzn();
                int zzC2 = zzahdVar.zzC();
                int zzw = zzahdVar.zzw();
                int i6 = zzw <= 0 ? -1 : zzw;
                int zzw2 = zzahdVar.zzw();
                int i7 = zzw2 <= 0 ? -1 : zzw2;
                int zzw3 = zzahdVar.zzw();
                int i8 = zzw3 <= 0 ? -1 : zzw3;
                int zzn2 = zzahdVar.zzn();
                this.zzd = new zzqu(zzC, zzn, zzC2, i6, i7, i8, (int) Math.pow(2.0d, zzn2 & 15), (int) Math.pow(2.0d, (zzn2 & 240) >> 4), 1 == (zzahdVar.zzn() & 1), Arrays.copyOf(zzahdVar.zzi(), zzahdVar.zze()));
            } else {
                zzqs zzqsVar2 = this.zze;
                if (zzqsVar2 == null) {
                    this.zze = zzqv.zzb(zzahdVar, true, true);
                } else {
                    byte[] bArr = new byte[zzahdVar.zze()];
                    System.arraycopy(zzahdVar.zzi(), 0, bArr, 0, zzahdVar.zze());
                    int i9 = zzquVar.zza;
                    int i10 = 5;
                    zzqv.zzc(5, zzahdVar, false);
                    int zzn3 = zzahdVar.zzn() + 1;
                    zzqr zzqrVar = new zzqr(zzahdVar.zzi());
                    zzqrVar.zzc(zzahdVar.zzg() * 8);
                    int i11 = 0;
                    while (i11 < zzn3) {
                        if (zzqrVar.zzb(24) == 5653314) {
                            int zzb = zzqrVar.zzb(16);
                            int zzb2 = zzqrVar.zzb(24);
                            long[] jArr = new long[zzb2];
                            long j2 = 0;
                            if (!zzqrVar.zza()) {
                                boolean zza = zzqrVar.zza();
                                int i12 = 0;
                                while (i12 < zzb2) {
                                    if (zza) {
                                        if (zzqrVar.zza()) {
                                            i4 = zzn3;
                                            jArr[i12] = zzqrVar.zzb(i10) + 1;
                                        } else {
                                            i4 = zzn3;
                                            jArr[i12] = 0;
                                        }
                                        i5 = zzb2;
                                    } else {
                                        i4 = zzn3;
                                        i5 = zzb2;
                                        jArr[i12] = zzqrVar.zzb(i10) + 1;
                                    }
                                    i12++;
                                    zzn3 = i4;
                                    zzb2 = i5;
                                    i10 = 5;
                                }
                                i2 = zzn3;
                                zzqsVar = zzqsVar2;
                                i3 = zzb2;
                            } else {
                                i2 = zzn3;
                                int zzb3 = zzqrVar.zzb(5) + 1;
                                i3 = zzb2;
                                int i13 = 0;
                                while (i13 < i3) {
                                    int zzb4 = zzqrVar.zzb(zzqv.zza(i3 - i13));
                                    int i14 = 0;
                                    while (i14 < zzb4 && i13 < i3) {
                                        jArr[i13] = zzb3;
                                        i13++;
                                        i14++;
                                        zzqsVar2 = zzqsVar2;
                                    }
                                    zzb3++;
                                    zzqsVar2 = zzqsVar2;
                                }
                                zzqsVar = zzqsVar2;
                            }
                            int zzb5 = zzqrVar.zzb(4);
                            if (zzb5 <= 2) {
                                if (zzb5 != 1) {
                                    if (zzb5 == 2) {
                                        zzb5 = 2;
                                    } else {
                                        i11++;
                                        zzn3 = i2;
                                        zzqsVar2 = zzqsVar;
                                        i10 = 5;
                                    }
                                }
                                zzqrVar.zzc(32);
                                zzqrVar.zzc(32);
                                int zzb6 = zzqrVar.zzb(4) + 1;
                                zzqrVar.zzc(1);
                                if (zzb5 != 1) {
                                    j2 = i3 * zzb;
                                } else if (zzb != 0) {
                                    j2 = (long) Math.floor(Math.pow(i3, 1.0d / zzb));
                                }
                                zzqrVar.zzc((int) (zzb6 * j2));
                                i11++;
                                zzn3 = i2;
                                zzqsVar2 = zzqsVar;
                                i10 = 5;
                            } else {
                                StringBuilder sb = new StringBuilder(53);
                                sb.append("lookup type greater than 2 not decodable: ");
                                sb.append(zzb5);
                                throw new zzkr(sb.toString());
                            }
                        } else {
                            int zzd = zzqrVar.zzd();
                            StringBuilder sb2 = new StringBuilder(66);
                            sb2.append("expected code book to start with [0x56, 0x43, 0x42] at ");
                            sb2.append(zzd);
                            throw new zzkr(sb2.toString());
                        }
                    }
                    zzqs zzqsVar3 = zzqsVar2;
                    int i15 = 6;
                    int zzb7 = zzqrVar.zzb(6) + 1;
                    for (int i16 = 0; i16 < zzb7; i16++) {
                        if (zzqrVar.zzb(16) != 0) {
                            throw new zzkr("placeholder of time domain transforms not zeroed out");
                        }
                    }
                    int i17 = 1;
                    int zzb8 = zzqrVar.zzb(6) + 1;
                    int i18 = 0;
                    while (true) {
                        int i19 = 3;
                        if (i18 < zzb8) {
                            int zzb9 = zzqrVar.zzb(16);
                            if (zzb9 == 0) {
                                int i20 = 8;
                                zzqrVar.zzc(8);
                                zzqrVar.zzc(16);
                                zzqrVar.zzc(16);
                                zzqrVar.zzc(6);
                                zzqrVar.zzc(8);
                                int zzb10 = zzqrVar.zzb(4) + 1;
                                int i21 = 0;
                                while (i21 < zzb10) {
                                    zzqrVar.zzc(i20);
                                    i21++;
                                    i20 = 8;
                                }
                            } else if (zzb9 == i17) {
                                int zzb11 = zzqrVar.zzb(5);
                                int[] iArr = new int[zzb11];
                                int i22 = -1;
                                for (int i23 = 0; i23 < zzb11; i23++) {
                                    int zzb12 = zzqrVar.zzb(4);
                                    iArr[i23] = zzb12;
                                    if (zzb12 > i22) {
                                        i22 = zzb12;
                                    }
                                }
                                int i24 = i22 + 1;
                                int[] iArr2 = new int[i24];
                                int i25 = 0;
                                while (i25 < i24) {
                                    iArr2[i25] = zzqrVar.zzb(i19) + 1;
                                    int zzb13 = zzqrVar.zzb(2);
                                    if (zzb13 > 0) {
                                        i = 8;
                                        zzqrVar.zzc(8);
                                    } else {
                                        i = 8;
                                    }
                                    int i26 = 0;
                                    for (int i27 = 1; i26 < (i27 << zzb13); i27 = 1) {
                                        zzqrVar.zzc(i);
                                        i26++;
                                        i = 8;
                                    }
                                    i25++;
                                    i19 = 3;
                                }
                                zzqrVar.zzc(2);
                                int zzb14 = zzqrVar.zzb(4);
                                int i28 = 0;
                                int i29 = 0;
                                for (int i30 = 0; i30 < zzb11; i30++) {
                                    i28 += iArr2[iArr[i30]];
                                    while (i29 < i28) {
                                        zzqrVar.zzc(zzb14);
                                        i29++;
                                    }
                                }
                            } else {
                                StringBuilder sb3 = new StringBuilder(52);
                                sb3.append("floor type greater than 1 not decodable: ");
                                sb3.append(zzb9);
                                throw new zzkr(sb3.toString());
                            }
                            i18++;
                            i15 = 6;
                            i17 = 1;
                        } else {
                            int i31 = 1;
                            int zzb15 = zzqrVar.zzb(i15) + 1;
                            int i32 = 0;
                            while (i32 < zzb15) {
                                if (zzqrVar.zzb(16) <= 2) {
                                    zzqrVar.zzc(24);
                                    zzqrVar.zzc(24);
                                    zzqrVar.zzc(24);
                                    int zzb16 = zzqrVar.zzb(i15) + i31;
                                    int i33 = 8;
                                    zzqrVar.zzc(8);
                                    int[] iArr3 = new int[zzb16];
                                    for (int i34 = 0; i34 < zzb16; i34++) {
                                        iArr3[i34] = ((zzqrVar.zza() ? zzqrVar.zzb(5) : 0) * 8) + zzqrVar.zzb(3);
                                    }
                                    int i35 = 0;
                                    while (i35 < zzb16) {
                                        int i36 = 0;
                                        while (i36 < i33) {
                                            if ((iArr3[i35] & (1 << i36)) != 0) {
                                                zzqrVar.zzc(i33);
                                            }
                                            i36++;
                                            i33 = 8;
                                        }
                                        i35++;
                                        i33 = 8;
                                    }
                                    i32++;
                                    i15 = 6;
                                    i31 = 1;
                                } else {
                                    throw new zzkr("residueType greater than 2 is not decodable");
                                }
                            }
                            int zzb17 = zzqrVar.zzb(i15) + 1;
                            for (int i37 = 0; i37 < zzb17; i37++) {
                                int zzb18 = zzqrVar.zzb(16);
                                if (zzb18 != 0) {
                                    StringBuilder sb4 = new StringBuilder(52);
                                    sb4.append("mapping type other than 0 not supported: ");
                                    sb4.append(zzb18);
                                    Log.e("VorbisUtil", sb4.toString());
                                } else {
                                    int zzb19 = zzqrVar.zza() ? zzqrVar.zzb(4) + 1 : 1;
                                    if (zzqrVar.zza()) {
                                        int zzb20 = zzqrVar.zzb(8) + 1;
                                        for (int i38 = 0; i38 < zzb20; i38++) {
                                            int i39 = i9 - 1;
                                            zzqrVar.zzc(zzqv.zza(i39));
                                            zzqrVar.zzc(zzqv.zza(i39));
                                        }
                                    }
                                    if (zzqrVar.zzb(2) != 0) {
                                        throw new zzkr("to reserved bits must be zero after mapping coupling steps");
                                    }
                                    if (zzb19 > 1) {
                                        for (int i40 = 0; i40 < i9; i40++) {
                                            zzqrVar.zzc(4);
                                        }
                                    }
                                    for (int i41 = 0; i41 < zzb19; i41++) {
                                        zzqrVar.zzc(8);
                                        zzqrVar.zzc(8);
                                        zzqrVar.zzc(8);
                                    }
                                }
                            }
                            int zzb21 = zzqrVar.zzb(6) + 1;
                            zzqt[] zzqtVarArr = new zzqt[zzb21];
                            for (int i42 = 0; i42 < zzb21; i42++) {
                                zzqtVarArr[i42] = new zzqt(zzqrVar.zza(), zzqrVar.zzb(16), zzqrVar.zzb(16), zzqrVar.zzb(8));
                            }
                            if (zzqrVar.zza()) {
                                zzufVar = new zzuf(zzquVar, zzqsVar3, bArr, zzqtVarArr, zzqv.zza(zzb21 - 1));
                            } else {
                                throw new zzkr("framing bit after modes not set as expected");
                            }
                        }
                    }
                }
            }
            zzufVar = null;
            this.zza = zzufVar;
            if (zzufVar == null) {
                return true;
            }
            zzqu zzquVar2 = zzufVar.zza;
            ArrayList arrayList = new ArrayList();
            arrayList.add(zzquVar2.zzg);
            arrayList.add(zzufVar.zzc);
            zzjp zzjpVar = new zzjp();
            zzjpVar.zzj("audio/vorbis");
            zzjpVar.zzf(zzquVar2.zzd);
            zzjpVar.zzg(zzquVar2.zzc);
            zzjpVar.zzw(zzquVar2.zza);
            zzjpVar.zzx(zzquVar2.zzb);
            zzjpVar.zzl(arrayList);
            zzucVar.zza = zzjpVar.zzD();
            return true;
        }
        Objects.requireNonNull(zzucVar.zza);
        return false;
    }
}
