package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.RequestConfiguration;
import java.io.IOException;
import java.util.Arrays;
import kotlin.UByte;
import kotlin.jvm.internal.ByteCompanionObject;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzfxl extends zzfxo {
    private final byte[] zzc;
    private int zzd;
    private int zze;
    private int zzf;
    private final int zzg;
    private int zzh;
    private int zzi;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzfxl(byte[] bArr, int i, int i2, boolean z, zzfxk zzfxkVar) {
        super(null);
        this.zzi = Integer.MAX_VALUE;
        this.zzc = bArr;
        this.zzd = i2 + i;
        this.zzf = i;
        this.zzg = i;
    }

    private final void zzI() {
        int i = this.zzd + this.zze;
        this.zzd = i;
        int i2 = i - this.zzg;
        int i3 = this.zzi;
        if (i2 <= i3) {
            this.zze = 0;
            return;
        }
        int i4 = i2 - i3;
        this.zze = i4;
        this.zzd = i - i4;
    }

    @Override // com.google.android.gms.internal.ads.zzfxo
    public final void zzA(int i) {
        this.zzi = i;
        zzI();
    }

    @Override // com.google.android.gms.internal.ads.zzfxo
    public final boolean zzB() throws IOException {
        return this.zzf == this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzfxo
    public final int zzC() {
        return this.zzf - this.zzg;
    }

    public final byte zzD() throws IOException {
        int i = this.zzf;
        if (i != this.zzd) {
            byte[] bArr = this.zzc;
            this.zzf = i + 1;
            return bArr[i];
        }
        throw zzfyy.zzd();
    }

    @Override // com.google.android.gms.internal.ads.zzfxo
    public final int zza() throws IOException {
        if (zzB()) {
            this.zzh = 0;
            return 0;
        }
        int zzu = zzu();
        this.zzh = zzu;
        if ((zzu >>> 3) != 0) {
            return zzu;
        }
        throw zzfyy.zzg();
    }

    @Override // com.google.android.gms.internal.ads.zzfxo
    public final void zzb(int i) throws zzfyy {
        if (this.zzh != i) {
            throw zzfyy.zzh();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfxo
    public final double zzd() throws IOException {
        return Double.longBitsToDouble(zzy());
    }

    @Override // com.google.android.gms.internal.ads.zzfxo
    public final float zze() throws IOException {
        return Float.intBitsToFloat(zzx());
    }

    @Override // com.google.android.gms.internal.ads.zzfxo
    public final long zzf() throws IOException {
        return zzv();
    }

    @Override // com.google.android.gms.internal.ads.zzfxo
    public final long zzg() throws IOException {
        return zzv();
    }

    @Override // com.google.android.gms.internal.ads.zzfxo
    public final int zzh() throws IOException {
        return zzu();
    }

    @Override // com.google.android.gms.internal.ads.zzfxo
    public final long zzi() throws IOException {
        return zzy();
    }

    @Override // com.google.android.gms.internal.ads.zzfxo
    public final int zzj() throws IOException {
        return zzx();
    }

    @Override // com.google.android.gms.internal.ads.zzfxo
    public final boolean zzk() throws IOException {
        return zzv() != 0;
    }

    @Override // com.google.android.gms.internal.ads.zzfxo
    public final String zzl() throws IOException {
        int zzu = zzu();
        if (zzu > 0) {
            int i = this.zzd;
            int i2 = this.zzf;
            if (zzu <= i - i2) {
                String str = new String(this.zzc, i2, zzu, zzfyw.zza);
                this.zzf += zzu;
                return str;
            }
        }
        if (zzu == 0) {
            return RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
        }
        if (zzu < 0) {
            throw zzfyy.zze();
        }
        throw zzfyy.zzd();
    }

    @Override // com.google.android.gms.internal.ads.zzfxo
    public final String zzm() throws IOException {
        int zzu = zzu();
        if (zzu > 0) {
            int i = this.zzd;
            int i2 = this.zzf;
            if (zzu <= i - i2) {
                String zzg = zzgbn.zzg(this.zzc, i2, zzu);
                this.zzf += zzu;
                return zzg;
            }
        }
        if (zzu == 0) {
            return RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
        }
        if (zzu <= 0) {
            throw zzfyy.zze();
        }
        throw zzfyy.zzd();
    }

    @Override // com.google.android.gms.internal.ads.zzfxo
    public final zzfxj zzn() throws IOException {
        int zzu = zzu();
        if (zzu > 0) {
            int i = this.zzd;
            int i2 = this.zzf;
            if (zzu <= i - i2) {
                zzfxj zzs = zzfxj.zzs(this.zzc, i2, zzu);
                this.zzf += zzu;
                return zzs;
            }
        }
        if (zzu != 0) {
            if (zzu > 0) {
                int i3 = this.zzd;
                int i4 = this.zzf;
                if (zzu <= i3 - i4) {
                    int i5 = zzu + i4;
                    this.zzf = i5;
                    return zzfxj.zzu(Arrays.copyOfRange(this.zzc, i4, i5));
                }
            }
            if (zzu <= 0) {
                throw zzfyy.zze();
            }
            throw zzfyy.zzd();
        }
        return zzfxj.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzfxo
    public final int zzo() throws IOException {
        return zzu();
    }

    @Override // com.google.android.gms.internal.ads.zzfxo
    public final int zzp() throws IOException {
        return zzu();
    }

    @Override // com.google.android.gms.internal.ads.zzfxo
    public final int zzq() throws IOException {
        return zzx();
    }

    @Override // com.google.android.gms.internal.ads.zzfxo
    public final long zzr() throws IOException {
        return zzy();
    }

    @Override // com.google.android.gms.internal.ads.zzfxo
    public final int zzs() throws IOException {
        return zzG(zzu());
    }

    @Override // com.google.android.gms.internal.ads.zzfxo
    public final long zzt() throws IOException {
        return zzH(zzv());
    }

    final long zzw() throws IOException {
        long j = 0;
        for (int i = 0; i < 64; i += 7) {
            byte zzD = zzD();
            j |= (zzD & ByteCompanionObject.MAX_VALUE) << i;
            if ((zzD & ByteCompanionObject.MIN_VALUE) == 0) {
                return j;
            }
        }
        throw zzfyy.zzf();
    }

    public final int zzx() throws IOException {
        int i = this.zzf;
        if (this.zzd - i >= 4) {
            byte[] bArr = this.zzc;
            this.zzf = i + 4;
            return ((bArr[i + 3] & UByte.MAX_VALUE) << 24) | (bArr[i] & UByte.MAX_VALUE) | ((bArr[i + 1] & UByte.MAX_VALUE) << 8) | ((bArr[i + 2] & UByte.MAX_VALUE) << 16);
        }
        throw zzfyy.zzd();
    }

    public final long zzy() throws IOException {
        int i = this.zzf;
        if (this.zzd - i >= 8) {
            byte[] bArr = this.zzc;
            this.zzf = i + 8;
            return ((bArr[i + 7] & 255) << 56) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 3] & 255) << 24) | ((bArr[i + 4] & 255) << 32) | ((bArr[i + 5] & 255) << 40) | ((bArr[i + 6] & 255) << 48);
        }
        throw zzfyy.zzd();
    }

    @Override // com.google.android.gms.internal.ads.zzfxo
    public final int zzz(int i) throws zzfyy {
        if (i >= 0) {
            int i2 = i + (this.zzf - this.zzg);
            if (i2 >= 0) {
                int i3 = this.zzi;
                if (i2 <= i3) {
                    this.zzi = i2;
                    zzI();
                    return i3;
                }
                throw zzfyy.zzd();
            }
            throw zzfyy.zzk();
        }
        throw zzfyy.zze();
    }

    public final void zzE(int i) throws IOException {
        if (i >= 0) {
            int i2 = this.zzd;
            int i3 = this.zzf;
            if (i <= i2 - i3) {
                this.zzf = i3 + i;
                return;
            }
        }
        if (i < 0) {
            throw zzfyy.zze();
        }
        throw zzfyy.zzd();
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0067, code lost:
        if (r2[r3] >= 0) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int zzu() throws java.io.IOException {
        /*
            r5 = this;
            int r0 = r5.zzf
            int r1 = r5.zzd
            if (r1 != r0) goto L7
            goto L6c
        L7:
            byte[] r2 = r5.zzc
            int r3 = r0 + 1
            r0 = r2[r0]
            if (r0 < 0) goto L12
            r5.zzf = r3
            return r0
        L12:
            int r1 = r1 - r3
            r4 = 9
            if (r1 < r4) goto L6c
            int r1 = r3 + 1
            r3 = r2[r3]
            int r3 = r3 << 7
            r0 = r0 ^ r3
            if (r0 >= 0) goto L23
            r0 = r0 ^ (-128(0xffffffffffffff80, float:NaN))
            goto L69
        L23:
            int r3 = r1 + 1
            r1 = r2[r1]
            int r1 = r1 << 14
            r0 = r0 ^ r1
            if (r0 < 0) goto L30
            r0 = r0 ^ 16256(0x3f80, float:2.278E-41)
        L2e:
            r1 = r3
            goto L69
        L30:
            int r1 = r3 + 1
            r3 = r2[r3]
            int r3 = r3 << 21
            r0 = r0 ^ r3
            if (r0 >= 0) goto L3e
            r2 = -2080896(0xffffffffffe03f80, float:NaN)
            r0 = r0 ^ r2
            goto L69
        L3e:
            int r3 = r1 + 1
            r1 = r2[r1]
            int r4 = r1 << 28
            r0 = r0 ^ r4
            r4 = 266354560(0xfe03f80, float:2.2112565E-29)
            r0 = r0 ^ r4
            if (r1 >= 0) goto L2e
            int r1 = r3 + 1
            r3 = r2[r3]
            if (r3 >= 0) goto L69
            int r3 = r1 + 1
            r1 = r2[r1]
            if (r1 >= 0) goto L2e
            int r1 = r3 + 1
            r3 = r2[r3]
            if (r3 >= 0) goto L69
            int r3 = r1 + 1
            r1 = r2[r1]
            if (r1 >= 0) goto L2e
            int r1 = r3 + 1
            r2 = r2[r3]
            if (r2 < 0) goto L6c
        L69:
            r5.zzf = r1
            return r0
        L6c:
            long r0 = r5.zzw()
            int r1 = (int) r0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzfxl.zzu():int");
    }

    @Override // com.google.android.gms.internal.ads.zzfxo
    public final boolean zzc(int i) throws IOException {
        int zza;
        int i2 = i & 7;
        int i3 = 0;
        if (i2 == 0) {
            if (this.zzd - this.zzf < 10) {
                while (i3 < 10) {
                    if (zzD() < 0) {
                        i3++;
                    }
                }
                throw zzfyy.zzf();
            }
            while (i3 < 10) {
                byte[] bArr = this.zzc;
                int i4 = this.zzf;
                this.zzf = i4 + 1;
                if (bArr[i4] < 0) {
                    i3++;
                }
            }
            throw zzfyy.zzf();
            return true;
        } else if (i2 == 1) {
            zzE(8);
            return true;
        } else if (i2 == 2) {
            zzE(zzu());
            return true;
        } else if (i2 != 3) {
            if (i2 != 4) {
                if (i2 == 5) {
                    zzE(4);
                    return true;
                }
                throw zzfyy.zzi();
            }
            return false;
        } else {
            do {
                zza = zza();
                if (zza == 0) {
                    break;
                }
            } while (zzc(zza));
            zzb(((i >>> 3) << 3) | 4);
            return true;
        }
    }

    public final long zzv() throws IOException {
        long j;
        long j2;
        long j3;
        long j4;
        int i;
        int i2 = this.zzf;
        int i3 = this.zzd;
        if (i3 != i2) {
            byte[] bArr = this.zzc;
            int i4 = i2 + 1;
            byte b = bArr[i2];
            if (b >= 0) {
                this.zzf = i4;
                return b;
            } else if (i3 - i4 >= 9) {
                int i5 = i4 + 1;
                int i6 = b ^ (bArr[i4] << 7);
                if (i6 >= 0) {
                    int i7 = i5 + 1;
                    int i8 = i6 ^ (bArr[i5] << 14);
                    if (i8 >= 0) {
                        j = i8 ^ 16256;
                    } else {
                        i5 = i7 + 1;
                        int i9 = i8 ^ (bArr[i7] << 21);
                        if (i9 < 0) {
                            i = i9 ^ (-2080896);
                        } else {
                            i7 = i5 + 1;
                            long j5 = (bArr[i5] << 28) ^ i9;
                            if (j5 < 0) {
                                int i10 = i7 + 1;
                                long j6 = j5 ^ (bArr[i7] << 35);
                                if (j6 < 0) {
                                    j3 = -34093383808L;
                                } else {
                                    i7 = i10 + 1;
                                    j5 = j6 ^ (bArr[i10] << 42);
                                    if (j5 >= 0) {
                                        j4 = 4363953127296L;
                                    } else {
                                        i10 = i7 + 1;
                                        j6 = j5 ^ (bArr[i7] << 49);
                                        if (j6 < 0) {
                                            j3 = -558586000294016L;
                                        } else {
                                            i7 = i10 + 1;
                                            j = (j6 ^ (bArr[i10] << 56)) ^ 71499008037633920L;
                                            if (j < 0) {
                                                i10 = i7 + 1;
                                                if (bArr[i7] >= 0) {
                                                    j2 = j;
                                                    i5 = i10;
                                                    this.zzf = i5;
                                                    return j2;
                                                }
                                            }
                                        }
                                    }
                                }
                                j2 = j3 ^ j6;
                                i5 = i10;
                                this.zzf = i5;
                                return j2;
                            }
                            j4 = 266354560;
                            j = j5 ^ j4;
                        }
                    }
                    i5 = i7;
                    j2 = j;
                    this.zzf = i5;
                    return j2;
                }
                i = i6 ^ (-128);
                j2 = i;
                this.zzf = i5;
                return j2;
            }
        }
        return zzw();
    }
}
