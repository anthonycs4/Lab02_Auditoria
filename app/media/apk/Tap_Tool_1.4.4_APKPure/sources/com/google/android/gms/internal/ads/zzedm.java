package com.google.android.gms.internal.ads;

import android.view.View;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
final class zzedm implements com.google.android.gms.ads.internal.zzf {
    final /* synthetic */ zzcde zza;
    final /* synthetic */ zzete zzb;
    final /* synthetic */ zzess zzc;
    final /* synthetic */ zzeds zzd;
    final /* synthetic */ zzedn zze;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzedm(zzedn zzednVar, zzcde zzcdeVar, zzete zzeteVar, zzess zzessVar, zzeds zzedsVar) {
        this.zze = zzednVar;
        this.zza = zzcdeVar;
        this.zzb = zzeteVar;
        this.zzc = zzessVar;
        this.zzd = zzedsVar;
    }

    @Override // com.google.android.gms.ads.internal.zzf
    public final void zza(View view) {
        zzedw zzedwVar;
        zzcde zzcdeVar = this.zza;
        zzedwVar = this.zze.zzd;
        zzcdeVar.zzc(zzedwVar.zza(this.zzb, this.zzc, view, this.zzd));
    }

    @Override // com.google.android.gms.ads.internal.zzf
    public final void zzb() {
    }

    @Override // com.google.android.gms.ads.internal.zzf
    public final void zzc() {
    }
}
