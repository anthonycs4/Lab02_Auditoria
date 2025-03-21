package com.google.android.gms.internal.ads;

import java.util.Arrays;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzadk {
    private int zza;
    private final zzacs[] zzb;

    public zzadk(zzacs[] zzacsVarArr, byte... bArr) {
        this.zzb = zzacsVarArr;
        int length = zzacsVarArr.length;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.zzb, ((zzadk) obj).zzb);
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
}
