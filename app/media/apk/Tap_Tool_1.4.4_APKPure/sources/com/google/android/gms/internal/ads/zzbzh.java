package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.rewardedinterstitial.RewardedInterstitialAdLoadCallback;
/* compiled from: com.google.android.gms:play-services-ads-lite@@20.2.0 */
/* loaded from: classes.dex */
public final class zzbzh extends zzbyu {
    private final RewardedInterstitialAdLoadCallback zza;
    private final zzbzi zzb;

    public zzbzh(RewardedInterstitialAdLoadCallback rewardedInterstitialAdLoadCallback, zzbzi zzbziVar) {
        this.zza = rewardedInterstitialAdLoadCallback;
        this.zzb = zzbziVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbyv
    public final void zze() {
        zzbzi zzbziVar;
        RewardedInterstitialAdLoadCallback rewardedInterstitialAdLoadCallback = this.zza;
        if (rewardedInterstitialAdLoadCallback == null || (zzbziVar = this.zzb) == null) {
            return;
        }
        rewardedInterstitialAdLoadCallback.onAdLoaded(zzbziVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbyv
    public final void zzf(int i) {
    }

    @Override // com.google.android.gms.internal.ads.zzbyv
    public final void zzg(zzazm zzazmVar) {
        RewardedInterstitialAdLoadCallback rewardedInterstitialAdLoadCallback = this.zza;
        if (rewardedInterstitialAdLoadCallback != null) {
            rewardedInterstitialAdLoadCallback.onAdFailedToLoad(zzazmVar.zzb());
        }
    }
}
