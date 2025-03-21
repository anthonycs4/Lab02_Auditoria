package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.List;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzaie {
    public final List<byte[]> zza;
    public final int zzb;
    public final String zzc;

    private zzaie(List<byte[]> list, int i, String str) {
        this.zza = list;
        this.zzb = i;
        this.zzc = str;
    }

    public static zzaie zza(zzahd zzahdVar) throws zzkr {
        try {
            zzahdVar.zzk(21);
            int zzn = zzahdVar.zzn() & 3;
            int zzn2 = zzahdVar.zzn();
            int zzg = zzahdVar.zzg();
            int i = 0;
            for (int i2 = 0; i2 < zzn2; i2++) {
                zzahdVar.zzk(1);
                int zzo = zzahdVar.zzo();
                for (int i3 = 0; i3 < zzo; i3++) {
                    int zzo2 = zzahdVar.zzo();
                    i += zzo2 + 4;
                    zzahdVar.zzk(zzo2);
                }
            }
            zzahdVar.zzh(zzg);
            byte[] bArr = new byte[i];
            String str = null;
            int i4 = 0;
            for (int i5 = 0; i5 < zzn2; i5++) {
                int zzn3 = zzahdVar.zzn() & 127;
                int zzo3 = zzahdVar.zzo();
                int i6 = 0;
                while (i6 < zzo3) {
                    int zzo4 = zzahdVar.zzo();
                    System.arraycopy(zzagv.zza, 0, bArr, i4, 4);
                    int i7 = i4 + 4;
                    System.arraycopy(zzahdVar.zzi(), zzahdVar.zzg(), bArr, i7, zzo4);
                    if (zzn3 == 33 && i6 == 0) {
                        str = zzafu.zzb(new zzahe(bArr, i7, i7 + zzo4));
                        i6 = 0;
                    }
                    i4 = i7 + zzo4;
                    zzahdVar.zzk(zzo4);
                    i6++;
                }
            }
            return new zzaie(i == 0 ? null : Collections.singletonList(bArr), zzn + 1, str);
        } catch (ArrayIndexOutOfBoundsException e) {
            throw new zzkr("Error parsing HEVC config", e);
        }
    }
}
