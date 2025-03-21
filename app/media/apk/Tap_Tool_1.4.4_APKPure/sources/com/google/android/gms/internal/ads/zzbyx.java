package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.ads.FullScreenContentCallback;
import com.google.android.gms.ads.OnPaidEventListener;
import com.google.android.gms.ads.OnUserEarnedRewardListener;
import com.google.android.gms.ads.ResponseInfo;
import com.google.android.gms.ads.rewarded.OnAdMetadataChangedListener;
import com.google.android.gms.ads.rewarded.RewardItem;
import com.google.android.gms.ads.rewarded.RewardedAd;
import com.google.android.gms.ads.rewarded.RewardedAdLoadCallback;
import com.google.android.gms.ads.rewarded.ServerSideVerificationOptions;
import com.google.android.gms.dynamic.ObjectWrapper;
import javax.annotation.ParametersAreNonnullByDefault;
/* compiled from: com.google.android.gms:play-services-ads-lite@@20.2.0 */
@ParametersAreNonnullByDefault
/* loaded from: classes.dex */
public final class zzbyx extends RewardedAd {
    private final String zza;
    private final zzbyo zzb;
    private final Context zzc;
    private final zzbzg zzd = new zzbzg();
    private OnAdMetadataChangedListener zze;
    private OnPaidEventListener zzf;
    private FullScreenContentCallback zzg;

    public zzbyx(Context context, String str) {
        this.zzc = context.getApplicationContext();
        this.zza = str;
        this.zzb = zzbay.zzb().zzf(context, str, new zzbrb());
    }

    @Override // com.google.android.gms.ads.rewarded.RewardedAd
    public final Bundle getAdMetadata() {
        try {
            zzbyo zzbyoVar = this.zzb;
            if (zzbyoVar != null) {
                return zzbyoVar.zzg();
            }
        } catch (RemoteException e) {
            zzccn.zzl("#007 Could not call remote method.", e);
        }
        return new Bundle();
    }

    @Override // com.google.android.gms.ads.rewarded.RewardedAd
    public final String getAdUnitId() {
        return this.zza;
    }

    @Override // com.google.android.gms.ads.rewarded.RewardedAd
    public final FullScreenContentCallback getFullScreenContentCallback() {
        return this.zzg;
    }

    @Override // com.google.android.gms.ads.rewarded.RewardedAd
    public final OnAdMetadataChangedListener getOnAdMetadataChangedListener() {
        return this.zze;
    }

    @Override // com.google.android.gms.ads.rewarded.RewardedAd
    public final OnPaidEventListener getOnPaidEventListener() {
        return this.zzf;
    }

    @Override // com.google.android.gms.ads.rewarded.RewardedAd
    public final ResponseInfo getResponseInfo() {
        zzbdg zzbdgVar = null;
        try {
            zzbyo zzbyoVar = this.zzb;
            if (zzbyoVar != null) {
                zzbdgVar = zzbyoVar.zzm();
            }
        } catch (RemoteException e) {
            zzccn.zzl("#007 Could not call remote method.", e);
        }
        return ResponseInfo.zzc(zzbdgVar);
    }

    @Override // com.google.android.gms.ads.rewarded.RewardedAd
    public final RewardItem getRewardItem() {
        try {
            zzbyo zzbyoVar = this.zzb;
            zzbyl zzl = zzbyoVar != null ? zzbyoVar.zzl() : null;
            return zzl == null ? RewardItem.DEFAULT_REWARD : new zzbyy(zzl);
        } catch (RemoteException e) {
            zzccn.zzl("#007 Could not call remote method.", e);
            return RewardItem.DEFAULT_REWARD;
        }
    }

    @Override // com.google.android.gms.ads.rewarded.RewardedAd
    public final void setFullScreenContentCallback(FullScreenContentCallback fullScreenContentCallback) {
        this.zzg = fullScreenContentCallback;
        this.zzd.zzb(fullScreenContentCallback);
    }

    @Override // com.google.android.gms.ads.rewarded.RewardedAd
    public final void setImmersiveMode(boolean z) {
        try {
            zzbyo zzbyoVar = this.zzb;
            if (zzbyoVar != null) {
                zzbyoVar.zzo(z);
            }
        } catch (RemoteException e) {
            zzccn.zzl("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.ads.rewarded.RewardedAd
    public final void setOnAdMetadataChangedListener(OnAdMetadataChangedListener onAdMetadataChangedListener) {
        try {
            this.zze = onAdMetadataChangedListener;
            zzbyo zzbyoVar = this.zzb;
            if (zzbyoVar != null) {
                zzbyoVar.zzf(new zzbeq(onAdMetadataChangedListener));
            }
        } catch (RemoteException e) {
            zzccn.zzl("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.ads.rewarded.RewardedAd
    public final void setOnPaidEventListener(OnPaidEventListener onPaidEventListener) {
        try {
            this.zzf = onPaidEventListener;
            zzbyo zzbyoVar = this.zzb;
            if (zzbyoVar != null) {
                zzbyoVar.zzn(new zzber(onPaidEventListener));
            }
        } catch (RemoteException e) {
            zzccn.zzl("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.ads.rewarded.RewardedAd
    public final void setServerSideVerificationOptions(ServerSideVerificationOptions serverSideVerificationOptions) {
        if (serverSideVerificationOptions != null) {
            try {
                zzbyo zzbyoVar = this.zzb;
                if (zzbyoVar != null) {
                    zzbyoVar.zzh(new zzbzc(serverSideVerificationOptions));
                }
            } catch (RemoteException e) {
                zzccn.zzl("#007 Could not call remote method.", e);
            }
        }
    }

    @Override // com.google.android.gms.ads.rewarded.RewardedAd
    public final void show(Activity activity, OnUserEarnedRewardListener onUserEarnedRewardListener) {
        this.zzd.zzc(onUserEarnedRewardListener);
        if (activity == null) {
            zzccn.zzi("The activity for show is null, will proceed with show using the context provided when loading the ad.");
        }
        try {
            zzbyo zzbyoVar = this.zzb;
            if (zzbyoVar != null) {
                zzbyoVar.zze(this.zzd);
                this.zzb.zzb(ObjectWrapper.wrap(activity));
            }
        } catch (RemoteException e) {
            zzccn.zzl("#007 Could not call remote method.", e);
        }
    }

    public final void zza(zzbdq zzbdqVar, RewardedAdLoadCallback rewardedAdLoadCallback) {
        try {
            zzbyo zzbyoVar = this.zzb;
            if (zzbyoVar != null) {
                zzbyoVar.zzc(zzazw.zza.zza(this.zzc, zzbdqVar), new zzbzb(rewardedAdLoadCallback, this));
            }
        } catch (RemoteException e) {
            zzccn.zzl("#007 Could not call remote method.", e);
        }
    }
}
