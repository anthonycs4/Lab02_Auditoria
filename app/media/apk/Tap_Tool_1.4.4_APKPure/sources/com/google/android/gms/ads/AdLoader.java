package com.google.android.gms.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.admanager.AdManagerAdRequest;
import com.google.android.gms.ads.formats.AdManagerAdViewOptions;
import com.google.android.gms.ads.formats.NativeAdOptions;
import com.google.android.gms.ads.formats.NativeCustomTemplateAd;
import com.google.android.gms.ads.formats.OnAdManagerAdViewLoadedListener;
import com.google.android.gms.ads.formats.UnifiedNativeAd;
import com.google.android.gms.ads.nativead.NativeAd;
import com.google.android.gms.ads.nativead.NativeCustomFormatAd;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.ads.zzazo;
import com.google.android.gms.internal.ads.zzazw;
import com.google.android.gms.internal.ads.zzazx;
import com.google.android.gms.internal.ads.zzbay;
import com.google.android.gms.internal.ads.zzbbn;
import com.google.android.gms.internal.ads.zzbbq;
import com.google.android.gms.internal.ads.zzbdq;
import com.google.android.gms.internal.ads.zzbeh;
import com.google.android.gms.internal.ads.zzbey;
import com.google.android.gms.internal.ads.zzbhy;
import com.google.android.gms.internal.ads.zzbkk;
import com.google.android.gms.internal.ads.zzbkm;
import com.google.android.gms.internal.ads.zzbkn;
import com.google.android.gms.internal.ads.zzbrb;
import com.google.android.gms.internal.ads.zzbuw;
import com.google.android.gms.internal.ads.zzbuy;
import com.google.android.gms.internal.ads.zzccn;
/* compiled from: com.google.android.gms:play-services-ads-lite@@20.2.0 */
/* loaded from: classes.dex */
public class AdLoader {
    private final zzazw zza;
    private final Context zzb;
    private final zzbbn zzc;

    AdLoader(Context context, zzbbn zzbbnVar, zzazw zzazwVar) {
        this.zzb = context;
        this.zzc = zzbbnVar;
        this.zza = zzazwVar;
    }

    private final void zza(zzbdq zzbdqVar) {
        try {
            this.zzc.zze(this.zza.zza(this.zzb, zzbdqVar));
        } catch (RemoteException e) {
            zzccn.zzg("Failed to load ad.", e);
        }
    }

    public boolean isLoading() {
        try {
            return this.zzc.zzg();
        } catch (RemoteException e) {
            zzccn.zzj("Failed to check if ad is loading.", e);
            return false;
        }
    }

    public void loadAd(AdRequest adRequest) {
        zza(adRequest.zza());
    }

    public void loadAds(AdRequest adRequest, int i) {
        try {
            this.zzc.zzi(this.zza.zza(this.zzb, adRequest.zza()), i);
        } catch (RemoteException e) {
            zzccn.zzg("Failed to load ads.", e);
        }
    }

    /* compiled from: com.google.android.gms:play-services-ads-lite@@20.2.0 */
    /* loaded from: classes.dex */
    public static class Builder {
        private final Context zza;
        private final zzbbq zzb;

        public Builder(Context context, String str) {
            zzbbq zzc = zzbay.zzb().zzc(context, str, new zzbrb());
            this.zza = (Context) Preconditions.checkNotNull(context, "context cannot be null");
            this.zzb = zzc;
        }

        public AdLoader build() {
            try {
                return new AdLoader(this.zza, this.zzb.zze(), zzazw.zza);
            } catch (RemoteException e) {
                zzccn.zzg("Failed to build AdLoader.", e);
                return new AdLoader(this.zza, new zzbeh().zzb(), zzazw.zza);
            }
        }

