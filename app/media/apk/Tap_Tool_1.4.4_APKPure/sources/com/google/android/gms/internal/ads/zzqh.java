package com.google.android.gms.internal.ads;

import java.io.EOFException;
import java.io.IOException;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzqh {
    private final zzahd zza = new zzahd(10);

    public final zzxu zza(zzps zzpsVar, zzys zzysVar) throws IOException {
        zzxu zzxuVar = null;
        int i = 0;
        while (true) {
            try {
                ((zzpo) zzpsVar).zzh(this.zza.zzi(), 0, 10, false);
                this.zza.zzh(0);
                if (this.zza.zzr() != 4801587) {
                    break;
                }
                this.zza.zzk(3);
                int zzA = this.zza.zzA();
                int i2 = zzA + 10;
                if (zzxuVar == null) {
                    byte[] bArr = new byte[i2];
                    System.arraycopy(this.zza.zzi(), 0, bArr, 0, 10);
                    ((zzpo) zzpsVar).zzh(bArr, 10, zzA, false);
                    zzxuVar = zzyu.zza(bArr, i2, zzysVar, new zzxv());
                } else {
                    ((zzpo) zzpsVar).zzj(zzA, false);
                }
                i += i2;
            } catch (EOFException unused) {
            }
        }
        zzpsVar.zzl();
        ((zzpo) zzpsVar).zzj(i, false);
        return zzxuVar;
    }
}
