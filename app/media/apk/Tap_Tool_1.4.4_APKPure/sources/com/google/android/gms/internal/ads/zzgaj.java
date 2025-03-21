package com.google.android.gms.internal.ads;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzgaj extends zzfxj {
    static final int[] zza = {1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, TypedValues.Motion.TYPE_QUANTIZE_MOTIONSTEPS, 987, 1597, 2584, 4181, 6765, 10946, 17711, 28657, 46368, 75025, 121393, 196418, 317811, 514229, 832040, 1346269, 2178309, 3524578, 5702887, 9227465, 14930352, 24157817, 39088169, 63245986, 102334155, 165580141, 267914296, 433494437, 701408733, 1134903170, 1836311903, Integer.MAX_VALUE};
    private final int zzc;
    private final zzfxj zzd;
    private final zzfxj zze;
    private final int zzf;
    private final int zzg;

    private zzgaj(zzfxj zzfxjVar, zzfxj zzfxjVar2) {
        this.zzd = zzfxjVar;
        this.zze = zzfxjVar2;
        int zzc = zzfxjVar.zzc();
        this.zzf = zzc;
        this.zzc = zzc + zzfxjVar2.zzc();
        this.zzg = Math.max(zzfxjVar.zzf(), zzfxjVar2.zzf()) + 1;
    }

    private static zzfxj zzH(zzfxj zzfxjVar, zzfxj zzfxjVar2) {
        int zzc = zzfxjVar.zzc();
        int zzc2 = zzfxjVar2.zzc();
        byte[] bArr = new byte[zzc + zzc2];
        zzfxjVar.zzy(bArr, 0, 0, zzc);
        zzfxjVar2.zzy(bArr, 0, zzc, zzc2);
        return new zzfxg(bArr);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static zzfxj zzd(zzfxj zzfxjVar, zzfxj zzfxjVar2) {
        if (zzfxjVar2.zzc() == 0) {
            return zzfxjVar;
        }
        if (zzfxjVar.zzc() == 0) {
            return zzfxjVar2;
        }
        int zzc = zzfxjVar.zzc() + zzfxjVar2.zzc();
        if (zzc < 128) {
            return zzH(zzfxjVar, zzfxjVar2);
        }
        if (zzfxjVar instanceof zzgaj) {
            zzgaj zzgajVar = (zzgaj) zzfxjVar;
            if (zzgajVar.zze.zzc() + zzfxjVar2.zzc() < 128) {
                return new zzgaj(zzgajVar.zzd, zzH(zzgajVar.zze, zzfxjVar2));
            } else if (zzgajVar.zzd.zzf() > zzgajVar.zze.zzf() && zzgajVar.zzg > zzfxjVar2.zzf()) {
                return new zzgaj(zzgajVar.zzd, new zzgaj(zzgajVar.zze, zzfxjVar2));
            }
        }
        if (zzc >= zzh(Math.max(zzfxjVar.zzf(), zzfxjVar2.zzf()) + 1)) {
            return new zzgaj(zzfxjVar, zzfxjVar2);
        }
        return zzgah.zza(new zzgah(null), zzfxjVar, zzfxjVar2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzh(int i) {
        int[] iArr = zza;
        int length = iArr.length;
        if (i >= 47) {
            return Integer.MAX_VALUE;
        }
        return iArr[i];
    }

    @Override // com.google.android.gms.internal.ads.zzfxj
    public final boolean equals(Object obj) {
        boolean zzh;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzfxj)) {
            return false;
        }
        zzfxj zzfxjVar = (zzfxj) obj;
        if (this.zzc != zzfxjVar.zzc()) {
            return false;
        }
        if (this.zzc == 0) {
            return true;
        }
        int zzC = zzC();
        int zzC2 = zzfxjVar.zzC();
        if (zzC != 0 && zzC2 != 0 && zzC != zzC2) {
            return false;
        }
        zzgai zzgaiVar = new zzgai(this, null);
        zzfxf next = zzgaiVar.next();
        zzgai zzgaiVar2 = new zzgai(zzfxjVar, null);
        zzfxf next2 = zzgaiVar2.next();
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            int zzc = next.zzc() - i;
            int zzc2 = next2.zzc() - i2;
            int min = Math.min(zzc, zzc2);
            if (i == 0) {
                zzh = next.zzh(next2, i2, min);
            } else {
                zzh = next2.zzh(next, i, min);
            }
            if (!zzh) {
                return false;
            }
            i3 += min;
            int i4 = this.zzc;
            if (i3 >= i4) {
                if (i3 == i4) {
                    return true;
                }
                throw new IllegalStateException();
            }
            if (min == zzc) {
                next = zzgaiVar.next();
                i = 0;
            } else {
                i += min;
            }
            if (min == zzc2) {
                next2 = zzgaiVar2.next();
                i2 = 0;
            } else {
                i2 += min;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfxj, java.lang.Iterable
    public final /* bridge */ /* synthetic */ Iterator<Byte> iterator() {
        return new zzgag(this);
    }

    @Override // com.google.android.gms.internal.ads.zzfxj
    public final byte zza(int i) {
        zzD(i, this.zzc);
        return zzb(i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.zzfxj
    public final byte zzb(int i) {
        int i2 = this.zzf;
        if (i < i2) {
            return this.zzd.zzb(i);
        }
        return this.zze.zzb(i - i2);
    }

    @Override // com.google.android.gms.internal.ads.zzfxj
    public final int zzc() {
        return this.zzc;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzfxj
    public final void zze(byte[] bArr, int i, int i2, int i3) {
        int i4 = this.zzf;
        if (i + i3 <= i4) {
            this.zzd.zze(bArr, i, i2, i3);
        } else if (i >= i4) {
            this.zze.zze(bArr, i - i4, i2, i3);
        } else {
            int i5 = i4 - i;
            this.zzd.zze(bArr, i, i2, i5);
            this.zze.zze(bArr, 0, i2 + i5, i3 - i5);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzfxj
    public final int zzf() {
        return this.zzg;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzfxj
    public final boolean zzg() {
        return this.zzc >= zzh(this.zzg);
    }

    @Override // com.google.android.gms.internal.ads.zzfxj
    public final zzfxj zzi(int i, int i2) {
        int zzE = zzE(i, i2, this.zzc);
        if (zzE == 0) {
            return zzfxj.zzb;
        }
        if (zzE == this.zzc) {
            return this;
        }
        int i3 = this.zzf;
        if (i2 <= i3) {
            return this.zzd.zzi(i, i2);
        }
        if (i >= i3) {
            return this.zze.zzi(i - i3, i2 - i3);
        }
        zzfxj zzfxjVar = this.zzd;
        return new zzgaj(zzfxjVar.zzi(i, zzfxjVar.zzc()), this.zze.zzi(0, i2 - this.zzf));
    }

    @Override // com.google.android.gms.internal.ads.zzfxj
    public final ByteBuffer zzj() {
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.zzfxj
    public final void zzk(zzfwz zzfwzVar) throws IOException {
        this.zzd.zzk(zzfwzVar);
        this.zze.zzk(zzfwzVar);
    }

    @Override // com.google.android.gms.internal.ads.zzfxj
    protected final String zzl(Charset charset) {
        return new String(zzz(), charset);
    }

    @Override // com.google.android.gms.internal.ads.zzfxj
    public final boolean zzm() {
        int zzn = this.zzd.zzn(0, 0, this.zzf);
        zzfxj zzfxjVar = this.zze;
        return zzfxjVar.zzn(zzn, 0, zzfxjVar.zzc()) == 0;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzfxj
    public final int zzn(int i, int i2, int i3) {
        int i4 = this.zzf;
        if (i2 + i3 <= i4) {
            return this.zzd.zzn(i, i2, i3);
        }
        if (i2 >= i4) {
            return this.zze.zzn(i, i2 - i4, i3);
        }
        int i5 = i4 - i2;
        return this.zze.zzn(this.zzd.zzn(i, i2, i5), 0, i3 - i5);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzfxj
    public final int zzo(int i, int i2, int i3) {
        int i4 = this.zzf;
        if (i2 + i3 <= i4) {
            return this.zzd.zzo(i, i2, i3);
        }
        if (i2 >= i4) {
            return this.zze.zzo(i, i2 - i4, i3);
        }
        int i5 = i4 - i2;
        return this.zze.zzo(this.zzd.zzo(i, i2, i5), 0, i3 - i5);
    }

    @Override // com.google.android.gms.internal.ads.zzfxj
    public final zzfxo zzp() {
        ArrayList<ByteBuffer> arrayList = new ArrayList();
        zzgai zzgaiVar = new zzgai(this, null);
        while (zzgaiVar.hasNext()) {
            arrayList.add(zzgaiVar.next().zzj());
        }
        boolean z = false;
        int i = 0;
        for (ByteBuffer byteBuffer : arrayList) {
            i += byteBuffer.remaining();
            if (byteBuffer.hasArray()) {
                z |= true;
            } else {
                z = byteBuffer.isDirect() ? z | true : z | true;
            }
        }
        if (z) {
            return new zzfxm(arrayList, i, true, null);
        }
        return new zzfxn(new zzfyz(arrayList), 4096, null);
    }

    @Override // com.google.android.gms.internal.ads.zzfxj
    public final zzfxe zzq() {
        return new zzgag(this);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzgaj(zzfxj zzfxjVar, zzfxj zzfxjVar2, zzgag zzgagVar) {
        this(zzfxjVar, zzfxjVar2);
    }
}
