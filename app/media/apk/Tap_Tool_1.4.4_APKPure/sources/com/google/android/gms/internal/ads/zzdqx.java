package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.dynamic.ObjectWrapper;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzdqx implements zzdql {
    private final long zza;
    private final zzefm zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzdqx(long j, Context context, zzdqq zzdqqVar, zzcjz zzcjzVar, String str) {
        this.zza = j;
        zzeqz zzq = zzcjzVar.zzq();
        zzq.zzd(context);
        zzq.zzb(new zzazx());
        zzq.zzc(str);
        zzefm zza = zzq.zza().zza();
        this.zzb = zza;
        zza.zzh(new zzdqw(this, zzdqqVar));
    }

    @Override // com.google.android.gms.internal.ads.zzdql
    public final void zza(zzazs zzazsVar) {
        this.zzb.zze(zzazsVar);
    }

    @Override // com.google.android.gms.internal.ads.zzdql
    public final void zzb() {
        this.zzb.zzQ(ObjectWrapper.wrap(null));
    }

    @Override // com.google.android.gms.internal.ads.zzdql
    public final void zzc() {
        this.zzb.zzc();
    }
}
