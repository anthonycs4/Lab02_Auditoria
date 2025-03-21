package com.google.android.gms.internal.ads;

import java.util.Objects;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
final class zzclv implements zzdqm {
    final /* synthetic */ zzclx zza;
    private Long zzb;
    private String zzc;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzclv(zzclx zzclxVar, zzckz zzckzVar) {
        this.zza = zzclxVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdqm
    public final zzdqn zza() {
        zzgdw.zzc(this.zzb, Long.class);
        zzgdw.zzc(this.zzc, String.class);
        return new zzclw(this.zza, this.zzb, this.zzc, null);
    }

    @Override // com.google.android.gms.internal.ads.zzdqm
    public final /* bridge */ /* synthetic */ zzdqm zzb(String str) {
        Objects.requireNonNull(str);
        this.zzc = str;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzdqm
    public final /* bridge */ /* synthetic */ zzdqm zzc(long j) {
        this.zzb = Long.valueOf(j);
        return this;
    }
}
