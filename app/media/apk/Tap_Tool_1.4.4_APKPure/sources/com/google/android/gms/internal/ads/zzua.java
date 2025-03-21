package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import kotlin.UByte;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
final class zzua extends zzue {
    private static final byte[] zza = {79, 112, 117, 115, 72, 101, 97, 100};
    private boolean zzb;

    public static boolean zzd(zzahd zzahdVar) {
        if (zzahdVar.zzd() < 8) {
            return false;
        }
        byte[] bArr = new byte[8];
        zzahdVar.zzm(bArr, 0, 8);
        return Arrays.equals(bArr, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzue
    protected final void zza(boolean z) {
        super.zza(z);
        if (z) {
            this.zzb = false;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzue
    protected final long zzb(zzahd zzahdVar) {
        byte[] zzi = zzahdVar.zzi();
        int i = zzi[0] & UByte.MAX_VALUE;
        int i2 = i & 3;
        int i3 = 2;
        if (i2 == 0) {
            i3 = 1;
        } else if (i2 != 1 && i2 != 2) {
            i3 = zzi[1] & 63;
        }
        int i4 = i >> 3;
        int i5 = i4 & 3;
        return zzi(i3 * (i4 >= 16 ? 2500 << i5 : i4 >= 12 ? 10000 << (i5 & 1) : i5 == 3 ? 60000 : 10000 << i5));
    }

    @Override // com.google.android.gms.internal.ads.zzue
    @EnsuresNonNullIf(expression = {"#3.format"}, result = false)
    protected final boolean zzc(zzahd zzahdVar, long j, zzuc zzucVar) {
        if (!this.zzb) {
            byte[] copyOf = Arrays.copyOf(zzahdVar.zzi(), zzahdVar.zze());
            byte b = copyOf[9];
            List<byte[]> zza2 = zzny.zza(copyOf);
            zzjp zzjpVar = new zzjp();
            zzjpVar.zzj("audio/opus");
            zzjpVar.zzw(b & UByte.MAX_VALUE);
            zzjpVar.zzx(48000);
            zzjpVar.zzl(zza2);
            zzucVar.zza = zzjpVar.zzD();
            this.zzb = true;
            return true;
        }
        Objects.requireNonNull(zzucVar.zza);
        boolean z = zzahdVar.zzv() == 1332770163;
        zzahdVar.zzh(0);
        return z;
    }
}
