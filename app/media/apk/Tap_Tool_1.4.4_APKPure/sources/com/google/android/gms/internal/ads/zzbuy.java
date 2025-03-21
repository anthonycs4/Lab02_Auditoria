package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.nativead.NativeAd;
/* compiled from: com.google.android.gms:play-services-ads-lite@@20.2.0 */
/* loaded from: classes.dex */
public final class zzbuy extends zzbjt {
    private final NativeAd.OnNativeAdLoadedListener zza;

    public zzbuy(NativeAd.OnNativeAdLoadedListener onNativeAdLoadedListener) {
        this.zza = onNativeAdLoadedListener;
    }

    @Override // com.google.android.gms.internal.ads.zzbju
    public final void zze(zzbkd zzbkdVar) {
        this.zza.onNativeAdLoaded(new zzbus(zzbkdVar));
    }
}
