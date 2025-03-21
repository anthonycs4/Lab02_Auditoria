package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.nativead.NativeCustomFormatAd;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads-lite@@20.2.0 */
/* loaded from: classes.dex */
public final class zzbuv extends zzbjm {
    final /* synthetic */ zzbuw zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzbuv(zzbuw zzbuwVar, zzbut zzbutVar) {
        this.zza = zzbuwVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbjn
    public final void zze(zzbja zzbjaVar) {
        NativeCustomFormatAd.OnCustomFormatAdLoadedListener onCustomFormatAdLoadedListener;
        NativeCustomFormatAd zzf;
        onCustomFormatAdLoadedListener = this.zza.zza;
        zzf = this.zza.zzf(zzbjaVar);
        onCustomFormatAdLoadedListener.onCustomFormatAdLoaded(zzf);
    }
}
