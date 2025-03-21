package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.rewarded.RewardedAd;
import com.google.android.gms.ads.rewarded.RewardedAdLoadCallback;
/* compiled from: com.google.android.gms:play-services-ads-lite@@20.2.0 */
/* loaded from: classes.dex */
public final class zzbzb extends zzbyu {
    private final RewardedAdLoadCallback zza;
    private final RewardedAd zzb;

    public zzbzb(RewardedAdLoadCallback rewardedAdLoadCallback, RewardedAd rewardedAd) {
        this.zza = rewardedAdLoadCallback;
        this.zzb = rewardedAd;
    }

    @Override // com.google.android.gms.internal.ads.zzbyv
    public final void zze() {
        RewardedAdLoadCallback rewardedAdLoadCallback = this.zza;
        if (rewardedAdLoadCallback != null) {
            rewardedAdLoadCallback.onAdLoaded(this.zzb);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbyv
    public final void zzf(int i) {
    }

    @Override // com.google.android.gms.internal.ads.zzbyv
    public final void zzg(zzazm zzazmVar) {
        if (this.zza != null) {
            this.zza.onAdFailedToLoad(zzazmVar.zzb());
        }
    }
}
