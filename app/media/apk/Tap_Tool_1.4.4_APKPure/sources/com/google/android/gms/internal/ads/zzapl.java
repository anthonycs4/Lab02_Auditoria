package com.google.android.gms.internal.ads;

import java.util.Arrays;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzapl {
    public static final zzapl zza = new zzapl(new zzapk[0]);
    public final int zzb;
    private final zzapk[] zzc;
    private int zzd;

    public zzapl(zzapk... zzapkVarArr) {
        this.zzc = zzapkVarArr;
        this.zzb = zzapkVarArr.length;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            zzapl zzaplVar = (zzapl) obj;
            if (this.zzb == zzaplVar.zzb && Arrays.equals(this.zzc, zzaplVar.zzc)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.zzd;
        if (i == 0) {
            int hashCode = Arrays.hashCode(this.zzc);
            this.zzd = hashCode;
            return hashCode;
        }
        return i;
    }

    public final zzapk zza(int i) {
        return this.zzc[i];
    }

    public final int zzb(zzapk zzapkVar) {
        for (int i = 0; i < this.zzb; i++) {
            if (this.zzc[i] == zzapkVar) {
                return i;
            }
        }
        return -1;
    }
}
