package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.RequestConfiguration;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import kotlin.UByte;
import kotlin.jvm.internal.ByteCompanionObject;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
final class zzfxn extends zzfxo {
    private final InputStream zzc;
    private final byte[] zzd;
    private int zze;
    private int zzf;
    private int zzg;
    private int zzh;
    private int zzi;
    private int zzj;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzfxn(InputStream inputStream, int i, zzfxk zzfxkVar) {
        super(null);
        this.zzj = Integer.MAX_VALUE;
        zzfyw.zzb(inputStream, "input");
        this.zzc = inputStream;
        this.zzd = new byte[4096];
        this.zze = 0;
        this.zzg = 0;
        this.zzi = 0;
    }

    private final void zzI() {
        int i = this.zze + this.zzf;
        this.zze = i;
        int i2 = this.zzi + i;
        int i3 = this.zzj;
        if (i2 <= i3) {
            this.zzf = 0;
            return;
        }
        int i4 = i2 - i3;
        this.zzf = i4;
        this.zze = i - i4;
    }

    private final void zzJ(int i) throws IOException {
        if (zzK(i)) {
            return;
        }
        if (i > (Integer.MAX_VALUE - this.zzi) - this.zzg) {
            throw zzfyy.zzj();
        }
        throw zzfyy.zzd();
    }

