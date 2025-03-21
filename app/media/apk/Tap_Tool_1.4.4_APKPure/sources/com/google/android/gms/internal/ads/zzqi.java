package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzqi implements zzqm {
    private final long[] zza;
    private final long[] zzb;
    private final long zzc;
    private final boolean zzd;

    public zzqi(long[] jArr, long[] jArr2, long j) {
        int length = jArr.length;
        int length2 = jArr2.length;
        zzafs.zza(length == length2);
        boolean z = length2 > 0;
        this.zzd = z;
        if (!z || jArr2[0] <= 0) {
            this.zza = jArr;
            this.zzb = jArr2;
        } else {
            int i = length2 + 1;
            long[] jArr3 = new long[i];
            this.zza = jArr3;
            long[] jArr4 = new long[i];
            this.zzb = jArr4;
            System.arraycopy(jArr, 0, jArr3, 1, length2);
            System.arraycopy(jArr2, 0, jArr4, 1, length2);
        }
        this.zzc = j;
    }

    @Override // com.google.android.gms.internal.ads.zzqm
    public final boolean zza() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzqm
    public final zzqk zzb(long j) {
        if (!this.zzd) {
            zzqn zzqnVar = zzqn.zza;
            return new zzqk(zzqnVar, zzqnVar);
        }
        int zzE = zzaht.zzE(this.zzb, j, true, true);
        zzqn zzqnVar2 = new zzqn(this.zzb[zzE], this.zza[zzE]);
        if (zzqnVar2.zzb != j) {
            long[] jArr = this.zzb;
            if (zzE != jArr.length - 1) {
                int i = zzE + 1;
                return new zzqk(zzqnVar2, new zzqn(jArr[i], this.zza[i]));
            }
        }
        return new zzqk(zzqnVar2, zzqnVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzqm
    public final long zzc() {
        return this.zzc;
    }
}