        public Builder forAdManagerAdView(OnAdManagerAdViewLoadedListener onAdManagerAdViewLoadedListener, AdSize... adSizeArr) {
            if (adSizeArr != null && adSizeArr.length > 0) {
                try {
                    this.zzb.zzk(new zzbkm(onAdManagerAdViewLoadedListener), new zzazx(this.zza, adSizeArr));
                } catch (RemoteException e) {
                    zzccn.zzj("Failed to add Google Ad Manager banner ad listener", e);
                }
                return this;
            }
            throw new IllegalArgumentException("The supported ad sizes must contain at least one valid ad size.");
        }

        public Builder forCustomFormatAd(String str, NativeCustomFormatAd.OnCustomFormatAdLoadedListener onCustomFormatAdLoadedListener, NativeCustomFormatAd.OnCustomClickListener onCustomClickListener) {
            zzbuw zzbuwVar = new zzbuw(onCustomFormatAdLoadedListener, onCustomClickListener);
            try {
                this.zzb.zzi(str, zzbuwVar.zza(), zzbuwVar.zzb());
            } catch (RemoteException e) {
                zzccn.zzj("Failed to add custom format ad listener", e);
            }
            return this;
        }

        @Deprecated
        public Builder forCustomTemplateAd(String str, NativeCustomTemplateAd.OnCustomTemplateAdLoadedListener onCustomTemplateAdLoadedListener, NativeCustomTemplateAd.OnCustomClickListener onCustomClickListener) {
            zzbkk zzbkkVar = new zzbkk(onCustomTemplateAdLoadedListener, onCustomClickListener);
            try {
                this.zzb.zzi(str, zzbkkVar.zza(), zzbkkVar.zzb());
            } catch (RemoteException e) {
                zzccn.zzj("Failed to add custom template ad listener", e);
            }
            return this;
        }

        public Builder forNativeAd(NativeAd.OnNativeAdLoadedListener onNativeAdLoadedListener) {
            try {
                this.zzb.zzm(new zzbuy(onNativeAdLoadedListener));
            } catch (RemoteException e) {
                zzccn.zzj("Failed to add google native ad listener", e);
            }
            return this;
        }

        @Deprecated
        public Builder forUnifiedNativeAd(UnifiedNativeAd.OnUnifiedNativeAdLoadedListener onUnifiedNativeAdLoadedListener) {
            try {
                this.zzb.zzm(new zzbkn(onUnifiedNativeAdLoadedListener));
            } catch (RemoteException e) {
                zzccn.zzj("Failed to add google native ad listener", e);
            }
            return this;
        }

        public Builder withAdListener(AdListener adListener) {
            try {
                this.zzb.zzf(new zzazo(adListener));
            } catch (RemoteException e) {
                zzccn.zzj("Failed to set AdListener.", e);
            }
            return this;
        }

        public Builder withAdManagerAdViewOptions(AdManagerAdViewOptions adManagerAdViewOptions) {
            try {
                this.zzb.zzp(adManagerAdViewOptions);
            } catch (RemoteException e) {
                zzccn.zzj("Failed to specify Ad Manager banner ad options", e);
            }
            return this;
        }

        @Deprecated
        public Builder withNativeAdOptions(NativeAdOptions nativeAdOptions) {
            try {
                this.zzb.zzj(new zzbhy(nativeAdOptions));
            } catch (RemoteException e) {
                zzccn.zzj("Failed to specify native ad options", e);
            }
            return this;
        }

        public Builder withNativeAdOptions(com.google.android.gms.ads.nativead.NativeAdOptions nativeAdOptions) {
            try {
                this.zzb.zzj(new zzbhy(4, nativeAdOptions.shouldReturnUrlsForImageAssets(), -1, nativeAdOptions.shouldRequestMultipleImages(), nativeAdOptions.getAdChoicesPlacement(), nativeAdOptions.getVideoOptions() != null ? new zzbey(nativeAdOptions.getVideoOptions()) : null, nativeAdOptions.zza(), nativeAdOptions.getMediaAspectRatio()));
            } catch (RemoteException e) {
                zzccn.zzj("Failed to specify native ad options", e);
            }
            return this;
        }
    }

    public void loadAd(AdManagerAdRequest adManagerAdRequest) {
        zza(adManagerAdRequest.zza);
    }
}
