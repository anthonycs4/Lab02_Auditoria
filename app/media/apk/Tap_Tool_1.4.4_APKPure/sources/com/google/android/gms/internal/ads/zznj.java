package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zznj {
    private final zzmh[] zza;
    private final zzoa zzb;
    private final zzoc zzc;

    public zznj(zzmh... zzmhVarArr) {
        zzoa zzoaVar = new zzoa();
        zzoc zzocVar = new zzoc();
        this.zza = r2;
        System.arraycopy(zzmhVarArr, 0, r2, 0, 0);
        this.zzb = zzoaVar;
        this.zzc = zzocVar;
        zzmh[] zzmhVarArr2 = {zzoaVar, zzocVar};
    }

    public final zzmh[] zza() {
        return this.zza;
    }

    public final zzku zzb(zzku zzkuVar) {
        this.zzc.zzi(zzkuVar.zzb);
        this.zzc.zzj(zzkuVar.zzc);
        return zzkuVar;
    }

    public final boolean zzc(boolean z) {
        this.zzb.zzo(z);
        return z;
    }

    public final long zzd(long j) {
        return this.zzc.zzk(j);
    }

    public final long zze() {
        return this.zzb.zzp();
    }
}
