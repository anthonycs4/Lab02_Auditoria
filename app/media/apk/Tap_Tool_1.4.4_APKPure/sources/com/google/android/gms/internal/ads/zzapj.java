package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzapj extends zzake {
    private static final Object zzb = new Object();
    private final long zzc;
    private final long zzd;

    public zzapj(long j, boolean z) {
        this.zzc = j;
        this.zzd = j;
    }

    @Override // com.google.android.gms.internal.ads.zzake
    public final int zza() {
        return 1;
    }

    @Override // com.google.android.gms.internal.ads.zzake
    public final zzakd zzb(int i, zzakd zzakdVar, boolean z, long j) {
        zzaqu.zzc(i, 0, 1);
        zzakdVar.zza = this.zzd;
        return zzakdVar;
    }

    @Override // com.google.android.gms.internal.ads.zzake
    public final int zzc() {
        return 1;
    }

    @Override // com.google.android.gms.internal.ads.zzake
    public final zzakc zzd(int i, zzakc zzakcVar, boolean z) {
        zzaqu.zzc(i, 0, 1);
        Object obj = z ? zzb : null;
        long j = this.zzc;
        zzakcVar.zza = obj;
        zzakcVar.zzb = obj;
        zzakcVar.zzc = j;
        return zzakcVar;
    }

    @Override // com.google.android.gms.internal.ads.zzake
    public final int zze(Object obj) {
        return zzb.equals(obj) ? 0 : -1;
    }
}
