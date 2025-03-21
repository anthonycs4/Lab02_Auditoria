package com.google.android.gms.internal.ads;

import android.media.MediaCodec;
import java.util.Objects;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzoh {
    public byte[] zza;
    public byte[] zzb;
    public int[] zzc;
    public int[] zzd;
    private final MediaCodec.CryptoInfo zze;
    private final zzog zzf;

    public zzoh() {
        MediaCodec.CryptoInfo cryptoInfo = new MediaCodec.CryptoInfo();
        this.zze = cryptoInfo;
        this.zzf = zzaht.zza >= 24 ? new zzog(cryptoInfo, null) : null;
    }

    public final void zza(int i, int[] iArr, int[] iArr2, byte[] bArr, byte[] bArr2, int i2, int i3, int i4) {
        this.zzc = iArr;
        this.zzd = iArr2;
        this.zzb = bArr;
        this.zza = bArr2;
        this.zze.numSubSamples = i;
        this.zze.numBytesOfClearData = iArr;
        this.zze.numBytesOfEncryptedData = iArr2;
        this.zze.key = bArr;
        this.zze.iv = bArr2;
        this.zze.mode = i2;
        if (zzaht.zza >= 24) {
            zzog zzogVar = this.zzf;
            Objects.requireNonNull(zzogVar);
            zzog.zza(zzogVar, i3, i4);
        }
    }

    public final MediaCodec.CryptoInfo zzb() {
        return this.zze;
    }

    public final void zzc(int i) {
        if (i == 0) {
            return;
        }
        if (this.zzc == null) {
            int[] iArr = new int[1];
            this.zzc = iArr;
            this.zze.numBytesOfClearData = iArr;
        }
        int[] iArr2 = this.zzc;
        iArr2[0] = iArr2[0] + i;
    }
}
