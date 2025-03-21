package com.google.android.gms.internal.ads;

import java.io.IOException;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
final class zzaaw implements zzabx {
    private final zzabx zza;
    private final long zzb;

    public zzaaw(zzabx zzabxVar, long j) {
        this.zza = zzabxVar;
        this.zzb = j;
    }

    public final zzabx zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzabx
    public final boolean zzb() {
        return this.zza.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzabx
    public final void zzc() throws IOException {
        this.zza.zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzabx
    public final int zzd(zzjr zzjrVar, zzol zzolVar, int i) {
        int zzd = this.zza.zzd(zzjrVar, zzolVar, i);
        if (zzd == -4) {
            zzolVar.zzd = Math.max(0L, zzolVar.zzd + this.zzb);
            return -4;
        }
        return zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzabx
    public final int zze(long j) {
        return this.zza.zze(j - this.zzb);
    }
}
