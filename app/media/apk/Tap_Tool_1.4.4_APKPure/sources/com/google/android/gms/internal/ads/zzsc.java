package com.google.android.gms.internal.ads;

import java.io.IOException;
import kotlin.UByte;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
final class zzsc {
    private final zzahd zza = new zzahd(8);
    private int zzb;

    private final long zzb(zzps zzpsVar) throws IOException {
        zzpo zzpoVar = (zzpo) zzpsVar;
        int i = 0;
        zzpoVar.zzh(this.zza.zzi(), 0, 1, false);
        int i2 = this.zza.zzi()[0] & UByte.MAX_VALUE;
        if (i2 != 0) {
            int i3 = 128;
            int i4 = 0;
            while ((i2 & i3) == 0) {
                i3 >>= 1;
                i4++;
            }
            int i5 = i2 & (~i3);
            zzpoVar.zzh(this.zza.zzi(), 1, i4, false);
            while (i < i4) {
                i++;
                i5 = (this.zza.zzi()[i] & UByte.MAX_VALUE) + (i5 << 8);
            }
            this.zzb += i4 + 1;
            return i5;
        }
        return Long.MIN_VALUE;
    }

    public final boolean zza(zzps zzpsVar) throws IOException {
        long zzb;
        int i;
        long zzo = zzpsVar.zzo();
        long j = 1024;
        int i2 = (zzo > (-1L) ? 1 : (zzo == (-1L) ? 0 : -1));
        if (i2 != 0 && zzo <= 1024) {
            j = zzo;
        }
        int i3 = (int) j;
        zzpo zzpoVar = (zzpo) zzpsVar;
        zzpoVar.zzh(this.zza.zzi(), 0, 4, false);
        long zzt = this.zza.zzt();
        this.zzb = 4;
        while (zzt != 440786851) {
            int i4 = this.zzb + 1;
            this.zzb = i4;
            if (i4 == i3) {
                return false;
            }
            zzpoVar.zzh(this.zza.zzi(), 0, 1, false);
            zzt = ((zzt << 8) & (-256)) | (this.zza.zzi()[0] & UByte.MAX_VALUE);
        }
        long zzb2 = zzb(zzpsVar);
        long j2 = this.zzb;
        if (zzb2 != Long.MIN_VALUE && (i2 == 0 || j2 + zzb2 < zzo)) {
            while (true) {
                int i5 = (this.zzb > (j2 + zzb2) ? 1 : (this.zzb == (j2 + zzb2) ? 0 : -1));
                if (i5 < 0) {
                    if (zzb(zzpsVar) == Long.MIN_VALUE || (zzb = zzb(zzpsVar)) < 0) {
                        return false;
                    }
                    if (i != 0) {
                        int i6 = (int) zzb;
                        zzpoVar.zzj(i6, false);
                        this.zzb += i6;
                    }
                } else if (i5 == 0) {
                    return true;
                }
            }
        }
        return false;
    }
}
