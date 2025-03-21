package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.util.Arrays;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzacl {
    public static final zzhw<zzacl> zze = zzack.zza;
    public final int zza = -1;
    public final int[] zzc = new int[0];
    public final Uri[] zzb = new Uri[0];
    public final long[] zzd = new long[0];

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            zzacl zzaclVar = (zzacl) obj;
            if (Arrays.equals(this.zzb, zzaclVar.zzb) && Arrays.equals(this.zzc, zzaclVar.zzc) && Arrays.equals(this.zzd, zzaclVar.zzd)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((Arrays.hashCode(this.zzb) - 31) * 31) + Arrays.hashCode(this.zzc)) * 31) + Arrays.hashCode(this.zzd);
    }
}
