package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Objects;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public class zzapp {
    protected final zzapk zza;
    protected final int zzb;
    protected final int[] zzc;
    private final zzajt[] zzd;
    private int zze;

    public zzapp(zzapk zzapkVar, int... iArr) {
        int length = iArr.length;
        zzaqu.zzd(length > 0);
        Objects.requireNonNull(zzapkVar);
        this.zza = zzapkVar;
        this.zzb = length;
        this.zzd = new zzajt[length];
        for (int i = 0; i < iArr.length; i++) {
            this.zzd[i] = zzapkVar.zza(iArr[i]);
        }
        Arrays.sort(this.zzd, new zzapo(null));
        this.zzc = new int[this.zzb];
        for (int i2 = 0; i2 < this.zzb; i2++) {
            this.zzc[i2] = zzapkVar.zzb(this.zzd[i2]);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            zzapp zzappVar = (zzapp) obj;
            if (this.zza == zzappVar.zza && Arrays.equals(this.zzc, zzappVar.zzc)) {
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

    public final zzapk zza() {
        return this.zza;
    }

    public final int zzb() {
        return this.zzc.length;
    }

    public final zzajt zzc(int i) {
        return this.zzd[i];
    }

    public final int zzd(int i) {
        return this.zzc[0];
    }
}
