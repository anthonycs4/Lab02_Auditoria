package com.google.android.gms.internal.ads;

import libcore.io.Memory;
import sun.misc.Unsafe;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
final class zzgbf extends zzgbh {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzgbf(Unsafe unsafe) {
        super(unsafe);
    }

    @Override // com.google.android.gms.internal.ads.zzgbh
    public final void zza(Object obj, long j, byte b) {
        if (zzgbi.zzb) {
            zzgbi.zzG(obj, j, b);
        } else {
            zzgbi.zzH(obj, j, b);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgbh
    public final boolean zzb(Object obj, long j) {
        if (zzgbi.zzb) {
            return zzgbi.zzy(obj, j);
        }
        return zzgbi.zzz(obj, j);
    }

    @Override // com.google.android.gms.internal.ads.zzgbh
    public final void zzc(Object obj, long j, boolean z) {
        if (zzgbi.zzb) {
            zzgbi.zzG(obj, j, r3 ? (byte) 1 : (byte) 0);
        } else {
            zzgbi.zzH(obj, j, r3 ? (byte) 1 : (byte) 0);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgbh
    public final float zzd(Object obj, long j) {
        return Float.intBitsToFloat(zzm(obj, j));
    }

    @Override // com.google.android.gms.internal.ads.zzgbh
    public final void zze(Object obj, long j, float f) {
        zzn(obj, j, Float.floatToIntBits(f));
    }

    @Override // com.google.android.gms.internal.ads.zzgbh
    public final double zzf(Object obj, long j) {
        return Double.longBitsToDouble(zzo(obj, j));
    }

    @Override // com.google.android.gms.internal.ads.zzgbh
    public final void zzg(Object obj, long j, double d) {
        zzp(obj, j, Double.doubleToLongBits(d));
    }

    @Override // com.google.android.gms.internal.ads.zzgbh
    public final byte zzh(long j) {
        return Memory.peekByte((int) j);
    }

    @Override // com.google.android.gms.internal.ads.zzgbh
    public final void zzi(long j, byte[] bArr, long j2, long j3) {
        Memory.peekByteArray((int) j, bArr, (int) j2, (int) j3);
    }
}
