package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.util.Objects;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzng extends zznf {
    private int[] zzd;
    private int[] zze;

    @Override // com.google.android.gms.internal.ads.zzmh
    public final void zzc(ByteBuffer byteBuffer) {
        int[] iArr = this.zze;
        Objects.requireNonNull(iArr);
        int[] iArr2 = iArr;
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        ByteBuffer zzi = zzi(((limit - position) / this.zzb.zze) * this.zzc.zze);
        while (position < limit) {
            for (int i : iArr2) {
                zzi.putShort(byteBuffer.getShort(i + i + position));
            }
            position += this.zzb.zze;
        }
        byteBuffer.position(limit);
        zzi.flip();
    }

    @Override // com.google.android.gms.internal.ads.zznf
    public final zzmf zzk(zzmf zzmfVar) throws zzmg {
        int[] iArr = this.zzd;
        if (iArr == null) {
            return zzmf.zza;
        }
        if (zzmfVar.zzd != 2) {
            throw new zzmg(zzmfVar);
        }
        boolean z = zzmfVar.zzc != iArr.length;
        int i = 0;
        while (true) {
            int length = iArr.length;
            if (i >= length) {
                return z ? new zzmf(zzmfVar.zzb, length, 2) : zzmf.zza;
            }
            int i2 = iArr[i];
            if (i2 >= zzmfVar.zzc) {
                throw new zzmg(zzmfVar);
            }
            z |= i2 != i;
            i++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zznf
    protected final void zzm() {
        this.zze = this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zznf
    protected final void zzn() {
        this.zze = null;
        this.zzd = null;
    }

    public final void zzo(int[] iArr) {
        this.zzd = iArr;
    }
}
