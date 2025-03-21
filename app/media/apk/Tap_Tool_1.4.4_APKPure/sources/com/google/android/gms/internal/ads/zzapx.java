package com.google.android.gms.internal.ads;

import java.util.Arrays;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzapx {
    private int zza;
    private final zzapp[] zzb;

    public zzapx(zzapp[] zzappVarArr, byte... bArr) {
        this.zzb = zzappVarArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.zzb, ((zzapx) obj).zzb);
    }

    public final int hashCode() {
        int i = this.zza;
        if (i == 0) {
            int hashCode = Arrays.hashCode(this.zzb) + 527;
            this.zza = hashCode;
            return hashCode;
        }
        return i;
    }

    public final zzapp zza(int i) {
        return this.zzb[i];
    }

    public final zzapp[] zzb() {
        return (zzapp[]) this.zzb.clone();
    }
}
