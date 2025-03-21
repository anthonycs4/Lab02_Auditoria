package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Arrays;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzqb {
    public static zzqd zzb(zzahd zzahdVar) {
        zzahdVar.zzk(1);
        int zzr = zzahdVar.zzr();
        long zzg = zzahdVar.zzg() + zzr;
        int i = zzr / 18;
        long[] jArr = new long[i];
        long[] jArr2 = new long[i];
        int i2 = 0;
        while (true) {
            if (i2 >= i) {
                break;
            }
            long zzx = zzahdVar.zzx();
            if (zzx != -1) {
                jArr[i2] = zzx;
                jArr2[i2] = zzahdVar.zzx();
                zzahdVar.zzk(2);
                i2++;
            } else {
                jArr = Arrays.copyOf(jArr, i2);
                jArr2 = Arrays.copyOf(jArr2, i2);
                break;
            }
        }
        zzahdVar.zzk((int) (zzg - zzahdVar.zzg()));
        return new zzqd(jArr, jArr2);
    }

    public static zzxu zza(zzps zzpsVar, boolean z) throws IOException {
        zzxu zza = new zzqh().zza(zzpsVar, z ? null : zzyu.zza);
        if (zza == null || zza.zza() == 0) {
            return null;
        }
        return zza;
    }
}
