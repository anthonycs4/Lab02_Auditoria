package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.formats.UnifiedNativeAd;
/* compiled from: com.google.android.gms:play-services-ads-lite@@20.2.0 */
/* loaded from: classes.dex */
public final class zzbkn extends zzbjt {
    private final UnifiedNativeAd.OnUnifiedNativeAdLoadedListener zza;

    public zzbkn(UnifiedNativeAd.OnUnifiedNativeAdLoadedListener onUnifiedNativeAdLoadedListener) {
        this.zza = onUnifiedNativeAdLoadedListener;
    }

    @Override // com.google.android.gms.internal.ads.zzbju
    public final void zze(zzbkd zzbkdVar) {
        this.zza.onUnifiedNativeAdLoaded(new zzbke(zzbkdVar));
    }
}
