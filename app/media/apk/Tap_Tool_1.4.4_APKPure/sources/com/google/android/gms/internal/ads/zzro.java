package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
final class zzro extends zzqf {
    private final long zza;

    public zzro(zzps zzpsVar, long j) {
        super(zzpsVar);
        zzafs.zza(zzpsVar.zzn() >= j);
        this.zza = j;
    }

    @Override // com.google.android.gms.internal.ads.zzqf, com.google.android.gms.internal.ads.zzps
    public final long zzm() {
        return super.zzm() - this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzqf, com.google.android.gms.internal.ads.zzps
    public final long zzn() {
        return super.zzn() - this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzqf, com.google.android.gms.internal.ads.zzps
    public final long zzo() {
        return super.zzo() - this.zza;
    }
}
