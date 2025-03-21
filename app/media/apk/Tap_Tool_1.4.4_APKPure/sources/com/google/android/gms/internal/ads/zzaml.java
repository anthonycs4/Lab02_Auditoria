package com.google.android.gms.internal.ads;

import java.io.IOException;
import kotlin.UByte;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
final class zzaml {
    private final zzarc zza = new zzarc(8);
    private int zzb;

    private final long zzb(zzalt zzaltVar) throws IOException, InterruptedException {
        int i = 0;
        zzaltVar.zze(this.zza.zza, 0, 1, false);
        int i2 = this.zza.zza[0] & UByte.MAX_VALUE;
        if (i2 != 0) {
            int i3 = 128;
            int i4 = 0;
            while ((i2 & i3) == 0) {
                i3 >>= 1;
                i4++;
            }
            int i5 = i2 & (~i3);
            zzaltVar.zze(this.zza.zza, 1, i4, false);
            while (i < i4) {
                i++;
                i5 = (this.zza.zza[i] & UByte.MAX_VALUE) + (i5 << 8);
            }
            this.zzb += i4 + 1;
            return i5;
        }
        return Long.MIN_VALUE;
    }

    public final boolean zza(zzalt zzaltVar) throws IOException, InterruptedException {
        long zzb;
        int i;
        long zzi = zzaltVar.zzi();
        long j = 1024;
        int i2 = (zzi > (-1L) ? 1 : (zzi == (-1L) ? 0 : -1));
        if (i2 != 0 && zzi <= 1024) {
            j = zzi;
        }
        int i3 = (int) j;
        zzaltVar.zze(this.zza.zza, 0, 4, false);
        long zzp = this.zza.zzp();
        this.zzb = 4;
        while (zzp != 440786851) {
            int i4 = this.zzb + 1;
            this.zzb = i4;
            if (i4 == i3) {
                return false;
            }
            zzaltVar.zze(this.zza.zza, 0, 1, false);
            zzp = ((zzp << 8) & (-256)) | (this.zza.zza[0] & UByte.MAX_VALUE);
        }
        long zzb2 = zzb(zzaltVar);
        long j2 = this.zzb;
        if (zzb2 != Long.MIN_VALUE && (i2 == 0 || j2 + zzb2 < zzi)) {
            while (true) {
                int i5 = (this.zzb > (j2 + zzb2) ? 1 : (this.zzb == (j2 + zzb2) ? 0 : -1));
                if (i5 < 0) {
                    if (zzb(zzaltVar) == Long.MIN_VALUE || (zzb = zzb(zzaltVar)) < 0) {
                        return false;
                    }
                    if (i != 0) {
                        zzaltVar.zzf((int) zzb, false);
                        this.zzb = (int) (this.zzb + zzb);
                    }
                } else if (i5 == 0) {
                    return true;
                }
            }
        }
        return false;
    }
}
