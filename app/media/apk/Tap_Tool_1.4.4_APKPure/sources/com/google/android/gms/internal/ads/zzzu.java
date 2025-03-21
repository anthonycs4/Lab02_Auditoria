package com.google.android.gms.internal.ads;

import kotlin.jvm.internal.LongCompanionObject;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzzu implements zzabz {
    protected final zzabz[] zza;

    public zzzu(zzabz[] zzabzVarArr) {
        this.zza = zzabzVarArr;
    }

    @Override // com.google.android.gms.internal.ads.zzabz
    public final void zze(long j) {
        for (zzabz zzabzVar : this.zza) {
            zzabzVar.zze(j);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzabz
    public final long zzg() {
        long j = Long.MAX_VALUE;
        for (zzabz zzabzVar : this.zza) {
            long zzg = zzabzVar.zzg();
            if (zzg != Long.MIN_VALUE) {
                j = Math.min(j, zzg);
            }
        }
        if (j == LongCompanionObject.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        return j;
    }

    @Override // com.google.android.gms.internal.ads.zzabz
    public final long zzk() {
        long j = Long.MAX_VALUE;
        for (zzabz zzabzVar : this.zza) {
            long zzk = zzabzVar.zzk();
            if (zzk != Long.MIN_VALUE) {
                j = Math.min(j, zzk);
            }
        }
        if (j == LongCompanionObject.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        return j;
    }

    @Override // com.google.android.gms.internal.ads.zzabz
    public final boolean zzl(long j) {
        zzabz[] zzabzVarArr;
        boolean z;
        boolean z2 = false;
        do {
            long zzk = zzk();
            if (zzk == Long.MIN_VALUE) {
                break;
            }
            z = false;
            for (zzabz zzabzVar : this.zza) {
                long zzk2 = zzabzVar.zzk();
                boolean z3 = zzk2 != Long.MIN_VALUE && zzk2 <= j;
                if (zzk2 == zzk || z3) {
                    z |= zzabzVar.zzl(j);
                }
            }
            z2 |= z;
        } while (z);
        return true == z2;
    }

    @Override // com.google.android.gms.internal.ads.zzabz
    public final boolean zzn() {
        for (zzabz zzabzVar : this.zza) {
            if (zzabzVar.zzn()) {
                return true;
            }
        }
        return false;
    }
}
