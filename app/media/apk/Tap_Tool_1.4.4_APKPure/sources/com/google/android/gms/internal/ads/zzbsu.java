package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.ads.AdRequest;
import com.google.ads.mediation.MediationBannerAdapter;
import com.google.ads.mediation.MediationBannerListener;
import com.google.ads.mediation.MediationInterstitialAdapter;
import com.google.ads.mediation.MediationInterstitialListener;
import com.google.ads.mediation.MediationServerParameters;
import com.google.ads.mediation.NetworkExtras;
/* compiled from: com.google.android.gms:play-services-ads-lite@@20.2.0 */
/* loaded from: classes.dex */
public final class zzbsu<NETWORK_EXTRAS extends NetworkExtras, SERVER_PARAMETERS extends MediationServerParameters> implements MediationBannerListener, MediationInterstitialListener {
    private final zzbrk zza;

    public zzbsu(zzbrk zzbrkVar) {
        this.zza = zzbrkVar;
    }

    @Override // com.google.ads.mediation.MediationBannerListener
    public final void onClick(MediationBannerAdapter<?, ?> mediationBannerAdapter) {
        zzccn.zzd("Adapter called onClick.");
        zzbay.zza();
        if (!zzccg.zzp()) {
            zzccn.zzl("#008 Must be called on the main UI thread.", null);
            zzccg.zza.post(new zzbsl(this));
            return;
        }
        try {
            this.zza.zze();
        } catch (RemoteException e) {
            zzccn.zzl("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.ads.mediation.MediationBannerListener
    public final void onDismissScreen(MediationBannerAdapter<?, ?> mediationBannerAdapter) {
        zzccn.zzd("Adapter called onDismissScreen.");
        zzbay.zza();
        if (!zzccg.zzp()) {
            zzccn.zzi("#008 Must be called on the main UI thread.");
            zzccg.zza.post(new zzbsm(this));
            return;
        }
        try {
            this.zza.zzf();
        } catch (RemoteException e) {
            zzccn.zzl("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.ads.mediation.MediationBannerListener
    public final void onFailedToReceiveAd(MediationBannerAdapter<?, ?> mediationBannerAdapter, AdRequest.ErrorCode errorCode) {
        String valueOf = String.valueOf(errorCode);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 47);
        sb.append("Adapter called onFailedToReceiveAd with error. ");
        sb.append(valueOf);
        zzccn.zzd(sb.toString());
        zzbay.zza();
        if (!zzccg.zzp()) {
            zzccn.zzl("#008 Must be called on the main UI thread.", null);
            zzccg.zza.post(new zzbsn(this, errorCode));
            return;
        }
        try {
            this.zza.zzg(zzbsv.zza(errorCode));
        } catch (RemoteException e) {
            zzccn.zzl("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.ads.mediation.MediationBannerListener
    public final void onLeaveApplication(MediationBannerAdapter<?, ?> mediationBannerAdapter) {
        zzccn.zzd("Adapter called onLeaveApplication.");
        zzbay.zza();
        if (!zzccg.zzp()) {
            zzccn.zzl("#008 Must be called on the main UI thread.", null);
            zzccg.zza.post(new zzbso(this));
            return;
        }
        try {
            this.zza.zzh();
        } catch (RemoteException e) {
            zzccn.zzl("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.ads.mediation.MediationBannerListener
    public final void onPresentScreen(MediationBannerAdapter<?, ?> mediationBannerAdapter) {
        zzccn.zzd("Adapter called onPresentScreen.");
        zzbay.zza();
        if (!zzccg.zzp()) {
            zzccn.zzl("#008 Must be called on the main UI thread.", null);
            zzccg.zza.post(new zzbsp(this));
            return;
        }
        try {
            this.zza.zzi();
        } catch (RemoteException e) {
            zzccn.zzl("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.ads.mediation.MediationBannerListener
    public final void onReceivedAd(MediationBannerAdapter<?, ?> mediationBannerAdapter) {
        zzccn.zzd("Adapter called onReceivedAd.");
        zzbay.zza();
        if (!zzccg.zzp()) {
            zzccn.zzl("#008 Must be called on the main UI thread.", null);
            zzccg.zza.post(new zzbsq(this));
            return;
        }
        try {
            this.zza.zzj();
        } catch (RemoteException e) {
            zzccn.zzl("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.ads.mediation.MediationInterstitialListener
    public final void onDismissScreen(MediationInterstitialAdapter<?, ?> mediationInterstitialAdapter) {
        zzccn.zzd("Adapter called onDismissScreen.");
        zzbay.zza();
        if (!zzccg.zzp()) {
            zzccn.zzl("#008 Must be called on the main UI thread.", null);
            zzccg.zza.post(new zzbsr(this));
            return;
        }
        try {
            this.zza.zzf();
        } catch (RemoteException e) {
            zzccn.zzl("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.ads.mediation.MediationInterstitialListener
    public final void onFailedToReceiveAd(MediationInterstitialAdapter<?, ?> mediationInterstitialAdapter, AdRequest.ErrorCode errorCode) {
        String valueOf = String.valueOf(errorCode);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 47);
        sb.append("Adapter called onFailedToReceiveAd with error ");
        sb.append(valueOf);
        sb.append(".");
        zzccn.zzd(sb.toString());
        zzbay.zza();
        if (!zzccg.zzp()) {
            zzccn.zzl("#008 Must be called on the main UI thread.", null);
            zzccg.zza.post(new zzbss(this, errorCode));
            return;
        }
        try {
            this.zza.zzg(zzbsv.zza(errorCode));
        } catch (RemoteException e) {
            zzccn.zzl("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.ads.mediation.MediationInterstitialListener
    public final void onLeaveApplication(MediationInterstitialAdapter<?, ?> mediationInterstitialAdapter) {
        zzccn.zzd("Adapter called onLeaveApplication.");
        zzbay.zza();
        if (!zzccg.zzp()) {
            zzccn.zzl("#008 Must be called on the main UI thread.", null);
            zzccg.zza.post(new zzbst(this));
            return;
        }
        try {
            this.zza.zzh();
        } catch (RemoteException e) {
            zzccn.zzl("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.ads.mediation.MediationInterstitialListener
    public final void onPresentScreen(MediationInterstitialAdapter<?, ?> mediationInterstitialAdapter) {
        zzccn.zzd("Adapter called onPresentScreen.");
        zzbay.zza();
        if (!zzccg.zzp()) {
            zzccn.zzl("#008 Must be called on the main UI thread.", null);
            zzccg.zza.post(new zzbsj(this));
            return;
        }
        try {
            this.zza.zzi();
        } catch (RemoteException e) {
            zzccn.zzl("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.ads.mediation.MediationInterstitialListener
    public final void onReceivedAd(MediationInterstitialAdapter<?, ?> mediationInterstitialAdapter) {
        zzccn.zzd("Adapter called onReceivedAd.");
        zzbay.zza();
        if (!zzccg.zzp()) {
            zzccn.zzl("#008 Must be called on the main UI thread.", null);
            zzccg.zza.post(new zzbsk(this));
            return;
        }
        try {
            this.zza.zzj();
        } catch (RemoteException e) {
            zzccn.zzl("#007 Could not call remote method.", e);
        }
    }
}
