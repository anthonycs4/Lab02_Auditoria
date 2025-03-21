package com.google.android.gms.internal.ads;

import android.view.View;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
final class zzedv implements com.google.android.gms.ads.internal.zzf {
    final /* synthetic */ zzddv zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzedv(zzedw zzedwVar, zzddv zzddvVar) {
        this.zza = zzddvVar;
    }

    @Override // com.google.android.gms.ads.internal.zzf
    public final void zza(View view) {
    }

    @Override // com.google.android.gms.ads.internal.zzf
    public final void zzb() {
        this.zza.zzc().onAdClicked();
    }

    @Override // com.google.android.gms.ads.internal.zzf
    public final void zzc() {
        this.zza.zzd().zza();
        this.zza.zze().zza();
    }
}
