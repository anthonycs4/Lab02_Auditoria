package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzpi {
    public static final zzpi zza = new zzpi(-3, -9223372036854775807L, -1);
    private final int zzb;
    private final long zzc;
    private final long zzd;

    private zzpi(int i, long j, long j2) {
        this.zzb = i;
        this.zzc = j;
        this.zzd = j2;
    }

    public static zzpi zza(long j, long j2) {
        return new zzpi(-1, j, j2);
    }

    public static zzpi zzb(long j, long j2) {
        return new zzpi(-2, j, j2);
    }

    public static zzpi zzc(long j) {
        return new zzpi(0, -9223372036854775807L, j);
    }
}
