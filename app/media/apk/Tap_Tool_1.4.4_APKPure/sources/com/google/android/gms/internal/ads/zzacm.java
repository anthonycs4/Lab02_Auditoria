package com.google.android.gms.internal.ads;

import java.util.Arrays;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzacm {
    public static final zzacm zza = new zzacm(null, new long[0], null, 0, -9223372036854775807L);
    public static final zzhw<zzacm> zzf = zzacj.zza;
    public final int zzb;
    public final long[] zzc;
    public final zzacl[] zzd;
    public final long zze = 0;

    private zzacm(Object obj, long[] jArr, zzacl[] zzaclVarArr, long j, long j2) {
        this.zzc = jArr;
        int length = jArr.length;
        this.zzb = length;
        zzacl[] zzaclVarArr2 = new zzacl[length];
        for (int i = 0; i < this.zzb; i++) {
            zzaclVarArr2[i] = new zzacl();
        }
        this.zzd = zzaclVarArr2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            zzacm zzacmVar = (zzacm) obj;
            if (zzaht.zzc(null, null) && this.zzb == zzacmVar.zzb && Arrays.equals(this.zzc, zzacmVar.zzc) && Arrays.equals(this.zzd, zzacmVar.zzd)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((((this.zzb * 29791) + ((int) (-9223372036854775807L))) * 31) + Arrays.hashCode(this.zzc)) * 31) + Arrays.hashCode(this.zzd);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("AdPlaybackState(adsId=");
        sb.append((Object) null);
        sb.append(", adResumePositionUs=0, adGroups=[");
        for (int i = 0; i < this.zzd.length; i++) {
            sb.append("adGroup(timeUs=");
            sb.append(this.zzc[i]);
            sb.append(", ads=[");
            int[] iArr = this.zzd[i].zzc;
            sb.append("])");
            if (i < this.zzd.length - 1) {
                sb.append(", ");
            }
        }
        sb.append("])");
        return sb.toString();
    }
}
