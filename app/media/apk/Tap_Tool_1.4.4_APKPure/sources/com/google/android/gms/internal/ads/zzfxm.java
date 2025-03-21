package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.RequestConfiguration;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Iterator;
import kotlin.UByte;
import kotlin.jvm.internal.ByteCompanionObject;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
final class zzfxm extends zzfxo {
    private final Iterable<ByteBuffer> zzc;
    private final Iterator<ByteBuffer> zzd;
    private ByteBuffer zze;
    private int zzf;
    private int zzg;
    private int zzh;
    private int zzi;
    private int zzj;
    private long zzk;
    private long zzl;
    private long zzm;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzfxm(Iterable iterable, int i, boolean z, zzfxk zzfxkVar) {
        super(null);
        this.zzh = Integer.MAX_VALUE;
        this.zzf = i;
        this.zzc = iterable;
        this.zzd = iterable.iterator();
        this.zzj = 0;
        if (i == 0) {
            this.zze = zzfyw.zzd;
            this.zzk = 0L;
            this.zzl = 0L;
            this.zzm = 0L;
            return;
        }
        zzJ();
    }

    private final void zzI() throws zzfyy {
        if (!this.zzd.hasNext()) {
            throw zzfyy.zzd();
        }
        zzJ();
    }

    private final void zzJ() {
        ByteBuffer next = this.zzd.next();
        this.zze = next;
        this.zzj += (int) (this.zzk - this.zzl);
        long position = next.position();
        this.zzk = position;
        this.zzl = position;
        this.zzm = this.zze.limit();
        long zzs = zzgbi.zzs(this.zze);
        this.zzk += zzs;
        this.zzl += zzs;
        this.zzm += zzs;
    }

    private final void zzK() {
        int i = this.zzf + this.zzg;
        this.zzf = i;
        int i2 = this.zzh;
        if (i <= i2) {
            this.zzg = 0;
            return;
        }
        int i3 = i - i2;
        this.zzg = i3;
        this.zzf = i - i3;
    }

    private final void zzL(byte[] bArr, int i, int i2) throws IOException {
        if (i2 > zzM()) {
            if (i2 > 0) {
                throw zzfyy.zzd();
            }
            return;
        }
        int i3 = i2;
        while (i3 > 0) {
            if (this.zzm - this.zzk == 0) {
                zzI();
            }
            int min = Math.min(i3, (int) (this.zzm - this.zzk));
            long j = min;
            zzgbi.zzq(this.zzk, bArr, i2 - i3, j);
            i3 -= min;
            this.zzk += j;
        }
    }

    private final int zzM() {
        return (int) (((this.zzf - this.zzj) - this.zzk) + this.zzl);
    }

    @Override // com.google.android.gms.internal.ads.zzfxo
    public final void zzA(int i) {
        this.zzh = i;
        zzK();
    }

    @Override // com.google.android.gms.internal.ads.zzfxo
    public final boolean zzB() throws IOException {
        return (((long) this.zzj) + this.zzk) - this.zzl == ((long) this.zzf);
    }

    @Override // com.google.android.gms.internal.ads.zzfxo
    public final int zzC() {
        return (int) ((this.zzj + this.zzk) - this.zzl);
    }

    public final byte zzD() throws IOException {
        if (this.zzm - this.zzk == 0) {
            zzI();
        }
        long j = this.zzk;
        this.zzk = 1 + j;
        return zzgbi.zzr(j);
    }

    @Override // com.google.android.gms.internal.ads.zzfxo
    public final int zza() throws IOException {
        if (zzB()) {
            this.zzi = 0;
            return 0;
        }
        int zzu = zzu();
        this.zzi = zzu;
        if ((zzu >>> 3) != 0) {
            return zzu;
        }
        throw zzfyy.zzg();
    }

