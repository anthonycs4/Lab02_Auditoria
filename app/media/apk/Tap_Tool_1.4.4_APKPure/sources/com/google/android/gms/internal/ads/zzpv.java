package com.google.android.gms.internal.ads;

import java.io.IOException;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
final class zzpv {
    public static int zza(zzps zzpsVar, byte[] bArr, int i, int i2) throws IOException {
        int i3 = 0;
        while (i3 < i2) {
            int zzg = zzpsVar.zzg(bArr, i + i3, i2 - i3);
            if (zzg == -1) {
                break;
            }
            i3 += zzg;
        }
        return i3;
    }
}
