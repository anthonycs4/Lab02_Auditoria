package com.google.android.gms.internal.ads;

import java.util.Arrays;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzapk {
    public final int zza;
    private final zzajt[] zzb;
    private int zzc;

    public zzapk(zzajt... zzajtVarArr) {
        int length = zzajtVarArr.length;
        zzaqu.zzd(length > 0);
        this.zzb = zzajtVarArr;
        this.zza = length;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            zzapk zzapkVar = (zzapk) obj;
            if (this.zza == zzapkVar.zza && Arrays.equals(this.zzb, zzapkVar.zzb)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.zzc;
        if (i == 0) {
            int hashCode = Arrays.hashCode(this.zzb) + 527;
            this.zzc = hashCode;
            return hashCode;
        }
        return i;
    }

    public final zzajt zza(int i) {
        return this.zzb[i];
    }

    public final int zzb(zzajt zzajtVar) {
        int i = 0;
        while (true) {
            zzajt[] zzajtVarArr = this.zzb;
            if (i >= zzajtVarArr.length) {
                return -1;
            }
            if (zzajtVar == zzajtVarArr[i]) {
                return i;
            }
            i++;
        }
    }
}