    @Override // com.google.android.gms.internal.ads.zzfxo
    public final void zzb(int i) throws zzfyy {
        if (this.zzi != i) {
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
            long j = zzu;
            long j2 = this.zzm;
            long j3 = this.zzk;
            if (j <= j2 - j3) {
                byte[] bArr = new byte[zzu];
                zzgbi.zzq(j3, bArr, 0L, j);
                String str = new String(bArr, zzfyw.zza);
                this.zzk += j;
                return str;
            }
        }
        if (zzu > 0 && zzu <= zzM()) {
            byte[] bArr2 = new byte[zzu];
            zzL(bArr2, 0, zzu);
            return new String(bArr2, zzfyw.zza);
        } else if (zzu == 0) {
            return RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
        } else {
            if (zzu < 0) {
                throw zzfyy.zze();
            }
            throw zzfyy.zzd();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfxo
    public final String zzm() throws IOException {
        int zzu = zzu();
        if (zzu > 0) {
            long j = zzu;
            long j2 = this.zzm;
            long j3 = this.zzk;
            if (j <= j2 - j3) {
                String zzf = zzgbn.zzf(this.zze, (int) (j3 - this.zzl), zzu);
                this.zzk += j;
                return zzf;
            }
        }
        if (zzu >= 0 && zzu <= zzM()) {
            byte[] bArr = new byte[zzu];
            zzL(bArr, 0, zzu);
            return zzgbn.zzg(bArr, 0, zzu);
        } else if (zzu == 0) {
            return RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
        } else {
            if (zzu <= 0) {
                throw zzfyy.zze();
            }
            throw zzfyy.zzd();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfxo
    public final zzfxj zzn() throws IOException {
        int zzu = zzu();
        if (zzu > 0) {
            long j = zzu;
            long j2 = this.zzm;
            long j3 = this.zzk;
            if (j <= j2 - j3) {
                byte[] bArr = new byte[zzu];
                zzgbi.zzq(j3, bArr, 0L, j);
                this.zzk += j;
                return zzfxj.zzu(bArr);
            }
        }
        if (zzu > 0 && zzu <= zzM()) {
            byte[] bArr2 = new byte[zzu];
            zzL(bArr2, 0, zzu);
            return zzfxj.zzu(bArr2);
        } else if (zzu == 0) {
            return zzfxj.zzb;
        } else {
            if (zzu < 0) {
                throw zzfyy.zze();
            }
            throw zzfyy.zzd();
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

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0087, code lost:
        if (com.google.android.gms.internal.ads.zzgbi.zzr(r4) >= 0) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int zzu() throws java.io.IOException {
        /*
            r10 = this;
            long r0 = r10.zzk
            long r2 = r10.zzm
            int r4 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r4 != 0) goto La
            goto L8c
        La:
            r2 = 1
            long r4 = r0 + r2
            byte r0 = com.google.android.gms.internal.ads.zzgbi.zzr(r0)
            if (r0 < 0) goto L1a
            long r4 = r10.zzk
            long r4 = r4 + r2
            r10.zzk = r4
            return r0
        L1a:
            long r6 = r10.zzm
            long r8 = r10.zzk
            long r6 = r6 - r8
            r8 = 10
            int r1 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r1 < 0) goto L8c
            long r6 = r4 + r2
            byte r1 = com.google.android.gms.internal.ads.zzgbi.zzr(r4)
            int r1 = r1 << 7
            r0 = r0 ^ r1
            if (r0 >= 0) goto L33
            r0 = r0 ^ (-128(0xffffffffffffff80, float:NaN))
            goto L89
        L33:
            long r4 = r6 + r2
            byte r1 = com.google.android.gms.internal.ads.zzgbi.zzr(r6)
            int r1 = r1 << 14
            r0 = r0 ^ r1
            if (r0 < 0) goto L42
            r0 = r0 ^ 16256(0x3f80, float:2.278E-41)
        L40:
            r6 = r4
            goto L89
        L42:
            long r6 = r4 + r2
            byte r1 = com.google.android.gms.internal.ads.zzgbi.zzr(r4)
            int r1 = r1 << 21
            r0 = r0 ^ r1
            if (r0 >= 0) goto L52
            r1 = -2080896(0xffffffffffe03f80, float:NaN)
            r0 = r0 ^ r1
            goto L89
        L52:
            long r4 = r6 + r2
            byte r1 = com.google.android.gms.internal.ads.zzgbi.zzr(r6)
            int r6 = r1 << 28
            r0 = r0 ^ r6
            r6 = 266354560(0xfe03f80, float:2.2112565E-29)
            r0 = r0 ^ r6
            if (r1 >= 0) goto L40
            long r6 = r4 + r2
            byte r1 = com.google.android.gms.internal.ads.zzgbi.zzr(r4)
            if (r1 >= 0) goto L89
            long r4 = r6 + r2
            byte r1 = com.google.android.gms.internal.ads.zzgbi.zzr(r6)
            if (r1 >= 0) goto L40
            long r6 = r4 + r2
            byte r1 = com.google.android.gms.internal.ads.zzgbi.zzr(r4)
            if (r1 >= 0) goto L89
            long r4 = r6 + r2
            byte r1 = com.google.android.gms.internal.ads.zzgbi.zzr(r6)
            if (r1 >= 0) goto L40
            long r6 = r4 + r2
            byte r1 = com.google.android.gms.internal.ads.zzgbi.zzr(r4)
            if (r1 < 0) goto L8c
        L89:
            r10.zzk = r6
            return r0
        L8c:
            long r0 = r10.zzw()
            int r1 = (int) r0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzfxm.zzu():int");
    }

    public final long zzv() throws IOException {
        long zzr;
        long j;
        long j2;
        int i;
        long j3 = this.zzk;
        if (this.zzm != j3) {
            long j4 = j3 + 1;
            byte zzr2 = zzgbi.zzr(j3);
            if (zzr2 >= 0) {
                this.zzk++;
                return zzr2;
            } else if (this.zzm - this.zzk >= 10) {
                long j5 = j4 + 1;
                int zzr3 = zzr2 ^ (zzgbi.zzr(j4) << 7);
                if (zzr3 >= 0) {
                    long j6 = j5 + 1;
                    int zzr4 = zzr3 ^ (zzgbi.zzr(j5) << 14);
                    if (zzr4 >= 0) {
                        zzr = zzr4 ^ 16256;
                    } else {
                        j5 = j6 + 1;
                        int zzr5 = zzr4 ^ (zzgbi.zzr(j6) << 21);
                        if (zzr5 < 0) {
                            i = zzr5 ^ (-2080896);
                        } else {
                            j6 = j5 + 1;
                            long zzr6 = zzr5 ^ (zzgbi.zzr(j5) << 28);
                            if (zzr6 < 0) {
                                long j7 = j6 + 1;
                                long zzr7 = zzr6 ^ (zzgbi.zzr(j6) << 35);
                                if (zzr7 < 0) {
                                    j = -34093383808L;
                                } else {
                                    j6 = j7 + 1;
                                    zzr6 = zzr7 ^ (zzgbi.zzr(j7) << 42);
                                    if (zzr6 >= 0) {
                                        j2 = 4363953127296L;
                                    } else {
                                        j7 = j6 + 1;
                                        zzr7 = zzr6 ^ (zzgbi.zzr(j6) << 49);
                                        if (zzr7 < 0) {
                                            j = -558586000294016L;
                                        } else {
                                            j6 = j7 + 1;
                                            zzr = (zzr7 ^ (zzgbi.zzr(j7) << 56)) ^ 71499008037633920L;
                                            if (zzr < 0) {
                                                long j8 = 1 + j6;
                                                if (zzgbi.zzr(j6) >= 0) {
                                                    j5 = j8;
                                                    this.zzk = j5;
                                                    return zzr;
                                                }
                                            }
                                        }
                                    }
                                }
                                zzr = zzr7 ^ j;
                                j5 = j7;
                                this.zzk = j5;
                                return zzr;
                            }
                            j2 = 266354560;
                            zzr = zzr6 ^ j2;
                        }
                    }
                    j5 = j6;
                    this.zzk = j5;
                    return zzr;
                }
                i = zzr3 ^ (-128);
                zzr = i;
                this.zzk = j5;
                return zzr;
            }
        }
        return zzw();
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
        int zzD;
        byte zzD2;
        long j = this.zzm;
        long j2 = this.zzk;
        if (j - j2 >= 4) {
            this.zzk = 4 + j2;
            zzD = (zzgbi.zzr(j2) & UByte.MAX_VALUE) | ((zzgbi.zzr(1 + j2) & UByte.MAX_VALUE) << 8) | ((zzgbi.zzr(2 + j2) & UByte.MAX_VALUE) << 16);
            zzD2 = zzgbi.zzr(j2 + 3);
        } else {
            zzD = (zzD() & UByte.MAX_VALUE) | ((zzD() & UByte.MAX_VALUE) << 8) | ((zzD() & UByte.MAX_VALUE) << 16);
            zzD2 = zzD();
        }
        return zzD | ((zzD2 & UByte.MAX_VALUE) << 24);
    }

    public final long zzy() throws IOException {
        long zzD;
        byte zzD2;
        long j = this.zzm;
        long j2 = this.zzk;
        if (j - j2 >= 8) {
            this.zzk = 8 + j2;
            zzD = (zzgbi.zzr(j2) & 255) | ((zzgbi.zzr(1 + j2) & 255) << 8) | ((zzgbi.zzr(2 + j2) & 255) << 16) | ((zzgbi.zzr(3 + j2) & 255) << 24) | ((zzgbi.zzr(4 + j2) & 255) << 32) | ((zzgbi.zzr(5 + j2) & 255) << 40) | ((zzgbi.zzr(6 + j2) & 255) << 48);
            zzD2 = zzgbi.zzr(j2 + 7);
        } else {
            zzD = (zzD() & 255) | ((zzD() & 255) << 8) | ((zzD() & 255) << 16) | ((zzD() & 255) << 24) | ((zzD() & 255) << 32) | ((zzD() & 255) << 40) | ((zzD() & 255) << 48);
            zzD2 = zzD();
        }
        return zzD | ((zzD2 & 255) << 56);
    }

    @Override // com.google.android.gms.internal.ads.zzfxo
    public final int zzz(int i) throws zzfyy {
        if (i >= 0) {
            int zzC = i + zzC();
            int i2 = this.zzh;
            if (zzC <= i2) {
                this.zzh = zzC;
                zzK();
                return i2;
            }
            throw zzfyy.zzd();
        }
        throw zzfyy.zze();
    }

    public final void zzE(int i) throws IOException {
        if (i < 0 || i > ((this.zzf - this.zzj) - this.zzk) + this.zzl) {
            if (i < 0) {
                throw zzfyy.zze();
            }
            throw zzfyy.zzd();
        }
        while (i > 0) {
            if (this.zzm - this.zzk == 0) {
                zzI();
            }
            int min = Math.min(i, (int) (this.zzm - this.zzk));
            i -= min;
            this.zzk += min;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfxo
    public final boolean zzc(int i) throws IOException {
        int zza;
        int i2 = i & 7;
        if (i2 == 0) {
            for (int i3 = 0; i3 < 10; i3++) {
                if (zzD() >= 0) {
                    return true;
                }
            }
            throw zzfyy.zzf();
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
}
