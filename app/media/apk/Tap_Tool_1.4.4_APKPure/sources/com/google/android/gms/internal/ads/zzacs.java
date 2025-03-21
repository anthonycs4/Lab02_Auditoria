package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Objects;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public class zzacs {
    protected final zzacf zza;
    protected final int zzb;
    protected final int[] zzc;
    private final zzjq[] zzd;
    private int zze;

    public zzacs(zzacf zzacfVar, int[] iArr, int i) {
        int length = iArr.length;
        zzafs.zzd(length > 0);
        Objects.requireNonNull(zzacfVar);
        this.zza = zzacfVar;
        this.zzb = length;
        this.zzd = new zzjq[length];
        for (int i2 = 0; i2 < iArr.length; i2++) {
            this.zzd[i2] = zzacfVar.zza(iArr[i2]);
        }
        Arrays.sort(this.zzd, zzacr.zza);
        this.zzc = new int[this.zzb];
        for (int i3 = 0; i3 < this.zzb; i3++) {
            this.zzc[i3] = zzacfVar.zzb(this.zzd[i3]);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            zzacs zzacsVar = (zzacs) obj;
            if (this.zza == zzacsVar.zza && Arrays.equals(this.zzc, zzacsVar.zzc)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.zze;
        if (i == 0) {
            int identityHashCode = (System.identityHashCode(this.zza) * 31) + Arrays.hashCode(this.zzc);
            this.zze = identityHashCode;
            return identityHashCode;
        }
        return i;
    }

    public final zzacf zzb() {
        return this.zza;
    }

    public final int zzc() {
        return this.zzc.length;
    }

    public final zzjq zzd(int i) {
        return this.zzd[i];
    }

    public final int zze(int i) {
        return this.zzc[0];
    }
}
