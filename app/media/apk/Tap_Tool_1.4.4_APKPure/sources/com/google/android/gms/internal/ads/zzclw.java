package com.google.android.gms.internal.ads;

import android.content.Context;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
final class zzclw implements zzdqn {
    final /* synthetic */ zzclx zza;
    private final Long zzb;
    private final String zzc;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzclw(zzclx zzclxVar, Long l, String str, zzckz zzckzVar) {
        this.zza = zzclxVar;
        this.zzb = l;
        this.zzc = str;
    }

    @Override // com.google.android.gms.internal.ads.zzdqn
    public final zzdqx zza() {
        Context context;
        zzdqq zzc;
        long longValue = this.zzb.longValue();
        context = this.zza.zzb;
        zzc = zzdqr.zzc(this.zza.zzc);
        return zzdqy.zza(longValue, context, zzc, this.zza.zza, this.zzc);
    }

    @Override // com.google.android.gms.internal.ads.zzdqn
    public final zzdrb zzb() {
        Context context;
        zzdqq zzc;
        long longValue = this.zzb.longValue();
        context = this.zza.zzb;
        zzc = zzdqr.zzc(this.zza.zzc);
        return zzdrc.zza(longValue, context, zzc, this.zza.zza, this.zzc);
    }
}
