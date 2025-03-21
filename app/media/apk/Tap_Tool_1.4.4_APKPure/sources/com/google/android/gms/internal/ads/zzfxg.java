package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Objects;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public class zzfxg extends zzfxf {
    protected final byte[] zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzfxg(byte[] bArr) {
        Objects.requireNonNull(bArr);
        this.zza = bArr;
    }

    @Override // com.google.android.gms.internal.ads.zzfxj
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof zzfxj) && zzc() == ((zzfxj) obj).zzc()) {
            if (zzc() == 0) {
                return true;
            }
            if (obj instanceof zzfxg) {
                zzfxg zzfxgVar = (zzfxg) obj;
                int zzC = zzC();
                int zzC2 = zzfxgVar.zzC();
                if (zzC == 0 || zzC2 == 0 || zzC == zzC2) {
                    return zzh(zzfxgVar, 0, zzc());
                }
                return false;
            }
            return obj.equals(this);
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzfxj
    public byte zza(int i) {
        return this.zza[i];
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.zzfxj
    public byte zzb(int i) {
        return this.zza[i];
    }

    @Override // com.google.android.gms.internal.ads.zzfxj
    public int zzc() {
        return this.zza.length;
    }

    protected int zzd() {
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzfxj
    public void zze(byte[] bArr, int i, int i2, int i3) {
        System.arraycopy(this.zza, i, bArr, i2, i3);
    }

    @Override // com.google.android.gms.internal.ads.zzfxf
    final boolean zzh(zzfxj zzfxjVar, int i, int i2) {
        if (i2 > zzfxjVar.zzc()) {
            int zzc = zzc();
            StringBuilder sb = new StringBuilder(40);
            sb.append("Length too large: ");
            sb.append(i2);
            sb.append(zzc);
            throw new IllegalArgumentException(sb.toString());
        }
        int i3 = i + i2;
        if (i3 > zzfxjVar.zzc()) {
            int zzc2 = zzfxjVar.zzc();
            StringBuilder sb2 = new StringBuilder(59);
            sb2.append("Ran off end of other: ");
            sb2.append(i);
            sb2.append(", ");
            sb2.append(i2);
            sb2.append(", ");
            sb2.append(zzc2);
            throw new IllegalArgumentException(sb2.toString());
        } else if (zzfxjVar instanceof zzfxg) {
            zzfxg zzfxgVar = (zzfxg) zzfxjVar;
            byte[] bArr = this.zza;
            byte[] bArr2 = zzfxgVar.zza;
            int zzd = zzd() + i2;
            int zzd2 = zzd();
            int zzd3 = zzfxgVar.zzd() + i;
            while (zzd2 < zzd) {
                if (bArr[zzd2] != bArr2[zzd3]) {
                    return false;
                }
                zzd2++;
                zzd3++;
            }
            return true;
        } else {
            return zzfxjVar.zzi(i, i3).equals(zzi(0, i2));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfxj
    public final zzfxj zzi(int i, int i2) {
        int zzE = zzE(i, i2, zzc());
        return zzE == 0 ? zzfxj.zzb : new zzfxd(this.zza, zzd() + i, zzE);
    }

    @Override // com.google.android.gms.internal.ads.zzfxj
    public final ByteBuffer zzj() {
        return ByteBuffer.wrap(this.zza, zzd(), zzc()).asReadOnlyBuffer();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.zzfxj
    public final void zzk(zzfwz zzfwzVar) throws IOException {
        ((zzfxr) zzfwzVar).zzp(this.zza, zzd(), zzc());
    }

    @Override // com.google.android.gms.internal.ads.zzfxj
    protected final String zzl(Charset charset) {
        return new String(this.zza, zzd(), zzc(), charset);
    }

    @Override // com.google.android.gms.internal.ads.zzfxj
    public final boolean zzm() {
        int zzd = zzd();
        return zzgbn.zzb(this.zza, zzd, zzc() + zzd);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzfxj
    public final int zzn(int i, int i2, int i3) {
        int zzd = zzd() + i2;
        return zzgbn.zzc(i, this.zza, zzd, i3 + zzd);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzfxj
    public final int zzo(int i, int i2, int i3) {
        return zzfyw.zzh(i, this.zza, zzd() + i2, i3);
    }

    @Override // com.google.android.gms.internal.ads.zzfxj
    public final zzfxo zzp() {
        return zzfxo.zzF(this.zza, zzd(), zzc(), true);
    }
}
