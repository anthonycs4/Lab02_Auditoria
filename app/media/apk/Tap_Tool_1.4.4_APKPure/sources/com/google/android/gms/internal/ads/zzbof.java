package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.AdLoadCallback;
import com.google.android.gms.ads.FullScreenContentCallback;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.OnPaidEventListener;
import com.google.android.gms.ads.ResponseInfo;
import com.google.android.gms.ads.admanager.AdManagerInterstitialAd;
import com.google.android.gms.ads.admanager.AppEventListener;
import com.google.android.gms.dynamic.ObjectWrapper;
/* compiled from: com.google.android.gms:play-services-ads-lite@@20.2.0 */
/* loaded from: classes.dex */
public final class zzbof<AdT> extends AdManagerInterstitialAd {
    private final Context zza;
    private final zzazw zzb;
    private final zzbbu zzc;
    private final String zzd;
    private final zzbrb zze;
    private AppEventListener zzf;
    private FullScreenContentCallback zzg;
    private OnPaidEventListener zzh;

    public zzbof(Context context, String str) {
        zzbrb zzbrbVar = new zzbrb();
        this.zze = zzbrbVar;
        this.zza = context;
        this.zzd = str;
        this.zzb = zzazw.zza;
        this.zzc = zzbay.zzb().zzb(context, new zzazx(), str, zzbrbVar);
    }

    @Override // com.google.android.gms.ads.interstitial.InterstitialAd
    public final String getAdUnitId() {
        return this.zzd;
    }

    @Override // com.google.android.gms.ads.admanager.AdManagerInterstitialAd
    public final AppEventListener getAppEventListener() {
        return this.zzf;
    }

    @Override // com.google.android.gms.ads.interstitial.InterstitialAd
    public final FullScreenContentCallback getFullScreenContentCallback() {
        return this.zzg;
    }

    @Override // com.google.android.gms.ads.interstitial.InterstitialAd
    public final OnPaidEventListener getOnPaidEventListener() {
        return this.zzh;
    }

    @Override // com.google.android.gms.ads.interstitial.InterstitialAd
    public final ResponseInfo getResponseInfo() {
        zzbdg zzbdgVar = null;
        try {
            zzbbu zzbbuVar = this.zzc;
            if (zzbbuVar != null) {
                zzbdgVar = zzbbuVar.zzt();
            }
        } catch (RemoteException e) {
            zzccn.zzl("#007 Could not call remote method.", e);
        }
        return ResponseInfo.zzc(zzbdgVar);
    }

    @Override // com.google.android.gms.ads.admanager.AdManagerInterstitialAd
    public final void setAppEventListener(AppEventListener appEventListener) {
        try {
            this.zzf = appEventListener;
            zzbbu zzbbuVar = this.zzc;
            if (zzbbuVar != null) {
                zzbbuVar.zzi(appEventListener != null ? new zzasw(appEventListener) : null);
            }
        } catch (RemoteException e) {
            zzccn.zzl("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.ads.interstitial.InterstitialAd
    public final void setFullScreenContentCallback(FullScreenContentCallback fullScreenContentCallback) {
        try {
            this.zzg = fullScreenContentCallback;
            zzbbu zzbbuVar = this.zzc;
            if (zzbbuVar != null) {
                zzbbuVar.zzR(new zzbbb(fullScreenContentCallback));
            }
        } catch (RemoteException e) {
            zzccn.zzl("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.ads.interstitial.InterstitialAd
    public final void setImmersiveMode(boolean z) {
        try {
            zzbbu zzbbuVar = this.zzc;
            if (zzbbuVar != null) {
                zzbbuVar.zzJ(z);
            }
        } catch (RemoteException e) {
            zzccn.zzl("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.ads.interstitial.InterstitialAd
    public final void setOnPaidEventListener(OnPaidEventListener onPaidEventListener) {
        try {
            this.zzh = onPaidEventListener;
            zzbbu zzbbuVar = this.zzc;
            if (zzbbuVar != null) {
                zzbbuVar.zzO(new zzber(onPaidEventListener));
            }
        } catch (RemoteException e) {
            zzccn.zzl("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.ads.interstitial.InterstitialAd
    public final void show(Activity activity) {
        if (activity == null) {
            zzccn.zzi("The activity for show is null, will proceed with show using the context provided when loading the ad.");
        }
        try {
            zzbbu zzbbuVar = this.zzc;
            if (zzbbuVar != null) {
                zzbbuVar.zzQ(ObjectWrapper.wrap(activity));
            }
        } catch (RemoteException e) {
            zzccn.zzl("#007 Could not call remote method.", e);
        }
    }

    public final void zza(zzbdq zzbdqVar, AdLoadCallback<AdT> adLoadCallback) {
        try {
            if (this.zzc != null) {
                this.zze.zze(zzbdqVar.zzn());
                this.zzc.zzP(this.zzb.zza(this.zza, zzbdqVar), new zzazp(adLoadCallback, this));
            }
        } catch (RemoteException e) {
            zzccn.zzl("#007 Could not call remote method.", e);
            adLoadCallback.onAdFailedToLoad(new LoadAdError(0, "Internal Error.", MobileAds.ERROR_DOMAIN, null, null));
        }
    }
}
