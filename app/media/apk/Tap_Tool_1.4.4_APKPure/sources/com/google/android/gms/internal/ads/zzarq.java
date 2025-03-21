package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.List;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzarq {
    public final List<byte[]> zza;
    public final int zzb;

    private zzarq(List<byte[]> list, int i) {
        this.zza = list;
        this.zzb = i;
    }

    public static zzarq zza(zzarc zzarcVar) throws zzajw {
        try {
            zzarcVar.zzj(21);
            int zzl = zzarcVar.zzl() & 3;
            int zzl2 = zzarcVar.zzl();
            int zzg = zzarcVar.zzg();
            int i = 0;
            for (int i2 = 0; i2 < zzl2; i2++) {
                zzarcVar.zzj(1);
                int zzm = zzarcVar.zzm();
                for (int i3 = 0; i3 < zzm; i3++) {
                    int zzm2 = zzarcVar.zzm();
                    i += zzm2 + 4;
                    zzarcVar.zzj(zzm2);
                }
            }
            zzarcVar.zzi(zzg);
            byte[] bArr = new byte[i];
            int i4 = 0;
            for (int i5 = 0; i5 < zzl2; i5++) {
                zzarcVar.zzj(1);
                int zzm3 = zzarcVar.zzm();
                for (int i6 = 0; i6 < zzm3; i6++) {
                    int zzm4 = zzarcVar.zzm();
                    System.arraycopy(zzara.zza, 0, bArr, i4, 4);
                    int i7 = i4 + 4;
                    System.arraycopy(zzarcVar.zza, zzarcVar.zzg(), bArr, i7, zzm4);
                    i4 = i7 + zzm4;
                    zzarcVar.zzj(zzm4);
                }
            }
            return new zzarq(i == 0 ? null : Collections.singletonList(bArr), zzl + 1);
        } catch (ArrayIndexOutOfBoundsException e) {
            throw new zzajw("Error parsing HEVC config", e);
        }
    }
}
