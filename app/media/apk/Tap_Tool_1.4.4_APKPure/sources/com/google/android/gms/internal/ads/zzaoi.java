package com.google.android.gms.internal.ads;

import kotlin.jvm.internal.LongCompanionObject;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzaoi implements zzapi {
    private final zzapi[] zza;

    public zzaoi(zzapi[] zzapiVarArr) {
        this.zza = zzapiVarArr;
    }

    @Override // com.google.android.gms.internal.ads.zzapi
    public final long zza() {
        long j = Long.MAX_VALUE;
        for (zzapi zzapiVar : this.zza) {
            long zza = zzapiVar.zza();
            if (zza != Long.MIN_VALUE) {
                j = Math.min(j, zza);
            }
        }
        if (j == LongCompanionObject.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        return j;
    }

    @Override // com.google.android.gms.internal.ads.zzapi
    public final boolean zzb(long j) {
        zzapi[] zzapiVarArr;
        boolean z;
        boolean z2 = false;
        do {
            long zza = zza();
            if (zza == Long.MIN_VALUE) {
                break;
            }
            z = false;
            for (zzapi zzapiVar : this.zza) {
                if (zzapiVar.zza() == zza) {
                    z |= zzapiVar.zzb(j);
                }
            }
            z2 |= z;
        } while (z);
        return true == z2;
    }
}
