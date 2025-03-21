package com.google.android.gms.internal.ads;

import java.io.IOException;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
final class zzabh implements zzabx {
    final /* synthetic */ zzabk zza;
    private final int zzb;

    public zzabh(zzabk zzabkVar, int i) {
        this.zza = zzabkVar;
        this.zzb = i;
    }

    @Override // com.google.android.gms.internal.ads.zzabx
    public final boolean zzb() {
        return this.zza.zzo(this.zzb);
    }

    @Override // com.google.android.gms.internal.ads.zzabx
    public final void zzc() throws IOException {
        this.zza.zzq(this.zzb);
    }

    @Override // com.google.android.gms.internal.ads.zzabx
    public final int zzd(zzjr zzjrVar, zzol zzolVar, int i) {
        return this.zza.zzs(this.zzb, zzjrVar, zzolVar, i);
    }

    @Override // com.google.android.gms.internal.ads.zzabx
    public final int zze(long j) {
        return this.zza.zzt(this.zzb, j);
    }
}
