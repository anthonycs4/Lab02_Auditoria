package com.google.android.gms.internal.ads;

import java.io.IOException;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
final class zzaop implements zzapg {
    final /* synthetic */ zzaoq zza;
    private final int zzb;

    public zzaop(zzaoq zzaoqVar, int i) {
        this.zza = zzaoqVar;
        this.zzb = i;
    }

    @Override // com.google.android.gms.internal.ads.zzapg
    public final boolean zza() {
        return this.zza.zzl(this.zzb);
    }

    @Override // com.google.android.gms.internal.ads.zzapg
    public final void zzb() throws IOException {
        this.zza.zzm();
    }

    @Override // com.google.android.gms.internal.ads.zzapg
    public final int zzc(zzaju zzajuVar, zzalm zzalmVar, boolean z) {
        return this.zza.zzn(this.zzb, zzajuVar, zzalmVar, z);
    }

    @Override // com.google.android.gms.internal.ads.zzapg
    public final void zzd(long j) {
        this.zza.zzo(this.zzb, j);
    }
}
