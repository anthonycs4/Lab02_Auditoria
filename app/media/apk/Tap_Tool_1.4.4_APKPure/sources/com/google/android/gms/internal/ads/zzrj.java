package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
abstract class zzrj {
    protected final zzqq zza;

    /* JADX INFO: Access modifiers changed from: protected */
    public zzrj(zzqq zzqqVar) {
        this.zza = zzqqVar;
    }

    protected abstract boolean zza(zzahd zzahdVar) throws zzkr;

    protected abstract boolean zzb(zzahd zzahdVar, long j) throws zzkr;

    public final boolean zzf(zzahd zzahdVar, long j) throws zzkr {
        return zza(zzahdVar) && zzb(zzahdVar, j);
    }
}
