package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzals implements zzamb {
    public final int[] zza;
    public final long[] zzb;
    public final long[] zzc;
    public final long[] zzd;
    private final long zze;

    public zzals(int[] iArr, long[] jArr, long[] jArr2, long[] jArr3) {
        this.zza = iArr;
        this.zzb = jArr;
        this.zzc = jArr2;
        this.zzd = jArr3;
        int length = iArr.length;
        if (length <= 0) {
            this.zze = 0L;
            return;
        }
        int i = length - 1;
        this.zze = jArr2[i] + jArr3[i];
    }

    @Override // com.google.android.gms.internal.ads.zzamb
    public final boolean zza() {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzamb
    public final long zzb() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzamb
    public final long zzc(long j) {
        return this.zzb[zzarj.zzh(this.zzd, j, true, true)];
    }
}