    private final boolean zzK(int i) throws IOException {
        int i2 = this.zzg;
        int i3 = this.zze;
        if (i2 + i > i3) {
            int i4 = this.zzi;
            if (i <= (Integer.MAX_VALUE - i4) - i2 && i4 + i2 + i <= this.zzj) {
                if (i2 > 0) {
                    if (i3 > i2) {
                        byte[] bArr = this.zzd;
                        System.arraycopy(bArr, i2, bArr, 0, i3 - i2);
                    }
                    i4 = this.zzi + i2;
                    this.zzi = i4;
                    i3 = this.zze - i2;
                    this.zze = i3;
                    this.zzg = 0;
                }
                try {
                    int read = this.zzc.read(this.zzd, i3, Math.min(4096 - i3, (Integer.MAX_VALUE - i4) - i3));
                    if (read == 0 || read < -1 || read > 4096) {
                        String valueOf = String.valueOf(this.zzc.getClass());
                        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 91);
                        sb.append(valueOf);
                        sb.append("#read(byte[]) returned invalid result: ");
                        sb.append(read);
                        sb.append("\nThe InputStream implementation is buggy.");
                        throw new IllegalStateException(sb.toString());
                    } else if (read > 0) {
                        this.zze += read;
                        zzI();
                        if (this.zze >= i) {
                            return true;
                        }
                        return zzK(i);
                    } else {
                        return false;
                    }
                } catch (zzfyy e) {
                    e.zzb();
                    throw e;
                }
            }
            return false;
        }
        StringBuilder sb2 = new StringBuilder(77);
        sb2.append("refillBuffer() called when ");
        sb2.append(i);
        sb2.append(" bytes were already available in buffer");
        throw new IllegalStateException(sb2.toString());
    }

    private final byte[] zzL(int i, boolean z) throws IOException {
        byte[] zzM = zzM(i);
        if (zzM != null) {
            return zzM;
        }
        int i2 = this.zzg;
        int i3 = this.zze;
        int i4 = i3 - i2;
        this.zzi += i3;
        this.zzg = 0;
        this.zze = 0;
        List<byte[]> zzN = zzN(i - i4);
        byte[] bArr = new byte[i];
        System.arraycopy(this.zzd, i2, bArr, 0, i4);
        for (byte[] bArr2 : zzN) {
            int length = bArr2.length;
            System.arraycopy(bArr2, 0, bArr, i4, length);
            i4 += length;
        }
        return bArr;
    }

    private final byte[] zzM(int i) throws IOException {
        if (i == 0) {
            return zzfyw.zzc;
        }
        if (i >= 0) {
            int i2 = this.zzi;
            int i3 = this.zzg;
            int i4 = i2 + i3 + i;
            if ((-2147483647) + i4 <= 0) {
                int i5 = this.zzj;
                if (i4 > i5) {
                    zzE((i5 - i2) - i3);
                    throw zzfyy.zzd();
                }
                int i6 = this.zze - i3;
                int i7 = i - i6;
                if (i7 >= 4096) {
                    try {
                        if (i7 > this.zzc.available()) {
                            return null;
                        }
                    } catch (zzfyy e) {
                        e.zzb();
                        throw e;
                    }
                }
                byte[] bArr = new byte[i];
                System.arraycopy(this.zzd, this.zzg, bArr, 0, i6);
                this.zzi += this.zze;
                this.zzg = 0;
                this.zze = 0;
                while (i6 < i) {
                    try {
                        int read = this.zzc.read(bArr, i6, i - i6);
                        if (read == -1) {
                            throw zzfyy.zzd();
                        }
                        this.zzi += read;
                        i6 += read;
                    } catch (zzfyy e2) {
                        e2.zzb();
                        throw e2;
                    }
                }
                return bArr;
            }
            throw zzfyy.zzj();
        }
        throw zzfyy.zze();
    }

    private final List<byte[]> zzN(int i) throws IOException {
        ArrayList arrayList = new ArrayList();
        while (i > 0) {
            int min = Math.min(i, 4096);
            byte[] bArr = new byte[min];
            int i2 = 0;
            while (i2 < min) {
                int read = this.zzc.read(bArr, i2, min - i2);
                if (read == -1) {
                    throw zzfyy.zzd();
                }
                this.zzi += read;
                i2 += read;
            }
            i -= min;
            arrayList.add(bArr);
        }
        return arrayList;
    }

    @Override // com.google.android.gms.internal.ads.zzfxo
    public final void zzA(int i) {
        this.zzj = i;
        zzI();
    }

    @Override // com.google.android.gms.internal.ads.zzfxo
    public final boolean zzB() throws IOException {
        return this.zzg == this.zze && !zzK(1);
    }

    @Override // com.google.android.gms.internal.ads.zzfxo
    public final int zzC() {
        return this.zzi + this.zzg;
    }

    public final byte zzD() throws IOException {
        if (this.zzg == this.zze) {
            zzJ(1);
        }
        byte[] bArr = this.zzd;
        int i = this.zzg;
        this.zzg = i + 1;
        return bArr[i];
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
            int i = this.zze;
            int i2 = this.zzg;
            if (zzu <= i - i2) {
                String str = new String(this.zzd, i2, zzu, zzfyw.zza);
                this.zzg += zzu;
                return str;
            }
        }
        if (zzu == 0) {
            return RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
        }
        if (zzu <= this.zze) {
            zzJ(zzu);
            String str2 = new String(this.zzd, this.zzg, zzu, zzfyw.zza);
            this.zzg += zzu;
            return str2;
        }
        return new String(zzL(zzu, false), zzfyw.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzfxo
    public final String zzm() throws IOException {
        byte[] zzL;
        int zzu = zzu();
        int i = this.zzg;
        int i2 = this.zze;
        if (zzu <= i2 - i && zzu > 0) {
            zzL = this.zzd;
            this.zzg = i + zzu;
        } else if (zzu == 0) {
            return RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
        } else {
            if (zzu <= i2) {
                zzJ(zzu);
                zzL = this.zzd;
                this.zzg = zzu;
            } else {
                zzL = zzL(zzu, false);
            }
            i = 0;
        }
        return zzgbn.zzg(zzL, i, zzu);
    }

    @Override // com.google.android.gms.internal.ads.zzfxo
    public final zzfxj zzn() throws IOException {
        int zzu = zzu();
        int i = this.zze;
        int i2 = this.zzg;
        if (zzu <= i - i2 && zzu > 0) {
            zzfxj zzs = zzfxj.zzs(this.zzd, i2, zzu);
            this.zzg += zzu;
            return zzs;
        } else if (zzu != 0) {
            byte[] zzM = zzM(zzu);
            if (zzM != null) {
                return zzfxj.zzt(zzM);
            }
            int i3 = this.zzg;
            int i4 = this.zze;
            int i5 = i4 - i3;
            this.zzi += i4;
            this.zzg = 0;
            this.zze = 0;
            List<byte[]> zzN = zzN(zzu - i5);
            byte[] bArr = new byte[zzu];
            System.arraycopy(this.zzd, i3, bArr, 0, i5);
            for (byte[] bArr2 : zzN) {
                int length = bArr2.length;
                System.arraycopy(bArr2, 0, bArr, i5, length);
                i5 += length;
            }
            return zzfxj.zzu(bArr);
        } else {
            return zzfxj.zzb;
        }
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
        int i = this.zzg;
        if (this.zze - i < 4) {
            zzJ(4);
            i = this.zzg;
        }
        byte[] bArr = this.zzd;
        this.zzg = i + 4;
        return ((bArr[i + 3] & UByte.MAX_VALUE) << 24) | (bArr[i] & UByte.MAX_VALUE) | ((bArr[i + 1] & UByte.MAX_VALUE) << 8) | ((bArr[i + 2] & UByte.MAX_VALUE) << 16);
    }

    public final long zzy() throws IOException {
        int i = this.zzg;
        if (this.zze - i < 8) {
            zzJ(8);
            i = this.zzg;
        }
        byte[] bArr = this.zzd;
        this.zzg = i + 8;
        return ((bArr[i + 7] & 255) << 56) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 3] & 255) << 24) | ((bArr[i + 4] & 255) << 32) | ((bArr[i + 5] & 255) << 40) | ((bArr[i + 6] & 255) << 48);
    }

    @Override // com.google.android.gms.internal.ads.zzfxo
    public final int zzz(int i) throws zzfyy {
        if (i >= 0) {
            int i2 = i + this.zzi + this.zzg;
            int i3 = this.zzj;
            if (i2 <= i3) {
                this.zzj = i2;
                zzI();
                return i3;
            }
            throw zzfyy.zzd();
        }
        throw zzfyy.zze();
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
            int r0 = r5.zzg
            int r1 = r5.zze
            if (r1 != r0) goto L7
            goto L6c
        L7:
            byte[] r2 = r5.zzd
            int r3 = r0 + 1
            r0 = r2[r0]
            if (r0 < 0) goto L12
            r5.zzg = r3
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
            r5.zzg = r1
            return r0
        L6c:
            long r0 = r5.zzw()
            int r1 = (int) r0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzfxn.zzu():int");
    }

    @Override // com.google.android.gms.internal.ads.zzfxo
    public final boolean zzc(int i) throws IOException {
        int zza;
        int i2 = i & 7;
        int i3 = 0;
        if (i2 == 0) {
            if (this.zze - this.zzg < 10) {
                while (i3 < 10) {
                    if (zzD() < 0) {
                        i3++;
                    }
                }
                throw zzfyy.zzf();
            }
            while (i3 < 10) {
                byte[] bArr = this.zzd;
                int i4 = this.zzg;
                this.zzg = i4 + 1;
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

    public final void zzE(int i) throws IOException {
        int i2 = this.zze;
        int i3 = this.zzg;
        int i4 = i2 - i3;
        if (i <= i4 && i >= 0) {
            this.zzg = i3 + i;
        } else if (i >= 0) {
            int i5 = this.zzi;
            int i6 = i5 + i3;
            int i7 = this.zzj;
            if (i6 + i > i7) {
                zzE((i7 - i5) - i3);
                throw zzfyy.zzd();
            }
            this.zzi = i6;
            this.zze = 0;
            this.zzg = 0;
            while (i4 < i) {
                try {
                    long j = i - i4;
                    try {
                        long skip = this.zzc.skip(j);
                        int i8 = (skip > 0L ? 1 : (skip == 0L ? 0 : -1));
                        if (i8 < 0 || skip > j) {
                            String valueOf = String.valueOf(this.zzc.getClass());
                            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 92);
                            sb.append(valueOf);
                            sb.append("#skip returned invalid result: ");
                            sb.append(skip);
                            sb.append("\nThe InputStream implementation is buggy.");
                            throw new IllegalStateException(sb.toString());
                        } else if (i8 == 0) {
                            break;
                        } else {
                            i4 += (int) skip;
                        }
                    } catch (zzfyy e) {
                        e.zzb();
                        throw e;
                    }
                } finally {
                    this.zzi += i4;
                    zzI();
                }
            }
            if (i4 >= i) {
                return;
            }
            int i9 = this.zze;
            int i10 = i9 - this.zzg;
            this.zzg = i9;
            zzJ(1);
            while (true) {
                int i11 = i - i10;
                int i12 = this.zze;
                if (i11 <= i12) {
                    this.zzg = i11;
                    return;
                }
                i10 += i12;
                this.zzg = i12;
                zzJ(1);
            }
        } else {
            throw zzfyy.zze();
        }
    }

    public final long zzv() throws IOException {
        long j;
        long j2;
        long j3;
        long j4;
        int i;
        int i2 = this.zzg;
        int i3 = this.zze;
        if (i3 != i2) {
            byte[] bArr = this.zzd;
            int i4 = i2 + 1;
            byte b = bArr[i2];
            if (b >= 0) {
                this.zzg = i4;
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
                                                    this.zzg = i5;
                                                    return j2;
                                                }
                                            }
                                        }
                                    }
                                }
                                j2 = j3 ^ j6;
                                i5 = i10;
                                this.zzg = i5;
                                return j2;
                            }
                            j4 = 266354560;
                            j = j5 ^ j4;
                        }
                    }
                    i5 = i7;
                    j2 = j;
                    this.zzg = i5;
                    return j2;
                }
                i = i6 ^ (-128);
                j2 = i;
                this.zzg = i5;
                return j2;
            }
        }
        return zzw();
    }
}
